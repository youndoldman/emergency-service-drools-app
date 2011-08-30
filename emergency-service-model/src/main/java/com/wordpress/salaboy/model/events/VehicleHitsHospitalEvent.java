/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.wordpress.salaboy.model.events;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author salaboy
 */
public class VehicleHitsHospitalEvent implements CallEvent, Serializable{
    private String callId;
    private String vehicleId;
    private String hospitalId;
    private Date time;
    
    public VehicleHitsHospitalEvent(String callId, String vehicleId, String hospitalId, Date date) {
        this.callId = callId;
        this.vehicleId = vehicleId;
        this.hospitalId = hospitalId;
        this.time = date;
    }

    @Override
    public String getCallId() {
        return callId;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public Date getTime() {
        return time;
    }

    public String getVehicleId() {
        return vehicleId;
    }
    
    
    

}