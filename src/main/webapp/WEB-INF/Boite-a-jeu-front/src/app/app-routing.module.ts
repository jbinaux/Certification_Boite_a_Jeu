import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SignInRegisterMasterComponent} from './sign-in-register-master/sign-in-register-master.component';
import { HomepageComponent } from './homepage/homepage.component';

const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'sign-in', component: SignInRegisterMasterComponent }
];

@NgModule({
  imports: [ RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
