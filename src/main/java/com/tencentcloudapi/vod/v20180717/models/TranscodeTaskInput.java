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

public class TranscodeTaskInput extends AbstractModel {

    /**
    * <p>Video transcoding template ID.</p>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * <p>Traceable watermark.</p>
    */
    @SerializedName("TraceWatermark")
    @Expose
    private TraceWatermarkInput TraceWatermark;

    /**
    * <p>Copyright watermark.</p>
    */
    @SerializedName("CopyRightWatermark")
    @Expose
    private CopyRightWatermarkInput CopyRightWatermark;

    /**
    * <p>Digital watermark.</p>
    */
    @SerializedName("BlindWatermark")
    @Expose
    private BlindWatermarkInput BlindWatermark;

    /**
    * <p>Mosaic list. Up to 10 are supported.</p>
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * <p>Opening and ending list. Up to 10 opening and ending sequences are supported.</p>
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * <p>Start time offset of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video starts from the start position of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video starts from the nth second position of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>Offset of the termination time of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video lasts until the end of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video lasts until the nth second of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>List of subtitle suppression information. Up to 2 are supported.</p>
    */
    @SerializedName("SubtitleInfoSet")
    @Expose
    private SubtitleInfoInput [] SubtitleInfoSet;

    /**
     * Get <p>Video transcoding template ID.</p> 
     * @return Definition <p>Video transcoding template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Video transcoding template ID.</p>
     * @param Definition <p>Video transcoding template ID.</p>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get <p>Watermark list. Up to 10 image or text watermarks are supported.</p> 
     * @return WatermarkSet <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     * @param WatermarkSet <p>Watermark list. Up to 10 image or text watermarks are supported.</p>
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get <p>Traceable watermark.</p> 
     * @return TraceWatermark <p>Traceable watermark.</p>
     */
    public TraceWatermarkInput getTraceWatermark() {
        return this.TraceWatermark;
    }

    /**
     * Set <p>Traceable watermark.</p>
     * @param TraceWatermark <p>Traceable watermark.</p>
     */
    public void setTraceWatermark(TraceWatermarkInput TraceWatermark) {
        this.TraceWatermark = TraceWatermark;
    }

    /**
     * Get <p>Copyright watermark.</p> 
     * @return CopyRightWatermark <p>Copyright watermark.</p>
     */
    public CopyRightWatermarkInput getCopyRightWatermark() {
        return this.CopyRightWatermark;
    }

    /**
     * Set <p>Copyright watermark.</p>
     * @param CopyRightWatermark <p>Copyright watermark.</p>
     */
    public void setCopyRightWatermark(CopyRightWatermarkInput CopyRightWatermark) {
        this.CopyRightWatermark = CopyRightWatermark;
    }

    /**
     * Get <p>Digital watermark.</p> 
     * @return BlindWatermark <p>Digital watermark.</p>
     */
    public BlindWatermarkInput getBlindWatermark() {
        return this.BlindWatermark;
    }

    /**
     * Set <p>Digital watermark.</p>
     * @param BlindWatermark <p>Digital watermark.</p>
     */
    public void setBlindWatermark(BlindWatermarkInput BlindWatermark) {
        this.BlindWatermark = BlindWatermark;
    }

    /**
     * Get <p>Mosaic list. Up to 10 are supported.</p> 
     * @return MosaicSet <p>Mosaic list. Up to 10 are supported.</p>
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set <p>Mosaic list. Up to 10 are supported.</p>
     * @param MosaicSet <p>Mosaic list. Up to 10 are supported.</p>
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get <p>Opening and ending list. Up to 10 opening and ending sequences are supported.</p> 
     * @return HeadTailSet <p>Opening and ending list. Up to 10 opening and ending sequences are supported.</p>
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set <p>Opening and ending list. Up to 10 opening and ending sequences are supported.</p>
     * @param HeadTailSet <p>Opening and ending list. Up to 10 opening and ending sequences are supported.</p>
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get <p>Start time offset of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video starts from the start position of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video starts from the nth second position of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li> 
     * @return StartTimeOffset <p>Start time offset of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video starts from the start position of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video starts from the nth second position of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>Start time offset of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video starts from the start position of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video starts from the nth second position of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
     * @param StartTimeOffset <p>Start time offset of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video starts from the start position of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video starts from the nth second position of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video starts from the position n seconds before the end of the original video.</li>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>Offset of the termination time of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video lasts until the end of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video lasts until the nth second of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video lasts until n seconds before the end of the original video.</li> 
     * @return EndTimeOffset <p>Offset of the termination time of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video lasts until the end of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video lasts until the nth second of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>Offset of the termination time of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video lasts until the end of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video lasts until the nth second of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
     * @param EndTimeOffset <p>Offset of the termination time of the transcoded video, unit: second.</p><li>Leave it blank or enter 0 means the transcoded video lasts until the end of the original video.</li><li>When the value is greater than 0 (assume it is n), it means the transcoded video lasts until the nth second of the original video.</li><li>When the value is less than 0 (assume it is -n), it means the transcoded video lasts until n seconds before the end of the original video.</li>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>List of subtitle suppression information. Up to 2 are supported.</p> 
     * @return SubtitleInfoSet <p>List of subtitle suppression information. Up to 2 are supported.</p>
     */
    public SubtitleInfoInput [] getSubtitleInfoSet() {
        return this.SubtitleInfoSet;
    }

    /**
     * Set <p>List of subtitle suppression information. Up to 2 are supported.</p>
     * @param SubtitleInfoSet <p>List of subtitle suppression information. Up to 2 are supported.</p>
     */
    public void setSubtitleInfoSet(SubtitleInfoInput [] SubtitleInfoSet) {
        this.SubtitleInfoSet = SubtitleInfoSet;
    }

    public TranscodeTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TranscodeTaskInput(TranscodeTaskInput source) {
        if (source.Definition != null) {
            this.Definition = new Long(source.Definition);
        }
        if (source.WatermarkSet != null) {
            this.WatermarkSet = new WatermarkInput[source.WatermarkSet.length];
            for (int i = 0; i < source.WatermarkSet.length; i++) {
                this.WatermarkSet[i] = new WatermarkInput(source.WatermarkSet[i]);
            }
        }
        if (source.TraceWatermark != null) {
            this.TraceWatermark = new TraceWatermarkInput(source.TraceWatermark);
        }
        if (source.CopyRightWatermark != null) {
            this.CopyRightWatermark = new CopyRightWatermarkInput(source.CopyRightWatermark);
        }
        if (source.BlindWatermark != null) {
            this.BlindWatermark = new BlindWatermarkInput(source.BlindWatermark);
        }
        if (source.MosaicSet != null) {
            this.MosaicSet = new MosaicInput[source.MosaicSet.length];
            for (int i = 0; i < source.MosaicSet.length; i++) {
                this.MosaicSet[i] = new MosaicInput(source.MosaicSet[i]);
            }
        }
        if (source.HeadTailSet != null) {
            this.HeadTailSet = new HeadTailTaskInput[source.HeadTailSet.length];
            for (int i = 0; i < source.HeadTailSet.length; i++) {
                this.HeadTailSet[i] = new HeadTailTaskInput(source.HeadTailSet[i]);
            }
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.SubtitleInfoSet != null) {
            this.SubtitleInfoSet = new SubtitleInfoInput[source.SubtitleInfoSet.length];
            for (int i = 0; i < source.SubtitleInfoSet.length; i++) {
                this.SubtitleInfoSet[i] = new SubtitleInfoInput(source.SubtitleInfoSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamArrayObj(map, prefix + "WatermarkSet.", this.WatermarkSet);
        this.setParamObj(map, prefix + "TraceWatermark.", this.TraceWatermark);
        this.setParamObj(map, prefix + "CopyRightWatermark.", this.CopyRightWatermark);
        this.setParamObj(map, prefix + "BlindWatermark.", this.BlindWatermark);
        this.setParamArrayObj(map, prefix + "MosaicSet.", this.MosaicSet);
        this.setParamArrayObj(map, prefix + "HeadTailSet.", this.HeadTailSet);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArrayObj(map, prefix + "SubtitleInfoSet.", this.SubtitleInfoSet);

    }
}

