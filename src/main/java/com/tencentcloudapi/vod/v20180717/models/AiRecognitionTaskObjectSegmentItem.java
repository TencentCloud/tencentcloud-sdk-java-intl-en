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

public class AiRecognitionTaskObjectSegmentItem extends AbstractModel {

    /**
    * Identifies the offset time of the beginning of the segment, in seconds.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Offset time to identify the end of the segment, in seconds.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * Identify segment confidence. Value: 0~100.
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * The area coordinates of the recognition result. The array contains 4 elements [x1, y1, x2, y2], which in turn represent the horizontal and vertical coordinates of the upper left point and lower right point of the area.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get Identifies the offset time of the beginning of the segment, in seconds. 
     * @return StartTimeOffset Identifies the offset time of the beginning of the segment, in seconds.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Identifies the offset time of the beginning of the segment, in seconds.
     * @param StartTimeOffset Identifies the offset time of the beginning of the segment, in seconds.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Offset time to identify the end of the segment, in seconds. 
     * @return EndTimeOffset Offset time to identify the end of the segment, in seconds.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Offset time to identify the end of the segment, in seconds.
     * @param EndTimeOffset Offset time to identify the end of the segment, in seconds.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get Identify segment confidence. Value: 0~100. 
     * @return Confidence Identify segment confidence. Value: 0~100.
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * Set Identify segment confidence. Value: 0~100.
     * @param Confidence Identify segment confidence. Value: 0~100.
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The area coordinates of the recognition result. The array contains 4 elements [x1, y1, x2, y2], which in turn represent the horizontal and vertical coordinates of the upper left point and lower right point of the area. 
     * @return AreaCoordSet The area coordinates of the recognition result. The array contains 4 elements [x1, y1, x2, y2], which in turn represent the horizontal and vertical coordinates of the upper left point and lower right point of the area.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set The area coordinates of the recognition result. The array contains 4 elements [x1, y1, x2, y2], which in turn represent the horizontal and vertical coordinates of the upper left point and lower right point of the area.
     * @param AreaCoordSet The area coordinates of the recognition result. The array contains 4 elements [x1, y1, x2, y2], which in turn represent the horizontal and vertical coordinates of the upper left point and lower right point of the area.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    public AiRecognitionTaskObjectSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiRecognitionTaskObjectSegmentItem(AiRecognitionTaskObjectSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.Confidence != null) {
            this.Confidence = new Float(source.Confidence);
        }
        if (source.AreaCoordSet != null) {
            this.AreaCoordSet = new Long[source.AreaCoordSet.length];
            for (int i = 0; i < source.AreaCoordSet.length; i++) {
                this.AreaCoordSet[i] = new Long(source.AreaCoordSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

