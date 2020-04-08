import { Component, OnInit } from '@angular/core';
import {FormControl} from "@angular/forms";

interface ITodo {
  id: number;
  content: string;
  complete: boolean;
}

let _id = 1;

@Component({
  selector: 'app-thuc-hanh-to-do',
  templateUrl: './thuc-hanh-to-do.component.html',
  styleUrls: ['./thuc-hanh-to-do.component.css']
})
export class ThucHanhToDoComponent implements OnInit {
  userInput = new FormControl();
  todos: Array<ITodo> = [];
  constructor() { }

  ngOnInit(): void {
  }
  onChange() {
    const {value} = this.userInput;
    if (value) {
      const todo: ITodo = {
        id: _id++,
        content: value,
        complete: false
      };
      this.todos.push(todo);
      this.userInput.setValue('');
    }
  }

  toggleTodo(i) {
    this.todos[i].complete = !this.todos[i].complete;
  }

}
