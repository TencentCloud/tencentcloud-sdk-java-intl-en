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

public class PhilippinesVoteID extends AbstractModel {

    /**
    * VIN of Philippines VoteID
    */
    @SerializedName("VIN")
    @Expose
    private String VIN;

    /**
    * Name
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * Last name
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Marital status
    */
    @SerializedName("CivilStatus")
    @Expose
    private String CivilStatus;

    /**
    * Nationality
    */
    @SerializedName("Citizenship")
    @Expose
    private String Citizenship;

    /**
    * Address.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Region.
    */
    @SerializedName("PrecinctNo")
    @Expose
    private String PrecinctNo;

    /**
     * Get VIN of Philippines VoteID 
     * @return VIN VIN of Philippines VoteID
     */
    public String getVIN() {
        return this.VIN;
    }

    /**
     * Set VIN of Philippines VoteID
     * @param VIN VIN of Philippines VoteID
     */
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    /**
     * Get Name 
     * @return FirstName Name
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set Name
     * @param FirstName Name
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get Last name 
     * @return LastName Last name
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set Last name
     * @param LastName Last name
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get Date of birth 
     * @return Birthday Date of birth
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Date of birth
     * @param Birthday Date of birth
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Marital status 
     * @return CivilStatus Marital status
     */
    public String getCivilStatus() {
        return this.CivilStatus;
    }

    /**
     * Set Marital status
     * @param CivilStatus Marital status
     */
    public void setCivilStatus(String CivilStatus) {
        this.CivilStatus = CivilStatus;
    }

    /**
     * Get Nationality 
     * @return Citizenship Nationality
     */
    public String getCitizenship() {
        return this.Citizenship;
    }

    /**
     * Set Nationality
     * @param Citizenship Nationality
     */
    public void setCitizenship(String Citizenship) {
        this.Citizenship = Citizenship;
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
     * Get Region. 
     * @return PrecinctNo Region.
     */
    public String getPrecinctNo() {
        return this.PrecinctNo;
    }

    /**
     * Set Region.
     * @param PrecinctNo Region.
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

