import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UngDungRatingComponent } from './ung-dung-rating.component';

describe('UngDungRatingComponent', () => {
  let component: UngDungRatingComponent;
  let fixture: ComponentFixture<UngDungRatingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UngDungRatingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UngDungRatingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
