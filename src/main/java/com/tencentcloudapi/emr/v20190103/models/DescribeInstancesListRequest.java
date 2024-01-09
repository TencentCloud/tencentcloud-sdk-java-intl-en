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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesListRequest extends AbstractModel {

    /**
    * Cluster filtering policy. Valid values: <li>clusterList: Queries the list of clusters excluding terminated ones.</li><li>monitorManage: Queries the list of clusters excluding those terminated, under creation and not successfully created.</li><li>cloudHardwareManage/componentManage: Two reserved values, which have the same implications as those of `monitorManage`.</li>
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * Page number. Default value: `0`, indicating the first page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of returned results per page. Default value: `10`; maximum value: `100`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting field. Valid values: <li>clusterId: Sorting by instance ID. </li><li>addTime: Sorting by instance creation time.</li><li>status: Sorting by instance status code.</li>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Sort according to OrderField in ascending or descending order. Valid range:<li>0: Descending order.</li><li>1: Ascending order.</li>Default: 0.
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
    * Custom query
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Cluster filtering policy. Valid values: <li>clusterList: Queries the list of clusters excluding terminated ones.</li><li>monitorManage: Queries the list of clusters excluding those terminated, under creation and not successfully created.</li><li>cloudHardwareManage/componentManage: Two reserved values, which have the same implications as those of `monitorManage`.</li> 
     * @return DisplayStrategy Cluster filtering policy. Valid values: <li>clusterList: Queries the list of clusters excluding terminated ones.</li><li>monitorManage: Queries the list of clusters excluding those terminated, under creation and not successfully created.</li><li>cloudHardwareManage/componentManage: Two reserved values, which have the same implications as those of `monitorManage`.</li>
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set Cluster filtering policy. Valid values: <li>clusterList: Queries the list of clusters excluding terminated ones.</li><li>monitorManage: Queries the list of clusters excluding those terminated, under creation and not successfully created.</li><li>cloudHardwareManage/componentManage: Two reserved values, which have the same implications as those of `monitorManage`.</li>
     * @param DisplayStrategy Cluster filtering policy. Valid values: <li>clusterList: Queries the list of clusters excluding terminated ones.</li><li>monitorManage: Queries the list of clusters excluding those terminated, under creation and not successfully created.</li><li>cloudHardwareManage/componentManage: Two reserved values, which have the same implications as those of `monitorManage`.</li>
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get Page number. Default value: `0`, indicating the first page. 
     * @return Offset Page number. Default value: `0`, indicating the first page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. Default value: `0`, indicating the first page.
     * @param Offset Page number. Default value: `0`, indicating the first page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of returned results per page. Default value: `10`; maximum value: `100`. 
     * @return Limit Number of returned results per page. Default value: `10`; maximum value: `100`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of returned results per page. Default value: `10`; maximum value: `100`.
     * @param Limit Number of returned results per page. Default value: `10`; maximum value: `100`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting field. Valid values: <li>clusterId: Sorting by instance ID. </li><li>addTime: Sorting by instance creation time.</li><li>status: Sorting by instance status code.</li> 
     * @return OrderField Sorting field. Valid values: <li>clusterId: Sorting by instance ID. </li><li>addTime: Sorting by instance creation time.</li><li>status: Sorting by instance status code.</li>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Valid values: <li>clusterId: Sorting by instance ID. </li><li>addTime: Sorting by instance creation time.</li><li>status: Sorting by instance status code.</li>
     * @param OrderField Sorting field. Valid values: <li>clusterId: Sorting by instance ID. </li><li>addTime: Sorting by instance creation time.</li><li>status: Sorting by instance status code.</li>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Sort according to OrderField in ascending or descending order. Valid range:<li>0: Descending order.</li><li>1: Ascending order.</li>Default: 0. 
     * @return Asc Sort according to OrderField in ascending or descending order. Valid range:<li>0: Descending order.</li><li>1: Ascending order.</li>Default: 0.
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set Sort according to OrderField in ascending or descending order. Valid range:<li>0: Descending order.</li><li>1: Ascending order.</li>Default: 0.
     * @param Asc Sort according to OrderField in ascending or descending order. Valid range:<li>0: Descending order.</li><li>1: Ascending order.</li>Default: 0.
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    /**
     * Get Custom query 
     * @return Filters Custom query
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Custom query
     * @param Filters Custom query
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeInstancesListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstancesListRequest(DescribeInstancesListRequest source) {
        if (source.DisplayStrategy != null) {
            this.DisplayStrategy = new String(source.DisplayStrategy);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OrderField != null) {
            this.OrderField = new String(source.OrderField);
        }
        if (source.Asc != null) {
            this.Asc = new Long(source.Asc);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DisplayStrategy", this.DisplayStrategy);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Asc", this.Asc);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

