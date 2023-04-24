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

public class Activity extends AbstractModel{

    /**
    * The subtask type.
<li>`input`: The start.</li>
<li>`output`: The end.</li>
<li>`action-trans`: Transcoding.</li>
<li>`action-samplesnapshot`: Sampled screencapturing.</li>
<li>`action-AIAnalysis`: Content analysis.</li>
<li>`action-AIRecognition`: Content recognition.</li>
<li>`action-aiReview`: Content moderation.</li>
<li>`action-animated-graphics`: Animated screenshot generation.</li>
<li>`action-image-sprite`: Image sprite generation.</li>
<li>`action-snapshotByTimeOffset`: Time point screencapturing.</li>
<li>`action-adaptive-substream`: Adaptive bitrate streaming.</li>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActivityType")
    @Expose
    private String ActivityType;

    /**
    * The indexes of the subsequent actions.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReardriveIndex")
    @Expose
    private Long [] ReardriveIndex;

    /**
    * The parameters of a subtask.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ActivityPara")
    @Expose
    private ActivityPara ActivityPara;

    /**
     * Get The subtask type.
<li>`input`: The start.</li>
<li>`output`: The end.</li>
<li>`action-trans`: Transcoding.</li>
<li>`action-samplesnapshot`: Sampled screencapturing.</li>
<li>`action-AIAnalysis`: Content analysis.</li>
<li>`action-AIRecognition`: Content recognition.</li>
<li>`action-aiReview`: Content moderation.</li>
<li>`action-animated-graphics`: Animated screenshot generation.</li>
<li>`action-image-sprite`: Image sprite generation.</li>
<li>`action-snapshotByTimeOffset`: Time point screencapturing.</li>
<li>`action-adaptive-substream`: Adaptive bitrate streaming.</li>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActivityType The subtask type.
<li>`input`: The start.</li>
<li>`output`: The end.</li>
<li>`action-trans`: Transcoding.</li>
<li>`action-samplesnapshot`: Sampled screencapturing.</li>
<li>`action-AIAnalysis`: Content analysis.</li>
<li>`action-AIRecognition`: Content recognition.</li>
<li>`action-aiReview`: Content moderation.</li>
<li>`action-animated-graphics`: Animated screenshot generation.</li>
<li>`action-image-sprite`: Image sprite generation.</li>
<li>`action-snapshotByTimeOffset`: Time point screencapturing.</li>
<li>`action-adaptive-substream`: Adaptive bitrate streaming.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getActivityType() {
        return this.ActivityType;
    }

    /**
     * Set The subtask type.
<li>`input`: The start.</li>
<li>`output`: The end.</li>
<li>`action-trans`: Transcoding.</li>
<li>`action-samplesnapshot`: Sampled screencapturing.</li>
<li>`action-AIAnalysis`: Content analysis.</li>
<li>`action-AIRecognition`: Content recognition.</li>
<li>`action-aiReview`: Content moderation.</li>
<li>`action-animated-graphics`: Animated screenshot generation.</li>
<li>`action-image-sprite`: Image sprite generation.</li>
<li>`action-snapshotByTimeOffset`: Time point screencapturing.</li>
<li>`action-adaptive-substream`: Adaptive bitrate streaming.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActivityType The subtask type.
<li>`input`: The start.</li>
<li>`output`: The end.</li>
<li>`action-trans`: Transcoding.</li>
<li>`action-samplesnapshot`: Sampled screencapturing.</li>
<li>`action-AIAnalysis`: Content analysis.</li>
<li>`action-AIRecognition`: Content recognition.</li>
<li>`action-aiReview`: Content moderation.</li>
<li>`action-animated-graphics`: Animated screenshot generation.</li>
<li>`action-image-sprite`: Image sprite generation.</li>
<li>`action-snapshotByTimeOffset`: Time point screencapturing.</li>
<li>`action-adaptive-substream`: Adaptive bitrate streaming.</li>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActivityType(String ActivityType) {
        this.ActivityType = ActivityType;
    }

    /**
     * Get The indexes of the subsequent actions.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReardriveIndex The indexes of the subsequent actions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getReardriveIndex() {
        return this.ReardriveIndex;
    }

    /**
     * Set The indexes of the subsequent actions.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReardriveIndex The indexes of the subsequent actions.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReardriveIndex(Long [] ReardriveIndex) {
        this.ReardriveIndex = ReardriveIndex;
    }

    /**
     * Get The parameters of a subtask.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ActivityPara The parameters of a subtask.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ActivityPara getActivityPara() {
        return this.ActivityPara;
    }

    /**
     * Set The parameters of a subtask.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ActivityPara The parameters of a subtask.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setActivityPara(ActivityPara ActivityPara) {
        this.ActivityPara = ActivityPara;
    }

    public Activity() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Activity(Activity source) {
        if (source.ActivityType != null) {
            this.ActivityType = new String(source.ActivityType);
        }
        if (source.ReardriveIndex != null) {
            this.ReardriveIndex = new Long[source.ReardriveIndex.length];
            for (int i = 0; i < source.ReardriveIndex.length; i++) {
                this.ReardriveIndex[i] = new Long(source.ReardriveIndex[i]);
            }
        }
        if (source.ActivityPara != null) {
            this.ActivityPara = new ActivityPara(source.ActivityPara);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActivityType", this.ActivityType);
        this.setParamArraySimple(map, prefix + "ReardriveIndex.", this.ReardriveIndex);
        this.setParamObj(map, prefix + "ActivityPara.", this.ActivityPara);

    }
}

