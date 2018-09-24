import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";


@Injectable()
export class AdminService
{

    allCustomersURL:string = "http://10.221.40.74:8080/customers/api/kpit/getAllCustomers";
    allProductsURL:string = "http://10.221.40.74:8080/products/api/kpit/getAllProducts";
    addProductURL:string = "http://10.221.40.74:8080/products/api/kpit/addProduct";

    constructor(private http:HttpClient)
    {

    }

    getAllCustomers()
    {
        return this.http.get(this.allCustomersURL).toPromise();
    }

    getAllProducts()
    {
        return this.http.get(this.allProductsURL).toPromise();
    }

    addProduct(product)
    {
        return this.http.post(this.addProductURL,product).toPromise();
    }



}