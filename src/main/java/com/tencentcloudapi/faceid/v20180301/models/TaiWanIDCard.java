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

public class TaiWanIDCard extends AbstractModel {

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
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * City of issuance
    */
    @SerializedName("IssuedCountry")
    @Expose
    private String IssuedCountry;

    /**
    * Registration number
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

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
     * Get Sex 
     * @return Sex Sex
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Sex
     * @param Sex Sex
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get City of issuance 
     * @return IssuedCountry City of issuance
     */
    public String getIssuedCountry() {
        return this.IssuedCountry;
    }

    /**
     * Set City of issuance
     * @param IssuedCountry City of issuance
     */
    public void setIssuedCountry(String IssuedCountry) {
        this.IssuedCountry = IssuedCountry;
    }

    /**
     * Get Registration number 
     * @return RegistrationNumber Registration number
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Registration number
     * @param RegistrationNumber Registration number
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    public TaiWanIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaiWanIDCard(TaiWanIDCard source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.IssuedCountry != null) {
            this.IssuedCountry = new String(source.IssuedCountry);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "IssuedCountry", this.IssuedCountry);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);

    }
}

