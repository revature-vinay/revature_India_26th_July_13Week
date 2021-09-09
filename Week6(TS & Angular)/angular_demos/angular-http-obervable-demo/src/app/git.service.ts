import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class GitService {

  gitUrl: string;
  constructor(private http: HttpClient) {
    this.gitUrl = "https://api.github.com/users";
  }

  public getAllGitUsers(): Observable<User[]> {
    return this.http.get<User[]>(this.gitUrl);
  }
}
