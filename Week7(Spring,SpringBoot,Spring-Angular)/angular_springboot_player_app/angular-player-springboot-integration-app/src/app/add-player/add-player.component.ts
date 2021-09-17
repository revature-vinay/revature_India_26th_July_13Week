import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from '../player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-add-player',
  templateUrl: './add-player.component.html',
  styleUrls: ['./add-player.component.css']
})
export class AddPlayerComponent {
  private player: Player;

  constructor(private service: PlayerService, private router: Router) {
    this.player = new Player();
  }


  public addPlayer(): void {
    this.service.addPlayer(this.player).subscribe(res => {
      this.player = new Player();
      this.router.navigate(['/viewPlayers']);
    })
  }

}
