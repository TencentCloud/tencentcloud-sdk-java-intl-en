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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AiParagraphInfo extends AbstractModel {

    /**
    * Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Summary")
    @Expose
    private String Summary;

    /**
    * Segmentation start time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * Segmentation end time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * Get Segment summary.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Summary Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSummary() {
        return this.Summary;
    }

    /**
     * Set Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Summary Segment summary.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    /**
     * Get Segmentation start time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StartTimeOffset Segmentation start time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Segmentation start time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StartTimeOffset Segmentation start time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get Segmentation end time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndTimeOffset Segmentation end time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set Segmentation end time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndTimeOffset Segmentation end time point, in seconds.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    public AiParagraphInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AiParagraphInfo(AiParagraphInfo source) {
        if (source.Summary != null) {
            this.Summary = new String(source.Summary);
        }
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Summary", this.Summary);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

