import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FilmService {
  public API: string = 'http://localhost:3000/films'

  constructor(
    public http: HttpClient
  ) { }

  getAllFilms(): Observable<any>{
    return this.http.get(this.API);
  }

  getDay(id: number): Observable<any>{
    return this.http.get(this.API + '/' + id);
  }
}
