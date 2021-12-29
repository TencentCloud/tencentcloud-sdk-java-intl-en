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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRocketMQTopicRequest extends AbstractModel{

    /**
    * Cluster ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Namespace name
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Topic name
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Remarks (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of partitions, which is invalid for globally sequential messages and cannot be less than the current number of partitions.
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

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
     * Get Namespace name 
     * @return NamespaceId Namespace name
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace name
     * @param NamespaceId Namespace name
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
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
     * Get Remarks (up to 128 characters) 
     * @return Remark Remarks (up to 128 characters)
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks (up to 128 characters)
     * @param Remark Remarks (up to 128 characters)
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Number of partitions, which is invalid for globally sequential messages and cannot be less than the current number of partitions. 
     * @return PartitionNum Number of partitions, which is invalid for globally sequential messages and cannot be less than the current number of partitions.
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions, which is invalid for globally sequential messages and cannot be less than the current number of partitions.
     * @param PartitionNum Number of partitions, which is invalid for globally sequential messages and cannot be less than the current number of partitions.
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    public ModifyRocketMQTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRocketMQTopicRequest(ModifyRocketMQTopicRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.PartitionNum != null) {
            this.PartitionNum = new Long(source.PartitionNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);

    }
}

