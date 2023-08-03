import { BookModel } from './../models/book.model';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';



@Injectable({ providedIn: 'root' })

export class BookService {
  constructor(private http: HttpClient) { }

  getAllBooks() {
    return this.http.get("http://localhost:8080/getallbook")
  }


 

  getSingleBookByBookname(bookname: String) {
    console.log('book',bookname)
    return this.http.get(`http://localhost:8080/getasinglebookbybookname/${bookname}`)
  }

  saveSingleBookByBookname(bookModel : BookModel): Observable<any> {
    const url = "http://localhost:8080/saveasinglebookbybookname";
    console.log(bookModel);
    return this.http.post<any>(url, bookModel);
  }
}

