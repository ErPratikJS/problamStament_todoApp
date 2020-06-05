import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserRegistrationService {

  constructor(private http:HttpClient) { }

 /* public doRegistration(user)
  {
    return this.http.post("http://localhost:9091/todo/postusers")
  }*/

  public getUser()
  {
    return this.http.get("http://localhost:9091/todo/users");
  }

}
