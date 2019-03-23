import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GestaoIdeiasComponent } from './gestao-ideias.component';
import { GestaoCadastroComponent } from './gestao-cadastro-component/gestao-cadastro.component';

const routes: Routes = [
    {
        path: '',
        component: GestaoIdeiasComponent,
        children: [
            { path: '', redirectTo: 'cadastro', pathMatch: 'prefix' },
            { path: 'cadastro', component: GestaoCadastroComponent },
        ]
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class GestaoIdeiasRoutingModule {}
