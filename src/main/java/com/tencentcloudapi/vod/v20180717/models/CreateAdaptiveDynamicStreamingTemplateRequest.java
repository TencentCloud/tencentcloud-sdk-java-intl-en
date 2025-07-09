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

public class CreateAdaptiveDynamicStreamingTemplateRequest extends AbstractModel {

    /**
    * The adaptive bitrate streaming format. Valid values:
<li>HLS</li>
<li>MPEG-DASH</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * Parameter information of output substream for adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of all substreams must be the same; otherwise, the frame rate of the first substream will be used as the output frame rate.
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Template name. Length limit: 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * DRM scheme type, value range:
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
The default value is an empty string. It is an empty string, indicating that the video will not be DRM protected.
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * The provider of the DRM key. Valid values:
<li>SDMC</li>
<li>VOD</li>
The default is `VOD`.
    */
    @SerializedName("DrmKeyProvider")
    @Expose
    private String DrmKeyProvider;

    /**
    * Whether to prohibit transcoding video from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
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
    * The segment type. This parameter is valid only if `Format` is `HLS`. Valid values:
<li>ts: TS segment</li>
<li>fmp4: fMP4 segment</li>
Default: ts
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get The adaptive bitrate streaming format. Valid values:
<li>HLS</li>
<li>MPEG-DASH</li> 
     * @return Format The adaptive bitrate streaming format. Valid values:
<li>HLS</li>
<li>MPEG-DASH</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set The adaptive bitrate streaming format. Valid values:
<li>HLS</li>
<li>MPEG-DASH</li>
     * @param Format The adaptive bitrate streaming format. Valid values:
<li>HLS</li>
<li>MPEG-DASH</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get Parameter information of output substream for adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of all substreams must be the same; otherwise, the frame rate of the first substream will be used as the output frame rate. 
     * @return StreamInfos Parameter information of output substream for adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of all substreams must be the same; otherwise, the frame rate of the first substream will be used as the output frame rate.
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set Parameter information of output substream for adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of all substreams must be the same; otherwise, the frame rate of the first substream will be used as the output frame rate.
     * @param StreamInfos Parameter information of output substream for adaptive bitrate streaming. Up to 10 substreams can be output.
Note: the frame rate of all substreams must be the same; otherwise, the frame rate of the first substream will be used as the output frame rate.
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b> 
     * @return SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     * @param SubAppId <b>The VOD [application](https://intl.cloud.tencent.com/document/product/266/14574) ID. For customers who activate VOD service from December 25, 2023, if they want to access resources in a VOD application (whether it's the default application or a newly created one), they must fill in this field with the application ID.</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
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
     * Get DRM scheme type, value range:
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
The default value is an empty string. It is an empty string, indicating that the video will not be DRM protected. 
     * @return DrmType DRM scheme type, value range:
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
The default value is an empty string. It is an empty string, indicating that the video will not be DRM protected.
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set DRM scheme type, value range:
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
The default value is an empty string. It is an empty string, indicating that the video will not be DRM protected.
     * @param DrmType DRM scheme type, value range:
<li>SimpleAES</li>
<li>Widevine</li>
<li>FairPlay</li>
The default value is an empty string. It is an empty string, indicating that the video will not be DRM protected.
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get The provider of the DRM key. Valid values:
<li>SDMC</li>
<li>VOD</li>
The default is `VOD`. 
     * @return DrmKeyProvider The provider of the DRM key. Valid values:
<li>SDMC</li>
<li>VOD</li>
The default is `VOD`.
     */
    public String getDrmKeyProvider() {
        return this.DrmKeyProvider;
    }

    /**
     * Set The provider of the DRM key. Valid values:
<li>SDMC</li>
<li>VOD</li>
The default is `VOD`.
     * @param DrmKeyProvider The provider of the DRM key. Valid values:
<li>SDMC</li>
<li>VOD</li>
The default is `VOD`.
     */
    public void setDrmKeyProvider(String DrmKeyProvider) {
        this.DrmKeyProvider = DrmKeyProvider;
    }

    /**
     * Get Whether to prohibit transcoding video from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no. 
     * @return DisableHigherVideoBitrate Whether to prohibit transcoding video from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set Whether to prohibit transcoding video from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
     * @param DisableHigherVideoBitrate Whether to prohibit transcoding video from low bitrate to high bitrate. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no. 
     * @return DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
     * @param DisableHigherVideoResolution Whether to prohibit transcoding from low resolution to high resolution. Valid values:
<li>0: no,</li>
<li>1: yes.</li>
Default value: no.
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
     * Get The segment type. This parameter is valid only if `Format` is `HLS`. Valid values:
<li>ts: TS segment</li>
<li>fmp4: fMP4 segment</li>
Default: ts 
     * @return SegmentType The segment type. This parameter is valid only if `Format` is `HLS`. Valid values:
<li>ts: TS segment</li>
<li>fmp4: fMP4 segment</li>
Default: ts
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set The segment type. This parameter is valid only if `Format` is `HLS`. Valid values:
<li>ts: TS segment</li>
<li>fmp4: fMP4 segment</li>
Default: ts
     * @param SegmentType The segment type. This parameter is valid only if `Format` is `HLS`. Valid values:
<li>ts: TS segment</li>
<li>fmp4: fMP4 segment</li>
Default: ts
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
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.DrmKeyProvider != null) {
            this.DrmKeyProvider = new String(source.DrmKeyProvider);
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
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "DrmKeyProvider", this.DrmKeyProvider);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

