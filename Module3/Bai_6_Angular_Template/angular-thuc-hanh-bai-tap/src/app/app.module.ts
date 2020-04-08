import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CountdownTimerComponent } from './countdown-timer/countdown-timer.component';
import { UngDungRatingComponent } from './ung-dung-rating/ung-dung-rating.component';
import { AngularNameCardComponent } from './angular-name-card/angular-name-card.component';
import { ProcessBarComponent } from './process-bar/process-bar.component';

@NgModule({
  declarations: [
    AppComponent,
    CountdownTimerComponent,
    UngDungRatingComponent,
    AngularNameCardComponent,
    ProcessBarComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
