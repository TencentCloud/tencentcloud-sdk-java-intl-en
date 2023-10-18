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

public class AdaptiveDynamicStreamingInfoItem extends AbstractModel {

    /**
    * Adaptive bitrate streaming specification.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The packaging format. Valid values:
<li>`HLS`</li>
<li>`DASH`</li>
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * Encryption type.
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * Playback address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * File size (bytes)
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
<li>If the file is a DASH file, the value of this parameter is the sum of the size of the MPD and segment files.</li>
<li><font color=red>Note</font>: For adaptive bitrate streaming files generated before 2022-01-10T16:00:00Z, the value of this parameter is `0`.</li>
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
    */
    @SerializedName("DigitalWatermarkType")
    @Expose
    private String DigitalWatermarkType;

    /**
    * The information of the streams.
    */
    @SerializedName("SubStreamSet")
    @Expose
    private MediaSubStreamInfoItem [] SubStreamSet;

    /**
     * Get Adaptive bitrate streaming specification. 
     * @return Definition Adaptive bitrate streaming specification.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate streaming specification.
     * @param Definition Adaptive bitrate streaming specification.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The packaging format. Valid values:
<li>`HLS`</li>
<li>`DASH`</li> 
     * @return Package The packaging format. Valid values:
<li>`HLS`</li>
<li>`DASH`</li>
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * Set The packaging format. Valid values:
<li>`HLS`</li>
<li>`DASH`</li>
     * @param Package The packaging format. Valid values:
<li>`HLS`</li>
<li>`DASH`</li>
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * Get Encryption type. 
     * @return DrmType Encryption type.
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set Encryption type.
     * @param DrmType Encryption type.
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get Playback address. 
     * @return Url Playback address.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Playback address.
     * @param Url Playback address.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get File size (bytes)
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
<li>If the file is a DASH file, the value of this parameter is the sum of the size of the MPD and segment files.</li>
<li><font color=red>Note</font>: For adaptive bitrate streaming files generated before 2022-01-10T16:00:00Z, the value of this parameter is `0`.</li> 
     * @return Size File size (bytes)
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
<li>If the file is a DASH file, the value of this parameter is the sum of the size of the MPD and segment files.</li>
<li><font color=red>Note</font>: For adaptive bitrate streaming files generated before 2022-01-10T16:00:00Z, the value of this parameter is `0`.</li>
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size (bytes)
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
<li>If the file is a DASH file, the value of this parameter is the sum of the size of the MPD and segment files.</li>
<li><font color=red>Note</font>: For adaptive bitrate streaming files generated before 2022-01-10T16:00:00Z, the value of this parameter is `0`.</li>
     * @param Size File size (bytes)
<li>If the file is an HLS file, the value of this parameter is the sum of the size of the M3U8 and TS files.</li>
<li>If the file is a DASH file, the value of this parameter is the sum of the size of the MPD and segment files.</li>
<li><font color=red>Note</font>: For adaptive bitrate streaming files generated before 2022-01-10T16:00:00Z, the value of this parameter is `0`.</li>
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li> 
     * @return DigitalWatermarkType The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
     */
    public String getDigitalWatermarkType() {
        return this.DigitalWatermarkType;
    }

    /**
     * Set The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
     * @param DigitalWatermarkType The watermark type. Valid values:
<li>Trace: Digital watermark</li>
<li>None: Regular watermark</li>
     */
    public void setDigitalWatermarkType(String DigitalWatermarkType) {
        this.DigitalWatermarkType = DigitalWatermarkType;
    }

    /**
     * Get The information of the streams. 
     * @return SubStreamSet The information of the streams.
     */
    public MediaSubStreamInfoItem [] getSubStreamSet() {
        return this.SubStreamSet;
    }

    /**
     * Set The information of the streams.
     * @param SubStreamSet The information of the streams.
     */
    public void setSubStreamSet(MediaSubStreamInfoItem [] SubStreamSet) {
        this.SubStreamSet = SubStreamSet;
    }

    public AdaptiveDynamicStreamingInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingInfoItem(AdaptiveDynamicStreamingInfoItem source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Package != null) {
            this.Package = new String(source.Package);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.DigitalWatermarkType != null) {
            this.DigitalWatermarkType = new String(source.DigitalWatermarkType);
        }
        if (source.SubStreamSet != null) {
            this.SubStreamSet = new MediaSubStreamInfoItem[source.SubStreamSet.length];
            for (int i = 0; i < source.SubStreamSet.length; i++) {
                this.SubStreamSet[i] = new MediaSubStreamInfoItem(source.SubStreamSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "DigitalWatermarkType", this.DigitalWatermarkType);
        this.setParamArrayObj(map, prefix + "SubStreamSet.", this.SubStreamSet);

    }
}

