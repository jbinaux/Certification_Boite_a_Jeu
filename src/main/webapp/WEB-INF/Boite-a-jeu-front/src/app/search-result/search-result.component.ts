import { Component, OnInit, Renderer2 } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { DataService } from '../services/data.service';
import { Boardgame } from '../models/boardgame';

@Component({
  selector: 'app-search-result',
  templateUrl: './search-result.component.html',
  styleUrls: ['./search-result.component.scss']
})
export class SearchResultComponent implements OnInit {

  searchParam: string;
  boardgames: Boardgame[];
  constructor(private route: ActivatedRoute, private dataService: DataService, renderer: Renderer2) {
  renderer.listen('document', 'submit', () => this.searchFunction());
  }

  ngOnInit() {
    this.searchFunction();
  }

  searchFunction() {
    this.route.params.subscribe(param => this.searchParam = param.search);
    this.dataService.searchBoardgamesByName(this.searchParam).subscribe(bg => this.boardgames = bg);
  }
}
