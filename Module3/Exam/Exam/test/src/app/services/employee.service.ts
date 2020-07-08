import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Employee} from '../interfaces/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API = 'http://localhost:3000/sinhvien';
  constructor( public http: HttpClient) {
  }
  getAllEmpolyee(): Observable<any> {
    return this.http.get(this.API);
  }
  deleteEmployee(i): Observable<any> {
    return this.http.delete(`${this.API}/${i}`);
  }
  createEmployee(post: Partial<Employee>): Observable<Employee> {
    return this.http.post<Employee>(this.API, post);
  }
  getEmployee(i): Observable<any> {
    return this.http.get(`${this.API}/${i}`);
  }

  updateEmployee(customer: Employee): Observable<any> {
    return this.http.patch<Employee>(`${this.API}/${customer.id}`, customer);
  }
}
