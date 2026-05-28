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

public class TaxiTicket extends AbstractModel {

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
    * Date of issue
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Start time
    */
    @SerializedName("TimeGetOn")
    @Expose
    private String TimeGetOn;

    /**
    * End time
    */
    @SerializedName("TimeGetOff")
    @Expose
    private String TimeGetOff;

    /**
    * Unit price
    */
    @SerializedName("Price")
    @Expose
    private String Price;

    /**
    * Distance
    */
    @SerializedName("Mileage")
    @Expose
    private String Mileage;

    /**
    * Total amount
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Invoice place
    */
    @SerializedName("Place")
    @Expose
    private String Place;

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
    * Invoice type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * License plate number
    */
    @SerializedName("LicensePlate")
    @Expose
    private String LicensePlate;

    /**
    * Fuel surcharge
    */
    @SerializedName("FuelFee")
    @Expose
    private String FuelFee;

    /**
    * Booking fee
    */
    @SerializedName("BookingCallFee")
    @Expose
    private String BookingCallFee;

    /**
    * Whether there is a company seal (0: No, 1: Yes)
    */
    @SerializedName("CompanySealMark")
    @Expose
    private Long CompanySealMark;

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
     * Get Start time 
     * @return TimeGetOn Start time
     */
    public String getTimeGetOn() {
        return this.TimeGetOn;
    }

    /**
     * Set Start time
     * @param TimeGetOn Start time
     */
    public void setTimeGetOn(String TimeGetOn) {
        this.TimeGetOn = TimeGetOn;
    }

    /**
     * Get End time 
     * @return TimeGetOff End time
     */
    public String getTimeGetOff() {
        return this.TimeGetOff;
    }

    /**
     * Set End time
     * @param TimeGetOff End time
     */
    public void setTimeGetOff(String TimeGetOff) {
        this.TimeGetOff = TimeGetOff;
    }

    /**
     * Get Unit price 
     * @return Price Unit price
     */
    public String getPrice() {
        return this.Price;
    }

    /**
     * Set Unit price
     * @param Price Unit price
     */
    public void setPrice(String Price) {
        this.Price = Price;
    }

    /**
     * Get Distance 
     * @return Mileage Distance
     */
    public String getMileage() {
        return this.Mileage;
    }

    /**
     * Set Distance
     * @param Mileage Distance
     */
    public void setMileage(String Mileage) {
        this.Mileage = Mileage;
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
     * Get Invoice place 
     * @return Place Invoice place
     */
    public String getPlace() {
        return this.Place;
    }

    /**
     * Set Invoice place
     * @param Place Invoice place
     */
    public void setPlace(String Place) {
        this.Place = Place;
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
     * Get License plate number 
     * @return LicensePlate License plate number
     */
    public String getLicensePlate() {
        return this.LicensePlate;
    }

    /**
     * Set License plate number
     * @param LicensePlate License plate number
     */
    public void setLicensePlate(String LicensePlate) {
        this.LicensePlate = LicensePlate;
    }

    /**
     * Get Fuel surcharge 
     * @return FuelFee Fuel surcharge
     */
    public String getFuelFee() {
        return this.FuelFee;
    }

    /**
     * Set Fuel surcharge
     * @param FuelFee Fuel surcharge
     */
    public void setFuelFee(String FuelFee) {
        this.FuelFee = FuelFee;
    }

    /**
     * Get Booking fee 
     * @return BookingCallFee Booking fee
     */
    public String getBookingCallFee() {
        return this.BookingCallFee;
    }

    /**
     * Set Booking fee
     * @param BookingCallFee Booking fee
     */
    public void setBookingCallFee(String BookingCallFee) {
        this.BookingCallFee = BookingCallFee;
    }

    /**
     * Get Whether there is a company seal (0: No, 1: Yes) 
     * @return CompanySealMark Whether there is a company seal (0: No, 1: Yes)
     */
    public Long getCompanySealMark() {
        return this.CompanySealMark;
    }

    /**
     * Set Whether there is a company seal (0: No, 1: Yes)
     * @param CompanySealMark Whether there is a company seal (0: No, 1: Yes)
     */
    public void setCompanySealMark(Long CompanySealMark) {
        this.CompanySealMark = CompanySealMark;
    }

    public TaxiTicket() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaxiTicket(TaxiTicket source) {
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
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.TimeGetOn != null) {
            this.TimeGetOn = new String(source.TimeGetOn);
        }
        if (source.TimeGetOff != null) {
            this.TimeGetOff = new String(source.TimeGetOff);
        }
        if (source.Price != null) {
            this.Price = new String(source.Price);
        }
        if (source.Mileage != null) {
            this.Mileage = new String(source.Mileage);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.Place != null) {
            this.Place = new String(source.Place);
        }
        if (source.Province != null) {
            this.Province = new String(source.Province);
        }
        if (source.City != null) {
            this.City = new String(source.City);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.LicensePlate != null) {
            this.LicensePlate = new String(source.LicensePlate);
        }
        if (source.FuelFee != null) {
            this.FuelFee = new String(source.FuelFee);
        }
        if (source.BookingCallFee != null) {
            this.BookingCallFee = new String(source.BookingCallFee);
        }
        if (source.CompanySealMark != null) {
            this.CompanySealMark = new Long(source.CompanySealMark);
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
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "TimeGetOn", this.TimeGetOn);
        this.setParamSimple(map, prefix + "TimeGetOff", this.TimeGetOff);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "Mileage", this.Mileage);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Place", this.Place);
        this.setParamSimple(map, prefix + "Province", this.Province);
        this.setParamSimple(map, prefix + "City", this.City);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "LicensePlate", this.LicensePlate);
        this.setParamSimple(map, prefix + "FuelFee", this.FuelFee);
        this.setParamSimple(map, prefix + "BookingCallFee", this.BookingCallFee);
        this.setParamSimple(map, prefix + "CompanySealMark", this.CompanySealMark);

    }
}

