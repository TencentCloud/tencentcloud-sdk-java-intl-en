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

public class PhilippinesUMID extends AbstractModel {

    /**
    * Last name
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * Middle name
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * Name
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * Address.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Birthday
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * crn code
    */
    @SerializedName("CRN")
    @Expose
    private String CRN;

    /**
     * Get Last name 
     * @return Surname Last name
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set Last name
     * @param Surname Last name
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get Middle name 
     * @return MiddleName Middle name
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set Middle name
     * @param MiddleName Middle name
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get Name 
     * @return GivenName Name
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set Name
     * @param GivenName Name
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get Address. 
     * @return Sex Address.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Address.
     * @param Sex Address.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
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
     * Get Address. 
     * @return Address Address.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address.
     * @param Address Address.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get crn code 
     * @return CRN crn code
     */
    public String getCRN() {
        return this.CRN;
    }

    /**
     * Set crn code
     * @param CRN crn code
     */
    public void setCRN(String CRN) {
        this.CRN = CRN;
    }

    public PhilippinesUMID() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhilippinesUMID(PhilippinesUMID source) {
        if (source.Surname != null) {
            this.Surname = new String(source.Surname);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new String(source.MiddleName);
        }
        if (source.GivenName != null) {
            this.GivenName = new String(source.GivenName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.CRN != null) {
            this.CRN = new String(source.CRN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Surname", this.Surname);
        this.setParamSimple(map, prefix + "MiddleName", this.MiddleName);
        this.setParamSimple(map, prefix + "GivenName", this.GivenName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "CRN", this.CRN);

    }
}

