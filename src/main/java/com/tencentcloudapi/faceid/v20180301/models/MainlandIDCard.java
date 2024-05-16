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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MainlandIDCard extends AbstractModel {

    /**
    * Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Sex
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Nation
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

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
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.

    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
     * Get Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
 
     * @return FullName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

     * @param FullName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Sex
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Sex
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Sex
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Sex
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Nation
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Nation Nation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set Nation
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Nation Nation
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
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
     * @return Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get License number
Note: This field may return null, indicating that no valid values can be obtained.
 
     * @return LicenseNumber License number
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set License number
Note: This field may return null, indicating that no valid values can be obtained.

     * @param LicenseNumber License number
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
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

    }
}

