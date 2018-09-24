import { enableProdMode } from '@angular/core';
import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

import { AppModule } from './app/app.module';
import { environment } from './environments/environment';
import { ProductModule } from './app/product.module';

if (environment.production) {
  enableProdMode();
}

platformBrowserDynamic().bootstrapModule(ProductModule)
  .catch(err => console.log(err));
