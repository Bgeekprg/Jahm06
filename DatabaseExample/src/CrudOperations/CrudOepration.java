package CrudOperations;
import java.sql.*;
//import javax.sql.*;

import DBConnection.CreateConnection;

public class CrudOepration {
	
	    Connection cn;
	    static Statement st;

	    public CrudOepration() {
	     
	        try {
	        	   cn = CreateConnection.getConnection();
	            if (cn != null) {
	                st = cn.createStatement();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    
	    public static void insertData(String accno,String accname,int bal) {
	    	
	    	String iquesy=	"insert into account values('" + accno + "','" + accname + "'," + bal+ ")";
	        try {
	    		int result = st.executeUpdate(iquesy); 
	              if(result>0) {
	            	  System.out.println("Record inserted successfully.....");
	              }

	    		
	              
	    	} 
	        catch (SQLIntegrityConstraintViolationException sq) {
	        	System.out.println("please enter unique number for accno");
	        }
	        catch (SQLException e) {
	    		 
	    		e.printStackTrace();
	    	}
	        
	    		
	    	}
	    public static void deleteData(String accn) {
	    	
	    	String squery = "delete from account where accno='"+ accn + "'";
	    	int r;
	    	try {
	    		r = st.executeUpdate(squery);  //insert ,update,delete
	    		if (r> 0){
	    			System.out.println("REcord deleted Successfully!!!");
	    			
	    		}
	    	} catch (SQLException e) {
	    		 
	    		e.printStackTrace();
	    	}
	    	
	    }
	    		
	    public static void  updateData(String accno, String newName, int newBal) {
	        String query = "UPDATE account SET name = '" + newName + "', balance = " + newBal + " WHERE accno = '" + accno + "'";
	        try {
	            int result;
	            result= st.executeUpdate(query);
	            if (result > 0) {
	                System.out.println("Record updated successfully.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	    	
	    	
	    	public static void getdata()
	    	{
	    		String squery="select * from account";
	    		try {
	    		  ResultSet r=	st.executeQuery(squery);   // select 
	    		 
	    		   while(r.next()) {
	    			   
	    			   
	    			   System.out.println(r.getString(1) + "  "+ r.getString(2)+ " " + r.getInt(3));
	    		   }
	    		 
	    		} catch (SQLException e) {
	    			 
	    			e.printStackTrace();
	    		}
	    		
	    		
	    	}
	    	
		}
	