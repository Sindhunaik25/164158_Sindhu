import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';  
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentComponent } from './student/student.component';
import { AddnumbersComponent } from './addnumbers/addnumbers.component';
import { NgifcomponentComponent } from './ngifcomponent/ngifcomponent.component';
import { NgforcomponentComponent } from './ngforcomponent/ngforcomponent.component';
import { NgswitchcomponentComponent } from './ngswitchcomponent/ngswitchcomponent.component';
import { StudentpipePipe } from './studentpipe.pipe';
import { MoviepipePipe } from './moviepipe.pipe';


@NgModule({
  declarations: [
    AppComponent,
    StudentComponent,
    AddnumbersComponent,
    NgifcomponentComponent,
    NgforcomponentComponent,
    NgswitchcomponentComponent,
    StudentpipePipe,
    MoviepipePipe
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
