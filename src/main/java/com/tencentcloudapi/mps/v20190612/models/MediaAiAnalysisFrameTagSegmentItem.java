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

public class MediaAiAnalysisFrameTagSegmentItem extends AbstractModel{

    /**
    * Start time offset of frame-specific tag.
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * End time offset of frame-specific tag.
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * List of tags in time period.
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisFrameTagItem [] TagSet;

    /**
     * Get Start time offset of frame-specific tag. 
     * @return StartTimeOffset Start time offset of frame-specific tag.
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set Start time offset of frame-specific tag.
     * @param StartTimeOffset Start time offset of frame-specific tag.
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get End time offset of frame-specific tag. 
     * @return EndTimeOffset End time offset of frame-specific tag.
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set End time offset of frame-specific tag.
     * @param EndTimeOffset End time offset of frame-specific tag.
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get List of tags in time period. 
     * @return TagSet List of tags in time period.
     */
    public MediaAiAnalysisFrameTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set List of tags in time period.
     * @param TagSet List of tags in time period.
     */
    public void setTagSet(MediaAiAnalysisFrameTagItem [] TagSet) {
        this.TagSet = TagSet;
    }

    public MediaAiAnalysisFrameTagSegmentItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaAiAnalysisFrameTagSegmentItem(MediaAiAnalysisFrameTagSegmentItem source) {
        if (source.StartTimeOffset != null) {
            this.StartTimeOffset = new Float(source.StartTimeOffset);
        }
        if (source.EndTimeOffset != null) {
            this.EndTimeOffset = new Float(source.EndTimeOffset);
        }
        if (source.TagSet != null) {
            this.TagSet = new MediaAiAnalysisFrameTagItem[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new MediaAiAnalysisFrameTagItem(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

