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

public class CreateRocketMQTopicRequest extends AbstractModel{

    /**
    * Topic name, which can contain 3–64 letters, digits, hyphens, and underscores
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Topic namespace. Currently, you can create topics only in one single namespace.
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder.
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
    * Topic remarks (up to 128 characters)
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of partitions, which doesn't take effect for globally sequential messages
    */
    @SerializedName("PartitionNum")
    @Expose
    private Long PartitionNum;

    /**
     * Get Topic name, which can contain 3–64 letters, digits, hyphens, and underscores 
     * @return Topic Topic name, which can contain 3–64 letters, digits, hyphens, and underscores
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name, which can contain 3–64 letters, digits, hyphens, and underscores
     * @param Topic Topic name, which can contain 3–64 letters, digits, hyphens, and underscores
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Topic namespace. Currently, you can create topics only in one single namespace. 
     * @return Namespaces Topic namespace. Currently, you can create topics only in one single namespace.
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set Topic namespace. Currently, you can create topics only in one single namespace.
     * @param Namespaces Topic namespace. Currently, you can create topics only in one single namespace.
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder. 
     * @return Type Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder.
     * @param Type Topic type. Valid values: Normal, GlobalOrder, PartitionedOrder.
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
     * Get Topic remarks (up to 128 characters) 
     * @return Remark Topic remarks (up to 128 characters)
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Topic remarks (up to 128 characters)
     * @param Remark Topic remarks (up to 128 characters)
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Number of partitions, which doesn't take effect for globally sequential messages 
     * @return PartitionNum Number of partitions, which doesn't take effect for globally sequential messages
     */
    public Long getPartitionNum() {
        return this.PartitionNum;
    }

    /**
     * Set Number of partitions, which doesn't take effect for globally sequential messages
     * @param PartitionNum Number of partitions, which doesn't take effect for globally sequential messages
     */
    public void setPartitionNum(Long PartitionNum) {
        this.PartitionNum = PartitionNum;
    }

    public CreateRocketMQTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRocketMQTopicRequest(CreateRocketMQTopicRequest source) {
        if (source.Topic != null) {
            this.Topic = new String(source.Topic);
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
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
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "PartitionNum", this.PartitionNum);

    }
}

