import { Component, OnInit } from '@angular/core';
import { BookModel } from 'src/app/models/book.model';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  books!: BookModel[];

  constructor( private bookService: BookService) { }


  ngOnInit() {
     this.bookService.getAllBooks().subscribe(
       (data: any) => {
         this.books = data
         console.log(data)
       }
     )
   }
}
