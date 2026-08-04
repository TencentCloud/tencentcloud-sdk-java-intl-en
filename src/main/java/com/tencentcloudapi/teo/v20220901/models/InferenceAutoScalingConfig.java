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

public class InferenceAutoScalingConfig extends AbstractModel {

    /**
    * <p>Minimum number of instances. When a scaling policy is configured and the policy is in the valid period, it will not take effect.</p>
    */
    @SerializedName("MinInstanceCount")
    @Expose
    private Long MinInstanceCount;

    /**
    * <p>Auto Scaling policy list. Supports up to 5 policies.</p>
    */
    @SerializedName("ScalingPolicies")
    @Expose
    private InferenceScalingPolicy [] ScalingPolicies;

    /**
     * Get <p>Minimum number of instances. When a scaling policy is configured and the policy is in the valid period, it will not take effect.</p> 
     * @return MinInstanceCount <p>Minimum number of instances. When a scaling policy is configured and the policy is in the valid period, it will not take effect.</p>
     */
    public Long getMinInstanceCount() {
        return this.MinInstanceCount;
    }

    /**
     * Set <p>Minimum number of instances. When a scaling policy is configured and the policy is in the valid period, it will not take effect.</p>
     * @param MinInstanceCount <p>Minimum number of instances. When a scaling policy is configured and the policy is in the valid period, it will not take effect.</p>
     */
    public void setMinInstanceCount(Long MinInstanceCount) {
        this.MinInstanceCount = MinInstanceCount;
    }

    /**
     * Get <p>Auto Scaling policy list. Supports up to 5 policies.</p> 
     * @return ScalingPolicies <p>Auto Scaling policy list. Supports up to 5 policies.</p>
     */
    public InferenceScalingPolicy [] getScalingPolicies() {
        return this.ScalingPolicies;
    }

    /**
     * Set <p>Auto Scaling policy list. Supports up to 5 policies.</p>
     * @param ScalingPolicies <p>Auto Scaling policy list. Supports up to 5 policies.</p>
     */
    public void setScalingPolicies(InferenceScalingPolicy [] ScalingPolicies) {
        this.ScalingPolicies = ScalingPolicies;
    }

    public InferenceAutoScalingConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InferenceAutoScalingConfig(InferenceAutoScalingConfig source) {
        if (source.MinInstanceCount != null) {
            this.MinInstanceCount = new Long(source.MinInstanceCount);
        }
        if (source.ScalingPolicies != null) {
            this.ScalingPolicies = new InferenceScalingPolicy[source.ScalingPolicies.length];
            for (int i = 0; i < source.ScalingPolicies.length; i++) {
                this.ScalingPolicies[i] = new InferenceScalingPolicy(source.ScalingPolicies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinInstanceCount", this.MinInstanceCount);
        this.setParamArrayObj(map, prefix + "ScalingPolicies.", this.ScalingPolicies);

    }
}

