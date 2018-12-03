import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';
import { Boardgame } from '../models/boardgame';

@Component({
  selector: 'app-display-game',
  templateUrl: './display-game.component.html',
  styleUrls: ['./display-game.component.scss']
})
export class DisplayGameComponent implements OnInit {

  boardgames: Boardgame[];
  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.dataService.getBoardgames().subscribe(bg => this.boardgames = bg);
  }

}
