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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MedicalInvoice extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * 
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * 
    */
    @SerializedName("TotalCn")
    @Expose
    private String TotalCn;

    /**
    * 
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 
    */
    @SerializedName("CheckCode")
    @Expose
    private String CheckCode;

    /**
    * 
    */
    @SerializedName("Place")
    @Expose
    private String Place;

    /**
    * 
    */
    @SerializedName("Reviewer")
    @Expose
    private String Reviewer;

    /**
     * Get  
     * @return Title 
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 
     * @param Title 
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get  
     * @return Code 
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set 
     * @param Code 
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get  
     * @return Number 
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set 
     * @param Number 
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get  
     * @return Total 
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set 
     * @param Total 
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get  
     * @return TotalCn 
     */
    public String getTotalCn() {
        return this.TotalCn;
    }

    /**
     * Set 
     * @param TotalCn 
     */
    public void setTotalCn(String TotalCn) {
        this.TotalCn = TotalCn;
    }

    /**
     * Get  
     * @return Date 
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 
     * @param Date 
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get  
     * @return CheckCode 
     */
    public String getCheckCode() {
        return this.CheckCode;
    }

    /**
     * Set 
     * @param CheckCode 
     */
    public void setCheckCode(String CheckCode) {
        this.CheckCode = CheckCode;
    }

    /**
     * Get  
     * @return Place 
     */
    public String getPlace() {
        return this.Place;
    }

    /**
     * Set 
     * @param Place 
     */
    public void setPlace(String Place) {
        this.Place = Place;
    }

    /**
     * Get  
     * @return Reviewer 
     */
    public String getReviewer() {
        return this.Reviewer;
    }

    /**
     * Set 
     * @param Reviewer 
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

