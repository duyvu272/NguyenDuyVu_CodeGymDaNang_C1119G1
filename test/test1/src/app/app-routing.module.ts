import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {BookingComponent} from './cinema/booking/booking.component';
import {MaterialModule} from './material/material.module';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';


const routes: Routes = [
  {
    path: 'booking', component: BookingComponent,
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes), MaterialModule, FormsModule, ReactiveFormsModule],
  exports: [RouterModule, FormsModule, ReactiveFormsModule],
  declarations: [BookingComponent]
})
export class AppRoutingModule {
}
