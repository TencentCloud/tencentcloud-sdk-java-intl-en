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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNewL7RulesResponse extends AbstractModel{

    /**
    * List of forwarding rules
    */
    @SerializedName("Rules")
    @Expose
    private NewL7RuleEntry [] Rules;

    /**
    * List of health check settings
    */
    @SerializedName("Healths")
    @Expose
    private L7RuleHealth [] Healths;

    /**
    * Total number of rules
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get List of forwarding rules 
     * @return Rules List of forwarding rules
     */
    public NewL7RuleEntry [] getRules() {
        return this.Rules;
    }

    /**
     * Set List of forwarding rules
     * @param Rules List of forwarding rules
     */
    public void setRules(NewL7RuleEntry [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get List of health check settings 
     * @return Healths List of health check settings
     */
    public L7RuleHealth [] getHealths() {
        return this.Healths;
    }

    /**
     * Set List of health check settings
     * @param Healths List of health check settings
     */
    public void setHealths(L7RuleHealth [] Healths) {
        this.Healths = Healths;
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

    public DescribeNewL7RulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNewL7RulesResponse(DescribeNewL7RulesResponse source) {
        if (source.Rules != null) {
            this.Rules = new NewL7RuleEntry[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new NewL7RuleEntry(source.Rules[i]);
            }
        }
        if (source.Healths != null) {
            this.Healths = new L7RuleHealth[source.Healths.length];
            for (int i = 0; i < source.Healths.length; i++) {
                this.Healths[i] = new L7RuleHealth(source.Healths[i]);
            }
        }
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamArrayObj(map, prefix + "Healths.", this.Healths);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

