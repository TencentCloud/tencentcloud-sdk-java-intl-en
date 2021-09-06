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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSpecRequest extends AbstractModel{

    /**
    * Instance ID in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Memory size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously. For degradation, the new disk capacity must be greater than 1.2 times the used disk capacity
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * Oplog size after instance configuration change in GB, which ranges from 10% to 90% of the disk capacity and is 10% of the disk capacity by default
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * Node quantity after configuration modification. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the node quantity won't change.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Shard quantity after configuration modification, which can only be increased rather than decreased. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the shard quantity won't change.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * Switch time. Valid values: `0` (upon modification completion), `1` (during maintenance time). Default value: `0`. If the node quantity or the shard quantity is modified, `1` is invalid.
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
     * Get Instance ID in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page 
     * @return InstanceId Instance ID in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
     * @param InstanceId Instance ID in the format of cmgo-p8vnipr5. It is the same as the instance ID displayed on the TencentDB Console page
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Memory size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously 
     * @return Memory Memory size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously
     * @param Memory Memory size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously. For degradation, the new disk capacity must be greater than 1.2 times the used disk capacity 
     * @return Volume Disk size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously. For degradation, the new disk capacity must be greater than 1.2 times the used disk capacity
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously. For degradation, the new disk capacity must be greater than 1.2 times the used disk capacity
     * @param Volume Disk size after instance configuration change in GB. Memory and disk must be upgraded or degraded simultaneously. For degradation, the new disk capacity must be greater than 1.2 times the used disk capacity
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get Oplog size after instance configuration change in GB, which ranges from 10% to 90% of the disk capacity and is 10% of the disk capacity by default 
     * @return OplogSize Oplog size after instance configuration change in GB, which ranges from 10% to 90% of the disk capacity and is 10% of the disk capacity by default
     */
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set Oplog size after instance configuration change in GB, which ranges from 10% to 90% of the disk capacity and is 10% of the disk capacity by default
     * @param OplogSize Oplog size after instance configuration change in GB, which ranges from 10% to 90% of the disk capacity and is 10% of the disk capacity by default
     */
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get Node quantity after configuration modification. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the node quantity won't change. 
     * @return NodeNum Node quantity after configuration modification. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the node quantity won't change.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Node quantity after configuration modification. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the node quantity won't change.
     * @param NodeNum Node quantity after configuration modification. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the node quantity won't change.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Shard quantity after configuration modification, which can only be increased rather than decreased. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the shard quantity won't change. 
     * @return ReplicateSetNum Shard quantity after configuration modification, which can only be increased rather than decreased. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the shard quantity won't change.
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set Shard quantity after configuration modification, which can only be increased rather than decreased. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the shard quantity won't change.
     * @param ReplicateSetNum Shard quantity after configuration modification, which can only be increased rather than decreased. The value range is subject to the response parameter of the `DescribeSpecInfo` API. If this parameter is left empty, the shard quantity won't change.
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get Switch time. Valid values: `0` (upon modification completion), `1` (during maintenance time). Default value: `0`. If the node quantity or the shard quantity is modified, `1` is invalid. 
     * @return InMaintenance Switch time. Valid values: `0` (upon modification completion), `1` (during maintenance time). Default value: `0`. If the node quantity or the shard quantity is modified, `1` is invalid.
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set Switch time. Valid values: `0` (upon modification completion), `1` (during maintenance time). Default value: `0`. If the node quantity or the shard quantity is modified, `1` is invalid.
     * @param InMaintenance Switch time. Valid values: `0` (upon modification completion), `1` (during maintenance time). Default value: `0`. If the node quantity or the shard quantity is modified, `1` is invalid.
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    public ModifyDBInstanceSpecRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDBInstanceSpecRequest(ModifyDBInstanceSpecRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.OplogSize != null) {
            this.OplogSize = new Long(source.OplogSize);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ReplicateSetNum != null) {
            this.ReplicateSetNum = new Long(source.ReplicateSetNum);
        }
        if (source.InMaintenance != null) {
            this.InMaintenance = new Long(source.InMaintenance);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "InMaintenance", this.InMaintenance);

    }
}

