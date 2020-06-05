import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'ToDoApp';
  constructor(private route:Router) { }
  
  signinToDo=JSON.parse(localStorage.getItem("signinToDo"));

  signout()
  {
    localStorage.setItem("signinToDo",JSON.stringify(false));
    this.route.navigate(['signin']);
  }
}
