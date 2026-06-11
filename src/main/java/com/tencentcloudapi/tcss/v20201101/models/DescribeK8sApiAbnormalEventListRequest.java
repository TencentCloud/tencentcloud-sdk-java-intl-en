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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeK8sApiAbnormalEventListRequest extends AbstractModel {

    /**
    * <p>Filter conditions.</p><li>TimeRange - String - Required: No - Time range filter ["2022-03-31 16:55:00", "2022-03-31 17:00:00"];</li><li>MatchRules - String - Required: No - Hit rule filter;</li><li>RiskLevel - String - Required: No - Threat level filter;</li><li>Status - String - Required: No - Event status filter;</li><li>MatchRuleType - String - Required: No - Hit rule type filter;</li><li>ClusterRunningStatus - String - Required: No - Cluster running status;</li><li>ClusterName - String - Required: No - Cluster name;</li><li>ClusterID - String - Required: No - Cluster ID.</li>
    */
    @SerializedName("Filters")
    @Expose
    private RunTimeFilters [] Filters;

    /**
    * <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Offset. Default value: 0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Sorting method.</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>Sorting field.<br>LatestFoundTime: Last generation time.<br>AlarmCount: Number of alarms.</p>
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
     * Get <p>Filter conditions.</p><li>TimeRange - String - Required: No - Time range filter ["2022-03-31 16:55:00", "2022-03-31 17:00:00"];</li><li>MatchRules - String - Required: No - Hit rule filter;</li><li>RiskLevel - String - Required: No - Threat level filter;</li><li>Status - String - Required: No - Event status filter;</li><li>MatchRuleType - String - Required: No - Hit rule type filter;</li><li>ClusterRunningStatus - String - Required: No - Cluster running status;</li><li>ClusterName - String - Required: No - Cluster name;</li><li>ClusterID - String - Required: No - Cluster ID.</li> 
     * @return Filters <p>Filter conditions.</p><li>TimeRange - String - Required: No - Time range filter ["2022-03-31 16:55:00", "2022-03-31 17:00:00"];</li><li>MatchRules - String - Required: No - Hit rule filter;</li><li>RiskLevel - String - Required: No - Threat level filter;</li><li>Status - String - Required: No - Event status filter;</li><li>MatchRuleType - String - Required: No - Hit rule type filter;</li><li>ClusterRunningStatus - String - Required: No - Cluster running status;</li><li>ClusterName - String - Required: No - Cluster name;</li><li>ClusterID - String - Required: No - Cluster ID.</li>
     */
    public RunTimeFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>Filter conditions.</p><li>TimeRange - String - Required: No - Time range filter ["2022-03-31 16:55:00", "2022-03-31 17:00:00"];</li><li>MatchRules - String - Required: No - Hit rule filter;</li><li>RiskLevel - String - Required: No - Threat level filter;</li><li>Status - String - Required: No - Event status filter;</li><li>MatchRuleType - String - Required: No - Hit rule type filter;</li><li>ClusterRunningStatus - String - Required: No - Cluster running status;</li><li>ClusterName - String - Required: No - Cluster name;</li><li>ClusterID - String - Required: No - Cluster ID.</li>
     * @param Filters <p>Filter conditions.</p><li>TimeRange - String - Required: No - Time range filter ["2022-03-31 16:55:00", "2022-03-31 17:00:00"];</li><li>MatchRules - String - Required: No - Hit rule filter;</li><li>RiskLevel - String - Required: No - Threat level filter;</li><li>Status - String - Required: No - Event status filter;</li><li>MatchRuleType - String - Required: No - Hit rule type filter;</li><li>ClusterRunningStatus - String - Required: No - Cluster running status;</li><li>ClusterName - String - Required: No - Cluster name;</li><li>ClusterID - String - Required: No - Cluster ID.</li>
     */
    public void setFilters(RunTimeFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>Number of items to return. The default number is 10, and the maximum number is 100.</p> 
     * @return Limit <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     * @param Limit <p>Number of items to return. The default number is 10, and the maximum number is 100.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Offset. Default value: 0.</p> 
     * @return Offset <p>Offset. Default value: 0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset. Default value: 0.</p>
     * @param Offset <p>Offset. Default value: 0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Sorting method.</p> 
     * @return Order <p>Sorting method.</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>Sorting method.</p>
     * @param Order <p>Sorting method.</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>Sorting field.<br>LatestFoundTime: Last generation time.<br>AlarmCount: Number of alarms.</p> 
     * @return By <p>Sorting field.<br>LatestFoundTime: Last generation time.<br>AlarmCount: Number of alarms.</p>
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set <p>Sorting field.<br>LatestFoundTime: Last generation time.<br>AlarmCount: Number of alarms.</p>
     * @param By <p>Sorting field.<br>LatestFoundTime: Last generation time.<br>AlarmCount: Number of alarms.</p>
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

