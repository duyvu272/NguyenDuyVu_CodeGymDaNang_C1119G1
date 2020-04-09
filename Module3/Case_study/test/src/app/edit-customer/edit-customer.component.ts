import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../services/customer.service';
import {FormBuilder, FormGroup} from '@angular/forms';
import {ActivatedRoute, Router} from '@angular/router';
import {Customer} from '../interfaces/customer';

@Component({
  selector: 'app-edit-customer',
  templateUrl: './edit-customer.component.html',
  styleUrls: ['./edit-customer.component.css']
})
export class EditCustomerComponent implements OnInit {
  customer: Customer;
  editForm: FormGroup;

  constructor(
    private route: ActivatedRoute,
    private router: Router,
    private customerService: CustomerService,
    public fb: FormBuilder
  ) {
  }

  ngOnInit(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.customerService.getCustomer(id).subscribe(next => {
      this.customer = next;
      this.editForm.patchValue(this.customer);
    });
    console.log(this.customer);
    this.editForm = this.fb.group({
      name: '',
      birthday: '',
      email: '',
      phone: '',
      type: ''
    });
    console.log(this.customer);
  }

  onSubmit() {
    if (this.editForm.valid) {
      const {value} = this.editForm;
      const data = {
        ...this.customer,
        ...value
      };
      console.log(data);
      this.customerService.updateCustomer(data).subscribe(next => {
        this.router.navigate(['/displayCustomer']);
      });
    }
  }

}
