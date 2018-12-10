import { Component, OnInit } from '@angular/core';
import { Boardgame } from '../models/boardgame';
import { DataService } from '../services/data.service';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss']
})
export class HomepageComponent implements OnInit {

  boardgames: Boardgame[];
  bgLength: number;
  recieved: boolean;
  constructor(private dataService: DataService) { }

  ngOnInit() {
    this.bgLength = 0;
    this.recieved = false;
    this.dataService.getBoardgames().subscribe(
      bg => {
        this.boardgames = bg;
        this.bgLength = this.boardgames.length - 1;
        this.recieved = true;
      }
    );
  }


}
