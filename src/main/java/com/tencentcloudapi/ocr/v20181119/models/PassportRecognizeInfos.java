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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PassportRecognizeInfos extends AbstractModel {

    /**
    * Document type, obtained from passport visual zone
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Issuing country, obtained from passport visual zone
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * Unique serial number / identification number of the passport, obtained from passport visual zone
    */
    @SerializedName("PassportID")
    @Expose
    private String PassportID;

    /**
    * Last name, obtained from passport visual zone
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * First name, obtained from passport visual zone
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * Full name, obtained from passport visual zone
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Nationality, obtained from passport visual zone
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Date of birth, obtained from passport visual zone
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * Gender, obtained from passport visual zone
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Date of issue, obtained from passport visual zone
    */
    @SerializedName("DateOfIssuance")
    @Expose
    private String DateOfIssuance;

    /**
    * Passport expiry date, obtained from passport visual zone
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Holder's signature, obtained from passport visual zone
(Note: Only returned for PRC passport)
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * Place of issue, obtained from passport visual zone
(Note: Only returned for PRC passport)
    */
    @SerializedName("IssuePlace")
    @Expose
    private String IssuePlace;

    /**
    * Issuing Authority, obtained from passport visual zone
(Note: Only returned for PRC passport)

    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
    * Place of birth, obtained from passport visual zone
    */
    @SerializedName("BirthPlace")
    @Expose
    private String BirthPlace;

    /**
    * Passport flag, obtained from passport visual zone
    */
    @SerializedName("PassportFlag")
    @Expose
    private String PassportFlag;

    /**
    * Middle name, obtained from passport visual zone
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * Father's name, obtained from passport visual zone
    */
    @SerializedName("FatherName")
    @Expose
    private String FatherName;

    /**
    * Mother's name, obtained from passport visual zone
    */
    @SerializedName("MotherName")
    @Expose
    private String MotherName;

    /**
    * Title, obtained from passport visual zone
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Name suffix, obtained from passport visual zone
    */
    @SerializedName("Postname")
    @Expose
    private String Postname;

    /**
     * Get Document type, obtained from passport visual zone 
     * @return Type Document type, obtained from passport visual zone
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Document type, obtained from passport visual zone
     * @param Type Document type, obtained from passport visual zone
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Issuing country, obtained from passport visual zone 
     * @return IssuingCountry Issuing country, obtained from passport visual zone
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set Issuing country, obtained from passport visual zone
     * @param IssuingCountry Issuing country, obtained from passport visual zone
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get Unique serial number / identification number of the passport, obtained from passport visual zone 
     * @return PassportID Unique serial number / identification number of the passport, obtained from passport visual zone
     */
    public String getPassportID() {
        return this.PassportID;
    }

    /**
     * Set Unique serial number / identification number of the passport, obtained from passport visual zone
     * @param PassportID Unique serial number / identification number of the passport, obtained from passport visual zone
     */
    public void setPassportID(String PassportID) {
        this.PassportID = PassportID;
    }

    /**
     * Get Last name, obtained from passport visual zone 
     * @return Surname Last name, obtained from passport visual zone
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set Last name, obtained from passport visual zone
     * @param Surname Last name, obtained from passport visual zone
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get First name, obtained from passport visual zone 
     * @return GivenName First name, obtained from passport visual zone
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set First name, obtained from passport visual zone
     * @param GivenName First name, obtained from passport visual zone
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get Full name, obtained from passport visual zone 
     * @return Name Full name, obtained from passport visual zone
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Full name, obtained from passport visual zone
     * @param Name Full name, obtained from passport visual zone
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Nationality, obtained from passport visual zone 
     * @return Nationality Nationality, obtained from passport visual zone
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality, obtained from passport visual zone
     * @param Nationality Nationality, obtained from passport visual zone
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Date of birth, obtained from passport visual zone 
     * @return DateOfBirth Date of birth, obtained from passport visual zone
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set Date of birth, obtained from passport visual zone
     * @param DateOfBirth Date of birth, obtained from passport visual zone
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get Gender, obtained from passport visual zone 
     * @return Sex Gender, obtained from passport visual zone
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender, obtained from passport visual zone
     * @param Sex Gender, obtained from passport visual zone
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Date of issue, obtained from passport visual zone 
     * @return DateOfIssuance Date of issue, obtained from passport visual zone
     */
    public String getDateOfIssuance() {
        return this.DateOfIssuance;
    }

    /**
     * Set Date of issue, obtained from passport visual zone
     * @param DateOfIssuance Date of issue, obtained from passport visual zone
     */
    public void setDateOfIssuance(String DateOfIssuance) {
        this.DateOfIssuance = DateOfIssuance;
    }

    /**
     * Get Passport expiry date, obtained from passport visual zone 
     * @return DateOfExpiration Passport expiry date, obtained from passport visual zone
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Passport expiry date, obtained from passport visual zone
     * @param DateOfExpiration Passport expiry date, obtained from passport visual zone
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Holder's signature, obtained from passport visual zone
(Note: Only returned for PRC passport) 
     * @return Signature Holder's signature, obtained from passport visual zone
(Note: Only returned for PRC passport)
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set Holder's signature, obtained from passport visual zone
(Note: Only returned for PRC passport)
     * @param Signature Holder's signature, obtained from passport visual zone
(Note: Only returned for PRC passport)
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get Place of issue, obtained from passport visual zone
(Note: Only returned for PRC passport) 
     * @return IssuePlace Place of issue, obtained from passport visual zone
(Note: Only returned for PRC passport)
     */
    public String getIssuePlace() {
        return this.IssuePlace;
    }

    /**
     * Set Place of issue, obtained from passport visual zone
(Note: Only returned for PRC passport)
     * @param IssuePlace Place of issue, obtained from passport visual zone
(Note: Only returned for PRC passport)
     */
    public void setIssuePlace(String IssuePlace) {
        this.IssuePlace = IssuePlace;
    }

    /**
     * Get Issuing Authority, obtained from passport visual zone
(Note: Only returned for PRC passport)
 
     * @return IssuingAuthority Issuing Authority, obtained from passport visual zone
(Note: Only returned for PRC passport)

     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set Issuing Authority, obtained from passport visual zone
(Note: Only returned for PRC passport)

     * @param IssuingAuthority Issuing Authority, obtained from passport visual zone
(Note: Only returned for PRC passport)

     */
    public void setIssuingAuthority(String IssuingAuthority) {
        this.IssuingAuthority = IssuingAuthority;
    }

    /**
     * Get Place of birth, obtained from passport visual zone 
     * @return BirthPlace Place of birth, obtained from passport visual zone
     */
    public String getBirthPlace() {
        return this.BirthPlace;
    }

    /**
     * Set Place of birth, obtained from passport visual zone
     * @param BirthPlace Place of birth, obtained from passport visual zone
     */
    public void setBirthPlace(String BirthPlace) {
        this.BirthPlace = BirthPlace;
    }

    /**
     * Get Passport flag, obtained from passport visual zone 
     * @return PassportFlag Passport flag, obtained from passport visual zone
     */
    public String getPassportFlag() {
        return this.PassportFlag;
    }

    /**
     * Set Passport flag, obtained from passport visual zone
     * @param PassportFlag Passport flag, obtained from passport visual zone
     */
    public void setPassportFlag(String PassportFlag) {
        this.PassportFlag = PassportFlag;
    }

    /**
     * Get Middle name, obtained from passport visual zone 
     * @return MiddleName Middle name, obtained from passport visual zone
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set Middle name, obtained from passport visual zone
     * @param MiddleName Middle name, obtained from passport visual zone
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get Father's name, obtained from passport visual zone 
     * @return FatherName Father's name, obtained from passport visual zone
     */
    public String getFatherName() {
        return this.FatherName;
    }

    /**
     * Set Father's name, obtained from passport visual zone
     * @param FatherName Father's name, obtained from passport visual zone
     */
    public void setFatherName(String FatherName) {
        this.FatherName = FatherName;
    }

    /**
     * Get Mother's name, obtained from passport visual zone 
     * @return MotherName Mother's name, obtained from passport visual zone
     */
    public String getMotherName() {
        return this.MotherName;
    }

    /**
     * Set Mother's name, obtained from passport visual zone
     * @param MotherName Mother's name, obtained from passport visual zone
     */
    public void setMotherName(String MotherName) {
        this.MotherName = MotherName;
    }

    /**
     * Get Title, obtained from passport visual zone 
     * @return Title Title, obtained from passport visual zone
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Title, obtained from passport visual zone
     * @param Title Title, obtained from passport visual zone
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Name suffix, obtained from passport visual zone 
     * @return Postname Name suffix, obtained from passport visual zone
     */
    public String getPostname() {
        return this.Postname;
    }

    /**
     * Set Name suffix, obtained from passport visual zone
     * @param Postname Name suffix, obtained from passport visual zone
     */
    public void setPostname(String Postname) {
        this.Postname = Postname;
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
        if (source.BirthPlace != null) {
            this.BirthPlace = new String(source.BirthPlace);
        }
        if (source.PassportFlag != null) {
            this.PassportFlag = new String(source.PassportFlag);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new String(source.MiddleName);
        }
        if (source.FatherName != null) {
            this.FatherName = new String(source.FatherName);
        }
        if (source.MotherName != null) {
            this.MotherName = new String(source.MotherName);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Postname != null) {
            this.Postname = new String(source.Postname);
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
        this.setParamSimple(map, prefix + "BirthPlace", this.BirthPlace);
        this.setParamSimple(map, prefix + "PassportFlag", this.PassportFlag);
        this.setParamSimple(map, prefix + "MiddleName", this.MiddleName);
        this.setParamSimple(map, prefix + "FatherName", this.FatherName);
        this.setParamSimple(map, prefix + "MotherName", this.MotherName);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Postname", this.Postname);

    }
}

