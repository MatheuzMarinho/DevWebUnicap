import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { PageHeaderModule } from 'src/app/shared/modules';
import { GestaoIdeiasRoutingModule } from './gestao-ideias-routing.module';
import { GestaoIdeiasComponent } from './gestao-ideias.component';
import { GestaoCadastroComponent } from './gestao-cadastro-component/gestao-cadastro.component';


@NgModule({
    imports: [CommonModule,  GestaoIdeiasRoutingModule, PageHeaderModule],
    declarations: [GestaoIdeiasComponent, GestaoCadastroComponent]
})
export class GestaoIdeiasModule {}
