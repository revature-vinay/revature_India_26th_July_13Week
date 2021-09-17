import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from './player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {

  private url: string;
  constructor(private http: HttpClient) {
    this.url = "http://localhost:7000/player";
  }

  public addPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(this.url, player);
  }

  public updatePlayer(player: Player): Observable<Player> {
    return this.http.put<Player>(this.url, player);
  }
  public deletePlayer(id: number): void {
    this.http.delete(this.url + "/{id}");
  }

  public getAllPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(this.url + "s");
  }
}
