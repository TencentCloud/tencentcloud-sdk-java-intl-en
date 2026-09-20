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

public class MainlandIDCard extends AbstractModel {

    /**
    * <p>Name</p>
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * <p>Gender</p>
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>Ethnicity</p>
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>Birthday</p>
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>Address</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>Identity card number</p>
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * <p>Address</p>
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * <p>Issuing authority</p>
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * <p>Validity period</p>
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
     * Get <p>Name</p> 
     * @return FullName <p>Name</p>
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set <p>Name</p>
     * @param FullName <p>Name</p>
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get <p>Gender</p> 
     * @return Sex <p>Gender</p>
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>Gender</p>
     * @param Sex <p>Gender</p>
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>Ethnicity</p> 
     * @return Nation <p>Ethnicity</p>
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>Ethnicity</p>
     * @param Nation <p>Ethnicity</p>
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>Birthday</p> 
     * @return Birthday <p>Birthday</p>
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>Birthday</p>
     * @param Birthday <p>Birthday</p>
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>Address</p> 
     * @return Address <p>Address</p>
     * @deprecated
     */
    @Deprecated
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>Address</p>
     * @param Address <p>Address</p>
     * @deprecated
     */
    @Deprecated
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>Identity card number</p> 
     * @return LicenseNumber <p>Identity card number</p>
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set <p>Identity card number</p>
     * @param LicenseNumber <p>Identity card number</p>
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get <p>Address</p> 
     * @return FormattedAddress <p>Address</p>
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set <p>Address</p>
     * @param FormattedAddress <p>Address</p>
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get <p>Issuing authority</p> 
     * @return Authority <p>Issuing authority</p>
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set <p>Issuing authority</p>
     * @param Authority <p>Issuing authority</p>
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get <p>Validity period</p> 
     * @return ValidDate <p>Validity period</p>
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set <p>Validity period</p>
     * @param ValidDate <p>Validity period</p>
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    public MainlandIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MainlandIDCard(MainlandIDCard source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.FormattedAddress != null) {
            this.FormattedAddress = new String(source.FormattedAddress);
        }
        if (source.Authority != null) {
            this.Authority = new String(source.Authority);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);
        this.setParamSimple(map, prefix + "Authority", this.Authority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);

    }
}

