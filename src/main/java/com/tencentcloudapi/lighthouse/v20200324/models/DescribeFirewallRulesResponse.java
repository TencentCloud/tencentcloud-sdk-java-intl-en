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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFirewallRulesResponse extends AbstractModel {

    /**
    * Number of eligible firewall rules.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Firewall rule details list.
    */
    @SerializedName("FirewallRuleSet")
    @Expose
    private FirewallRuleInfo [] FirewallRuleSet;

    /**
    * Firewall version number.
    */
    @SerializedName("FirewallVersion")
    @Expose
    private Long FirewallVersion;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of eligible firewall rules. 
     * @return TotalCount Number of eligible firewall rules.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible firewall rules.
     * @param TotalCount Number of eligible firewall rules.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Firewall rule details list. 
     * @return FirewallRuleSet Firewall rule details list.
     */
    public FirewallRuleInfo [] getFirewallRuleSet() {
        return this.FirewallRuleSet;
    }

    /**
     * Set Firewall rule details list.
     * @param FirewallRuleSet Firewall rule details list.
     */
    public void setFirewallRuleSet(FirewallRuleInfo [] FirewallRuleSet) {
        this.FirewallRuleSet = FirewallRuleSet;
    }

    /**
     * Get Firewall version number. 
     * @return FirewallVersion Firewall version number.
     */
    public Long getFirewallVersion() {
        return this.FirewallVersion;
    }

    /**
     * Set Firewall version number.
     * @param FirewallVersion Firewall version number.
     */
    public void setFirewallVersion(Long FirewallVersion) {
        this.FirewallVersion = FirewallVersion;
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

    public DescribeFirewallRulesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFirewallRulesResponse(DescribeFirewallRulesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.FirewallRuleSet != null) {
            this.FirewallRuleSet = new FirewallRuleInfo[source.FirewallRuleSet.length];
            for (int i = 0; i < source.FirewallRuleSet.length; i++) {
                this.FirewallRuleSet[i] = new FirewallRuleInfo(source.FirewallRuleSet[i]);
            }
        }
        if (source.FirewallVersion != null) {
            this.FirewallVersion = new Long(source.FirewallVersion);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "FirewallRuleSet.", this.FirewallRuleSet);
        this.setParamSimple(map, prefix + "FirewallVersion", this.FirewallVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

