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

public class MediaAiAnalysisFrameTagSegmentItem extends AbstractModel {

    /**
    * <p>Offset time for frame tagging start.</p><p>Unit: second</p>
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * <p>End time offset of frame tagging.</p><p>Unit: seconds</p>
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * <p>Tag list in the time segment.</p>
    */
    @SerializedName("TagSet")
    @Expose
    private MediaAiAnalysisFrameTagItem [] TagSet;

    /**
     * Get <p>Offset time for frame tagging start.</p><p>Unit: second</p> 
     * @return StartTimeOffset <p>Offset time for frame tagging start.</p><p>Unit: second</p>
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * Set <p>Offset time for frame tagging start.</p><p>Unit: second</p>
     * @param StartTimeOffset <p>Offset time for frame tagging start.</p><p>Unit: second</p>
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * Get <p>End time offset of frame tagging.</p><p>Unit: seconds</p> 
     * @return EndTimeOffset <p>End time offset of frame tagging.</p><p>Unit: seconds</p>
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * Set <p>End time offset of frame tagging.</p><p>Unit: seconds</p>
     * @param EndTimeOffset <p>End time offset of frame tagging.</p><p>Unit: seconds</p>
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * Get <p>Tag list in the time segment.</p> 
     * @return TagSet <p>Tag list in the time segment.</p>
     */
    public MediaAiAnalysisFrameTagItem [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set <p>Tag list in the time segment.</p>
     * @param TagSet <p>Tag list in the time segment.</p>
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

