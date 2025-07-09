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
    * Pagination Offset
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Pagination Limit
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Search keywords. do fuzzy search based on source exchange name, target resource name or binding key.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Search and filter precisely according to the source Exchange.
    */
    @SerializedName("SourceExchange")
    @Expose
    private String SourceExchange;

    /**
    * Specifies precise search filter based on target QueueName. cannot set simultaneously with DestinationExchange filter.
    */
    @SerializedName("QueueName")
    @Expose
    private String QueueName;

    /**
    * Precise search filter based on target Exchange. cannot set it simultaneously with QueueName filter.
    */
    @SerializedName("DestinationExchange")
    @Expose
    private String DestinationExchange;

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
     * Get Pagination Offset 
     * @return Offset Pagination Offset
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Pagination Offset
     * @param Offset Pagination Offset
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Pagination Limit 
     * @return Limit Pagination Limit
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Pagination Limit
     * @param Limit Pagination Limit
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Search keywords. do fuzzy search based on source exchange name, target resource name or binding key. 
     * @return SearchWord Search keywords. do fuzzy search based on source exchange name, target resource name or binding key.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search keywords. do fuzzy search based on source exchange name, target resource name or binding key.
     * @param SearchWord Search keywords. do fuzzy search based on source exchange name, target resource name or binding key.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Search and filter precisely according to the source Exchange. 
     * @return SourceExchange Search and filter precisely according to the source Exchange.
     */
    public String getSourceExchange() {
        return this.SourceExchange;
    }

    /**
     * Set Search and filter precisely according to the source Exchange.
     * @param SourceExchange Search and filter precisely according to the source Exchange.
     */
    public void setSourceExchange(String SourceExchange) {
        this.SourceExchange = SourceExchange;
    }

    /**
     * Get Specifies precise search filter based on target QueueName. cannot set simultaneously with DestinationExchange filter. 
     * @return QueueName Specifies precise search filter based on target QueueName. cannot set simultaneously with DestinationExchange filter.
     */
    public String getQueueName() {
        return this.QueueName;
    }

    /**
     * Set Specifies precise search filter based on target QueueName. cannot set simultaneously with DestinationExchange filter.
     * @param QueueName Specifies precise search filter based on target QueueName. cannot set simultaneously with DestinationExchange filter.
     */
    public void setQueueName(String QueueName) {
        this.QueueName = QueueName;
    }

    /**
     * Get Precise search filter based on target Exchange. cannot set it simultaneously with QueueName filter. 
     * @return DestinationExchange Precise search filter based on target Exchange. cannot set it simultaneously with QueueName filter.
     */
    public String getDestinationExchange() {
        return this.DestinationExchange;
    }

    /**
     * Set Precise search filter based on target Exchange. cannot set it simultaneously with QueueName filter.
     * @param DestinationExchange Precise search filter based on target Exchange. cannot set it simultaneously with QueueName filter.
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

