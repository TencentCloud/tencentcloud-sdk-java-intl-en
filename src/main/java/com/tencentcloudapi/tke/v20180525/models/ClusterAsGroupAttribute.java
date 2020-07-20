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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterAsGroupAttribute extends AbstractModel{

    /**
    * Scaling group ID
    */
    @SerializedName("AutoScalingGroupId")
    @Expose
    private String AutoScalingGroupId;

    /**
    * Whether it is enabled
    */
    @SerializedName("AutoScalingGroupEnabled")
    @Expose
    private Boolean AutoScalingGroupEnabled;

    /**
    * Maximum and minimum number of pods in a scaling group
    */
    @SerializedName("AutoScalingGroupRange")
    @Expose
    private AutoScalingGroupRange AutoScalingGroupRange;

    /**
     * Get Scaling group ID 
     * @return AutoScalingGroupId Scaling group ID
     */
    public String getAutoScalingGroupId() {
        return this.AutoScalingGroupId;
    }

    /**
     * Set Scaling group ID
     * @param AutoScalingGroupId Scaling group ID
     */
    public void setAutoScalingGroupId(String AutoScalingGroupId) {
        this.AutoScalingGroupId = AutoScalingGroupId;
    }

    /**
     * Get Whether it is enabled 
     * @return AutoScalingGroupEnabled Whether it is enabled
     */
    public Boolean getAutoScalingGroupEnabled() {
        return this.AutoScalingGroupEnabled;
    }

    /**
     * Set Whether it is enabled
     * @param AutoScalingGroupEnabled Whether it is enabled
     */
    public void setAutoScalingGroupEnabled(Boolean AutoScalingGroupEnabled) {
        this.AutoScalingGroupEnabled = AutoScalingGroupEnabled;
    }

    /**
     * Get Maximum and minimum number of pods in a scaling group 
     * @return AutoScalingGroupRange Maximum and minimum number of pods in a scaling group
     */
    public AutoScalingGroupRange getAutoScalingGroupRange() {
        return this.AutoScalingGroupRange;
    }

    /**
     * Set Maximum and minimum number of pods in a scaling group
     * @param AutoScalingGroupRange Maximum and minimum number of pods in a scaling group
     */
    public void setAutoScalingGroupRange(AutoScalingGroupRange AutoScalingGroupRange) {
        this.AutoScalingGroupRange = AutoScalingGroupRange;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingGroupId", this.AutoScalingGroupId);
        this.setParamSimple(map, prefix + "AutoScalingGroupEnabled", this.AutoScalingGroupEnabled);
        this.setParamObj(map, prefix + "AutoScalingGroupRange.", this.AutoScalingGroupRange);

    }
}

