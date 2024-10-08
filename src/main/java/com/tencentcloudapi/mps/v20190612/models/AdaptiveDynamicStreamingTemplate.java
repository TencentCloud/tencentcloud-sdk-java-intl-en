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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveDynamicStreamingTemplate extends AbstractModel {

    /**
    * Unique ID of an adaptive bitrate streaming template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Name of an adaptive bitrate streaming template.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of an adaptive bitrate streaming template.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Parameter information of input streams for transcoding to adaptive bitrate streaming. Up to 10 streams can be input.
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Whether it is an audio-only template. 0: video template. 1: audio-only template.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PureAudio")
    @Expose
    private Long PureAudio;

    /**
    * HLS segment type. Valid values:
<li>ts-segment: HLS+TS segment.</li>
<li>ts-byterange: HLS+TS byte range.</li>
<li>mp4-segment: HLS+MP4 segment.</li>
<li>mp4-byterange: HLS+MP4 byte range.</li>
<li>ts-packed-audio: TS+Packed audio.</li>
<li>mp4-packed-audio: MP4+Packed audio.</li>
Default value: ts-segment.

Note: The HLS segment format for adaptive bitrate streaming is based on this field.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get Unique ID of an adaptive bitrate streaming template. 
     * @return Definition Unique ID of an adaptive bitrate streaming template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique ID of an adaptive bitrate streaming template.
     * @param Definition Unique ID of an adaptive bitrate streaming template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li> 
     * @return Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     * @param Type Template type. Valid values:
<li>Preset: preset template;</li>
<li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Name of an adaptive bitrate streaming template. 
     * @return Name Name of an adaptive bitrate streaming template.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of an adaptive bitrate streaming template.
     * @param Name Name of an adaptive bitrate streaming template.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of an adaptive bitrate streaming template. 
     * @return Comment Description of an adaptive bitrate streaming template.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Description of an adaptive bitrate streaming template.
     * @param Comment Description of an adaptive bitrate streaming template.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li> 
     * @return Format Adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
     * @param Format Adaptive bitrate streaming format. Valid values:
<li>HLS;</li>
<li>MPEG-DASH.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Parameter information of input streams for transcoding to adaptive bitrate streaming. Up to 10 streams can be input. 
     * @return StreamInfos Parameter information of input streams for transcoding to adaptive bitrate streaming. Up to 10 streams can be input.
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Parameter information of input streams for transcoding to adaptive bitrate streaming. Up to 10 streams can be input.
     * @param StreamInfos Parameter information of input streams for transcoding to adaptive bitrate streaming. Up to 10 streams can be input.
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li> 
     * @return DisableHigherVideoBitrate Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     * @param DisableHigherVideoBitrate Whether to prohibit transcoding from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li> 
     * @return DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     * @param DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param CreateTime Creation time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I). 
     * @return UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     * @param UpdateTime Last modified time of template in [ISO date format](https://intl.cloud.tencent.com/document/product/266/11732?from_cn_redirect=1#I).
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Whether it is an audio-only template. 0: video template. 1: audio-only template.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PureAudio Whether it is an audio-only template. 0: video template. 1: audio-only template.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPureAudio() {
        return this.PureAudio;
    }

    /**
     * Set Whether it is an audio-only template. 0: video template. 1: audio-only template.Note: This field may return null, indicating that no valid values can be obtained.
     * @param PureAudio Whether it is an audio-only template. 0: video template. 1: audio-only template.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPureAudio(Long PureAudio) {
        this.PureAudio = PureAudio;
    }

    /**
     * Get HLS segment type. Valid values:
<li>ts-segment: HLS+TS segment.</li>
<li>ts-byterange: HLS+TS byte range.</li>
<li>mp4-segment: HLS+MP4 segment.</li>
<li>mp4-byterange: HLS+MP4 byte range.</li>
<li>ts-packed-audio: TS+Packed audio.</li>
<li>mp4-packed-audio: MP4+Packed audio.</li>
Default value: ts-segment.

Note: The HLS segment format for adaptive bitrate streaming is based on this field.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SegmentType HLS segment type. Valid values:
<li>ts-segment: HLS+TS segment.</li>
<li>ts-byterange: HLS+TS byte range.</li>
<li>mp4-segment: HLS+MP4 segment.</li>
<li>mp4-byterange: HLS+MP4 byte range.</li>
<li>ts-packed-audio: TS+Packed audio.</li>
<li>mp4-packed-audio: MP4+Packed audio.</li>
Default value: ts-segment.

Note: The HLS segment format for adaptive bitrate streaming is based on this field.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set HLS segment type. Valid values:
<li>ts-segment: HLS+TS segment.</li>
<li>ts-byterange: HLS+TS byte range.</li>
<li>mp4-segment: HLS+MP4 segment.</li>
<li>mp4-byterange: HLS+MP4 byte range.</li>
<li>ts-packed-audio: TS+Packed audio.</li>
<li>mp4-packed-audio: MP4+Packed audio.</li>
Default value: ts-segment.

Note: The HLS segment format for adaptive bitrate streaming is based on this field.Note: This field may return null, indicating that no valid values can be obtained.
     * @param SegmentType HLS segment type. Valid values:
<li>ts-segment: HLS+TS segment.</li>
<li>ts-byterange: HLS+TS byte range.</li>
<li>mp4-segment: HLS+MP4 segment.</li>
<li>mp4-byterange: HLS+MP4 byte range.</li>
<li>ts-packed-audio: TS+Packed audio.</li>
<li>mp4-packed-audio: MP4+Packed audio.</li>
Default value: ts-segment.

Note: The HLS segment format for adaptive bitrate streaming is based on this field.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    public AdaptiveDynamicStreamingTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTemplate(AdaptiveDynamicStreamingTemplate source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
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
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "PureAudio", this.PureAudio);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

