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

public class BatchModifyGroupOffsetsRequest extends AbstractModel {

    /**
    * Consumer group name.
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * Instance name.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Partition information.
    */
    @SerializedName("Partitions")
    @Expose
    private Partitions [] Partitions;

    /**
    * Name of the specified topic. Default value: names of all topics.
    */
    @SerializedName("TopicName")
    @Expose
    private String [] TopicName;

    /**
     * Get Consumer group name. 
     * @return GroupName Consumer group name.
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set Consumer group name.
     * @param GroupName Consumer group name.
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get Instance name. 
     * @return InstanceId Instance name.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance name.
     * @param InstanceId Instance name.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Partition information. 
     * @return Partitions Partition information.
     */
    public Partitions [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Partition information.
     * @param Partitions Partition information.
     */
    public void setPartitions(Partitions [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Name of the specified topic. Default value: names of all topics. 
     * @return TopicName Name of the specified topic. Default value: names of all topics.
     */
    public String [] getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Name of the specified topic. Default value: names of all topics.
     * @param TopicName Name of the specified topic. Default value: names of all topics.
     */
    public void setTopicName(String [] TopicName) {
        this.TopicName = TopicName;
    }

    public BatchModifyGroupOffsetsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchModifyGroupOffsetsRequest(BatchModifyGroupOffsetsRequest source) {
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Partitions != null) {
            this.Partitions = new Partitions[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Partitions(source.Partitions[i]);
            }
        }
        if (source.TopicName != null) {
            this.TopicName = new String[source.TopicName.length];
            for (int i = 0; i < source.TopicName.length; i++) {
                this.TopicName[i] = new String(source.TopicName[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Partitions.", this.Partitions);
        this.setParamArraySimple(map, prefix + "TopicName.", this.TopicName);

    }
}

