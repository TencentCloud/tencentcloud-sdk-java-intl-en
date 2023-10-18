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

public class AirTransport extends AbstractModel {

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * E-ticket No.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Check code
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * Serial number
    */
    @SerializedName("SerialNumber")
    @Expose
    private String SerialNumber;

    /**
    * Date of issue
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Agent code
    */
    @SerializedName("AgentCode")
    @Expose
    private String AgentCode;

    /**
    * First line of the agent code
    */
    @SerializedName("AgentCodeFirst")
    @Expose
    private String AgentCodeFirst;

    /**
    * Second line of the agent code
    */
    @SerializedName("AgentCodeSecond")
    @Expose
    private String AgentCodeSecond;

    /**
    * Name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * ID card number
    */
    @SerializedName("UserID")
    @Expose
    private String UserID;

    /**
    * Issuer
    */
    @SerializedName("Issuer")
    @Expose
    private String Issuer;

    /**
    * Fare
    */
    @SerializedName("Fare")
    @Expose
    private String Fare;

    /**
    * Tax
    */
    @SerializedName("Tax")
    @Expose
    private String Tax;

    /**
    * Fuel surcharge
    */
    @SerializedName("FuelSurcharge")
    @Expose
    private String FuelSurcharge;

    /**
    * Aviation Development Fund
    */
    @SerializedName("AirDevelopmentFund")
    @Expose
    private String AirDevelopmentFund;

    /**
    * Insurance
    */
    @SerializedName("Insurance")
    @Expose
    private String Insurance;

    /**
    * Total amount (in figures)
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
    * Domestic or international tag
    */
    @SerializedName("DomesticInternationalTag")
    @Expose
    private String DomesticInternationalTag;

    /**
    * Not-valid-before date
    */
    @SerializedName("DateStart")
    @Expose
    private String DateStart;

    /**
    * Not-valid-after date
    */
    @SerializedName("DateEnd")
    @Expose
    private String DateEnd;

    /**
    * Endorsements/Restrictions
    */
    @SerializedName("Endorsement")
    @Expose
    private String Endorsement;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
    * Items
    */
    @SerializedName("FlightItems")
    @Expose
    private FlightItem [] FlightItems;

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
     * Get E-ticket No. 
     * @return Number E-ticket No.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set E-ticket No.
     * @param Number E-ticket No.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Check code 
     * @return CheckCode Check code
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set Check code
     * @param CheckCode Check code
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
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
     * Get Agent code 
     * @return AgentCode Agent code
     */
    public String getAgentCode() {
        return this.AgentCode;
    }

    /**
     * Set Agent code
     * @param AgentCode Agent code
     */
    public void setAgentCode(String AgentCode) {
        this.AgentCode = AgentCode;
    }

    /**
     * Get First line of the agent code 
     * @return AgentCodeFirst First line of the agent code
     */
    public String getAgentCodeFirst() {
        return this.AgentCodeFirst;
    }

    /**
     * Set First line of the agent code
     * @param AgentCodeFirst First line of the agent code
     */
    public void setAgentCodeFirst(String AgentCodeFirst) {
        this.AgentCodeFirst = AgentCodeFirst;
    }

    /**
     * Get Second line of the agent code 
     * @return AgentCodeSecond Second line of the agent code
     */
    public String getAgentCodeSecond() {
        return this.AgentCodeSecond;
    }

    /**
     * Set Second line of the agent code
     * @param AgentCodeSecond Second line of the agent code
     */
    public void setAgentCodeSecond(String AgentCodeSecond) {
        this.AgentCodeSecond = AgentCodeSecond;
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
     * Get Issuer 
     * @return Issuer Issuer
     */
    public String getIssuer() {
        return this.Issuer;
    }

    /**
     * Set Issuer
     * @param Issuer Issuer
     */
    public void setIssuer(String Issuer) {
        this.Issuer = Issuer;
    }

    /**
     * Get Fare 
     * @return Fare Fare
     */
    public String getFare() {
        return this.Fare;
    }

    /**
     * Set Fare
     * @param Fare Fare
     */
    public void setFare(String Fare) {
        this.Fare = Fare;
    }

    /**
     * Get Tax 
     * @return Tax Tax
     */
    public String getTax() {
        return this.Tax;
    }

    /**
     * Set Tax
     * @param Tax Tax
     */
    public void setTax(String Tax) {
        this.Tax = Tax;
    }

    /**
     * Get Fuel surcharge 
     * @return FuelSurcharge Fuel surcharge
     */
    public String getFuelSurcharge() {
        return this.FuelSurcharge;
    }

    /**
     * Set Fuel surcharge
     * @param FuelSurcharge Fuel surcharge
     */
    public void setFuelSurcharge(String FuelSurcharge) {
        this.FuelSurcharge = FuelSurcharge;
    }

    /**
     * Get Aviation Development Fund 
     * @return AirDevelopmentFund Aviation Development Fund
     */
    public String getAirDevelopmentFund() {
        return this.AirDevelopmentFund;
    }

    /**
     * Set Aviation Development Fund
     * @param AirDevelopmentFund Aviation Development Fund
     */
    public void setAirDevelopmentFund(String AirDevelopmentFund) {
        this.AirDevelopmentFund = AirDevelopmentFund;
    }

    /**
     * Get Insurance 
     * @return Insurance Insurance
     */
    public String getInsurance() {
        return this.Insurance;
    }

    /**
     * Set Insurance
     * @param Insurance Insurance
     */
    public void setInsurance(String Insurance) {
        this.Insurance = Insurance;
    }

    /**
     * Get Total amount (in figures) 
     * @return Total Total amount (in figures)
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Total amount (in figures)
     * @param Total Total amount (in figures)
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
     * Get Domestic or international tag 
     * @return DomesticInternationalTag Domestic or international tag
     */
    public String getDomesticInternationalTag() {
        return this.DomesticInternationalTag;
    }

    /**
     * Set Domestic or international tag
     * @param DomesticInternationalTag Domestic or international tag
     */
    public void setDomesticInternationalTag(String DomesticInternationalTag) {
        this.DomesticInternationalTag = DomesticInternationalTag;
    }

    /**
     * Get Not-valid-before date 
     * @return DateStart Not-valid-before date
     */
    public String getDateStart() {
        return this.DateStart;
    }

    /**
     * Set Not-valid-before date
     * @param DateStart Not-valid-before date
     */
    public void setDateStart(String DateStart) {
        this.DateStart = DateStart;
    }

    /**
     * Get Not-valid-after date 
     * @return DateEnd Not-valid-after date
     */
    public String getDateEnd() {
        return this.DateEnd;
    }

    /**
     * Set Not-valid-after date
     * @param DateEnd Not-valid-after date
     */
    public void setDateEnd(String DateEnd) {
        this.DateEnd = DateEnd;
    }

    /**
     * Get Endorsements/Restrictions 
     * @return Endorsement Endorsements/Restrictions
     */
    public String getEndorsement() {
        return this.Endorsement;
    }

    /**
     * Set Endorsements/Restrictions
     * @param Endorsement Endorsements/Restrictions
     */
    public void setEndorsement(String Endorsement) {
        this.Endorsement = Endorsement;
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
     * Get Items 
     * @return FlightItems Items
     */
    public FlightItem [] getFlightItems() {
        return this.FlightItems;
    }

    /**
     * Set Items
     * @param FlightItems Items
     */
    public void setFlightItems(FlightItem [] FlightItems) {
        this.FlightItems = FlightItems;
    }

    public AirTransport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AirTransport(AirTransport source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.SerialNumber != null) {
            this.SerialNumber = new String(source.SerialNumber);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.AgentCode != null) {
            this.AgentCode = new String(source.AgentCode);
        }
        if (source.AgentCodeFirst != null) {
            this.AgentCodeFirst = new String(source.AgentCodeFirst);
        }
        if (source.AgentCodeSecond != null) {
            this.AgentCodeSecond = new String(source.AgentCodeSecond);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UserID != null) {
            this.UserID = new String(source.UserID);
        }
        if (source.Issuer != null) {
            this.Issuer = new String(source.Issuer);
        }
        if (source.Fare != null) {
            this.Fare = new String(source.Fare);
        }
        if (source.Tax != null) {
            this.Tax = new String(source.Tax);
        }
        if (source.FuelSurcharge != null) {
            this.FuelSurcharge = new String(source.FuelSurcharge);
        }
        if (source.AirDevelopmentFund != null) {
            this.AirDevelopmentFund = new String(source.AirDevelopmentFund);
        }
        if (source.Insurance != null) {
            this.Insurance = new String(source.Insurance);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.DomesticInternationalTag != null) {
            this.DomesticInternationalTag = new String(source.DomesticInternationalTag);
        }
        if (source.DateStart != null) {
            this.DateStart = new String(source.DateStart);
        }
        if (source.DateEnd != null) {
            this.DateEnd = new String(source.DateEnd);
        }
        if (source.Endorsement != null) {
            this.Endorsement = new String(source.Endorsement);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.FlightItems != null) {
            this.FlightItems = new FlightItem[source.FlightItems.length];
            for (int i = 0; i < source.FlightItems.length; i++) {
                this.FlightItems[i] = new FlightItem(source.FlightItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "SerialNumber", this.SerialNumber);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "AgentCode", this.AgentCode);
        this.setParamSimple(map, prefix + "AgentCodeFirst", this.AgentCodeFirst);
        this.setParamSimple(map, prefix + "AgentCodeSecond", this.AgentCodeSecond);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UserID", this.UserID);
        this.setParamSimple(map, prefix + "Issuer", this.Issuer);
        this.setParamSimple(map, prefix + "Fare", this.Fare);
        this.setParamSimple(map, prefix + "Tax", this.Tax);
        this.setParamSimple(map, prefix + "FuelSurcharge", this.FuelSurcharge);
        this.setParamSimple(map, prefix + "AirDevelopmentFund", this.AirDevelopmentFund);
        this.setParamSimple(map, prefix + "Insurance", this.Insurance);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "DomesticInternationalTag", this.DomesticInternationalTag);
        this.setParamSimple(map, prefix + "DateStart", this.DateStart);
        this.setParamSimple(map, prefix + "DateEnd", this.DateEnd);
        this.setParamSimple(map, prefix + "Endorsement", this.Endorsement);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamArrayObj(map, prefix + "FlightItems.", this.FlightItems);

    }
}

