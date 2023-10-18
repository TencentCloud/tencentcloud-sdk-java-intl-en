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

public class CreateK8sApiAbnormalEventExportJobRequest extends AbstractModel {

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
    * Sort order
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Sorting field
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * Export field
    */
    @SerializedName("ExportField")
    @Expose
    private String [] ExportField;

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
     * @return By Sorting field
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set Sorting field
     * @param By Sorting field
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get Export field 
     * @return ExportField Export field
     */
    public String [] getExportField() {
        return this.ExportField;
    }

    /**
     * Set Export field
     * @param ExportField Export field
     */
    public void setExportField(String [] ExportField) {
        this.ExportField = ExportField;
    }

    public CreateK8sApiAbnormalEventExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateK8sApiAbnormalEventExportJobRequest(CreateK8sApiAbnormalEventExportJobRequest source) {
        if (source.Filters != null) {
            this.Filters = new RunTimeFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new RunTimeFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.ExportField != null) {
            this.ExportField = new String[source.ExportField.length];
            for (int i = 0; i < source.ExportField.length; i++) {
                this.ExportField[i] = new String(source.ExportField[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamArraySimple(map, prefix + "ExportField.", this.ExportField);

    }
}

