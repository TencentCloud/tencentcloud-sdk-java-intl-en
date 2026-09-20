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

public class GetNFCResultRequest extends AbstractModel {

    /**
    * Unique ID returned by the frontend NFC SDK
    */
    @SerializedName("NFCToken")
    @Expose
    private String NFCToken;

    /**
    * Identity card number / passport number / Hong Kong and Macao travel permit
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Base64 value of the portrait photo
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * Date of birth (format: YYYYMMDD)
    */
    @SerializedName("BirthDate")
    @Expose
    private String BirthDate;

    /**
    * Validity start time of the document (format: YYYYMMDD)
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * Document validity end time (format: YYYYMMDD)
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Ethnicity
    */
    @SerializedName("Nation")
    @Expose
    private String Nation;

    /**
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * English name
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Issuing authority
    */
    @SerializedName("SigningOrganization")
    @Expose
    private String SigningOrganization;

    /**
    * Nationality
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Country code
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * Machine-readable code of the passport
    */
    @SerializedName("MachineReadCode")
    @Expose
    private String MachineReadCode;

    /**
     * Get Unique ID returned by the frontend NFC SDK 
     * @return NFCToken Unique ID returned by the frontend NFC SDK
     */
    public String getNFCToken() {
        return this.NFCToken;
    }

    /**
     * Set Unique ID returned by the frontend NFC SDK
     * @param NFCToken Unique ID returned by the frontend NFC SDK
     */
    public void setNFCToken(String NFCToken) {
        this.NFCToken = NFCToken;
    }

    /**
     * Get Identity card number / passport number / Hong Kong and Macao travel permit 
     * @return IdNum Identity card number / passport number / Hong Kong and Macao travel permit
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set Identity card number / passport number / Hong Kong and Macao travel permit
     * @param IdNum Identity card number / passport number / Hong Kong and Macao travel permit
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get Name 
     * @return Name Name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name
     * @param Name Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Base64 value of the portrait photo 
     * @return Picture Base64 value of the portrait photo
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * Set Base64 value of the portrait photo
     * @param Picture Base64 value of the portrait photo
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * Get Date of birth (format: YYYYMMDD) 
     * @return BirthDate Date of birth (format: YYYYMMDD)
     */
    public String getBirthDate() {
        return this.BirthDate;
    }

    /**
     * Set Date of birth (format: YYYYMMDD)
     * @param BirthDate Date of birth (format: YYYYMMDD)
     */
    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    /**
     * Get Validity start time of the document (format: YYYYMMDD) 
     * @return BeginTime Validity start time of the document (format: YYYYMMDD)
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set Validity start time of the document (format: YYYYMMDD)
     * @param BeginTime Validity start time of the document (format: YYYYMMDD)
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get Document validity end time (format: YYYYMMDD) 
     * @return EndTime Document validity end time (format: YYYYMMDD)
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Document validity end time (format: YYYYMMDD)
     * @param EndTime Document validity end time (format: YYYYMMDD)
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Address 
     * @return Address Address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
     * @param Address Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Ethnicity 
     * @return Nation Ethnicity
     */
    public String getNation() {
        return this.Nation;
    }

    /**
     * Set Ethnicity
     * @param Nation Ethnicity
     */
    public void setNation(String Nation) {
        this.Nation = Nation;
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
     * Get English name 
     * @return EnName English name
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set English name
     * @param EnName English name
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get Issuing authority 
     * @return SigningOrganization Issuing authority
     */
    public String getSigningOrganization() {
        return this.SigningOrganization;
    }

    /**
     * Set Issuing authority
     * @param SigningOrganization Issuing authority
     */
    public void setSigningOrganization(String SigningOrganization) {
        this.SigningOrganization = SigningOrganization;
    }

    /**
     * Get Nationality 
     * @return Nationality Nationality
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality
     * @param Nationality Nationality
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Country code 
     * @return CountryCode Country code
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * Set Country code
     * @param CountryCode Country code
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * Get Machine-readable code of the passport 
     * @return MachineReadCode Machine-readable code of the passport
     */
    public String getMachineReadCode() {
        return this.MachineReadCode;
    }

    /**
     * Set Machine-readable code of the passport
     * @param MachineReadCode Machine-readable code of the passport
     */
    public void setMachineReadCode(String MachineReadCode) {
        this.MachineReadCode = MachineReadCode;
    }

    public GetNFCResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetNFCResultRequest(GetNFCResultRequest source) {
        if (source.NFCToken != null) {
            this.NFCToken = new String(source.NFCToken);
        }
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Picture != null) {
            this.Picture = new String(source.Picture);
        }
        if (source.BirthDate != null) {
            this.BirthDate = new String(source.BirthDate);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Nation != null) {
            this.Nation = new String(source.Nation);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.SigningOrganization != null) {
            this.SigningOrganization = new String(source.SigningOrganization);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.CountryCode != null) {
            this.CountryCode = new String(source.CountryCode);
        }
        if (source.MachineReadCode != null) {
            this.MachineReadCode = new String(source.MachineReadCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NFCToken", this.NFCToken);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "BirthDate", this.BirthDate);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Nation", this.Nation);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "SigningOrganization", this.SigningOrganization);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "MachineReadCode", this.MachineReadCode);

    }
}

