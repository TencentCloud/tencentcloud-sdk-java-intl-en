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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecuteScalingPolicyRequest extends AbstractModel {

    /**
    * Auto-scaling policy ID. This parameter is not available to a target tracking policy.
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
    * Whether to check if the auto scaling group is in the cooldown period. Default value: false
    */
    @SerializedName("HonorCooldown")
    @Expose
    private Boolean HonorCooldown;

    /**
    * Source that triggers the scaling policy. Valid values: API and CLOUD_MONITOR. Default value: API. The value `CLOUD_MONITOR` is specific to the Cloud Monitor service.
    */
    @SerializedName("TriggerSource")
    @Expose
    private String TriggerSource;

    /**
     * Get Auto-scaling policy ID. This parameter is not available to a target tracking policy. 
     * @return AutoScalingPolicyId Auto-scaling policy ID. This parameter is not available to a target tracking policy.
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set Auto-scaling policy ID. This parameter is not available to a target tracking policy.
     * @param AutoScalingPolicyId Auto-scaling policy ID. This parameter is not available to a target tracking policy.
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    /**
     * Get Whether to check if the auto scaling group is in the cooldown period. Default value: false 
     * @return HonorCooldown Whether to check if the auto scaling group is in the cooldown period. Default value: false
     */
    public Boolean getHonorCooldown() {
        return this.HonorCooldown;
    }

    /**
     * Set Whether to check if the auto scaling group is in the cooldown period. Default value: false
     * @param HonorCooldown Whether to check if the auto scaling group is in the cooldown period. Default value: false
     */
    public void setHonorCooldown(Boolean HonorCooldown) {
        this.HonorCooldown = HonorCooldown;
    }

    /**
     * Get Source that triggers the scaling policy. Valid values: API and CLOUD_MONITOR. Default value: API. The value `CLOUD_MONITOR` is specific to the Cloud Monitor service. 
     * @return TriggerSource Source that triggers the scaling policy. Valid values: API and CLOUD_MONITOR. Default value: API. The value `CLOUD_MONITOR` is specific to the Cloud Monitor service.
     */
    public String getTriggerSource() {
        return this.TriggerSource;
    }

    /**
     * Set Source that triggers the scaling policy. Valid values: API and CLOUD_MONITOR. Default value: API. The value `CLOUD_MONITOR` is specific to the Cloud Monitor service.
     * @param TriggerSource Source that triggers the scaling policy. Valid values: API and CLOUD_MONITOR. Default value: API. The value `CLOUD_MONITOR` is specific to the Cloud Monitor service.
     */
    public void setTriggerSource(String TriggerSource) {
        this.TriggerSource = TriggerSource;
    }

    public ExecuteScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecuteScalingPolicyRequest(ExecuteScalingPolicyRequest source) {
        if (source.AutoScalingPolicyId != null) {
            this.AutoScalingPolicyId = new String(source.AutoScalingPolicyId);
        }
        if (source.HonorCooldown != null) {
            this.HonorCooldown = new Boolean(source.HonorCooldown);
        }
        if (source.TriggerSource != null) {
            this.TriggerSource = new String(source.TriggerSource);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);
        this.setParamSimple(map, prefix + "HonorCooldown", this.HonorCooldown);
        this.setParamSimple(map, prefix + "TriggerSource", this.TriggerSource);

    }
}

