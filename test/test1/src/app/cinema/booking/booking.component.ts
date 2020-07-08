import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {FilmService} from '../../../../services/film.service'
import {FilmModel} from 'src/app/Model/film.module';


interface Food {
  value: string;
  viewValue: string;
}

@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
  isLinear = false;
  public firstFormGroup: FormGroup;
  public secondFormGroup: FormGroup;
  public films: FilmModel[];
  public date: string;
  public i: number;

  constructor(
    private _formBuilder: FormBuilder,
    public filmService: FilmService,
    public id: FilmService
  ) {
  }

  ngOnInit() {
    this.firstFormGroup = this._formBuilder.group({
      firstCtrl: ['', Validators.required]
    });
    this.secondFormGroup = this._formBuilder.group({
      secondCtrl: ['', Validators.required]
    });
    this.getFilm();
  }

  getFilm() {
    this.filmService.getAllFilms().subscribe(data => {
      this.films = data;
      console.log(this.films);

      console.log(this.films[0].days);
      console.log(this.i);


    });
  }


}
