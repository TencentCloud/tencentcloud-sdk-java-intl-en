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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HKIDCard extends AbstractModel {

    /**
    * Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
Example:  SAN, Nan
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TelexCode")
    @Expose
    private String TelexCode;

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
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

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
    @SerializedName("FirstIssueDate")
    @Expose
    private String FirstIssueDate;

    /**
    * The current date of issue
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
     * Get Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
Example:  SAN, Nan 
     * @return CnName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
Example:  SAN, Nan
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
Example:  SAN, Nan
     * @param CnName Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
Example:  SAN, Nan
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan 
     * @return EnName English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
     * @param EnName English name
Note: This field may return null, indicating that no valid values can be obtained.
Example: SAN, Nan
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TelexCode Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTelexCode() {
        return this.TelexCode;
    }

    /**
     * Set Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TelexCode Telex code correspondint to the Chinese name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTelexCode(String TelexCode) {
        this.TelexCode = TelexCode;
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
     * @return IdNum ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
     * @param IdNum ID card number
Note: This field may return null, indicating that no valid values can be obtained.
Example: C000000(E)
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
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
     * @return FirstIssueDate The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFirstIssueDate() {
        return this.FirstIssueDate;
    }

    /**
     * Set The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FirstIssueDate The first date of issue
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFirstIssueDate(String FirstIssueDate) {
        this.FirstIssueDate = FirstIssueDate;
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

    public HKIDCard() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HKIDCard(HKIDCard source) {
        if (source.CnName != null) {
            this.CnName = new String(source.CnName);
        }
        if (source.EnName != null) {
            this.EnName = new String(source.EnName);
        }
        if (source.TelexCode != null) {
            this.TelexCode = new String(source.TelexCode);
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
        if (source.IdNum != null) {
            this.IdNum = new String(source.IdNum);
        }
        if (source.Symbol != null) {
            this.Symbol = new String(source.Symbol);
        }
        if (source.FirstIssueDate != null) {
            this.FirstIssueDate = new String(source.FirstIssueDate);
        }
        if (source.CurrentIssueDate != null) {
            this.CurrentIssueDate = new String(source.CurrentIssueDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CnName", this.CnName);
        this.setParamSimple(map, prefix + "EnName", this.EnName);
        this.setParamSimple(map, prefix + "TelexCode", this.TelexCode);
        this.setParamSimple(map, prefix + "Sex", this.Sex);
        this.setParamSimple(map, prefix + "Birthday", this.Birthday);
        this.setParamSimple(map, prefix + "Permanent", this.Permanent);
        this.setParamSimple(map, prefix + "IdNum", this.IdNum);
        this.setParamSimple(map, prefix + "Symbol", this.Symbol);
        this.setParamSimple(map, prefix + "FirstIssueDate", this.FirstIssueDate);
        this.setParamSimple(map, prefix + "CurrentIssueDate", this.CurrentIssueDate);

    }
}

