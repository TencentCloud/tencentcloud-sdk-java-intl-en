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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLifecyclePolicyRequest extends AbstractModel {

    /**
    * Lifecycle management policy name, a combination of chinese/english/digits/underscores/hyphens, no more than 64 characters.
    */
    @SerializedName("LifecyclePolicyName")
    @Expose
    private String LifecyclePolicyName;

    /**
    * List of management rules associated with the lifecycle management policy.
    */
    @SerializedName("LifecycleRules")
    @Expose
    private LifecycleRule [] LifecycleRules;

    /**
     * Get Lifecycle management policy name, a combination of chinese/english/digits/underscores/hyphens, no more than 64 characters. 
     * @return LifecyclePolicyName Lifecycle management policy name, a combination of chinese/english/digits/underscores/hyphens, no more than 64 characters.
     */
    public String getLifecyclePolicyName() {
        return this.LifecyclePolicyName;
    }

    /**
     * Set Lifecycle management policy name, a combination of chinese/english/digits/underscores/hyphens, no more than 64 characters.
     * @param LifecyclePolicyName Lifecycle management policy name, a combination of chinese/english/digits/underscores/hyphens, no more than 64 characters.
     */
    public void setLifecyclePolicyName(String LifecyclePolicyName) {
        this.LifecyclePolicyName = LifecyclePolicyName;
    }

    /**
     * Get List of management rules associated with the lifecycle management policy. 
     * @return LifecycleRules List of management rules associated with the lifecycle management policy.
     */
    public LifecycleRule [] getLifecycleRules() {
        return this.LifecycleRules;
    }

    /**
     * Set List of management rules associated with the lifecycle management policy.
     * @param LifecycleRules List of management rules associated with the lifecycle management policy.
     */
    public void setLifecycleRules(LifecycleRule [] LifecycleRules) {
        this.LifecycleRules = LifecycleRules;
    }

    public CreateLifecyclePolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLifecyclePolicyRequest(CreateLifecyclePolicyRequest source) {
        if (source.LifecyclePolicyName != null) {
            this.LifecyclePolicyName = new String(source.LifecyclePolicyName);
        }
        if (source.LifecycleRules != null) {
            this.LifecycleRules = new LifecycleRule[source.LifecycleRules.length];
            for (int i = 0; i < source.LifecycleRules.length; i++) {
                this.LifecycleRules[i] = new LifecycleRule(source.LifecycleRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LifecyclePolicyName", this.LifecyclePolicyName);
        this.setParamArrayObj(map, prefix + "LifecycleRules.", this.LifecycleRules);

    }
}

