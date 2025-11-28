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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicItem extends AbstractModel {

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic type.
NORMAL: regular message.
FIFO: sequential messaging.
DELAY: delayed message.
TRANSACTION message.
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * Number of queues
    */
    @SerializedName("QueueNum")
    @Expose
    private Long QueueNum;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Cluster id of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterIdV4")
    @Expose
    private String ClusterIdV4;

    /**
    * Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NamespaceV4")
    @Expose
    private String NamespaceV4;

    /**
    * Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicV4")
    @Expose
    private String TopicV4;

    /**
    * Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FullNamespaceV4")
    @Expose
    private String FullNamespaceV4;

    /**
    * Message retention time.
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
    * List of bound tags
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

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
     * Get Topic type.
NORMAL: regular message.
FIFO: sequential messaging.
DELAY: delayed message.
TRANSACTION message. 
     * @return TopicType Topic type.
NORMAL: regular message.
FIFO: sequential messaging.
DELAY: delayed message.
TRANSACTION message.
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type.
NORMAL: regular message.
FIFO: sequential messaging.
DELAY: delayed message.
TRANSACTION message.
     * @param TopicType Topic type.
NORMAL: regular message.
FIFO: sequential messaging.
DELAY: delayed message.
TRANSACTION message.
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Number of queues 
     * @return QueueNum Number of queues
     */
    public Long getQueueNum() {
        return this.QueueNum;
    }

    /**
     * Set Number of queues
     * @param QueueNum Number of queues
     */
    public void setQueueNum(Long QueueNum) {
        this.QueueNum = QueueNum;
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
     * Get Cluster id of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ClusterIdV4 Cluster id of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getClusterIdV4() {
        return this.ClusterIdV4;
    }

    /**
     * Set Cluster id of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ClusterIdV4 Cluster id of version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setClusterIdV4(String ClusterIdV4) {
        this.ClusterIdV4 = ClusterIdV4;
    }

    /**
     * Get Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NamespaceV4 Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getNamespaceV4() {
        return this.NamespaceV4;
    }

    /**
     * Set Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NamespaceV4 Namespace of 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNamespaceV4(String NamespaceV4) {
        this.NamespaceV4 = NamespaceV4;
    }

    /**
     * Get Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicV4 Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicV4() {
        return this.TopicV4;
    }

    /**
     * Set Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicV4 Topic name for version 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicV4(String TopicV4) {
        this.TopicV4 = TopicV4;
    }

    /**
     * Get Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FullNamespaceV4 Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFullNamespaceV4() {
        return this.FullNamespaceV4;
    }

    /**
     * Set Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FullNamespaceV4 Complete namespace for 4.x.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFullNamespaceV4(String FullNamespaceV4) {
        this.FullNamespaceV4 = FullNamespaceV4;
    }

    /**
     * Get Message retention time. 
     * @return MsgTTL Message retention time.
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Message retention time.
     * @param MsgTTL Message retention time.
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    /**
     * Get List of bound tags 
     * @return TagList List of bound tags
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set List of bound tags
     * @param TagList List of bound tags
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    public TopicItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicItem(TopicItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.QueueNum != null) {
            this.QueueNum = new Long(source.QueueNum);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.ClusterIdV4 != null) {
            this.ClusterIdV4 = new String(source.ClusterIdV4);
        }
        if (source.NamespaceV4 != null) {
            this.NamespaceV4 = new String(source.NamespaceV4);
        }
        if (source.TopicV4 != null) {
            this.TopicV4 = new String(source.TopicV4);
        }
        if (source.FullNamespaceV4 != null) {
            this.FullNamespaceV4 = new String(source.FullNamespaceV4);
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
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
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "QueueNum", this.QueueNum);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ClusterIdV4", this.ClusterIdV4);
        this.setParamSimple(map, prefix + "NamespaceV4", this.NamespaceV4);
        this.setParamSimple(map, prefix + "TopicV4", this.TopicV4);
        this.setParamSimple(map, prefix + "FullNamespaceV4", this.FullNamespaceV4);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);

    }
}

