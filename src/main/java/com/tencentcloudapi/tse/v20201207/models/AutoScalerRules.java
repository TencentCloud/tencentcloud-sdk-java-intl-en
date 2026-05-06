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

public class AutoScalerRules extends AbstractModel {

    /**
    * Stability window time. Default is 0 during scaling and 300 during descaling.
    */
    @SerializedName("StabilizationWindowSeconds")
    @Expose
    private Long StabilizationWindowSeconds;

    /**
    * Selection policy basis
    */
    @SerializedName("SelectPolicy")
    @Expose
    private String SelectPolicy;

    /**
    * Scaling policy
    */
    @SerializedName("Policies")
    @Expose
    private AutoScalerPolicy [] Policies;

    /**
     * Get Stability window time. Default is 0 during scaling and 300 during descaling. 
     * @return StabilizationWindowSeconds Stability window time. Default is 0 during scaling and 300 during descaling.
     */
    public Long getStabilizationWindowSeconds() {
        return this.StabilizationWindowSeconds;
    }

    /**
     * Set Stability window time. Default is 0 during scaling and 300 during descaling.
     * @param StabilizationWindowSeconds Stability window time. Default is 0 during scaling and 300 during descaling.
     */
    public void setStabilizationWindowSeconds(Long StabilizationWindowSeconds) {
        this.StabilizationWindowSeconds = StabilizationWindowSeconds;
    }

    /**
     * Get Selection policy basis 
     * @return SelectPolicy Selection policy basis
     */
    public String getSelectPolicy() {
        return this.SelectPolicy;
    }

    /**
     * Set Selection policy basis
     * @param SelectPolicy Selection policy basis
     */
    public void setSelectPolicy(String SelectPolicy) {
        this.SelectPolicy = SelectPolicy;
    }

    /**
     * Get Scaling policy 
     * @return Policies Scaling policy
     */
    public AutoScalerPolicy [] getPolicies() {
        return this.Policies;
    }

    /**
     * Set Scaling policy
     * @param Policies Scaling policy
     */
    public void setPolicies(AutoScalerPolicy [] Policies) {
        this.Policies = Policies;
    }

    public AutoScalerRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScalerRules(AutoScalerRules source) {
        if (source.StabilizationWindowSeconds != null) {
            this.StabilizationWindowSeconds = new Long(source.StabilizationWindowSeconds);
        }
        if (source.SelectPolicy != null) {
            this.SelectPolicy = new String(source.SelectPolicy);
        }
        if (source.Policies != null) {
            this.Policies = new AutoScalerPolicy[source.Policies.length];
            for (int i = 0; i < source.Policies.length; i++) {
                this.Policies[i] = new AutoScalerPolicy(source.Policies[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StabilizationWindowSeconds", this.StabilizationWindowSeconds);
        this.setParamSimple(map, prefix + "SelectPolicy", this.SelectPolicy);
        this.setParamArrayObj(map, prefix + "Policies.", this.Policies);

    }
}

