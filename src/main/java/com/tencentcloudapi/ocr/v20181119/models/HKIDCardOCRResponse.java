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

public class HKIDCardOCRResponse extends AbstractModel{

    /**
    * Name in Chinese
    */
    @SerializedName("CnName")
    @Expose
    private String CnName;

    /**
    * Name in English
    */
    @SerializedName("EnName")
    @Expose
    private String EnName;

    /**
    * Telecode for the name in Chinese
    */
    @SerializedName("TelexCode")
    @Expose
    private String TelexCode;

    /**
    * Gender. Valid values: Male, Female
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
    * Permanent identity card.
0: non-permanent;
1: permanent;
-1: unknown.
    */
    @SerializedName("Permanent")
    @Expose
    private Long Permanent;

    /**
    * Identity card number
    */
    @SerializedName("IdNum")
    @Expose
    private String IdNum;

    /**
    * Document symbol, i.e., the symbol under the date of birth, such as "***AZ"
    */
    @SerializedName("Symbol")
    @Expose
    private String Symbol;

    /**
    * First issue date
    */
    @SerializedName("FirstIssueDate")
    @Expose
    private String FirstIssueDate;

    /**
    * Last receipt date
    */
    @SerializedName("CurrentIssueDate")
    @Expose
    private String CurrentIssueDate;

    /**
    * Authenticity check.
0: unable to judge (because the image is blurred, incomplete, reflective, too dark, etc.);
1: forged;
2: authentic.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FakeDetectResult")
    @Expose
    private Long FakeDetectResult;

    /**
    * Base64-encoded identity photo
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HeadImage")
    @Expose
    private String HeadImage;

    /**
    * Multiple alarm codes. If the ID card is spoofed, photocopied, or doctored, the corresponding alarm code will be returned.
-9102: alarm for photocopied document
-9103: alarm for spoofed document
-9104: alarm for doctored document
-9105: alarm for forged document
    */
    @SerializedName("WarningCode")
    @Expose
    private Long [] WarningCode;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name in Chinese 
     * @return CnName Name in Chinese
     */
    public String getCnName() {
        return this.CnName;
    }

    /**
     * Set Name in Chinese
     * @param CnName Name in Chinese
     */
    public void setCnName(String CnName) {
        this.CnName = CnName;
    }

    /**
     * Get Name in English 
     * @return EnName Name in English
     */
    public String getEnName() {
        return this.EnName;
    }

    /**
     * Set Name in English
     * @param EnName Name in English
     */
    public void setEnName(String EnName) {
        this.EnName = EnName;
    }

    /**
     * Get Telecode for the name in Chinese 
     * @return TelexCode Telecode for the name in Chinese
     */
    public String getTelexCode() {
        return this.TelexCode;
    }

    /**
     * Set Telecode for the name in Chinese
     * @param TelexCode Telecode for the name in Chinese
     */
    public void setTelexCode(String TelexCode) {
        this.TelexCode = TelexCode;
    }

    /**
     * Get Gender. Valid values: Male, Female 
     * @return Sex Gender. Valid values: Male, Female
     */
    public String getSex() {
        return this.Sex;
    }

    /**
     * Set Gender. Valid values: Male, Female
     * @param Sex Gender. Valid values: Male, Female
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
     * Get Permanent identity card.
0: non-permanent;
1: permanent;
-1: unknown. 
     * @return Permanent Permanent identity card.
0: non-permanent;
1: permanent;
-1: unknown.
     */
    public Long getPermanent() {
        return this.Permanent;
    }

    /**
     * Set Permanent identity card.
0: non-permanent;
1: permanent;
-1: unknown.
     * @param Permanent Permanent identity card.
0: non-permanent;
1: permanent;
-1: unknown.
     */
    public void setPermanent(Long Permanent) {
        this.Permanent = Permanent;
    }

    /**
     * Get Identity card number 
     * @return IdNum Identity card number
     */
    public String getIdNum() {
        return this.IdNum;
    }

    /**
     * Set Identity card number
     * @param IdNum Identity card number
     */
    public void setIdNum(String IdNum) {
        this.IdNum = IdNum;
    }

    /**
     * Get Document symbol, i.e., the symbol under the date of birth, such as "***AZ" 
     * @return Symbol Document symbol, i.e., the symbol under the date of birth, such as "***AZ"
     */
    public String getSymbol() {
        return this.Symbol;
    }

    /**
     * Set Document symbol, i.e., the symbol under the date of birth, such as "***AZ"
     * @param Symbol Document symbol, i.e., the symbol under the date of birth, such as "***AZ"
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }

    /**
     * Get First issue date 
     * @return FirstIssueDate First issue date
     */
    public String getFirstIssueDate() {
        return this.FirstIssueDate;
    }

    /**
     * Set First issue date
     * @param FirstIssueDate First issue date
     */
    public void setFirstIssueDate(String FirstIssueDate) {
        this.FirstIssueDate = FirstIssueDate;
    }

    /**
     * Get Last receipt date 
     * @return CurrentIssueDate Last receipt date
     */
    public String getCurrentIssueDate() {
        return this.CurrentIssueDate;
    }

    /**
     * Set Last receipt date
     * @param CurrentIssueDate Last receipt date
     */
    public void setCurrentIssueDate(String CurrentIssueDate) {
        this.CurrentIssueDate = CurrentIssueDate;
    }

    /**
     * Get Authenticity check.
0: unable to judge (because the image is blurred, incomplete, reflective, too dark, etc.);
1: forged;
2: authentic.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return FakeDetectResult Authenticity check.
0: unable to judge (because the image is blurred, incomplete, reflective, too dark, etc.);
1: forged;
2: authentic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getFakeDetectResult() {
        return this.FakeDetectResult;
    }

    /**
     * Set Authenticity check.
0: unable to judge (because the image is blurred, incomplete, reflective, too dark, etc.);
1: forged;
2: authentic.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param FakeDetectResult Authenticity check.
0: unable to judge (because the image is blurred, incomplete, reflective, too dark, etc.);
1: forged;
2: authentic.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setFakeDetectResult(Long FakeDetectResult) {
        this.FakeDetectResult = FakeDetectResult;
    }

    /**
     * Get Base64-encoded identity photo
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return HeadImage Base64-encoded identity photo
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getHeadImage() {
        return this.HeadImage;
    }

    /**
     * Set Base64-encoded identity photo
Note: this field may return null, indicating that no valid values can be obtained.
     * @param HeadImage Base64-encoded identity photo
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setHeadImage(String HeadImage) {
        this.HeadImage = HeadImage;
    }

    /**
     * Get Multiple alarm codes. If the ID card is spoofed, photocopied, or doctored, the corresponding alarm code will be returned.
-9102: alarm for photocopied document
-9103: alarm for spoofed document
-9104: alarm for doctored document
-9105: alarm for forged document 
     * @return WarningCode Multiple alarm codes. If the ID card is spoofed, photocopied, or doctored, the corresponding alarm code will be returned.
-9102: alarm for photocopied document
-9103: alarm for spoofed document
-9104: alarm for doctored document
-9105: alarm for forged document
     */
    public Long [] getWarningCode() {
        return this.WarningCode;
    }

    /**
     * Set Multiple alarm codes. If the ID card is spoofed, photocopied, or doctored, the corresponding alarm code will be returned.
-9102: alarm for photocopied document
-9103: alarm for spoofed document
-9104: alarm for doctored document
-9105: alarm for forged document
     * @param WarningCode Multiple alarm codes. If the ID card is spoofed, photocopied, or doctored, the corresponding alarm code will be returned.
-9102: alarm for photocopied document
-9103: alarm for spoofed document
-9104: alarm for doctored document
-9105: alarm for forged document
     */
    public void setWarningCode(Long [] WarningCode) {
        this.WarningCode = WarningCode;
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

    public HKIDCardOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HKIDCardOCRResponse(HKIDCardOCRResponse source) {
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
            this.Permanent = new Long(source.Permanent);
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
        if (source.FakeDetectResult != null) {
            this.FakeDetectResult = new Long(source.FakeDetectResult);
        }
        if (source.HeadImage != null) {
            this.HeadImage = new String(source.HeadImage);
        }
        if (source.WarningCode != null) {
            this.WarningCode = new Long[source.WarningCode.length];
            for (int i = 0; i < source.WarningCode.length; i++) {
                this.WarningCode[i] = new Long(source.WarningCode[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
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
        this.setParamSimple(map, prefix + "FakeDetectResult", this.FakeDetectResult);
        this.setParamSimple(map, prefix + "HeadImage", this.HeadImage);
        this.setParamArraySimple(map, prefix + "WarningCode.", this.WarningCode);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

