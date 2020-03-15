import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs';

const httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class EmployeeService {

  constructor(private http: HttpClient) { }

  getEmployees(): Observable<any> {
    return this.http.get('server/api/v1/employees');
  }

  createEmployeeRegistration(employee) {
    let body = JSON.stringify(employee);
    return this.http.post('server/api/v1/employees', body, httpOptions);

  }
}
