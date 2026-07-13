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

public class DescribeRabbitMQServerlessQueuesRequest extends AbstractModel {

    /**
    * <p>Instance Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Vhost parameter</p>
    */
    @SerializedName("VirtualHost")
    @Expose
    private String VirtualHost;

    /**
    * <p>Pagination offset.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Pagination limit.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Search keyword</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>Queue type filter criteria. Leave blank or use "all" for classic and quorum queues; "classic" for classic queues; "quorum" for quorum queues.</p>
    */
    @SerializedName("QueueType")
    @Expose
    private String QueueType;

    /**
    * <p>Sorting field:<br>messages_ready - message backlog;<br>publish - production rate;<br>deliver - consumption rate;<br>consumers - number of online consumers;</p>
    */
    @SerializedName("SortElement")
    @Expose
    private String SortElement;

    /**
    * <p>Sort order, asc or desc</p>
    */
    @SerializedName("SortOrder")
    @Expose
    private String SortOrder;

    /**
     * Get <p>Instance Id</p> 
     * @return InstanceId <p>Instance Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance Id</p>
     * @param InstanceId <p>Instance Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Vhost parameter</p> 
     * @return VirtualHost <p>Vhost parameter</p>
     */
    public String getVirtualHost() {
        return this.VirtualHost;
    }

    /**
     * Set <p>Vhost parameter</p>
     * @param VirtualHost <p>Vhost parameter</p>
     */
    public void setVirtualHost(String VirtualHost) {
        this.VirtualHost = VirtualHost;
    }

    /**
     * Get <p>Pagination offset.</p> 
     * @return Offset <p>Pagination offset.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset.</p>
     * @param Offset <p>Pagination offset.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Pagination limit.</p> 
     * @return Limit <p>Pagination limit.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Pagination limit.</p>
     * @param Limit <p>Pagination limit.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Search keyword</p> 
     * @return SearchWord <p>Search keyword</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>Search keyword</p>
     * @param SearchWord <p>Search keyword</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>Queue type filter criteria. Leave blank or use "all" for classic and quorum queues; "classic" for classic queues; "quorum" for quorum queues.</p> 
     * @return QueueType <p>Queue type filter criteria. Leave blank or use "all" for classic and quorum queues; "classic" for classic queues; "quorum" for quorum queues.</p>
     */
    public String getQueueType() {
        return this.QueueType;
    }

    /**
     * Set <p>Queue type filter criteria. Leave blank or use "all" for classic and quorum queues; "classic" for classic queues; "quorum" for quorum queues.</p>
     * @param QueueType <p>Queue type filter criteria. Leave blank or use "all" for classic and quorum queues; "classic" for classic queues; "quorum" for quorum queues.</p>
     */
    public void setQueueType(String QueueType) {
        this.QueueType = QueueType;
    }

    /**
     * Get <p>Sorting field:<br>messages_ready - message backlog;<br>publish - production rate;<br>deliver - consumption rate;<br>consumers - number of online consumers;</p> 
     * @return SortElement <p>Sorting field:<br>messages_ready - message backlog;<br>publish - production rate;<br>deliver - consumption rate;<br>consumers - number of online consumers;</p>
     */
    public String getSortElement() {
        return this.SortElement;
    }

    /**
     * Set <p>Sorting field:<br>messages_ready - message backlog;<br>publish - production rate;<br>deliver - consumption rate;<br>consumers - number of online consumers;</p>
     * @param SortElement <p>Sorting field:<br>messages_ready - message backlog;<br>publish - production rate;<br>deliver - consumption rate;<br>consumers - number of online consumers;</p>
     */
    public void setSortElement(String SortElement) {
        this.SortElement = SortElement;
    }

    /**
     * Get <p>Sort order, asc or desc</p> 
     * @return SortOrder <p>Sort order, asc or desc</p>
     */
    public String getSortOrder() {
        return this.SortOrder;
    }

    /**
     * Set <p>Sort order, asc or desc</p>
     * @param SortOrder <p>Sort order, asc or desc</p>
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

