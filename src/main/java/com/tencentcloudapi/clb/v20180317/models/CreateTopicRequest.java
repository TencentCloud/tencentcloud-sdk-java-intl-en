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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTopicRequest extends AbstractModel {

    /**
    * Log topic name
    */
    @SerializedName("TopicName")
    @Expose
    private String TopicName;

    /**
    * The number of topic partitions, which changes as partitions are split or merged. Each log topic can have up to 50 partitions. If this parameter is not passed in, 1 partition will be created by default and up to 10 partitions are allowed to be created.
    */
    @SerializedName("PartitionCount")
    @Expose
    private Long PartitionCount;

    /**
    * Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
    */
    @SerializedName("TopicType")
    @Expose
    private String TopicType;

    /**
    * Logset retention period, in days. Default value: 30 days. Value range: [1, 3600].
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get Log topic name 
     * @return TopicName Log topic name
     */
    public String getTopicName() {
        return this.TopicName;
    }

    /**
     * Set Log topic name
     * @param TopicName Log topic name
     */
    public void setTopicName(String TopicName) {
        this.TopicName = TopicName;
    }

    /**
     * Get The number of topic partitions, which changes as partitions are split or merged. Each log topic can have up to 50 partitions. If this parameter is not passed in, 1 partition will be created by default and up to 10 partitions are allowed to be created. 
     * @return PartitionCount The number of topic partitions, which changes as partitions are split or merged. Each log topic can have up to 50 partitions. If this parameter is not passed in, 1 partition will be created by default and up to 10 partitions are allowed to be created.
     */
    public Long getPartitionCount() {
        return this.PartitionCount;
    }

    /**
     * Set The number of topic partitions, which changes as partitions are split or merged. Each log topic can have up to 50 partitions. If this parameter is not passed in, 1 partition will be created by default and up to 10 partitions are allowed to be created.
     * @param PartitionCount The number of topic partitions, which changes as partitions are split or merged. Each log topic can have up to 50 partitions. If this parameter is not passed in, 1 partition will be created by default and up to 10 partitions are allowed to be created.
     */
    public void setPartitionCount(Long PartitionCount) {
        this.PartitionCount = PartitionCount;
    }

    /**
     * Get Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs). 
     * @return TopicType Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     */
    public String getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     * @param TopicType Log type. Valid values: ACCESS (access logs; default value) and HEALTH (health check logs).
     */
    public void setTopicType(String TopicType) {
        this.TopicType = TopicType;
    }

    /**
     * Get Logset retention period, in days. Default value: 30 days. Value range: [1, 3600]. 
     * @return Period Logset retention period, in days. Default value: 30 days. Value range: [1, 3600].
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Logset retention period, in days. Default value: 30 days. Value range: [1, 3600].
     * @param Period Logset retention period, in days. Default value: 30 days. Value range: [1, 3600].
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`. 
     * @return StorageType Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
     * @param StorageType Log topic storage type. Valid values: `hot` (STANDARD storage); `cold` (IA storage). Default value: `hot`.
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public CreateTopicRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTopicRequest(CreateTopicRequest source) {
        if (source.TopicName != null) {
            this.TopicName = new String(source.TopicName);
        }
        if (source.PartitionCount != null) {
            this.PartitionCount = new Long(source.PartitionCount);
        }
        if (source.TopicType != null) {
            this.TopicType = new String(source.TopicType);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicName", this.TopicName);
        this.setParamSimple(map, prefix + "PartitionCount", this.PartitionCount);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

