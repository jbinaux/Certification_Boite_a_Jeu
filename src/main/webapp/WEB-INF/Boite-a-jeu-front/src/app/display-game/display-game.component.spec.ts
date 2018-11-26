import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayGameComponent } from './display-game.component';

describe('DisplayGameComponent', () => {
  let component: DisplayGameComponent;
  let fixture: ComponentFixture<DisplayGameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DisplayGameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DisplayGameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
