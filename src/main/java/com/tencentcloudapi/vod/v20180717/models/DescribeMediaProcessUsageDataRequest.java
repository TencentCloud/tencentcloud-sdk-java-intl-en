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

public class DescribeMediaProcessUsageDataRequest extends AbstractModel {

    /**
    * Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End date, which must be greater than or equal to the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * Query video processing task type. Currently supported task types include:
<li>Transcoding: standard transcoding.</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li>Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Remove watermark</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>VideoHighlight: Video intelligent highlights</li>
<li>VideoTag: video intelligent tag</li>
<li>VideoClassification: video intelligent classification</li>
<li>VideoCover: video intelligent cover</li>
<li>VideoSegment: video intelligent splitting</li>
<li>VideoProduce: video production</li>
<li>MediaCast: media forwarding</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Real-time encryption</li>
<li>MediaEnhancement: audio and video enhancement</li>
<li>ImageCompression: image compression</li>
<li>ImageEnhancement: image enhancement</li>
<li>ImageSuperResolution: image super resolution</li>
<li>ImageAdvanceCompression: image advanced compression</li>
<li>ImageUnderstanding: image understanding</li>
<li>AddTraceWatermark: Add a traceable watermark</li>
<li>AddBlindWatermark: Add blind watermark</li>
<li>AddNagraWatermark: Add NAGRA digital watermark</li>
<li>ExtractTraceWatermark: extract traceability watermark</li>
<li>ExtractBlindWatermark: extract a blind watermark</li>
<li>ExtractNagraWatermark: Extract NAGRA digital watermark</li>

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return StartTime Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param StartTime Start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End date, which must be greater than or equal to the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52). 
     * @return EndTime End date, which must be greater than or equal to the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End date, which must be greater than or equal to the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     * @param EndTime End date, which must be greater than or equal to the start date. Use the [ISO date format](https://www.tencentcloud.com/document/product/266/11732?from_cn_redirect=1#52).
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b> 
     * @return SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * Set <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     * @param SubAppId <b>VOD [application](https://www.tencentcloud.com/document/product/266/14574?from_cn_redirect=1) ID. Customers who activate VOD services after December 25, 2023 must fill this field with the application ID when accessing resources in on-demand applications (whether default or newly created).</b>
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * Get Query video processing task type. Currently supported task types include:
<li>Transcoding: standard transcoding.</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li>Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Remove watermark</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>VideoHighlight: Video intelligent highlights</li>
<li>VideoTag: video intelligent tag</li>
<li>VideoClassification: video intelligent classification</li>
<li>VideoCover: video intelligent cover</li>
<li>VideoSegment: video intelligent splitting</li>
<li>VideoProduce: video production</li>
<li>MediaCast: media forwarding</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Real-time encryption</li>
<li>MediaEnhancement: audio and video enhancement</li>
<li>ImageCompression: image compression</li>
<li>ImageEnhancement: image enhancement</li>
<li>ImageSuperResolution: image super resolution</li>
<li>ImageAdvanceCompression: image advanced compression</li>
<li>ImageUnderstanding: image understanding</li>
<li>AddTraceWatermark: Add a traceable watermark</li>
<li>AddBlindWatermark: Add blind watermark</li>
<li>AddNagraWatermark: Add NAGRA digital watermark</li>
<li>ExtractTraceWatermark: extract traceability watermark</li>
<li>ExtractBlindWatermark: extract a blind watermark</li>
<li>ExtractNagraWatermark: Extract NAGRA digital watermark</li>
 
     * @return Type Query video processing task type. Currently supported task types include:
<li>Transcoding: standard transcoding.</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li>Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Remove watermark</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>VideoHighlight: Video intelligent highlights</li>
<li>VideoTag: video intelligent tag</li>
<li>VideoClassification: video intelligent classification</li>
<li>VideoCover: video intelligent cover</li>
<li>VideoSegment: video intelligent splitting</li>
<li>VideoProduce: video production</li>
<li>MediaCast: media forwarding</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Real-time encryption</li>
<li>MediaEnhancement: audio and video enhancement</li>
<li>ImageCompression: image compression</li>
<li>ImageEnhancement: image enhancement</li>
<li>ImageSuperResolution: image super resolution</li>
<li>ImageAdvanceCompression: image advanced compression</li>
<li>ImageUnderstanding: image understanding</li>
<li>AddTraceWatermark: Add a traceable watermark</li>
<li>AddBlindWatermark: Add blind watermark</li>
<li>AddNagraWatermark: Add NAGRA digital watermark</li>
<li>ExtractTraceWatermark: extract traceability watermark</li>
<li>ExtractBlindWatermark: extract a blind watermark</li>
<li>ExtractNagraWatermark: Extract NAGRA digital watermark</li>

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Query video processing task type. Currently supported task types include:
<li>Transcoding: standard transcoding.</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li>Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Remove watermark</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>VideoHighlight: Video intelligent highlights</li>
<li>VideoTag: video intelligent tag</li>
<li>VideoClassification: video intelligent classification</li>
<li>VideoCover: video intelligent cover</li>
<li>VideoSegment: video intelligent splitting</li>
<li>VideoProduce: video production</li>
<li>MediaCast: media forwarding</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Real-time encryption</li>
<li>MediaEnhancement: audio and video enhancement</li>
<li>ImageCompression: image compression</li>
<li>ImageEnhancement: image enhancement</li>
<li>ImageSuperResolution: image super resolution</li>
<li>ImageAdvanceCompression: image advanced compression</li>
<li>ImageUnderstanding: image understanding</li>
<li>AddTraceWatermark: Add a traceable watermark</li>
<li>AddBlindWatermark: Add blind watermark</li>
<li>AddNagraWatermark: Add NAGRA digital watermark</li>
<li>ExtractTraceWatermark: extract traceability watermark</li>
<li>ExtractBlindWatermark: extract a blind watermark</li>
<li>ExtractNagraWatermark: Extract NAGRA digital watermark</li>

     * @param Type Query video processing task type. Currently supported task types include:
<li>Transcoding: standard transcoding.</li>
<li>Transcoding-TESHD: TSC transcoding</li>
<li>Editing: video editing</li>
<li>Editing-TESHD: Extremely fast high-definition video editing</li>
<li>AdaptiveBitrateStreaming: adaptive bitrate streaming</li>
<li>ContentAudit: content moderation</li>
<li>ContentRecognition: content recognition</li>
<li> RemoveWatermark: Remove watermark</li>
<li>ExtractTraceWatermark: extract watermark</li>
<li> AddTraceWatermark: Add watermark</li>
<li> RebuildMedia: Audio and video quality revival</li>
<li>QualityInspect: audio and video quality inspection</li>
<li>VideoHighlight: Video intelligent highlights</li>
<li>VideoTag: video intelligent tag</li>
<li>VideoClassification: video intelligent classification</li>
<li>VideoCover: video intelligent cover</li>
<li>VideoSegment: video intelligent splitting</li>
<li>VideoProduce: video production</li>
<li>MediaCast: media forwarding</li>
<li>Transcode: Transcode, including standard transcoding, top speed Codec, and video editing (This is not recommended)</li>
<li>VoiceTranslation: speech translation</li>
<li>JITTranscoding: JIT transcoding.</li>
<li>VideoSnapshot: video screenshot.</li>
<li>JITEncryption: Real-time encryption</li>
<li>MediaEnhancement: audio and video enhancement</li>
<li>ImageCompression: image compression</li>
<li>ImageEnhancement: image enhancement</li>
<li>ImageSuperResolution: image super resolution</li>
<li>ImageAdvanceCompression: image advanced compression</li>
<li>ImageUnderstanding: image understanding</li>
<li>AddTraceWatermark: Add a traceable watermark</li>
<li>AddBlindWatermark: Add blind watermark</li>
<li>AddNagraWatermark: Add NAGRA digital watermark</li>
<li>ExtractTraceWatermark: extract traceability watermark</li>
<li>ExtractBlindWatermark: extract a blind watermark</li>
<li>ExtractNagraWatermark: Extract NAGRA digital watermark</li>

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeMediaProcessUsageDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMediaProcessUsageDataRequest(DescribeMediaProcessUsageDataRequest source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.SubAppId != null) {
            this.SubAppId = new Long(source.SubAppId);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

