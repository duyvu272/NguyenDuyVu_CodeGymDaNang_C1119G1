import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {ActivatedRoute, Router} from "@angular/router";
import {UserService} from "../servies/user.service";

@Component({
  selector: 'app-confirm-password',
  templateUrl: './confirm-password.component.html',
  styleUrls: ['./confirm-password.component.css']
})
export class ConfirmPasswordComponent implements OnInit {

  formConfirm: FormGroup;
  message: string;
  error_message: string;
  check: boolean;
  constructor(private router: Router,
              private route: ActivatedRoute,
              private fb: FormBuilder,
              private userService: UserService) {
  }

  ngOnInit(): void {
    this.formConfirm = this.fb.group({
      _password: [null, Validators.required],
      confirm_password: [null, Validators.required]
    });

  }


  Confirm() {
    this.check =  false;
    if(this.formConfirm.valid) {
      const id = +this.route.snapshot.paramMap.get('id');
      const password = this.formConfirm.get('_password').value;
      const confirmPass = this.formConfirm.get('confirm_password').value;
      if (confirmPass != password) {
        this.error_message = 'Mật khẩu không khớp';
      } else {
        this.userService.getUserById(id).subscribe(data => {
          console.log(data);
        });
      }
    }else{
    this.check = true;
    }

  }

  isFieldValidConfirmPassword(field: string): boolean {
    return this.formConfirm.get(field).touched && !this.formConfirm.get(field).valid;
  }

  isFieldValidPassword(field: string) {
    return this.formConfirm.get(field).touched && !this.formConfirm.get(field).valid;
  }
}
