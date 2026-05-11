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

public class QualityInspectResultItem extends AbstractModel {

    /**
    * Exception type. Valid values:
<li>Jitter: jitter.</li>
<li>Blur: blurry;</li>
<li>LowLighting: low light;</li>
<li>HighLighting: overexposure.</li>
<li>CrashScreen: screen glitch;</li>
<li>BlackWhiteEdge: black and white edges.</li>
<li>SolidColorScreen: solid color screen.</li>
<li>Noise: noise.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode;</li>
<li>LowVoice: bass;</li>
<li>HighVoice: high voice;</li>
<li>NoVoice: mute;</li>
<li>LowEvaluation: no-reference scoring below threshold.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Abnormal fragment list.
<font color=red>Note:</font> The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private QualityInspectItem [] SegmentSet;

    /**
    * URL of Abnormal Fragment List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Expiration time of the Segment List File URL for anomalies, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Exception type. Valid values:
<li>Jitter: jitter.</li>
<li>Blur: blurry;</li>
<li>LowLighting: low light;</li>
<li>HighLighting: overexposure.</li>
<li>CrashScreen: screen glitch;</li>
<li>BlackWhiteEdge: black and white edges.</li>
<li>SolidColorScreen: solid color screen.</li>
<li>Noise: noise.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode;</li>
<li>LowVoice: bass;</li>
<li>HighVoice: high voice;</li>
<li>NoVoice: mute;</li>
<li>LowEvaluation: no-reference scoring below threshold.</li> 
     * @return Type Exception type. Valid values:
<li>Jitter: jitter.</li>
<li>Blur: blurry;</li>
<li>LowLighting: low light;</li>
<li>HighLighting: overexposure.</li>
<li>CrashScreen: screen glitch;</li>
<li>BlackWhiteEdge: black and white edges.</li>
<li>SolidColorScreen: solid color screen.</li>
<li>Noise: noise.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode;</li>
<li>LowVoice: bass;</li>
<li>HighVoice: high voice;</li>
<li>NoVoice: mute;</li>
<li>LowEvaluation: no-reference scoring below threshold.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exception type. Valid values:
<li>Jitter: jitter.</li>
<li>Blur: blurry;</li>
<li>LowLighting: low light;</li>
<li>HighLighting: overexposure.</li>
<li>CrashScreen: screen glitch;</li>
<li>BlackWhiteEdge: black and white edges.</li>
<li>SolidColorScreen: solid color screen.</li>
<li>Noise: noise.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode;</li>
<li>LowVoice: bass;</li>
<li>HighVoice: high voice;</li>
<li>NoVoice: mute;</li>
<li>LowEvaluation: no-reference scoring below threshold.</li>
     * @param Type Exception type. Valid values:
<li>Jitter: jitter.</li>
<li>Blur: blurry;</li>
<li>LowLighting: low light;</li>
<li>HighLighting: overexposure.</li>
<li>CrashScreen: screen glitch;</li>
<li>BlackWhiteEdge: black and white edges.</li>
<li>SolidColorScreen: solid color screen.</li>
<li>Noise: noise.</li>
<li>Mosaic: mosaic.</li>
<li>QRCode: QR code.</li>
<li>AppletCode: mini program code.</li>
<li>BarCode: barcode;</li>
<li>LowVoice: bass;</li>
<li>HighVoice: high voice;</li>
<li>NoVoice: mute;</li>
<li>LowEvaluation: no-reference scoring below threshold.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Abnormal fragment list.
<font color=red>Note:</font> The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl. 
     * @return SegmentSet Abnormal fragment list.
<font color=red>Note:</font> The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     */
    public QualityInspectItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Abnormal fragment list.
<font color=red>Note:</font> The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     * @param SegmentSet Abnormal fragment list.
<font color=red>Note:</font> The list only displays the first 100 elements. To obtain the complete result, refer to the corresponding file in SegmentSetFileUrl.
     */
    public void setSegmentSet(QualityInspectItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get URL of Abnormal Fragment List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.) 
     * @return SegmentSetFileUrl URL of Abnormal Fragment List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set URL of Abnormal Fragment List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     * @param SegmentSetFileUrl URL of Abnormal Fragment List File. The content of the file is JSON, consistent with the fields of SegmentSet. (The file will not be retained permanently and will be deleted when reaching SegmentSetFileUrlExpireTime.)
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Expiration time of the Segment List File URL for anomalies, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return SegmentSetFileUrlExpireTime Expiration time of the Segment List File URL for anomalies, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Expiration time of the Segment List File URL for anomalies, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param SegmentSetFileUrlExpireTime Expiration time of the Segment List File URL for anomalies, in [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setSegmentSetFileUrlExpireTime(String SegmentSetFileUrlExpireTime) {
        this.SegmentSetFileUrlExpireTime = SegmentSetFileUrlExpireTime;
    }

    public QualityInspectResultItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityInspectResultItem(QualityInspectResultItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.SegmentSet != null) {
            this.SegmentSet = new QualityInspectItem[source.SegmentSet.length];
            for (int i = 0; i < source.SegmentSet.length; i++) {
                this.SegmentSet[i] = new QualityInspectItem(source.SegmentSet[i]);
            }
        }
        if (source.SegmentSetFileUrl != null) {
            this.SegmentSetFileUrl = new String(source.SegmentSetFileUrl);
        }
        if (source.SegmentSetFileUrlExpireTime != null) {
            this.SegmentSetFileUrlExpireTime = new String(source.SegmentSetFileUrlExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);
        this.setParamSimple(map, prefix + "SegmentSetFileUrl", this.SegmentSetFileUrl);
        this.setParamSimple(map, prefix + "SegmentSetFileUrlExpireTime", this.SegmentSetFileUrlExpireTime);

    }
}

