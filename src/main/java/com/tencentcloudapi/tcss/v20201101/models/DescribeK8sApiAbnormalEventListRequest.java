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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeK8sApiAbnormalEventListRequest extends AbstractModel {

    /**
    * Filters.
<li>TimeRange - String - Optional - Time range. Example: ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>`MatchRules` - String - Optional - Hit rule</li>
<li>`RiskLevel` - String - Optional - Threat level</li>
<li>`Status` - String - Optional - Event status</li>
<li>`MatchRuleType` - String - Optional - Hit rule type</li>
<li>`ClusterRunningStatus` - String - Optional - Cluster running status</li>
<li>`ClusterName` - String - Optional - Cluster name</li>
<li>`ClusterID` - String - Optional - Cluster ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * The number of results returned. Default value: 10. Maximum value: 100.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Offset. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Sort order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
`LatestFoundTime`: Last creation time
`AlarmCount`: Number of alarms
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get Filters.
<li>TimeRange - String - Optional - Time range. Example: ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>`MatchRules` - String - Optional - Hit rule</li>
<li>`RiskLevel` - String - Optional - Threat level</li>
<li>`Status` - String - Optional - Event status</li>
<li>`MatchRuleType` - String - Optional - Hit rule type</li>
<li>`ClusterRunningStatus` - String - Optional - Cluster running status</li>
<li>`ClusterName` - String - Optional - Cluster name</li>
<li>`ClusterID` - String - Optional - Cluster ID</li> 
     * @return Filters Filters.
<li>TimeRange - String - Optional - Time range. Example: ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>`MatchRules` - String - Optional - Hit rule</li>
<li>`RiskLevel` - String - Optional - Threat level</li>
<li>`Status` - String - Optional - Event status</li>
<li>`MatchRuleType` - String - Optional - Hit rule type</li>
<li>`ClusterRunningStatus` - String - Optional - Cluster running status</li>
<li>`ClusterName` - String - Optional - Cluster name</li>
<li>`ClusterID` - String - Optional - Cluster ID</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filters.
<li>TimeRange - String - Optional - Time range. Example: ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>`MatchRules` - String - Optional - Hit rule</li>
<li>`RiskLevel` - String - Optional - Threat level</li>
<li>`Status` - String - Optional - Event status</li>
<li>`MatchRuleType` - String - Optional - Hit rule type</li>
<li>`ClusterRunningStatus` - String - Optional - Cluster running status</li>
<li>`ClusterName` - String - Optional - Cluster name</li>
<li>`ClusterID` - String - Optional - Cluster ID</li>
     * @param Filters Filters.
<li>TimeRange - String - Optional - Time range. Example: ["2022-03-31 16:55:00", "2022-03-31 17:00:00"]</li>
<li>`MatchRules` - String - Optional - Hit rule</li>
<li>`RiskLevel` - String - Optional - Threat level</li>
<li>`Status` - String - Optional - Event status</li>
<li>`MatchRuleType` - String - Optional - Hit rule type</li>
<li>`ClusterRunningStatus` - String - Optional - Cluster running status</li>
<li>`ClusterName` - String - Optional - Cluster name</li>
<li>`ClusterID` - String - Optional - Cluster ID</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get The number of results returned. Default value: 10. Maximum value: 100. 
     * @return Limit The number of results returned. Default value: 10. Maximum value: 100.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set The number of results returned. Default value: 10. Maximum value: 100.
     * @param Limit The number of results returned. Default value: 10. Maximum value: 100.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Offset. Default value: 0 
     * @return Offset Offset. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset. Default value: 0
     * @param Offset Offset. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Sort order 
     * @return Order Sort order
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order
     * @param Order Sort order
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Sorting field
`LatestFoundTime`: Last creation time
`AlarmCount`: Number of alarms 
     * @return By Sorting field
`LatestFoundTime`: Last creation time
`AlarmCount`: Number of alarms
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
`LatestFoundTime`: Last creation time
`AlarmCount`: Number of alarms
     * @param By Sorting field
`LatestFoundTime`: Last creation time
`AlarmCount`: Number of alarms
     */
    public void setBy(String By) {
        this.By = By;
    }

    public DescribeK8sApiAbnormalEventListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeK8sApiAbnormalEventListRequest(DescribeK8sApiAbnormalEventListRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);

    }
}

