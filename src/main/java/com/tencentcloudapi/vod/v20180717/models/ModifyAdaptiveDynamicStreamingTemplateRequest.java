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
    * <p>Unique identifier of the adaptive transcoding template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * <p>Template name. Length limit: 64 characters.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Adaptive Transcoding Format. Value range:</p><li>HLS;</li><li>MPEG-DASH.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>Whether to prohibit video low bitrate to high bitrate conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * <p>Whether to prohibit video resolution to high resolution conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * <p>Adaptive transcoding input stream parameter information. Up to 10 streams can be input.<br>Note: The frame rate of each stream must remain consistent. If inconsistent, the frame rate of the first stream is used as the output frame rate.</p>
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * <p>Transcoding template description. Length limit: 256 characters.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Shard type. Available values: <br>ts: HLS, internally mapped to ts-segment</p><p>mp4: HLS/DASH, internally mapped to mp4-mp4-segment for HLS and mp4-mp4-byterange for DASH</p><p>ts-segment: HLS+TS segment</p><p>ts-byterange: HLS+TS byte range</p><p>mp4-segment: HLS+MP4 segment</p><p>mp4-byterange: HLS+MP4 byte range</p><p>ts-packed-audio: HLS+TS+Packed Audio segment</p><p>mp4-packed-audio: HLS+MP4+Packed Audio segment</p><p>ts-ts-segment: HLS+TS+TS segment</p><p>ts-ts-byterange: HLS+TS+TS byte range</p><p>mp4-mp4-segment: HLS+MP4+MP4 segment</p><p>mp4-mp4-byterange: HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange: HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange: HLS+MP4+Packed Audio byte range<br> Default value: ts-segment Note: The shard format of adaptive bitrate is based on this field. For DASH, SegmentType can only be mp4-mp4-byterange.</p><p>FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment. Widevine: can be used for HLS and DASH. For HLS, the shard format can only be mp4 or mp4-mp4-segment. For DASH, the shard format can only be mp4 or mp4-mp4-byterange. Widevine+FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment.</p>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * <p>Average segmentation duration.</p><p>Value range: [1, 10]</p><p>Unit: second</p>
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
     * Get <p>Unique identifier of the adaptive transcoding template.</p> 
     * @return Definition <p>Unique identifier of the adaptive transcoding template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique identifier of the adaptive transcoding template.</p>
     * @param Definition <p>Unique identifier of the adaptive transcoding template.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p> 
     * @return SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     * @param SubAppId <p><b>On-demand <a href="/document/product/266/14574">application</a> ID. For customers who activate on-demand services after December 25, 2023, this field must be filled with the app ID when accessing resources in on-demand applications (whether the default application or a newly created application).</b></p>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get <p>Template name. Length limit: 64 characters.</p> 
     * @return Name <p>Template name. Length limit: 64 characters.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Template name. Length limit: 64 characters.</p>
     * @param Name <p>Template name. Length limit: 64 characters.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Adaptive Transcoding Format. Value range:</p><li>HLS;</li><li>MPEG-DASH.</li> 
     * @return Format <p>Adaptive Transcoding Format. Value range:</p><li>HLS;</li><li>MPEG-DASH.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>Adaptive Transcoding Format. Value range:</p><li>HLS;</li><li>MPEG-DASH.</li>
     * @param Format <p>Adaptive Transcoding Format. Value range:</p><li>HLS;</li><li>MPEG-DASH.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>Whether to prohibit video low bitrate to high bitrate conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li> 
     * @return DisableHigherVideoBitrate <p>Whether to prohibit video low bitrate to high bitrate conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set <p>Whether to prohibit video low bitrate to high bitrate conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
     * @param DisableHigherVideoBitrate <p>Whether to prohibit video low bitrate to high bitrate conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get <p>Whether to prohibit video resolution to high resolution conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li> 
     * @return DisableHigherVideoResolution <p>Whether to prohibit video resolution to high resolution conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set <p>Whether to prohibit video resolution to high resolution conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
     * @param DisableHigherVideoResolution <p>Whether to prohibit video resolution to high resolution conversion. Value range:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get <p>Adaptive transcoding input stream parameter information. Up to 10 streams can be input.<br>Note: The frame rate of each stream must remain consistent. If inconsistent, the frame rate of the first stream is used as the output frame rate.</p> 
     * @return StreamInfos <p>Adaptive transcoding input stream parameter information. Up to 10 streams can be input.<br>Note: The frame rate of each stream must remain consistent. If inconsistent, the frame rate of the first stream is used as the output frame rate.</p>
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set <p>Adaptive transcoding input stream parameter information. Up to 10 streams can be input.<br>Note: The frame rate of each stream must remain consistent. If inconsistent, the frame rate of the first stream is used as the output frame rate.</p>
     * @param StreamInfos <p>Adaptive transcoding input stream parameter information. Up to 10 streams can be input.<br>Note: The frame rate of each stream must remain consistent. If inconsistent, the frame rate of the first stream is used as the output frame rate.</p>
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get <p>Transcoding template description. Length limit: 256 characters.</p> 
     * @return Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Transcoding template description. Length limit: 256 characters.</p>
     * @param Comment <p>Transcoding template description. Length limit: 256 characters.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Shard type. Available values: <br>ts: HLS, internally mapped to ts-segment</p><p>mp4: HLS/DASH, internally mapped to mp4-mp4-segment for HLS and mp4-mp4-byterange for DASH</p><p>ts-segment: HLS+TS segment</p><p>ts-byterange: HLS+TS byte range</p><p>mp4-segment: HLS+MP4 segment</p><p>mp4-byterange: HLS+MP4 byte range</p><p>ts-packed-audio: HLS+TS+Packed Audio segment</p><p>mp4-packed-audio: HLS+MP4+Packed Audio segment</p><p>ts-ts-segment: HLS+TS+TS segment</p><p>ts-ts-byterange: HLS+TS+TS byte range</p><p>mp4-mp4-segment: HLS+MP4+MP4 segment</p><p>mp4-mp4-byterange: HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange: HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange: HLS+MP4+Packed Audio byte range<br> Default value: ts-segment Note: The shard format of adaptive bitrate is based on this field. For DASH, SegmentType can only be mp4-mp4-byterange.</p><p>FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment. Widevine: can be used for HLS and DASH. For HLS, the shard format can only be mp4 or mp4-mp4-segment. For DASH, the shard format can only be mp4 or mp4-mp4-byterange. Widevine+FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment.</p> 
     * @return SegmentType <p>Shard type. Available values: <br>ts: HLS, internally mapped to ts-segment</p><p>mp4: HLS/DASH, internally mapped to mp4-mp4-segment for HLS and mp4-mp4-byterange for DASH</p><p>ts-segment: HLS+TS segment</p><p>ts-byterange: HLS+TS byte range</p><p>mp4-segment: HLS+MP4 segment</p><p>mp4-byterange: HLS+MP4 byte range</p><p>ts-packed-audio: HLS+TS+Packed Audio segment</p><p>mp4-packed-audio: HLS+MP4+Packed Audio segment</p><p>ts-ts-segment: HLS+TS+TS segment</p><p>ts-ts-byterange: HLS+TS+TS byte range</p><p>mp4-mp4-segment: HLS+MP4+MP4 segment</p><p>mp4-mp4-byterange: HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange: HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange: HLS+MP4+Packed Audio byte range<br> Default value: ts-segment Note: The shard format of adaptive bitrate is based on this field. For DASH, SegmentType can only be mp4-mp4-byterange.</p><p>FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment. Widevine: can be used for HLS and DASH. For HLS, the shard format can only be mp4 or mp4-mp4-segment. For DASH, the shard format can only be mp4 or mp4-mp4-byterange. Widevine+FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment.</p>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>Shard type. Available values: <br>ts: HLS, internally mapped to ts-segment</p><p>mp4: HLS/DASH, internally mapped to mp4-mp4-segment for HLS and mp4-mp4-byterange for DASH</p><p>ts-segment: HLS+TS segment</p><p>ts-byterange: HLS+TS byte range</p><p>mp4-segment: HLS+MP4 segment</p><p>mp4-byterange: HLS+MP4 byte range</p><p>ts-packed-audio: HLS+TS+Packed Audio segment</p><p>mp4-packed-audio: HLS+MP4+Packed Audio segment</p><p>ts-ts-segment: HLS+TS+TS segment</p><p>ts-ts-byterange: HLS+TS+TS byte range</p><p>mp4-mp4-segment: HLS+MP4+MP4 segment</p><p>mp4-mp4-byterange: HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange: HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange: HLS+MP4+Packed Audio byte range<br> Default value: ts-segment Note: The shard format of adaptive bitrate is based on this field. For DASH, SegmentType can only be mp4-mp4-byterange.</p><p>FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment. Widevine: can be used for HLS and DASH. For HLS, the shard format can only be mp4 or mp4-mp4-segment. For DASH, the shard format can only be mp4 or mp4-mp4-byterange. Widevine+FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment.</p>
     * @param SegmentType <p>Shard type. Available values: <br>ts: HLS, internally mapped to ts-segment</p><p>mp4: HLS/DASH, internally mapped to mp4-mp4-segment for HLS and mp4-mp4-byterange for DASH</p><p>ts-segment: HLS+TS segment</p><p>ts-byterange: HLS+TS byte range</p><p>mp4-segment: HLS+MP4 segment</p><p>mp4-byterange: HLS+MP4 byte range</p><p>ts-packed-audio: HLS+TS+Packed Audio segment</p><p>mp4-packed-audio: HLS+MP4+Packed Audio segment</p><p>ts-ts-segment: HLS+TS+TS segment</p><p>ts-ts-byterange: HLS+TS+TS byte range</p><p>mp4-mp4-segment: HLS+MP4+MP4 segment</p><p>mp4-mp4-byterange: HLS/DASH+MP4+MP4 byte range</p><p>ts-packed-audio-byterange: HLS+TS+Packed Audio byte range</p><p>mp4-packed-audio-byterange: HLS+MP4+Packed Audio byte range<br> Default value: ts-segment Note: The shard format of adaptive bitrate is based on this field. For DASH, SegmentType can only be mp4-mp4-byterange.</p><p>FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment. Widevine: can be used for HLS and DASH. For HLS, the shard format can only be mp4 or mp4-mp4-segment. For DASH, the shard format can only be mp4 or mp4-mp4-byterange. Widevine+FairPlay: can only be used for HLS, and the shard format can only be mp4 or mp4-mp4-segment.</p>
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get <p>Average segmentation duration.</p><p>Value range: [1, 10]</p><p>Unit: second</p> 
     * @return SegmentDuration <p>Average segmentation duration.</p><p>Value range: [1, 10]</p><p>Unit: second</p>
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set <p>Average segmentation duration.</p><p>Value range: [1, 10]</p><p>Unit: second</p>
     * @param SegmentDuration <p>Average segmentation duration.</p><p>Value range: [1, 10]</p><p>Unit: second</p>
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
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
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
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
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);

    }
}

