import { Component, OnInit } from '@angular/core';
import {CustomerService} from '../../app/services/customer.service';

@Component({
  selector: 'app-display-customer',
  templateUrl: './display-customer.component.html',
  styleUrls: ['./display-customer.component.css']
})
export class DisplayCustomerComponent implements OnInit {
    public customers;
  constructor(public customerService: CustomerService) { }

  ngOnInit(): void {
    this.customerService.getAllCustomer().subscribe(data => {
      this.customers = data;
      console.log(this.customers);
    });
  }

  deleteCustomer(i): void {
    const customer = this.customers[i];
    this.customerService.deleteCustomer(i).subscribe(() => {
      this.customers = this.customers.filter(c => c.id !== i);
      console.log(this.customers);
    });
  }

  editCustomer(i): void {

  }

}
