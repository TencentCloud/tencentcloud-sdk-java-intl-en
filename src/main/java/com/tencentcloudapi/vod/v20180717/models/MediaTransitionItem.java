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

public class MediaTransitionItem extends AbstractModel {

    /**
    * Transition duration, in seconds. For the two media segments undergoing transition processing, the start time of the second segment on the track is automatically adjusted and set to the end time of the previous segment minus the transition duration.
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
    */
    @SerializedName("Transitions")
    @Expose
    private TransitionOpertion [] Transitions;

    /**
    * Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
    */
    @SerializedName("MediaTransitions")
    @Expose
    private TransitionOperation [] MediaTransitions;

    /**
     * Get Transition duration, in seconds. For the two media segments undergoing transition processing, the start time of the second segment on the track is automatically adjusted and set to the end time of the previous segment minus the transition duration. 
     * @return Duration Transition duration, in seconds. For the two media segments undergoing transition processing, the start time of the second segment on the track is automatically adjusted and set to the end time of the previous segment minus the transition duration.
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * Set Transition duration, in seconds. For the two media segments undergoing transition processing, the start time of the second segment on the track is automatically adjusted and set to the end time of the previous segment minus the transition duration.
     * @param Duration Transition duration, in seconds. For the two media segments undergoing transition processing, the start time of the second segment on the track is automatically adjusted and set to the end time of the previous segment minus the transition duration.
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively. 
     * @return Transitions Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
     * @deprecated
     */
    @Deprecated
    public TransitionOpertion [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
     * @param Transitions Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
     * @deprecated
     */
    @Deprecated
    public void setTransitions(TransitionOpertion [] Transitions) {
        this.Transitions = Transitions;
    }

    /**
     * Get Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively. 
     * @return MediaTransitions Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
     */
    public TransitionOperation [] getMediaTransitions() {
        return this.MediaTransitions;
    }

    /**
     * Set Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
     * @param MediaTransitions Transition operation list. A maximum of one image transition operation and one audio transition operation are supported respectively.
     */
    public void setMediaTransitions(TransitionOperation [] MediaTransitions) {
        this.MediaTransitions = MediaTransitions;
    }

    public MediaTransitionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaTransitionItem(MediaTransitionItem source) {
        if (source.Duration != null) {
            this.Duration = new Float(source.Duration);
        }
        if (source.Transitions != null) {
            this.Transitions = new TransitionOpertion[source.Transitions.length];
            for (int i = 0; i < source.Transitions.length; i++) {
                this.Transitions[i] = new TransitionOpertion(source.Transitions[i]);
            }
        }
        if (source.MediaTransitions != null) {
            this.MediaTransitions = new TransitionOperation[source.MediaTransitions.length];
            for (int i = 0; i < source.MediaTransitions.length; i++) {
                this.MediaTransitions[i] = new TransitionOperation(source.MediaTransitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "Transitions.", this.Transitions);
        this.setParamArrayObj(map, prefix + "MediaTransitions.", this.MediaTransitions);

    }
}

