import { Component, OnInit } from '@angular/core';
import {UserService} from "../servies/user.service";
import {TokenStorageService} from "../servies/token-storage.service";

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  content: string;

  constructor(private userService: UserService,
              private tokenStorage: TokenStorageService ) { }

  ngOnInit() {

    this.userService.getPublicContent().subscribe(
      data => {
        this.content = data;

      },
      err => {
        this.content = JSON.parse(err.error).message;
      }
    );
    if(this.tokenStorage.getToken()){
      // location.reload();
    }
  }

}
