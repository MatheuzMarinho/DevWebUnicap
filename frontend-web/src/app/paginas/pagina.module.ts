import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgbDropdownModule } from '@ng-bootstrap/ng-bootstrap';
import { PaginaComponent } from './pagina.component';
import { PaginaRoutingModule } from './pagina-routing.module';
import { HeaderNovoComponent } from '../layout/components/header-novo/header-novo.component';
import { SidebarNovoComponent } from '../layout/components/sidebar-novo/sidebar-novo.component';
import { ListagemProfessorComponent } from './listagem-professor/listagem-professor.component';
import { PageHeaderModule } from '../shared';
import { DetalhesProfessorComponent } from './detalhes-professor/detalhes-professor.component';


@NgModule({
    imports: [
        CommonModule,
        PaginaRoutingModule,
        NgbDropdownModule,
        PageHeaderModule
    ],
    declarations: [PaginaComponent,HeaderNovoComponent,SidebarNovoComponent, ListagemProfessorComponent, DetalhesProfessorComponent]
})
export class PaginaModule {}
