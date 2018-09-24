import { Component } from "@angular/core";
import { NgbModal } from "@ng-bootstrap/ng-bootstrap";
import { CustomerService } from "../services/customer.service";
import { elementStart } from "@angular/core/src/render3/instructions";
import { Promise } from "q";


@Component({
    selector : "customer-component",
    templateUrl :"./customer.component.html"
})
export class CustomerComponent{

    loggedIn:boolean = false;
    user:string = "sachin";
    message = "";

    constructor(private modalService : NgbModal,
        private customerService:CustomerService)
    {
    }

    //customer:{email,password,name,city,phone,dob} = null;
    validateUser(email,password)
    {
       this.customerService.validateUser(email,password).then(data=>{
           if(data)
           {
            this.loggedIn = true;
            this.user = email;
            this.modalService.dismissAll();
           }
           else{
            this.message = "Invalid email or password";
           }
       }).catch(error=>{
           console.log("error : "+error);
       });;
        
    }

    registerUser(email,password,name,city,phone,dob)
    {
        let customer = {"email":email,"password":password,"name":name,"city":city,"phone":phone,"dob":dob};

        this.customerService.registerUser(customer).then((data)=>{
          if(data)
          {
            this.modalService.dismissAll();
          }
          else
          {
            this.message = "Customer email already exists!";
          }
        }).catch((error)=>{
            console.log(error);
        });
    }


    /*
    validateUser(email,password)
    {
        if(this.customerService.validateUser(email,password))
        {
            this.loggedIn = true;
            this.user = email;
            this.modalService.dismissAll();
        }
        else{
            this.message = "Invalid email or password";
        }
    }

    registerUser(email,password,name,city,phone,dob)
    {
        let customer = {"email":email,"password":password,"name":name,"city":city,"phone":phone,"dob":dob};

        if(this.customerService.registerUser(customer))
        {
            this.message = "Account created successfully";
            this.modalService.dismissAll();
        }
        else
        {
            this.message = "Unable to create account.";
        }

    }
    */
    logout()
    {
        this.loggedIn = false;
        this.user = null;
    }

    openModal(modalType)
    {
        this.modalService.open(modalType);
    }
    
    closeModal()
    {
        this.modalService.dismissAll();
    }
}