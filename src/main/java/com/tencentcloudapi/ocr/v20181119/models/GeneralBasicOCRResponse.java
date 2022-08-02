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

public class GeneralBasicOCRResponse extends AbstractModel{

    /**
    * Information of recognized text, including the text line content, confidence, text line coordinates, and text line coordinates after rotation correction. For more information, please click the link on the left.
    */
    @SerializedName("TextDetections")
    @Expose
    private TextDetection [] TextDetections;

    /**
    * Detected language. For more information on the supported languages, please see the description of the `LanguageType` input parameter.
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
    * Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a positive value: rotate clockwise; a negative value: rotate counterclockwise.
    */
    @SerializedName("Angel")
    @Expose
    private Float Angel;

    /**
    * Total number of PDF pages to be returned if the image is a PDF. Default value: 0.
    */
    @SerializedName("PdfPageSize")
    @Expose
    private Long PdfPageSize;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Information of recognized text, including the text line content, confidence, text line coordinates, and text line coordinates after rotation correction. For more information, please click the link on the left. 
     * @return TextDetections Information of recognized text, including the text line content, confidence, text line coordinates, and text line coordinates after rotation correction. For more information, please click the link on the left.
     */
    public TextDetection [] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * Set Information of recognized text, including the text line content, confidence, text line coordinates, and text line coordinates after rotation correction. For more information, please click the link on the left.
     * @param TextDetections Information of recognized text, including the text line content, confidence, text line coordinates, and text line coordinates after rotation correction. For more information, please click the link on the left.
     */
    public void setTextDetections(TextDetection [] TextDetections) {
        this.TextDetections = TextDetections;
    }

    /**
     * Get Detected language. For more information on the supported languages, please see the description of the `LanguageType` input parameter. 
     * @return Language Detected language. For more information on the supported languages, please see the description of the `LanguageType` input parameter.
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * Set Detected language. For more information on the supported languages, please see the description of the `LanguageType` input parameter.
     * @param Language Detected language. For more information on the supported languages, please see the description of the `LanguageType` input parameter.
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * Get Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a positive value: rotate clockwise; a negative value: rotate counterclockwise. 
     * @return Angel Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a positive value: rotate clockwise; a negative value: rotate counterclockwise.
     */
    public Float getAngel() {
        return this.Angel;
    }

    /**
     * Set Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a positive value: rotate clockwise; a negative value: rotate counterclockwise.
     * @param Angel Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a positive value: rotate clockwise; a negative value: rotate counterclockwise.
     */
    public void setAngel(Float Angel) {
        this.Angel = Angel;
    }

    /**
     * Get Total number of PDF pages to be returned if the image is a PDF. Default value: 0. 
     * @return PdfPageSize Total number of PDF pages to be returned if the image is a PDF. Default value: 0.
     */
    public Long getPdfPageSize() {
        return this.PdfPageSize;
    }

    /**
     * Set Total number of PDF pages to be returned if the image is a PDF. Default value: 0.
     * @param PdfPageSize Total number of PDF pages to be returned if the image is a PDF. Default value: 0.
     */
    public void setPdfPageSize(Long PdfPageSize) {
        this.PdfPageSize = PdfPageSize;
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

    public GeneralBasicOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GeneralBasicOCRResponse(GeneralBasicOCRResponse source) {
        if (source.TextDetections != null) {
            this.TextDetections = new TextDetection[source.TextDetections.length];
            for (int i = 0; i < source.TextDetections.length; i++) {
                this.TextDetections[i] = new TextDetection(source.TextDetections[i]);
            }
        }
        if (source.Language != null) {
            this.Language = new String(source.Language);
        }
        if (source.Angel != null) {
            this.Angel = new Float(source.Angel);
        }
        if (source.PdfPageSize != null) {
            this.PdfPageSize = new Long(source.PdfPageSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextDetections.", this.TextDetections);
        this.setParamSimple(map, prefix + "Language", this.Language);
        this.setParamSimple(map, prefix + "Angel", this.Angel);
        this.setParamSimple(map, prefix + "PdfPageSize", this.PdfPageSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

