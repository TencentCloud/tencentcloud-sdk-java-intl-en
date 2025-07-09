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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyTargetWeightRequest extends AbstractModel {

    /**
    * CLB instance ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * List of weights to be modified in batches
    */
    @SerializedName("ModifyList")
    @Expose
    private TargetsWeightRule [] ModifyList;

    /**
     * Get CLB instance ID 
     * @return LoadBalancerId CLB instance ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID
     * @param LoadBalancerId CLB instance ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get List of weights to be modified in batches 
     * @return ModifyList List of weights to be modified in batches
     */
    public TargetsWeightRule [] getModifyList() {
        return this.ModifyList;
    }

    /**
     * Set List of weights to be modified in batches
     * @param ModifyList List of weights to be modified in batches
     */
    public void setModifyList(TargetsWeightRule [] ModifyList) {
        this.ModifyList = ModifyList;
    }

    public BatchModifyTargetWeightRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyTargetWeightRequest(BatchModifyTargetWeightRequest source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.ModifyList != null) {
            this.ModifyList = new TargetsWeightRule[source.ModifyList.length];
            for (int i = 0; i < source.ModifyList.length; i++) {
                this.ModifyList[i] = new TargetsWeightRule(source.ModifyList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "ModifyList.", this.ModifyList);

    }
}

