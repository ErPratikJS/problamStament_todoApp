import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  constructor() { }

  users=JSON.parse(localStorage.getItem("userToDo"));
  user=JSON.parse(localStorage.getItem("loggedEmailToDo"));
  public name;
  ngOnInit(): void {
    
      for(let i=0;i<this.users.length;i++)
      { 
        if(this.user==this.users[i].email)
        {
          this.name=this.users[i].firstName;
        }
      }
  }
 
     
       public items = []; 
     
       public newTask; 
     
  
       public addToList() { 
           if (this.newTask == '') { 
           } 
           else { 
               this.items.push(this.newTask); 
               this.newTask = ''; 
           } 
       } 
     
       public deleteTask(index) { 
           this.items.splice(index, 1); 
       }
   

}
