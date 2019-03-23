import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { InovacaoPageRoutingModule } from './inovacao-page-routing.module';
import { InovacaoPageComponent } from './inovacao-page.component';
import { PageHeaderModule } from 'src/app/shared/modules';


@NgModule({
    imports: [CommonModule, InovacaoPageRoutingModule, PageHeaderModule],
    declarations: [InovacaoPageComponent]
})
export class InovacaoPageModule {}
