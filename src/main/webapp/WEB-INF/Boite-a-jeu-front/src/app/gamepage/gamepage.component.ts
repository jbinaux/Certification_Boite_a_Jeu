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
  constructor(private route: ActivatedRoute, private dataService: DataService) { }

  ngOnInit() {
    const id = +this.route.snapshot.paramMap.get('id');
    this.dataService.getBoardgame(id).subscribe(bg => this.boardgame = bg);
  }

}
