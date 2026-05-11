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
    * Adaptive bitrate template ID.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Adaptive bitrate stream packaging format. Optional values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * DRM solution type. Available values:
<li>Empty string: Unencrypted.</li>
<li>SimpleAES;</li>
<li>Widevine;</li>
<li>FairPlay.</li>
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * Playback address of the adaptive bitrate stream.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Adaptive bitrate template ID. 
     * @return Definition Adaptive bitrate template ID.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Adaptive bitrate template ID.
     * @param Definition Adaptive bitrate template ID.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Adaptive bitrate stream packaging format. Optional values:
<li>HLS;</li>
<li>MPEG-DASH.</li> 
     * @return Format Adaptive bitrate stream packaging format. Optional values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Adaptive bitrate stream packaging format. Optional values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
     * @param Format Adaptive bitrate stream packaging format. Optional values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get DRM solution type. Available values:
<li>Empty string: Unencrypted.</li>
<li>SimpleAES;</li>
<li>Widevine;</li>
<li>FairPlay.</li> 
     * @return DrmType DRM solution type. Available values:
<li>Empty string: Unencrypted.</li>
<li>SimpleAES;</li>
<li>Widevine;</li>
<li>FairPlay.</li>
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM solution type. Available values:
<li>Empty string: Unencrypted.</li>
<li>SimpleAES;</li>
<li>Widevine;</li>
<li>FairPlay.</li>
     * @param DrmType DRM solution type. Available values:
<li>Empty string: Unencrypted.</li>
<li>SimpleAES;</li>
<li>Widevine;</li>
<li>FairPlay.</li>
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get Playback address of the adaptive bitrate stream. 
     * @return Url Playback address of the adaptive bitrate stream.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Playback address of the adaptive bitrate stream.
     * @param Url Playback address of the adaptive bitrate stream.
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

