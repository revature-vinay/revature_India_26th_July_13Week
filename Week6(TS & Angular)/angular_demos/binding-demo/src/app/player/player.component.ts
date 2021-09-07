import { Component, OnInit } from '@angular/core';
import { Player } from '../player';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent {

  playerList: Player[];
  player: Player;
  flag: boolean;
  constructor() {
    this.playerList = [];
    this.player = new Player();
    this.flag = false;
  }

  addPlayer() {
    this.playerList.push(this.player);
    this.player = new Player();
    console.log(this.playerList);
    this.flag = true;
  }

  removeLastPlayer() {
    this.playerList.pop();
    if (this.playerList.length == 0) {
      this.flag = false;
    }
  }

}
