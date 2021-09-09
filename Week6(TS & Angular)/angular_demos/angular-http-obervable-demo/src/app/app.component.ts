import { Component } from '@angular/core';
import { GitService } from './git.service';
import { User } from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  usersList: User[];
  flag: boolean;
  constructor(private service: GitService) {
    this.flag = false;
  }

  getAllGitUsers() {
    this.service.getAllGitUsers().subscribe(res => {
      this.usersList = res;
      this.flag = true;
    })
  }

}
