import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddContactDetailComponent } from './add-contact-detail.component';

describe('AddContactDetailComponent', () => {
  let component: AddContactDetailComponent;
  let fixture: ComponentFixture<AddContactDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddContactDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddContactDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
