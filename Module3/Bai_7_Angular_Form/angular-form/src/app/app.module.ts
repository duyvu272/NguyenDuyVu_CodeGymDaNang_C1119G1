import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ThucHanhToDoComponent } from './thuc-hanh-to-do/thuc-hanh-to-do.component';
import {ReactiveFormsModule} from "@angular/forms";
import { RegisterFormComponent } from './register-form/register-form.component';
import { LoginFormComponent } from './login-form/login-form.component';

@NgModule({
  declarations: [
    AppComponent,
    ThucHanhToDoComponent,
    RegisterFormComponent,
    LoginFormComponent
  ],
    imports: [
        BrowserModule,
        ReactiveFormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
