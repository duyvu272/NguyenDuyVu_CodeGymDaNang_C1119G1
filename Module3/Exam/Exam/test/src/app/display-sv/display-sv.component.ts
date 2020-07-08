import { Component, OnInit } from '@angular/core';
import {Employee} from "../interfaces/employee";
import {EmployeeService} from '../services/employee.service';
import {FormBuilder} from '@angular/forms';

@Component({
  selector: 'app-display-sv',
  templateUrl: './display-sv.component.html',
  styleUrls: ['./display-sv.component.css']
})
export class DisplaySvComponent implements OnInit {

  public employees: Array<Employee> = [];
  public employees1: Array<Employee> = [];
  p = 1;
  data: string;

  constructor(public employeeService: EmployeeService,
              public fb: FormBuilder,
  ) {
  }

  ngOnInit(): void {
    this.employeeService.getAllEmpolyee().subscribe(data => {
      for (const i of data) {
        this.employees.push(i);
        this.employees1.push(i);
      }
      console.log(this.employees.length);
    });
  }

  deleteCustomer(id, name): void {
    const customer = this.employees.filter(c => c.id === id);
    let temp: string;
    customer.forEach(item => {
      temp = item.name;
    });
    const check = confirm('do you want delete ' + name + '?');
    if (check) {
      this.employeeService.deleteEmployee(id).subscribe(() => {
        this.employees = this.employees.filter(c => c.id !== id);
      });
    }
  }
  handleData($event: string) {
    this.employees = this.employees1;
    this.data = $event;
    console.log(this.data);
    const value = this.data['data'];
    const name = value.toString().toLowerCase();
    this.employees = this.employees.filter(customer => this.compare(name, customer.name));
    console.log(this.employees.length);
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
