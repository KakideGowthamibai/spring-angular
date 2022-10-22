import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { OrderDetails } from 'src/app/common/order-details';
import { OrderDetailsService } from 'src/app/order-details.service';

@Component({
  selector: 'app-list-list',
  templateUrl: './list-list.component.html',
  styleUrls: ['./list-list.component.css']
})
export class ListListComponent implements OnInit {
  orderdetails:OrderDetails[]
    hasSearchName: any;
    searchName: string;
  lists: any;
  router: any;
  
  
    constructor( private listService:OrderDetailsService,public activateRoute :ActivatedRoute,public route:Router)
    {
      
    }
    ngOnInit(): void 
    {
      this.getAllOrderDetails();
      //this.activateRoute.paramMap.subscribe(()=>this.getAllOrderDetails());
  
    }
    getAllOrderDetails():void
    {
      this.hasSearchName = this.activateRoute.snapshot.paramMap.has("name");
      if(this.hasSearchName)
      {
        this.searchName  = this.activateRoute.snapshot.paramMap.get("name");
        console.log(this.searchName)
      this.listService.getAllOrderDetailsSearchByname(this.searchName).subscribe((data: any)=>{
        console.log(data);
        
        this.lists= data;
      });
  
      }
      else{
  
     
      this.listService.getAllOrderDetails().subscribe(data=>{
        console.log(data);
        this.orderdetails=data;
      });
    } 
  
  
  }
  updatelist(id : number){
    this.router.navigateByUrl("/updatelist/" +id);
  }
  addlist():void
  {
    this.router.navigateByUrl("/listform");
  }
  deletelist(id : number){
    console.log(id);
    if(confirm("Do you want to delete ?")){
      this.listService.deleteOrderDetails(id).subscribe(data=>{
        
        console.log(data);
        this.getAllOrderDetails();
      })
    }
  
    
  }
  
  }
