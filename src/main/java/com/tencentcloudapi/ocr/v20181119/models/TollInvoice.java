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

public class TollInvoice extends AbstractModel {

    /**
    * Invoice title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Invoice code
    */
    @SerializedName("Code")
    @Expose
    private String Code;

    /**
    * Invoice number
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * Total amount (in figures)
    */
    @SerializedName("Total")
    @Expose
    private String Total;

    /**
    * Invoice type
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * Date
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * Time
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Entrance
    */
    @SerializedName("Entrance")
    @Expose
    private String Entrance;

    /**
    * Exit
    */
    @SerializedName("Exit")
    @Expose
    private String Exit;

    /**
    * Highway mark (0: No, 1: Yes)
    */
    @SerializedName("HighwayMark")
    @Expose
    private Long HighwayMark;

    /**
    * Whether there is a QR code (0: No, 1: Yes)
    */
    @SerializedName("QRCodeMark")
    @Expose
    private Long QRCodeMark;

    /**
     * Get Invoice title 
     * @return Title Invoice title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Invoice title
     * @param Title Invoice title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Invoice code 
     * @return Code Invoice code
     */
    public String getCode() {
        return this.Code;
    }

    /**
     * Set Invoice code
     * @param Code Invoice code
     */
    public void setCode(String Code) {
        this.Code = Code;
    }

    /**
     * Get Invoice number 
     * @return Number Invoice number
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set Invoice number
     * @param Number Invoice number
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get Total amount (in figures) 
     * @return Total Total amount (in figures)
     */
    public String getTotal() {
        return this.Total;
    }

    /**
     * Set Total amount (in figures)
     * @param Total Total amount (in figures)
     */
    public void setTotal(String Total) {
        this.Total = Total;
    }

    /**
     * Get Invoice type 
     * @return Kind Invoice type
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set Invoice type
     * @param Kind Invoice type
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get Date 
     * @return Date Date
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set Date
     * @param Date Date
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get Time 
     * @return Time Time
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time
     * @param Time Time
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Entrance 
     * @return Entrance Entrance
     */
    public String getEntrance() {
        return this.Entrance;
    }

    /**
     * Set Entrance
     * @param Entrance Entrance
     */
    public void setEntrance(String Entrance) {
        this.Entrance = Entrance;
    }

    /**
     * Get Exit 
     * @return Exit Exit
     */
    public String getExit() {
        return this.Exit;
    }

    /**
     * Set Exit
     * @param Exit Exit
     */
    public void setExit(String Exit) {
        this.Exit = Exit;
    }

    /**
     * Get Highway mark (0: No, 1: Yes) 
     * @return HighwayMark Highway mark (0: No, 1: Yes)
     */
    public Long getHighwayMark() {
        return this.HighwayMark;
    }

    /**
     * Set Highway mark (0: No, 1: Yes)
     * @param HighwayMark Highway mark (0: No, 1: Yes)
     */
    public void setHighwayMark(Long HighwayMark) {
        this.HighwayMark = HighwayMark;
    }

    /**
     * Get Whether there is a QR code (0: No, 1: Yes) 
     * @return QRCodeMark Whether there is a QR code (0: No, 1: Yes)
     */
    public Long getQRCodeMark() {
        return this.QRCodeMark;
    }

    /**
     * Set Whether there is a QR code (0: No, 1: Yes)
     * @param QRCodeMark Whether there is a QR code (0: No, 1: Yes)
     */
    public void setQRCodeMark(Long QRCodeMark) {
        this.QRCodeMark = QRCodeMark;
    }

    public TollInvoice() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TollInvoice(TollInvoice source) {
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
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Entrance != null) {
            this.Entrance = new String(source.Entrance);
        }
        if (source.Exit != null) {
            this.Exit = new String(source.Exit);
        }
        if (source.HighwayMark != null) {
            this.HighwayMark = new Long(source.HighwayMark);
        }
        if (source.QRCodeMark != null) {
            this.QRCodeMark = new Long(source.QRCodeMark);
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
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Entrance", this.Entrance);
        this.setParamSimple(map, prefix + "Exit", this.Exit);
        this.setParamSimple(map, prefix + "HighwayMark", this.HighwayMark);
        this.setParamSimple(map, prefix + "QRCodeMark", this.QRCodeMark);

    }
}

