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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMetricOverviewListRequest extends AbstractModel {

    /**
    * <p>Dashboard domain. Required. Determines which domain's KPI data to return.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details)</td></tr></tbody></table>
    */
    @SerializedName("ResourceType")
    @Expose
    private Long ResourceType;

    /**
    * <p>Query time range (Unix seconds).</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private TimeRange TimeRange;

    /**
    * <p>View scope: corporate view / space view</p>
    */
    @SerializedName("ViewScope")
    @Expose
    private ViewScope ViewScope;

    /**
    * <p>Extended filtering (resource_type=MODEL). Filter combination rule: multiple items use AND, AND value_list within the same item uses OR. Supported Names: MODEL_Name (MODEL Name), user_id (uid), space_id (space id), resource_id/source_id (source id), metric_source_type (metric_source_type_* Enumeration Name OR integer)</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
     * Get <p>Dashboard domain. Required. Determines which domain's KPI data to return.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details)</td></tr></tbody></table> 
     * @return ResourceType <p>Dashboard domain. Required. Determines which domain's KPI data to return.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details)</td></tr></tbody></table>
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Dashboard domain. Required. Determines which domain's KPI data to return.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details)</td></tr></tbody></table>
     * @param ResourceType <p>Dashboard domain. Required. Determines which domain's KPI data to return.</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details)</td></tr></tbody></table>
     */
    public void setResourceType(Long ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>Query time range (Unix seconds).</p> 
     * @return TimeRange <p>Query time range (Unix seconds).</p>
     */
    public TimeRange getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>Query time range (Unix seconds).</p>
     * @param TimeRange <p>Query time range (Unix seconds).</p>
     */
    public void setTimeRange(TimeRange TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>View scope: corporate view / space view</p> 
     * @return ViewScope <p>View scope: corporate view / space view</p>
     */
    public ViewScope getViewScope() {
        return this.ViewScope;
    }

    /**
     * Set <p>View scope: corporate view / space view</p>
     * @param ViewScope <p>View scope: corporate view / space view</p>
     */
    public void setViewScope(ViewScope ViewScope) {
        this.ViewScope = ViewScope;
    }

    /**
     * Get <p>Extended filtering (resource_type=MODEL). Filter combination rule: multiple items use AND, AND value_list within the same item uses OR. Supported Names: MODEL_Name (MODEL Name), user_id (uid), space_id (space id), resource_id/source_id (source id), metric_source_type (metric_source_type_* Enumeration Name OR integer)</p> 
     * @return FilterList <p>Extended filtering (resource_type=MODEL). Filter combination rule: multiple items use AND, AND value_list within the same item uses OR. Supported Names: MODEL_Name (MODEL Name), user_id (uid), space_id (space id), resource_id/source_id (source id), metric_source_type (metric_source_type_* Enumeration Name OR integer)</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Extended filtering (resource_type=MODEL). Filter combination rule: multiple items use AND, AND value_list within the same item uses OR. Supported Names: MODEL_Name (MODEL Name), user_id (uid), space_id (space id), resource_id/source_id (source id), metric_source_type (metric_source_type_* Enumeration Name OR integer)</p>
     * @param FilterList <p>Extended filtering (resource_type=MODEL). Filter combination rule: multiple items use AND, AND value_list within the same item uses OR. Supported Names: MODEL_Name (MODEL Name), user_id (uid), space_id (space id), resource_id/source_id (source id), metric_source_type (metric_source_type_* Enumeration Name OR integer)</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    public DescribeMetricOverviewListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMetricOverviewListRequest(DescribeMetricOverviewListRequest source) {
        if (source.ResourceType != null) {
            this.ResourceType = new Long(source.ResourceType);
        }
        if (source.TimeRange != null) {
            this.TimeRange = new TimeRange(source.TimeRange);
        }
        if (source.ViewScope != null) {
            this.ViewScope = new ViewScope(source.ViewScope);
        }
        if (source.FilterList != null) {
            this.FilterList = new Filter[source.FilterList.length];
            for (int i = 0; i < source.FilterList.length; i++) {
                this.FilterList[i] = new Filter(source.FilterList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamObj(map, prefix + "TimeRange.", this.TimeRange);
        this.setParamObj(map, prefix + "ViewScope.", this.ViewScope);
        this.setParamArrayObj(map, prefix + "FilterList.", this.FilterList);

    }
}

