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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindRuleRealServersRequest extends AbstractModel {

    /**
    * Forwarding rule ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * An information list of the origin servers to bind.
If there are origin servers bound already, they will be replaced by this new origin server list.
If this field is empty, it indicates unbinding all origin servers of this rule.
If the origin server scheduling policy type of this rule is weighted round robin, you need to enter `RealServerWeight`, i.e., the origin server weight. If this field is left empty or for other scheduling types, the default origin server weight is 1.
    */
    @SerializedName("RealServerBindSet")
    @Expose
    private RealServerBindSetReq [] RealServerBindSet;

    /**
     * Get Forwarding rule ID 
     * @return RuleId Forwarding rule ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Forwarding rule ID
     * @param RuleId Forwarding rule ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get An information list of the origin servers to bind.
If there are origin servers bound already, they will be replaced by this new origin server list.
If this field is empty, it indicates unbinding all origin servers of this rule.
If the origin server scheduling policy type of this rule is weighted round robin, you need to enter `RealServerWeight`, i.e., the origin server weight. If this field is left empty or for other scheduling types, the default origin server weight is 1. 
     * @return RealServerBindSet An information list of the origin servers to bind.
If there are origin servers bound already, they will be replaced by this new origin server list.
If this field is empty, it indicates unbinding all origin servers of this rule.
If the origin server scheduling policy type of this rule is weighted round robin, you need to enter `RealServerWeight`, i.e., the origin server weight. If this field is left empty or for other scheduling types, the default origin server weight is 1.
     */
    public RealServerBindSetReq [] getRealServerBindSet() {
        return this.RealServerBindSet;
    }

    /**
     * Set An information list of the origin servers to bind.
If there are origin servers bound already, they will be replaced by this new origin server list.
If this field is empty, it indicates unbinding all origin servers of this rule.
If the origin server scheduling policy type of this rule is weighted round robin, you need to enter `RealServerWeight`, i.e., the origin server weight. If this field is left empty or for other scheduling types, the default origin server weight is 1.
     * @param RealServerBindSet An information list of the origin servers to bind.
If there are origin servers bound already, they will be replaced by this new origin server list.
If this field is empty, it indicates unbinding all origin servers of this rule.
If the origin server scheduling policy type of this rule is weighted round robin, you need to enter `RealServerWeight`, i.e., the origin server weight. If this field is left empty or for other scheduling types, the default origin server weight is 1.
     */
    public void setRealServerBindSet(RealServerBindSetReq [] RealServerBindSet) {
        this.RealServerBindSet = RealServerBindSet;
    }

    public BindRuleRealServersRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BindRuleRealServersRequest(BindRuleRealServersRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.RealServerBindSet != null) {
            this.RealServerBindSet = new RealServerBindSetReq[source.RealServerBindSet.length];
            for (int i = 0; i < source.RealServerBindSet.length; i++) {
                this.RealServerBindSet[i] = new RealServerBindSetReq(source.RealServerBindSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArrayObj(map, prefix + "RealServerBindSet.", this.RealServerBindSet);

    }
}

