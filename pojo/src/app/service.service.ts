import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { City } from 'src/Model/City.model';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor(private http:HttpClient ) { }
  url=" http://localhost:3002/reg";
  postdata(c:City)
  {
    return this.http.post(this.url,c);
  }
}
