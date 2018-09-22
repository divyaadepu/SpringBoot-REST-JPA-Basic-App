# SpringBoot-REST-JPA-Basic-App

Before Running Update your project by:
Right Click on the project -> Maven -> Update Project -> Tick Force update of Snapshots/Release and click Ok.

# Using POSTMAN to perform CRUD operations

POSTMAN is google chrome app which is freely available.Just install and run it.

    # GET (To Read Data)
      http://localhost:8080/persons  (To retrive all details)

      http://localhost:8080/persons/{id} (To get a particular detail)
     
          for eg : http://localhost:8080/persons/1001
     
     # POST (For Writing/Pushing Data)
 
       http://localhost:8080/persons
        { 
        # In Postman
           
           In header section :
            select key as : Content-Type
            and value as: application/json
            
            In raw
            To Add object
            
            {
              "id": "1001",
              "name": "divya",
              "age": "22"
            }
        
        }      
  
     # PUT (For Updating )
        
        Same as above POST
        Just a small change:
        
        http://localhost:8080/persons/{id} (To get a particular detail and UPDATE it)
      
     # DELETE (For Deleting )
        
        Same as above POST
        Just a small change:
        
        http://localhost:8080/persons/{id} (To get a particular detail and DELETE it)
  
