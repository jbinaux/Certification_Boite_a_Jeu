import { Injectable } from '@angular/core';
import { Boardgame } from '../models/boardgame';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { FormGroup } from '@angular/forms';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
};

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

  public getAuthToken(loginForm: FormGroup): Observable<any> {
    let data = {
      grant_type: 'password',
      scope: 'read',
      username: 'truc@gmail.com',
      password: '1234'
    }
    console.log(data);
    return this.httpClient.post<object>('http://BoiteAJeu:1234@localhost:8080/oauth/token?origin=http://localhost:4200', data, httpOptions);
  }

  private handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      // A client-side or network error occurred. Handle it accordingly.
      console.error('An error occurred:', error.error.message);
    } else {
      // The backend returned an unsuccessful response code.
      // The response body may contain clues as to what went wrong,
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }
    // return an observable with a user-facing error message
    return throwError(
      'Something bad happened; please try again later.');
  };

}
