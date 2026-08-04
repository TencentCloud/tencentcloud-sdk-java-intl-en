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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InferenceScalingPolicy extends AbstractModel {

    /**
    * Policy Name. Length limit is 1-30 characters. Policy name must be unique within the same service.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy type, cannot be modified after creation. Value: <li>ScheduledScaling: scheduled scaling.</li>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * Scheduled scaling configuration. This field is required when the PolicyType value is ScheduledScaling.
    */
    @SerializedName("ScheduledScalingPolicy")
    @Expose
    private InferenceScheduledScalingPolicy ScheduledScalingPolicy;

    /**
     * Get Policy Name. Length limit is 1-30 characters. Policy name must be unique within the same service. 
     * @return PolicyName Policy Name. Length limit is 1-30 characters. Policy name must be unique within the same service.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy Name. Length limit is 1-30 characters. Policy name must be unique within the same service.
     * @param PolicyName Policy Name. Length limit is 1-30 characters. Policy name must be unique within the same service.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy type, cannot be modified after creation. Value: <li>ScheduledScaling: scheduled scaling.</li> 
     * @return PolicyType Policy type, cannot be modified after creation. Value: <li>ScheduledScaling: scheduled scaling.</li>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Policy type, cannot be modified after creation. Value: <li>ScheduledScaling: scheduled scaling.</li>
     * @param PolicyType Policy type, cannot be modified after creation. Value: <li>ScheduledScaling: scheduled scaling.</li>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Scheduled scaling configuration. This field is required when the PolicyType value is ScheduledScaling. 
     * @return ScheduledScalingPolicy Scheduled scaling configuration. This field is required when the PolicyType value is ScheduledScaling.
     */
    public InferenceScheduledScalingPolicy getScheduledScalingPolicy() {
        return this.ScheduledScalingPolicy;
    }

    /**
     * Set Scheduled scaling configuration. This field is required when the PolicyType value is ScheduledScaling.
     * @param ScheduledScalingPolicy Scheduled scaling configuration. This field is required when the PolicyType value is ScheduledScaling.
     */
    public void setScheduledScalingPolicy(InferenceScheduledScalingPolicy ScheduledScalingPolicy) {
        this.ScheduledScalingPolicy = ScheduledScalingPolicy;
    }

    public InferenceScalingPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceScalingPolicy(InferenceScalingPolicy source) {
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.ScheduledScalingPolicy != null) {
            this.ScheduledScalingPolicy = new InferenceScheduledScalingPolicy(source.ScheduledScalingPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamObj(map, prefix + "ScheduledScalingPolicy.", this.ScheduledScalingPolicy);

    }
}

