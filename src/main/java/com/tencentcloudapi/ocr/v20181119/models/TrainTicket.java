/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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

public class TrainTicket extends AbstractModel {

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Invoice number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

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
    * Passenger's name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

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
    * Seat class
    */
    @SerializedName("Seat")
    @Expose
    private String Seat;

    /**
    * Total amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Invoice type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Serial number
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * ID card number
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * Check-in gate
    */
    @SerializedName("GateNumber")
    @Expose
    private String GateNumber;

    /**
    * Fleet number
    */
    @SerializedName("TrainNumber")
    @Expose
    private String TrainNumber;

    /**
    * Handling fee
    */
    @SerializedName("HandlingFee")
    @Expose
    private String HandlingFee;

    /**
    * Original ticket price
    */
    @SerializedName("OriginalFare")
    @Expose
    private String OriginalFare;

    /**
    * Total amount (in words)
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * Seat No.
    */
    @SerializedName("SeatNumber")
    @Expose
    private String SeatNumber;

    /**
    * Ticket pickup address
    */
    @SerializedName("PickUpAddress")
    @Expose
    private String PickUpAddress;

    /**
    * Ticket change information
    */
    @SerializedName("TicketChange")
    @Expose
    private String TicketChange;

    /**
    * Additional fare
    */
    @SerializedName("AdditionalFare")
    @Expose
    private String AdditionalFare;

    /**
    * Receipt No.
    */
    @SerializedName("ReceiptNumber")
    @Expose
    private String ReceiptNumber;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Whether it is for reimbursement only (0: No, 1: Yes)
    */
    @SerializedName("ReimburseOnlyMark")
    @Expose
    private Long ReimburseOnlyMark;

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
     * Get Passenger's name 
     * @return Name Passenger's name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Passenger's name
     * @param Name Passenger's name
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Seat class 
     * @return Seat Seat class
     */
    public String getSeat() {
        return this.Seat;
    }

    /**
     * Set Seat class
     * @param Seat Seat class
     */
    public void setSeat(String Seat) {
        this.Seat = Seat;
    }

    /**
     * Get Total amount 
     * @return Total Total amount
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Total amount
     * @param Total Total amount
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Invoice type 
     * @return Kind Invoice type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Invoice type
     * @param Kind Invoice type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Serial number 
     * @return SerialNumber Serial number
     */
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    /**
     * Set Serial number
     * @param SerialNumber Serial number
     */
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
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

    /**
     * Get Handling fee 
     * @return HandlingFee Handling fee
     */
    public String getHandlingFee() {
        return this.HandlingFee;
    }

    /**
     * Set Handling fee
     * @param HandlingFee Handling fee
     */
    public void setHandlingFee(String HandlingFee) {
        this.HandlingFee = HandlingFee;
    }

    /**
     * Get Original ticket price 
     * @return OriginalFare Original ticket price
     */
    public String getOriginalFare() {
        return this.OriginalFare;
    }

    /**
     * Set Original ticket price
     * @param OriginalFare Original ticket price
     */
    public void setOriginalFare(String OriginalFare) {
        this.OriginalFare = OriginalFare;
    }

    /**
     * Get Total amount (in words) 
     * @return TotalCn Total amount (in words)
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set Total amount (in words)
     * @param TotalCn Total amount (in words)
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
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
     * Get Ticket pickup address 
     * @return PickUpAddress Ticket pickup address
     */
    public String getPickUpAddress() {
        return this.PickUpAddress;
    }

    /**
     * Set Ticket pickup address
     * @param PickUpAddress Ticket pickup address
     */
    public void setPickUpAddress(String PickUpAddress) {
        this.PickUpAddress = PickUpAddress;
    }

    /**
     * Get Ticket change information 
     * @return TicketChange Ticket change information
     */
    public String getTicketChange() {
        return this.TicketChange;
    }

    /**
     * Set Ticket change information
     * @param TicketChange Ticket change information
     */
    public void setTicketChange(String TicketChange) {
        this.TicketChange = TicketChange;
    }

    /**
     * Get Additional fare 
     * @return AdditionalFare Additional fare
     */
    public String getAdditionalFare() {
        return this.AdditionalFare;
    }

    /**
     * Set Additional fare
     * @param AdditionalFare Additional fare
     */
    public void setAdditionalFare(String AdditionalFare) {
        this.AdditionalFare = AdditionalFare;
    }

    /**
     * Get Receipt No. 
     * @return ReceiptNumber Receipt No.
     */
    public String getReceiptNumber() {
        return this.ReceiptNumber;
    }

    /**
     * Set Receipt No.
     * @param ReceiptNumber Receipt No.
     */
    public void setReceiptNumber(String ReceiptNumber) {
        this.ReceiptNumber = ReceiptNumber;
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
     * Get Whether it is for reimbursement only (0: No, 1: Yes) 
     * @return ReimburseOnlyMark Whether it is for reimbursement only (0: No, 1: Yes)
     */
    public Long getReimburseOnlyMark() {
        return this.ReimburseOnlyMark;
    }

    /**
     * Set Whether it is for reimbursement only (0: No, 1: Yes)
     * @param ReimburseOnlyMark Whether it is for reimbursement only (0: No, 1: Yes)
     */
    public void setReimburseOnlyMark(Long ReimburseOnlyMark) {
        this.ReimburseOnlyMark = ReimburseOnlyMark;
    }

    public TrainTicket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrainTicket(TrainTicket source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.DateGetOn != null) {
            this.DateGetOn = new String(source.DateGetOn);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.StationGetOn != null) {
            this.StationGetOn = new String(source.StationGetOn);
        }
        if (source.StationGetOff != null) {
            this.StationGetOff = new String(source.StationGetOff);
        }
        if (source.Seat != null) {
            this.Seat = new String(source.Seat);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.GateNumber != null) {
            this.GateNumber = new String(source.GateNumber);
        }
        if (source.TrainNumber != null) {
            this.TrainNumber = new String(source.TrainNumber);
        }
        if (source.HandlingFee != null) {
            this.HandlingFee = new String(source.HandlingFee);
        }
        if (source.OriginalFare != null) {
            this.OriginalFare = new String(source.OriginalFare);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.SeatNumber != null) {
            this.SeatNumber = new String(source.SeatNumber);
        }
        if (source.PickUpAddress != null) {
            this.PickUpAddress = new String(source.PickUpAddress);
        }
        if (source.TicketChange != null) {
            this.TicketChange = new String(source.TicketChange);
        }
        if (source.AdditionalFare != null) {
            this.AdditionalFare = new String(source.AdditionalFare);
        }
        if (source.ReceiptNumber != null) {
            this.ReceiptNumber = new String(source.ReceiptNumber);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.ReimburseOnlyMark != null) {
            this.ReimburseOnlyMark = new Long(source.ReimburseOnlyMark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "DateGetOn", this.DateGetOn);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Seat", this.Seat);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "GateNumber", this.GateNumber);
        this.setParamSimple(map, prefix + "TrainNumber", this.TrainNumber);
        this.setParamSimple(map, prefix + "HandlingFee", this.HandlingFee);
        this.setParamSimple(map, prefix + "OriginalFare", this.OriginalFare);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "SeatNumber", this.SeatNumber);
        this.setParamSimple(map, prefix + "PickUpAddress", this.PickUpAddress);
        this.setParamSimple(map, prefix + "TicketChange", this.TicketChange);
        this.setParamSimple(map, prefix + "AdditionalFare", this.AdditionalFare);
        this.setParamSimple(map, prefix + "ReceiptNumber", this.ReceiptNumber);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "ReimburseOnlyMark", this.ReimburseOnlyMark);

    }
}

