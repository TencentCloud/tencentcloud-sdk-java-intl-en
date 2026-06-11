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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TopicPartitionInfo extends AbstractModel {

    /**
    * Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicID")
    @Expose
    private String TopicID;

    /**
    * Partition ID list.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private Long [] Partitions;

    /**
     * Get Log topic ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicID Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTopicID() {
        return this.TopicID;
    }

    /**
     * Set Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicID Log topic ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicID(String TopicID) {
        this.TopicID = TopicID;
    }

    /**
     * Get Partition ID list.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Partitions Partition ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long [] getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Partition ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Partitions Partition ID list.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(Long [] Partitions) {
        this.Partitions = Partitions;
    }

    public TopicPartitionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TopicPartitionInfo(TopicPartitionInfo source) {
        if (source.TopicID != null) {
            this.TopicID = new String(source.TopicID);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long[source.Partitions.length];
            for (int i = 0; i < source.Partitions.length; i++) {
                this.Partitions[i] = new Long(source.Partitions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicID", this.TopicID);
        this.setParamArraySimple(map, prefix + "Partitions.", this.Partitions);

    }
}

