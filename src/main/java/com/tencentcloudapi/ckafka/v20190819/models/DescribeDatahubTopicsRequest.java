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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatahubTopicsRequest extends AbstractModel {

    /**
    * Search term.
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Query offset, which defaults to `0`.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Specifies whether to query the topic list from the connection.
    */
    @SerializedName("QueryFromConnectResource")
    @Expose
    private Boolean QueryFromConnectResource;

    /**
    * Connection ID.
    */
    @SerializedName("ConnectResourceId")
    @Expose
    private String ConnectResourceId;

    /**
    * topic resource expression.
    */
    @SerializedName("TopicRegularExpression")
    @Expose
    private String TopicRegularExpression;

    /**
     * Get Search term. 
     * @return SearchWord Search term.
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Search term.
     * @param SearchWord Search term.
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Query offset, which defaults to `0`. 
     * @return Offset Query offset, which defaults to `0`.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Query offset, which defaults to `0`.
     * @param Offset Query offset, which defaults to `0`.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`. 
     * @return Limit Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
     * @param Limit Maximum number of results to be returned in this request. Default value: `50`. Maximum value: `50`.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Specifies whether to query the topic list from the connection. 
     * @return QueryFromConnectResource Specifies whether to query the topic list from the connection.
     */
    public Boolean getQueryFromConnectResource() {
        return this.QueryFromConnectResource;
    }

    /**
     * Set Specifies whether to query the topic list from the connection.
     * @param QueryFromConnectResource Specifies whether to query the topic list from the connection.
     */
    public void setQueryFromConnectResource(Boolean QueryFromConnectResource) {
        this.QueryFromConnectResource = QueryFromConnectResource;
    }

    /**
     * Get Connection ID. 
     * @return ConnectResourceId Connection ID.
     */
    public String getConnectResourceId() {
        return this.ConnectResourceId;
    }

    /**
     * Set Connection ID.
     * @param ConnectResourceId Connection ID.
     */
    public void setConnectResourceId(String ConnectResourceId) {
        this.ConnectResourceId = ConnectResourceId;
    }

    /**
     * Get topic resource expression. 
     * @return TopicRegularExpression topic resource expression.
     */
    public String getTopicRegularExpression() {
        return this.TopicRegularExpression;
    }

    /**
     * Set topic resource expression.
     * @param TopicRegularExpression topic resource expression.
     */
    public void setTopicRegularExpression(String TopicRegularExpression) {
        this.TopicRegularExpression = TopicRegularExpression;
    }

    public DescribeDatahubTopicsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDatahubTopicsRequest(DescribeDatahubTopicsRequest source) {
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QueryFromConnectResource != null) {
            this.QueryFromConnectResource = new Boolean(source.QueryFromConnectResource);
        }
        if (source.ConnectResourceId != null) {
            this.ConnectResourceId = new String(source.ConnectResourceId);
        }
        if (source.TopicRegularExpression != null) {
            this.TopicRegularExpression = new String(source.TopicRegularExpression);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QueryFromConnectResource", this.QueryFromConnectResource);
        this.setParamSimple(map, prefix + "ConnectResourceId", this.ConnectResourceId);
        this.setParamSimple(map, prefix + "TopicRegularExpression", this.TopicRegularExpression);

    }
}

