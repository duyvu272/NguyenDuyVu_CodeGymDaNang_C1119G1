import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {FormBuilder, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {
  searchForm: FormGroup;
  @Output() data = new EventEmitter<string>();
  constructor(public fb: FormBuilder) { }

  ngOnInit(): void {
    this.searchForm = this.fb.group({
      data: ''
    });
  }
  search() {
    const {value} = this.searchForm;
    this.data.emit(value);
  }

}
