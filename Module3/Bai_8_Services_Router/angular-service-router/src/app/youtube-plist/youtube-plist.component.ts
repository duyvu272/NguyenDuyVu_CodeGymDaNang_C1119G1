import { Component, OnInit } from '@angular/core';
import {YoutubeService} from '../services/youtube/youtube.service';
@Component({
  selector: 'app-youtube-plist',
  templateUrl: './youtube-plist.component.html',
  styleUrls: ['./youtube-plist.component.css']
})
export class YoutubePlistComponent implements OnInit {

  constructor(public youtubeService: YoutubeService) { }

  ngOnInit(): void {
  }

}
