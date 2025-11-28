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

public class DescribeRabbitMQQueuesRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * Specifies the pagination Offset. default is 0.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination Limit. default is 20.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search keywords
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Filter criteria for queue type. valid values: "all" (default): filter regular and quorum queues; "classic": filter classic (ordinary) queues; "quorum": filter quorum queues.
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * Sorting field.
ConsumerNumber - Indicates the number of online consumers.
MessageHeapCount - Indicates the number of retained messages.
MessageRateInOut - Indicates the total production and consumption rate.
MessageRateIn - Production rate.
MessageRateOut - Consumption rate: Specifies the message consumption rate.
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * Sorting order. Valid values: ascend and descend.
Specifies the ascending order.
Desc - descending.
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. valid InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list. 
     * @return VirtualHost VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     * @param VirtualHost VirtualHost name, such as testvhost. effective VirtualHost names can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1), clicking Vhost in the left sidebar, and finding the Vhost name in the Vhost list.
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get Specifies the pagination Offset. default is 0. 
     * @return Offset Specifies the pagination Offset. default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the pagination Offset. default is 0.
     * @param Offset Specifies the pagination Offset. default is 0.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination Limit. default is 20. 
     * @return Limit Pagination Limit. default is 20.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination Limit. default is 20.
     * @param Limit Pagination Limit. default is 20.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search keywords 
     * @return SearchWord Search keywords
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search keywords
     * @param SearchWord Search keywords
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Filter criteria for queue type. valid values: "all" (default): filter regular and quorum queues; "classic": filter classic (ordinary) queues; "quorum": filter quorum queues. 
     * @return QueueType Filter criteria for queue type. valid values: "all" (default): filter regular and quorum queues; "classic": filter classic (ordinary) queues; "quorum": filter quorum queues.
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Filter criteria for queue type. valid values: "all" (default): filter regular and quorum queues; "classic": filter classic (ordinary) queues; "quorum": filter quorum queues.
     * @param QueueType Filter criteria for queue type. valid values: "all" (default): filter regular and quorum queues; "classic": filter classic (ordinary) queues; "quorum": filter quorum queues.
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get Sorting field.
ConsumerNumber - Indicates the number of online consumers.
MessageHeapCount - Indicates the number of retained messages.
MessageRateInOut - Indicates the total production and consumption rate.
MessageRateIn - Production rate.
MessageRateOut - Consumption rate: Specifies the message consumption rate. 
     * @return SortElement Sorting field.
ConsumerNumber - Indicates the number of online consumers.
MessageHeapCount - Indicates the number of retained messages.
MessageRateInOut - Indicates the total production and consumption rate.
MessageRateIn - Production rate.
MessageRateOut - Consumption rate: Specifies the message consumption rate.
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set Sorting field.
ConsumerNumber - Indicates the number of online consumers.
MessageHeapCount - Indicates the number of retained messages.
MessageRateInOut - Indicates the total production and consumption rate.
MessageRateIn - Production rate.
MessageRateOut - Consumption rate: Specifies the message consumption rate.
     * @param SortElement Sorting field.
ConsumerNumber - Indicates the number of online consumers.
MessageHeapCount - Indicates the number of retained messages.
MessageRateInOut - Indicates the total production and consumption rate.
MessageRateIn - Production rate.
MessageRateOut - Consumption rate: Specifies the message consumption rate.
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get Sorting order. Valid values: ascend and descend.
Specifies the ascending order.
Desc - descending. 
     * @return SortOrder Sorting order. Valid values: ascend and descend.
Specifies the ascending order.
Desc - descending.
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set Sorting order. Valid values: ascend and descend.
Specifies the ascending order.
Desc - descending.
     * @param SortOrder Sorting order. Valid values: ascend and descend.
Specifies the ascending order.
Desc - descending.
     */
    public void setSortOrder(String SortOrder) {
        this.SortOrder = SortOrder;
    }

    public DescribeRabbitMQQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQQueuesRequest(DescribeRabbitMQQueuesRequest source) {
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
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.QueueType != null) {
            this.QueueType = new String(source.QueueType);
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
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "QueueType", this.QueueType);
        this.setParamSimple(map, prefix + "SortElement", this.SortElement);
        this.setParamSimple(map, prefix + "SortOrder", this.SortOrder);

    }
}

