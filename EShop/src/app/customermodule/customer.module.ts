import { NgModule } from "@angular/core";
import { CustomerComponent } from "./customer.component";
import { BrowserModule } from "@angular/platform-browser";
import {NgbModule} from "@ng-bootstrap/ng-bootstrap";
import { CustomerService } from "../services/customer.service";
import {HttpClientModule} from "@angular/common/http";
import { ProductModule } from "../productmodule/product.module";
import { AdminModule } from "../adminmodule/admin.module";

@NgModule({
    declarations : [CustomerComponent],
    imports : [BrowserModule,NgbModule.forRoot(),ProductModule,AdminModule],
    providers : [],
    exports : [CustomerComponent]
})
export class CustomerModule{

}