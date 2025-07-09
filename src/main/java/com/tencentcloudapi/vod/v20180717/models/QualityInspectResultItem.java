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
    * Abnormal type, range: <li>Jitter: Jitter;</li> <li>Blur: Blur;</li> <li>LowLighting: Low lighting;</li> <li>HighLighting: Overexposure;</li> <li>CrashScreen: Crash screen;</li> <li>BlackWhiteEdge: Black and white edges;</li> <li>SolidColorScreen: Solid color screen;</li> <li>Noise: Noise;</li> <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Applet code;</li> <li>BarCode: Bar code;</li> <li>LowVoice: Low voice;</li> <li>HighVoice: High voice;</li> <li>NoVoice: mutes;</li> <li>LowEvaluation: No reference scoring below the threshold.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Abnormal segment List. <font color=red>Pay attention to:</font> This list will only show the first 100 elements at most. If you wish to get the complete result, please get it from the file corresponding to SegmentSetFileUrl.
    */
    @SerializedName("SegmentSet")
    @Expose
    private QualityInspectItem [] SegmentSet;

    /**
    * Abnormal segment List file URL. The file content is JSON, and the data structure is consistent with the SegmentSet Field. (The file will not be permanently stored, and will be deleted after reaching the SegmentSetFileUrlExpireTime Time point).
    */
    @SerializedName("SegmentSetFileUrl")
    @Expose
    private String SegmentSetFileUrl;

    /**
    * Abnormal segment List file URL expiration time, using [ISO date supported](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
    */
    @SerializedName("SegmentSetFileUrlExpireTime")
    @Expose
    private String SegmentSetFileUrlExpireTime;

    /**
     * Get Abnormal type, range: <li>Jitter: Jitter;</li> <li>Blur: Blur;</li> <li>LowLighting: Low lighting;</li> <li>HighLighting: Overexposure;</li> <li>CrashScreen: Crash screen;</li> <li>BlackWhiteEdge: Black and white edges;</li> <li>SolidColorScreen: Solid color screen;</li> <li>Noise: Noise;</li> <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Applet code;</li> <li>BarCode: Bar code;</li> <li>LowVoice: Low voice;</li> <li>HighVoice: High voice;</li> <li>NoVoice: mutes;</li> <li>LowEvaluation: No reference scoring below the threshold.</li> 
     * @return Type Abnormal type, range: <li>Jitter: Jitter;</li> <li>Blur: Blur;</li> <li>LowLighting: Low lighting;</li> <li>HighLighting: Overexposure;</li> <li>CrashScreen: Crash screen;</li> <li>BlackWhiteEdge: Black and white edges;</li> <li>SolidColorScreen: Solid color screen;</li> <li>Noise: Noise;</li> <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Applet code;</li> <li>BarCode: Bar code;</li> <li>LowVoice: Low voice;</li> <li>HighVoice: High voice;</li> <li>NoVoice: mutes;</li> <li>LowEvaluation: No reference scoring below the threshold.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Abnormal type, range: <li>Jitter: Jitter;</li> <li>Blur: Blur;</li> <li>LowLighting: Low lighting;</li> <li>HighLighting: Overexposure;</li> <li>CrashScreen: Crash screen;</li> <li>BlackWhiteEdge: Black and white edges;</li> <li>SolidColorScreen: Solid color screen;</li> <li>Noise: Noise;</li> <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Applet code;</li> <li>BarCode: Bar code;</li> <li>LowVoice: Low voice;</li> <li>HighVoice: High voice;</li> <li>NoVoice: mutes;</li> <li>LowEvaluation: No reference scoring below the threshold.</li>
     * @param Type Abnormal type, range: <li>Jitter: Jitter;</li> <li>Blur: Blur;</li> <li>LowLighting: Low lighting;</li> <li>HighLighting: Overexposure;</li> <li>CrashScreen: Crash screen;</li> <li>BlackWhiteEdge: Black and white edges;</li> <li>SolidColorScreen: Solid color screen;</li> <li>Noise: Noise;</li> <li>Mosaic: Mosaic;</li> <li>QRCode: QR code;</li> <li>AppletCode: Applet code;</li> <li>BarCode: Bar code;</li> <li>LowVoice: Low voice;</li> <li>HighVoice: High voice;</li> <li>NoVoice: mutes;</li> <li>LowEvaluation: No reference scoring below the threshold.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Abnormal segment List. <font color=red>Pay attention to:</font> This list will only show the first 100 elements at most. If you wish to get the complete result, please get it from the file corresponding to SegmentSetFileUrl. 
     * @return SegmentSet Abnormal segment List. <font color=red>Pay attention to:</font> This list will only show the first 100 elements at most. If you wish to get the complete result, please get it from the file corresponding to SegmentSetFileUrl.
     */
    public QualityInspectItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * Set Abnormal segment List. <font color=red>Pay attention to:</font> This list will only show the first 100 elements at most. If you wish to get the complete result, please get it from the file corresponding to SegmentSetFileUrl.
     * @param SegmentSet Abnormal segment List. <font color=red>Pay attention to:</font> This list will only show the first 100 elements at most. If you wish to get the complete result, please get it from the file corresponding to SegmentSetFileUrl.
     */
    public void setSegmentSet(QualityInspectItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * Get Abnormal segment List file URL. The file content is JSON, and the data structure is consistent with the SegmentSet Field. (The file will not be permanently stored, and will be deleted after reaching the SegmentSetFileUrlExpireTime Time point). 
     * @return SegmentSetFileUrl Abnormal segment List file URL. The file content is JSON, and the data structure is consistent with the SegmentSet Field. (The file will not be permanently stored, and will be deleted after reaching the SegmentSetFileUrlExpireTime Time point).
     */
    public String getSegmentSetFileUrl() {
        return this.SegmentSetFileUrl;
    }

    /**
     * Set Abnormal segment List file URL. The file content is JSON, and the data structure is consistent with the SegmentSet Field. (The file will not be permanently stored, and will be deleted after reaching the SegmentSetFileUrlExpireTime Time point).
     * @param SegmentSetFileUrl Abnormal segment List file URL. The file content is JSON, and the data structure is consistent with the SegmentSet Field. (The file will not be permanently stored, and will be deleted after reaching the SegmentSetFileUrlExpireTime Time point).
     */
    public void setSegmentSetFileUrl(String SegmentSetFileUrl) {
        this.SegmentSetFileUrl = SegmentSetFileUrl;
    }

    /**
     * Get Abnormal segment List file URL expiration time, using [ISO date supported](https://www.tencentcloud.com/document/product/266/11732#iso-date-format). 
     * @return SegmentSetFileUrlExpireTime Abnormal segment List file URL expiration time, using [ISO date supported](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     */
    public String getSegmentSetFileUrlExpireTime() {
        return this.SegmentSetFileUrlExpireTime;
    }

    /**
     * Set Abnormal segment List file URL expiration time, using [ISO date supported](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
     * @param SegmentSetFileUrlExpireTime Abnormal segment List file URL expiration time, using [ISO date supported](https://www.tencentcloud.com/document/product/266/11732#iso-date-format).
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

