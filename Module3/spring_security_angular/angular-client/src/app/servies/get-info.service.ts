import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GetInfoService {
  public username: string;
  constructor() { }

  public saveUser(name: string) {
    this.username =name ;
  }

  public getUser(): any {
    return this.username;
  }

}
