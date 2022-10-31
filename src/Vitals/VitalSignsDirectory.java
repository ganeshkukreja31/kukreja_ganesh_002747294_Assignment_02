/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vitals;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ganesh Kukreja
 */
public class VitalSignsDirectory {
      private ArrayList<VitalSigns> vitaldirectory;
    
    public VitalSignsDirectory(){
        this.vitaldirectory = new ArrayList<>();
    }

   public ArrayList<VitalSigns> getVitalSignsdirectory() {
        return vitaldirectory;
    }

   public void setVitalSignsdirectory(ArrayList<VitalSigns> vitaldirectory) {
        this.vitaldirectory = vitaldirectory;
    }
  
    public VitalSigns addNewVitalSigns (int pulse, int heartRate, double bloodPressure, double temperature, Date date, String userName){
        VitalSigns newVitalSign = new VitalSigns(pulse, heartRate, bloodPressure, temperature, date, userName);
        vitaldirectory.add(newVitalSign);
        return newVitalSign;
    }
}
