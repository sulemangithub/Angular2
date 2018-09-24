import { Component } from "@angular/core";
import { AdminService } from "../services/admin.service";

@Component({
    selector : "addproduct-component",
    templateUrl : "./addproduct.component.html"
})
export class AddProductComponent{

    username:string="saching gupta";

    constructor(private adminService:AdminService)
    {

    }

    message:string = "";
    addProduct(product)
    {
        this.adminService.addProduct(product).then((data)=>{
        if(data)
        {
            this.message = "Product Added successfully";
        }
        else{
            this.message = "Unable to add product";
        }

        }).catch((error)=>{
            this.message = "Unable to add product";
        });

    }

}