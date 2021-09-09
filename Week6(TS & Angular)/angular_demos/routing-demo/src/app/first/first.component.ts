import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-first',
  templateUrl: './first.component.html',
  styleUrls: ['./first.component.css'],

})
export class FirstComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  callSecondLakshmi() {
    this.router.navigate(['/second']);
  }

}
