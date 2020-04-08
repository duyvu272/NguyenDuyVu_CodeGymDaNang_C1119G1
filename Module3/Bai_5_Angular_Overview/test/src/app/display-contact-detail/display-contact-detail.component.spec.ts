import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayContactDetailComponent } from './display-contact-detail.component';

describe('DisplayContactDetailComponent', () => {
  let component: DisplayContactDetailComponent;
  let fixture: ComponentFixture<DisplayContactDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayContactDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayContactDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
