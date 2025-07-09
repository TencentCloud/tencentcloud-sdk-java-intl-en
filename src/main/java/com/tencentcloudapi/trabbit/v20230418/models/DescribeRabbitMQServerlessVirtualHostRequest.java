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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessVirtualHostRequest extends AbstractModel {

    /**
    * instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the vhost name. if it is not provided, query all.
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
    * search-virtual-host: specifies fuzzy name search of vhost names. earlier, it supported both prefix and suffix matching.
    */
    @SerializedName("Filters")
    @Expose
    private Filter Filters;

    /**
    * Sorting field.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate.
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * Sort order. valid values: ascend or descend.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get instance ID 
     * @return InstanceId instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set instance ID
     * @param InstanceId instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the vhost name. if it is not provided, query all. 
     * @return VirtualHost Specifies the vhost name. if it is not provided, query all.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Specifies the vhost name. if it is not provided, query all.
     * @param VirtualHost Specifies the vhost name. if it is not provided, query all.
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
     * Get search-virtual-host: specifies fuzzy name search of vhost names. earlier, it supported both prefix and suffix matching. 
     * @return Filters search-virtual-host: specifies fuzzy name search of vhost names. earlier, it supported both prefix and suffix matching.
     */
    public Filter getFilters() {
        return this.Filters;
    }

    /**
     * Set search-virtual-host: specifies fuzzy name search of vhost names. earlier, it supported both prefix and suffix matching.
     * @param Filters search-virtual-host: specifies fuzzy name search of vhost names. earlier, it supported both prefix and suffix matching.
     */
    public void setFilters(Filter Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorting field.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate. 
     * @return SortElement Sorting field.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate.
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set Sorting field.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate.
     * @param SortElement Sorting field.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate.
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get Sort order. valid values: ascend or descend. 
     * @return SortOrder Sort order. valid values: ascend or descend.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sort order. valid values: ascend or descend.
     * @param SortOrder Sort order. valid values: ascend or descend.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQServerlessVirtualHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessVirtualHostRequest(DescribeRabbitMQServerlessVirtualHostRequest source) {
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

