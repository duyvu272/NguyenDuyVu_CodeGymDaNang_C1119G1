import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {User} from '../interface/user';
import {SocialUser} from 'angularx-social-login';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  public API = 'http://localhost:3000/sinhvien';
  constructor( public http: HttpClient) {
  }
  getAllEmpolyee(): Observable<any> {
    return this.http.get(this.API);
  }
  deleteEmployee(i): Observable<any> {
    return this.http.delete(`${this.API}/${i}`);
  }



  createEmployee(post: SocialUser): Observable<User> {
    return this.http.post<User>(this.API, post);
  }
  getEmployee(i): Observable<any> {
    return this.http.get(`${this.API}/${i}`);
  }

  updateEmployee(customer: User): Observable<any> {
    return this.http.patch<User>(`${this.API}/${customer.id}`, customer);
  }
}
