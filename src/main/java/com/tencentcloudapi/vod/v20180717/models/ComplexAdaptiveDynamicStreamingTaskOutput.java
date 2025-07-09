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

public class ComplexAdaptiveDynamicStreamingTaskOutput extends AbstractModel {

    /**
    * Adaptive bitrate streaming template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * The adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>

    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * DRM scheme type, value range:
<li>Widevine;</li>
<li>FairPlay.</li>
The default value is an empty string, indicating that the video will not be DRM protected.
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * Playback address of the output manifest.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Adaptive bitrate streaming template ID. 
     * @return Definition Adaptive bitrate streaming template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate streaming template ID.
     * @param Definition Adaptive bitrate streaming template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get The adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
 
     * @return Format The adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>

     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set The adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>

     * @param Format The adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>

     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get DRM scheme type, value range:
<li>Widevine;</li>
<li>FairPlay.</li>
The default value is an empty string, indicating that the video will not be DRM protected. 
     * @return DrmType DRM scheme type, value range:
<li>Widevine;</li>
<li>FairPlay.</li>
The default value is an empty string, indicating that the video will not be DRM protected.
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM scheme type, value range:
<li>Widevine;</li>
<li>FairPlay.</li>
The default value is an empty string, indicating that the video will not be DRM protected.
     * @param DrmType DRM scheme type, value range:
<li>Widevine;</li>
<li>FairPlay.</li>
The default value is an empty string, indicating that the video will not be DRM protected.
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get Playback address of the output manifest. 
     * @return Url Playback address of the output manifest.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Playback address of the output manifest.
     * @param Url Playback address of the output manifest.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ComplexAdaptiveDynamicStreamingTaskOutput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplexAdaptiveDynamicStreamingTaskOutput(ComplexAdaptiveDynamicStreamingTaskOutput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

