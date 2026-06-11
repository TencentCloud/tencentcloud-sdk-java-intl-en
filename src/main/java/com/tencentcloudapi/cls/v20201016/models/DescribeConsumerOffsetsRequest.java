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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerOffsetsRequest extends AbstractModel {

    /**
    * Consumer group flag corresponding to a log topic.
    */
    @SerializedName("ConsumerGroup")
    @Expose
    private String ConsumerGroup;

    /**
    * Timestamp (second-level).
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * Logset ID (corresponding to a log topic).
    */
    @SerializedName("LogsetId")
    @Expose
    private String LogsetId;

    /**
    * Log topic id
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * Partition ID
    */
    @SerializedName("PartitionId")
    @Expose
    private String PartitionId;

    /**
     * Get Consumer group flag corresponding to a log topic. 
     * @return ConsumerGroup Consumer group flag corresponding to a log topic.
     */
    public String getConsumerGroup() {
        return this.ConsumerGroup;
    }

    /**
     * Set Consumer group flag corresponding to a log topic.
     * @param ConsumerGroup Consumer group flag corresponding to a log topic.
     */
    public void setConsumerGroup(String ConsumerGroup) {
        this.ConsumerGroup = ConsumerGroup;
    }

    /**
     * Get Timestamp (second-level). 
     * @return From Timestamp (second-level).
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set Timestamp (second-level).
     * @param From Timestamp (second-level).
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get Logset ID (corresponding to a log topic). 
     * @return LogsetId Logset ID (corresponding to a log topic).
     */
    public String getLogsetId() {
        return this.LogsetId;
    }

    /**
     * Set Logset ID (corresponding to a log topic).
     * @param LogsetId Logset ID (corresponding to a log topic).
     */
    public void setLogsetId(String LogsetId) {
        this.LogsetId = LogsetId;
    }

    /**
     * Get Log topic id 
     * @return TopicId Log topic id
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic id
     * @param TopicId Log topic id
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get Partition ID 
     * @return PartitionId Partition ID
     */
    public String getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set Partition ID
     * @param PartitionId Partition ID
     */
    public void setPartitionId(String PartitionId) {
        this.PartitionId = PartitionId;
    }

    public DescribeConsumerOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerOffsetsRequest(DescribeConsumerOffsetsRequest source) {
        if (source.ConsumerGroup != null) {
            this.ConsumerGroup = new String(source.ConsumerGroup);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.LogsetId != null) {
            this.LogsetId = new String(source.LogsetId);
        }
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionId != null) {
            this.PartitionId = new String(source.PartitionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsumerGroup", this.ConsumerGroup);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "LogsetId", this.LogsetId);
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);

    }
}

