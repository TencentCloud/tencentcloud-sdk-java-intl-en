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

public class RecognizePhilippinesDrivingLicenseOCRResponse extends AbstractModel {

    /**
    * The Base64-encoded identity photo.
    */
    @SerializedName("HeadPortrait")
    @Expose
    private TextDetectionResult HeadPortrait;

    /**
    * The full name.
    */
    @SerializedName("Name")
    @Expose
    private TextDetectionResult Name;

    /**
    * The last name.
    */
    @SerializedName("LastName")
    @Expose
    private TextDetectionResult LastName;

    /**
    * The first name.
    */
    @SerializedName("FirstName")
    @Expose
    private TextDetectionResult FirstName;

    /**
    * The middle name.
    */
    @SerializedName("MiddleName")
    @Expose
    private TextDetectionResult MiddleName;

    /**
    * The nationality.
    */
    @SerializedName("Nationality")
    @Expose
    private TextDetectionResult Nationality;

    /**
    * The gender.
    */
    @SerializedName("Sex")
    @Expose
    private TextDetectionResult Sex;

    /**
    * The address.
    */
    @SerializedName("Address")
    @Expose
    private TextDetectionResult Address;

    /**
    * The license No.
    */
    @SerializedName("LicenseNo")
    @Expose
    private TextDetectionResult LicenseNo;

    /**
    * The expiration date.
    */
    @SerializedName("ExpiresDate")
    @Expose
    private TextDetectionResult ExpiresDate;

    /**
    * The agency code.
    */
    @SerializedName("AgencyCode")
    @Expose
    private TextDetectionResult AgencyCode;

    /**
    * The date of birth.
    */
    @SerializedName("Birthday")
    @Expose
    private TextDetectionResult Birthday;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The Base64-encoded identity photo. 
     * @return HeadPortrait The Base64-encoded identity photo.
     */
    public TextDetectionResult getHeadPortrait() {
        return this.HeadPortrait;
    }

    /**
     * Set The Base64-encoded identity photo.
     * @param HeadPortrait The Base64-encoded identity photo.
     */
    public void setHeadPortrait(TextDetectionResult HeadPortrait) {
        this.HeadPortrait = HeadPortrait;
    }

    /**
     * Get The full name. 
     * @return Name The full name.
     */
    public TextDetectionResult getName() {
        return this.Name;
    }

    /**
     * Set The full name.
     * @param Name The full name.
     */
    public void setName(TextDetectionResult Name) {
        this.Name = Name;
    }

    /**
     * Get The last name. 
     * @return LastName The last name.
     */
    public TextDetectionResult getLastName() {
        return this.LastName;
    }

    /**
     * Set The last name.
     * @param LastName The last name.
     */
    public void setLastName(TextDetectionResult LastName) {
        this.LastName = LastName;
    }

    /**
     * Get The first name. 
     * @return FirstName The first name.
     */
    public TextDetectionResult getFirstName() {
        return this.FirstName;
    }

    /**
     * Set The first name.
     * @param FirstName The first name.
     */
    public void setFirstName(TextDetectionResult FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get The middle name. 
     * @return MiddleName The middle name.
     */
    public TextDetectionResult getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set The middle name.
     * @param MiddleName The middle name.
     */
    public void setMiddleName(TextDetectionResult MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get The nationality. 
     * @return Nationality The nationality.
     */
    public TextDetectionResult getNationality() {
        return this.Nationality;
    }

    /**
     * Set The nationality.
     * @param Nationality The nationality.
     */
    public void setNationality(TextDetectionResult Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get The gender. 
     * @return Sex The gender.
     */
    public TextDetectionResult getSex() {
        return this.Sex;
    }

    /**
     * Set The gender.
     * @param Sex The gender.
     */
    public void setSex(TextDetectionResult Sex) {
        this.Sex = Sex;
    }

    /**
     * Get The address. 
     * @return Address The address.
     */
    public TextDetectionResult getAddress() {
        return this.Address;
    }

    /**
     * Set The address.
     * @param Address The address.
     */
    public void setAddress(TextDetectionResult Address) {
        this.Address = Address;
    }

    /**
     * Get The license No. 
     * @return LicenseNo The license No.
     */
    public TextDetectionResult getLicenseNo() {
        return this.LicenseNo;
    }

    /**
     * Set The license No.
     * @param LicenseNo The license No.
     */
    public void setLicenseNo(TextDetectionResult LicenseNo) {
        this.LicenseNo = LicenseNo;
    }

    /**
     * Get The expiration date. 
     * @return ExpiresDate The expiration date.
     */
    public TextDetectionResult getExpiresDate() {
        return this.ExpiresDate;
    }

    /**
     * Set The expiration date.
     * @param ExpiresDate The expiration date.
     */
    public void setExpiresDate(TextDetectionResult ExpiresDate) {
        this.ExpiresDate = ExpiresDate;
    }

    /**
     * Get The agency code. 
     * @return AgencyCode The agency code.
     */
    public TextDetectionResult getAgencyCode() {
        return this.AgencyCode;
    }

    /**
     * Set The agency code.
     * @param AgencyCode The agency code.
     */
    public void setAgencyCode(TextDetectionResult AgencyCode) {
        this.AgencyCode = AgencyCode;
    }

    /**
     * Get The date of birth. 
     * @return Birthday The date of birth.
     */
    public TextDetectionResult getBirthday() {
        return this.Birthday;
    }

    /**
     * Set The date of birth.
     * @param Birthday The date of birth.
     */
    public void setBirthday(TextDetectionResult Birthday) {
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

    public RecognizePhilippinesDrivingLicenseOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizePhilippinesDrivingLicenseOCRResponse(RecognizePhilippinesDrivingLicenseOCRResponse source) {
        if (source.HeadPortrait != null) {
            this.HeadPortrait = new TextDetectionResult(source.HeadPortrait);
        }
        if (source.Name != null) {
            this.Name = new TextDetectionResult(source.Name);
        }
        if (source.LastName != null) {
            this.LastName = new TextDetectionResult(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new TextDetectionResult(source.FirstName);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new TextDetectionResult(source.MiddleName);
        }
        if (source.Nationality != null) {
            this.Nationality = new TextDetectionResult(source.Nationality);
        }
        if (source.Sex != null) {
            this.Sex = new TextDetectionResult(source.Sex);
        }
        if (source.Address != null) {
            this.Address = new TextDetectionResult(source.Address);
        }
        if (source.LicenseNo != null) {
            this.LicenseNo = new TextDetectionResult(source.LicenseNo);
        }
        if (source.ExpiresDate != null) {
            this.ExpiresDate = new TextDetectionResult(source.ExpiresDate);
        }
        if (source.AgencyCode != null) {
            this.AgencyCode = new TextDetectionResult(source.AgencyCode);
        }
        if (source.Birthday != null) {
            this.Birthday = new TextDetectionResult(source.Birthday);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadPortrait.", this.HeadPortrait);
        this.setParamObj(map, prefix + "Name.", this.Name);
        this.setParamObj(map, prefix + "LastName.", this.LastName);
        this.setParamObj(map, prefix + "FirstName.", this.FirstName);
        this.setParamObj(map, prefix + "MiddleName.", this.MiddleName);
        this.setParamObj(map, prefix + "Nationality.", this.Nationality);
        this.setParamObj(map, prefix + "Sex.", this.Sex);
        this.setParamObj(map, prefix + "Address.", this.Address);
        this.setParamObj(map, prefix + "LicenseNo.", this.LicenseNo);
        this.setParamObj(map, prefix + "ExpiresDate.", this.ExpiresDate);
        this.setParamObj(map, prefix + "AgencyCode.", this.AgencyCode);
        this.setParamObj(map, prefix + "Birthday.", this.Birthday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

