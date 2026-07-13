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

public class DescribeRabbitMQServerlessBindingsRequest extends AbstractModel {

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
    * <p>Pagination offset</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Pagination limit</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>Search keywords, do fuzzy search based on source exchange name/target resource name</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>Precise search and filter based on source Exchange</p>
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * <p>Precise search filter based on target QueueName and DestinationExchange cannot be set both at the same time</p>
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * <p>Precise search filter based on target Exchange and QueueName filter cannot be set both at the same time</p>
    */
    @SerializedName("DestinationExchange")
    @Expose
    private String DestinationExchange;

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
     * Get <p>Pagination offset</p> 
     * @return Offset <p>Pagination offset</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Pagination offset</p>
     * @param Offset <p>Pagination offset</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Pagination limit</p> 
     * @return Limit <p>Pagination limit</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Pagination limit</p>
     * @param Limit <p>Pagination limit</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>Search keywords, do fuzzy search based on source exchange name/target resource name</p> 
     * @return SearchWord <p>Search keywords, do fuzzy search based on source exchange name/target resource name</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>Search keywords, do fuzzy search based on source exchange name/target resource name</p>
     * @param SearchWord <p>Search keywords, do fuzzy search based on source exchange name/target resource name</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>Precise search and filter based on source Exchange</p> 
     * @return SourceExchange <p>Precise search and filter based on source Exchange</p>
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set <p>Precise search and filter based on source Exchange</p>
     * @param SourceExchange <p>Precise search and filter based on source Exchange</p>
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get <p>Precise search filter based on target QueueName and DestinationExchange cannot be set both at the same time</p> 
     * @return QueueName <p>Precise search filter based on target QueueName and DestinationExchange cannot be set both at the same time</p>
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set <p>Precise search filter based on target QueueName and DestinationExchange cannot be set both at the same time</p>
     * @param QueueName <p>Precise search filter based on target QueueName and DestinationExchange cannot be set both at the same time</p>
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get <p>Precise search filter based on target Exchange and QueueName filter cannot be set both at the same time</p> 
     * @return DestinationExchange <p>Precise search filter based on target Exchange and QueueName filter cannot be set both at the same time</p>
     */
    public String getDestinationExchange() {
        return this.DestinationExchange;
    }

    /**
     * Set <p>Precise search filter based on target Exchange and QueueName filter cannot be set both at the same time</p>
     * @param DestinationExchange <p>Precise search filter based on target Exchange and QueueName filter cannot be set both at the same time</p>
     */
    public void setDestinationExchange(String DestinationExchange) {
        this.DestinationExchange = DestinationExchange;
    }

    public DescribeRabbitMQServerlessBindingsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRabbitMQServerlessBindingsRequest(DescribeRabbitMQServerlessBindingsRequest source) {
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

