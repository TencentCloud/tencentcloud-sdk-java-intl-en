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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MonitorInfo extends AbstractModel {

    /**
    * The number of the current partition, starting from 0.
    */
    @SerializedName("PartitionNo")
    @Expose
    private Long PartitionNo;

    /**
    * The offset of the current partition.
    */
    @SerializedName("ConsumerGroupOffset")
    @Expose
    private Long ConsumerGroupOffset;

    /**
    * The amount of unconsumed data in the current partition.
    */
    @SerializedName("ConsumerGroupLag")
    @Expose
    private Long ConsumerGroupLag;

    /**
    * The consumption delay of the current partition (in seconds).
    */
    @SerializedName("Latency")
    @Expose
    private Long Latency;

    /**
     * Get The number of the current partition, starting from 0. 
     * @return PartitionNo The number of the current partition, starting from 0.
     */
    public Long getPartitionNo() {
        return this.PartitionNo;
    }

    /**
     * Set The number of the current partition, starting from 0.
     * @param PartitionNo The number of the current partition, starting from 0.
     */
    public void setPartitionNo(Long PartitionNo) {
        this.PartitionNo = PartitionNo;
    }

    /**
     * Get The offset of the current partition. 
     * @return ConsumerGroupOffset The offset of the current partition.
     */
    public Long getConsumerGroupOffset() {
        return this.ConsumerGroupOffset;
    }

    /**
     * Set The offset of the current partition.
     * @param ConsumerGroupOffset The offset of the current partition.
     */
    public void setConsumerGroupOffset(Long ConsumerGroupOffset) {
        this.ConsumerGroupOffset = ConsumerGroupOffset;
    }

    /**
     * Get The amount of unconsumed data in the current partition. 
     * @return ConsumerGroupLag The amount of unconsumed data in the current partition.
     */
    public Long getConsumerGroupLag() {
        return this.ConsumerGroupLag;
    }

    /**
     * Set The amount of unconsumed data in the current partition.
     * @param ConsumerGroupLag The amount of unconsumed data in the current partition.
     */
    public void setConsumerGroupLag(Long ConsumerGroupLag) {
        this.ConsumerGroupLag = ConsumerGroupLag;
    }

    /**
     * Get The consumption delay of the current partition (in seconds). 
     * @return Latency The consumption delay of the current partition (in seconds).
     */
    public Long getLatency() {
        return this.Latency;
    }

    /**
     * Set The consumption delay of the current partition (in seconds).
     * @param Latency The consumption delay of the current partition (in seconds).
     */
    public void setLatency(Long Latency) {
        this.Latency = Latency;
    }

    public MonitorInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MonitorInfo(MonitorInfo source) {
        if (source.PartitionNo != null) {
            this.PartitionNo = new Long(source.PartitionNo);
        }
        if (source.ConsumerGroupOffset != null) {
            this.ConsumerGroupOffset = new Long(source.ConsumerGroupOffset);
        }
        if (source.ConsumerGroupLag != null) {
            this.ConsumerGroupLag = new Long(source.ConsumerGroupLag);
        }
        if (source.Latency != null) {
            this.Latency = new Long(source.Latency);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionNo", this.PartitionNo);
        this.setParamSimple(map, prefix + "ConsumerGroupOffset", this.ConsumerGroupOffset);
        this.setParamSimple(map, prefix + "ConsumerGroupLag", this.ConsumerGroupLag);
        this.setParamSimple(map, prefix + "Latency", this.Latency);

    }
}

