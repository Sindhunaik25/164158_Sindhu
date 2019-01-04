import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
name:string;
age:number;
hobbies:string[];
address:Address
  constructor() { 
    console.log("hello");

  }

  ngOnInit() {
    console.log("hi");
    this.name="Savinaya";
    this.age=22;
    this.address={
      street:"Hallibail",
      city:"Sirsi",
      state:"Karnataka"
    };
    this.hobbies=["Sleeping","Eating"];
  }

}
interface Address{
  street:string;
  city:string;
  state:string;
}
