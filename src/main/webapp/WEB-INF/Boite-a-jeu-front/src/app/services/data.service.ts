import { Injectable } from '@angular/core';
import { Boardgame } from '../models/boardgame';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private httpClient: HttpClient) { }

  public getBoardgames(): Observable<Boardgame[]> {
    return this.httpClient.get<Boardgame[]>('http://localhost:8080/api/boardgame');
  }

  public getBoardgame(id: number): Observable<Boardgame> {
    return this.httpClient.get<Boardgame>('http://localhost:8080/api/boardgame/' + id);
  }

  public searchBoardgamesByName(name: string): Observable<Boardgame[]> {
    return this.httpClient.get<Boardgame[]>('http://localhost:8080/api/boardgame/recherche/' + name);
  }
}
