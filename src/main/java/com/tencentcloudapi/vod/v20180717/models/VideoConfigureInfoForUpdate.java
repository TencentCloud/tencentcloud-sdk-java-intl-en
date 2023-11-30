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

public class VideoConfigureInfoForUpdate extends AbstractModel {

    /**
    * The maximum value of the video stream width (or long side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum value of the video stream height (or short side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>

Default value: open.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * The bit rate of the video stream, value range: 0 and [128, 10000], unit: kbps. 
When the value is 0, it means that the video bitrate remains the same as the original video.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
     * Get The maximum value of the video stream width (or long side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0. 
     * @return Width The maximum value of the video stream width (or long side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum value of the video stream width (or long side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
     * @param Width The maximum value of the video stream width (or long side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum value of the video stream height (or short side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0. 
     * @return Height The maximum value of the video stream height (or short side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum value of the video stream height (or short side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
     * @param Height The maximum value of the video stream height (or short side), value range: 0 and [128, 1920], unit: px. 
<li>When Width and Height are both 0, the resolution is from the same source;</li>
<li>When Width is 0 and Height is non-0, Width is scaled proportionally;</li>
< li>When Width is non-0 and Height is 0, the Height is scaled proportionally; </li>
<li>When both Width and Height are non-0, the resolution is specified by the user. </li>

Default value: 0.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>

Default value: open. 
     * @return ResolutionAdaptive Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>

Default value: open.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>

Default value: open.
     * @param ResolutionAdaptive Resolution adaptive, optional values:
<li>open: open, at this time, Width represents the long side of the video, and Height represents the short side of the video;</li>
<li>close: closed, at this time , Width represents the width of the video, and Height represents the height of the video. </li>

Default value: open.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get The bit rate of the video stream, value range: 0 and [128, 10000], unit: kbps. 
When the value is 0, it means that the video bitrate remains the same as the original video. 
     * @return Bitrate The bit rate of the video stream, value range: 0 and [128, 10000], unit: kbps. 
When the value is 0, it means that the video bitrate remains the same as the original video.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The bit rate of the video stream, value range: 0 and [128, 10000], unit: kbps. 
When the value is 0, it means that the video bitrate remains the same as the original video.
     * @param Bitrate The bit rate of the video stream, value range: 0 and [128, 10000], unit: kbps. 
When the value is 0, it means that the video bitrate remains the same as the original video.
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

