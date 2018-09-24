import { Component } from "@angular/core";
import { AdminService } from "../services/admin.service";

@Component({
    selector : "viewcustomers-component",
    templateUrl : "./viewcustomers.component.html"
})
export class ViewCustomersComponent
{
     customers = [];

     constructor(private adminService:AdminService)
     {
           this.adminService.getAllCustomers().then((data:any)=>{
               this.customers = data;
           }).catch(error=>{
               console.log(error);
           })
     }
}