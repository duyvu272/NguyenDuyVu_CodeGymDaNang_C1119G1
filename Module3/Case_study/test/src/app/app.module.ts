import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {AppComponent} from './app.component';
import {FooterComponent} from './footer/footer.component';
import {MainComponent} from './main/main.component';
import {AddCustomerComponent} from './add-customer/add-customer.component';
import {AddEmployeeComponent} from './add-employee/add-employee.component';
import {AddServiceComponent} from './add-service/add-service.component';
import {AddContactComponent} from './add-contact/add-contact.component';
import {SideBarComponent} from './side-bar/side-bar.component';
import {AddContactDetailComponent} from './add-contact-detail/add-contact-detail.component';
import {DisplayEmployeeComponent} from './display-employee/display-employee.component';
import {DisplayCustomerComponent} from './display-customer/display-customer.component';
import {DisplayServiceComponent} from './display-service/display-service.component';
import {DisplayContactComponent} from './display-contact/display-contact.component';
import {DisplayContactDetailComponent} from './display-contact-detail/display-contact-detail.component';
import { HttpClientModule } from '@angular/common/http';
import { EditCustomerComponent } from './edit-customer/edit-customer.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {NgxPaginationModule} from 'ngx-pagination';
import { SearchComponent } from './search/search.component';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatIconModule} from '@angular/material/icon';
import {MatInputModule} from '@angular/material/input';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MAT_DATE_FORMATS, MatNativeDateModule} from '@angular/material/core';
import { FieldErrorDisplayComponent } from './field-error-display/field-error-display.component';



@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    MainComponent,
    AddCustomerComponent,
    AddEmployeeComponent,
    AddServiceComponent,
    AddContactComponent,
    SideBarComponent,
    AddContactDetailComponent,
    DisplayEmployeeComponent,
    DisplayCustomerComponent,
    DisplayServiceComponent,
    DisplayContactComponent,
    DisplayContactDetailComponent,
        EditCustomerComponent,
        SearchComponent,
        FieldErrorDisplayComponent,
      ],
  imports: [
    BrowserModule, HttpClientModule, FormsModule,
    RouterModule.forRoot([
      {path: '', component: SideBarComponent},
      {path: 'addCustomer', component: AddCustomerComponent},
      {path: 'addContact', component: AddContactComponent},
      {path: 'addService', component: AddServiceComponent},
      {path: 'addEmployee', component: AddEmployeeComponent},
      {path: 'addContactDetail', component: AddContactDetailComponent},
      {path: 'displayCustomer', component: DisplayCustomerComponent},
      {path: 'displayEmployee', component: DisplayEmployeeComponent},
      {path: 'displayContact', component: DisplayContactComponent},
      {path: 'displayService', component: DisplayServiceComponent},
      {path: 'displayContactDetail', component: DisplayContactDetailComponent},
      {path: 'customer/:id/edit', component: EditCustomerComponent}
    ]), ReactiveFormsModule, NgxPaginationModule, MatDatepickerModule,
    MatFormFieldModule, MatIconModule, MatInputModule, BrowserAnimationsModule,
    MatNativeDateModule, MatDatepickerModule,
  ],
  exports: [
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
