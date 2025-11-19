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
package com.tencentcloudapi.apm.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApmServiceMetricRequest extends AbstractModel {

    /**
    * Business system ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Application name
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Application ID
    */
    @SerializedName("ServiceID")
    @Expose
    private String ServiceID;

    /**
    * Start time.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Order.
    */
    @SerializedName("OrderBy")
    @Expose
    private OrderBy OrderBy;

    /**
    * Whether to use the demo mode.
    */
    @SerializedName("Demo")
    @Expose
    private Boolean Demo;

    /**
    * Application status filter criteria. valid values: health, warning, error. if multiple statuses are selected, separate them by commas, for example: "warning,error".
    */
    @SerializedName("ServiceStatus")
    @Expose
    private String ServiceStatus;

    /**
    * Tag list
    */
    @SerializedName("Tags")
    @Expose
    private ApmTag [] Tags;

    /**
    * Page number.
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * Page size.
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Filter criteria.
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get Business system ID 
     * @return InstanceId Business system ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Business system ID
     * @param InstanceId Business system ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Application name 
     * @return ServiceName Application name
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Application name
     * @param ServiceName Application name
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Application ID 
     * @return ServiceID Application ID
     */
    public String getServiceID() {
        return this.ServiceID;
    }

    /**
     * Set Application ID
     * @param ServiceID Application ID
     */
    public void setServiceID(String ServiceID) {
        this.ServiceID = ServiceID;
    }

    /**
     * Get Start time. 
     * @return StartTime Start time.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time.
     * @param StartTime Start time.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time. 
     * @return EndTime End time.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time.
     * @param EndTime End time.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Order. 
     * @return OrderBy Order.
     */
    public OrderBy getOrderBy() {
        return this.OrderBy;
    }

    /**
     * Set Order.
     * @param OrderBy Order.
     */
    public void setOrderBy(OrderBy OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * Get Whether to use the demo mode. 
     * @return Demo Whether to use the demo mode.
     */
    public Boolean getDemo() {
        return this.Demo;
    }

    /**
     * Set Whether to use the demo mode.
     * @param Demo Whether to use the demo mode.
     */
    public void setDemo(Boolean Demo) {
        this.Demo = Demo;
    }

    /**
     * Get Application status filter criteria. valid values: health, warning, error. if multiple statuses are selected, separate them by commas, for example: "warning,error". 
     * @return ServiceStatus Application status filter criteria. valid values: health, warning, error. if multiple statuses are selected, separate them by commas, for example: "warning,error".
     */
    public String getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set Application status filter criteria. valid values: health, warning, error. if multiple statuses are selected, separate them by commas, for example: "warning,error".
     * @param ServiceStatus Application status filter criteria. valid values: health, warning, error. if multiple statuses are selected, separate them by commas, for example: "warning,error".
     */
    public void setServiceStatus(String ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get Tag list 
     * @return Tags Tag list
     */
    public ApmTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag list
     * @param Tags Tag list
     */
    public void setTags(ApmTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Page number. 
     * @return Page Page number.
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set Page number.
     * @param Page Page number.
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get Page size. 
     * @return PageSize Page size.
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Page size.
     * @param PageSize Page size.
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Filter criteria. 
     * @return Filters Filter criteria.
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter criteria.
     * @param Filters Filter criteria.
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeApmServiceMetricRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApmServiceMetricRequest(DescribeApmServiceMetricRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.ServiceID != null) {
            this.ServiceID = new String(source.ServiceID);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.OrderBy != null) {
            this.OrderBy = new OrderBy(source.OrderBy);
        }
        if (source.Demo != null) {
            this.Demo = new Boolean(source.Demo);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new String(source.ServiceStatus);
        }
        if (source.Tags != null) {
            this.Tags = new ApmTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ApmTag(source.Tags[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "ServiceID", this.ServiceID);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "OrderBy.", this.OrderBy);
        this.setParamSimple(map, prefix + "Demo", this.Demo);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

