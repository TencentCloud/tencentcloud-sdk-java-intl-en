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

public class HKIDCard extends AbstractModel {

    /**
    * Chinese name
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * English name
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Chinese name telegraph code
    */
    @SerializedName("TelexCode")
    @Expose
    private String TelexCode;

    /**
    * Gender: "M" (male) or "F" (female)
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
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * Document symbol, the symbol below the date of birth, for example, "***AZ"
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * Date of first issue
    */
    @SerializedName("FirstIssueDate")
    @Expose
    private String FirstIssueDate;

    /**
    * Most recent date of issue
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
     * Get Chinese name 
     * @return CnName Chinese name
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set Chinese name
     * @param CnName Chinese name
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
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
     * Get Chinese name telegraph code 
     * @return TelexCode Chinese name telegraph code
     */
    public String getTelexCode() {
        return this.TelexCode;
    }

    /**
     * Set Chinese name telegraph code
     * @param TelexCode Chinese name telegraph code
     */
    public void setTelexCode(String TelexCode) {
        this.TelexCode = TelexCode;
    }

    /**
     * Get Gender: "M" (male) or "F" (female) 
     * @return Sex Gender: "M" (male) or "F" (female)
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender: "M" (male) or "F" (female)
     * @param Sex Gender: "M" (male) or "F" (female)
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
     * @return IdNum Identity number
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set Identity number
     * @param IdNum Identity number
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get Document symbol, the symbol below the date of birth, for example, "***AZ" 
     * @return Symbol Document symbol, the symbol below the date of birth, for example, "***AZ"
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set Document symbol, the symbol below the date of birth, for example, "***AZ"
     * @param Symbol Document symbol, the symbol below the date of birth, for example, "***AZ"
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get Date of first issue 
     * @return FirstIssueDate Date of first issue
     */
    public String getFirstIssueDate() {
        return this.FirstIssueDate;
    }

    /**
     * Set Date of first issue
     * @param FirstIssueDate Date of first issue
     */
    public void setFirstIssueDate(String FirstIssueDate) {
        this.FirstIssueDate = FirstIssueDate;
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

