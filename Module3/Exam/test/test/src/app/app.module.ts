import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {AppComponent} from './app.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { LoginComponent } from './login/login.component';
import {AuthService, AuthServiceConfig, FacebookLoginProvider} from 'angularx-social-login';
import {RouterModule} from '@angular/router';
import {ShowComponent} from './show/show.component';
import { ErrorDisplayComponent } from './error-display/error-display.component';
import { ResetPasswordComponent } from './reset-password/reset-password.component';


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
@NgModule({
  declarations: [
    AppComponent,
   LoginComponent,
   ErrorDisplayComponent,
   ResetPasswordComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule
    , ReactiveFormsModule, NgxPaginationModule, BrowserAnimationsModule,
    RouterModule.forRoot([
      {path: '', component: LoginComponent},
      {path: 'nextPage', component: ShowComponent},
      {path: 'resetPassword', component: ResetPasswordComponent}
    ])
  ],
  exports: [],
  providers: [ AuthService,
    {
      provide: AuthServiceConfig,
      useFactory: socialConfigs
    }  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
