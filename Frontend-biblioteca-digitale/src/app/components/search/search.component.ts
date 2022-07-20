import { Component, OnInit } from '@angular/core';
import { debounceTime, distinctUntilChanged, map, Observable, OperatorFunction } from 'rxjs';
import { BookModel } from 'src/app/models/book.model';
import { BookService } from 'src/app/services/book.service';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  searchText: string = "";
  books: BookModel | undefined;
  constructor(private bookService: BookService) { }

  ngOnInit(): void {
  }
  submitForm(data: any) {
    this.bookService.getSingleBookByBookname(this.searchText).subscribe(
      (data: any) => {
        this.books = data
        console.log(data)
    })}
      






}
