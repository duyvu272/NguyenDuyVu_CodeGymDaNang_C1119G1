import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../services/customer.service';
import {Customer} from '../interfaces/customer';
import {FormBuilder} from '@angular/forms';


@Component({
  selector: 'app-display-customer',
  templateUrl: './display-customer.component.html',
  styleUrls: ['./display-customer.component.css']
})
export class DisplayCustomerComponent implements OnInit {

  public customers: Array<Customer> = [];
  public customers1: Array<Customer> = [];
  p = 1;
  data: string;

  constructor(public customerService: CustomerService,
              public fb: FormBuilder,
  ) {
  }

  ngOnInit(): void {
    this.customerService.getAllCustomer().subscribe(data => {
      for (const i of data) {
        this.customers.push(i);
        this.customers1.push(i);
      }
      console.log(this.customers.length);
    });
  }

  deleteCustomer(i): void {
    const customer = this.customers.filter(c => c.id === i);
    let temp: string;
    customer.forEach(item => {
      temp = item.name;
    });
    const check = confirm('do you want delete ' + temp + '?');
    if (check) {
      this.customerService.deleteCustomer(i).subscribe(() => {
        this.customers = this.customers.filter(c => c.id !== i);
      });
    }
  }
  handleData($event: string) {
    this.customers = this.customers1;
    this.data = $event;
    console.log(this.data);
    const value = this.data['data'];
    const name = value.toString().toLowerCase();
    this.customers = this.customers.filter(customer => this.compare(name, customer.name));
    console.log(this.customers.length);
  }

  compare(name1: string, name2: string): boolean {
    const n1 = name1.toLowerCase().slice(0, name1.length);
    const n2 = name2.toLowerCase().slice(0, name1.length);
    if (n1 === n2) {
      return true;
    } else {
      return false;
    }
  }

}
