import { Routes } from '@angular/router';
import { Login } from './pages/login/login';
import { Cursos } from './pages/cursos/cursos';
import { noAuthGuard } from './guards/no-auth.guard';
import { authGuard } from './guards/auth.guard';

export const routes: Routes = [
    {
        path: 'login',
        component: Login,
        canActivate: [noAuthGuard]
    },
    {
        path: '',
        canActivate: [authGuard],
        children: [
            { path: 'cursos', component: Cursos },
            { path: '', redirectTo: 'cursos', pathMatch: 'full' }
        ]
    },
    {
        path: '**',
        redirectTo: 'cursos'
    }
];
