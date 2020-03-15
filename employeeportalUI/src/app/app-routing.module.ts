import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { EmployeesComponent } from './components/employees/employees.component';
import { RegistrationComponent } from './components/registration/registration.component';

const routes: Routes = [

   {
     path: 'registration',
     component: RegistrationComponent
  },
  // {
  //   path: 'admin/view/:id',
  //   component: ViewRegistrationComponent
  // },
  {
    path: 'employeelist',
    component: EmployeesComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
