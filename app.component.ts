import { Component } from '@angular/core';

@Component({
  selector: 'app-root',//It is used to replace the html at runtime in the index.html
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
}) 


/* 
	@Component({  
 	  
  	    selector:  'app-root',  
 	    template: `  
 	                <div align="center">  
	                <h1>{{title}}</h1>  
	                </div>  
                  <span [innerText]='name'></span>
 	  
                  <app-student></app-student> 
               `  
   
  	})   */
  
export class AppComponent {
  title = 'My-application';
 
}
