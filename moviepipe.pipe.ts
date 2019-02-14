import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'moviepipe'
})
export class MoviepipePipe implements PipeTransform {

  transform(movies: any, searchText: string): any {
   if(searchText){
    

     
return movies.filter(arr=>arr.name.toLowerCase().startsWith(searchText.toLowerCase()))
   }
   return movies;
  }

}
