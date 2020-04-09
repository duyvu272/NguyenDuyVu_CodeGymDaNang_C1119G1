import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup} from "@angular/forms";
import {TodoService} from "../services/todo.service";
import {ToDo} from "../interface/toDo";

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {
inputForm = new FormControl();
public list: Array<ToDo> = [];
private id = 0;
  constructor(private todo: TodoService) { }

  ngOnInit(): void {
    this.todo.getPosts().subscribe(data => {
      console.log(data);
      for(const item of data){
        this.list.push(item);
      }
    });
    console.log(this.list);

  }


  onChange() {
    const {value} = this.inputForm;
    const todo = {
      id: this.id++,
      content: value,
      complete: false
    }
    this.todo.createPost(todo).subscribe(data =>{
      console.log(data);
      this.inputForm.setValue('');
      this.list.push(data);
    });

  }

  toggleTodo(i: string | number) {
    this.list[i].complete = !this.list[i].complete;
  }

  delete(i) {
    this.todo.deletePost(i).subscribe(data =>{
      console.log(data);
      this.list = this.list.filter(c => c.id != i);
    });
  }

}
