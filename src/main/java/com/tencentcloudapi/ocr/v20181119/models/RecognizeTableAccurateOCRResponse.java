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

public class RecognizeTableAccurateOCRResponse extends AbstractModel{

    /**
    * The recognized text information. Please click the link on the left for details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TableDetections")
    @Expose
    private TableInfo [] TableDetections;

    /**
    * Base64-encoded Excel data.
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * The total number of pages in the PDF file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PdfPageSize")
    @Expose
    private Long PdfPageSize;

    /**
    * Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a negative value: rotate counterclockwise. Value range: -360° to 0°.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The recognized text information. Please click the link on the left for details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TableDetections The recognized text information. Please click the link on the left for details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TableInfo [] getTableDetections() {
        return this.TableDetections;
    }

    /**
     * Set The recognized text information. Please click the link on the left for details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TableDetections The recognized text information. Please click the link on the left for details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTableDetections(TableInfo [] TableDetections) {
        this.TableDetections = TableDetections;
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
     * Get The total number of pages in the PDF file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PdfPageSize The total number of pages in the PDF file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPdfPageSize() {
        return this.PdfPageSize;
    }

    /**
     * Set The total number of pages in the PDF file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PdfPageSize The total number of pages in the PDF file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPdfPageSize(Long PdfPageSize) {
        this.PdfPageSize = PdfPageSize;
    }

    /**
     * Get Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a negative value: rotate counterclockwise. Value range: -360° to 0°.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Angle Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a negative value: rotate counterclockwise. Value range: -360° to 0°.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * Set Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a negative value: rotate counterclockwise. Value range: -360° to 0°.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Angle Image rotation angle in degrees. 0°: The horizontal direction of the text on the image; a negative value: rotate counterclockwise. Value range: -360° to 0°.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
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

    public RecognizeTableAccurateOCRResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecognizeTableAccurateOCRResponse(RecognizeTableAccurateOCRResponse source) {
        if (source.TableDetections != null) {
            this.TableDetections = new TableInfo[source.TableDetections.length];
            for (int i = 0; i < source.TableDetections.length; i++) {
                this.TableDetections[i] = new TableInfo(source.TableDetections[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new String(source.Data);
        }
        if (source.PdfPageSize != null) {
            this.PdfPageSize = new Long(source.PdfPageSize);
        }
        if (source.Angle != null) {
            this.Angle = new Float(source.Angle);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TableDetections.", this.TableDetections);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "PdfPageSize", this.PdfPageSize);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

