import { Component, OnInit } from '@angular/core';
import { OrderDetails } from 'src/app/common/order-details';
import { ActivatedRoute, Router } from '@angular/router';
import { OrderDetailsService } from 'src/app/order-details.service';

@Component({
  selector: 'app-list-form',
  templateUrl: './list-form.component.html',
  styleUrls: ['./list-form.component.css']
})
export class ListFormComponent implements OnInit {
  lists:OrderDetails=new OrderDetails(0,"gowthamii",9456478902,"Java ProgrammingLanguage",130,"phonepay",300);
  isEditable:boolean;
  
 
  constructor(public listService:OrderDetailsService,public router:Router,public activateRoute :ActivatedRoute) { }

  ngOnInit(): void 
  {
    this.activateRoute.paramMap.subscribe(()=>this.lists);
       this.getOrderDetailsById();
  }
  onSubmit():void
  {
    if(this.isEditable)
    {
      this.listService.updateOrderDetails(this.lists).subscribe(data=>
        this.router.navigateByUrl("/lists"));

    }
    else{

    
    console.log("hello");
    console.log(this.lists);
    this.listService.SaveOrderDetails(this.lists). subscribe((data: any)=>console.log(data));
    this.router.navigateByUrl("/list");
    }

  }

getOrderDetailsById(){
  const listID  = parseFloat(this.activateRoute.snapshot.paramMap.get("id"));
  
console.log(listID)
if(listID> 0){
  this.isEditable = true;
  this.listService.getOrderDetailsById(listID).subscribe((data: OrderDetails)=>{
    this.lists = data;
    console.log(this.lists)
  });
}
}}