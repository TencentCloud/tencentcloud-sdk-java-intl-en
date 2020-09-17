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

public class FetchMessageListByTimestampRequest extends AbstractModel{

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
    * Query start time. It is a 13-digit timestamp.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Maximum number of records that can be queried. Default value: 20.
    */
    @SerializedName("SinglePartitionRecordNumber")
    @Expose
    private Long SinglePartitionRecordNumber;

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
     * Get Query start time. It is a 13-digit timestamp. 
     * @return StartTime Query start time. It is a 13-digit timestamp.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Query start time. It is a 13-digit timestamp.
     * @param StartTime Query start time. It is a 13-digit timestamp.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Maximum number of records that can be queried. Default value: 20. 
     * @return SinglePartitionRecordNumber Maximum number of records that can be queried. Default value: 20.
     */
    public Long getSinglePartitionRecordNumber() {
        return this.SinglePartitionRecordNumber;
    }

    /**
     * Set Maximum number of records that can be queried. Default value: 20.
     * @param SinglePartitionRecordNumber Maximum number of records that can be queried. Default value: 20.
     */
    public void setSinglePartitionRecordNumber(Long SinglePartitionRecordNumber) {
        this.SinglePartitionRecordNumber = SinglePartitionRecordNumber;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "Partition", this.Partition);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SinglePartitionRecordNumber", this.SinglePartitionRecordNumber);

    }
}

