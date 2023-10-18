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

public class BusInvoice extends AbstractModel {

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Invoice number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Invoice code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Date of issue
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Departure time
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * Departure date
    */
    @SerializedName("DateGetOn")
    @Expose
    private String DateGetOn;

    /**
    * Departure station
    */
    @SerializedName("StationGetOn")
    @Expose
    private String StationGetOn;

    /**
    * Destination
    */
    @SerializedName("StationGetOff")
    @Expose
    private String StationGetOff;

    /**
    * Fare
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Consumption type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * ID card number
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * Province
    */
    @SerializedName("Province")
    @Expose
    private String Province;

    /**
    * City
    */
    @SerializedName("City")
    @Expose
    private String City;

    /**
    * Departure place
    */
    @SerializedName("PlaceGetOn")
    @Expose
    private String PlaceGetOn;

    /**
    * Check-in gate
    */
    @SerializedName("GateNumber")
    @Expose
    private String GateNumber;

    /**
    * Fare category
    */
    @SerializedName("TicketType")
    @Expose
    private String TicketType;

    /**
    * Vehicle type
    */
    @SerializedName("VehicleType")
    @Expose
    private String VehicleType;

    /**
    * Seat No.
    */
    @SerializedName("SeatNumber")
    @Expose
    private String SeatNumber;

    /**
    * Fleet number
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
     * Get Invoice title 
     * @return Title Invoice title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Invoice title
     * @param Title Invoice title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Whether there is a QR code (0: No, 1: Yes) 
     * @return QRCodeMark Whether there is a QR code (0: No, 1: Yes)
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set Whether there is a QR code (0: No, 1: Yes)
     * @param QRCodeMark Whether there is a QR code (0: No, 1: Yes)
     */
    public void setQRCodeMark(Long QRCodeMark) {
        this.QRCodeMark = QRCodeMark;
    }

    /**
     * Get Invoice number 
     * @return Number Invoice number
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Invoice number
     * @param Number Invoice number
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Invoice code 
     * @return Code Invoice code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Invoice code
     * @param Code Invoice code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Date of issue 
     * @return Date Date of issue
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date of issue
     * @param Date Date of issue
     */
    public void setDate(String Date) {
        this.Date = Date;
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
     * Get Departure station 
     * @return StationGetOn Departure station
     */
    public String getStationGetOn() {
        return this.StationGetOn;
    }

    /**
     * Set Departure station
     * @param StationGetOn Departure station
     */
    public void setStationGetOn(String StationGetOn) {
        this.StationGetOn = StationGetOn;
    }

    /**
     * Get Destination 
     * @return StationGetOff Destination
     */
    public String getStationGetOff() {
        return this.StationGetOff;
    }

    /**
     * Set Destination
     * @param StationGetOff Destination
     */
    public void setStationGetOff(String StationGetOff) {
        this.StationGetOff = StationGetOff;
    }

    /**
     * Get Fare 
     * @return Total Fare
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Fare
     * @param Total Fare
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Name 
     * @return UserName Name
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set Name
     * @param UserName Name
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get Consumption type 
     * @return Kind Consumption type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Consumption type
     * @param Kind Consumption type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get ID card number 
     * @return UserID ID card number
     */
    public String getUserID() {
        return this.UserID;
    }

    /**
     * Set ID card number
     * @param UserID ID card number
     */
    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    /**
     * Get Province 
     * @return Province Province
     */
    public String getProvince() {
        return this.Province;
    }

    /**
     * Set Province
     * @param Province Province
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * Get City 
     * @return City City
     */
    public String getCity() {
        return this.City;
    }

    /**
     * Set City
     * @param City City
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * Get Departure place 
     * @return PlaceGetOn Departure place
     */
    public String getPlaceGetOn() {
        return this.PlaceGetOn;
    }

    /**
     * Set Departure place
     * @param PlaceGetOn Departure place
     */
    public void setPlaceGetOn(String PlaceGetOn) {
        this.PlaceGetOn = PlaceGetOn;
    }

    /**
     * Get Check-in gate 
     * @return GateNumber Check-in gate
     */
    public String getGateNumber() {
        return this.GateNumber;
    }

    /**
     * Set Check-in gate
     * @param GateNumber Check-in gate
     */
    public void setGateNumber(String GateNumber) {
        this.GateNumber = GateNumber;
    }

    /**
     * Get Fare category 
     * @return TicketType Fare category
     */
    public String getTicketType() {
        return this.TicketType;
    }

    /**
     * Set Fare category
     * @param TicketType Fare category
     */
    public void setTicketType(String TicketType) {
        this.TicketType = TicketType;
    }

    /**
     * Get Vehicle type 
     * @return VehicleType Vehicle type
     */
    public String getVehicleType() {
        return this.VehicleType;
    }

    /**
     * Set Vehicle type
     * @param VehicleType Vehicle type
     */
    public void setVehicleType(String VehicleType) {
        this.VehicleType = VehicleType;
    }

    /**
     * Get Seat No. 
     * @return SeatNumber Seat No.
     */
    public String getSeatNumber() {
        return this.SeatNumber;
    }

    /**
     * Set Seat No.
     * @param SeatNumber Seat No.
     */
    public void setSeatNumber(String SeatNumber) {
        this.SeatNumber = SeatNumber;
    }

    /**
     * Get Fleet number 
     * @return TrainNumber Fleet number
     */
    public String getTrainNumber() {
        return this.TrainNumber;
    }

    /**
     * Set Fleet number
     * @param TrainNumber Fleet number
     */
    public void setTrainNumber(String TrainNumber) {
        this.TrainNumber = TrainNumber;
    }

    public BusInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BusInvoice(BusInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.PlaceGetOn != null) {
            this.PlaceGetOn = new String(source.PlaceGetOn);
        }
        if (source.GateNumber != null) {
            this.GateNumber = new String(source.GateNumber);
        }
        if (source.TicketType != null) {
            this.TicketType = new String(source.TicketType);
        }
        if (source.VehicleType != null) {
            this.VehicleType = new String(source.VehicleType);
        }
        if (source.SeatNumber != null) {
            this.SeatNumber = new String(source.SeatNumber);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "PlaceGetOn", this.PlaceGetOn);
        this.setParamSimple(map, prefix + "GateNumber", this.GateNumber);
        this.setParamSimple(map, prefix + "TicketType", this.TicketType);
        this.setParamSimple(map, prefix + "VehicleType", this.VehicleType);
        this.setParamSimple(map, prefix + "SeatNumber", this.SeatNumber);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);

    }
}

