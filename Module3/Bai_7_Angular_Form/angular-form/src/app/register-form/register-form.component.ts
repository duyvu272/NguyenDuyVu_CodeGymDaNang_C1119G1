import { Component, OnInit } from '@angular/core';
import {AbstractControl, FormBuilder, FormGroup, Validators} from "@angular/forms";
import {min} from "rxjs/operators";

function comparePassword(c: AbstractControl) {
  const v = c.value;
  return (v.password === v.confirmPassword) ? null : {
    passwordnotmatch: true
  };
}
@Component({
  selector: 'app-register-form',
  templateUrl: './register-form.component.html',
  styleUrls: ['./register-form.component.css']
})
export class RegisterFormComponent implements OnInit {
  public registerForm: FormGroup;
  constructor(
    public fb: FormBuilder
  ) { }

  ngOnInit(): void {

    this.registerForm = this.fb.group({
    email: ['',Validators.required,Validators.email],
      passGroup: this.fb.group({
        pass: ['',Validators.required],
        rePass: ['',Validators.required]
      },{validator: comparePassword}),
      country: ['',Validators.required],
      phone: ['',Validators.required],
      gender: ['',Validators.required],
      age: ['',[Validators.required,Validators.min(18)]],
    })
  }


  submit(){
    const {value} =  this.registerForm;
  };


}
