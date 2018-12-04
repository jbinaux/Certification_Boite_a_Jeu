import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { DisplayGameComponent } from './display-game/display-game.component';
import { DisplayReviewsComponent } from './display-reviews/display-reviews.component';
import { BestGamesComponent } from './best-games/best-games.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { SignInRegisterMasterComponent } from './sign-in-register-master/sign-in-register-master.component';
import { HomepageComponent } from './homepage/homepage.component';
import { FooterComponent } from './footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { GamepageComponent } from './gamepage/gamepage.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    DisplayGameComponent,
    DisplayReviewsComponent,
    BestGamesComponent,
    SignInComponent,
    RegisterComponent,
    SignInRegisterMasterComponent,
    HomepageComponent,
    FooterComponent,
    GamepageComponent
  ],
  imports: [
    BrowserModule,
    MDBBootstrapModule.forRoot(),
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
