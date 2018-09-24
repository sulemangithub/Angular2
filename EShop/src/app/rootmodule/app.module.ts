import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CustomerModule } from '../customermodule/customer.module';
import { ProductModule } from '../productmodule/product.module';
import { AdminModule } from '../adminmodule/admin.module';
import { HttpClientModule } from '@angular/common/http';
import { CustomerService } from '../services/customer.service';

import {RouterModule, Route} from "@angular/router";
import { TrendingComponent } from '../productmodule/trending.component';
import { MostLikedComponent } from '../productmodule/mostliked.component';
import { MostViewedComponent } from '../productmodule/mostviewed.component';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,CustomerModule,ProductModule,AdminModule,HttpClientModule   
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
