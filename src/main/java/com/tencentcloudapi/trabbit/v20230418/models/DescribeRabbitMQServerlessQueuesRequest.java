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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRabbitMQServerlessQueuesRequest extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Vhost parameter.
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
    * Search keywords
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Specifies the queue type filter criteria. if it is left blank or set to "all", it indicates classic and quorum queues; if set to "classic", it filters classic queues; if set to "quorum", it filters quorum queues.
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * Sorting field.
ConsumerNumber: specifies the number of online consumers.
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
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Vhost parameter. 
     * @return VirtualHost Vhost parameter.
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set Vhost parameter.
     * @param VirtualHost Vhost parameter.
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
     * Get Specifies the queue type filter criteria. if it is left blank or set to "all", it indicates classic and quorum queues; if set to "classic", it filters classic queues; if set to "quorum", it filters quorum queues. 
     * @return QueueType Specifies the queue type filter criteria. if it is left blank or set to "all", it indicates classic and quorum queues; if set to "classic", it filters classic queues; if set to "quorum", it filters quorum queues.
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set Specifies the queue type filter criteria. if it is left blank or set to "all", it indicates classic and quorum queues; if set to "classic", it filters classic queues; if set to "quorum", it filters quorum queues.
     * @param QueueType Specifies the queue type filter criteria. if it is left blank or set to "all", it indicates classic and quorum queues; if set to "classic", it filters classic queues; if set to "quorum", it filters quorum queues.
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get Sorting field.
ConsumerNumber: specifies the number of online consumers.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate. 
     * @return SortElement Sorting field.
ConsumerNumber: specifies the number of online consumers.
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
ConsumerNumber: specifies the number of online consumers.
MessageHeapCount specifies the number of message backlogs.
MessageRateInOut specifies the total production and consumption rate.
MessageRateIn specifies the production rate.
MessageRateOut specifies the consumption rate.
     * @param SortElement Sorting field.
ConsumerNumber: specifies the number of online consumers.
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

    public DescribeRabbitMQServerlessQueuesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessQueuesRequest(DescribeRabbitMQServerlessQueuesRequest source) {
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

