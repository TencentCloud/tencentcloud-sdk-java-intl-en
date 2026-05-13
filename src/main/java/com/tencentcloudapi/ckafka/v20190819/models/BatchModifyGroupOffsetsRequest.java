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
    * <p>Consumer group name</p>
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * <p>ckafka cluster instance Id</p><p>For reference: <a href="https://www.tencentcloud.com/document/api/597/40835?from_cn_redirect=1">DescribeInstances</a></p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>partition info</p>
    */
    @SerializedName("Partitions")
    @Expose
    private Partitions [] Partitions;

    /**
    * <p>Specify topic, default to all topics</p>
    */
    @SerializedName("TopicName")
    @Expose
    private String [] TopicName;

    /**
     * Get <p>Consumer group name</p> 
     * @return GroupName <p>Consumer group name</p>
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set <p>Consumer group name</p>
     * @param GroupName <p>Consumer group name</p>
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

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
     * Get <p>partition info</p> 
     * @return Partitions <p>partition info</p>
     */
    public Partitions [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set <p>partition info</p>
     * @param Partitions <p>partition info</p>
     */
    public void setPartitions(Partitions [] Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get <p>Specify topic, default to all topics</p> 
     * @return TopicName <p>Specify topic, default to all topics</p>
     */
    public String [] getTopicName() {
        return this.TopicName;
    }

    /**
     * Set <p>Specify topic, default to all topics</p>
     * @param TopicName <p>Specify topic, default to all topics</p>
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

