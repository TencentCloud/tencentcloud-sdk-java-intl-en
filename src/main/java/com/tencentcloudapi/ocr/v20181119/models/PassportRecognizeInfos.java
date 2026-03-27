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
    * Document Type (Passport Information Page Recognition Result).
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Issuing Country (Passport Information Page Recognition Result).
    */
    @SerializedName("IssuingCountry")
    @Expose
    private String IssuingCountry;

    /**
    * Passport Number (Passport Information Page Recognition Result).
    */
    @SerializedName("PassportID")
    @Expose
    private String PassportID;

    /**
    * Surname (Passport Information Page Recognition Result).
    */
    @SerializedName("Surname")
    @Expose
    private String Surname;

    /**
    * Given Name (Passport Information Page Recognition Result).
    */
    @SerializedName("GivenName")
    @Expose
    private String GivenName;

    /**
    * Full Name (Passport Information Page Recognition Result).
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Nationality Information (Passport Information Page Recognition Result).
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * Date of Birth (Passport Information Page Recognition Result).
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * Gender (Passport Information Page Recognition Result).
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Date of Issue (Passport Information Page Recognition Result).
    */
    @SerializedName("DateOfIssuance")
    @Expose
    private String DateOfIssuance;

    /**
    * Expiry Date (Passport Information Page Recognition Result).
    */
    @SerializedName("DateOfExpiration")
    @Expose
    private String DateOfExpiration;

    /**
    * Cardholder Signature (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
    */
    @SerializedName("Signature")
    @Expose
    private String Signature;

    /**
    * Place of Issue (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
    */
    @SerializedName("IssuePlace")
    @Expose
    private String IssuePlace;

    /**
    * Issuing Authority (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
    */
    @SerializedName("IssuingAuthority")
    @Expose
    private String IssuingAuthority;

    /**
     * Get Document Type (Passport Information Page Recognition Result). 
     * @return Type Document Type (Passport Information Page Recognition Result).
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Document Type (Passport Information Page Recognition Result).
     * @param Type Document Type (Passport Information Page Recognition Result).
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Issuing Country (Passport Information Page Recognition Result). 
     * @return IssuingCountry Issuing Country (Passport Information Page Recognition Result).
     */
    public String getIssuingCountry() {
        return this.IssuingCountry;
    }

    /**
     * Set Issuing Country (Passport Information Page Recognition Result).
     * @param IssuingCountry Issuing Country (Passport Information Page Recognition Result).
     */
    public void setIssuingCountry(String IssuingCountry) {
        this.IssuingCountry = IssuingCountry;
    }

    /**
     * Get Passport Number (Passport Information Page Recognition Result). 
     * @return PassportID Passport Number (Passport Information Page Recognition Result).
     */
    public String getPassportID() {
        return this.PassportID;
    }

    /**
     * Set Passport Number (Passport Information Page Recognition Result).
     * @param PassportID Passport Number (Passport Information Page Recognition Result).
     */
    public void setPassportID(String PassportID) {
        this.PassportID = PassportID;
    }

    /**
     * Get Surname (Passport Information Page Recognition Result). 
     * @return Surname Surname (Passport Information Page Recognition Result).
     */
    public String getSurname() {
        return this.Surname;
    }

    /**
     * Set Surname (Passport Information Page Recognition Result).
     * @param Surname Surname (Passport Information Page Recognition Result).
     */
    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    /**
     * Get Given Name (Passport Information Page Recognition Result). 
     * @return GivenName Given Name (Passport Information Page Recognition Result).
     */
    public String getGivenName() {
        return this.GivenName;
    }

    /**
     * Set Given Name (Passport Information Page Recognition Result).
     * @param GivenName Given Name (Passport Information Page Recognition Result).
     */
    public void setGivenName(String GivenName) {
        this.GivenName = GivenName;
    }

    /**
     * Get Full Name (Passport Information Page Recognition Result). 
     * @return Name Full Name (Passport Information Page Recognition Result).
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Full Name (Passport Information Page Recognition Result).
     * @param Name Full Name (Passport Information Page Recognition Result).
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Nationality Information (Passport Information Page Recognition Result). 
     * @return Nationality Nationality Information (Passport Information Page Recognition Result).
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set Nationality Information (Passport Information Page Recognition Result).
     * @param Nationality Nationality Information (Passport Information Page Recognition Result).
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get Date of Birth (Passport Information Page Recognition Result). 
     * @return DateOfBirth Date of Birth (Passport Information Page Recognition Result).
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set Date of Birth (Passport Information Page Recognition Result).
     * @param DateOfBirth Date of Birth (Passport Information Page Recognition Result).
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get Gender (Passport Information Page Recognition Result). 
     * @return Sex Gender (Passport Information Page Recognition Result).
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender (Passport Information Page Recognition Result).
     * @param Sex Gender (Passport Information Page Recognition Result).
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Date of Issue (Passport Information Page Recognition Result). 
     * @return DateOfIssuance Date of Issue (Passport Information Page Recognition Result).
     */
    public String getDateOfIssuance() {
        return this.DateOfIssuance;
    }

    /**
     * Set Date of Issue (Passport Information Page Recognition Result).
     * @param DateOfIssuance Date of Issue (Passport Information Page Recognition Result).
     */
    public void setDateOfIssuance(String DateOfIssuance) {
        this.DateOfIssuance = DateOfIssuance;
    }

    /**
     * Get Expiry Date (Passport Information Page Recognition Result). 
     * @return DateOfExpiration Expiry Date (Passport Information Page Recognition Result).
     */
    public String getDateOfExpiration() {
        return this.DateOfExpiration;
    }

    /**
     * Set Expiry Date (Passport Information Page Recognition Result).
     * @param DateOfExpiration Expiry Date (Passport Information Page Recognition Result).
     */
    public void setDateOfExpiration(String DateOfExpiration) {
        this.DateOfExpiration = DateOfExpiration;
    }

    /**
     * Get Cardholder Signature (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports. 
     * @return Signature Cardholder Signature (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     */
    public String getSignature() {
        return this.Signature;
    }

    /**
     * Set Cardholder Signature (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     * @param Signature Cardholder Signature (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     */
    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    /**
     * Get Place of Issue (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports. 
     * @return IssuePlace Place of Issue (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     */
    public String getIssuePlace() {
        return this.IssuePlace;
    }

    /**
     * Set Place of Issue (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     * @param IssuePlace Place of Issue (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     */
    public void setIssuePlace(String IssuePlace) {
        this.IssuePlace = IssuePlace;
    }

    /**
     * Get Issuing Authority (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports. 
     * @return IssuingAuthority Issuing Authority (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     */
    public String getIssuingAuthority() {
        return this.IssuingAuthority;
    }

    /**
     * Set Issuing Authority (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
     * @param IssuingAuthority Issuing Authority (Passport Information Page Recognition Result)

This field is only supported for Chinese mainland passports and not available for Hong Kong (China), Macao (China), and Taiwan (China) passports or foreign passports.
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

