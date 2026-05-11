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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityInspectItem extends AbstractModel {

    /**
    * Offset time of abnormal segment start, in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of an abnormal fragment, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Detected abnormal area coordinates. The array contains 4 elements [x1,y1,x2,y2], sequentially representing the horizontal and vertical coordinates of the top-left corner and bottom-right point.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>BlackWhiteEdge: black and white edges.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
    * Confidence degree, value ranges from 0 to 100.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
     * Get Offset time of abnormal segment start, in seconds. 
     * @return StartTimeOffset Offset time of abnormal segment start, in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Offset time of abnormal segment start, in seconds.
     * @param StartTimeOffset Offset time of abnormal segment start, in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of an abnormal fragment, in seconds. 
     * @return EndTimeOffset End time offset of an abnormal fragment, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of an abnormal fragment, in seconds.
     * @param EndTimeOffset End time offset of an abnormal fragment, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Detected abnormal area coordinates. The array contains 4 elements [x1,y1,x2,y2], sequentially representing the horizontal and vertical coordinates of the top-left corner and bottom-right point.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>BlackWhiteEdge: black and white edges.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li> 
     * @return AreaCoordSet Detected abnormal area coordinates. The array contains 4 elements [x1,y1,x2,y2], sequentially representing the horizontal and vertical coordinates of the top-left corner and bottom-right point.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>BlackWhiteEdge: black and white edges.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set Detected abnormal area coordinates. The array contains 4 elements [x1,y1,x2,y2], sequentially representing the horizontal and vertical coordinates of the top-left corner and bottom-right point.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>BlackWhiteEdge: black and white edges.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
     * @param AreaCoordSet Detected abnormal area coordinates. The array contains 4 elements [x1,y1,x2,y2], sequentially representing the horizontal and vertical coordinates of the top-left corner and bottom-right point.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>BlackWhiteEdge: black and white edges.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    /**
     * Get Confidence degree, value ranges from 0 to 100.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li> 
     * @return Confidence Confidence degree, value ranges from 0 to 100.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Confidence degree, value ranges from 0 to 100.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
     * @param Confidence Confidence degree, value ranges from 0 to 100.
<font color=red>Note:</font> This field is valid only when the Type value is one of the following:
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode.</li>
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

