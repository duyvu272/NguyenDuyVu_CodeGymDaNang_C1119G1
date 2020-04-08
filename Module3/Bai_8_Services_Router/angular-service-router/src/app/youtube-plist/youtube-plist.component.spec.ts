import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { YoutubePlistComponent } from './youtube-plist.component';

describe('YoutubePlistComponent', () => {
  let component: YoutubePlistComponent;
  let fixture: ComponentFixture<YoutubePlistComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ YoutubePlistComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(YoutubePlistComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
