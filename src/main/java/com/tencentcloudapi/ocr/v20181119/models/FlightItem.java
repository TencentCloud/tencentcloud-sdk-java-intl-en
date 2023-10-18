/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlightItem extends AbstractModel {

    /**
    * Departure terminal
    */
    @SerializedName("TerminalGetOn")
    @Expose
    private String TerminalGetOn;

    /**
    * Arrival terminal
    */
    @SerializedName("TerminalGetOff")
    @Expose
    private String TerminalGetOff;

    /**
    * Carrier
    */
    @SerializedName("Carrier")
    @Expose
    private String Carrier;

    /**
    * Flight number
    */
    @SerializedName("FlightNumber")
    @Expose
    private String FlightNumber;

    /**
    * Class
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * Departure date
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * Departure time
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * Departure city
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * Arrival city
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * Baggage allowance
    */
    @SerializedName("Allow")
    @Expose
    private String Allow;

    /**
    * Fare category
    */
    @SerializedName("FareBasis")
    @Expose
    private String FareBasis;

    /**
     * Get Departure terminal 
     * @return TerminalGetOn Departure terminal
     */
    public String getTerminalGetOn() {
        return this.TerminalGetOn;
    }

    /**
     * Set Departure terminal
     * @param TerminalGetOn Departure terminal
     */
    public void setTerminalGetOn(String TerminalGetOn) {
        this.TerminalGetOn = TerminalGetOn;
    }

    /**
     * Get Arrival terminal 
     * @return TerminalGetOff Arrival terminal
     */
    public String getTerminalGetOff() {
        return this.TerminalGetOff;
    }

    /**
     * Set Arrival terminal
     * @param TerminalGetOff Arrival terminal
     */
    public void setTerminalGetOff(String TerminalGetOff) {
        this.TerminalGetOff = TerminalGetOff;
    }

    /**
     * Get Carrier 
     * @return Carrier Carrier
     */
    public String getCarrier() {
        return this.Carrier;
    }

    /**
     * Set Carrier
     * @param Carrier Carrier
     */
    public void setCarrier(String Carrier) {
        this.Carrier = Carrier;
    }

    /**
     * Get Flight number 
     * @return FlightNumber Flight number
     */
    public String getFlightNumber() {
        return this.FlightNumber;
    }

    /**
     * Set Flight number
     * @param FlightNumber Flight number
     */
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    /**
     * Get Class 
     * @return Seat Class
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set Class
     * @param Seat Class
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get Departure date 
     * @return DateGetOn Departure date
     */
    public String getDateGetOn() {
        return this.DateGetOn;
    }

    /**
     * Set Departure date
     * @param DateGetOn Departure date
     */
    public void setDateGetOn(String DateGetOn) {
        this.DateGetOn = DateGetOn;
    }

    /**
     * Get Departure time 
     * @return TimeGetOn Departure time
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set Departure time
     * @param TimeGetOn Departure time
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get Departure city 
     * @return StationGetOn Departure city
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set Departure city
     * @param StationGetOn Departure city
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get Arrival city 
     * @return StationGetOff Arrival city
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set Arrival city
     * @param StationGetOff Arrival city
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
    }

    /**
     * Get Baggage allowance 
     * @return Allow Baggage allowance
     */
    public String getAllow() {
        return this.Allow;
    }

    /**
     * Set Baggage allowance
     * @param Allow Baggage allowance
     */
    public void setAllow(String Allow) {
        this.Allow = Allow;
    }

    /**
     * Get Fare category 
     * @return FareBasis Fare category
     */
    public String getFareBasis() {
        return this.FareBasis;
    }

    /**
     * Set Fare category
     * @param FareBasis Fare category
     */
    public void setFareBasis(String FareBasis) {
        this.FareBasis = FareBasis;
    }

    public FlightItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlightItem(FlightItem source) {
        if (source.TerminalGetOn != null) {
            this.TerminalGetOn = new String(source.TerminalGetOn);
        }
        if (source.TerminalGetOff != null) {
            this.TerminalGetOff = new String(source.TerminalGetOff);
        }
        if (source.Carrier != null) {
            this.Carrier = new String(source.Carrier);
        }
        if (source.FlightNumber != null) {
            this.FlightNumber = new String(source.FlightNumber);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Allow != null) {
            this.Allow = new String(source.Allow);
        }
        if (source.FareBasis != null) {
            this.FareBasis = new String(source.FareBasis);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TerminalGetOn", this.TerminalGetOn);
        this.setParamSimple(map, prefix + "TerminalGetOff", this.TerminalGetOff);
        this.setParamSimple(map, prefix + "Carrier", this.Carrier);
        this.setParamSimple(map, prefix + "FlightNumber", this.FlightNumber);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Allow", this.Allow);
        this.setParamSimple(map, prefix + "FareBasis", this.FareBasis);

    }
}

