import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../interfaces/customer';
@Injectable({
  providedIn: 'root'
})
export class CustomerService {
    public API = 'http://localhost:3000/customer';
  constructor( public http: HttpClient) {
  }
  getAllCustomer(): Observable<any> {
    return this.http.get(this.API);
  }
  deleteCustomer(i): Observable<any> {
    return this.http.delete(`${this.API}/${i}`);
  }
  // editCustomer(i): Observable<any> {
  //   return  this.http.put(`${this.API}/${i}/${('edit')}`);
  // }
  getCustomer(i): Observable<any> {
    return this.http.get(`${this.API}/${i}`);
  }

  updateCustomer(customer: Customer): Observable<any> {
    return this.http.patch<Customer>(`${this.API}/${customer.id}`, customer);
  }
}
