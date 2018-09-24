import { Component } from "@angular/core";
import { AdminService } from "../services/admin.service";

@Component({
    selector : "viewproducts-component",
    templateUrl : "./viewproducts.component.html"
})
export class ViewProductsComponent
{
    products = [];

    constructor(private adminService:AdminService)
    {
          this.adminService.getAllProducts().then((data:any)=>{
              this.products = data;
          }).catch(error=>{
              console.log(error);
          })
    }
}