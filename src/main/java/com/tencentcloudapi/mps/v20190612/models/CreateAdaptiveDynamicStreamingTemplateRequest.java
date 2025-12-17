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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * Adaptive bitrate streaming format. Valid values:
<li>HLS,</li>
<li>MPEG-DASH.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Parameter information of output substreams for transcoding to adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of each substream must be consistent; otherwise, the frame rate of the first substream is used as the output frame rate.
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * Template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * Template description. Length limit: 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Indicates whether it is audio-only. 0 means video template, 1 means audio-only template.
When the value is 1.
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

When the value is 0.
1. StreamInfos.N.Video.Codec cannot be copy.
2. StreamInfos.N.Video.Fps cannot be null.

Note:
This value only distinguishes template types. The task uses the values of RemoveAudio and RemoveVideo.
    */
    @SerializedName("PureAudio")
    @Expose
    private Long PureAudio;

    /**
    * Segment type. Valid values: <li>ts-segment: HLS+TS segment</li>; <li>ts-byterange: HLS+TS byte range</li>; <li>mp4-segment: HLS+MP4 segment</li>; <li>mp4-byterange: HLS/DASH+MP4 byte range</li>; <li>ts-packed-audio: TS+Packed Audio</li>; <li>mp4-packed-audio: MP4+Packed Audio</li>. The default value is ts-segment.
 
Note: The segment format for the adaptive bitrate streaming is based on this field. The value of SegmentType can only be mp4-byterange in DASH format.
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get Adaptive bitrate streaming format. Valid values:
<li>HLS,</li>
<li>MPEG-DASH.</li> 
     * @return Format Adaptive bitrate streaming format. Valid values:
<li>HLS,</li>
<li>MPEG-DASH.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Adaptive bitrate streaming format. Valid values:
<li>HLS,</li>
<li>MPEG-DASH.</li>
     * @param Format Adaptive bitrate streaming format. Valid values:
<li>HLS,</li>
<li>MPEG-DASH.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Parameter information of output substreams for transcoding to adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of each substream must be consistent; otherwise, the frame rate of the first substream is used as the output frame rate. 
     * @return StreamInfos Parameter information of output substreams for transcoding to adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of each substream must be consistent; otherwise, the frame rate of the first substream is used as the output frame rate.
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Parameter information of output substreams for transcoding to adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of each substream must be consistent; otherwise, the frame rate of the first substream is used as the output frame rate.
     * @param StreamInfos Parameter information of output substreams for transcoding to adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of each substream must be consistent; otherwise, the frame rate of the first substream is used as the output frame rate.
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get Template name. Length limit: 64 characters. 
     * @return Name Template name. Length limit: 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. Length limit: 64 characters.
     * @param Name Template name. Length limit: 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0. 
     * @return DisableHigherVideoBitrate Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
     * @param DisableHigherVideoBitrate Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0. 
     * @return DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
     * @param DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: 0.
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get Template description. Length limit: 256 characters. 
     * @return Comment Template description. Length limit: 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description. Length limit: 256 characters.
     * @param Comment Template description. Length limit: 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Indicates whether it is audio-only. 0 means video template, 1 means audio-only template.
When the value is 1.
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

When the value is 0.
1. StreamInfos.N.Video.Codec cannot be copy.
2. StreamInfos.N.Video.Fps cannot be null.

Note:
This value only distinguishes template types. The task uses the values of RemoveAudio and RemoveVideo. 
     * @return PureAudio Indicates whether it is audio-only. 0 means video template, 1 means audio-only template.
When the value is 1.
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

When the value is 0.
1. StreamInfos.N.Video.Codec cannot be copy.
2. StreamInfos.N.Video.Fps cannot be null.

Note:
This value only distinguishes template types. The task uses the values of RemoveAudio and RemoveVideo.
     */
    public Long getPureAudio() {
        return this.PureAudio;
    }

    /**
     * Set Indicates whether it is audio-only. 0 means video template, 1 means audio-only template.
When the value is 1.
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

When the value is 0.
1. StreamInfos.N.Video.Codec cannot be copy.
2. StreamInfos.N.Video.Fps cannot be null.

Note:
This value only distinguishes template types. The task uses the values of RemoveAudio and RemoveVideo.
     * @param PureAudio Indicates whether it is audio-only. 0 means video template, 1 means audio-only template.
When the value is 1.
1. StreamInfos.N.RemoveVideo=1
2. StreamInfos.N.RemoveAudio=0
3. StreamInfos.N.Video.Codec=copy

When the value is 0.
1. StreamInfos.N.Video.Codec cannot be copy.
2. StreamInfos.N.Video.Fps cannot be null.

Note:
This value only distinguishes template types. The task uses the values of RemoveAudio and RemoveVideo.
     */
    public void setPureAudio(Long PureAudio) {
        this.PureAudio = PureAudio;
    }

    /**
     * Get Segment type. Valid values: <li>ts-segment: HLS+TS segment</li>; <li>ts-byterange: HLS+TS byte range</li>; <li>mp4-segment: HLS+MP4 segment</li>; <li>mp4-byterange: HLS/DASH+MP4 byte range</li>; <li>ts-packed-audio: TS+Packed Audio</li>; <li>mp4-packed-audio: MP4+Packed Audio</li>. The default value is ts-segment.
 
Note: The segment format for the adaptive bitrate streaming is based on this field. The value of SegmentType can only be mp4-byterange in DASH format. 
     * @return SegmentType Segment type. Valid values: <li>ts-segment: HLS+TS segment</li>; <li>ts-byterange: HLS+TS byte range</li>; <li>mp4-segment: HLS+MP4 segment</li>; <li>mp4-byterange: HLS/DASH+MP4 byte range</li>; <li>ts-packed-audio: TS+Packed Audio</li>; <li>mp4-packed-audio: MP4+Packed Audio</li>. The default value is ts-segment.
 
Note: The segment format for the adaptive bitrate streaming is based on this field. The value of SegmentType can only be mp4-byterange in DASH format.
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set Segment type. Valid values: <li>ts-segment: HLS+TS segment</li>; <li>ts-byterange: HLS+TS byte range</li>; <li>mp4-segment: HLS+MP4 segment</li>; <li>mp4-byterange: HLS/DASH+MP4 byte range</li>; <li>ts-packed-audio: TS+Packed Audio</li>; <li>mp4-packed-audio: MP4+Packed Audio</li>. The default value is ts-segment.
 
Note: The segment format for the adaptive bitrate streaming is based on this field. The value of SegmentType can only be mp4-byterange in DASH format.
     * @param SegmentType Segment type. Valid values: <li>ts-segment: HLS+TS segment</li>; <li>ts-byterange: HLS+TS byte range</li>; <li>mp4-segment: HLS+MP4 segment</li>; <li>mp4-byterange: HLS/DASH+MP4 byte range</li>; <li>ts-packed-audio: TS+Packed Audio</li>; <li>mp4-packed-audio: MP4+Packed Audio</li>. The default value is ts-segment.
 
Note: The segment format for the adaptive bitrate streaming is based on this field. The value of SegmentType can only be mp4-byterange in DASH format.
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    public CreateAdaptiveDynamicStreamingTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAdaptiveDynamicStreamingTemplateRequest(CreateAdaptiveDynamicStreamingTemplateRequest source) {
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.PureAudio != null) {
            this.PureAudio = new Long(source.PureAudio);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "PureAudio", this.PureAudio);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

