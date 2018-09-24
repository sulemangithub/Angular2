import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable()
export class CustomerService
{
    constructor(private http : HttpClient)
    {
    }
    
    validateUser(email:string,password:string)
    {
         return this.http.get(`http://10.221.40.74:8080/customers/api/kpit/validateCustomer/${email}/${password}`).toPromise();                    
         //let url = "http://10.221.40.74:8080/products/api/kpit/getAllProducts";
         //return this.http.get(url).toPromise();
    }


    registerUser(customer)
    {
       return this.http.post(`http://10.221.40.74:8080/customers/api/kpit/addCustomer`,customer).toPromise();
    }

    /*customers:Map<string,{email,password,name,city,phone,dob}> = 
        new Map<string,{email,password,name,city,phone,dob}>();

    constructor()
    {
        this.customers.set("sachin@kpit.com",
        {email:"sachin@kpit.com",password:"pass123",
            name:"sachin gupta",city:"pune",phone:"909090",
            dob:"1990-02-03"});

        this.customers.set("ramesh@kpit.com",
        {email:"ramesh@kpit.com",password:"pass123",
             name:"ramesh gupta",city:"pune",phone:"909091",
             dob:"1993-02-03"});
    }

    validateUser(email:string,password:string)
    {
        if(this.customers.has(email))
        {
            let customer = this.customers.get(email);

            if(customer.password == password)
            {
                return true;
            }
        }
        return false;
    }

    registerUser(customer)
    {
        if(this.customers.has(customer.email))
        {
            return false;
        }
        else{
            this.customers.set(customer.email,customer);
            return true;
        }
    }*/



}