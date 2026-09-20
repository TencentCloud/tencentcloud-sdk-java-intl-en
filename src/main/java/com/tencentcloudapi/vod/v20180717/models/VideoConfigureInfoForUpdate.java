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

public class VideoConfigureInfoForUpdate extends AbstractModel {

    /**
    * Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 1920].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * Maximum height (or short side) of the video stream. Value range: 0 and [128, 1920]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>

Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
When the value is 0, VOD sets the bitrate automatically.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 1920].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0. 
     * @return Width Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 1920].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 1920].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
     * @param Width Maximum value of the video stream width (or long edge) in px. Value range: 0 and [128, 1920].
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get Maximum height (or short side) of the video stream. Value range: 0 and [128, 1920]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0. 
     * @return Height Maximum height (or short side) of the video stream. Value range: 0 and [128, 1920]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set Maximum height (or short side) of the video stream. Value range: 0 and [128, 1920]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
     * @param Height Maximum height (or short side) of the video stream. Value range: 0 and [128, 1920]. Unit: px.
<li>If both Width and Height are 0, the resolution is the same as the source.</li>
<li>If Width is 0 but Height is not 0, the width will be proportionally scaled.</li>
<li>If Width is not 0 but Height is 0, the height will be proportionally scaled.</li>
<li>If both Width and Height are not 0, the resolution is as specified by the user.</li>

Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>

Default value: open. 
     * @return ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>

Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>

Default value: open.
     * @param ResolutionAdaptive Resolution adaptation. Available values:
<li>open: enable. At this point, Width represents the long side of the video, and Height indicates the short side of the video;</li>
<li>close: closed. At this point, Width represents the width of the video, and Height indicates the height of the video.</li>

Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
When the value is 0, VOD sets the bitrate automatically. 
     * @return Bitrate Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
When the value is 0, VOD sets the bitrate automatically.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
When the value is 0, VOD sets the bitrate automatically.
     * @param Bitrate Bitrate of video stream. Value range: 0 and [128, 10000]. Unit: kbps.
When the value is 0, VOD sets the bitrate automatically.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    public VideoConfigureInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoConfigureInfoForUpdate(VideoConfigureInfoForUpdate source) {
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);

    }
}

