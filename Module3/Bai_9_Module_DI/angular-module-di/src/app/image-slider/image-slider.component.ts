import {AfterContentInit, Component, ContentChildren, OnInit, QueryList} from '@angular/core';
import {ImageSlideComponent} from './image-slide/image-slide.component';
@Component({
  selector: 'app-image-slider',
  templateUrl: './image-slider.component.html',
  styleUrls: ['./image-slider.component.css']
})
export class ImageSliderComponent implements OnInit,AfterContentInit  {
  @ContentChildren(ImageSlideComponent) slides: QueryList<ImageSlideComponent>;
  component;
  activeIndex = 0;
  constructor() { }

  ngOnInit(): void {
  }

  ngAfterContentInit() {
    console.log(this.slides);
    this.component = this.slides.first;
  }

  previos() {
    if (this.activeIndex > 0) {
      this.activeIndex--;
    }
    this.component = this.slides.toArray()[this.activeIndex];
  }
  next() {
    console.log("silde  ;"+ this.slides.length);
    if (this.activeIndex < this.slides.length - 1) {
      this.activeIndex++;
    }
    console.log(this.activeIndex);
    this.component = this.slides.toArray()[this.activeIndex];
  }

}
