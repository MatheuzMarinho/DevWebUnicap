import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DashboardNovoComponent } from './dashboard-novo.component';

const routes: Routes = [
    {
        path: '', component: DashboardNovoComponent
    }
];

@NgModule({
    imports: [RouterModule.forChild(routes)],
    exports: [RouterModule]
})
export class DashboardNovoRoutingModule {
}
