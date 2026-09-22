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

public class MediaSubStreamInfoItem extends AbstractModel {

    /**
    * Sub-stream type. Valid values:
<li>audio: audio-only;</li>
<li>video: video (may contain audio stream).</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Video image width when the substream is a video stream. Unit: px.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Video image height when the substream is a video stream. Measurement unit: px.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Substream media file size. Measurement unit: Byte.
<font color=red>Note:</font> This field is 0 for adaptive bitrate stream files generated before 2023-02-09T16:00:00Z.
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Sub-stream type. Valid values:
<li>audio: audio-only;</li>
<li>video: video (may contain audio stream).</li> 
     * @return Type Sub-stream type. Valid values:
<li>audio: audio-only;</li>
<li>video: video (may contain audio stream).</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Sub-stream type. Valid values:
<li>audio: audio-only;</li>
<li>video: video (may contain audio stream).</li>
     * @param Type Sub-stream type. Valid values:
<li>audio: audio-only;</li>
<li>video: video (may contain audio stream).</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Video image width when the substream is a video stream. Unit: px. 
     * @return Width Video image width when the substream is a video stream. Unit: px.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Video image width when the substream is a video stream. Unit: px.
     * @param Width Video image width when the substream is a video stream. Unit: px.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Video image height when the substream is a video stream. Measurement unit: px. 
     * @return Height Video image height when the substream is a video stream. Measurement unit: px.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Video image height when the substream is a video stream. Measurement unit: px.
     * @param Height Video image height when the substream is a video stream. Measurement unit: px.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Substream media file size. Measurement unit: Byte.
<font color=red>Note:</font> This field is 0 for adaptive bitrate stream files generated before 2023-02-09T16:00:00Z. 
     * @return Size Substream media file size. Measurement unit: Byte.
<font color=red>Note:</font> This field is 0 for adaptive bitrate stream files generated before 2023-02-09T16:00:00Z.
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Substream media file size. Measurement unit: Byte.
<font color=red>Note:</font> This field is 0 for adaptive bitrate stream files generated before 2023-02-09T16:00:00Z.
     * @param Size Substream media file size. Measurement unit: Byte.
<font color=red>Note:</font> This field is 0 for adaptive bitrate stream files generated before 2023-02-09T16:00:00Z.
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public MediaSubStreamInfoItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSubStreamInfoItem(MediaSubStreamInfoItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

