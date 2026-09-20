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
    * Identity number
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Thai name
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * English name
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * English name
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * English birth date
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * Expiration date
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * English birth date
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Serial number
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Religious belief
    */
    @SerializedName("Religion")
    @Expose
    private String Religion;

    /**
    * Date of birth in Thai
    */
    @SerializedName("ThaiBirthday")
    @Expose
    private String ThaiBirthday;

    /**
    * Expiration date in Thai
    */
    @SerializedName("ThaiExpirationDate")
    @Expose
    private String ThaiExpirationDate;

    /**
    * Date of issue in Thai
    */
    @SerializedName("ThaiIssueDate")
    @Expose
    private String ThaiIssueDate;

    /**
     * Get Identity number 
     * @return LicenseNumber Identity number
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Identity number
     * @param LicenseNumber Identity number
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Thai name 
     * @return FullName Thai name
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Thai name
     * @param FullName Thai name
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get English name 
     * @return LastName English name
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set English name
     * @param LastName English name
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get English name 
     * @return FirstName English name
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set English name
     * @param FirstName English name
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get English birth date 
     * @return Birthday English birth date
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set English birth date
     * @param Birthday English birth date
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Address. 
     * @return FormattedAddress Address.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set Address.
     * @param FormattedAddress Address.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get Expiration date 
     * @return ExpirationDate Expiration date
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration date
     * @param ExpirationDate Expiration date
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    /**
     * Get English birth date 
     * @return IssuedDate English birth date
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set English birth date
     * @param IssuedDate English birth date
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Serial number 
     * @return RegistrationNumber Serial number
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Serial number
     * @param RegistrationNumber Serial number
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Religious belief 
     * @return Religion Religious belief
     */
    public String getReligion() {
        return this.Religion;
    }

    /**
     * Set Religious belief
     * @param Religion Religious belief
     */
    public void setReligion(String Religion) {
        this.Religion = Religion;
    }

    /**
     * Get Date of birth in Thai 
     * @return ThaiBirthday Date of birth in Thai
     */
    public String getThaiBirthday() {
        return this.ThaiBirthday;
    }

    /**
     * Set Date of birth in Thai
     * @param ThaiBirthday Date of birth in Thai
     */
    public void setThaiBirthday(String ThaiBirthday) {
        this.ThaiBirthday = ThaiBirthday;
    }

    /**
     * Get Expiration date in Thai 
     * @return ThaiExpirationDate Expiration date in Thai
     */
    public String getThaiExpirationDate() {
        return this.ThaiExpirationDate;
    }

    /**
     * Set Expiration date in Thai
     * @param ThaiExpirationDate Expiration date in Thai
     */
    public void setThaiExpirationDate(String ThaiExpirationDate) {
        this.ThaiExpirationDate = ThaiExpirationDate;
    }

    /**
     * Get Date of issue in Thai 
     * @return ThaiIssueDate Date of issue in Thai
     */
    public String getThaiIssueDate() {
        return this.ThaiIssueDate;
    }

    /**
     * Set Date of issue in Thai
     * @param ThaiIssueDate Date of issue in Thai
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

