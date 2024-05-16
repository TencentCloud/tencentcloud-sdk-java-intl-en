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

public class NormalMLIDCard extends AbstractModel {

    /**
    * Full Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * License number
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FormattedAddress")
    @Expose
    private String FormattedAddress;

    /**
    * Lisence type
MyKad ID card
MyPR Permanent resident ID card
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD Labor ID card
MyKid Juvenile ID card
Example: MyKad
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Birthday (Currently, this filed only supports IKAD labor ID card and MyKad ID card)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
     * Get Full Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullName Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullName Full Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
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
     * Get Gender
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
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
     * Get Lisence type
MyKad ID card
MyPR Permanent resident ID card
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD Labor ID card
MyKid Juvenile ID card
Example: MyKad 
     * @return Type Lisence type
MyKad ID card
MyPR Permanent resident ID card
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD Labor ID card
MyKid Juvenile ID card
Example: MyKad
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Lisence type
MyKad ID card
MyPR Permanent resident ID card
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD Labor ID card
MyKid Juvenile ID card
Example: MyKad
     * @param Type Lisence type
MyKad ID card
MyPR Permanent resident ID card
MyTentera Military ID card
MyKAS Temporary ID card
POLIS Police ID card
IKAD Labor ID card
MyKid Juvenile ID card
Example: MyKad
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Birthday (Currently, this filed only supports IKAD labor ID card and MyKad ID card)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Birthday Birthday (Currently, this filed only supports IKAD labor ID card and MyKad ID card)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday (Currently, this filed only supports IKAD labor ID card and MyKad ID card)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Birthday Birthday (Currently, this filed only supports IKAD labor ID card and MyKad ID card)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    public NormalMLIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalMLIDCard(NormalMLIDCard source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.FormattedAddress != null) {
            this.FormattedAddress = new String(source.FormattedAddress);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "FormattedAddress", this.FormattedAddress);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);

    }
}

