import { Injectable } from '@angular/core';
import { Player } from './player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  playersList: Player[];
  constructor() {
    this.playersList = [];
  }

  public addPlayer(player: Player) {
    this.playersList.push(player);
  }

  public getAllPlayers(): Player[] {
    return this.playersList;
  }
}
