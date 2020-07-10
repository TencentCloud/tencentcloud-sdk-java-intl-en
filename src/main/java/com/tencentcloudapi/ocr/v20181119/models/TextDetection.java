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

public class TextDetection extends AbstractModel{

    /**
    * Recognized text line content
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * Confidence. Value range: 0–100
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * Text line coordinates, which are represented as 4 vertex coordinates
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * Extended field.
The paragraph information `Parag` returned by the `GeneralBasicOcr` API contains `ParagNo`.
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
    * Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`
    */
    @SerializedName("ItemPolygon")
    @Expose
    private ItemCoord ItemPolygon;

    /**
     * Get Recognized text line content 
     * @return DetectedText Recognized text line content
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set Recognized text line content
     * @param DetectedText Recognized text line content
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get Confidence. Value range: 0–100 
     * @return Confidence Confidence. Value range: 0–100
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence. Value range: 0–100
     * @param Confidence Confidence. Value range: 0–100
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Text line coordinates, which are represented as 4 vertex coordinates
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Polygon Text line coordinates, which are represented as 4 vertex coordinates
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set Text line coordinates, which are represented as 4 vertex coordinates
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Polygon Text line coordinates, which are represented as 4 vertex coordinates
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * Get Extended field.
The paragraph information `Parag` returned by the `GeneralBasicOcr` API contains `ParagNo`. 
     * @return AdvancedInfo Extended field.
The paragraph information `Parag` returned by the `GeneralBasicOcr` API contains `ParagNo`.
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * Set Extended field.
The paragraph information `Parag` returned by the `GeneralBasicOcr` API contains `ParagNo`.
     * @param AdvancedInfo Extended field.
The paragraph information `Parag` returned by the `GeneralBasicOcr` API contains `ParagNo`.
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * Get Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)` 
     * @return ItemPolygon Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`
     */
    public ItemCoord getItemPolygon() {
        return this.ItemPolygon;
    }

    /**
     * Set Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`
     * @param ItemPolygon Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`
     */
    public void setItemPolygon(ItemCoord ItemPolygon) {
        this.ItemPolygon = ItemPolygon;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectedText", this.DetectedText);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);
        this.setParamObj(map, prefix + "ItemPolygon.", this.ItemPolygon);

    }
}

