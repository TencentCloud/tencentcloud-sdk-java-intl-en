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

public class AdaptiveDynamicStreamingTemplate extends AbstractModel {

    /**
    * <p>Unique ID of the adaptive bitrate streaming template.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>Adaptive bitrate streaming template name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Adaptive bitrate streaming template description.</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Adaptive Transcoding Format. Value ranges from:</p><li>HLS.</li>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>DRM type. Value ranges from:</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>If the value is an empty string, it represents no DRM protection for the video.
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * <p>DRM key provider. Permissible range:</p><li>SDMC: SDMC;</li><li>VOD: video on demand.</li>Default value is VOD.<p>SDMC service will be gradually phased out subsequently. Please use VOD DRM encryption service.</p>
    */
    @SerializedName("DrmKeyProvider")
    @Expose
    private String DrmKeyProvider;

    /**
    * <p>DRM encryption type, value ranges from "cbcs" to "cenc".</p>
    */
    @SerializedName("DrmEncryptType")
    @Expose
    private String DrmEncryptType;

    /**
    * <p>Adaptive Transcoding Input Stream Parameter Information. Up to 10 entries.</p>
    */
    @SerializedName("StreamInfos")
    @Expose
    private AdaptiveStreamTemplate [] StreamInfos;

    /**
    * <p>Whether to prohibit video low bitrate to high bitrate conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
    */
    @SerializedName("DisableHigherVideoBitrate")
    @Expose
    private Long DisableHigherVideoBitrate;

    /**
    * <p>Whether to prohibit video resolution to high resolution conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
    */
    @SerializedName("DisableHigherVideoResolution")
    @Expose
    private Long DisableHigherVideoResolution;

    /**
    * <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Segment type. Valid only when Format is HLS.</p>
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
     * Get <p>Unique ID of the adaptive bitrate streaming template.</p> 
     * @return Definition <p>Unique ID of the adaptive bitrate streaming template.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Unique ID of the adaptive bitrate streaming template.</p>
     * @param Definition <p>Unique ID of the adaptive bitrate streaming template.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li> 
     * @return Type <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
     * @param Type <p>Template type. Valid values:</p><li>Preset: preset template.</li><li>Custom: custom template.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Adaptive bitrate streaming template name.</p> 
     * @return Name <p>Adaptive bitrate streaming template name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Adaptive bitrate streaming template name.</p>
     * @param Name <p>Adaptive bitrate streaming template name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Adaptive bitrate streaming template description.</p> 
     * @return Comment <p>Adaptive bitrate streaming template description.</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Adaptive bitrate streaming template description.</p>
     * @param Comment <p>Adaptive bitrate streaming template description.</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Adaptive Transcoding Format. Value ranges from:</p><li>HLS.</li> 
     * @return Format <p>Adaptive Transcoding Format. Value ranges from:</p><li>HLS.</li>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>Adaptive Transcoding Format. Value ranges from:</p><li>HLS.</li>
     * @param Format <p>Adaptive Transcoding Format. Value ranges from:</p><li>HLS.</li>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>DRM type. Value ranges from:</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>If the value is an empty string, it represents no DRM protection for the video. 
     * @return DrmType <p>DRM type. Value ranges from:</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>If the value is an empty string, it represents no DRM protection for the video.
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set <p>DRM type. Value ranges from:</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>If the value is an empty string, it represents no DRM protection for the video.
     * @param DrmType <p>DRM type. Value ranges from:</p><li>SimpleAES</li><li>Widevine</li><li>FairPlay</li><li>Widevine+FairPlay</li>If the value is an empty string, it represents no DRM protection for the video.
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get <p>DRM key provider. Permissible range:</p><li>SDMC: SDMC;</li><li>VOD: video on demand.</li>Default value is VOD.<p>SDMC service will be gradually phased out subsequently. Please use VOD DRM encryption service.</p> 
     * @return DrmKeyProvider <p>DRM key provider. Permissible range:</p><li>SDMC: SDMC;</li><li>VOD: video on demand.</li>Default value is VOD.<p>SDMC service will be gradually phased out subsequently. Please use VOD DRM encryption service.</p>
     */
    public String getDrmKeyProvider() {
        return this.DrmKeyProvider;
    }

    /**
     * Set <p>DRM key provider. Permissible range:</p><li>SDMC: SDMC;</li><li>VOD: video on demand.</li>Default value is VOD.<p>SDMC service will be gradually phased out subsequently. Please use VOD DRM encryption service.</p>
     * @param DrmKeyProvider <p>DRM key provider. Permissible range:</p><li>SDMC: SDMC;</li><li>VOD: video on demand.</li>Default value is VOD.<p>SDMC service will be gradually phased out subsequently. Please use VOD DRM encryption service.</p>
     */
    public void setDrmKeyProvider(String DrmKeyProvider) {
        this.DrmKeyProvider = DrmKeyProvider;
    }

    /**
     * Get <p>DRM encryption type, value ranges from "cbcs" to "cenc".</p> 
     * @return DrmEncryptType <p>DRM encryption type, value ranges from "cbcs" to "cenc".</p>
     */
    public String getDrmEncryptType() {
        return this.DrmEncryptType;
    }

    /**
     * Set <p>DRM encryption type, value ranges from "cbcs" to "cenc".</p>
     * @param DrmEncryptType <p>DRM encryption type, value ranges from "cbcs" to "cenc".</p>
     */
    public void setDrmEncryptType(String DrmEncryptType) {
        this.DrmEncryptType = DrmEncryptType;
    }

    /**
     * Get <p>Adaptive Transcoding Input Stream Parameter Information. Up to 10 entries.</p> 
     * @return StreamInfos <p>Adaptive Transcoding Input Stream Parameter Information. Up to 10 entries.</p>
     */
    public AdaptiveStreamTemplate [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * Set <p>Adaptive Transcoding Input Stream Parameter Information. Up to 10 entries.</p>
     * @param StreamInfos <p>Adaptive Transcoding Input Stream Parameter Information. Up to 10 entries.</p>
     */
    public void setStreamInfos(AdaptiveStreamTemplate [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * Get <p>Whether to prohibit video low bitrate to high bitrate conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li> 
     * @return DisableHigherVideoBitrate <p>Whether to prohibit video low bitrate to high bitrate conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public Long getDisableHigherVideoBitrate() {
        return this.DisableHigherVideoBitrate;
    }

    /**
     * Set <p>Whether to prohibit video low bitrate to high bitrate conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
     * @param DisableHigherVideoBitrate <p>Whether to prohibit video low bitrate to high bitrate conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public void setDisableHigherVideoBitrate(Long DisableHigherVideoBitrate) {
        this.DisableHigherVideoBitrate = DisableHigherVideoBitrate;
    }

    /**
     * Get <p>Whether to prohibit video resolution to high resolution conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li> 
     * @return DisableHigherVideoResolution <p>Whether to prohibit video resolution to high resolution conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public Long getDisableHigherVideoResolution() {
        return this.DisableHigherVideoResolution;
    }

    /**
     * Set <p>Whether to prohibit video resolution to high resolution conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
     * @param DisableHigherVideoResolution <p>Whether to prohibit video resolution to high resolution conversion. Value ranges from:</p><li>0: No,</li><li>1: Yes.</li>
     */
    public void setDisableHigherVideoResolution(Long DisableHigherVideoResolution) {
        this.DisableHigherVideoResolution = DisableHigherVideoResolution;
    }

    /**
     * Get <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param CreateTime <p>Template creation time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p> 
     * @return UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     * @param UpdateTime <p>Last template modification time, in <a href="https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#I">ISO date format</a>.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Segment type. Valid only when Format is HLS.</p> 
     * @return SegmentType <p>Segment type. Valid only when Format is HLS.</p>
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set <p>Segment type. Valid only when Format is HLS.</p>
     * @param SegmentType <p>Segment type. Valid only when Format is HLS.</p>
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
        if (source.DrmType != null) {
            this.DrmType = new String(source.DrmType);
        }
        if (source.DrmKeyProvider != null) {
            this.DrmKeyProvider = new String(source.DrmKeyProvider);
        }
        if (source.DrmEncryptType != null) {
            this.DrmEncryptType = new String(source.DrmEncryptType);
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
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "DrmKeyProvider", this.DrmKeyProvider);
        this.setParamSimple(map, prefix + "DrmEncryptType", this.DrmEncryptType);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "DisableHigherVideoBitrate", this.DisableHigherVideoBitrate);
        this.setParamSimple(map, prefix + "DisableHigherVideoResolution", this.DisableHigherVideoResolution);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);

    }
}

