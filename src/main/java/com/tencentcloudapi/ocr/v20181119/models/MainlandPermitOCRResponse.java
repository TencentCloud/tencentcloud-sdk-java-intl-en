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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MainlandPermitOCRResponse extends AbstractModel{

    /**
    * Name in Chinese
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Name in English
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * Gender
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Issuing authority
    */
    @SerializedName("IssueAuthority")
    @Expose
    private String IssueAuthority;

    /**
    * Validity period
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * ID number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Place of issue
    */
    @SerializedName("IssueAddress")
    @Expose
    private String IssueAddress;

    /**
    * Number of issues
    */
    @SerializedName("IssueNumber")
    @Expose
    private String IssueNumber;

    /**
    * Document type
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Base64-encoded profile photo, which is returned only when `RetProfile` is set to `True`
    */
    @SerializedName("Profile")
    @Expose
    private String Profile;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name in Chinese 
     * @return Name Name in Chinese
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name in Chinese
     * @param Name Name in Chinese
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Name in English 
     * @return EnglishName Name in English
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set Name in English
     * @param EnglishName Name in English
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get Gender 
     * @return Sex Gender
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender
     * @param Sex Gender
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
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
     * Get Issuing authority 
     * @return IssueAuthority Issuing authority
     */
    public String getIssueAuthority() {
        return this.IssueAuthority;
    }

    /**
     * Set Issuing authority
     * @param IssueAuthority Issuing authority
     */
    public void setIssueAuthority(String IssueAuthority) {
        this.IssueAuthority = IssueAuthority;
    }

    /**
     * Get Validity period 
     * @return ValidDate Validity period
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Validity period
     * @param ValidDate Validity period
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get ID number 
     * @return Number ID number
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set ID number
     * @param Number ID number
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Place of issue 
     * @return IssueAddress Place of issue
     */
    public String getIssueAddress() {
        return this.IssueAddress;
    }

    /**
     * Set Place of issue
     * @param IssueAddress Place of issue
     */
    public void setIssueAddress(String IssueAddress) {
        this.IssueAddress = IssueAddress;
    }

    /**
     * Get Number of issues 
     * @return IssueNumber Number of issues
     */
    public String getIssueNumber() {
        return this.IssueNumber;
    }

    /**
     * Set Number of issues
     * @param IssueNumber Number of issues
     */
    public void setIssueNumber(String IssueNumber) {
        this.IssueNumber = IssueNumber;
    }

    /**
     * Get Document type 
     * @return Type Document type
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Document type
     * @param Type Document type
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Base64-encoded profile photo, which is returned only when `RetProfile` is set to `True` 
     * @return Profile Base64-encoded profile photo, which is returned only when `RetProfile` is set to `True`
     */
    public String getProfile() {
        return this.Profile;
    }

    /**
     * Set Base64-encoded profile photo, which is returned only when `RetProfile` is set to `True`
     * @param Profile Base64-encoded profile photo, which is returned only when `RetProfile` is set to `True`
     */
    public void setProfile(String Profile) {
        this.Profile = Profile;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public MainlandPermitOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MainlandPermitOCRResponse(MainlandPermitOCRResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.IssueAuthority != null) {
            this.IssueAuthority = new String(source.IssueAuthority);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.IssueAddress != null) {
            this.IssueAddress = new String(source.IssueAddress);
        }
        if (source.IssueNumber != null) {
            this.IssueNumber = new String(source.IssueNumber);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Profile != null) {
            this.Profile = new String(source.Profile);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "IssueAuthority", this.IssueAuthority);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "IssueAddress", this.IssueAddress);
        this.setParamSimple(map, prefix + "IssueNumber", this.IssueNumber);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Profile", this.Profile);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

