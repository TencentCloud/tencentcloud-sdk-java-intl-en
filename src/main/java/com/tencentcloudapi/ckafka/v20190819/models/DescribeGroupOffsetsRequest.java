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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGroupOffsetsRequest extends AbstractModel{

    /**
    * (Filter) filter by instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Kafka consumer group
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * Array of the names of topics subscribed to by a group. If there is no such array, this parameter means the information of all topics in the specified group
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * Fuzzy match by `topicName`
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * Offset position of this query. Default value: 0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * Maximum number of results to be returned in this request. Default value: 50. Maximum value: 50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get (Filter) filter by instance ID 
     * @return InstanceId (Filter) filter by instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set (Filter) filter by instance ID
     * @param InstanceId (Filter) filter by instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Kafka consumer group 
     * @return Group Kafka consumer group
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set Kafka consumer group
     * @param Group Kafka consumer group
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get Array of the names of topics subscribed to by a group. If there is no such array, this parameter means the information of all topics in the specified group 
     * @return Topics Array of the names of topics subscribed to by a group. If there is no such array, this parameter means the information of all topics in the specified group
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set Array of the names of topics subscribed to by a group. If there is no such array, this parameter means the information of all topics in the specified group
     * @param Topics Array of the names of topics subscribed to by a group. If there is no such array, this parameter means the information of all topics in the specified group
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get Fuzzy match by `topicName` 
     * @return SearchWord Fuzzy match by `topicName`
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set Fuzzy match by `topicName`
     * @param SearchWord Fuzzy match by `topicName`
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get Offset position of this query. Default value: 0 
     * @return Offset Offset position of this query. Default value: 0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset position of this query. Default value: 0
     * @param Offset Offset position of this query. Default value: 0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get Maximum number of results to be returned in this request. Default value: 50. Maximum value: 50 
     * @return Limit Maximum number of results to be returned in this request. Default value: 50. Maximum value: 50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Maximum number of results to be returned in this request. Default value: 50. Maximum value: 50
     * @param Limit Maximum number of results to be returned in this request. Default value: 50. Maximum value: 50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamArraySimple(map, prefix + "Topics.", this.Topics);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

