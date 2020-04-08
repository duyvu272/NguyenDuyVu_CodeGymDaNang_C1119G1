import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ThucHanhToDoComponent } from './thuc-hanh-to-do.component';

describe('ThucHanhToDoComponent', () => {
  let component: ThucHanhToDoComponent;
  let fixture: ComponentFixture<ThucHanhToDoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ThucHanhToDoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ThucHanhToDoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
