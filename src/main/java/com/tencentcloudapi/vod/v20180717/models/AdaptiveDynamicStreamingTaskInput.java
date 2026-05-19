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
    * <p>Adaptive bitrate streaming template ID.</p>
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
    * <p>External subtitle file, with subtitle ID as the element, supports multiple subtitles, up to 16.</p>
    */
    @SerializedName("SubtitleSet")
    @Expose
    private String [] SubtitleSet;

    /**
    * <p>List of subtitle suppression information. A maximum of 2 are supported.</p>
    */
    @SerializedName("SubtitleInfoSet")
    @Expose
    private SubtitleInfoInput [] SubtitleInfoSet;

    /**
     * Get <p>Adaptive bitrate streaming template ID.</p> 
     * @return Definition <p>Adaptive bitrate streaming template ID.</p>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * Set <p>Adaptive bitrate streaming template ID.</p>
     * @param Definition <p>Adaptive bitrate streaming template ID.</p>
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
     * Get <p>External subtitle file, with subtitle ID as the element, supports multiple subtitles, up to 16.</p> 
     * @return SubtitleSet <p>External subtitle file, with subtitle ID as the element, supports multiple subtitles, up to 16.</p>
     */
    public String [] getSubtitleSet() {
        return this.SubtitleSet;
    }

    /**
     * Set <p>External subtitle file, with subtitle ID as the element, supports multiple subtitles, up to 16.</p>
     * @param SubtitleSet <p>External subtitle file, with subtitle ID as the element, supports multiple subtitles, up to 16.</p>
     */
    public void setSubtitleSet(String [] SubtitleSet) {
        this.SubtitleSet = SubtitleSet;
    }

    /**
     * Get <p>List of subtitle suppression information. A maximum of 2 are supported.</p> 
     * @return SubtitleInfoSet <p>List of subtitle suppression information. A maximum of 2 are supported.</p>
     */
    public SubtitleInfoInput [] getSubtitleInfoSet() {
        return this.SubtitleInfoSet;
    }

    /**
     * Set <p>List of subtitle suppression information. A maximum of 2 are supported.</p>
     * @param SubtitleInfoSet <p>List of subtitle suppression information. A maximum of 2 are supported.</p>
     */
    public void setSubtitleInfoSet(SubtitleInfoInput [] SubtitleInfoSet) {
        this.SubtitleInfoSet = SubtitleInfoSet;
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

    }
}

