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

public class TextDetection extends AbstractModel {

    /**
    * Recognized text line content.
    */
    @SerializedName("DetectedText")
    @Expose
    private String DetectedText;

    /**
    * Confidence. Value range: 0–100.
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * Text line coordinates, which are represented as 4 vertex coordinates.
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
    * Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`.
    */
    @SerializedName("ItemPolygon")
    @Expose
    private ItemCoord ItemPolygon;

    /**
    * Information about a character, including the character itself and its confidence. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
    */
    @SerializedName("Words")
    @Expose
    private DetectedWords [] Words;

    /**
    * Coordinates of a word’s four corners on the input image. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
    */
    @SerializedName("WordCoordPoint")
    @Expose
    private DetectedWordCoordPoint [] WordCoordPoint;

    /**
     * Get Recognized text line content. 
     * @return DetectedText Recognized text line content.
     */
    public String getDetectedText() {
        return this.DetectedText;
    }

    /**
     * Set Recognized text line content.
     * @param DetectedText Recognized text line content.
     */
    public void setDetectedText(String DetectedText) {
        this.DetectedText = DetectedText;
    }

    /**
     * Get Confidence. Value range: 0–100. 
     * @return Confidence Confidence. Value range: 0–100.
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence. Value range: 0–100.
     * @param Confidence Confidence. Value range: 0–100.
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get Text line coordinates, which are represented as 4 vertex coordinates.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Polygon Text line coordinates, which are represented as 4 vertex coordinates.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * Set Text line coordinates, which are represented as 4 vertex coordinates.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Polygon Text line coordinates, which are represented as 4 vertex coordinates.
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
     * Get Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`. 
     * @return ItemPolygon Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`.
     */
    public ItemCoord getItemPolygon() {
        return this.ItemPolygon;
    }

    /**
     * Set Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`.
     * @param ItemPolygon Pixel coordinates of the text line in the image after rotation correction, which is in the format of `(X-coordinate of top-left point, Y-coordinate of top-left point, width, height)`.
     */
    public void setItemPolygon(ItemCoord ItemPolygon) {
        this.ItemPolygon = ItemPolygon;
    }

    /**
     * Get Information about a character, including the character itself and its confidence. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR` 
     * @return Words Information about a character, including the character itself and its confidence. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
     */
    public DetectedWords [] getWords() {
        return this.Words;
    }

    /**
     * Set Information about a character, including the character itself and its confidence. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
     * @param Words Information about a character, including the character itself and its confidence. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
     */
    public void setWords(DetectedWords [] Words) {
        this.Words = Words;
    }

    /**
     * Get Coordinates of a word’s four corners on the input image. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR` 
     * @return WordCoordPoint Coordinates of a word’s four corners on the input image. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
     */
    public DetectedWordCoordPoint [] getWordCoordPoint() {
        return this.WordCoordPoint;
    }

    /**
     * Set Coordinates of a word’s four corners on the input image. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
     * @param WordCoordPoint Coordinates of a word’s four corners on the input image. Supported APIs: `GeneralBasicOCR`, `GeneralAccurateOCR`
     */
    public void setWordCoordPoint(DetectedWordCoordPoint [] WordCoordPoint) {
        this.WordCoordPoint = WordCoordPoint;
    }

    public TextDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TextDetection(TextDetection source) {
        if (source.DetectedText != null) {
            this.DetectedText = new String(source.DetectedText);
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.Polygon != null) {
            this.Polygon = new Coord[source.Polygon.length];
            for (int i = 0; i < source.Polygon.length; i++) {
                this.Polygon[i] = new Coord(source.Polygon[i]);
            }
        }
        if (source.AdvancedInfo != null) {
            this.AdvancedInfo = new String(source.AdvancedInfo);
        }
        if (source.ItemPolygon != null) {
            this.ItemPolygon = new ItemCoord(source.ItemPolygon);
        }
        if (source.Words != null) {
            this.Words = new DetectedWords[source.Words.length];
            for (int i = 0; i < source.Words.length; i++) {
                this.Words[i] = new DetectedWords(source.Words[i]);
            }
        }
        if (source.WordCoordPoint != null) {
            this.WordCoordPoint = new DetectedWordCoordPoint[source.WordCoordPoint.length];
            for (int i = 0; i < source.WordCoordPoint.length; i++) {
                this.WordCoordPoint[i] = new DetectedWordCoordPoint(source.WordCoordPoint[i]);
            }
        }
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
        this.setParamArrayObj(map, prefix + "Words.", this.Words);
        this.setParamArrayObj(map, prefix + "WordCoordPoint.", this.WordCoordPoint);

    }
}

