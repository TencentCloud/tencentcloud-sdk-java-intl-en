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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteDspmRiskStrategyRequest extends AbstractModel {

    /**
    * <p>Policy id. Only deletion of custom policies is supported (rule_source=custom). For built-in policies, disable them through IsEnabled in ModifyDspmRiskStrategy.</p>
    */
    @SerializedName("StrategyId")
    @Expose
    private Long [] StrategyId;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>Policy id. Only deletion of custom policies is supported (rule_source=custom). For built-in policies, disable them through IsEnabled in ModifyDspmRiskStrategy.</p> 
     * @return StrategyId <p>Policy id. Only deletion of custom policies is supported (rule_source=custom). For built-in policies, disable them through IsEnabled in ModifyDspmRiskStrategy.</p>
     */
    public Long [] getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set <p>Policy id. Only deletion of custom policies is supported (rule_source=custom). For built-in policies, disable them through IsEnabled in ModifyDspmRiskStrategy.</p>
     * @param StrategyId <p>Policy id. Only deletion of custom policies is supported (rule_source=custom). For built-in policies, disable them through IsEnabled in ModifyDspmRiskStrategy.</p>
     */
    public void setStrategyId(Long [] StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DeleteDspmRiskStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteDspmRiskStrategyRequest(DeleteDspmRiskStrategyRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long[source.StrategyId.length];
            for (int i = 0; i < source.StrategyId.length; i++) {
                this.StrategyId[i] = new Long(source.StrategyId[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "StrategyId.", this.StrategyId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

