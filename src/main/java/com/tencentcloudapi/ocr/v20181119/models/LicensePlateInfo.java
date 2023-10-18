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

public class LicensePlateInfo extends AbstractModel {

    /**
    * The recognized license plate number.
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * The confidence score (0–100).
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * The bounding box coordinates of the text line in the original image.
    */
    @SerializedName("Rect")
    @Expose
    private Rect Rect;

    /**
    * The recognized license plate color, which currently includes "white", "black", "blue", "green", "yellow", "yellow-green", and "temporary plate".
    */
    @SerializedName("Color")
    @Expose
    private String Color;

    /**
     * Get The recognized license plate number. 
     * @return Number The recognized license plate number.
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * Set The recognized license plate number.
     * @param Number The recognized license plate number.
     */
    public void setNumber(String Number) {
        this.Number = Number;
    }

    /**
     * Get The confidence score (0–100). 
     * @return Confidence The confidence score (0–100).
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score (0–100).
     * @param Confidence The confidence score (0–100).
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The bounding box coordinates of the text line in the original image. 
     * @return Rect The bounding box coordinates of the text line in the original image.
     */
    public Rect getRect() {
        return this.Rect;
    }

    /**
     * Set The bounding box coordinates of the text line in the original image.
     * @param Rect The bounding box coordinates of the text line in the original image.
     */
    public void setRect(Rect Rect) {
        this.Rect = Rect;
    }

    /**
     * Get The recognized license plate color, which currently includes "white", "black", "blue", "green", "yellow", "yellow-green", and "temporary plate". 
     * @return Color The recognized license plate color, which currently includes "white", "black", "blue", "green", "yellow", "yellow-green", and "temporary plate".
     */
    public String getColor() {
        return this.Color;
    }

    /**
     * Set The recognized license plate color, which currently includes "white", "black", "blue", "green", "yellow", "yellow-green", and "temporary plate".
     * @param Color The recognized license plate color, which currently includes "white", "black", "blue", "green", "yellow", "yellow-green", and "temporary plate".
     */
    public void setColor(String Color) {
        this.Color = Color;
    }

    public LicensePlateInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicensePlateInfo(LicensePlateInfo source) {
        if (source.Number != null) {
            this.Number = new String(source.Number);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Rect != null) {
            this.Rect = new Rect(source.Rect);
        }
        if (source.Color != null) {
            this.Color = new String(source.Color);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamObj(map, prefix + "Rect.", this.Rect);
        this.setParamSimple(map, prefix + "Color", this.Color);

    }
}

