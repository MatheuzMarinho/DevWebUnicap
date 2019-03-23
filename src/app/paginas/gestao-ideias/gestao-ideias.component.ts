import { Component, OnInit } from '@angular/core';
import { slideToRight } from 'src/app/router.animations';

@Component({
    selector: 'app-gestao-ideias',
    templateUrl: './gestao-ideias.component.html',
    styleUrls: ['./gestao-ideias.component.scss'],
    animations: [slideToRight()]
})
export class GestaoIdeiasComponent implements OnInit {
    constructor() {}

    ngOnInit() {}
}
