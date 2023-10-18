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

public class ShippingInvoice extends AbstractModel {

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
    * Invoice code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Invoice number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Name
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

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
    * Invoice type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

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
    * Currency
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

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
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Time 
     * @return Time Time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time
     * @param Time Time
     */
    public void setTime(String Time) {
        this.Time = Time;
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
     * Get Currency 
     * @return CurrencyCode Currency
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * Set Currency
     * @param CurrencyCode Currency
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    public ShippingInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShippingInvoice(ShippingInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
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
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.CurrencyCode != null) {
            this.CurrencyCode = new String(source.CurrencyCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "StationGetOn", this.StationGetOn);
        this.setParamSimple(map, prefix + "StationGetOff", this.StationGetOff);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);

    }
}

