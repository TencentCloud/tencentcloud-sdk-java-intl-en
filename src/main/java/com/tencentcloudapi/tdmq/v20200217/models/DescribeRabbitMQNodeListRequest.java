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

public class DescribeRabbitMQNodeListRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Offset, default value 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Page limit. default value: 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Node name for fuzzy search
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * Filter parameter name and value. currently only support filtering based on node status.
"Name": "nodeStatus"
"Value": running or down

    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * Sorts by the specified element. only 2 are present.
CPU usage: specifies the CPU utilization of the node.
diskUsage: specifies the node disk utilization.
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * Sorting order.
Valid values: `ascend`, `descend`.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. specifies the effective InstanceId that can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Offset, default value 0. 
     * @return Offset Offset, default value 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset, default value 0.
     * @param Offset Offset, default value 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Page limit. default value: 20. 
     * @return Limit Page limit. default value: 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Page limit. default value: 20.
     * @param Limit Page limit. default value: 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Node name for fuzzy search 
     * @return NodeName Node name for fuzzy search
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set Node name for fuzzy search
     * @param NodeName Node name for fuzzy search
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get Filter parameter name and value. currently only support filtering based on node status.
"Name": "nodeStatus"
"Value": running or down
 
     * @return Filters Filter parameter name and value. currently only support filtering based on node status.
"Name": "nodeStatus"
"Value": running or down

     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filter parameter name and value. currently only support filtering based on node status.
"Name": "nodeStatus"
"Value": running or down

     * @param Filters Filter parameter name and value. currently only support filtering based on node status.
"Name": "nodeStatus"
"Value": running or down

     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get Sorts by the specified element. only 2 are present.
CPU usage: specifies the CPU utilization of the node.
diskUsage: specifies the node disk utilization. 
     * @return SortElement Sorts by the specified element. only 2 are present.
CPU usage: specifies the CPU utilization of the node.
diskUsage: specifies the node disk utilization.
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set Sorts by the specified element. only 2 are present.
CPU usage: specifies the CPU utilization of the node.
diskUsage: specifies the node disk utilization.
     * @param SortElement Sorts by the specified element. only 2 are present.
CPU usage: specifies the CPU utilization of the node.
diskUsage: specifies the node disk utilization.
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get Sorting order.
Valid values: `ascend`, `descend`. 
     * @return SortOrder Sorting order.
Valid values: `ascend`, `descend`.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sorting order.
Valid values: `ascend`, `descend`.
     * @param SortOrder Sorting order.
Valid values: `ascend`, `descend`.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQNodeListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQNodeListRequest(DescribeRabbitMQNodeListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
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
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

