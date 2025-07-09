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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSLInstanceListRequest extends AbstractModel {

    /**
    * Instance filtering policy. Valid values: <li>clusterList: Query the list of instances except for those that have been terminated.</li> <li>monitorManage: Query the list of instances except for those that have been terminated, are being created, or fail to be created.</li>
    */
    @SerializedName("DisplayStrategy")
    @Expose
    private String DisplayStrategy;

    /**
    * Page number. The default value is 0, indicating the first page.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Number of records to be returned per page. The default value is 10, and the maximum value is 100.	
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Sorting field. Valid values: <li>clusterId: Sort by instance ID.</li> <li>addTime: Sort by instance creation time.</li> <li>status: Sort by instance status code.</li>
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * Sorts by OrderField in ascending or descending order. Valid values: <li>0: ascending order;</li> <li>1: descending order.</li> The default value is 0.
    */
    @SerializedName("Asc")
    @Expose
    private Long Asc;

    /**
    * Custom search filters. Examples: <li>Filter instances by ClusterId: [{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li> Filter instances by clusterName: [{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>Filter instances by ClusterStatus: [{"Name": "ClusterStatus","Values": ["2"]}]</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Instance filtering policy. Valid values: <li>clusterList: Query the list of instances except for those that have been terminated.</li> <li>monitorManage: Query the list of instances except for those that have been terminated, are being created, or fail to be created.</li> 
     * @return DisplayStrategy Instance filtering policy. Valid values: <li>clusterList: Query the list of instances except for those that have been terminated.</li> <li>monitorManage: Query the list of instances except for those that have been terminated, are being created, or fail to be created.</li>
     */
    public String getDisplayStrategy() {
        return this.DisplayStrategy;
    }

    /**
     * Set Instance filtering policy. Valid values: <li>clusterList: Query the list of instances except for those that have been terminated.</li> <li>monitorManage: Query the list of instances except for those that have been terminated, are being created, or fail to be created.</li>
     * @param DisplayStrategy Instance filtering policy. Valid values: <li>clusterList: Query the list of instances except for those that have been terminated.</li> <li>monitorManage: Query the list of instances except for those that have been terminated, are being created, or fail to be created.</li>
     */
    public void setDisplayStrategy(String DisplayStrategy) {
        this.DisplayStrategy = DisplayStrategy;
    }

    /**
     * Get Page number. The default value is 0, indicating the first page. 
     * @return Offset Page number. The default value is 0, indicating the first page.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Page number. The default value is 0, indicating the first page.
     * @param Offset Page number. The default value is 0, indicating the first page.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Number of records to be returned per page. The default value is 10, and the maximum value is 100.	 
     * @return Limit Number of records to be returned per page. The default value is 10, and the maximum value is 100.	
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Number of records to be returned per page. The default value is 10, and the maximum value is 100.	
     * @param Limit Number of records to be returned per page. The default value is 10, and the maximum value is 100.	
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Sorting field. Valid values: <li>clusterId: Sort by instance ID.</li> <li>addTime: Sort by instance creation time.</li> <li>status: Sort by instance status code.</li> 
     * @return OrderField Sorting field. Valid values: <li>clusterId: Sort by instance ID.</li> <li>addTime: Sort by instance creation time.</li> <li>status: Sort by instance status code.</li>
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * Set Sorting field. Valid values: <li>clusterId: Sort by instance ID.</li> <li>addTime: Sort by instance creation time.</li> <li>status: Sort by instance status code.</li>
     * @param OrderField Sorting field. Valid values: <li>clusterId: Sort by instance ID.</li> <li>addTime: Sort by instance creation time.</li> <li>status: Sort by instance status code.</li>
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * Get Sorts by OrderField in ascending or descending order. Valid values: <li>0: ascending order;</li> <li>1: descending order.</li> The default value is 0. 
     * @return Asc Sorts by OrderField in ascending or descending order. Valid values: <li>0: ascending order;</li> <li>1: descending order.</li> The default value is 0.
     */
    public Long getAsc() {
        return this.Asc;
    }

    /**
     * Set Sorts by OrderField in ascending or descending order. Valid values: <li>0: ascending order;</li> <li>1: descending order.</li> The default value is 0.
     * @param Asc Sorts by OrderField in ascending or descending order. Valid values: <li>0: ascending order;</li> <li>1: descending order.</li> The default value is 0.
     */
    public void setAsc(Long Asc) {
        this.Asc = Asc;
    }

    /**
     * Get Custom search filters. Examples: <li>Filter instances by ClusterId: [{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li> Filter instances by clusterName: [{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>Filter instances by ClusterStatus: [{"Name": "ClusterStatus","Values": ["2"]}]</li> 
     * @return Filters Custom search filters. Examples: <li>Filter instances by ClusterId: [{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li> Filter instances by clusterName: [{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>Filter instances by ClusterStatus: [{"Name": "ClusterStatus","Values": ["2"]}]</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Custom search filters. Examples: <li>Filter instances by ClusterId: [{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li> Filter instances by clusterName: [{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>Filter instances by ClusterStatus: [{"Name": "ClusterStatus","Values": ["2"]}]</li>
     * @param Filters Custom search filters. Examples: <li>Filter instances by ClusterId: [{"Name":"ClusterId","Values":["emr-xxxxxxxx"]}]</li><li> Filter instances by clusterName: [{"Name": "ClusterName","Values": ["cluster_name"]}]</li><li>Filter instances by ClusterStatus: [{"Name": "ClusterStatus","Values": ["2"]}]</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public DescribeSLInstanceListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSLInstanceListRequest(DescribeSLInstanceListRequest source) {
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

