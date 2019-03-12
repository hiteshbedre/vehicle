/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logins;

/**
 *
 * @author UNDERTAKER
 */
class User {
    
    private int Post_Code,Telephone,NID;
    
    private String Name,Address,Email;
    
    public User(String Name, String Address, int Post_Code,int Telephone,int NID, String Email){ 
    this.Name=Name;
    this.Address=Address;
    this.Post_Code=Post_Code;
    this.Telephone=Telephone;
    this.Email=Email;
    this.NID=NID;
    
    }
    public int getPost_Code(){ 
    return Post_Code;
    }
    public int getNID(){ 
    return NID;
    }
    
     public int getTelephone(){ 
    return Telephone;
    }
    public String getName(){ 
    return Name;
    }
    public String getAddress(){ 
    return Address;
    }
    public String getEmail(){ 
    return Email;
    }
    
    
    
    
}
