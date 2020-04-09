import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ToDo} from "../interface/toDo";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class TodoService {
private  API_URL  = "http://localhost:3000/post";
  constructor(private http: HttpClient) { }

  getPosts(): Observable<ToDo[]> {
    return this.http.get<ToDo[]>(this.API_URL);
  }
  getPostById(id: number): Observable<ToDo> {
    return this.http.get<ToDo>(`${this.API_URL}/${id}`);
  }
  createPost(post: Partial<ToDo>): Observable<ToDo> {
    return this.http.post<ToDo>(this.API_URL, post);
  }
  deletePost(id: number): Observable<any> {
    return this.http.delete(`${this.API_URL}/${id}`);
  }
  updatePost(post: ToDo): Observable<ToDo> {
    return this.http.patch<ToDo>(`${this.API_URL}/${post.id}`, post);
  }
}
