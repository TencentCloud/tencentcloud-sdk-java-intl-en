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

public class DescribeGroupOffsetsRequest extends AbstractModel {

    /**
    * <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Kafka consumption group</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40840?from_cn_redirect=1">DescribeGroup</a></p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>Name array of the subscribed topics for the group. If there is no array, it means all topic info under the designated group.</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
    */
    @SerializedName("Topics")
    @Expose
    private String [] Topics;

    /**
    * <p>Fuzzy matching topicName</p>
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * <p>Offset position of this query, defaults to 0</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>Maximum number of returned results this time. Default value: 50. Maximum value: 50.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p> 
     * @return InstanceId <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     * @param InstanceId <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Kafka consumption group</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40840?from_cn_redirect=1">DescribeGroup</a></p> 
     * @return Group <p>Kafka consumption group</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40840?from_cn_redirect=1">DescribeGroup</a></p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>Kafka consumption group</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40840?from_cn_redirect=1">DescribeGroup</a></p>
     * @param Group <p>Kafka consumption group</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40840?from_cn_redirect=1">DescribeGroup</a></p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>Name array of the subscribed topics for the group. If there is no array, it means all topic info under the designated group.</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p> 
     * @return Topics <p>Name array of the subscribed topics for the group. If there is no array, it means all topic info under the designated group.</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
     */
    public String [] getTopics() {
        return this.Topics;
    }

    /**
     * Set <p>Name array of the subscribed topics for the group. If there is no array, it means all topic info under the designated group.</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
     * @param Topics <p>Name array of the subscribed topics for the group. If there is no array, it means all topic info under the designated group.</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40847?from_cn_redirect=1">DescribeTopic</a></p>
     */
    public void setTopics(String [] Topics) {
        this.Topics = Topics;
    }

    /**
     * Get <p>Fuzzy matching topicName</p> 
     * @return SearchWord <p>Fuzzy matching topicName</p>
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * Set <p>Fuzzy matching topicName</p>
     * @param SearchWord <p>Fuzzy matching topicName</p>
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * Get <p>Offset position of this query, defaults to 0</p> 
     * @return Offset <p>Offset position of this query, defaults to 0</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>Offset position of this query, defaults to 0</p>
     * @param Offset <p>Offset position of this query, defaults to 0</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>Maximum number of returned results this time. Default value: 50. Maximum value: 50.</p> 
     * @return Limit <p>Maximum number of returned results this time. Default value: 50. Maximum value: 50.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>Maximum number of returned results this time. Default value: 50. Maximum value: 50.</p>
     * @param Limit <p>Maximum number of returned results this time. Default value: 50. Maximum value: 50.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeGroupOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGroupOffsetsRequest(DescribeGroupOffsetsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.Topics != null) {
            this.Topics = new String[source.Topics.length];
            for (int i = 0; i < source.Topics.length; i++) {
                this.Topics[i] = new String(source.Topics[i]);
            }
        }
        if (source.SearchWord != null) {
            this.SearchWord = new String(source.SearchWord);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
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

