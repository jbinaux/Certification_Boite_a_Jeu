import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignInRegisterMasterComponent} from './sign-in-register-master/sign-in-register-master.component';

const routes: Routes = [
  { path: 'sign-in', component: SignInRegisterMasterComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
