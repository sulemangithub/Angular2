import { Component } from "@angular/core";

@Component({
    selector : "product-component",
    templateUrl : "./product.component.html"
})
export class ProductComponent
{
    products:Map<number,{id,name,price,category}> = new Map<number,{id,name,price,category}>();
    message:string = "";
    product:{id,name,price,category} = {id:"",name:"",price:"",category:""};

    addProduct(id,name,category,price)
    {
        if(this.products.has(id))
        {
            this.message = "product already exists!";
        }
        else{
            let p = {"id":id,"name":name,"category":category,"price":price};
            this.products.set(id,p);
            this.message = "product added successfully!";
        }
        this.getAllProducts();
    }

    updateProduct(id,name,category,price)
    {
        if(this.products.has(id))
        {
            let p = {"id":id,"name":name,"category":category,"price":price};
            this.products.set(id,p);
            this.message = "product updated successfully!";
        }
        else{
            this.message = "product id can't be modifiedy!";
        }
        this.getAllProducts();
    }


    getProduct(id)
    {
        console.log("called..."+id);

        if(this.products.has(id))
        {
            this.product = this.products.get(id);
        }
        else{
            this.product = null;
            this.message = "product not found!";
        }
    }

    deleteProduct(id)
    {
        if(this.products.has(id))
        {
            this.products.delete(id);
            this.message = "product deleted successfully";
        }
        else{
            this.product = null;
            this.message = "product not found!";
        }
        this.getAllProducts();
    }

    productarray = null;

    getAllProducts()
    {
        this.productarray = Array.from(this.products.values());
    }

}
