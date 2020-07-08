import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';
import { ProfileComponent } from './profile/profile.component';
import { BoardAdminComponent } from './board-admin/board-admin.component';
import { BoardUserComponent } from './board-user/board-user.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {RouterModule} from "@angular/router";
import {HttpClientModule} from "@angular/common/http"
import {AuthService, AuthServiceConfig, FacebookLoginProvider} from "angularx-social-login";
import { ErrorDisplayComponent } from './error-display/error-display.component';
import { ResetPasswordComponent } from './reset-password/reset-password.component';
import { ConfirmPasswordComponent } from './confirm-password/confirm-password.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ProfileComponent,
    BoardAdminComponent,
    BoardUserComponent,
    ErrorDisplayComponent,
    ResetPasswordComponent,
    ConfirmPasswordComponent
  ],
    imports: [
        BrowserModule,
        FormsModule, RouterModule.forRoot([
            {path: 'home', component: HomeComponent},
            {path: 'login', component: LoginComponent},
            {path: 'register', component: RegisterComponent},
            {path: 'profile', component: ProfileComponent},
            {path: 'user', component: BoardUserComponent},
            {path: 'admin', component: BoardAdminComponent},
        {path:'resetPassword',component: ResetPasswordComponent},
        {path: 'confirmPassword/:id',component: ConfirmPasswordComponent},
            {path: '', redirectTo: 'home', pathMatch: 'full'}
        ]), HttpClientModule, ReactiveFormsModule
    ],
  providers: [AuthService,
    {
      provide: AuthServiceConfig,
      useFactory: socialConfigs
    } ],
  bootstrap: [AppComponent]
})
export class AppModule { }
export function socialConfigs() {
  const config = new AuthServiceConfig(
    [
      {
        id: FacebookLoginProvider.PROVIDER_ID,
        provider: new FacebookLoginProvider('1570392383013006')
      }
    ]
  );
  return config;
}
