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

public class DescribeUsageDetailListRequest extends AbstractModel {

    /**
    * <p>Resource type, limited to RESOURCE_TYPE_MODEL / RESOURCE_TYPE_PLUGIN</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details) (reserved, not currently supported)</td></tr></tbody></table>
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
    * <p>View scope: corporate view / space view / application view</p>
    */
    @SerializedName("ViewScope")
    @Expose
    private ViewScope ViewScope;

    /**
    * <p>Extended Filter (resource_type=MODEL). Filter combination rule: multiple items use AND, AND values within the same item use OR. Supported names: MODEL_Name, user_id, space_id, resource_id/source_id, metric_source_type (metric_source_type_* OR integer), call_type (invocation type)</p>
    */
    @SerializedName("FilterList")
    @Expose
    private Filter [] FilterList;

    /**
    * <p>Page number, starting from 0.</p>
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * <p>Number of items per page. Maximum: 100.</p>
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get <p>Resource type, limited to RESOURCE_TYPE_MODEL / RESOURCE_TYPE_PLUGIN</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details) (reserved, not currently supported)</td></tr></tbody></table> 
     * @return ResourceType <p>Resource type, limited to RESOURCE_TYPE_MODEL / RESOURCE_TYPE_PLUGIN</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details) (reserved, not currently supported)</td></tr></tbody></table>
     */
    public Long getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Resource type, limited to RESOURCE_TYPE_MODEL / RESOURCE_TYPE_PLUGIN</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details) (reserved, not currently supported)</td></tr></tbody></table>
     * @param ResourceType <p>Resource type, limited to RESOURCE_TYPE_MODEL / RESOURCE_TYPE_PLUGIN</p><table><tbody><tr><td>Enumeration item</td><td>Enumeration value</td><td>Description</td></tr><tr><td>RESOURCE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>RESOURCE_TYPE_MODEL</td><td>1</td><td>Model usage</td></tr><tr><td>RESOURCE_TYPE_PLUGIN</td><td>2</td><td>Plug-in usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_PLATFORM</td><td>3</td><td>Platform feature usage (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_MODEL_CONCURRENCY</td><td>4</td><td>Model concurrency limit exceeded (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_KB_CAPACITY</td><td>5</td><td>Knowledge base capacity (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_USAGE_SUMMARY</td><td>6</td><td>Usage summary (reserved, not currently supported)</td></tr><tr><td>RESOURCE_TYPE_RESOURCE_CONSUME</td><td>7</td><td>Resource consumption (billing details) (reserved, not currently supported)</td></tr></tbody></table>
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
     * Get <p>View scope: corporate view / space view / application view</p> 
     * @return ViewScope <p>View scope: corporate view / space view / application view</p>
     */
    public ViewScope getViewScope() {
        return this.ViewScope;
    }

    /**
     * Set <p>View scope: corporate view / space view / application view</p>
     * @param ViewScope <p>View scope: corporate view / space view / application view</p>
     */
    public void setViewScope(ViewScope ViewScope) {
        this.ViewScope = ViewScope;
    }

    /**
     * Get <p>Extended Filter (resource_type=MODEL). Filter combination rule: multiple items use AND, AND values within the same item use OR. Supported names: MODEL_Name, user_id, space_id, resource_id/source_id, metric_source_type (metric_source_type_* OR integer), call_type (invocation type)</p> 
     * @return FilterList <p>Extended Filter (resource_type=MODEL). Filter combination rule: multiple items use AND, AND values within the same item use OR. Supported names: MODEL_Name, user_id, space_id, resource_id/source_id, metric_source_type (metric_source_type_* OR integer), call_type (invocation type)</p>
     */
    public Filter [] getFilterList() {
        return this.FilterList;
    }

    /**
     * Set <p>Extended Filter (resource_type=MODEL). Filter combination rule: multiple items use AND, AND values within the same item use OR. Supported names: MODEL_Name, user_id, space_id, resource_id/source_id, metric_source_type (metric_source_type_* OR integer), call_type (invocation type)</p>
     * @param FilterList <p>Extended Filter (resource_type=MODEL). Filter combination rule: multiple items use AND, AND values within the same item use OR. Supported names: MODEL_Name, user_id, space_id, resource_id/source_id, metric_source_type (metric_source_type_* OR integer), call_type (invocation type)</p>
     */
    public void setFilterList(Filter [] FilterList) {
        this.FilterList = FilterList;
    }

    /**
     * Get <p>Page number, starting from 0.</p> 
     * @return PageNumber <p>Page number, starting from 0.</p>
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set <p>Page number, starting from 0.</p>
     * @param PageNumber <p>Page number, starting from 0.</p>
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get <p>Number of items per page. Maximum: 100.</p> 
     * @return PageSize <p>Number of items per page. Maximum: 100.</p>
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set <p>Number of items per page. Maximum: 100.</p>
     * @param PageSize <p>Number of items per page. Maximum: 100.</p>
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeUsageDetailListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUsageDetailListRequest(DescribeUsageDetailListRequest source) {
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
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
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
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

