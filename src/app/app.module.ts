import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { ListListComponent } from './components/list-list/list-list.component';
import { ListFormComponent } from './components/list-form/list-form.component';
import { SearchComponent } from './components/search/search.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { Routes,RouterModule } from '@angular/router';
const routes:Routes=[{path:'',component:WelcomeComponent},{path:'list',component:ListListComponent},{path:'listform',component:ListFormComponent},{path : 'updatelist/:id',component:ListFormComponent},{path : 'search/:name',component:ListListComponent}]


@NgModule({
  declarations: [
    AppComponent,
    WelcomeComponent,
  ListFormComponent,
    ListListComponent,
    
    SearchComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
