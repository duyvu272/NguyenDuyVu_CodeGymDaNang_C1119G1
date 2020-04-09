import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Ipost} from "../interface/ipost";
import {map} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class PostService {

  private readonly API_URL = 'http://jsonplaceholder.typicode.com/posts';
  constructor(private http: HttpClient) { }
  getPosts(count = 10): Observable<Ipost[]> {
    return this.http.get<Ipost[]>(this.API_URL).pipe(
      map(response => response.filter((post, i) => i < count))
    );
  }
  getPostById(id: number): Observable<Ipost> {
    return this.http.get<Ipost>(`${this.API_URL}/${id}`);
  }
  createPost(post: Partial<Ipost>): Observable<Ipost> {
    return this.http.post<Ipost>(this.API_URL, post);
  }
  deletePost(id: number): Observable<any> {
    return this.http.delete(`${this.API_URL}/${id}`);
  }
  updatePost(post: Ipost): Observable<Ipost> {
    return this.http.patch<Ipost>(`${this.API_URL}/${post.id}`, post);
  }
}
