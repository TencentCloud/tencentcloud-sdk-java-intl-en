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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HlsRemuxSettingsInfo extends AbstractModel {

    /**
    * Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
    */
    @SerializedName("SegmentDuration")
    @Expose
    private Long SegmentDuration;

    /**
    * Number of segments. Value range: [3,30]. Default value: 5.
    */
    @SerializedName("SegmentNumber")
    @Expose
    private Long SegmentNumber;

    /**
    * Whether to enable PDT insertion. Valid values: CLOSE/OPEN. Default value: CLOSE.
    */
    @SerializedName("PdtInsertion")
    @Expose
    private String PdtInsertion;

    /**
    * PDT duration in seconds. Value range: (0,3000]. Default value: 600.
    */
    @SerializedName("PdtDuration")
    @Expose
    private Long PdtDuration;

    /**
    * Audio/Video packaging scheme. Valid values: `SEPARATE`, `MERGE`. Default value is: SEPARATE.
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * The segment type. Valid values: `ts` (default), `fmp4`.
Currently, fMP4 segments do not support DRM or time shifting.
    */
    @SerializedName("SegmentType")
    @Expose
    private String SegmentType;

    /**
    * The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
    */
    @SerializedName("H265PackageType")
    @Expose
    private String H265PackageType;

    /**
    * Whether to enable low latency 0:CLOSE, 1:OPEN, default value: 0.
    */
    @SerializedName("LowLatency")
    @Expose
    private Long LowLatency;

    /**
    * Low latency slice size, unit ms. Value range: integer [200-HlsRemuxSettings.SegmentDuration] Default value: 500ms.
    */
    @SerializedName("PartialSegmentDuration")
    @Expose
    private Long PartialSegmentDuration;

    /**
    * Low latency slice playback position, unit ms. Value range: integer [3*HlsRemuxSettings.PartiSegmentDuration - 3*HlsRemuxSettings.SegmentDuration], Default value: 3*HlsRemuxSettings.PartiSegmentDuration.
    */
    @SerializedName("PartialSegmentPlaySite")
    @Expose
    private Long PartialSegmentPlaySite;

    /**
    * Hls main m3u8 file sorting rules by bitrate, optional values: 1: video bitrate ascending order; 2: video bitrate descending order. Default value: 1.
    */
    @SerializedName("StreamOrder")
    @Expose
    private Long StreamOrder;

    /**
    * Whether the Hls main m3u8 file contains resolution information, optional values: 1: INCLUDE includes video resolution; 2: EXCLUDE does not include video resolution. Default value: 1.
    */
    @SerializedName("VideoResolution")
    @Expose
    private Long VideoResolution;

    /**
     * Get Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000. 
     * @return SegmentDuration Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     */
    public Long getSegmentDuration() {
        return this.SegmentDuration;
    }

    /**
     * Set Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     * @param SegmentDuration Segment duration in ms. Value range: [1000,30000]. Default value: 4000. The value can only be a multiple of 1,000.
     */
    public void setSegmentDuration(Long SegmentDuration) {
        this.SegmentDuration = SegmentDuration;
    }

    /**
     * Get Number of segments. Value range: [3,30]. Default value: 5. 
     * @return SegmentNumber Number of segments. Value range: [3,30]. Default value: 5.
     */
    public Long getSegmentNumber() {
        return this.SegmentNumber;
    }

    /**
     * Set Number of segments. Value range: [3,30]. Default value: 5.
     * @param SegmentNumber Number of segments. Value range: [3,30]. Default value: 5.
     */
    public void setSegmentNumber(Long SegmentNumber) {
        this.SegmentNumber = SegmentNumber;
    }

    /**
     * Get Whether to enable PDT insertion. Valid values: CLOSE/OPEN. Default value: CLOSE. 
     * @return PdtInsertion Whether to enable PDT insertion. Valid values: CLOSE/OPEN. Default value: CLOSE.
     */
    public String getPdtInsertion() {
        return this.PdtInsertion;
    }

    /**
     * Set Whether to enable PDT insertion. Valid values: CLOSE/OPEN. Default value: CLOSE.
     * @param PdtInsertion Whether to enable PDT insertion. Valid values: CLOSE/OPEN. Default value: CLOSE.
     */
    public void setPdtInsertion(String PdtInsertion) {
        this.PdtInsertion = PdtInsertion;
    }

    /**
     * Get PDT duration in seconds. Value range: (0,3000]. Default value: 600. 
     * @return PdtDuration PDT duration in seconds. Value range: (0,3000]. Default value: 600.
     */
    public Long getPdtDuration() {
        return this.PdtDuration;
    }

    /**
     * Set PDT duration in seconds. Value range: (0,3000]. Default value: 600.
     * @param PdtDuration PDT duration in seconds. Value range: (0,3000]. Default value: 600.
     */
    public void setPdtDuration(Long PdtDuration) {
        this.PdtDuration = PdtDuration;
    }

    /**
     * Get Audio/Video packaging scheme. Valid values: `SEPARATE`, `MERGE`. Default value is: SEPARATE. 
     * @return Scheme Audio/Video packaging scheme. Valid values: `SEPARATE`, `MERGE`. Default value is: SEPARATE.
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set Audio/Video packaging scheme. Valid values: `SEPARATE`, `MERGE`. Default value is: SEPARATE.
     * @param Scheme Audio/Video packaging scheme. Valid values: `SEPARATE`, `MERGE`. Default value is: SEPARATE.
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get The segment type. Valid values: `ts` (default), `fmp4`.
Currently, fMP4 segments do not support DRM or time shifting. 
     * @return SegmentType The segment type. Valid values: `ts` (default), `fmp4`.
Currently, fMP4 segments do not support DRM or time shifting.
     */
    public String getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set The segment type. Valid values: `ts` (default), `fmp4`.
Currently, fMP4 segments do not support DRM or time shifting.
     * @param SegmentType The segment type. Valid values: `ts` (default), `fmp4`.
Currently, fMP4 segments do not support DRM or time shifting.
     */
    public void setSegmentType(String SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default). 
     * @return H265PackageType The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
     */
    public String getH265PackageType() {
        return this.H265PackageType;
    }

    /**
     * Set The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
     * @param H265PackageType The HLS package type when the H.265 codec is used. Valid values: `hvc1`, `hev1` (default).
     */
    public void setH265PackageType(String H265PackageType) {
        this.H265PackageType = H265PackageType;
    }

    /**
     * Get Whether to enable low latency 0:CLOSE, 1:OPEN, default value: 0. 
     * @return LowLatency Whether to enable low latency 0:CLOSE, 1:OPEN, default value: 0.
     */
    public Long getLowLatency() {
        return this.LowLatency;
    }

    /**
     * Set Whether to enable low latency 0:CLOSE, 1:OPEN, default value: 0.
     * @param LowLatency Whether to enable low latency 0:CLOSE, 1:OPEN, default value: 0.
     */
    public void setLowLatency(Long LowLatency) {
        this.LowLatency = LowLatency;
    }

    /**
     * Get Low latency slice size, unit ms. Value range: integer [200-HlsRemuxSettings.SegmentDuration] Default value: 500ms. 
     * @return PartialSegmentDuration Low latency slice size, unit ms. Value range: integer [200-HlsRemuxSettings.SegmentDuration] Default value: 500ms.
     */
    public Long getPartialSegmentDuration() {
        return this.PartialSegmentDuration;
    }

    /**
     * Set Low latency slice size, unit ms. Value range: integer [200-HlsRemuxSettings.SegmentDuration] Default value: 500ms.
     * @param PartialSegmentDuration Low latency slice size, unit ms. Value range: integer [200-HlsRemuxSettings.SegmentDuration] Default value: 500ms.
     */
    public void setPartialSegmentDuration(Long PartialSegmentDuration) {
        this.PartialSegmentDuration = PartialSegmentDuration;
    }

    /**
     * Get Low latency slice playback position, unit ms. Value range: integer [3*HlsRemuxSettings.PartiSegmentDuration - 3*HlsRemuxSettings.SegmentDuration], Default value: 3*HlsRemuxSettings.PartiSegmentDuration. 
     * @return PartialSegmentPlaySite Low latency slice playback position, unit ms. Value range: integer [3*HlsRemuxSettings.PartiSegmentDuration - 3*HlsRemuxSettings.SegmentDuration], Default value: 3*HlsRemuxSettings.PartiSegmentDuration.
     */
    public Long getPartialSegmentPlaySite() {
        return this.PartialSegmentPlaySite;
    }

    /**
     * Set Low latency slice playback position, unit ms. Value range: integer [3*HlsRemuxSettings.PartiSegmentDuration - 3*HlsRemuxSettings.SegmentDuration], Default value: 3*HlsRemuxSettings.PartiSegmentDuration.
     * @param PartialSegmentPlaySite Low latency slice playback position, unit ms. Value range: integer [3*HlsRemuxSettings.PartiSegmentDuration - 3*HlsRemuxSettings.SegmentDuration], Default value: 3*HlsRemuxSettings.PartiSegmentDuration.
     */
    public void setPartialSegmentPlaySite(Long PartialSegmentPlaySite) {
        this.PartialSegmentPlaySite = PartialSegmentPlaySite;
    }

    /**
     * Get Hls main m3u8 file sorting rules by bitrate, optional values: 1: video bitrate ascending order; 2: video bitrate descending order. Default value: 1. 
     * @return StreamOrder Hls main m3u8 file sorting rules by bitrate, optional values: 1: video bitrate ascending order; 2: video bitrate descending order. Default value: 1.
     */
    public Long getStreamOrder() {
        return this.StreamOrder;
    }

    /**
     * Set Hls main m3u8 file sorting rules by bitrate, optional values: 1: video bitrate ascending order; 2: video bitrate descending order. Default value: 1.
     * @param StreamOrder Hls main m3u8 file sorting rules by bitrate, optional values: 1: video bitrate ascending order; 2: video bitrate descending order. Default value: 1.
     */
    public void setStreamOrder(Long StreamOrder) {
        this.StreamOrder = StreamOrder;
    }

    /**
     * Get Whether the Hls main m3u8 file contains resolution information, optional values: 1: INCLUDE includes video resolution; 2: EXCLUDE does not include video resolution. Default value: 1. 
     * @return VideoResolution Whether the Hls main m3u8 file contains resolution information, optional values: 1: INCLUDE includes video resolution; 2: EXCLUDE does not include video resolution. Default value: 1.
     */
    public Long getVideoResolution() {
        return this.VideoResolution;
    }

    /**
     * Set Whether the Hls main m3u8 file contains resolution information, optional values: 1: INCLUDE includes video resolution; 2: EXCLUDE does not include video resolution. Default value: 1.
     * @param VideoResolution Whether the Hls main m3u8 file contains resolution information, optional values: 1: INCLUDE includes video resolution; 2: EXCLUDE does not include video resolution. Default value: 1.
     */
    public void setVideoResolution(Long VideoResolution) {
        this.VideoResolution = VideoResolution;
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

    }
}

