import {Component, Input, OnDestroy, OnInit} from '@angular/core';

@Component({
  selector: 'app-countdown-timer',
  templateUrl: './countdown-timer.component.html',
  styleUrls: ['./countdown-timer.component.css']
})
export class CountdownTimerComponent implements OnInit, OnDestroy {
  private intervalId = 0;
  message = '';
  remainingTime: number;
  stoptime = 0;
  public showtime = true;
  public stopt = false;
  public finish = false;
  @Input()
  seconds = 5;


  constructor() {
  }

  ngOnInit(): void {
  }

  ngOnDestroy(): void {
    if (this.seconds === 0) {
      clearInterval();
    }
  }

  clearTimer() {
    this.remainingTime = this.seconds;
  }

  start() {
    console.log(this.seconds);
    if (this.stoptime !== 0) {
      this.seconds = this.stoptime;
    }
    this.stopt = false;
    this.showtime = true;
    setInterval(() => {
      if (this.seconds === 0) {
        console.log(this.seconds);
        this.message = 'Finish';
        this.finish = true;
      } else {
        this.seconds--;
      }
    }, 1000);
  }

  stop() {
    this.stopt = true;
    console.log(this.seconds);
    this.showtime = false;
    clearInterval(this.seconds);
    this.stoptime = this.seconds;
  }

  reset() {
    this.seconds = 10;
    this.start();
  }

  private countDown() {
  }


}
