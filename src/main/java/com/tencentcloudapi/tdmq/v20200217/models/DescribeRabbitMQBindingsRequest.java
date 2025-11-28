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

public class DescribeRabbitMQBindingsRequest extends AbstractModel {

    /**
    * Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
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
    * Specifies the page offset. default is 0.
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
    * Search keyword. Performs fuzzy search based on source exchange name, target resource name, or binding key.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Precise search filter based on source exchange.
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * Filters by the target queue name. cannot be set with DestinationExchange filtering.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Precise search filter based on target exchange. Cannot be set simultaneously with queuename filter.
    */
    @SerializedName("DestinationExchange")
    @Expose
    private String DestinationExchange;

    /**
     * Get Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1). 
     * @return InstanceId Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
     * @param InstanceId Instance ID, such as amqp-xxxxxxxx. effective InstanceId can be queried by logging in to the TDMQ RabbitMQ console (https://console.cloud.tencent.com/trabbitmq/cluster?rid=1).
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
     * Get Specifies the page offset. default is 0. 
     * @return Offset Specifies the page offset. default is 0.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Specifies the page offset. default is 0.
     * @param Offset Specifies the page offset. default is 0.
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
     * Get Search keyword. Performs fuzzy search based on source exchange name, target resource name, or binding key. 
     * @return SearchWord Search keyword. Performs fuzzy search based on source exchange name, target resource name, or binding key.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search keyword. Performs fuzzy search based on source exchange name, target resource name, or binding key.
     * @param SearchWord Search keyword. Performs fuzzy search based on source exchange name, target resource name, or binding key.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Precise search filter based on source exchange. 
     * @return SourceExchange Precise search filter based on source exchange.
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set Precise search filter based on source exchange.
     * @param SourceExchange Precise search filter based on source exchange.
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get Filters by the target queue name. cannot be set with DestinationExchange filtering. 
     * @return QueueName Filters by the target queue name. cannot be set with DestinationExchange filtering.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Filters by the target queue name. cannot be set with DestinationExchange filtering.
     * @param QueueName Filters by the target queue name. cannot be set with DestinationExchange filtering.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Precise search filter based on target exchange. Cannot be set simultaneously with queuename filter. 
     * @return DestinationExchange Precise search filter based on target exchange. Cannot be set simultaneously with queuename filter.
     */
    public String getDestinationExchange() {
        return this.DestinationExchange;
    }

    /**
     * Set Precise search filter based on target exchange. Cannot be set simultaneously with queuename filter.
     * @param DestinationExchange Precise search filter based on target exchange. Cannot be set simultaneously with queuename filter.
     */
    public void setDestinationExchange(String DestinationExchange) {
        this.DestinationExchange = DestinationExchange;
    }

    public DescribeRabbitMQBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQBindingsRequest(DescribeRabbitMQBindingsRequest source) {
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
        if (source.SourceExchange != null) {
            this.SourceExchange = new String(source.SourceExchange);
        }
        if (source.QueueName != null) {
            this.QueueName = new String(source.QueueName);
        }
        if (source.DestinationExchange != null) {
            this.DestinationExchange = new String(source.DestinationExchange);
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
        this.setParamSimple(map, prefix + "SourceExchange", this.SourceExchange);
        this.setParamSimple(map, prefix + "QueueName", this.QueueName);
        this.setParamSimple(map, prefix + "DestinationExchange", this.DestinationExchange);

    }
}

