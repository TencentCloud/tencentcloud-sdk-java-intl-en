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

public class PhilippinesVoteID extends AbstractModel {

    /**
    * VIN of Philippines VoteID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VIN")
    @Expose
    private String VIN;

    /**
    * First name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Civil status
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CivilStatus")
    @Expose
    private String CivilStatus;

    /**
    * Nationality
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Citizenship")
    @Expose
    private String Citizenship;

    /**
    * Address
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrecinctNo")
    @Expose
    private String PrecinctNo;

    /**
     * Get VIN of Philippines VoteID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VIN VIN of Philippines VoteID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVIN() {
        return this.VIN;
    }

    /**
     * Set VIN of Philippines VoteID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VIN VIN of Philippines VoteID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
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
     * Get Civil status
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CivilStatus Civil status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCivilStatus() {
        return this.CivilStatus;
    }

    /**
     * Set Civil status
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CivilStatus Civil status
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCivilStatus(String CivilStatus) {
        this.CivilStatus = CivilStatus;
    }

    /**
     * Get Nationality
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Citizenship Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCitizenship() {
        return this.Citizenship;
    }

    /**
     * Set Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Citizenship Nationality
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCitizenship(String Citizenship) {
        this.Citizenship = Citizenship;
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
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PrecinctNo Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPrecinctNo() {
        return this.PrecinctNo;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PrecinctNo Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPrecinctNo(String PrecinctNo) {
        this.PrecinctNo = PrecinctNo;
    }

    public PhilippinesVoteID() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PhilippinesVoteID(PhilippinesVoteID source) {
        if (source.VIN != null) {
            this.VIN = new String(source.VIN);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.CivilStatus != null) {
            this.CivilStatus = new String(source.CivilStatus);
        }
        if (source.Citizenship != null) {
            this.Citizenship = new String(source.Citizenship);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.PrecinctNo != null) {
            this.PrecinctNo = new String(source.PrecinctNo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VIN", this.VIN);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "CivilStatus", this.CivilStatus);
        this.setParamSimple(map, prefix + "Citizenship", this.Citizenship);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "PrecinctNo", this.PrecinctNo);

    }
}

