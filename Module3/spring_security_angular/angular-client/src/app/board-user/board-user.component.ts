import { Component, OnInit } from '@angular/core';
import {AuthServices} from "../servies/auth.service";
import {UserService} from "../servies/user.service";

@Component({
  selector: 'app-board-user',
  templateUrl: './board-user.component.html',
  styleUrls: ['./board-user.component.css']
})
export class BoardUserComponent implements OnInit {
context: string;
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.userService.getUserBoard().subscribe(data =>{
     this.context=data.hello
    }, error => {
      console.log(error)
      this.context = "Lỗi rồi bạn ei";
    })
  }

}
