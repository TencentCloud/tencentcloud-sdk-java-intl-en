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

public class ConsumerGroupResponse extends AbstractModel {

    /**
    * Number of eligible consumer groups
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Topic list.
    */
    @SerializedName("TopicList")
    @Expose
    private ConsumerGroupTopic [] TopicList;

    /**
    * Specifies the consumption group List.
    */
    @SerializedName("GroupList")
    @Expose
    private ConsumerGroup [] GroupList;

    /**
    * Total number of partitions.
    */
    @SerializedName("TotalPartition")
    @Expose
    private Long TotalPartition;

    /**
    * Monitored partition list.
    */
    @SerializedName("PartitionListForMonitor")
    @Expose
    private Partition [] PartitionListForMonitor;

    /**
    * Total number of topics.
    */
    @SerializedName("TotalTopic")
    @Expose
    private Long TotalTopic;

    /**
    * Monitored topic list.
    */
    @SerializedName("TopicListForMonitor")
    @Expose
    private ConsumerGroupTopic [] TopicListForMonitor;

    /**
    * Monitored group list.
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
     * Get Topic list. 
     * @return TopicList Topic list.
     */
    public ConsumerGroupTopic [] getTopicList() {
        return this.TopicList;
    }

    /**
     * Set Topic list.
     * @param TopicList Topic list.
     */
    public void setTopicList(ConsumerGroupTopic [] TopicList) {
        this.TopicList = TopicList;
    }

    /**
     * Get Specifies the consumption group List. 
     * @return GroupList Specifies the consumption group List.
     */
    public ConsumerGroup [] getGroupList() {
        return this.GroupList;
    }

    /**
     * Set Specifies the consumption group List.
     * @param GroupList Specifies the consumption group List.
     */
    public void setGroupList(ConsumerGroup [] GroupList) {
        this.GroupList = GroupList;
    }

    /**
     * Get Total number of partitions. 
     * @return TotalPartition Total number of partitions.
     */
    public Long getTotalPartition() {
        return this.TotalPartition;
    }

    /**
     * Set Total number of partitions.
     * @param TotalPartition Total number of partitions.
     */
    public void setTotalPartition(Long TotalPartition) {
        this.TotalPartition = TotalPartition;
    }

    /**
     * Get Monitored partition list. 
     * @return PartitionListForMonitor Monitored partition list.
     */
    public Partition [] getPartitionListForMonitor() {
        return this.PartitionListForMonitor;
    }

    /**
     * Set Monitored partition list.
     * @param PartitionListForMonitor Monitored partition list.
     */
    public void setPartitionListForMonitor(Partition [] PartitionListForMonitor) {
        this.PartitionListForMonitor = PartitionListForMonitor;
    }

    /**
     * Get Total number of topics. 
     * @return TotalTopic Total number of topics.
     */
    public Long getTotalTopic() {
        return this.TotalTopic;
    }

    /**
     * Set Total number of topics.
     * @param TotalTopic Total number of topics.
     */
    public void setTotalTopic(Long TotalTopic) {
        this.TotalTopic = TotalTopic;
    }

    /**
     * Get Monitored topic list. 
     * @return TopicListForMonitor Monitored topic list.
     */
    public ConsumerGroupTopic [] getTopicListForMonitor() {
        return this.TopicListForMonitor;
    }

    /**
     * Set Monitored topic list.
     * @param TopicListForMonitor Monitored topic list.
     */
    public void setTopicListForMonitor(ConsumerGroupTopic [] TopicListForMonitor) {
        this.TopicListForMonitor = TopicListForMonitor;
    }

    /**
     * Get Monitored group list. 
     * @return GroupListForMonitor Monitored group list.
     */
    public Group [] getGroupListForMonitor() {
        return this.GroupListForMonitor;
    }

    /**
     * Set Monitored group list.
     * @param GroupListForMonitor Monitored group list.
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

