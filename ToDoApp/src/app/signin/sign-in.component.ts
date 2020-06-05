import { Component, OnInit, ViewChild } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { UserRegistrationService } from '../user-registration.service';


@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
users:any;
  constructor(private route:Router) { 
    const Admin={AdminID:"Admin1@ToDo",password:"Admin@main",email:"2526ps@gmail.com"};
    localStorage.setItem("AdminToDo",JSON.stringify(Admin));
  }
  ngOnInit(): void {
    
  }
  @ViewChild('ToDo') login: NgForm;
  

onLogin(form){
  let admin=JSON.parse(localStorage.getItem("AdminToDo"));
  let user=JSON.parse(localStorage.getItem("userToDo"));
  let invalid:boolean=false;

  console.log(admin.AdminID)
  console.log(admin.password)
  if(form.email==admin.AdminID && form.password==admin.password)
  {
    alert("login successfull");
    this.route.navigate(['admin']);
    invalid=true;
    localStorage.setItem("signinToDo",JSON.stringify(true));
  }
  else
  {
    for(let i=0;i<user.length;i++)
    { 
       if(form.email==user[i].email && form.password==user[i].password)
       {
         if(user[i].access==true){
          alert(" login successfull");
          this.route.navigate(['user']);
          localStorage.setItem("loggedEmailToDo",JSON.stringify(user[i].email));
          invalid=true;
          localStorage.setItem("signinToDo",JSON.stringify(true));
         }
         else
         {
           alert(user[i].firstName+" is been Deactivited ");
           invalid=true;
         }
          
        }
        
    }
  }
  if(invalid==false)
  {
    alert("Wrong ID & Password ,Please Enter valid");
  }

  
  this.login.reset();
 }

}
