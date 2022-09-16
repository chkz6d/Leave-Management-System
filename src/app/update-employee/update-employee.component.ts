import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';


@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  id: number;
  employee: Employee = new Employee();
  constructor(private employeeService: EmployeeService,
    private router: Router) { }
  
  ngOnInit(): void {}

  goToEmployeeList(){
    this.router.navigate(['/employees']);
  }
  onSubmit(){
    this.employeeService.updateEmployee(this.employee.id,this.employee).subscribe( data =>{
      this.goToEmployeeList();
    }, error => console.log(error));

  }


}
