import { Component, OnInit, Input, HostListener } from '@angular/core';
import { Boardgame } from '../models/boardgame';

@Component({
  selector: 'app-display-reviews',
  templateUrl: './display-reviews.component.html',
  styleUrls: ['./display-reviews.component.scss']
})
export class DisplayReviewsComponent implements OnInit {

  @Input() boardgame: Boardgame;
  public innerWidth: any;
  constructor() { }

  ngOnInit() {
    this.innerWidth = window.innerWidth;
  }

  @HostListener('window:resize', ['$event'])
  onResize() {
    this.innerWidth = window.innerWidth;
  }

}
