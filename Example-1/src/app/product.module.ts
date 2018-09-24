import { NgModule } from "@angular/core";
import { ProductComponent } from "./product.component";
import { BrowserModule } from "@angular/platform-browser";

@NgModule({

    declarations :[ProductComponent],
    imports : [BrowserModule],
    providers : [],
    bootstrap : [ProductComponent]
})
export class ProductModule{

}