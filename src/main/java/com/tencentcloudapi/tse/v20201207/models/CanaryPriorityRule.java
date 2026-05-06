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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CanaryPriorityRule extends AbstractModel {

    /**
    * Priority
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Grayscale rule configuration
    */
    @SerializedName("CanaryRule")
    @Expose
    private CloudNativeAPIGatewayCanaryRule CanaryRule;

    /**
     * Get Priority 
     * @return Priority Priority
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority
     * @param Priority Priority
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Grayscale rule configuration 
     * @return CanaryRule Grayscale rule configuration
     */
    public CloudNativeAPIGatewayCanaryRule getCanaryRule() {
        return this.CanaryRule;
    }

    /**
     * Set Grayscale rule configuration
     * @param CanaryRule Grayscale rule configuration
     */
    public void setCanaryRule(CloudNativeAPIGatewayCanaryRule CanaryRule) {
        this.CanaryRule = CanaryRule;
    }

    public CanaryPriorityRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CanaryPriorityRule(CanaryPriorityRule source) {
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.CanaryRule != null) {
            this.CanaryRule = new CloudNativeAPIGatewayCanaryRule(source.CanaryRule);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "CanaryRule.", this.CanaryRule);

    }
}

