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
Note: This field may return null, indicating that no valid values can be obtained.

    */
    @SerializedName("ChineseName")
    @Expose
    private String ChineseName;

    /**
    * English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
    */
    @SerializedName("FullName")
    @Expose
    private String FullName;

    /**
    * Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegistrationNumber")
    @Expose
    private String RegistrationNumber;

    /**
    * Gender: "Male-M" or "Female-F"
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Sex")
    @Expose
    private String Sex;

    /**
    * Birthday
Note: This field may return null, indicating that no valid values can be obtained.
Example: 01-01-2001
    */
    @SerializedName("Birthday")
    @Expose
    private String Birthday;

    /**
    * Permanent resident ID card: 0-non-permanent; 1-permanent; -1-unknown
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Permanent")
    @Expose
    private String Permanent;

    /**
    * ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
    */
    @SerializedName("LicenseNumber")
    @Expose
    private String LicenseNumber;

    /**
    * Lisence symbol, which is the symbol below Birthday. Example: "***AZ"
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IssuedDate")
    @Expose
    private String IssuedDate;

    /**
    * The current date of issue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
    * Hong kong identity card version.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HKIDVersion")
    @Expose
    private String HKIDVersion;

    /**
     * Get Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
 
     * @return ChineseName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public String getChineseName() {
        return this.ChineseName;
    }

    /**
     * Set Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

     * @param ChineseName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.

     */
    public void setChineseName(String ChineseName) {
        this.ChineseName = ChineseName;
    }

    /**
     * Get English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan 
     * @return FullName English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
     */
    public String getFullName() {
        return this.FullName;
    }

    /**
     * Set English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
     * @param FullName English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
     */
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    /**
     * Get Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegistrationNumber Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegistrationNumber() {
        return this.RegistrationNumber;
    }

    /**
     * Set Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegistrationNumber Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegistrationNumber(String RegistrationNumber) {
        this.RegistrationNumber = RegistrationNumber;
    }

    /**
     * Get Gender: "Male-M" or "Female-F"
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Sex Gender: "Male-M" or "Female-F"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender: "Male-M" or "Female-F"
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Sex Gender: "Male-M" or "Female-F"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSex(String Sex) {
        this.Sex = Sex;
    }

    /**
     * Get Birthday
Note: This field may return null, indicating that no valid values can be obtained.
Example: 01-01-2001 
     * @return Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
Example: 01-01-2001
     */
    public String getBirthday() {
        return this.Birthday;
    }

    /**
     * Set Birthday
Note: This field may return null, indicating that no valid values can be obtained.
Example: 01-01-2001
     * @param Birthday Birthday
Note: This field may return null, indicating that no valid values can be obtained.
Example: 01-01-2001
     */
    public void setBirthday(String Birthday) {
        this.Birthday = Birthday;
    }

    /**
     * Get Permanent resident ID card: 0-non-permanent; 1-permanent; -1-unknown
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Permanent Permanent resident ID card: 0-non-permanent; 1-permanent; -1-unknown
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPermanent() {
        return this.Permanent;
    }

    /**
     * Set Permanent resident ID card: 0-non-permanent; 1-permanent; -1-unknown
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Permanent Permanent resident ID card: 0-non-permanent; 1-permanent; -1-unknown
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPermanent(String Permanent) {
        this.Permanent = Permanent;
    }

    /**
     * Get ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E) 
     * @return LicenseNumber ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
     */
    public String getLicenseNumber() {
        return this.LicenseNumber;
    }

    /**
     * Set ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
     * @param LicenseNumber ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
     */
    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    /**
     * Get Lisence symbol, which is the symbol below Birthday. Example: "***AZ"
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Symbol Lisence symbol, which is the symbol below Birthday. Example: "***AZ"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set Lisence symbol, which is the symbol below Birthday. Example: "***AZ"
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Symbol Lisence symbol, which is the symbol below Birthday. Example: "***AZ"
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get The first date of issue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IssuedDate The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIssuedDate() {
        return this.IssuedDate;
    }

    /**
     * Set The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IssuedDate The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIssuedDate(String IssuedDate) {
        this.IssuedDate = IssuedDate;
    }

    /**
     * Get The current date of issue
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentIssueDate The current date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCurrentIssueDate() {
        return this.CurrentIssueDate;
    }

    /**
     * Set The current date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentIssueDate The current date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentIssueDate(String CurrentIssueDate) {
        this.CurrentIssueDate = CurrentIssueDate;
    }

    /**
     * Get Hong kong identity card version.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HKIDVersion Hong kong identity card version.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHKIDVersion() {
        return this.HKIDVersion;
    }

    /**
     * Set Hong kong identity card version.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HKIDVersion Hong kong identity card version.
Note: This field may return null, indicating that no valid values can be obtained.
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

