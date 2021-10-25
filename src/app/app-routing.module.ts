import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CartComponent } from './cart/cart.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { NavigationComponent } from './navigation/navigation.component';
import { ProductComponent } from './product/product.component';
import { RegisterpageComponent } from './registerpage/registerpage.component';


const routes: Routes = [{
  path:"Register",
  component:RegisterpageComponent,
  pathMatch:"full"
 },
 {
  path:"Login",
  component:LoginPageComponent,
  pathMatch:"full"
},
{
  path:"Navigation",
  component:NavigationComponent,
  pathMatch:"full"
},
{
  path:"",
  component:ProductComponent,
  pathMatch:"full"
},
{
  path:"Cart",
  component:CartComponent,
  pathMatch:"full"
}


];

@NgModule({                                // used to how to compile that component template
  imports: [RouterModule.forRoot(routes)],  // ngmodel - In the context of NgForm , the role of NgModel is to register the form field with form using name attribute. 
                                            //The NgModel is also used to bind the domain model of the class with view. On this page we will provide how to use NgForm in our Angular application
 exports: [RouterModule]
})
export class AppRoutingModule { }
