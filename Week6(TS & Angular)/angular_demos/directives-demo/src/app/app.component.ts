import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  players: Player[] = [
    {
      "id": 100,
      "name": "Sachin R Tendulkar"
    },
    {
      "id": 102,
      "name": "Sourav Ganguly"
    },
    {
      "id": 103,
      "name": "Ms D"
    },
    {
      "id": 104,
      "name": "Kohli"
    },
    {
      "id": 105,
      "name": "Rohit Sharma"
    }
  ];
}


class Player {
  id: number;
  name: string;

}