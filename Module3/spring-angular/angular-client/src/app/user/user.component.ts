import { Component, OnInit } from '@angular/core';
import {HttpServiceService} from "../services/http-service.service";

export interface User {
  id: number;
  username: String;
  password: String;
}
@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  public users;
  public roles;

  constructor(private http: HttpServiceService) { }

  ngOnInit(): void {

    // this.http.getAll('users').subscribe(data => {
    //   console.log(data);
    //   this.users = data;
    // });


  }

}
