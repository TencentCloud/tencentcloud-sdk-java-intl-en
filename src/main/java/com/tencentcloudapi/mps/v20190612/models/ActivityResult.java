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

public class ActivityResult extends AbstractModel {

    /**
    * Atomic task type.
<li>Transcode: transcoding.</li>
<li>SampleSnapshot: sampled screenshot taking.</li>
<li>AnimatedGraphics: animated image generating.</li>
<li>SnapshotByTimeOffset: time point screenshot taking.</li>
<li>ImageSprites: sprite image generating.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
<li>AiContentReview: content moderation.</li>
<li>AIRecognition: intelligent identification.</li>
<li>AIAnalysis: intelligent analysis.</li>

<li>AiQualityControl: media quality inspection.</li>
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * The execution results of the subtasks of the scheme.
    */
    @SerializedName("ActivityResItem")
    @Expose
    private ActivityResItem ActivityResItem;

    /**
     * Get Atomic task type.
<li>Transcode: transcoding.</li>
<li>SampleSnapshot: sampled screenshot taking.</li>
<li>AnimatedGraphics: animated image generating.</li>
<li>SnapshotByTimeOffset: time point screenshot taking.</li>
<li>ImageSprites: sprite image generating.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
<li>AiContentReview: content moderation.</li>
<li>AIRecognition: intelligent identification.</li>
<li>AIAnalysis: intelligent analysis.</li>

<li>AiQualityControl: media quality inspection.</li> 
     * @return ActivityType Atomic task type.
<li>Transcode: transcoding.</li>
<li>SampleSnapshot: sampled screenshot taking.</li>
<li>AnimatedGraphics: animated image generating.</li>
<li>SnapshotByTimeOffset: time point screenshot taking.</li>
<li>ImageSprites: sprite image generating.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
<li>AiContentReview: content moderation.</li>
<li>AIRecognition: intelligent identification.</li>
<li>AIAnalysis: intelligent analysis.</li>

<li>AiQualityControl: media quality inspection.</li>
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set Atomic task type.
<li>Transcode: transcoding.</li>
<li>SampleSnapshot: sampled screenshot taking.</li>
<li>AnimatedGraphics: animated image generating.</li>
<li>SnapshotByTimeOffset: time point screenshot taking.</li>
<li>ImageSprites: sprite image generating.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
<li>AiContentReview: content moderation.</li>
<li>AIRecognition: intelligent identification.</li>
<li>AIAnalysis: intelligent analysis.</li>

<li>AiQualityControl: media quality inspection.</li>
     * @param ActivityType Atomic task type.
<li>Transcode: transcoding.</li>
<li>SampleSnapshot: sampled screenshot taking.</li>
<li>AnimatedGraphics: animated image generating.</li>
<li>SnapshotByTimeOffset: time point screenshot taking.</li>
<li>ImageSprites: sprite image generating.</li>
<li>AdaptiveDynamicStreaming: adaptive bitrate streaming.</li>
<li>AiContentReview: content moderation.</li>
<li>AIRecognition: intelligent identification.</li>
<li>AIAnalysis: intelligent analysis.</li>

<li>AiQualityControl: media quality inspection.</li>
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get The execution results of the subtasks of the scheme. 
     * @return ActivityResItem The execution results of the subtasks of the scheme.
     */
    public ActivityResItem getActivityResItem() {
        return this.ActivityResItem;
    }

    /**
     * Set The execution results of the subtasks of the scheme.
     * @param ActivityResItem The execution results of the subtasks of the scheme.
     */
    public void setActivityResItem(ActivityResItem ActivityResItem) {
        this.ActivityResItem = ActivityResItem;
    }

    public ActivityResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ActivityResult(ActivityResult source) {
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.ActivityResItem != null) {
            this.ActivityResItem = new ActivityResItem(source.ActivityResItem);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamObj(map, prefix + "ActivityResItem.", this.ActivityResItem);

    }
}

