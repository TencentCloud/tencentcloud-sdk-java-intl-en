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

public class JapanIDCard extends AbstractModel {

    /**
    * Name.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Identity card
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Age
    */
    @SerializedName("Age")
    @Expose
    private String Age;

    /**
    * Birthday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Expiration time.
    */
    @SerializedName("ExpirationDate")
    @Expose
    private String ExpirationDate;

    /**
    * Address.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
     * Get Name. 
     * @return FullName Name.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Name.
     * @param FullName Name.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Identity card 
     * @return LicenseNumber Identity card
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Identity card
     * @param LicenseNumber Identity card
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Age 
     * @return Age Age
     */
    public String getAge() {
        return this.Age;
    }

    /**
     * Set Age
     * @param Age Age
     */
    public void setAge(String Age) {
        this.Age = Age;
    }

    /**
     * Get Birthday 
     * @return Birthday Birthday
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
     * @param Birthday Birthday
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Expiration time. 
     * @return ExpirationDate Expiration time.
     */
    public String getExpirationDate() {
        return this.ExpirationDate;
    }

    /**
     * Set Expiration time.
     * @param ExpirationDate Expiration time.
     */
    public void setExpirationDate(String ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
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

    public JapanIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JapanIDCard(JapanIDCard source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Age != null) {
            this.Age = new String(source.Age);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.ExpirationDate != null) {
            this.ExpirationDate = new String(source.ExpirationDate);
        }
        if (source.FormattedAddress != null) {
            this.FormattedAddress = new String(source.FormattedAddress);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Age", this.Age);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "ExpirationDate", this.ExpirationDate);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);

    }
}

