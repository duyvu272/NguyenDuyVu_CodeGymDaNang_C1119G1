import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import {HttpClientModule}  from "@angular/common/http";
import { LoginComponent } from './login/login.component';
import { AdminComponent } from './admin/admin.component';
import { HomePageComponent } from './home-page/home-page.component'
import {AuthService, AuthServiceConfig, FacebookLoginProvider} from "angularx-social-login";
import {ReactiveFormsModule} from "@angular/forms";
import { ErrorDisplayComponent } from './error-display/error-display.component';
import {RouterModule} from "@angular/router";
@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    LoginComponent,
    AdminComponent,
    HomePageComponent,
    ErrorDisplayComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path: 'login', component: LoginComponent},
      {path: '',component: HomePageComponent},
      {path: 'admin', component: AdminComponent},
      {path: 'user',component: UserComponent}
    ])

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
