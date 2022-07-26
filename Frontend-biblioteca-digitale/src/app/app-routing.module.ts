
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { InsertBooksFormComponent } from './components/insert-books-form/insert-books-form.component';
import { SearchComponent } from './components/search/search.component';


const routes: Routes = [
  { path: 'home', component: HomeComponent },
  
  { path: 'search', component: SearchComponent},
  
  { path: 'insert', component: InsertBooksFormComponent},

  { path: '', redirectTo: 'home', pathMatch: 'full' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
