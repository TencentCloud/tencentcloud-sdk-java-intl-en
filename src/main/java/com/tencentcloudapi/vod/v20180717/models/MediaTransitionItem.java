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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaTransitionItem extends AbstractModel{

    /**
    * Transition duration in seconds. For two media segments that use a transition, the start time of the second segment on the track will be automatically set to the end time of the first segment minus the transition duration.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * List of transition operations. Up to one video image or audio transition operation is supported.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Transitions")
    @Expose
    private TransitionOpertion [] Transitions;

    /**
     * Get Transition duration in seconds. For two media segments that use a transition, the start time of the second segment on the track will be automatically set to the end time of the first segment minus the transition duration. 
     * @return Duration Transition duration in seconds. For two media segments that use a transition, the start time of the second segment on the track will be automatically set to the end time of the first segment minus the transition duration.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Transition duration in seconds. For two media segments that use a transition, the start time of the second segment on the track will be automatically set to the end time of the first segment minus the transition duration.
     * @param Duration Transition duration in seconds. For two media segments that use a transition, the start time of the second segment on the track will be automatically set to the end time of the first segment minus the transition duration.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get List of transition operations. Up to one video image or audio transition operation is supported.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Transitions List of transition operations. Up to one video image or audio transition operation is supported.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public TransitionOpertion [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set List of transition operations. Up to one video image or audio transition operation is supported.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Transitions List of transition operations. Up to one video image or audio transition operation is supported.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTransitions(TransitionOpertion [] Transitions) {
        this.Transitions = Transitions;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "Transitions.", this.Transitions);

    }
}

