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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ActivityResult extends AbstractModel {

    /**
    * <p>Atomic task type.</p><li>Transcode: Transcoding.</li><li>SampleSnapshot: Sampled screenshot.</li><li>AnimatedGraphics: Animated image.</li><li>SnapshotByTimeOffset: Time point screenshot.</li><li>ImageSprites: Sprite sheet.</li><li>AdaptiveDynamicStreaming: Adaptive bitrate stream.</li><li>AiContentReview: Content review.</li><li>AIRecognition: Intelligent recognition.</li><li>AIAnalysis: Intelligent analysis.</li><li>AiQualityControl: Media quality inspection.</li><li>SmartSubtitles: Smart subtitle.</li><li>SmartErase: Smart erasing.</li><li>Dubbing: AI dubbing.</li>
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * <p>Output of the atomic task.</p>
    */
    @SerializedName("ActivityResItem")
    @Expose
    private ActivityResItem ActivityResItem;

    /**
     * Get <p>Atomic task type.</p><li>Transcode: Transcoding.</li><li>SampleSnapshot: Sampled screenshot.</li><li>AnimatedGraphics: Animated image.</li><li>SnapshotByTimeOffset: Time point screenshot.</li><li>ImageSprites: Sprite sheet.</li><li>AdaptiveDynamicStreaming: Adaptive bitrate stream.</li><li>AiContentReview: Content review.</li><li>AIRecognition: Intelligent recognition.</li><li>AIAnalysis: Intelligent analysis.</li><li>AiQualityControl: Media quality inspection.</li><li>SmartSubtitles: Smart subtitle.</li><li>SmartErase: Smart erasing.</li><li>Dubbing: AI dubbing.</li> 
     * @return ActivityType <p>Atomic task type.</p><li>Transcode: Transcoding.</li><li>SampleSnapshot: Sampled screenshot.</li><li>AnimatedGraphics: Animated image.</li><li>SnapshotByTimeOffset: Time point screenshot.</li><li>ImageSprites: Sprite sheet.</li><li>AdaptiveDynamicStreaming: Adaptive bitrate stream.</li><li>AiContentReview: Content review.</li><li>AIRecognition: Intelligent recognition.</li><li>AIAnalysis: Intelligent analysis.</li><li>AiQualityControl: Media quality inspection.</li><li>SmartSubtitles: Smart subtitle.</li><li>SmartErase: Smart erasing.</li><li>Dubbing: AI dubbing.</li>
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set <p>Atomic task type.</p><li>Transcode: Transcoding.</li><li>SampleSnapshot: Sampled screenshot.</li><li>AnimatedGraphics: Animated image.</li><li>SnapshotByTimeOffset: Time point screenshot.</li><li>ImageSprites: Sprite sheet.</li><li>AdaptiveDynamicStreaming: Adaptive bitrate stream.</li><li>AiContentReview: Content review.</li><li>AIRecognition: Intelligent recognition.</li><li>AIAnalysis: Intelligent analysis.</li><li>AiQualityControl: Media quality inspection.</li><li>SmartSubtitles: Smart subtitle.</li><li>SmartErase: Smart erasing.</li><li>Dubbing: AI dubbing.</li>
     * @param ActivityType <p>Atomic task type.</p><li>Transcode: Transcoding.</li><li>SampleSnapshot: Sampled screenshot.</li><li>AnimatedGraphics: Animated image.</li><li>SnapshotByTimeOffset: Time point screenshot.</li><li>ImageSprites: Sprite sheet.</li><li>AdaptiveDynamicStreaming: Adaptive bitrate stream.</li><li>AiContentReview: Content review.</li><li>AIRecognition: Intelligent recognition.</li><li>AIAnalysis: Intelligent analysis.</li><li>AiQualityControl: Media quality inspection.</li><li>SmartSubtitles: Smart subtitle.</li><li>SmartErase: Smart erasing.</li><li>Dubbing: AI dubbing.</li>
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get <p>Output of the atomic task.</p> 
     * @return ActivityResItem <p>Output of the atomic task.</p>
     */
    public ActivityResItem getActivityResItem() {
        return this.ActivityResItem;
    }

    /**
     * Set <p>Output of the atomic task.</p>
     * @param ActivityResItem <p>Output of the atomic task.</p>
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

