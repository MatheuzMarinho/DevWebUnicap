import { Component, OnInit } from '@angular/core';
import { slideToRight } from 'src/app/router.animations';

@Component({
  selector: 'app-dashboard-novo',
  templateUrl: './dashboard-novo.component.html',
  styleUrls: ['./dashboard-novo.component.scss'],
  animations: [slideToRight()]
})
export class DashboardNovoComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
