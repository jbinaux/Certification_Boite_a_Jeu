import { Component, OnInit } from '@angular/core';
import { DataService } from '../services/data.service';
import { Boardgame } from '../models/boardgame';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-gamepage',
  templateUrl: './gamepage.component.html',
  styleUrls: ['./gamepage.component.scss']
})
export class GamepageComponent implements OnInit {

  boardgame: Boardgame;
  recieved: boolean;
  constructor(private route: ActivatedRoute, private dataService: DataService) { }

  ngOnInit() {
    this.recieved = false;
    const id = +this.route.snapshot.paramMap.get('id');
    this.dataService.getBoardgame(id).subscribe(
      bg => {
        this.boardgame = bg;
        this.recieved = true;
      }
    );
  }

}
