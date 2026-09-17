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

public class AdaptiveDynamicStreamingTaskInput extends AbstractModel {

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
    @SerializedName("SubtitleSet")
    @Expose
    private String [] SubtitleSet;

    /**
    * 
    */
    @SerializedName("SubtitleInfoSet")
    @Expose
    private SubtitleInfoInput [] SubtitleInfoSet;

    /**
    * 
    */
    @SerializedName("DrmInfo")
    @Expose
    private ThirdPartyDrmInfo DrmInfo;

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
     * @return SubtitleSet 
     */
    public String [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set 
     * @param SubtitleSet 
     */
    public void setSubtitleSet(String [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
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

    /**
     * Get  
     * @return DrmInfo 
     */
    public ThirdPartyDrmInfo getDrmInfo() {
        return this.DrmInfo;
    }

    /**
     * Set 
     * @param DrmInfo 
     */
    public void setDrmInfo(ThirdPartyDrmInfo DrmInfo) {
        this.DrmInfo = DrmInfo;
    }

    public AdaptiveDynamicStreamingTaskInput() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveDynamicStreamingTaskInput(AdaptiveDynamicStreamingTaskInput source) {
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
        if (source.SubtitleSet != null) {
            this.SubtitleSet = new String[source.SubtitleSet.length];
            for (int i = 0; i < source.SubtitleSet.length; i++) {
                this.SubtitleSet[i] = new String(source.SubtitleSet[i]);
            }
        }
        if (source.SubtitleInfoSet != null) {
            this.SubtitleInfoSet = new SubtitleInfoInput[source.SubtitleInfoSet.length];
            for (int i = 0; i < source.SubtitleInfoSet.length; i++) {
                this.SubtitleInfoSet[i] = new SubtitleInfoInput(source.SubtitleInfoSet[i]);
            }
        }
        if (source.DrmInfo != null) {
            this.DrmInfo = new ThirdPartyDrmInfo(source.DrmInfo);
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
        this.setParamArraySimple(map, prefix + "SubtitleSet.", this.SubtitleSet);
        this.setParamArrayObj(map, prefix + "SubtitleInfoSet.", this.SubtitleInfoSet);
        this.setParamObj(map, prefix + "DrmInfo.", this.DrmInfo);

    }
}

