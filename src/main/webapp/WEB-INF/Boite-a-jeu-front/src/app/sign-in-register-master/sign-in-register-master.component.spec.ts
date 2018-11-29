import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SignInRegisterMasterComponent } from './sign-in-register-master.component';

describe('SignInRegisterMasterComponent', () => {
  let component: SignInRegisterMasterComponent;
  let fixture: ComponentFixture<SignInRegisterMasterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SignInRegisterMasterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SignInRegisterMasterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
