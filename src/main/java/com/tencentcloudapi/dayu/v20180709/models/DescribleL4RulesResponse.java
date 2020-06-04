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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribleL4RulesResponse extends AbstractModel{

    /**
    * Forwarding rule list
    */
    @SerializedName("Rules")
    @Expose
    private L4RuleEntry [] Rules;

    /**
    * Total number of rules
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Health check configuration list
    */
    @SerializedName("Healths")
    @Expose
    private L4RuleHealth [] Healths;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Forwarding rule list 
     * @return Rules Forwarding rule list
     */
    public L4RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set Forwarding rule list
     * @param Rules Forwarding rule list
     */
    public void setRules(L4RuleEntry [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Total number of rules 
     * @return Total Total number of rules
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total number of rules
     * @param Total Total number of rules
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Health check configuration list 
     * @return Healths Health check configuration list
     */
    public L4RuleHealth [] getHealths() {
        return this.Healths;
    }

    /**
     * Set Health check configuration list
     * @param Healths Health check configuration list
     */
    public void setHealths(L4RuleHealth [] Healths) {
        this.Healths = Healths;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Healths.", this.Healths);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

