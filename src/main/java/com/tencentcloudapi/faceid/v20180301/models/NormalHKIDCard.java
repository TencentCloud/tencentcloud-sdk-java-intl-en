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

public class NormalHKIDCard extends AbstractModel {

    /**
    * Chinese name
    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * English name
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Chinese telegraph code corresponding to the Chinese name
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Gender: "M" (male) or "F" (female).
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
    * Permanent resident ID card: 0: non-permanent; 1: permanent; -1: unknown
    */
    @SerializedName("Permanent")
    @Expose
    private String Permanent;

    /**
    * Identity number
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Document symbol, the symbol under the date of birth, for example, "***AZ"
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * Date of first issue
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * Most recent date of issue
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
    * Hong Kong identity card version. HKID-2003: 2003 edition identity card. HKID-2018: 2018 edition identity card.
    */
    @SerializedName("HKIDVersion")
    @Expose
    private String HKIDVersion;

    /**
     * Get Chinese name 
     * @return ChineseName Chinese name
     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set Chinese name
     * @param ChineseName Chinese name
     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get English name 
     * @return FullName English name
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set English name
     * @param FullName English name
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Chinese telegraph code corresponding to the Chinese name 
     * @return RegistrationNumber Chinese telegraph code corresponding to the Chinese name
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Chinese telegraph code corresponding to the Chinese name
     * @param RegistrationNumber Chinese telegraph code corresponding to the Chinese name
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Gender: "M" (male) or "F" (female). 
     * @return Sex Gender: "M" (male) or "F" (female).
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender: "M" (male) or "F" (female).
     * @param Sex Gender: "M" (male) or "F" (female).
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
     * Get Permanent resident ID card: 0: non-permanent; 1: permanent; -1: unknown 
     * @return Permanent Permanent resident ID card: 0: non-permanent; 1: permanent; -1: unknown
     */
    public String getPermanent() {
        return this.Permanent;
    }

    /**
     * Set Permanent resident ID card: 0: non-permanent; 1: permanent; -1: unknown
     * @param Permanent Permanent resident ID card: 0: non-permanent; 1: permanent; -1: unknown
     */
    public void setPermanent(String Permanent) {
        this.Permanent = Permanent;
    }

    /**
     * Get Identity number 
     * @return LicenseNumber Identity number
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set Identity number
     * @param LicenseNumber Identity number
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Document symbol, the symbol under the date of birth, for example, "***AZ" 
     * @return Symbol Document symbol, the symbol under the date of birth, for example, "***AZ"
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set Document symbol, the symbol under the date of birth, for example, "***AZ"
     * @param Symbol Document symbol, the symbol under the date of birth, for example, "***AZ"
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get Date of first issue 
     * @return IssuedDate Date of first issue
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set Date of first issue
     * @param IssuedDate Date of first issue
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get Most recent date of issue 
     * @return CurrentIssueDate Most recent date of issue
     */
    public String getCurrentIssueDate() {
        return this.CurrentIssueDate;
    }

    /**
     * Set Most recent date of issue
     * @param CurrentIssueDate Most recent date of issue
     */
    public void setCurrentIssueDate(String CurrentIssueDate) {
        this.CurrentIssueDate = CurrentIssueDate;
    }

    /**
     * Get Hong Kong identity card version. HKID-2003: 2003 edition identity card. HKID-2018: 2018 edition identity card. 
     * @return HKIDVersion Hong Kong identity card version. HKID-2003: 2003 edition identity card. HKID-2018: 2018 edition identity card.
     */
    public String getHKIDVersion() {
        return this.HKIDVersion;
    }

    /**
     * Set Hong Kong identity card version. HKID-2003: 2003 edition identity card. HKID-2018: 2018 edition identity card.
     * @param HKIDVersion Hong Kong identity card version. HKID-2003: 2003 edition identity card. HKID-2018: 2018 edition identity card.
     */
    public void setHKIDVersion(String HKIDVersion) {
        this.HKIDVersion = HKIDVersion;
    }

    public NormalHKIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NormalHKIDCard(NormalHKIDCard source) {
        if (source.ChineseName != null) {
            this.ChineseName = new String(source.ChineseName);
        }
        if (source.FullName != null) {
            this.FullName = new String(source.FullName);
        }
        if (source.RegistrationNumber != null) {
            this.RegistrationNumber = new String(source.RegistrationNumber);
        }
        if (source.Sex != null) {
            this.Sex = new String(source.Sex);
        }
        if (source.Birthday != null) {
            this.Birthday = new String(source.Birthday);
        }
        if (source.Permanent != null) {
            this.Permanent = new String(source.Permanent);
        }
        if (source.LicenseNumber != null) {
            this.LicenseNumber = new String(source.LicenseNumber);
        }
        if (source.Symbol != null) {
            this.Symbol = new String(source.Symbol);
        }
        if (source.IssuedDate != null) {
            this.IssuedDate = new String(source.IssuedDate);
        }
        if (source.CurrentIssueDate != null) {
            this.CurrentIssueDate = new String(source.CurrentIssueDate);
        }
        if (source.HKIDVersion != null) {
            this.HKIDVersion = new String(source.HKIDVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChineseName", this.ChineseName);
        this.setParamSimple(map, prefix + "FullName", this.FullName);
        this.setParamSimple(map, prefix + "RegistrationNumber", this.RegistrationNumber);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Permanent", this.Permanent);
        this.setParamSimple(map, prefix + "LicenseNumber", this.LicenseNumber);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamSimple(map, prefix + "IssuedDate", this.IssuedDate);
        this.setParamSimple(map, prefix + "CurrentIssueDate", this.CurrentIssueDate);
        this.setParamSimple(map, prefix + "HKIDVersion", this.HKIDVersion);

    }
}

