import { Component, OnInit } from '@angular/core';
import { EmployeeService } from '../../services/employee.service';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  genderType: string[] = [
    'MALE',
    'FEMALE',
  ];
  employeeform: FormGroup;
  validMessage: string = "";

  constructor(private employeeService: EmployeeService) { }

  ngOnInit() {
  this.employeeform = new FormGroup({
    firstName: new FormControl('', Validators.required),
    lastName: new FormControl('', Validators.required),
    gender: new FormControl('', Validators.required),
    dateOfBirth: new FormControl('', Validators.required),
    department: new FormControl('', Validators.required),
  });
}


submitRegistration() {

  if (this.employeeform.valid) {
    this.validMessage = "Employee has been succesfully Registered!";
    this.employeeService.createEmployeeRegistration(this.employeeform.value).subscribe(
      data => {
        this.employeeform.reset();
        return true;
      },
      error => {
        return Observable.throw(error);
      }
    )
  } else {
    this.validMessage = "Please fill out the form before submitting!";
  }
}

}
