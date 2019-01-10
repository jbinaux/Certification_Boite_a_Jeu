import { Component, OnInit, Output, EventEmitter } from '@angular/core';
import { Location } from '@angular/common';
import { FormGroup, FormControl } from '@angular/forms';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.scss']
})
export class SignInComponent implements OnInit {

  @Output() event = new EventEmitter();
  loginForm = new FormGroup({
  	email: new FormControl(''),
  	password: new FormControl('')
  });

  constructor(private location: Location, private dataService: DataService) { }

  ngOnInit() {
  }

  goBack(): void {
    this.location.back();
  }

  toggleRegister() {
    this.event.emit('');
  }

  onSubmit() {
  	this.dataService.getAuthToken(this.loginForm).subscribe( () => console.log("youhou"));
  }
}
