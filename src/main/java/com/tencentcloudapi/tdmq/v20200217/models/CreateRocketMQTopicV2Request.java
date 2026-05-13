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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRocketMQTopicV2Request extends AbstractModel {

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder, Transaction, and DelayScheduled. Transaction is only supported in the Exclusive Edition.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace of the topic. For 4.x common clusters, the Cluster Namespace is fixed as: tdmq_default
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of partitions, invalid for global order
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
    * Tag list
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
     * Get Topic name 
     * @return Topic Topic name
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name
     * @param Topic Topic name
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder, Transaction, and DelayScheduled. Transaction is only supported in the Exclusive Edition. 
     * @return Type Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder, Transaction, and DelayScheduled. Transaction is only supported in the Exclusive Edition.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder, Transaction, and DelayScheduled. Transaction is only supported in the Exclusive Edition.
     * @param Type Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder, Transaction, and DelayScheduled. Transaction is only supported in the Exclusive Edition.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Cluster ID 
     * @return ClusterId Cluster ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
     * @param ClusterId Cluster ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Namespace of the topic. For 4.x common clusters, the Cluster Namespace is fixed as: tdmq_default 
     * @return Namespace Namespace of the topic. For 4.x common clusters, the Cluster Namespace is fixed as: tdmq_default
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace of the topic. For 4.x common clusters, the Cluster Namespace is fixed as: tdmq_default
     * @param Namespace Namespace of the topic. For 4.x common clusters, the Cluster Namespace is fixed as: tdmq_default
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Number of partitions, invalid for global order 
     * @return PartitionNum Number of partitions, invalid for global order
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions, invalid for global order
     * @param PartitionNum Number of partitions, invalid for global order
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    /**
     * Get Tag list 
     * @return TagList Tag list
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag list
     * @param TagList Tag list
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public CreateRocketMQTopicV2Request() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQTopicV2Request(CreateRocketMQTopicV2Request source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

