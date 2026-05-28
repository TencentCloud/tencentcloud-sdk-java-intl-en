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

public class MedicalInvoice extends AbstractModel {

    /**
    * Invoice name.
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Invoice code.
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Invoice number.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Total amount (in figures).
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Total Amount (in words).
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * Invoice date.
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Verification code
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * Place of Issue.
    */
    @SerializedName("Place")
    @Expose
    private String Place;

    /**
    * Reviewer.
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
     * Get Invoice name. 
     * @return Title Invoice name.
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Invoice name.
     * @param Title Invoice name.
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Invoice code. 
     * @return Code Invoice code.
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Invoice code.
     * @param Code Invoice code.
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Invoice number. 
     * @return Number Invoice number.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Invoice number.
     * @param Number Invoice number.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Total amount (in figures). 
     * @return Total Total amount (in figures).
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Total amount (in figures).
     * @param Total Total amount (in figures).
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Total Amount (in words). 
     * @return TotalCn Total Amount (in words).
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set Total Amount (in words).
     * @param TotalCn Total Amount (in words).
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get Invoice date. 
     * @return Date Invoice date.
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Invoice date.
     * @param Date Invoice date.
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Verification code 
     * @return CheckCode Verification code
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set Verification code
     * @param CheckCode Verification code
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get Place of Issue. 
     * @return Place Place of Issue.
     */
    public String getPlace() {
        return this.Place;
    }

    /**
     * Set Place of Issue.
     * @param Place Place of Issue.
     */
    public void setPlace(String Place) {
        this.Place = Place;
    }

    /**
     * Get Reviewer. 
     * @return Reviewer Reviewer.
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set Reviewer.
     * @param Reviewer Reviewer.
     */
    public void setReviewer(String Reviewer) {
        this.Reviewer = Reviewer;
    }

    public MedicalInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MedicalInvoice(MedicalInvoice source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Code != null) {
            this.Code = new String(source.Code);
        }
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Total != null) {
            this.Total = new String(source.Total);
        }
        if (source.TotalCn != null) {
            this.TotalCn = new String(source.TotalCn);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.CheckCode != null) {
            this.CheckCode = new String(source.CheckCode);
        }
        if (source.Place != null) {
            this.Place = new String(source.Place);
        }
        if (source.Reviewer != null) {
            this.Reviewer = new String(source.Reviewer);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Code", this.Code);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "TotalCn", this.TotalCn);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "CheckCode", this.CheckCode);
        this.setParamSimple(map, prefix + "Place", this.Place);
        this.setParamSimple(map, prefix + "Reviewer", this.Reviewer);

    }
}

