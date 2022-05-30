import { Component, OnInit, ViewEncapsulation } from '@angular/core';
import { Router } from '@angular/router';
import { BookModel } from './models/book.model';
import { BookService } from './services/book.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  encapsulation: ViewEncapsulation.None

})
export class AppComponent implements OnInit {
  title = 'library';

  constructor() { }


  ngOnInit() {

   }
}

function searchText(this: any, key:  String):void {
  const results: BookModel[] = [];
  for (const books of this.BookModel)
  {
    if(books.bookname.toLowerCase().indexOf(key.toLowerCase()) !== -1 ||
    (books.author.toLowerCase().indexOf(key.toLowerCase()) !== -1 )) {
  results.push(books);
    }
  }


  throw new Error('Function not implemented.');
}

function key(key: any, String: StringConstructor) {
  throw new Error('Function not implemented.');
}

