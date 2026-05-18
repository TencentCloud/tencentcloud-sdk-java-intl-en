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
    * <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Memory size after instance configuration modification. Unit: GB. The current instance memory size is used by default if this parameter is left blank. For supported memory specifications, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specifications</a>.<br><strong>Note</strong>: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>Hard disk size after instance configuration modification. Unit: GB. The current instance disk size is used by default if this parameter is left blank. For supported disk capacity, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p><ul><li>Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified simultaneously.</li><li>When downgrading, the disk capacity after modification must be greater than 1.2 times the used disk capacity.</li></ul>
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * <p>(Abandoned) Please use the standalone ResizeOplog API to complete.</p><p>Oplog size after instance configuration change.</p><ul><li>Unit: GB.</li><li>Default oplog capacity used is 10% of disk space. The system allows oplog capacity settings ranging from 10% to 90% of disk space.</li></ul>
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
    * <p>Number of mongod nodes after instance change (excluding read-only nodes).</p><ul><li>Replica set node count: Use the MinNodeNum and MaxNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.</li><li>Number of shard nodes in a sharded cluster: Use the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.<br><strong>Note</strong>: When modifying the CPU or memory specifications of mongod or mongos, you may not configure this parameter or enter the current number of mongod or mongos nodes (excluding read-only nodes).</li></ul>
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * <p>Number of shards after instance change.</p><ul><li>The value range for the number of instance shards can be obtained through the response parameters <strong>MinReplicateSetNum</strong> and <strong>MaxReplicateSetNum</strong> of the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API.</li><li>Only allow adding shards, not reducing them.</li></ul>
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Long ReplicateSetNum;

    /**
    * <p>Switch time for instance configuration change.</p><ul><li>0: Immediately execute the configuration modification task upon completion of adjustment. Default is 0.</li><li>1: Execute the configuration modification task within the maintenance window.<br><strong>Note</strong>: Adjusting the number of nodes and shard quantity is unsupported within the <b>maintenance window</b>.</li></ul>
    */
    @SerializedName("InMaintenance")
    @Expose
    private Long InMaintenance;

    /**
    * <p>Memory size of mongos after sharding instance configuration change. Unit: GB. For instance support specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p>
    */
    @SerializedName("MongosMemory")
    @Expose
    private String MongosMemory;

    /**
    * <p>List of nodes to be added, containing the node type and AZ information.</p>
    */
    @SerializedName("AddNodeList")
    @Expose
    private AddNodeList [] AddNodeList;

    /**
    * <p>Delete node list.<br><strong>Note</strong>: Based on the consistency principle of sharded instance nodes, when deleting shard instance nodes, only need to specify the node corresponding to shard 0, for example: cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.</p>
    */
    @SerializedName("RemoveNodeList")
    @Expose
    private RemoveNodeList [] RemoveNodeList;

    /**
    * <p>CPU size after instance configuration changes. Unit: C. If empty, the default value is the current CPU size of the instance. For currently supported CPU specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">Product Specifications</a>.</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * <p>The product specification type after instance configuration change. If empty, the default value is the current instance product specification type.<br>Currently supported product specification types are as follows:<br>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud Disk Edition).</li></ul><p>Note:</p><ol><li>Allowlist specification types are controlled by allowlist. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</li><li>Common I cannot be changed to allowlist specification types.</li></ol>
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
     * Get <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Instance ID. Log in to the <a href="https://console.cloud.tencent.com/mongodb">MongoDB console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Memory size after instance configuration modification. Unit: GB. The current instance memory size is used by default if this parameter is left blank. For supported memory specifications, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specifications</a>.<br><strong>Note</strong>: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.</p> 
     * @return Memory <p>Memory size after instance configuration modification. Unit: GB. The current instance memory size is used by default if this parameter is left blank. For supported memory specifications, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specifications</a>.<br><strong>Note</strong>: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>Memory size after instance configuration modification. Unit: GB. The current instance memory size is used by default if this parameter is left blank. For supported memory specifications, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specifications</a>.<br><strong>Note</strong>: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.</p>
     * @param Memory <p>Memory size after instance configuration modification. Unit: GB. The current instance memory size is used by default if this parameter is left blank. For supported memory specifications, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specifications</a>.<br><strong>Note</strong>: Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified at the same time.</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>Hard disk size after instance configuration modification. Unit: GB. The current instance disk size is used by default if this parameter is left blank. For supported disk capacity, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p><ul><li>Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified simultaneously.</li><li>When downgrading, the disk capacity after modification must be greater than 1.2 times the used disk capacity.</li></ul> 
     * @return Volume <p>Hard disk size after instance configuration modification. Unit: GB. The current instance disk size is used by default if this parameter is left blank. For supported disk capacity, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p><ul><li>Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified simultaneously.</li><li>When downgrading, the disk capacity after modification must be greater than 1.2 times the used disk capacity.</li></ul>
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set <p>Hard disk size after instance configuration modification. Unit: GB. The current instance disk size is used by default if this parameter is left blank. For supported disk capacity, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p><ul><li>Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified simultaneously.</li><li>When downgrading, the disk capacity after modification must be greater than 1.2 times the used disk capacity.</li></ul>
     * @param Volume <p>Hard disk size after instance configuration modification. Unit: GB. The current instance disk size is used by default if this parameter is left blank. For supported disk capacity, please refer to <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p><ul><li>Memory and disk configurations should be upgraded or downgraded at the same time, meaning that Memory and Volume should be modified simultaneously.</li><li>When downgrading, the disk capacity after modification must be greater than 1.2 times the used disk capacity.</li></ul>
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get <p>(Abandoned) Please use the standalone ResizeOplog API to complete.</p><p>Oplog size after instance configuration change.</p><ul><li>Unit: GB.</li><li>Default oplog capacity used is 10% of disk space. The system allows oplog capacity settings ranging from 10% to 90% of disk space.</li></ul> 
     * @return OplogSize <p>(Abandoned) Please use the standalone ResizeOplog API to complete.</p><p>Oplog size after instance configuration change.</p><ul><li>Unit: GB.</li><li>Default oplog capacity used is 10% of disk space. The system allows oplog capacity settings ranging from 10% to 90% of disk space.</li></ul>
     * @deprecated
     */
    @Deprecated
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set <p>(Abandoned) Please use the standalone ResizeOplog API to complete.</p><p>Oplog size after instance configuration change.</p><ul><li>Unit: GB.</li><li>Default oplog capacity used is 10% of disk space. The system allows oplog capacity settings ranging from 10% to 90% of disk space.</li></ul>
     * @param OplogSize <p>(Abandoned) Please use the standalone ResizeOplog API to complete.</p><p>Oplog size after instance configuration change.</p><ul><li>Unit: GB.</li><li>Default oplog capacity used is 10% of disk space. The system allows oplog capacity settings ranging from 10% to 90% of disk space.</li></ul>
     * @deprecated
     */
    @Deprecated
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * Get <p>Number of mongod nodes after instance change (excluding read-only nodes).</p><ul><li>Replica set node count: Use the MinNodeNum and MaxNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.</li><li>Number of shard nodes in a sharded cluster: Use the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.<br><strong>Note</strong>: When modifying the CPU or memory specifications of mongod or mongos, you may not configure this parameter or enter the current number of mongod or mongos nodes (excluding read-only nodes).</li></ul> 
     * @return NodeNum <p>Number of mongod nodes after instance change (excluding read-only nodes).</p><ul><li>Replica set node count: Use the MinNodeNum and MaxNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.</li><li>Number of shard nodes in a sharded cluster: Use the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.<br><strong>Note</strong>: When modifying the CPU or memory specifications of mongod or mongos, you may not configure this parameter or enter the current number of mongod or mongos nodes (excluding read-only nodes).</li></ul>
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set <p>Number of mongod nodes after instance change (excluding read-only nodes).</p><ul><li>Replica set node count: Use the MinNodeNum and MaxNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.</li><li>Number of shard nodes in a sharded cluster: Use the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.<br><strong>Note</strong>: When modifying the CPU or memory specifications of mongod or mongos, you may not configure this parameter or enter the current number of mongod or mongos nodes (excluding read-only nodes).</li></ul>
     * @param NodeNum <p>Number of mongod nodes after instance change (excluding read-only nodes).</p><ul><li>Replica set node count: Use the MinNodeNum and MaxNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.</li><li>Number of shard nodes in a sharded cluster: Use the MinReplicateSetNodeNum and MaxReplicateSetNodeNum parameters in the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API response to obtain the node count range.<br><strong>Note</strong>: When modifying the CPU or memory specifications of mongod or mongos, you may not configure this parameter or enter the current number of mongod or mongos nodes (excluding read-only nodes).</li></ul>
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get <p>Number of shards after instance change.</p><ul><li>The value range for the number of instance shards can be obtained through the response parameters <strong>MinReplicateSetNum</strong> and <strong>MaxReplicateSetNum</strong> of the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API.</li><li>Only allow adding shards, not reducing them.</li></ul> 
     * @return ReplicateSetNum <p>Number of shards after instance change.</p><ul><li>The value range for the number of instance shards can be obtained through the response parameters <strong>MinReplicateSetNum</strong> and <strong>MaxReplicateSetNum</strong> of the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API.</li><li>Only allow adding shards, not reducing them.</li></ul>
     */
    public Long getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * Set <p>Number of shards after instance change.</p><ul><li>The value range for the number of instance shards can be obtained through the response parameters <strong>MinReplicateSetNum</strong> and <strong>MaxReplicateSetNum</strong> of the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API.</li><li>Only allow adding shards, not reducing them.</li></ul>
     * @param ReplicateSetNum <p>Number of shards after instance change.</p><ul><li>The value range for the number of instance shards can be obtained through the response parameters <strong>MinReplicateSetNum</strong> and <strong>MaxReplicateSetNum</strong> of the <a href="https://www.tencentcloud.com/document/product/240/38567?from_cn_redirect=1">DescribeSpecInfo</a> API.</li><li>Only allow adding shards, not reducing them.</li></ul>
     */
    public void setReplicateSetNum(Long ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * Get <p>Switch time for instance configuration change.</p><ul><li>0: Immediately execute the configuration modification task upon completion of adjustment. Default is 0.</li><li>1: Execute the configuration modification task within the maintenance window.<br><strong>Note</strong>: Adjusting the number of nodes and shard quantity is unsupported within the <b>maintenance window</b>.</li></ul> 
     * @return InMaintenance <p>Switch time for instance configuration change.</p><ul><li>0: Immediately execute the configuration modification task upon completion of adjustment. Default is 0.</li><li>1: Execute the configuration modification task within the maintenance window.<br><strong>Note</strong>: Adjusting the number of nodes and shard quantity is unsupported within the <b>maintenance window</b>.</li></ul>
     */
    public Long getInMaintenance() {
        return this.InMaintenance;
    }

    /**
     * Set <p>Switch time for instance configuration change.</p><ul><li>0: Immediately execute the configuration modification task upon completion of adjustment. Default is 0.</li><li>1: Execute the configuration modification task within the maintenance window.<br><strong>Note</strong>: Adjusting the number of nodes and shard quantity is unsupported within the <b>maintenance window</b>.</li></ul>
     * @param InMaintenance <p>Switch time for instance configuration change.</p><ul><li>0: Immediately execute the configuration modification task upon completion of adjustment. Default is 0.</li><li>1: Execute the configuration modification task within the maintenance window.<br><strong>Note</strong>: Adjusting the number of nodes and shard quantity is unsupported within the <b>maintenance window</b>.</li></ul>
     */
    public void setInMaintenance(Long InMaintenance) {
        this.InMaintenance = InMaintenance;
    }

    /**
     * Get <p>Memory size of mongos after sharding instance configuration change. Unit: GB. For instance support specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p> 
     * @return MongosMemory <p>Memory size of mongos after sharding instance configuration change. Unit: GB. For instance support specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p>
     */
    public String getMongosMemory() {
        return this.MongosMemory;
    }

    /**
     * Set <p>Memory size of mongos after sharding instance configuration change. Unit: GB. For instance support specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p>
     * @param MongosMemory <p>Memory size of mongos after sharding instance configuration change. Unit: GB. For instance support specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">product specification</a>.</p>
     */
    public void setMongosMemory(String MongosMemory) {
        this.MongosMemory = MongosMemory;
    }

    /**
     * Get <p>List of nodes to be added, containing the node type and AZ information.</p> 
     * @return AddNodeList <p>List of nodes to be added, containing the node type and AZ information.</p>
     */
    public AddNodeList [] getAddNodeList() {
        return this.AddNodeList;
    }

    /**
     * Set <p>List of nodes to be added, containing the node type and AZ information.</p>
     * @param AddNodeList <p>List of nodes to be added, containing the node type and AZ information.</p>
     */
    public void setAddNodeList(AddNodeList [] AddNodeList) {
        this.AddNodeList = AddNodeList;
    }

    /**
     * Get <p>Delete node list.<br><strong>Note</strong>: Based on the consistency principle of sharded instance nodes, when deleting shard instance nodes, only need to specify the node corresponding to shard 0, for example: cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.</p> 
     * @return RemoveNodeList <p>Delete node list.<br><strong>Note</strong>: Based on the consistency principle of sharded instance nodes, when deleting shard instance nodes, only need to specify the node corresponding to shard 0, for example: cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.</p>
     */
    public RemoveNodeList [] getRemoveNodeList() {
        return this.RemoveNodeList;
    }

    /**
     * Set <p>Delete node list.<br><strong>Note</strong>: Based on the consistency principle of sharded instance nodes, when deleting shard instance nodes, only need to specify the node corresponding to shard 0, for example: cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.</p>
     * @param RemoveNodeList <p>Delete node list.<br><strong>Note</strong>: Based on the consistency principle of sharded instance nodes, when deleting shard instance nodes, only need to specify the node corresponding to shard 0, for example: cmgo-9nl1czif_0-node-readonly0 will delete the first read-only node of each shard.</p>
     */
    public void setRemoveNodeList(RemoveNodeList [] RemoveNodeList) {
        this.RemoveNodeList = RemoveNodeList;
    }

    /**
     * Get <p>CPU size after instance configuration changes. Unit: C. If empty, the default value is the current CPU size of the instance. For currently supported CPU specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">Product Specifications</a>.</p> 
     * @return Cpu <p>CPU size after instance configuration changes. Unit: C. If empty, the default value is the current CPU size of the instance. For currently supported CPU specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">Product Specifications</a>.</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>CPU size after instance configuration changes. Unit: C. If empty, the default value is the current CPU size of the instance. For currently supported CPU specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">Product Specifications</a>.</p>
     * @param Cpu <p>CPU size after instance configuration changes. Unit: C. If empty, the default value is the current CPU size of the instance. For currently supported CPU specifications, see <a href="https://www.tencentcloud.com/document/product/240/64125?from_cn_redirect=1">Product Specifications</a>.</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get <p>The product specification type after instance configuration change. If empty, the default value is the current instance product specification type.<br>Currently supported product specification types are as follows:<br>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud Disk Edition).</li></ul><p>Note:</p><ol><li>Allowlist specification types are controlled by allowlist. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</li><li>Common I cannot be changed to allowlist specification types.</li></ol> 
     * @return MachineCode <p>The product specification type after instance configuration change. If empty, the default value is the current instance product specification type.<br>Currently supported product specification types are as follows:<br>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud Disk Edition).</li></ul><p>Note:</p><ol><li>Allowlist specification types are controlled by allowlist. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</li><li>Common I cannot be changed to allowlist specification types.</li></ol>
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * Set <p>The product specification type after instance configuration change. If empty, the default value is the current instance product specification type.<br>Currently supported product specification types are as follows:<br>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud Disk Edition).</li></ul><p>Note:</p><ol><li>Allowlist specification types are controlled by allowlist. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</li><li>Common I cannot be changed to allowlist specification types.</li></ol>
     * @param MachineCode <p>The product specification type after instance configuration change. If empty, the default value is the current instance product specification type.<br>Currently supported product specification types are as follows:<br>Recommended product specification types:</p><ul><li>GE.LD.T1: Local disk (Common I).</li><li>GE.CD.T1: Cloud disk (Common I).</li></ul><p>Product allowlist specification types:</p><ul><li>HIO10G: Local disk (High IO 10G).</li><li>HCD: Cloud disk (Cloud Disk Edition).</li></ul><p>Note:</p><ol><li>Allowlist specification types are controlled by allowlist. If needed, <a href="https://console.cloud.tencent.com/workorder/category">submit a ticket</a> to apply.</li><li>Common I cannot be changed to allowlist specification types.</li></ol>
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
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
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.MachineCode != null) {
            this.MachineCode = new String(source.MachineCode);
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
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);

    }
}

