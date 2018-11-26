import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BestGamesComponent } from './best-games.component';

describe('BestGamesComponent', () => {
  let component: BestGamesComponent;
  let fixture: ComponentFixture<BestGamesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BestGamesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BestGamesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
