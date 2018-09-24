import { NgModule } from "@angular/core";

import { BrowserModule } from "@angular/platform-browser";
import { AdminComponent } from "./admin.component";
import { AddProductComponent } from "./addproduct.component";
import { ViewCustomersComponent } from "./viewcustomers.component";
import { ViewProductsComponent } from "./viewproducts.component";
import { RouterModule } from "@angular/router";
import { AdminService } from "../services/admin.service";
import { FormsModule } from "@angular/forms";

@NgModule({
    declarations : [AdminComponent,AddProductComponent,ViewCustomersComponent,ViewProductsComponent],
    imports : [BrowserModule,FormsModule, RouterModule.forRoot([
        {path:"addproduct/:id",component:AddProductComponent},
        {path:"viewproducts",component:ViewProductsComponent},
        {path:"viewcustomers",component:ViewCustomersComponent}
    ])],
    providers : [AdminService],
    exports : [AdminComponent,AddProductComponent,ViewCustomersComponent,ViewProductsComponent]
})
export class AdminModule{

}