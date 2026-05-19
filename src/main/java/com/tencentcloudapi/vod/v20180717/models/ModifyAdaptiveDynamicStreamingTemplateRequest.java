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

public class ModifyAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * Unique identifier of the adaptive transcoding template.
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template name. The length cannot exceed 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Adaptive Transcoding Format, with a value range of
<li>HLS;</li>
<li>MPEG-DASH.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Whether to prohibit video low bitrate to high bitrate conversion, value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * Whether to prohibit video resolution to high resolution conversion. Value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * Adaptive Transcoding Input Stream Parameter Information, up to 10 entries.
Note: The frame rate of each stream must remain consistent. If inconsistent, use the frame rate of the first stream as the output frame rate.
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * Template description, with a length limit of 256 characters.
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Segment type, valid when Format is HLS. Value range:
<li>ts: ts slicing;</li>
<li>fmp4: fmp4 segment.</li>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get Unique identifier of the adaptive transcoding template. 
     * @return Definition Unique identifier of the adaptive transcoding template.
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set Unique identifier of the adaptive transcoding template.
     * @param Definition Unique identifier of the adaptive transcoding template.
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>On-demand [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate on-demand services from December 25, 2023 must fill this field with the app ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Template name. The length cannot exceed 64 characters. 
     * @return Name Template name. The length cannot exceed 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Template name. The length cannot exceed 64 characters.
     * @param Name Template name. The length cannot exceed 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Adaptive Transcoding Format, with a value range of
<li>HLS;</li>
<li>MPEG-DASH.</li> 
     * @return Format Adaptive Transcoding Format, with a value range of
<li>HLS;</li>
<li>MPEG-DASH.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set Adaptive Transcoding Format, with a value range of
<li>HLS;</li>
<li>MPEG-DASH.</li>
     * @param Format Adaptive Transcoding Format, with a value range of
<li>HLS;</li>
<li>MPEG-DASH.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Whether to prohibit video low bitrate to high bitrate conversion, value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li> 
     * @return DisableHigherVideoBitrate Whether to prohibit video low bitrate to high bitrate conversion, value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set Whether to prohibit video low bitrate to high bitrate conversion, value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
     * @param DisableHigherVideoBitrate Whether to prohibit video low bitrate to high bitrate conversion, value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get Whether to prohibit video resolution to high resolution conversion. Value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li> 
     * @return DisableHigherVideoResolution Whether to prohibit video resolution to high resolution conversion. Value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set Whether to prohibit video resolution to high resolution conversion. Value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
     * @param DisableHigherVideoResolution Whether to prohibit video resolution to high resolution conversion. Value ranges from...to...
<li>`0`: no,</li>
<li>1: Yes.</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get Adaptive Transcoding Input Stream Parameter Information, up to 10 entries.
Note: The frame rate of each stream must remain consistent. If inconsistent, use the frame rate of the first stream as the output frame rate. 
     * @return StreamInfos Adaptive Transcoding Input Stream Parameter Information, up to 10 entries.
Note: The frame rate of each stream must remain consistent. If inconsistent, use the frame rate of the first stream as the output frame rate.
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Adaptive Transcoding Input Stream Parameter Information, up to 10 entries.
Note: The frame rate of each stream must remain consistent. If inconsistent, use the frame rate of the first stream as the output frame rate.
     * @param StreamInfos Adaptive Transcoding Input Stream Parameter Information, up to 10 entries.
Note: The frame rate of each stream must remain consistent. If inconsistent, use the frame rate of the first stream as the output frame rate.
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get Template description, with a length limit of 256 characters. 
     * @return Comment Template description, with a length limit of 256 characters.
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Template description, with a length limit of 256 characters.
     * @param Comment Template description, with a length limit of 256 characters.
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Segment type, valid when Format is HLS. Value range:
<li>ts: ts slicing;</li>
<li>fmp4: fmp4 segment.</li> 
     * @return SegmentType Segment type, valid when Format is HLS. Value range:
<li>ts: ts slicing;</li>
<li>fmp4: fmp4 segment.</li>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set Segment type, valid when Format is HLS. Value range:
<li>ts: ts slicing;</li>
<li>fmp4: fmp4 segment.</li>
     * @param SegmentType Segment type, valid when Format is HLS. Value range:
<li>ts: ts slicing;</li>
<li>fmp4: fmp4 segment.</li>
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    public ModifyAdaptiveDynamicStreamingTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAdaptiveDynamicStreamingTemplateRequest(ModifyAdaptiveDynamicStreamingTemplateRequest source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.DisableHigherVideoBitrate != null) {
            this.DisableHigherVideoBitrate = new Long(source.DisableHigherVideoBitrate);
        }
        if (source.DisableHigherVideoResolution != null) {
            this.DisableHigherVideoResolution = new Long(source.DisableHigherVideoResolution);
        }
        if (source.StreamInfos != null) {
            this.StreamInfos = new AdaptiveStreamTemplate[source.StreamInfos.length];
            for (int i = 0; i < source.StreamInfos.length; i++) {
                this.StreamInfos[i] = new AdaptiveStreamTemplate(source.StreamInfos[i]);
            }
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

