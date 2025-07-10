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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSpecRequest extends AbstractModel {

    /**
    * Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Memory size after instance configuration modification. - Unit: GB. The current instance memory size is used by default if this parameter is left blank.<br>Note: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * Disk capacity after instance configuration modification. Unit: GB. The current instance disk capacity is used by default if this parameter is left blank.
 - Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
 - During configuration downgrading, the disk capacity after modification should be greater than 1.2 times the used disk capacity.
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * (Deprecated) Use the independent API ResizeOplog.

Oplog size after instance configuration modification.
 - Unit: GB.
 - By default, the capacity occupied by Oplog is 10% of the disk capacity. The range of capacity occupied by Oplog supported by the system is [10%,90%] of the disk capacity.
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * Number of Mongod nodes after instance modification (excluding read-only nodes).
 - When the CPU and memory specifications of Mongod nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - When the CPU and memory specifications of Mongos nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - During node modification (all types), this parameter can be left blank or set to the number of Mongod nodes (excluding read-only nodes) after modification.
 - Number of replica set nodes: Confirm the range of the number of nodes based on the MinNodeNum and MaxNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
 - Number of nodes for each shard in a sharded cluster: Confirm the range of the number of nodes based on the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Number of shards after instance modification.
 - The value range can be obtained from the **MinReplicateSetNum** and **MaxReplicateSetNum** parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API for querying saleable TencentDB for MongoDB specifications. - The value of this parameter can only be increased but not decreased.
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * Switch time for instance configuration modification.
 - 0: Execute the configuration modification task immediately after the adjustment is completed. Default value: 0.
 - 1: Execute the configuration modification task within the maintenance window.
**Note**: Adjusting the number of nodes and shards is unsupported <b>within the maintenance window</b>.
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
    * Mongos node memory size after the sharded cluster instance configuration is modified. Unit: GB.
    */
    @SerializedName("MongosMemory")
    @Expose
    private String MongosMemory;

    /**
    * List of nodes to be added, containing the node type and AZ information.
    */
    @SerializedName("AddNodeList")
    @Expose
    private AddNodeList [] AddNodeList;

    /**
    * List of nodes to be deleted. Note: According to the consistency principle for nodes of each shard on a sharded cluster instance, specify the nodes on shard 0 for node deletion from the sharded cluster instance. For example, cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.
    */
    @SerializedName("RemoveNodeList")
    @Expose
    private RemoveNodeList [] RemoveNodeList;

    /**
     * Get Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.
 
     * @return InstanceId Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

     * @param InstanceId Instance ID. For example, cmgo-p8vn****. Log in to the [TencentDB for MongoDB console](https://console.cloud.tencent.com/MongoDB) and copy the instance ID from the instance list.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Memory size after instance configuration modification. - Unit: GB. The current instance memory size is used by default if this parameter is left blank.<br>Note: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time. 
     * @return Memory Memory size after instance configuration modification. - Unit: GB. The current instance memory size is used by default if this parameter is left blank.<br>Note: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set Memory size after instance configuration modification. - Unit: GB. The current instance memory size is used by default if this parameter is left blank.<br>Note: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
     * @param Memory Memory size after instance configuration modification. - Unit: GB. The current instance memory size is used by default if this parameter is left blank.<br>Note: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get Disk capacity after instance configuration modification. Unit: GB. The current instance disk capacity is used by default if this parameter is left blank.
 - Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
 - During configuration downgrading, the disk capacity after modification should be greater than 1.2 times the used disk capacity. 
     * @return Volume Disk capacity after instance configuration modification. Unit: GB. The current instance disk capacity is used by default if this parameter is left blank.
 - Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
 - During configuration downgrading, the disk capacity after modification should be greater than 1.2 times the used disk capacity.
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set Disk capacity after instance configuration modification. Unit: GB. The current instance disk capacity is used by default if this parameter is left blank.
 - Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
 - During configuration downgrading, the disk capacity after modification should be greater than 1.2 times the used disk capacity.
     * @param Volume Disk capacity after instance configuration modification. Unit: GB. The current instance disk capacity is used by default if this parameter is left blank.
 - Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.
 - During configuration downgrading, the disk capacity after modification should be greater than 1.2 times the used disk capacity.
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get (Deprecated) Use the independent API ResizeOplog.

Oplog size after instance configuration modification.
 - Unit: GB.
 - By default, the capacity occupied by Oplog is 10% of the disk capacity. The range of capacity occupied by Oplog supported by the system is [10%,90%] of the disk capacity. 
     * @return OplogSize (Deprecated) Use the independent API ResizeOplog.

Oplog size after instance configuration modification.
 - Unit: GB.
 - By default, the capacity occupied by Oplog is 10% of the disk capacity. The range of capacity occupied by Oplog supported by the system is [10%,90%] of the disk capacity.
     * @deprecated
     */
    @Deprecated
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set (Deprecated) Use the independent API ResizeOplog.

Oplog size after instance configuration modification.
 - Unit: GB.
 - By default, the capacity occupied by Oplog is 10% of the disk capacity. The range of capacity occupied by Oplog supported by the system is [10%,90%] of the disk capacity.
     * @param OplogSize (Deprecated) Use the independent API ResizeOplog.

Oplog size after instance configuration modification.
 - Unit: GB.
 - By default, the capacity occupied by Oplog is 10% of the disk capacity. The range of capacity occupied by Oplog supported by the system is [10%,90%] of the disk capacity.
     * @deprecated
     */
    @Deprecated
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get Number of Mongod nodes after instance modification (excluding read-only nodes).
 - When the CPU and memory specifications of Mongod nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - When the CPU and memory specifications of Mongos nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - During node modification (all types), this parameter can be left blank or set to the number of Mongod nodes (excluding read-only nodes) after modification.
 - Number of replica set nodes: Confirm the range of the number of nodes based on the MinNodeNum and MaxNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
 - Number of nodes for each shard in a sharded cluster: Confirm the range of the number of nodes based on the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications. 
     * @return NodeNum Number of Mongod nodes after instance modification (excluding read-only nodes).
 - When the CPU and memory specifications of Mongod nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - When the CPU and memory specifications of Mongos nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - During node modification (all types), this parameter can be left blank or set to the number of Mongod nodes (excluding read-only nodes) after modification.
 - Number of replica set nodes: Confirm the range of the number of nodes based on the MinNodeNum and MaxNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
 - Number of nodes for each shard in a sharded cluster: Confirm the range of the number of nodes based on the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Number of Mongod nodes after instance modification (excluding read-only nodes).
 - When the CPU and memory specifications of Mongod nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - When the CPU and memory specifications of Mongos nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - During node modification (all types), this parameter can be left blank or set to the number of Mongod nodes (excluding read-only nodes) after modification.
 - Number of replica set nodes: Confirm the range of the number of nodes based on the MinNodeNum and MaxNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
 - Number of nodes for each shard in a sharded cluster: Confirm the range of the number of nodes based on the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
     * @param NodeNum Number of Mongod nodes after instance modification (excluding read-only nodes).
 - When the CPU and memory specifications of Mongod nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - When the CPU and memory specifications of Mongos nodes are modified, this parameter can be left blank or set to the current number of Mongod nodes (excluding read-only nodes).
 - During node modification (all types), this parameter can be left blank or set to the number of Mongod nodes (excluding read-only nodes) after modification.
 - Number of replica set nodes: Confirm the range of the number of nodes based on the MinNodeNum and MaxNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
 - Number of nodes for each shard in a sharded cluster: Confirm the range of the number of nodes based on the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38565?from_cn_redirect=1) API for querying saleable TencenDB for MongoDB specifications.
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Number of shards after instance modification.
 - The value range can be obtained from the **MinReplicateSetNum** and **MaxReplicateSetNum** parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API for querying saleable TencentDB for MongoDB specifications. - The value of this parameter can only be increased but not decreased. 
     * @return ReplicateSetNum Number of shards after instance modification.
 - The value range can be obtained from the **MinReplicateSetNum** and **MaxReplicateSetNum** parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API for querying saleable TencentDB for MongoDB specifications. - The value of this parameter can only be increased but not decreased.
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set Number of shards after instance modification.
 - The value range can be obtained from the **MinReplicateSetNum** and **MaxReplicateSetNum** parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API for querying saleable TencentDB for MongoDB specifications. - The value of this parameter can only be increased but not decreased.
     * @param ReplicateSetNum Number of shards after instance modification.
 - The value range can be obtained from the **MinReplicateSetNum** and **MaxReplicateSetNum** parameters returned by the [DescribeSpecInfo](https://intl.cloud.tencent.com/document/product/240/38567?from_cn_redirect=1) API for querying saleable TencentDB for MongoDB specifications. - The value of this parameter can only be increased but not decreased.
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get Switch time for instance configuration modification.
 - 0: Execute the configuration modification task immediately after the adjustment is completed. Default value: 0.
 - 1: Execute the configuration modification task within the maintenance window.
**Note**: Adjusting the number of nodes and shards is unsupported <b>within the maintenance window</b>. 
     * @return InMaintenance Switch time for instance configuration modification.
 - 0: Execute the configuration modification task immediately after the adjustment is completed. Default value: 0.
 - 1: Execute the configuration modification task within the maintenance window.
**Note**: Adjusting the number of nodes and shards is unsupported <b>within the maintenance window</b>.
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set Switch time for instance configuration modification.
 - 0: Execute the configuration modification task immediately after the adjustment is completed. Default value: 0.
 - 1: Execute the configuration modification task within the maintenance window.
**Note**: Adjusting the number of nodes and shards is unsupported <b>within the maintenance window</b>.
     * @param InMaintenance Switch time for instance configuration modification.
 - 0: Execute the configuration modification task immediately after the adjustment is completed. Default value: 0.
 - 1: Execute the configuration modification task within the maintenance window.
**Note**: Adjusting the number of nodes and shards is unsupported <b>within the maintenance window</b>.
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    /**
     * Get Mongos node memory size after the sharded cluster instance configuration is modified. Unit: GB. 
     * @return MongosMemory Mongos node memory size after the sharded cluster instance configuration is modified. Unit: GB.
     */
    public String getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set Mongos node memory size after the sharded cluster instance configuration is modified. Unit: GB.
     * @param MongosMemory Mongos node memory size after the sharded cluster instance configuration is modified. Unit: GB.
     */
    public void setMongosMemory(String MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get List of nodes to be added, containing the node type and AZ information. 
     * @return AddNodeList List of nodes to be added, containing the node type and AZ information.
     */
    public AddNodeList [] getAddNodeList() {
        return this.AddNodeList;
    }

    /**
     * Set List of nodes to be added, containing the node type and AZ information.
     * @param AddNodeList List of nodes to be added, containing the node type and AZ information.
     */
    public void setAddNodeList(AddNodeList [] AddNodeList) {
        this.AddNodeList = AddNodeList;
    }

    /**
     * Get List of nodes to be deleted. Note: According to the consistency principle for nodes of each shard on a sharded cluster instance, specify the nodes on shard 0 for node deletion from the sharded cluster instance. For example, cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard. 
     * @return RemoveNodeList List of nodes to be deleted. Note: According to the consistency principle for nodes of each shard on a sharded cluster instance, specify the nodes on shard 0 for node deletion from the sharded cluster instance. For example, cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.
     */
    public RemoveNodeList [] getRemoveNodeList() {
        return this.RemoveNodeList;
    }

    /**
     * Set List of nodes to be deleted. Note: According to the consistency principle for nodes of each shard on a sharded cluster instance, specify the nodes on shard 0 for node deletion from the sharded cluster instance. For example, cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.
     * @param RemoveNodeList List of nodes to be deleted. Note: According to the consistency principle for nodes of each shard on a sharded cluster instance, specify the nodes on shard 0 for node deletion from the sharded cluster instance. For example, cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.
     */
    public void setRemoveNodeList(RemoveNodeList [] RemoveNodeList) {
        this.RemoveNodeList = RemoveNodeList;
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
        if (source.MongosMemory != null) {
            this.MongosMemory = new String(source.MongosMemory);
        }
        if (source.AddNodeList != null) {
            this.AddNodeList = new AddNodeList[source.AddNodeList.length];
            for (int i = 0; i < source.AddNodeList.length; i++) {
                this.AddNodeList[i] = new AddNodeList(source.AddNodeList[i]);
            }
        }
        if (source.RemoveNodeList != null) {
            this.RemoveNodeList = new RemoveNodeList[source.RemoveNodeList.length];
            for (int i = 0; i < source.RemoveNodeList.length; i++) {
                this.RemoveNodeList[i] = new RemoveNodeList(source.RemoveNodeList[i]);
            }
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
        this.setParamSimple(map, prefix + "MongosMemory", this.MongosMemory);
        this.setParamArrayObj(map, prefix + "AddNodeList.", this.AddNodeList);
        this.setParamArrayObj(map, prefix + "RemoveNodeList.", this.RemoveNodeList);

    }
}

