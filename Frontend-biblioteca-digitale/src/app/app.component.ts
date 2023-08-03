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

function searchText(books: BookModel[], key: string): BookModel[] {
  const results: BookModel[] = [];
  for (const book of books) {
    if (
      book.bookname.toLowerCase().indexOf(key.toLowerCase()) !== -1 ||
      book.author.toLowerCase().indexOf(key.toLowerCase()) !== -1
    ) {
      results.push(book);
    }
  }
  return results;
}


  

function key(key: any, String: StringConstructor) {
  throw new Error('Function not implemented.');
}

