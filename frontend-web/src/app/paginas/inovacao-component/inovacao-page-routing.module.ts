import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { InovacaoPageComponent } from './inovacao-page.component';

const routes: Routes = [
    {
        path: '',
        component: InovacaoPageComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class InovacaoPageRoutingModule {}
