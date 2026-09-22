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

public class TranscodePlayInfo2017 extends AbstractModel {

    /**
    * Playback address.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Transcoding specification ID. See [transcoding parameter template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1).
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Sum of the mean video stream bitrate and mean audio stream bitrate. Unit: bps.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * Maximum height of the video stream. Measurement unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Maximum video stream width in px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

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
     * Get Transcoding specification ID. See [transcoding parameter template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1). 
     * @return Definition Transcoding specification ID. See [transcoding parameter template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1).
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Transcoding specification ID. See [transcoding parameter template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1).
     * @param Definition Transcoding specification ID. See [transcoding parameter template](https://www.tencentcloud.com/document/product/266/33476?from_cn_redirect=1).
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Sum of the mean video stream bitrate and mean audio stream bitrate. Unit: bps. 
     * @return Bitrate Sum of the mean video stream bitrate and mean audio stream bitrate. Unit: bps.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Sum of the mean video stream bitrate and mean audio stream bitrate. Unit: bps.
     * @param Bitrate Sum of the mean video stream bitrate and mean audio stream bitrate. Unit: bps.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get Maximum height of the video stream. Measurement unit: px. 
     * @return Height Maximum height of the video stream. Measurement unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum height of the video stream. Measurement unit: px.
     * @param Height Maximum height of the video stream. Measurement unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Maximum video stream width in px. 
     * @return Width Maximum video stream width in px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum video stream width in px.
     * @param Width Maximum video stream width in px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    public TranscodePlayInfo2017() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodePlayInfo2017(TranscodePlayInfo2017 source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Width", this.Width);

    }
}

