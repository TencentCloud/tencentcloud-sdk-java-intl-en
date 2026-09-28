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

public class DescribeRulesRequest extends AbstractModel {

    /**
    * Listener ID, in the format of lst- followed by 8 alphanumeric characters.
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * Supported filter conditions are as follows:
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Number of lists returned. Default value: 20. Maximum value: 100.
    */
    @SerializedName("MaxResults")
    @Expose
    private Long MaxResults;

    /**
    * Token for the next query. Not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
    */
    @SerializedName("NextToken")
    @Expose
    private String NextToken;

    /**
    * List of forwarding rule IDs. Each ID is in the format of `rule-` followed by 8 alphanumeric characters.
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

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
     * Get CLB instance ID. The format is alb- followed by 8 alphanumeric characters. 
     * @return LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     * @param LoadBalancerId CLB instance ID. The format is alb- followed by 8 alphanumeric characters.
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get Supported filter conditions are as follows: 
     * @return Filters Supported filter conditions are as follows:
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Supported filter conditions are as follows:
     * @param Filters Supported filter conditions are as follows:
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Number of lists returned. Default value: 20. Maximum value: 100. 
     * @return MaxResults Number of lists returned. Default value: 20. Maximum value: 100.
     */
    public Long getMaxResults() {
        return this.MaxResults;
    }

    /**
     * Set Number of lists returned. Default value: 20. Maximum value: 100.
     * @param MaxResults Number of lists returned. Default value: 20. Maximum value: 100.
     */
    public void setMaxResults(Long MaxResults) {
        this.MaxResults = MaxResults;
    }

    /**
     * Get Token for the next query. Not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call. 
     * @return NextToken Token for the next query. Not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
     */
    public String getNextToken() {
        return this.NextToken;
    }

    /**
     * Set Token for the next query. Not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
     * @param NextToken Token for the next query. Not required for the first query or when there is no next query. If there is a next query, the value is the NextToken returned from the last API call.
     */
    public void setNextToken(String NextToken) {
        this.NextToken = NextToken;
    }

    /**
     * Get List of forwarding rule IDs. Each ID is in the format of `rule-` followed by 8 alphanumeric characters. 
     * @return RuleIds List of forwarding rule IDs. Each ID is in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set List of forwarding rule IDs. Each ID is in the format of `rule-` followed by 8 alphanumeric characters.
     * @param RuleIds List of forwarding rule IDs. Each ID is in the format of `rule-` followed by 8 alphanumeric characters.
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    public DescribeRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRulesRequest(DescribeRulesRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.MaxResults != null) {
            this.MaxResults = new Long(source.MaxResults);
        }
        if (source.NextToken != null) {
            this.NextToken = new String(source.NextToken);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "MaxResults", this.MaxResults);
        this.setParamSimple(map, prefix + "NextToken", this.NextToken);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);

    }
}

