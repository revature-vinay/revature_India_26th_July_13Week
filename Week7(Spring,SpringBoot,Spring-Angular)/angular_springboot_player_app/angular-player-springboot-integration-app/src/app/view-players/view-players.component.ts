import { Component, OnInit } from '@angular/core';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-view-players',
  templateUrl: './view-players.component.html',
  styleUrls: ['./view-players.component.css']
})
export class ViewPlayersComponent implements OnInit {

  private players: Player[];
  constructor(private service: PlayerService) {

  }

  ngOnInit() {
    this.service.getAllPlayers().subscribe(res => {
      this.players = res;
    })
  }

}
