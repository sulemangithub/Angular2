import { Component } from "@angular/core";
import { ProductService } from "../services/product.services";

@Component({
    selector :"mostviewed-component",
    templateUrl : "./mostviewed.component.html"
})
export class MostViewedComponent
{
    mostViewedProducts = [];

    constructor(private productService : ProductService)
    {
        this.productService.getAllProducts().then((data:any)=>{
            this.mostViewedProducts = data;
        }).catch(error=>{
            console.log(error);
        });
    }
}