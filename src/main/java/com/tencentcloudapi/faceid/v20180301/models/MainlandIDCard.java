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
    * <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * <p>Birthday</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Authority")
    @Expose
    private String Authority;

    /**
    * <p>Validity period</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
     * Get <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName <p>name</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex <p>Gender</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nation <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nation <p>Ethnicity</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
    }

    /**
     * Get <p>Birthday</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday <p>Birthday</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set <p>Birthday</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday <p>Birthday</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseNumber <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseNumber <p>Identity card number</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FormattedAddress <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFormattedAddress() {
        return this.FormattedAddress;
    }

    /**
     * Set <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FormattedAddress <p>Address</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFormattedAddress(String FormattedAddress) {
        this.FormattedAddress = FormattedAddress;
    }

    /**
     * Get <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Authority <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAuthority() {
        return this.Authority;
    }

    /**
     * Set <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Authority <p>Issuing authority</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    /**
     * Get <p>Validity period</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ValidDate <p>Validity period</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set <p>Validity period</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ValidDate <p>Validity period</p>
Note: This field may return null, indicating that no valid values can be obtained.
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

