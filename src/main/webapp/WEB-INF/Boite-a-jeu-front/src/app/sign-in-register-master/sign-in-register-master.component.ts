import { Component, OnInit, HostListener } from '@angular/core';

@Component({
  selector: 'app-sign-in-register-master',
  templateUrl: './sign-in-register-master.component.html',
  styleUrls: ['./sign-in-register-master.component.scss']
})
export class SignInRegisterMasterComponent implements OnInit {

  public innerWidth: any;
  public signIn: boolean;
  public register: boolean;

  constructor() { }

  ngOnInit() {
    this.innerWidth = window.innerWidth;
    this.signIn = true;
    this.register = false;
  }

  @HostListener('window:resize', ['$event'])
  onResize(event) {
    this.innerWidth = window.innerWidth;
  }

  toggleRegister() {
    this.register = true;
    this.signIn = false;
  }

  toggleSignIn() {
    this.register = false;
    this.signIn = true;
  }
}
