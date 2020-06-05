import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  
  user=JSON.parse(localStorage.getItem("userToDo"));
  access(i){
    this.user[i].access=!this.user[i].access;
    localStorage.setItem("userToDo",JSON.stringify(this.user));


  }
}
