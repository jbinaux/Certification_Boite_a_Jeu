import { Component, OnInit, Input } from '@angular/core';
import { Boardgame } from '../models/boardgame';

@Component({
  selector: 'app-display-game',
  templateUrl: './display-game.component.html',
  styleUrls: ['./display-game.component.scss']
})
export class DisplayGameComponent implements OnInit {

  @Input() boardgame: Boardgame;
  constructor() { }

  ngOnInit() {
  }

}
