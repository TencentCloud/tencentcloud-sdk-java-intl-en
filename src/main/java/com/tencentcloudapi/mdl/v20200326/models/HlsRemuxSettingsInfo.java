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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HlsRemuxSettingsInfo extends AbstractModel {

    /**
    * Segment duration in milliseconds. Input range is [1000, 30000], default 4000, can only be a multiple of 1000.
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
    * Number of shards. Input range [3, 30]. Default is 5.
    */
    @SerializedName("SegmentNumber")
    @Expose
    private Long SegmentNumber;

    /**
    * Whether to enable Pdt insertion. CLOSE/OPEN. Default is CLOSE.
    */
    @SerializedName("PdtInsertion")
    @Expose
    private String PdtInsertion;

    /**
    * Pdt duration in seconds. Input range (0, 3000]. Default 600.
    */
    @SerializedName("PdtDuration")
    @Expose
    private Long PdtDuration;

    /**
    * Video packaging type, selectable SEPARATE|MERGE.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * Segment type, supports [ts|fmp4], default ts.
fmp4 does not currently support DRM and time shifting.
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * When the transcoding type is H265, the HLS H265 encapsulation type is selectable [hvc1|hev1], default is hev1.
    */
    @SerializedName("H265PackageType")
    @Expose
    private String H265PackageType;

    /**
    * Whether to enable low delay. 0:CLOSE. Default is 0. 1:OPEN.
    */
    @SerializedName("LowLatency")
    @Expose
    private Long LowLatency;

    /**
    * Small slice size in milliseconds. Value ranges from 200 to SegmentDuration (integer). Default value: 500 ms.
    */
    @SerializedName("PartialSegmentDuration")
    @Expose
    private Long PartialSegmentDuration;

    /**
    * Small slice playback position in milliseconds. Value ranges from 3*PartiSegmentDuration to 3*SegmentDuration (integer). Default value: 3*PartiSegmentDuration.
    */
    @SerializedName("PartialSegmentPlaySite")
    @Expose
    private Long PartialSegmentPlaySite;

    /**
    * Hls master m3u8 file sorting rule by bitrate. Available values:
1: Video bitrate ascending 2: Video bitrate descending
Default value: 1
    */
    @SerializedName("StreamOrder")
    @Expose
    private Long StreamOrder;

    /**
    * Whether the Hls master m3u8 file contains resolution information. Available values:
1: INCLUDE includes video resolution 2: EXCLUDE excludes video resolution.
Default value: 1.
    */
    @SerializedName("VideoResolution")
    @Expose
    private Long VideoResolution;

    /**
    * Whether the content contains the `EXT-X-ENDLIST` tag. 1: contains; 2: does not contain. Default: 1.
    */
    @SerializedName("EndListTag")
    @Expose
    private Long EndListTag;

    /**
    * Option: `ENHANCED_SCTE35`, `DATERANGE`; default `ENHANCED_SCTE35`.
    */
    @SerializedName("AdMarkupType")
    @Expose
    private String AdMarkupType;

    /**
     * Get Segment duration in milliseconds. Input range is [1000, 30000], default 4000, can only be a multiple of 1000. 
     * @return SegmentDuration Segment duration in milliseconds. Input range is [1000, 30000], default 4000, can only be a multiple of 1000.
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set Segment duration in milliseconds. Input range is [1000, 30000], default 4000, can only be a multiple of 1000.
     * @param SegmentDuration Segment duration in milliseconds. Input range is [1000, 30000], default 4000, can only be a multiple of 1000.
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    /**
     * Get Number of shards. Input range [3, 30]. Default is 5. 
     * @return SegmentNumber Number of shards. Input range [3, 30]. Default is 5.
     */
    public Long getSegmentNumber() {
        return this.SegmentNumber;
    }

    /**
     * Set Number of shards. Input range [3, 30]. Default is 5.
     * @param SegmentNumber Number of shards. Input range [3, 30]. Default is 5.
     */
    public void setSegmentNumber(Long SegmentNumber) {
        this.SegmentNumber = SegmentNumber;
    }

    /**
     * Get Whether to enable Pdt insertion. CLOSE/OPEN. Default is CLOSE. 
     * @return PdtInsertion Whether to enable Pdt insertion. CLOSE/OPEN. Default is CLOSE.
     */
    public String getPdtInsertion() {
        return this.PdtInsertion;
    }

    /**
     * Set Whether to enable Pdt insertion. CLOSE/OPEN. Default is CLOSE.
     * @param PdtInsertion Whether to enable Pdt insertion. CLOSE/OPEN. Default is CLOSE.
     */
    public void setPdtInsertion(String PdtInsertion) {
        this.PdtInsertion = PdtInsertion;
    }

    /**
     * Get Pdt duration in seconds. Input range (0, 3000]. Default 600. 
     * @return PdtDuration Pdt duration in seconds. Input range (0, 3000]. Default 600.
     */
    public Long getPdtDuration() {
        return this.PdtDuration;
    }

    /**
     * Set Pdt duration in seconds. Input range (0, 3000]. Default 600.
     * @param PdtDuration Pdt duration in seconds. Input range (0, 3000]. Default 600.
     */
    public void setPdtDuration(Long PdtDuration) {
        this.PdtDuration = PdtDuration;
    }

    /**
     * Get Video packaging type, selectable SEPARATE|MERGE. 
     * @return Scheme Video packaging type, selectable SEPARATE|MERGE.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Video packaging type, selectable SEPARATE|MERGE.
     * @param Scheme Video packaging type, selectable SEPARATE|MERGE.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get Segment type, supports [ts|fmp4], default ts.
fmp4 does not currently support DRM and time shifting. 
     * @return SegmentType Segment type, supports [ts|fmp4], default ts.
fmp4 does not currently support DRM and time shifting.
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set Segment type, supports [ts|fmp4], default ts.
fmp4 does not currently support DRM and time shifting.
     * @param SegmentType Segment type, supports [ts|fmp4], default ts.
fmp4 does not currently support DRM and time shifting.
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get When the transcoding type is H265, the HLS H265 encapsulation type is selectable [hvc1|hev1], default is hev1. 
     * @return H265PackageType When the transcoding type is H265, the HLS H265 encapsulation type is selectable [hvc1|hev1], default is hev1.
     */
    public String getH265PackageType() {
        return this.H265PackageType;
    }

    /**
     * Set When the transcoding type is H265, the HLS H265 encapsulation type is selectable [hvc1|hev1], default is hev1.
     * @param H265PackageType When the transcoding type is H265, the HLS H265 encapsulation type is selectable [hvc1|hev1], default is hev1.
     */
    public void setH265PackageType(String H265PackageType) {
        this.H265PackageType = H265PackageType;
    }

    /**
     * Get Whether to enable low delay. 0:CLOSE. Default is 0. 1:OPEN. 
     * @return LowLatency Whether to enable low delay. 0:CLOSE. Default is 0. 1:OPEN.
     */
    public Long getLowLatency() {
        return this.LowLatency;
    }

    /**
     * Set Whether to enable low delay. 0:CLOSE. Default is 0. 1:OPEN.
     * @param LowLatency Whether to enable low delay. 0:CLOSE. Default is 0. 1:OPEN.
     */
    public void setLowLatency(Long LowLatency) {
        this.LowLatency = LowLatency;
    }

    /**
     * Get Small slice size in milliseconds. Value ranges from 200 to SegmentDuration (integer). Default value: 500 ms. 
     * @return PartialSegmentDuration Small slice size in milliseconds. Value ranges from 200 to SegmentDuration (integer). Default value: 500 ms.
     */
    public Long getPartialSegmentDuration() {
        return this.PartialSegmentDuration;
    }

    /**
     * Set Small slice size in milliseconds. Value ranges from 200 to SegmentDuration (integer). Default value: 500 ms.
     * @param PartialSegmentDuration Small slice size in milliseconds. Value ranges from 200 to SegmentDuration (integer). Default value: 500 ms.
     */
    public void setPartialSegmentDuration(Long PartialSegmentDuration) {
        this.PartialSegmentDuration = PartialSegmentDuration;
    }

    /**
     * Get Small slice playback position in milliseconds. Value ranges from 3*PartiSegmentDuration to 3*SegmentDuration (integer). Default value: 3*PartiSegmentDuration. 
     * @return PartialSegmentPlaySite Small slice playback position in milliseconds. Value ranges from 3*PartiSegmentDuration to 3*SegmentDuration (integer). Default value: 3*PartiSegmentDuration.
     */
    public Long getPartialSegmentPlaySite() {
        return this.PartialSegmentPlaySite;
    }

    /**
     * Set Small slice playback position in milliseconds. Value ranges from 3*PartiSegmentDuration to 3*SegmentDuration (integer). Default value: 3*PartiSegmentDuration.
     * @param PartialSegmentPlaySite Small slice playback position in milliseconds. Value ranges from 3*PartiSegmentDuration to 3*SegmentDuration (integer). Default value: 3*PartiSegmentDuration.
     */
    public void setPartialSegmentPlaySite(Long PartialSegmentPlaySite) {
        this.PartialSegmentPlaySite = PartialSegmentPlaySite;
    }

    /**
     * Get Hls master m3u8 file sorting rule by bitrate. Available values:
1: Video bitrate ascending 2: Video bitrate descending
Default value: 1 
     * @return StreamOrder Hls master m3u8 file sorting rule by bitrate. Available values:
1: Video bitrate ascending 2: Video bitrate descending
Default value: 1
     */
    public Long getStreamOrder() {
        return this.StreamOrder;
    }

    /**
     * Set Hls master m3u8 file sorting rule by bitrate. Available values:
1: Video bitrate ascending 2: Video bitrate descending
Default value: 1
     * @param StreamOrder Hls master m3u8 file sorting rule by bitrate. Available values:
1: Video bitrate ascending 2: Video bitrate descending
Default value: 1
     */
    public void setStreamOrder(Long StreamOrder) {
        this.StreamOrder = StreamOrder;
    }

    /**
     * Get Whether the Hls master m3u8 file contains resolution information. Available values:
1: INCLUDE includes video resolution 2: EXCLUDE excludes video resolution.
Default value: 1. 
     * @return VideoResolution Whether the Hls master m3u8 file contains resolution information. Available values:
1: INCLUDE includes video resolution 2: EXCLUDE excludes video resolution.
Default value: 1.
     */
    public Long getVideoResolution() {
        return this.VideoResolution;
    }

    /**
     * Set Whether the Hls master m3u8 file contains resolution information. Available values:
1: INCLUDE includes video resolution 2: EXCLUDE excludes video resolution.
Default value: 1.
     * @param VideoResolution Whether the Hls master m3u8 file contains resolution information. Available values:
1: INCLUDE includes video resolution 2: EXCLUDE excludes video resolution.
Default value: 1.
     */
    public void setVideoResolution(Long VideoResolution) {
        this.VideoResolution = VideoResolution;
    }

    /**
     * Get Whether the content contains the `EXT-X-ENDLIST` tag. 1: contains; 2: does not contain. Default: 1. 
     * @return EndListTag Whether the content contains the `EXT-X-ENDLIST` tag. 1: contains; 2: does not contain. Default: 1.
     */
    public Long getEndListTag() {
        return this.EndListTag;
    }

    /**
     * Set Whether the content contains the `EXT-X-ENDLIST` tag. 1: contains; 2: does not contain. Default: 1.
     * @param EndListTag Whether the content contains the `EXT-X-ENDLIST` tag. 1: contains; 2: does not contain. Default: 1.
     */
    public void setEndListTag(Long EndListTag) {
        this.EndListTag = EndListTag;
    }

    /**
     * Get Option: `ENHANCED_SCTE35`, `DATERANGE`; default `ENHANCED_SCTE35`. 
     * @return AdMarkupType Option: `ENHANCED_SCTE35`, `DATERANGE`; default `ENHANCED_SCTE35`.
     */
    public String getAdMarkupType() {
        return this.AdMarkupType;
    }

    /**
     * Set Option: `ENHANCED_SCTE35`, `DATERANGE`; default `ENHANCED_SCTE35`.
     * @param AdMarkupType Option: `ENHANCED_SCTE35`, `DATERANGE`; default `ENHANCED_SCTE35`.
     */
    public void setAdMarkupType(String AdMarkupType) {
        this.AdMarkupType = AdMarkupType;
    }

    public HlsRemuxSettingsInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HlsRemuxSettingsInfo(HlsRemuxSettingsInfo source) {
        if (source.SegmentDuration != null) {
            this.SegmentDuration = new Long(source.SegmentDuration);
        }
        if (source.SegmentNumber != null) {
            this.SegmentNumber = new Long(source.SegmentNumber);
        }
        if (source.PdtInsertion != null) {
            this.PdtInsertion = new String(source.PdtInsertion);
        }
        if (source.PdtDuration != null) {
            this.PdtDuration = new Long(source.PdtDuration);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new String(source.SegmentType);
        }
        if (source.H265PackageType != null) {
            this.H265PackageType = new String(source.H265PackageType);
        }
        if (source.LowLatency != null) {
            this.LowLatency = new Long(source.LowLatency);
        }
        if (source.PartialSegmentDuration != null) {
            this.PartialSegmentDuration = new Long(source.PartialSegmentDuration);
        }
        if (source.PartialSegmentPlaySite != null) {
            this.PartialSegmentPlaySite = new Long(source.PartialSegmentPlaySite);
        }
        if (source.StreamOrder != null) {
            this.StreamOrder = new Long(source.StreamOrder);
        }
        if (source.VideoResolution != null) {
            this.VideoResolution = new Long(source.VideoResolution);
        }
        if (source.EndListTag != null) {
            this.EndListTag = new Long(source.EndListTag);
        }
        if (source.AdMarkupType != null) {
            this.AdMarkupType = new String(source.AdMarkupType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SegmentDuration", this.SegmentDuration);
        this.setParamSimple(map, prefix + "SegmentNumber", this.SegmentNumber);
        this.setParamSimple(map, prefix + "PdtInsertion", this.PdtInsertion);
        this.setParamSimple(map, prefix + "PdtDuration", this.PdtDuration);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "H265PackageType", this.H265PackageType);
        this.setParamSimple(map, prefix + "LowLatency", this.LowLatency);
        this.setParamSimple(map, prefix + "PartialSegmentDuration", this.PartialSegmentDuration);
        this.setParamSimple(map, prefix + "PartialSegmentPlaySite", this.PartialSegmentPlaySite);
        this.setParamSimple(map, prefix + "StreamOrder", this.StreamOrder);
        this.setParamSimple(map, prefix + "VideoResolution", this.VideoResolution);
        this.setParamSimple(map, prefix + "EndListTag", this.EndListTag);
        this.setParamSimple(map, prefix + "AdMarkupType", this.AdMarkupType);

    }
}

