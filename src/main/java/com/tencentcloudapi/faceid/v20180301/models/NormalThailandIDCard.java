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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NormalThailandIDCard extends AbstractModel {

    /**
    * LicenseNumber
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Thailand name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Last name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Issued date
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Registration number 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Religion
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * Birthday in Thai
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThaiBirthday")
    @Expose
    private String ThaiBirthday;

    /**
    * Expiration date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThaiExpirationDate")
    @Expose
    private String ThaiExpirationDate;

    /**
    * Issued date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ThaiIssueDate")
    @Expose
    private String ThaiIssueDate;

    /**
     * Get LicenseNumber
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber LicenseNumber
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set LicenseNumber
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber LicenseNumber
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Thailand name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Thailand name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Thailand name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Thailand name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Last name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LastName Last name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LastName Last name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get First name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FirstName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set First name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Birthday
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Address
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormattedAddress Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormattedAddress Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get Expiration date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpirationDate Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpirationDate Expiration date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get Issued date
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate Issued date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Issued date
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate Issued date
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Registration number 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistrationNumber Registration number 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration number 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistrationNumber Registration number 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Religion
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Religion Religion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set Religion
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Religion Religion
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get Birthday in Thai
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThaiBirthday Birthday in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getThaiBirthday() {
        return this.ThaiBirthday;
    }

    /**
     * Set Birthday in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThaiBirthday Birthday in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThaiBirthday(String ThaiBirthday) {
        this.ThaiBirthday = ThaiBirthday;
    }

    /**
     * Get Expiration date in Thai
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThaiExpirationDate Expiration date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getThaiExpirationDate() {
        return this.ThaiExpirationDate;
    }

    /**
     * Set Expiration date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThaiExpirationDate Expiration date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThaiExpirationDate(String ThaiExpirationDate) {
        this.ThaiExpirationDate = ThaiExpirationDate;
    }

    /**
     * Get Issued date in Thai
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ThaiIssueDate Issued date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getThaiIssueDate() {
        return this.ThaiIssueDate;
    }

    /**
     * Set Issued date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ThaiIssueDate Issued date in Thai
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setThaiIssueDate(String ThaiIssueDate) {
        this.ThaiIssueDate = ThaiIssueDate;
    }

    public NormalThailandIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalThailandIDCard(NormalThailandIDCard source) {
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.FormattedAddress != null) {
            this.FormattedAddress = new String(source.FormattedAddress);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
        if (source.Religion != null) {
            this.Religion = new String(source.Religion);
        }
        if (source.ThaiBirthday != null) {
            this.ThaiBirthday = new String(source.ThaiBirthday);
        }
        if (source.ThaiExpirationDate != null) {
            this.ThaiExpirationDate = new String(source.ThaiExpirationDate);
        }
        if (source.ThaiIssueDate != null) {
            this.ThaiIssueDate = new String(source.ThaiIssueDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);
        this.setParamSimple(map, prefix + "Religion", this.Religion);
        this.setParamSimple(map, prefix + "ThaiBirthday", this.ThaiBirthday);
        this.setParamSimple(map, prefix + "ThaiExpirationDate", this.ThaiExpirationDate);
        this.setParamSimple(map, prefix + "ThaiIssueDate", this.ThaiIssueDate);

    }
}

