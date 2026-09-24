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

public class Person extends AbstractModel {

    /**
    * <p>Full name (either this or LastName is required). If FullName is filled, FirstName/MiddleName/LastName cannot be filled</p>
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * <p>name (either this or FullName is required)</p>
    */
    @SerializedName("LastName")
    @Expose
    private String LastName;

    /**
    * <p>First name (optional)</p>
    */
    @SerializedName("FirstName")
    @Expose
    private String FirstName;

    /**
    * <p>Middle name (optional)</p>
    */
    @SerializedName("MiddleName")
    @Expose
    private String MiddleName;

    /**
    * <p>ID number (Option)</p>
    */
    @SerializedName("IdentityNumber")
    @Expose
    private String IdentityNumber;

    /**
    * <p>Date of birth, format: YYYY-MM-DD, YYYY-MM, YYYY (Year-Month-Day separated by -)</p><p>Parameter format: YYYY-MM-DD</p>
    */
    @SerializedName("DateOfBirth")
    @Expose
    private String DateOfBirth;

    /**
    * <p>Gender: MALE / FEMALE / OTHER / NOT_KNOWN</p><p>Enumeration values:</p><ul><li>MALE: male</li><li>FEMALE: female</li><li>OTHER: OTHER</li><li>NOT_KNOWN: NOT_KNOWN</li></ul>
    */
    @SerializedName("Gender")
    @Expose
    private String Gender;

    /**
    * <p>Address</p>
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * <p>Nationality, ISO 3166-1 alpha-2 country code (Option)</p>
    */
    @SerializedName("Nationality")
    @Expose
    private String Nationality;

    /**
    * <p>Country of residence, ISO 3166-1 alpha-2 country code (optional)</p>
    */
    @SerializedName("Country")
    @Expose
    private String Country;

    /**
     * Get <p>Full name (either this or LastName is required). If FullName is filled, FirstName/MiddleName/LastName cannot be filled</p> 
     * @return FullName <p>Full name (either this or LastName is required). If FullName is filled, FirstName/MiddleName/LastName cannot be filled</p>
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set <p>Full name (either this or LastName is required). If FullName is filled, FirstName/MiddleName/LastName cannot be filled</p>
     * @param FullName <p>Full name (either this or LastName is required). If FullName is filled, FirstName/MiddleName/LastName cannot be filled</p>
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get <p>name (either this or FullName is required)</p> 
     * @return LastName <p>name (either this or FullName is required)</p>
     */
    public String getLastName() {
        return this.LastName;
    }

    /**
     * Set <p>name (either this or FullName is required)</p>
     * @param LastName <p>name (either this or FullName is required)</p>
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * Get <p>First name (optional)</p> 
     * @return FirstName <p>First name (optional)</p>
     */
    public String getFirstName() {
        return this.FirstName;
    }

    /**
     * Set <p>First name (optional)</p>
     * @param FirstName <p>First name (optional)</p>
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * Get <p>Middle name (optional)</p> 
     * @return MiddleName <p>Middle name (optional)</p>
     */
    public String getMiddleName() {
        return this.MiddleName;
    }

    /**
     * Set <p>Middle name (optional)</p>
     * @param MiddleName <p>Middle name (optional)</p>
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * Get <p>ID number (Option)</p> 
     * @return IdentityNumber <p>ID number (Option)</p>
     */
    public String getIdentityNumber() {
        return this.IdentityNumber;
    }

    /**
     * Set <p>ID number (Option)</p>
     * @param IdentityNumber <p>ID number (Option)</p>
     */
    public void setIdentityNumber(String IdentityNumber) {
        this.IdentityNumber = IdentityNumber;
    }

    /**
     * Get <p>Date of birth, format: YYYY-MM-DD, YYYY-MM, YYYY (Year-Month-Day separated by -)</p><p>Parameter format: YYYY-MM-DD</p> 
     * @return DateOfBirth <p>Date of birth, format: YYYY-MM-DD, YYYY-MM, YYYY (Year-Month-Day separated by -)</p><p>Parameter format: YYYY-MM-DD</p>
     */
    public String getDateOfBirth() {
        return this.DateOfBirth;
    }

    /**
     * Set <p>Date of birth, format: YYYY-MM-DD, YYYY-MM, YYYY (Year-Month-Day separated by -)</p><p>Parameter format: YYYY-MM-DD</p>
     * @param DateOfBirth <p>Date of birth, format: YYYY-MM-DD, YYYY-MM, YYYY (Year-Month-Day separated by -)</p><p>Parameter format: YYYY-MM-DD</p>
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * Get <p>Gender: MALE / FEMALE / OTHER / NOT_KNOWN</p><p>Enumeration values:</p><ul><li>MALE: male</li><li>FEMALE: female</li><li>OTHER: OTHER</li><li>NOT_KNOWN: NOT_KNOWN</li></ul> 
     * @return Gender <p>Gender: MALE / FEMALE / OTHER / NOT_KNOWN</p><p>Enumeration values:</p><ul><li>MALE: male</li><li>FEMALE: female</li><li>OTHER: OTHER</li><li>NOT_KNOWN: NOT_KNOWN</li></ul>
     */
    public String getGender() {
        return this.Gender;
    }

    /**
     * Set <p>Gender: MALE / FEMALE / OTHER / NOT_KNOWN</p><p>Enumeration values:</p><ul><li>MALE: male</li><li>FEMALE: female</li><li>OTHER: OTHER</li><li>NOT_KNOWN: NOT_KNOWN</li></ul>
     * @param Gender <p>Gender: MALE / FEMALE / OTHER / NOT_KNOWN</p><p>Enumeration values:</p><ul><li>MALE: male</li><li>FEMALE: female</li><li>OTHER: OTHER</li><li>NOT_KNOWN: NOT_KNOWN</li></ul>
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * Get <p>Address</p> 
     * @return Address <p>Address</p>
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set <p>Address</p>
     * @param Address <p>Address</p>
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get <p>Nationality, ISO 3166-1 alpha-2 country code (Option)</p> 
     * @return Nationality <p>Nationality, ISO 3166-1 alpha-2 country code (Option)</p>
     */
    public String getNationality() {
        return this.Nationality;
    }

    /**
     * Set <p>Nationality, ISO 3166-1 alpha-2 country code (Option)</p>
     * @param Nationality <p>Nationality, ISO 3166-1 alpha-2 country code (Option)</p>
     */
    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    /**
     * Get <p>Country of residence, ISO 3166-1 alpha-2 country code (optional)</p> 
     * @return Country <p>Country of residence, ISO 3166-1 alpha-2 country code (optional)</p>
     */
    public String getCountry() {
        return this.Country;
    }

    /**
     * Set <p>Country of residence, ISO 3166-1 alpha-2 country code (optional)</p>
     * @param Country <p>Country of residence, ISO 3166-1 alpha-2 country code (optional)</p>
     */
    public void setCountry(String Country) {
        this.Country = Country;
    }

    public Person() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Person(Person source) {
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.LastName != null) {
            this.LastName = new String(source.LastName);
        }
        if (source.FirstName != null) {
            this.FirstName = new String(source.FirstName);
        }
        if (source.MiddleName != null) {
            this.MiddleName = new String(source.MiddleName);
        }
        if (source.IdentityNumber != null) {
            this.IdentityNumber = new String(source.IdentityNumber);
        }
        if (source.DateOfBirth != null) {
            this.DateOfBirth = new String(source.DateOfBirth);
        }
        if (source.Gender != null) {
            this.Gender = new String(source.Gender);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Nationality != null) {
            this.Nationality = new String(source.Nationality);
        }
        if (source.Country != null) {
            this.Country = new String(source.Country);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "LastName", this.LastName);
        this.setParamSimple(map, prefix + "FirstName", this.FirstName);
        this.setParamSimple(map, prefix + "MiddleName", this.MiddleName);
        this.setParamSimple(map, prefix + "IdentityNumber", this.IdentityNumber);
        this.setParamSimple(map, prefix + "DateOfBirth", this.DateOfBirth);
        this.setParamSimple(map, prefix + "Gender", this.Gender);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Nationality", this.Nationality);
        this.setParamSimple(map, prefix + "Country", this.Country);

    }
}

