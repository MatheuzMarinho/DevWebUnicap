import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbCarouselModule, NgbAlertModule } from '@ng-bootstrap/ng-bootstrap';


import { DashboardNovoComponent } from './dashboard-novo.component';
import { DashboardNovoRoutingModule } from './dashboard-novo-routing.module';
import { CardModule } from 'src/app/shared/modules/card/card.module';

@NgModule({
    imports: [
        CommonModule,
        NgbCarouselModule,
        NgbAlertModule,
        DashboardNovoRoutingModule,
        CardModule
    ],
    declarations: [
        DashboardNovoComponent
    ]
})
export class DashboardNovoModule {}
