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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerHealthStatusRequest extends AbstractModel {

    /**
    * Listener ID, in the format of lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Whether the health check result contains forwarding rules. If false, only return the health status of the default forwarding rule. If true, return the health status of all rules (including the default rule).
Valid values:
true: yes
`false` (default value): no.
    */
    @SerializedName("IncludeRule")
    @Expose
    private Boolean IncludeRule;

    /**
    * Maximum number of data records read this time.
Value: 1-100.
Default value: 20
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for querying the next page. Not required for the first query.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
     * Get Listener ID, in the format of lst- followed by 8 alphanumeric characters. 
     * @return ListenerId Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     * @param ListenerId Listener ID, in the format of lst- followed by 8 alphanumeric characters.
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters. 
     * @return LoadBalancerId Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.
     * @param LoadBalancerId Cloud Load Balancer instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Whether the health check result contains forwarding rules. If false, only return the health status of the default forwarding rule. If true, return the health status of all rules (including the default rule).
Valid values:
true: yes
`false` (default value): no. 
     * @return IncludeRule Whether the health check result contains forwarding rules. If false, only return the health status of the default forwarding rule. If true, return the health status of all rules (including the default rule).
Valid values:
true: yes
`false` (default value): no.
     */
    public Boolean getIncludeRule() {
        return this.IncludeRule;
    }

    /**
     * Set Whether the health check result contains forwarding rules. If false, only return the health status of the default forwarding rule. If true, return the health status of all rules (including the default rule).
Valid values:
true: yes
`false` (default value): no.
     * @param IncludeRule Whether the health check result contains forwarding rules. If false, only return the health status of the default forwarding rule. If true, return the health status of all rules (including the default rule).
Valid values:
true: yes
`false` (default value): no.
     */
    public void setIncludeRule(Boolean IncludeRule) {
        this.IncludeRule = IncludeRule;
    }

    /**
     * Get Maximum number of data records read this time.
Value: 1-100.
Default value: 20 
     * @return MaxResults Maximum number of data records read this time.
Value: 1-100.
Default value: 20
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Maximum number of data records read this time.
Value: 1-100.
Default value: 20
     * @param MaxResults Maximum number of data records read this time.
Value: 1-100.
Default value: 20
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for querying the next page. Not required for the first query. 
     * @return NextToken Token for querying the next page. Not required for the first query.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for querying the next page. Not required for the first query.
     * @param NextToken Token for querying the next page. Not required for the first query.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    public DescribeListenerHealthStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeListenerHealthStatusRequest(DescribeListenerHealthStatusRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.IncludeRule != null) {
            this.IncludeRule = new Boolean(source.IncludeRule);
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "IncludeRule", this.IncludeRule);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);

    }
}

