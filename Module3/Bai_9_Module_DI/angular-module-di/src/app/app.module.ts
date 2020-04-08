import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import {ImageGalleryModule} from "./image-gallery/image-gallery.module";
import {GalleryConfig} from "./image-gallery/token";
import {ImageSliderModule} from "./image-slider/image-slider.module";

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    ImageGalleryModule,
    ImageSliderModule
  ],
  providers: [
    {provide: GalleryConfig, useValue: 2}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
