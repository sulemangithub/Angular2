import { Component } from "@angular/core";
import { ProductService } from "../services/product.services";

@Component({
    selector :"trending-component",
    templateUrl : "./trending.component.html"
})
export class TrendingComponent
{
    trendingProducts = [];

    constructor(private productService : ProductService)
    {
        this.productService.getAllProducts().then((data:any)=>{
            this.trendingProducts = data;
        }).catch(error=>{
            console.log(error);
        });
    }
}