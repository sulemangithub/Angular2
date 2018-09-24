import { NgModule } from "@angular/core";
import {RouterModule, Route} from "@angular/router";
import { BrowserModule } from "@angular/platform-browser";
import { ProductComponent } from "./product.component";
import { TrendingComponent } from "./trending.component";
import { MostLikedComponent } from "./mostliked.component";
import { MostViewedComponent } from "./mostviewed.component";
import { ProductService } from "../services/product.services";


@NgModule({
    declarations : [ProductComponent,TrendingComponent,MostLikedComponent,MostViewedComponent],
    imports : [BrowserModule, RouterModule.forRoot(
        [
          {path:"trending",component:TrendingComponent},
          {path:"mostliked",component:MostLikedComponent},
          {path:"mostviewed",component:MostViewedComponent}
        ])],
    providers : [ProductService],
    exports : [ProductComponent,TrendingComponent,MostLikedComponent,MostViewedComponent]
})
export class ProductModule{

}