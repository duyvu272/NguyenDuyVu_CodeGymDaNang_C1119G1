import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {
  // items: any[] = [
  //   { id: 1, name: '-', value: this.sub(this.numberA, this.numberB)},
  //   { id: 2, name: '+', value: this.add(this.numberA, this.numberB)}
  // ];
  // selected: number = 1;
private _numberA: number = 0;
private _numberB: number = 0;
public selectedValue;
  constructor() { }

  get numberA(): number {
    return this._numberA;
  }

  set numberA(value: number) {
    this._numberA = value;
  }

  get numberB(): number {
    return this._numberB;
  }

  set numberB(value: number) {
    this._numberB = value;
  }

  add(a, b ): number {
    this._numberA = a;
    this._numberB = b;
    return this._numberA * 1 + this._numberB * 1;
  }
  sub(a, b): number {
    this._numberA = a;
    this._numberB = b;
    return this._numberA - this._numberB;
  }
  division(a, b): number {
    this._numberA = a;
    this._numberB = b;
    return this._numberA / this._numberB;
  }
  multi(a, b): number {
    this._numberA = a;
    this._numberB = b;
    return this._numberA * this._numberB;
  }
  // selectOption(id: number) {
  //   //getted from event
  //   console.log(id);
  //   //getted from binding
  //   console.log(this.selected)
  // }
  ngOnInit(): void {
  }

}
