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

public class ComposeTransitionItem extends AbstractModel {

    /**
    * The element duration. <li>The value of this parameter ends with `s`, which means seconds. For example, `3s` indicates 3 seconds. </li>
Default value: `1s`.
Note
<li>The number before `s` must be an integer. Non-integers will be rounded down to the nearest integer. </li>
<li>The transition element must be between two non-empty elements. </li>
<li>The duration of the transition element must be shorter than that of the preceding element and the following element. </li>
u200c<li>The start time of the following element on the track will be automatically changed to the end time of the preceding element minus the duration of the transition element. </li>
    */
    @SerializedName("Duration")
    @Expose
    private String Duration;

    /**
    * The transition effects.
The default transition effect is fade.
Note: You can add at most one image transition and one audio transition.
    */
    @SerializedName("Transitions")
    @Expose
    private ComposeTransitionOperation [] Transitions;

    /**
     * Get The element duration. <li>The value of this parameter ends with `s`, which means seconds. For example, `3s` indicates 3 seconds. </li>
Default value: `1s`.
Note
<li>The number before `s` must be an integer. Non-integers will be rounded down to the nearest integer. </li>
<li>The transition element must be between two non-empty elements. </li>
<li>The duration of the transition element must be shorter than that of the preceding element and the following element. </li>
u200c<li>The start time of the following element on the track will be automatically changed to the end time of the preceding element minus the duration of the transition element. </li> 
     * @return Duration The element duration. <li>The value of this parameter ends with `s`, which means seconds. For example, `3s` indicates 3 seconds. </li>
Default value: `1s`.
Note
<li>The number before `s` must be an integer. Non-integers will be rounded down to the nearest integer. </li>
<li>The transition element must be between two non-empty elements. </li>
<li>The duration of the transition element must be shorter than that of the preceding element and the following element. </li>
u200c<li>The start time of the following element on the track will be automatically changed to the end time of the preceding element minus the duration of the transition element. </li>
     */
    public String getDuration() {
        return this.Duration;
    }

    /**
     * Set The element duration. <li>The value of this parameter ends with `s`, which means seconds. For example, `3s` indicates 3 seconds. </li>
Default value: `1s`.
Note
<li>The number before `s` must be an integer. Non-integers will be rounded down to the nearest integer. </li>
<li>The transition element must be between two non-empty elements. </li>
<li>The duration of the transition element must be shorter than that of the preceding element and the following element. </li>
u200c<li>The start time of the following element on the track will be automatically changed to the end time of the preceding element minus the duration of the transition element. </li>
     * @param Duration The element duration. <li>The value of this parameter ends with `s`, which means seconds. For example, `3s` indicates 3 seconds. </li>
Default value: `1s`.
Note
<li>The number before `s` must be an integer. Non-integers will be rounded down to the nearest integer. </li>
<li>The transition element must be between two non-empty elements. </li>
<li>The duration of the transition element must be shorter than that of the preceding element and the following element. </li>
u200c<li>The start time of the following element on the track will be automatically changed to the end time of the preceding element minus the duration of the transition element. </li>
     */
    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    /**
     * Get The transition effects.
The default transition effect is fade.
Note: You can add at most one image transition and one audio transition. 
     * @return Transitions The transition effects.
The default transition effect is fade.
Note: You can add at most one image transition and one audio transition.
     */
    public ComposeTransitionOperation [] getTransitions() {
        return this.Transitions;
    }

    /**
     * Set The transition effects.
The default transition effect is fade.
Note: You can add at most one image transition and one audio transition.
     * @param Transitions The transition effects.
The default transition effect is fade.
Note: You can add at most one image transition and one audio transition.
     */
    public void setTransitions(ComposeTransitionOperation [] Transitions) {
        this.Transitions = Transitions;
    }

    public ComposeTransitionItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComposeTransitionItem(ComposeTransitionItem source) {
        if (source.Duration != null) {
            this.Duration = new String(source.Duration);
        }
        if (source.Transitions != null) {
            this.Transitions = new ComposeTransitionOperation[source.Transitions.length];
            for (int i = 0; i < source.Transitions.length; i++) {
                this.Transitions[i] = new ComposeTransitionOperation(source.Transitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "Transitions.", this.Transitions);

    }
}

