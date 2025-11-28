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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQVirtualHostRequest extends AbstractModel {

    /**
    * Cluster instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost name. If this parameter is not specified, all will be queried by default.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Pagination offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Fuzzy query by vhost name
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * Specifies the sorting field.
MessageHeapCount - specifies the message backlog count.
MessageRateInOut - total production and consumption rate.
MessageRateIn - production rate.
MessageRateOut - consumption rate.
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * Sorting order. Valid values: ascend and descend.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get Cluster instance ID 
     * @return InstanceId Cluster instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Cluster instance ID
     * @param InstanceId Cluster instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost name. If this parameter is not specified, all will be queried by default. 
     * @return VirtualHost Vhost name. If this parameter is not specified, all will be queried by default.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost name. If this parameter is not specified, all will be queried by default.
     * @param VirtualHost Vhost name. If this parameter is not specified, all will be queried by default.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Pagination offset 
     * @return Offset Pagination offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination offset
     * @param Offset Pagination offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination limit 
     * @return Limit Pagination limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination limit
     * @param Limit Pagination limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Fuzzy query by vhost name 
     * @return Filters Fuzzy query by vhost name
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set Fuzzy query by vhost name
     * @param Filters Fuzzy query by vhost name
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Specifies the sorting field.
MessageHeapCount - specifies the message backlog count.
MessageRateInOut - total production and consumption rate.
MessageRateIn - production rate.
MessageRateOut - consumption rate. 
     * @return SortElement Specifies the sorting field.
MessageHeapCount - specifies the message backlog count.
MessageRateInOut - total production and consumption rate.
MessageRateIn - production rate.
MessageRateOut - consumption rate.
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set Specifies the sorting field.
MessageHeapCount - specifies the message backlog count.
MessageRateInOut - total production and consumption rate.
MessageRateIn - production rate.
MessageRateOut - consumption rate.
     * @param SortElement Specifies the sorting field.
MessageHeapCount - specifies the message backlog count.
MessageRateInOut - total production and consumption rate.
MessageRateIn - production rate.
MessageRateOut - consumption rate.
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get Sorting order. Valid values: ascend and descend. 
     * @return SortOrder Sorting order. Valid values: ascend and descend.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sorting order. Valid values: ascend and descend.
     * @param SortOrder Sorting order. Valid values: ascend and descend.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQVirtualHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQVirtualHostRequest(DescribeRabbitMQVirtualHostRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.VirtualHost != null) {
            this.VirtualHost = new String(source.VirtualHost);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter(source.Filters);
        }
        if (source.SortElement != null) {
            this.SortElement = new String(source.SortElement);
        }
        if (source.SortOrder != null) {
            this.SortOrder = new String(source.SortOrder);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VirtualHost", this.VirtualHost);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

