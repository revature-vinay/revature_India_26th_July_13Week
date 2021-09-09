import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AddPlayerComponent } from './add-player/add-player.component';
import { DeletePlayerComponent } from './delete-player/delete-player.component';
import { ViewPlayersComponent } from './view-players/view-players.component';
import { FormsModule } from '@angular/forms';
import { PlayerService } from './player.service';

@NgModule({
  declarations: [
    AppComponent,
    AddPlayerComponent,
    DeletePlayerComponent,
    ViewPlayersComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [PlayerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
