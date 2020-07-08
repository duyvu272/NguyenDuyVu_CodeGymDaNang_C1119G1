import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplaySvComponent } from './display-sv.component';

describe('DisplaySvComponent', () => {
  let component: DisplaySvComponent;
  let fixture: ComponentFixture<DisplaySvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplaySvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplaySvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
