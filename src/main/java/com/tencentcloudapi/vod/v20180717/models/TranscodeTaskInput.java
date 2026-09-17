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
    * 
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 
    */
    @SerializedName("WatermarkSet")
    @Expose
    private WatermarkInput [] WatermarkSet;

    /**
    * 
    */
    @SerializedName("TraceWatermark")
    @Expose
    private TraceWatermarkInput TraceWatermark;

    /**
    * 
    */
    @SerializedName("CopyRightWatermark")
    @Expose
    private CopyRightWatermarkInput CopyRightWatermark;

    /**
    * 
    */
    @SerializedName("BlindWatermark")
    @Expose
    private BlindWatermarkInput BlindWatermark;

    /**
    * 
    */
    @SerializedName("MosaicSet")
    @Expose
    private MosaicInput [] MosaicSet;

    /**
    * 
    */
    @SerializedName("HeadTailSet")
    @Expose
    private HeadTailTaskInput [] HeadTailSet;

    /**
    * 
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 
    */
    @SerializedName("OverrideParameter")
    @Expose
    private OverrideTranscodeParameter OverrideParameter;

    /**
    * 
    */
    @SerializedName("SubtitleInfoSet")
    @Expose
    private SubtitleInfoInput [] SubtitleInfoSet;

    /**
     * Get  
     * @return Definition 
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set 
     * @param Definition 
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * Get  
     * @return WatermarkSet 
     */
    public WatermarkInput [] getWatermarkSet() {
        return this.WatermarkSet;
    }

    /**
     * Set 
     * @param WatermarkSet 
     */
    public void setWatermarkSet(WatermarkInput [] WatermarkSet) {
        this.WatermarkSet = WatermarkSet;
    }

    /**
     * Get  
     * @return TraceWatermark 
     */
    public TraceWatermarkInput getTraceWatermark() {
        return this.TraceWatermark;
    }

    /**
     * Set 
     * @param TraceWatermark 
     */
    public void setTraceWatermark(TraceWatermarkInput TraceWatermark) {
        this.TraceWatermark = TraceWatermark;
    }

    /**
     * Get  
     * @return CopyRightWatermark 
     */
    public CopyRightWatermarkInput getCopyRightWatermark() {
        return this.CopyRightWatermark;
    }

    /**
     * Set 
     * @param CopyRightWatermark 
     */
    public void setCopyRightWatermark(CopyRightWatermarkInput CopyRightWatermark) {
        this.CopyRightWatermark = CopyRightWatermark;
    }

    /**
     * Get  
     * @return BlindWatermark 
     */
    public BlindWatermarkInput getBlindWatermark() {
        return this.BlindWatermark;
    }

    /**
     * Set 
     * @param BlindWatermark 
     */
    public void setBlindWatermark(BlindWatermarkInput BlindWatermark) {
        this.BlindWatermark = BlindWatermark;
    }

    /**
     * Get  
     * @return MosaicSet 
     */
    public MosaicInput [] getMosaicSet() {
        return this.MosaicSet;
    }

    /**
     * Set 
     * @param MosaicSet 
     */
    public void setMosaicSet(MosaicInput [] MosaicSet) {
        this.MosaicSet = MosaicSet;
    }

    /**
     * Get  
     * @return HeadTailSet 
     */
    public HeadTailTaskInput [] getHeadTailSet() {
        return this.HeadTailSet;
    }

    /**
     * Set 
     * @param HeadTailSet 
     */
    public void setHeadTailSet(HeadTailTaskInput [] HeadTailSet) {
        this.HeadTailSet = HeadTailSet;
    }

    /**
     * Get  
     * @return StartTimeOffset 
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set 
     * @param StartTimeOffset 
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get  
     * @return EndTimeOffset 
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set 
     * @param EndTimeOffset 
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get  
     * @return OverrideParameter 
     */
    public OverrideTranscodeParameter getOverrideParameter() {
        return this.OverrideParameter;
    }

    /**
     * Set 
     * @param OverrideParameter 
     */
    public void setOverrideParameter(OverrideTranscodeParameter OverrideParameter) {
        this.OverrideParameter = OverrideParameter;
    }

    /**
     * Get  
     * @return SubtitleInfoSet 
     */
    public SubtitleInfoInput [] getSubtitleInfoSet() {
        return this.SubtitleInfoSet;
    }

    /**
     * Set 
     * @param SubtitleInfoSet 
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
        if (source.OverrideParameter != null) {
            this.OverrideParameter = new OverrideTranscodeParameter(source.OverrideParameter);
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
        this.setParamObj(map, prefix + "OverrideParameter.", this.OverrideParameter);
        this.setParamArrayObj(map, prefix + "SubtitleInfoSet.", this.SubtitleInfoSet);

    }
}

