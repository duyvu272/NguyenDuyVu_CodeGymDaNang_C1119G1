import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditSvComponent } from './edit-sv.component';

describe('EditSvComponent', () => {
  let component: EditSvComponent;
  let fixture: ComponentFixture<EditSvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditSvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditSvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
