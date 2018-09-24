import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";


@Injectable()
export class ProductService
{

    url:string = "http://10.221.40.74:8080/products/api/kpit/";
    constructor(private http:HttpClient)
    {
    }

    getAllProducts()
    {
        return this.http.get(`${this.url}/getAllProducts`).toPromise();
    }
}