import { Component, OnInit, ViewChild, ElementRef } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-sign-up',
  templateUrl: './sign-up.component.html',
  styleUrls: ['./sign-up.component.css']
})
export class SignUpComponent implements OnInit {


  @ViewChild('signup') user: NgForm;
  
  constructor(private route:Router) { 
  }
  date: Date = new Date();  
   
  
  
  ngOnInit() {
  }
  
 // valid = this.terms.nativeElement.checked;
  
  onSignUp(form) {
    console.log(form);
    /*date2: Date = new Date();
    date2 =form.birthdate;
    let diff=date2.getTime() -this.date.getTime();
    let days =diff/(100*3600*24);
    console.log(days);*/
   
    alert("Successfull !!!");
    console.log(form);
    let arr: any[]=JSON.parse(localStorage.getItem("userToDo"));
    if(arr==null)
    {
      arr=[];
    }
    arr.push(form);
    localStorage.setItem("userToDo",JSON.stringify(arr));
    this.user.reset();
  }

  
}

