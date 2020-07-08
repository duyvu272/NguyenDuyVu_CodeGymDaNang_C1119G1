import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {Employee} from '../interfaces/employee';
import {EmployeeService} from '../services/employee.service';





@Component({
  selector: 'app-add-new',
  templateUrl: './add-new.component.html',
  styleUrls: ['./add-new.component.css'],
  providers: []
})
export class AddNewComponent implements OnInit {

  form: FormGroup;
  employees: Employee;
  constructor(private formBuilder: FormBuilder,
              private employee: EmployeeService) {}

  ngOnInit() {
    this.form = this.formBuilder.group({
      name: [null, [Validators.required, Validators.pattern('^(([a-zA-Z])+(()| ))*$')]],
      email: [null, [Validators.required, Validators.email]],
      name_project: [null, Validators.required],
      phone: [null, [Validators.required, Validators.pattern('^(([\\d]{10})|([\\d]{12}))$')]],
      group_name: [null, [Validators.required, Validators.pattern('^(Nhóm) (\\d)+$')]],
      instructor: [null, Validators.required]
    });
  }

  isFieldValid(field: string) {
    return !this.form.get(field).valid && this.form.get(field).touched ;
  }

  displayFieldCss(field: string) {
    return {
      'has-error': this.isFieldValid(field),
      'has-feedback': this.isFieldValid(field)
    };
  }

  onSubmit() {
    console.log(this.form);
    if (this.form.valid) {
      console.log('form submitted');
      const {value} = this.form;
      const em = {
        ...this.employees,
        ...value
      };
      this.employee.createEmployee(em).subscribe(data => {
        this.reset();
      });
      alert('Add new student success');
    } else {
      this.validateAllFormFields(this.form);
    }
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
    this.form.reset();
  }
}
