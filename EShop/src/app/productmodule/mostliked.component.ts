import { Component } from "@angular/core";
import { ProductService } from "../services/product.services";

@Component({
    selector :"mostliked-component",
    templateUrl : "./mostliked.component.html"
})
export class MostLikedComponent
{
    mostLikedProducts = [];

    constructor(private productService : ProductService)
    {
        this.productService.getAllProducts().then((data:any)=>{
            this.mostLikedProducts = data;
        }).catch(error=>{
            console.log(error);
        });
    }
}