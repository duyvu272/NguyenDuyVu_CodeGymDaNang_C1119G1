import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {AppComponent} from './app.component';
import {FooterComponent} from './footer/footer.component';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import {SearchComponent} from './search/search.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatNativeDateModule} from '@angular/material/core';
import {FieldErrorDisplayComponent} from './field-error-display/field-error-display.component';
import {HeaderComponent} from './header/header.component';
import {AddNewComponent} from './add-new/add-new.component';
import {DisplaySvComponent} from './display-sv/display-sv.component';
import {EditSvComponent} from './edit-sv/edit-sv.component';
import { LoginComponent } from './login/login.component';


@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    SearchComponent,
    FieldErrorDisplayComponent,
    HeaderComponent, AddNewComponent,
    DisplaySvComponent, EditSvComponent, LoginComponent
  ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule,
    RouterModule.forRoot([
      {path: 'add', component: AddNewComponent},
      {path: 'employee/:id/edit', component: EditSvComponent},
      {path: 'displayEmployee', component: DisplaySvComponent}
    ]), ReactiveFormsModule, NgxPaginationModule, MatDatepickerModule,
    MatFormFieldModule, MatIconModule, MatInputModule, BrowserAnimationsModule,
    MatNativeDateModule, MatDatepickerModule,
  ],
  exports: [],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
