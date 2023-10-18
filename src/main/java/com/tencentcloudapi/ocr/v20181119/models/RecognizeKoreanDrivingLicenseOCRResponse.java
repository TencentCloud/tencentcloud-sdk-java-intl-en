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

public class RecognizeKoreanDrivingLicenseOCRResponse extends AbstractModel {

    /**
    * The ID card number.
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * The license number.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * The resident registration number.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * The license class type.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * The address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * The name.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The renewal period.
    */
    @SerializedName("AptitudeTesDate")
    @Expose
    private String AptitudeTesDate;

    /**
    * The issue date.
    */
    @SerializedName("DateOfIssue")
    @Expose
    private String DateOfIssue;

    /**
    * The Base64-encoded identity photo.
    */
    @SerializedName("Photo")
    @Expose
    private String Photo;

    /**
    * The gender.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * The birth date in the format of dd/mm/yyyy.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The ID card number. 
     * @return ID The ID card number.
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set The ID card number.
     * @param ID The ID card number.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get The license number. 
     * @return LicenseNumber The license number.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set The license number.
     * @param LicenseNumber The license number.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get The resident registration number. 
     * @return Number The resident registration number.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set The resident registration number.
     * @param Number The resident registration number.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get The license class type. 
     * @return Type The license class type.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set The license class type.
     * @param Type The license class type.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get The address. 
     * @return Address The address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set The address.
     * @param Address The address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get The name. 
     * @return Name The name.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name.
     * @param Name The name.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The renewal period. 
     * @return AptitudeTesDate The renewal period.
     */
    public String getAptitudeTesDate() {
        return this.AptitudeTesDate;
    }

    /**
     * Set The renewal period.
     * @param AptitudeTesDate The renewal period.
     */
    public void setAptitudeTesDate(String AptitudeTesDate) {
        this.AptitudeTesDate = AptitudeTesDate;
    }

    /**
     * Get The issue date. 
     * @return DateOfIssue The issue date.
     */
    public String getDateOfIssue() {
        return this.DateOfIssue;
    }

    /**
     * Set The issue date.
     * @param DateOfIssue The issue date.
     */
    public void setDateOfIssue(String DateOfIssue) {
        this.DateOfIssue = DateOfIssue;
    }

    /**
     * Get The Base64-encoded identity photo. 
     * @return Photo The Base64-encoded identity photo.
     */
    public String getPhoto() {
        return this.Photo;
    }

    /**
     * Set The Base64-encoded identity photo.
     * @param Photo The Base64-encoded identity photo.
     */
    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    /**
     * Get The gender. 
     * @return Sex The gender.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set The gender.
     * @param Sex The gender.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get The birth date in the format of dd/mm/yyyy. 
     * @return Birthday The birth date in the format of dd/mm/yyyy.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set The birth date in the format of dd/mm/yyyy.
     * @param Birthday The birth date in the format of dd/mm/yyyy.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public RecognizeKoreanDrivingLicenseOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeKoreanDrivingLicenseOCRResponse(RecognizeKoreanDrivingLicenseOCRResponse source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AptitudeTesDate != null) {
            this.AptitudeTesDate = new String(source.AptitudeTesDate);
        }
        if (source.DateOfIssue != null) {
            this.DateOfIssue = new String(source.DateOfIssue);
        }
        if (source.Photo != null) {
            this.Photo = new String(source.Photo);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AptitudeTesDate", this.AptitudeTesDate);
        this.setParamSimple(map, prefix + "DateOfIssue", this.DateOfIssue);
        this.setParamSimple(map, prefix + "Photo", this.Photo);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

