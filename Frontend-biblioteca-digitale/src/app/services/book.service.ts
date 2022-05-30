import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BookModel } from '../models/book.model';



@Injectable({ providedIn: 'root' })

export class BookService {
  constructor(private http: HttpClient) { }

  getAllBooks() {
    return this.http.get("http://localhost:8080/getallbook")
  }


 

  getBookByBookname(bookname: String) {
    console.log(bookname)
    return this.http.get(`http://localhost:8080/getasinglebookByBookname/${bookname}`)
  }
}

