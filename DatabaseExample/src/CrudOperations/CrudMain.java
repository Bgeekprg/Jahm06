package CrudOperations;

//import CrudOperations.CrudOepration.CrudOperation;

class CrudMain{
public static void main(String[] args) {
    

	CrudOepration crd=new CrudOepration();
    
	crd.insertData("Acc01", "John Doe", 500);

	  crd.getdata();
	  crd.insertData("Acc01", "Alice Smith", 1000);
      crd.insertData("Acc02", "Bob Johnson", 1500);
      crd.insertData("Acc03", "Charlie Brown", 2000);
      crd.insertData("Acc04", "David Wilson", 2500);
      crd.insertData("Acc05", "Eva Green", 3000);
    
    crd.updateData("Acc01", "John Smith", 1000);
    crd.getdata();
    
    crd.deleteData("Acc01");
    

   }
}