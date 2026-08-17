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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceSpecBandwidthRequest extends AbstractModel {

    /**
    * <p>Specify the instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list. Meanwhile, InstanceId and specification parameters cannot be empty at the same time. Provide at least one.</p><ul><li>If only InstanceId is specified: Query the bandwidth of the current instance.</li><li>If InstanceId and at least one specification parameter (ShardSize, ShardNum, or ReplicateNum) are specified: Calculate the bandwidth after specification modification.</li><li>If partial or all specification parameters (ShardSize, ShardNum, ReplicateNum, and Type) are specified without InstanceId: Query the theoretical bandwidth based on the combined query of specifications.</li></ul>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Shard size. Unit: MB.</p>
    */
    @SerializedName("ShardSize")
    @Expose
    private Long ShardSize;

    /**
    * <p>Number of shards.</p>
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * <p>Number of replication groups.</p>
    */
    @SerializedName("ReplicateNum")
    @Expose
    private Long ReplicateNum;

    /**
    * <p>Read-only weight. - 100: Enable read-only slave. - 0: Disable read-only slave.</p>
    */
    @SerializedName("ReadOnlyWeight")
    @Expose
    private Long ReadOnlyWeight;

    /**
    * <p>Instance type, same as Type in <a href="https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1">CreateInstances</a>.</p>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
     * Get <p>Specify the instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list. Meanwhile, InstanceId and specification parameters cannot be empty at the same time. Provide at least one.</p><ul><li>If only InstanceId is specified: Query the bandwidth of the current instance.</li><li>If InstanceId and at least one specification parameter (ShardSize, ShardNum, or ReplicateNum) are specified: Calculate the bandwidth after specification modification.</li><li>If partial or all specification parameters (ShardSize, ShardNum, ReplicateNum, and Type) are specified without InstanceId: Query the theoretical bandwidth based on the combined query of specifications.</li></ul> 
     * @return InstanceId <p>Specify the instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list. Meanwhile, InstanceId and specification parameters cannot be empty at the same time. Provide at least one.</p><ul><li>If only InstanceId is specified: Query the bandwidth of the current instance.</li><li>If InstanceId and at least one specification parameter (ShardSize, ShardNum, or ReplicateNum) are specified: Calculate the bandwidth after specification modification.</li><li>If partial or all specification parameters (ShardSize, ShardNum, ReplicateNum, and Type) are specified without InstanceId: Query the theoretical bandwidth based on the combined query of specifications.</li></ul>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specify the instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list. Meanwhile, InstanceId and specification parameters cannot be empty at the same time. Provide at least one.</p><ul><li>If only InstanceId is specified: Query the bandwidth of the current instance.</li><li>If InstanceId and at least one specification parameter (ShardSize, ShardNum, or ReplicateNum) are specified: Calculate the bandwidth after specification modification.</li><li>If partial or all specification parameters (ShardSize, ShardNum, ReplicateNum, and Type) are specified without InstanceId: Query the theoretical bandwidth based on the combined query of specifications.</li></ul>
     * @param InstanceId <p>Specify the instance ID. Log in to the <a href="https://console.cloud.tencent.com/redis">Redis console</a> and copy the instance ID from the instance list. Meanwhile, InstanceId and specification parameters cannot be empty at the same time. Provide at least one.</p><ul><li>If only InstanceId is specified: Query the bandwidth of the current instance.</li><li>If InstanceId and at least one specification parameter (ShardSize, ShardNum, or ReplicateNum) are specified: Calculate the bandwidth after specification modification.</li><li>If partial or all specification parameters (ShardSize, ShardNum, ReplicateNum, and Type) are specified without InstanceId: Query the theoretical bandwidth based on the combined query of specifications.</li></ul>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Shard size. Unit: MB.</p> 
     * @return ShardSize <p>Shard size. Unit: MB.</p>
     */
    public Long getShardSize() {
        return this.ShardSize;
    }

    /**
     * Set <p>Shard size. Unit: MB.</p>
     * @param ShardSize <p>Shard size. Unit: MB.</p>
     */
    public void setShardSize(Long ShardSize) {
        this.ShardSize = ShardSize;
    }

    /**
     * Get <p>Number of shards.</p> 
     * @return ShardNum <p>Number of shards.</p>
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set <p>Number of shards.</p>
     * @param ShardNum <p>Number of shards.</p>
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get <p>Number of replication groups.</p> 
     * @return ReplicateNum <p>Number of replication groups.</p>
     */
    public Long getReplicateNum() {
        return this.ReplicateNum;
    }

    /**
     * Set <p>Number of replication groups.</p>
     * @param ReplicateNum <p>Number of replication groups.</p>
     */
    public void setReplicateNum(Long ReplicateNum) {
        this.ReplicateNum = ReplicateNum;
    }

    /**
     * Get <p>Read-only weight. - 100: Enable read-only slave. - 0: Disable read-only slave.</p> 
     * @return ReadOnlyWeight <p>Read-only weight. - 100: Enable read-only slave. - 0: Disable read-only slave.</p>
     */
    public Long getReadOnlyWeight() {
        return this.ReadOnlyWeight;
    }

    /**
     * Set <p>Read-only weight. - 100: Enable read-only slave. - 0: Disable read-only slave.</p>
     * @param ReadOnlyWeight <p>Read-only weight. - 100: Enable read-only slave. - 0: Disable read-only slave.</p>
     */
    public void setReadOnlyWeight(Long ReadOnlyWeight) {
        this.ReadOnlyWeight = ReadOnlyWeight;
    }

    /**
     * Get <p>Instance type, same as Type in <a href="https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1">CreateInstances</a>.</p> 
     * @return Type <p>Instance type, same as Type in <a href="https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1">CreateInstances</a>.</p>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Instance type, same as Type in <a href="https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1">CreateInstances</a>.</p>
     * @param Type <p>Instance type, same as Type in <a href="https://www.tencentcloud.com/document/api/239/20026?from_cn_redirect=1">CreateInstances</a>.</p>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    public DescribeInstanceSpecBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceSpecBandwidthRequest(DescribeInstanceSpecBandwidthRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ShardSize != null) {
            this.ShardSize = new Long(source.ShardSize);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.ReplicateNum != null) {
            this.ReplicateNum = new Long(source.ReplicateNum);
        }
        if (source.ReadOnlyWeight != null) {
            this.ReadOnlyWeight = new Long(source.ReadOnlyWeight);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ShardSize", this.ShardSize);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamSimple(map, prefix + "ReplicateNum", this.ReplicateNum);
        this.setParamSimple(map, prefix + "ReadOnlyWeight", this.ReadOnlyWeight);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

