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

public class TableOCRResponse extends AbstractModel{

    /**
    * Recognized text. For more information, please click the link on the left.
    */
    @SerializedName("TextDetections")
    @Expose
    private TextTable [] TextDetections;

    /**
    * Base64-encoded Excel data.
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Recognized text. For more information, please click the link on the left. 
     * @return TextDetections Recognized text. For more information, please click the link on the left.
     */
    public TextTable [] getTextDetections() {
        return this.TextDetections;
    }

    /**
     * Set Recognized text. For more information, please click the link on the left.
     * @param TextDetections Recognized text. For more information, please click the link on the left.
     */
    public void setTextDetections(TextTable [] TextDetections) {
        this.TextDetections = TextDetections;
    }

    /**
     * Get Base64-encoded Excel data. 
     * @return Data Base64-encoded Excel data.
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set Base64-encoded Excel data.
     * @param Data Base64-encoded Excel data.
     */
    public void setData(String Data) {
        this.Data = Data;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TextDetections.", this.TextDetections);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

