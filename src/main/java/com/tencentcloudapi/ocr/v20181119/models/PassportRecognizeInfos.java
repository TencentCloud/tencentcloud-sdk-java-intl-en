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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassportRecognizeInfos extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * 
    */
    @SerializedName("PassportID")
    @Expose
    private String PassportID;

    /**
    * 
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * 
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * 
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * 
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * 
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * 
    */
    @SerializedName("DateOfIssuance")
    @Expose
    private String DateOfIssuance;

    /**
    * 
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * 
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * 
    */
    @SerializedName("IssuePlace")
    @Expose
    private String IssuePlace;

    /**
    * 
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
     * Get  
     * @return Type 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 
     * @param Type 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return IssuingCountry 
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set 
     * @param IssuingCountry 
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get  
     * @return PassportID 
     */
    public String getPassportID() {
        return this.PassportID;
    }

    /**
     * Set 
     * @param PassportID 
     */
    public void setPassportID(String PassportID) {
        this.PassportID = PassportID;
    }

    /**
     * Get  
     * @return Surname 
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set 
     * @param Surname 
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get  
     * @return GivenName 
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set 
     * @param GivenName 
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get  
     * @return Name 
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 
     * @param Name 
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get  
     * @return Nationality 
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set 
     * @param Nationality 
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get  
     * @return DateOfBirth 
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set 
     * @param DateOfBirth 
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get  
     * @return Sex 
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set 
     * @param Sex 
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get  
     * @return DateOfIssuance 
     */
    public String getDateOfIssuance() {
        return this.DateOfIssuance;
    }

    /**
     * Set 
     * @param DateOfIssuance 
     */
    public void setDateOfIssuance(String DateOfIssuance) {
        this.DateOfIssuance = DateOfIssuance;
    }

    /**
     * Get  
     * @return DateOfExpiration 
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set 
     * @param DateOfExpiration 
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get  
     * @return Signature 
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set 
     * @param Signature 
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get  
     * @return IssuePlace 
     */
    public String getIssuePlace() {
        return this.IssuePlace;
    }

    /**
     * Set 
     * @param IssuePlace 
     */
    public void setIssuePlace(String IssuePlace) {
        this.IssuePlace = IssuePlace;
    }

    /**
     * Get  
     * @return IssuingAuthority 
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set 
     * @param IssuingAuthority 
     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    public PassportRecognizeInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PassportRecognizeInfos(PassportRecognizeInfos source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.IssuingCountry != null) {
            this.IssuingCountry = new String(source.IssuingCountry);
        }
        if (source.PassportID != null) {
            this.PassportID = new String(source.PassportID);
        }
        if (source.Surname != null) {
            this.Surname = new String(source.Surname);
        }
        if (source.GivenName != null) {
            this.GivenName = new String(source.GivenName);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.DateOfIssuance != null) {
            this.DateOfIssuance = new String(source.DateOfIssuance);
        }
        if (source.DateOfExpiration != null) {
            this.DateOfExpiration = new String(source.DateOfExpiration);
        }
        if (source.Signature != null) {
            this.Signature = new String(source.Signature);
        }
        if (source.IssuePlace != null) {
            this.IssuePlace = new String(source.IssuePlace);
        }
        if (source.IssuingAuthority != null) {
            this.IssuingAuthority = new String(source.IssuingAuthority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "IssuingCountry", this.IssuingCountry);
        this.setParamSimple(map, prefix + "PassportID", this.PassportID);
        this.setParamSimple(map, prefix + "Surname", this.Surname);
        this.setParamSimple(map, prefix + "GivenName", this.GivenName);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "DateOfIssuance", this.DateOfIssuance);
        this.setParamSimple(map, prefix + "DateOfExpiration", this.DateOfExpiration);
        this.setParamSimple(map, prefix + "Signature", this.Signature);
        this.setParamSimple(map, prefix + "IssuePlace", this.IssuePlace);
        this.setParamSimple(map, prefix + "IssuingAuthority", this.IssuingAuthority);

    }
}

