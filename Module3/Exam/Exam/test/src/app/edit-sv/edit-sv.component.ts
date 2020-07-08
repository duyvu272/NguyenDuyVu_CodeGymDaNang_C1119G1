import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Employee} from '../interfaces/employee';
import {EmployeeService} from '../services/employee.service';

@Component({
  selector: 'app-edit-sv',
  templateUrl: './edit-sv.component.html',
  styleUrls: ['./edit-sv.component.css']
})
export class EditSvComponent implements OnInit {

  employee: Employee;
  editForm: FormGroup;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private employeeService: EmployeeService,
    public fb: FormBuilder
  ) {
  }

  ngOnInit(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.employeeService.getEmployee(id).subscribe(next => {
      this.employee = next;
      this.editForm.patchValue(this.employee);
    });
    console.log(this.employee);
    this.editForm = this.fb.group({
      name: [null, [Validators.required, Validators.pattern('^(([a-zA-Z])+(()| ))*$')]],
      email: [null, [Validators.required, Validators.email]],
      name_project: [null, Validators.required],
      phone: [null, [Validators.required, Validators.pattern('^(([\\d]{10})|([\\d]{12}))$')]],
      group_name: [null, [Validators.required, Validators.pattern('^(Nhóm) (1|2|3)$')]],
      instructor: [null, Validators.required]
    });
    console.log(this.employee);
  }

  onSubmit() {
    if (this.editForm.valid) {
      const {value} = this.editForm;
      const data = {
        ...this.employee,
        ...value
      };
      console.log(data);
      this.employeeService.updateEmployee(data).subscribe(next => {
        this.router.navigate(['/displayEmployee']);
      });
    } else {
      this.validateAllFormFields(this.editForm);
    }
  }

  isFieldValid(field: string) {
    return !this.editForm.get(field).valid && this.editForm.get(field).touched;
  }

  displayFieldCss(field: string) {
    return {
      'has-error': this.isFieldValid(field),
      'has-feedback': this.isFieldValid(field)
    };
  }


  validateAllFormFields(formGroup: FormGroup) {
    Object.keys(formGroup.controls).forEach(field => {
      console.log(field);
      const control = formGroup.get(field);
      if (control instanceof FormControl) {
        control.markAsTouched({ onlySelf: true });
      }
      // else if (control instanceof FormGroup) {
      //   this.validateAllFormFields(control);
      // }
    });
  }

  reset() {
    this.router.navigate(['/displayEmployee']);
  }

}
