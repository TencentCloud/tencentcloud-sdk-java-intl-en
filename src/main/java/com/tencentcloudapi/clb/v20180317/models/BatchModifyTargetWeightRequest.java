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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchModifyTargetWeightRequest extends AbstractModel {

    /**
    * <p>CLB instance ID.</p>
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * <p>List of weights to be modified in batch. The ModifyList array can contain no more than 100 elements, ModifyList[i].Targets can have no more than 50, and the total number of Targets must not exceed 500.</p>
    */
    @SerializedName("ModifyList")
    @Expose
    private RsWeightRule [] ModifyList;

    /**
     * Get <p>CLB instance ID.</p> 
     * @return LoadBalancerId <p>CLB instance ID.</p>
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set <p>CLB instance ID.</p>
     * @param LoadBalancerId <p>CLB instance ID.</p>
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get <p>List of weights to be modified in batch. The ModifyList array can contain no more than 100 elements, ModifyList[i].Targets can have no more than 50, and the total number of Targets must not exceed 500.</p> 
     * @return ModifyList <p>List of weights to be modified in batch. The ModifyList array can contain no more than 100 elements, ModifyList[i].Targets can have no more than 50, and the total number of Targets must not exceed 500.</p>
     */
    public RsWeightRule [] getModifyList() {
        return this.ModifyList;
    }

    /**
     * Set <p>List of weights to be modified in batch. The ModifyList array can contain no more than 100 elements, ModifyList[i].Targets can have no more than 50, and the total number of Targets must not exceed 500.</p>
     * @param ModifyList <p>List of weights to be modified in batch. The ModifyList array can contain no more than 100 elements, ModifyList[i].Targets can have no more than 50, and the total number of Targets must not exceed 500.</p>
     */
    public void setModifyList(RsWeightRule [] ModifyList) {
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
            this.ModifyList = new RsWeightRule[source.ModifyList.length];
            for (int i = 0; i < source.ModifyList.length; i++) {
                this.ModifyList[i] = new RsWeightRule(source.ModifyList[i]);
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

