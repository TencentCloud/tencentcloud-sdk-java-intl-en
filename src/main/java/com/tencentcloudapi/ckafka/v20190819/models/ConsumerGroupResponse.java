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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConsumerGroupResponse extends AbstractModel {

    /**
    * Number of eligible consumer groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Topic list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicList")
    @Expose
    private ConsumerGroupTopic [] TopicList;

    /**
    * Consumer group list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupList")
    @Expose
    private ConsumerGroup [] GroupList;

    /**
    * Total number of partitions
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalPartition")
    @Expose
    private Long TotalPartition;

    /**
    * List of monitored partitions
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PartitionListForMonitor")
    @Expose
    private Partition [] PartitionListForMonitor;

    /**
    * Total number of topics
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalTopic")
    @Expose
    private Long TotalTopic;

    /**
    * List of monitored topics
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicListForMonitor")
    @Expose
    private ConsumerGroupTopic [] TopicListForMonitor;

    /**
    * List of monitored groups
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GroupListForMonitor")
    @Expose
    private Group [] GroupListForMonitor;

    /**
     * Get Number of eligible consumer groups 
     * @return TotalCount Number of eligible consumer groups
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of eligible consumer groups
     * @param TotalCount Number of eligible consumer groups
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Topic list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicList Topic list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConsumerGroupTopic [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set Topic list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicList Topic list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicList(ConsumerGroupTopic [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get Consumer group list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupList Consumer group list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConsumerGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set Consumer group list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupList Consumer group list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupList(ConsumerGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get Total number of partitions
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalPartition Total number of partitions
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalPartition() {
        return this.TotalPartition;
    }

    /**
     * Set Total number of partitions
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalPartition Total number of partitions
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalPartition(Long TotalPartition) {
        this.TotalPartition = TotalPartition;
    }

    /**
     * Get List of monitored partitions
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PartitionListForMonitor List of monitored partitions
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Partition [] getPartitionListForMonitor() {
        return this.PartitionListForMonitor;
    }

    /**
     * Set List of monitored partitions
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PartitionListForMonitor List of monitored partitions
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitionListForMonitor(Partition [] PartitionListForMonitor) {
        this.PartitionListForMonitor = PartitionListForMonitor;
    }

    /**
     * Get Total number of topics
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalTopic Total number of topics
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalTopic() {
        return this.TotalTopic;
    }

    /**
     * Set Total number of topics
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalTopic Total number of topics
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalTopic(Long TotalTopic) {
        this.TotalTopic = TotalTopic;
    }

    /**
     * Get List of monitored topics
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicListForMonitor List of monitored topics
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ConsumerGroupTopic [] getTopicListForMonitor() {
        return this.TopicListForMonitor;
    }

    /**
     * Set List of monitored topics
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicListForMonitor List of monitored topics
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicListForMonitor(ConsumerGroupTopic [] TopicListForMonitor) {
        this.TopicListForMonitor = TopicListForMonitor;
    }

    /**
     * Get List of monitored groups
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GroupListForMonitor List of monitored groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Group [] getGroupListForMonitor() {
        return this.GroupListForMonitor;
    }

    /**
     * Set List of monitored groups
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GroupListForMonitor List of monitored groups
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGroupListForMonitor(Group [] GroupListForMonitor) {
        this.GroupListForMonitor = GroupListForMonitor;
    }

    public ConsumerGroupResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConsumerGroupResponse(ConsumerGroupResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.TopicList != null) {
            this.TopicList = new ConsumerGroupTopic[source.TopicList.length];
            for (int i = 0; i < source.TopicList.length; i++) {
                this.TopicList[i] = new ConsumerGroupTopic(source.TopicList[i]);
            }
        }
        if (source.GroupList != null) {
            this.GroupList = new ConsumerGroup[source.GroupList.length];
            for (int i = 0; i < source.GroupList.length; i++) {
                this.GroupList[i] = new ConsumerGroup(source.GroupList[i]);
            }
        }
        if (source.TotalPartition != null) {
            this.TotalPartition = new Long(source.TotalPartition);
        }
        if (source.PartitionListForMonitor != null) {
            this.PartitionListForMonitor = new Partition[source.PartitionListForMonitor.length];
            for (int i = 0; i < source.PartitionListForMonitor.length; i++) {
                this.PartitionListForMonitor[i] = new Partition(source.PartitionListForMonitor[i]);
            }
        }
        if (source.TotalTopic != null) {
            this.TotalTopic = new Long(source.TotalTopic);
        }
        if (source.TopicListForMonitor != null) {
            this.TopicListForMonitor = new ConsumerGroupTopic[source.TopicListForMonitor.length];
            for (int i = 0; i < source.TopicListForMonitor.length; i++) {
                this.TopicListForMonitor[i] = new ConsumerGroupTopic(source.TopicListForMonitor[i]);
            }
        }
        if (source.GroupListForMonitor != null) {
            this.GroupListForMonitor = new Group[source.GroupListForMonitor.length];
            for (int i = 0; i < source.GroupListForMonitor.length; i++) {
                this.GroupListForMonitor[i] = new Group(source.GroupListForMonitor[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TopicList.", this.TopicList);
        this.setParamArrayObj(map, prefix + "GroupList.", this.GroupList);
        this.setParamSimple(map, prefix + "TotalPartition", this.TotalPartition);
        this.setParamArrayObj(map, prefix + "PartitionListForMonitor.", this.PartitionListForMonitor);
        this.setParamSimple(map, prefix + "TotalTopic", this.TotalTopic);
        this.setParamArrayObj(map, prefix + "TopicListForMonitor.", this.TopicListForMonitor);
        this.setParamArrayObj(map, prefix + "GroupListForMonitor.", this.GroupListForMonitor);

    }
}

