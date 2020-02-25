import { Component, OnInit } from '@angular/core';
import { City } from 'src/Model/City.model';
import { ServiceService } from '../service.service';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-city',
  templateUrl: './city.component.html',
  styleUrls: ['./city.component.css']
})
export class CityComponent implements OnInit {
  City = this.fb.group({

    cityId: [''],
    cityName: [''],
    cityCode: [''],
    state: this.fb.group({
      stateId: [''],
      stateName: [''],
      stateCode: [''],
      country: this.fb.group({
        countryId: [''],
        countryName: [''],
        countryCode: ['']
      })
    })
  });
  constructor(private ser: ServiceService, private fb: FormBuilder) { }

  ngOnInit() {
  }
  submitdata(city1: City) {
    this.ser.postdata(city1).subscribe();
  }

}
