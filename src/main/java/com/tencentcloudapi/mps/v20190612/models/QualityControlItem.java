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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlItem extends AbstractModel{

    /**
    * The confidence score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Confidence")
    @Expose
    private Long Confidence;

    /**
    * The start timestamp (second) of the segment.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * The end timestamp (second) of the segment.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * The coordinates (px) of the top left and bottom right corner.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AreaCoordSet")
    @Expose
    private Long [] AreaCoordSet;

    /**
     * Get The confidence score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Confidence The confidence score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConfidence() {
        return this.Confidence;
    }

    /**
     * Set The confidence score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Confidence The confidence score. Value range: 0-100.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfidence(Long Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * Get The start timestamp (second) of the segment. 
     * @return StartTimeOffset The start timestamp (second) of the segment.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set The start timestamp (second) of the segment.
     * @param StartTimeOffset The start timestamp (second) of the segment.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get The end timestamp (second) of the segment. 
     * @return EndTimeOffset The end timestamp (second) of the segment.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set The end timestamp (second) of the segment.
     * @param EndTimeOffset The end timestamp (second) of the segment.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get The coordinates (px) of the top left and bottom right corner.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AreaCoordSet The coordinates (px) of the top left and bottom right corner.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getAreaCoordSet() {
        return this.AreaCoordSet;
    }

    /**
     * Set The coordinates (px) of the top left and bottom right corner.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AreaCoordSet The coordinates (px) of the top left and bottom right corner.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAreaCoordSet(Long [] AreaCoordSet) {
        this.AreaCoordSet = AreaCoordSet;
    }

    public QualityControlItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlItem(QualityControlItem source) {
        if (source.Confidence != null) {
            this.Confidence = new Long(source.Confidence);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
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
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArraySimple(map, prefix + "AreaCoordSet.", this.AreaCoordSet);

    }
}

