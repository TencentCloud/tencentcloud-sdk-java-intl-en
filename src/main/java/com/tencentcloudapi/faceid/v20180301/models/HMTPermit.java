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

public class HMTPermit extends AbstractModel {

    /**
    * Name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * English name
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * ID number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Sex
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Validity period.
    */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
    * Issuing authority
    */
    @SerializedName("IssueAuthority")
    @Expose
    private String IssueAuthority;

    /**
    * Issuing place
    */
    @SerializedName("IssueAddress")
    @Expose
    private String IssueAddress;

    /**
    * Date of birth
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

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
     * Get English name 
     * @return EnglishName English name
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set English name
     * @param EnglishName English name
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
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
     * Get Validity period. 
     * @return ValidDate Validity period.
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set Validity period.
     * @param ValidDate Validity period.
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
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
     * Get Issuing place 
     * @return IssueAddress Issuing place
     */
    public String getIssueAddress() {
        return this.IssueAddress;
    }

    /**
     * Set Issuing place
     * @param IssueAddress Issuing place
     */
    public void setIssueAddress(String IssueAddress) {
        this.IssueAddress = IssueAddress;
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

    public HMTPermit() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HMTPermit(HMTPermit source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.ValidDate != null) {
            this.ValidDate = new String(source.ValidDate);
        }
        if (source.IssueAuthority != null) {
            this.IssueAuthority = new String(source.IssueAuthority);
        }
        if (source.IssueAddress != null) {
            this.IssueAddress = new String(source.IssueAddress);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "IssueAuthority", this.IssueAuthority);
        this.setParamSimple(map, prefix + "IssueAddress", this.IssueAddress);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);

    }
}

