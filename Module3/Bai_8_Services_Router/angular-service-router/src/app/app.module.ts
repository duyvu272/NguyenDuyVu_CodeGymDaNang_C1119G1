import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TimelinesComponent } from './timelines/timelines.component';
import {RouterModule} from '@angular/router';
import { YoutubePlayerComponent } from './youtube-player/youtube-player.component';
import { YoutubePlistComponent } from './youtube-plist/youtube-plist.component';
import { DictionaryComponent } from './dictionary/dictionary.component';
import { MainComponent } from './main/main.component';

@NgModule({
  declarations: [
    AppComponent,
    TimelinesComponent,
    YoutubePlayerComponent,
    YoutubePlistComponent,
    DictionaryComponent,
    MainComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: 'timelines', component: TimelinesComponent},
      {path: 'youtube', component: YoutubePlistComponent,
      children: [{
        path: ':id',component: YoutubePlayerComponent
      }]},
      {path: 'dictionary', component: DictionaryComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
