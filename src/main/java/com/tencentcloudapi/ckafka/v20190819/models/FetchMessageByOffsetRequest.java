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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FetchMessageByOffsetRequest extends AbstractModel{

    /**
    * Instance ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Topic name.
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * Partition ID.
    */
    @SerializedName("Partition")
    @Expose
    private Long Partition;

    /**
    * Offset information.
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get Instance ID. 
     * @return InstanceId Instance ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID.
     * @param InstanceId Instance ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Topic name. 
     * @return Topic Topic name.
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * Set Topic name.
     * @param Topic Topic name.
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * Get Partition ID. 
     * @return Partition Partition ID.
     */
    public Long getPartition() {
        return this.Partition;
    }

    /**
     * Set Partition ID.
     * @param Partition Partition ID.
     */
    public void setPartition(Long Partition) {
        this.Partition = Partition;
    }

    /**
     * Get Offset information. 
     * @return Offset Offset information.
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set Offset information.
     * @param Offset Offset information.
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

