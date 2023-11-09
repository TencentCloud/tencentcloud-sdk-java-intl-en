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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectItem extends AbstractModel {

    /**
    * Abnormal segment start offset time, unit: seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Abnormal segment termination's offset time, unit: seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Detect abnormality in the area coordinates. The array contains 4 elements [x1, y1, x2, y2], which indicate the horizontal and vertical coordinates of the upper left and lower right points of the area in sequence. <font color=red>Pay attention to:</font> The value of this field is valid only when Type is one of the following: <li>BlackWhiteEdge: black and white edge;</li> <li>Mosaic: mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: bar code.</li>
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Confidence threshold, range: [0, 100]. <font color=red>Pay attention to:</font> This field is valid only when Type has one of the following values: <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: Bar code.</li>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
     * Get Abnormal segment start offset time, unit: seconds. 
     * @return StartTimeOffset Abnormal segment start offset time, unit: seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Abnormal segment start offset time, unit: seconds.
     * @param StartTimeOffset Abnormal segment start offset time, unit: seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Abnormal segment termination's offset time, unit: seconds. 
     * @return EndTimeOffset Abnormal segment termination's offset time, unit: seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Abnormal segment termination's offset time, unit: seconds.
     * @param EndTimeOffset Abnormal segment termination's offset time, unit: seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Detect abnormality in the area coordinates. The array contains 4 elements [x1, y1, x2, y2], which indicate the horizontal and vertical coordinates of the upper left and lower right points of the area in sequence. <font color=red>Pay attention to:</font> The value of this field is valid only when Type is one of the following: <li>BlackWhiteEdge: black and white edge;</li> <li>Mosaic: mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: bar code.</li> 
     * @return AreaCoordSet Detect abnormality in the area coordinates. The array contains 4 elements [x1, y1, x2, y2], which indicate the horizontal and vertical coordinates of the upper left and lower right points of the area in sequence. <font color=red>Pay attention to:</font> The value of this field is valid only when Type is one of the following: <li>BlackWhiteEdge: black and white edge;</li> <li>Mosaic: mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: bar code.</li>
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Detect abnormality in the area coordinates. The array contains 4 elements [x1, y1, x2, y2], which indicate the horizontal and vertical coordinates of the upper left and lower right points of the area in sequence. <font color=red>Pay attention to:</font> The value of this field is valid only when Type is one of the following: <li>BlackWhiteEdge: black and white edge;</li> <li>Mosaic: mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: bar code.</li>
     * @param AreaCoordSet Detect abnormality in the area coordinates. The array contains 4 elements [x1, y1, x2, y2], which indicate the horizontal and vertical coordinates of the upper left and lower right points of the area in sequence. <font color=red>Pay attention to:</font> The value of this field is valid only when Type is one of the following: <li>BlackWhiteEdge: black and white edge;</li> <li>Mosaic: mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: bar code.</li>
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Confidence threshold, range: [0, 100]. <font color=red>Pay attention to:</font> This field is valid only when Type has one of the following values: <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: Bar code.</li> 
     * @return Confidence Confidence threshold, range: [0, 100]. <font color=red>Pay attention to:</font> This field is valid only when Type has one of the following values: <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: Bar code.</li>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence threshold, range: [0, 100]. <font color=red>Pay attention to:</font> This field is valid only when Type has one of the following values: <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: Bar code.</li>
     * @param Confidence Confidence threshold, range: [0, 100]. <font color=red>Pay attention to:</font> This field is valid only when Type has one of the following values: <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Mini Program code;</li> <li>BarCode: Bar code.</li>
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    public QualityInspectItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectItem(QualityInspectItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

