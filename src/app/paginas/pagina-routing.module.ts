import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { PaginaComponent } from './pagina.component';
import { ListagemProfessorComponent } from './listagem-professor/listagem-professor.component';
import { DetalhesProfessorComponent } from './detalhes-professor/detalhes-professor.component';

const routes: Routes = [
    {
        path: '',
        component: PaginaComponent,
        children: [
            { path: '', redirectTo: 'professores', pathMatch: 'prefix' },
            { path: 'professores', component: ListagemProfessorComponent },
            { path: 'detalhes/:id', component: DetalhesProfessorComponent },
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class PaginaRoutingModule {}
