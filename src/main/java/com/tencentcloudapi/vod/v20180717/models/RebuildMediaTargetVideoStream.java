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

public class RebuildMediaTargetVideoStream extends AbstractModel {

    /**
    * The video codec. Valid values:
<li>`libx264`: H.264</li>
<li>`libx265`: H.265</li>
<li>`av1`: AOMedia Video 1</li>
The default codec is H.264.
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * The video bitrate (Kbps). Value range: 0 and 128-35000.
If the value is `0`, the original video bitrate will be used.
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * The video frame rate (Hz). Value range: 0-100. If the value is `0`, the original video frame rate will be used.
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * Resolution adaption. Valid values:
<li>`open`: Enable. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>`close`: Disable. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>

Default value: `open`.
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * The maximum video width (or long side) in pixels. Value range: 0 and 128-4096.
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * The maximum video width (or short side) in pixels. Value range: 0 and [128, 4096].
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>`stretch`: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>`black`: Keep the image's original aspect ratio and fill the blank space with black bars.</li>

Default value: `stretch`.
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * The number of frames between two I-frames. Valid values: 0 and 1-100000.
If this parameter is `0` or left empty, the interval will be determined by the system.
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
     * Get The video codec. Valid values:
<li>`libx264`: H.264</li>
<li>`libx265`: H.265</li>
<li>`av1`: AOMedia Video 1</li>
The default codec is H.264. 
     * @return Codec The video codec. Valid values:
<li>`libx264`: H.264</li>
<li>`libx265`: H.265</li>
<li>`av1`: AOMedia Video 1</li>
The default codec is H.264.
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set The video codec. Valid values:
<li>`libx264`: H.264</li>
<li>`libx265`: H.265</li>
<li>`av1`: AOMedia Video 1</li>
The default codec is H.264.
     * @param Codec The video codec. Valid values:
<li>`libx264`: H.264</li>
<li>`libx265`: H.265</li>
<li>`av1`: AOMedia Video 1</li>
The default codec is H.264.
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get The video bitrate (Kbps). Value range: 0 and 128-35000.
If the value is `0`, the original video bitrate will be used. 
     * @return Bitrate The video bitrate (Kbps). Value range: 0 and 128-35000.
If the value is `0`, the original video bitrate will be used.
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set The video bitrate (Kbps). Value range: 0 and 128-35000.
If the value is `0`, the original video bitrate will be used.
     * @param Bitrate The video bitrate (Kbps). Value range: 0 and 128-35000.
If the value is `0`, the original video bitrate will be used.
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get The video frame rate (Hz). Value range: 0-100. If the value is `0`, the original video frame rate will be used. 
     * @return Fps The video frame rate (Hz). Value range: 0-100. If the value is `0`, the original video frame rate will be used.
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set The video frame rate (Hz). Value range: 0-100. If the value is `0`, the original video frame rate will be used.
     * @param Fps The video frame rate (Hz). Value range: 0-100. If the value is `0`, the original video frame rate will be used.
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get Resolution adaption. Valid values:
<li>`open`: Enable. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>`close`: Disable. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>

Default value: `open`. 
     * @return ResolutionAdaptive Resolution adaption. Valid values:
<li>`open`: Enable. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>`close`: Disable. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>

Default value: `open`.
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set Resolution adaption. Valid values:
<li>`open`: Enable. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>`close`: Disable. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>

Default value: `open`.
     * @param ResolutionAdaptive Resolution adaption. Valid values:
<li>`open`: Enable. When resolution adaption is enabled, `Width` indicates the long side of a video, while `Height` indicates the short side.</li>
<li>`close`: Disable. When resolution adaption is disabled, `Width` indicates the width of a video, while `Height` indicates the height.</li>

Default value: `open`.
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get The maximum video width (or long side) in pixels. Value range: 0 and 128-4096.
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`. 
     * @return Width The maximum video width (or long side) in pixels. Value range: 0 and 128-4096.
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set The maximum video width (or long side) in pixels. Value range: 0 and 128-4096.
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
     * @param Width The maximum video width (or long side) in pixels. Value range: 0 and 128-4096.
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get The maximum video width (or short side) in pixels. Value range: 0 and [128, 4096].
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`. 
     * @return Height The maximum video width (or short side) in pixels. Value range: 0 and [128, 4096].
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set The maximum video width (or short side) in pixels. Value range: 0 and [128, 4096].
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
     * @param Height The maximum video width (or short side) in pixels. Value range: 0 and [128, 4096].
<li>If both `Width` and `Height` are `0`, the original resolution will be used.</li>
<li>If `Width` is 0 and `Height` is not, the video width will be proportionally scaled.</li>
<li>If `Width` is not 0 and `Height` is, the video height will be proportionally scaled.</li>
<li>If neither `Width` nor `Height` is 0, the specified width and height will be used.</li>

Default value: `0`.
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>`stretch`: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>`black`: Keep the image's original aspect ratio and fill the blank space with black bars.</li>

Default value: `stretch`. 
     * @return FillType The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>`stretch`: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>`black`: Keep the image's original aspect ratio and fill the blank space with black bars.</li>

Default value: `stretch`.
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>`stretch`: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>`black`: Keep the image's original aspect ratio and fill the blank space with black bars.</li>

Default value: `stretch`.
     * @param FillType The fill mode, which indicates how a video is resized when the video’s original aspect ratio is different from the target aspect ratio. Valid values:
<li>`stretch`: Stretch the image frame by frame to fill the entire screen. The video image may become "squashed" or "stretched" after transcoding.</li>
<li>`black`: Keep the image's original aspect ratio and fill the blank space with black bars.</li>

Default value: `stretch`.
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get The number of frames between two I-frames. Valid values: 0 and 1-100000.
If this parameter is `0` or left empty, the interval will be determined by the system. 
     * @return Gop The number of frames between two I-frames. Valid values: 0 and 1-100000.
If this parameter is `0` or left empty, the interval will be determined by the system.
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set The number of frames between two I-frames. Valid values: 0 and 1-100000.
If this parameter is `0` or left empty, the interval will be determined by the system.
     * @param Gop The number of frames between two I-frames. Valid values: 0 and 1-100000.
If this parameter is `0` or left empty, the interval will be determined by the system.
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    public RebuildMediaTargetVideoStream() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RebuildMediaTargetVideoStream(RebuildMediaTargetVideoStream source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Gop", this.Gop);

    }
}

