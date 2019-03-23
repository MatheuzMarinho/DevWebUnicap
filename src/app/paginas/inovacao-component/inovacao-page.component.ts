import { Component, OnInit } from '@angular/core';
import { slideToRight } from 'src/app/router.animations';

@Component({
    selector: 'app-inovacao-page',
    templateUrl: './inovacao-page.component.html',
    styleUrls: ['./inovacao-page.component.scss'],
    animations: [slideToRight()]
})
export class InovacaoPageComponent implements OnInit {
    constructor() {}

    ngOnInit() {}
}
