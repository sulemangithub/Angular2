import { Component } from "@angular/core";


@Component({

    selector : "sample-component",
    templateUrl : "./app.sample.html"
})
export class SampleComponent{

    name:string = "Sachin Gupta";

    names:Array<string> = 
                ["sachin","ramesh","paresh","suresh","rakesh"];
    message:string = "";

    addName(name)
    {
        if(this.names.indexOf(name) == -1)
        {
            this.names.push(name);
            this.message = "Name added successfully";
        }
        else
        {
            this.message = "Name already exist!";
        }        
    }
}