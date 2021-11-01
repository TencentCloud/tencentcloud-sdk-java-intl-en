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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SplitPartitionRequest extends AbstractModel{

    /**
    * Log topic ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * ID of the partition to be split
    */
    @SerializedName("PartitionId")
    @Expose
    private Long PartitionId;

    /**
    * Partition split hash key position, which is meaningful only if `Number=2` is set
    */
    @SerializedName("SplitKey")
    @Expose
    private String SplitKey;

    /**
    * Number of partitions to split into, which is optional. Default value: 2
    */
    @SerializedName("Number")
    @Expose
    private Long Number;

    /**
     * Get Log topic ID 
     * @return TopicId Log topic ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set Log topic ID
     * @param TopicId Log topic ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get ID of the partition to be split 
     * @return PartitionId ID of the partition to be split
     */
    public Long getPartitionId() {
        return this.PartitionId;
    }

    /**
     * Set ID of the partition to be split
     * @param PartitionId ID of the partition to be split
     */
    public void setPartitionId(Long PartitionId) {
        this.PartitionId = PartitionId;
    }

    /**
     * Get Partition split hash key position, which is meaningful only if `Number=2` is set 
     * @return SplitKey Partition split hash key position, which is meaningful only if `Number=2` is set
     */
    public String getSplitKey() {
        return this.SplitKey;
    }

    /**
     * Set Partition split hash key position, which is meaningful only if `Number=2` is set
     * @param SplitKey Partition split hash key position, which is meaningful only if `Number=2` is set
     */
    public void setSplitKey(String SplitKey) {
        this.SplitKey = SplitKey;
    }

    /**
     * Get Number of partitions to split into, which is optional. Default value: 2 
     * @return Number Number of partitions to split into, which is optional. Default value: 2
     */
    public Long getNumber() {
        return this.Number;
    }

    /**
     * Set Number of partitions to split into, which is optional. Default value: 2
     * @param Number Number of partitions to split into, which is optional. Default value: 2
     */
    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public SplitPartitionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SplitPartitionRequest(SplitPartitionRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.PartitionId != null) {
            this.PartitionId = new Long(source.PartitionId);
        }
        if (source.SplitKey != null) {
            this.SplitKey = new String(source.SplitKey);
        }
        if (source.Number != null) {
            this.Number = new Long(source.Number);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "PartitionId", this.PartitionId);
        this.setParamSimple(map, prefix + "SplitKey", this.SplitKey);
        this.setParamSimple(map, prefix + "Number", this.Number);

    }
}

