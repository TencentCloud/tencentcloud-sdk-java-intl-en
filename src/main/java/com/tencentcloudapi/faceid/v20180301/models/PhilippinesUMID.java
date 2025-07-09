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
    * Surname
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * Middle Name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * Gender
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

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
    * CRN code
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CRN")
    @Expose
    private String CRN;

    /**
     * Get Surname
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Surname Surname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set Surname
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Surname Surname
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get Middle Name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MiddleName Middle Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set Middle Name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MiddleName Middle Name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get First name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return GivenName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set First name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param GivenName First name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
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
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Address
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get CRN code
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CRN CRN code
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCRN() {
        return this.CRN;
    }

    /**
     * Set CRN code
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CRN CRN code
Note: This field may return null, indicating that no valid values can be obtained.
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

