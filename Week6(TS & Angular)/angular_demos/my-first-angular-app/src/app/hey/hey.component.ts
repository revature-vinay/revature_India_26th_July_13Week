import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hey',
  // templateUrl: './hey.component.html',
  // styleUrls: ['./hey.component.css']
  template: `<h1>Hello from template from Hey Component{{message}}</h1> <br/> <h1>{{message}}</h1>
  <h2>I am in other line</h2>
  `
})
export class HeyComponent {

  message = 'This is a sample message from ts file'


}
