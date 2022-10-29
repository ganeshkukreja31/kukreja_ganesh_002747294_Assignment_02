/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import Person.Person;

/**
 *
 * @author patil
 */
public class Doctor extends Person {
    
    
    private String DocRegID;

    public String getDocRegID() {
        return DocRegID;
    }

   public void setDocRegID(String DocRegID) {
        this.DocRegID = DocRegID;
    }

   public Doctor(String usertype, String userID, String name, int age, String gender, String email, long phone, String username, String password, String state, String city, String community, String address, int experience, String specialisation, String hospital) {
       super(usertype,userID,name,age,gender,email,phone,username,password,state,city,community,address,experience,specialisation,hospital);
//       this.DocRegID = DocRegID;
    }
    
}
