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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeView extends AbstractModel {

    /**
    * Node ID.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Node IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * Whether the node is visible
    */
    @SerializedName("Visible")
    @Expose
    private Float Visible;

    /**
    * Whether to fuse
    */
    @SerializedName("Break")
    @Expose
    private Float Break;

    /**
    * Total node disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Disk utilization rate
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * Node memory size (unit: GB)
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Memory usage rate
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * Number of CPUs on the node
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * CPU utilization
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
    * AZ.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Node role
    */
    @SerializedName("NodeRole")
    @Expose
    private String NodeRole;

    /**
    * Node HTTP IP
    */
    @SerializedName("NodeHttpIp")
    @Expose
    private String NodeHttpIp;

    /**
    * JVM memory usage rate
    */
    @SerializedName("JvmMemUsage")
    @Expose
    private Float JvmMemUsage;

    /**
    * Number of shards per node
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * Disk ID list on node
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Whether it is a hidden AZ
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
    * Whether to act as the coordination node role
    */
    @SerializedName("IsCoordinationNode")
    @Expose
    private Boolean IsCoordinationNode;

    /**
    * CVM running state
    */
    @SerializedName("CVMStatus")
    @Expose
    private String CVMStatus;

    /**
    * id of the placement group bound to the cvm
    */
    @SerializedName("CVMDisasterRecoverGroupId")
    @Expose
    private String CVMDisasterRecoverGroupId;

    /**
    * Status of the placement group bound to the cvm. 2: Bound; 1: Binding; 0: Not enabled
    */
    @SerializedName("CVMDisasterRecoverGroupStatus")
    @Expose
    private Long CVMDisasterRecoverGroupStatus;

    /**
     * Get Node ID. 
     * @return NodeId Node ID.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID.
     * @param NodeId Node ID.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Node IP 
     * @return NodeIp Node IP
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set Node IP
     * @param NodeIp Node IP
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get Whether the node is visible 
     * @return Visible Whether the node is visible
     */
    public Float getVisible() {
        return this.Visible;
    }

    /**
     * Set Whether the node is visible
     * @param Visible Whether the node is visible
     */
    public void setVisible(Float Visible) {
        this.Visible = Visible;
    }

    /**
     * Get Whether to fuse 
     * @return Break Whether to fuse
     */
    public Float getBreak() {
        return this.Break;
    }

    /**
     * Set Whether to fuse
     * @param Break Whether to fuse
     */
    public void setBreak(Float Break) {
        this.Break = Break;
    }

    /**
     * Get Total node disk size 
     * @return DiskSize Total node disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Total node disk size
     * @param DiskSize Total node disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk utilization rate 
     * @return DiskUsage Disk utilization rate
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Disk utilization rate
     * @param DiskUsage Disk utilization rate
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Node memory size (unit: GB) 
     * @return MemSize Node memory size (unit: GB)
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Node memory size (unit: GB)
     * @param MemSize Node memory size (unit: GB)
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Memory usage rate 
     * @return MemUsage Memory usage rate
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set Memory usage rate
     * @param MemUsage Memory usage rate
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get Number of CPUs on the node 
     * @return CpuNum Number of CPUs on the node
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of CPUs on the node
     * @param CpuNum Number of CPUs on the node
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get CPU utilization 
     * @return CpuUsage CPU utilization
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set CPU utilization
     * @param CpuUsage CPU utilization
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get AZ. 
     * @return Zone AZ.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set AZ.
     * @param Zone AZ.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Node role 
     * @return NodeRole Node role
     */
    public String getNodeRole() {
        return this.NodeRole;
    }

    /**
     * Set Node role
     * @param NodeRole Node role
     */
    public void setNodeRole(String NodeRole) {
        this.NodeRole = NodeRole;
    }

    /**
     * Get Node HTTP IP 
     * @return NodeHttpIp Node HTTP IP
     */
    public String getNodeHttpIp() {
        return this.NodeHttpIp;
    }

    /**
     * Set Node HTTP IP
     * @param NodeHttpIp Node HTTP IP
     */
    public void setNodeHttpIp(String NodeHttpIp) {
        this.NodeHttpIp = NodeHttpIp;
    }

    /**
     * Get JVM memory usage rate 
     * @return JvmMemUsage JVM memory usage rate
     */
    public Float getJvmMemUsage() {
        return this.JvmMemUsage;
    }

    /**
     * Set JVM memory usage rate
     * @param JvmMemUsage JVM memory usage rate
     */
    public void setJvmMemUsage(Float JvmMemUsage) {
        this.JvmMemUsage = JvmMemUsage;
    }

    /**
     * Get Number of shards per node 
     * @return ShardNum Number of shards per node
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set Number of shards per node
     * @param ShardNum Number of shards per node
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get Disk ID list on node 
     * @return DiskIds Disk ID list on node
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set Disk ID list on node
     * @param DiskIds Disk ID list on node
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Whether it is a hidden AZ 
     * @return Hidden Whether it is a hidden AZ
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set Whether it is a hidden AZ
     * @param Hidden Whether it is a hidden AZ
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
    }

    /**
     * Get Whether to act as the coordination node role 
     * @return IsCoordinationNode Whether to act as the coordination node role
     */
    public Boolean getIsCoordinationNode() {
        return this.IsCoordinationNode;
    }

    /**
     * Set Whether to act as the coordination node role
     * @param IsCoordinationNode Whether to act as the coordination node role
     */
    public void setIsCoordinationNode(Boolean IsCoordinationNode) {
        this.IsCoordinationNode = IsCoordinationNode;
    }

    /**
     * Get CVM running state 
     * @return CVMStatus CVM running state
     */
    public String getCVMStatus() {
        return this.CVMStatus;
    }

    /**
     * Set CVM running state
     * @param CVMStatus CVM running state
     */
    public void setCVMStatus(String CVMStatus) {
        this.CVMStatus = CVMStatus;
    }

    /**
     * Get id of the placement group bound to the cvm 
     * @return CVMDisasterRecoverGroupId id of the placement group bound to the cvm
     */
    public String getCVMDisasterRecoverGroupId() {
        return this.CVMDisasterRecoverGroupId;
    }

    /**
     * Set id of the placement group bound to the cvm
     * @param CVMDisasterRecoverGroupId id of the placement group bound to the cvm
     */
    public void setCVMDisasterRecoverGroupId(String CVMDisasterRecoverGroupId) {
        this.CVMDisasterRecoverGroupId = CVMDisasterRecoverGroupId;
    }

    /**
     * Get Status of the placement group bound to the cvm. 2: Bound; 1: Binding; 0: Not enabled 
     * @return CVMDisasterRecoverGroupStatus Status of the placement group bound to the cvm. 2: Bound; 1: Binding; 0: Not enabled
     */
    public Long getCVMDisasterRecoverGroupStatus() {
        return this.CVMDisasterRecoverGroupStatus;
    }

    /**
     * Set Status of the placement group bound to the cvm. 2: Bound; 1: Binding; 0: Not enabled
     * @param CVMDisasterRecoverGroupStatus Status of the placement group bound to the cvm. 2: Bound; 1: Binding; 0: Not enabled
     */
    public void setCVMDisasterRecoverGroupStatus(Long CVMDisasterRecoverGroupStatus) {
        this.CVMDisasterRecoverGroupStatus = CVMDisasterRecoverGroupStatus;
    }

    public NodeView() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeView(NodeView source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.Visible != null) {
            this.Visible = new Float(source.Visible);
        }
        if (source.Break != null) {
            this.Break = new Float(source.Break);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.DiskUsage != null) {
            this.DiskUsage = new Float(source.DiskUsage);
        }
        if (source.MemSize != null) {
            this.MemSize = new Long(source.MemSize);
        }
        if (source.MemUsage != null) {
            this.MemUsage = new Float(source.MemUsage);
        }
        if (source.CpuNum != null) {
            this.CpuNum = new Long(source.CpuNum);
        }
        if (source.CpuUsage != null) {
            this.CpuUsage = new Float(source.CpuUsage);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.NodeRole != null) {
            this.NodeRole = new String(source.NodeRole);
        }
        if (source.NodeHttpIp != null) {
            this.NodeHttpIp = new String(source.NodeHttpIp);
        }
        if (source.JvmMemUsage != null) {
            this.JvmMemUsage = new Float(source.JvmMemUsage);
        }
        if (source.ShardNum != null) {
            this.ShardNum = new Long(source.ShardNum);
        }
        if (source.DiskIds != null) {
            this.DiskIds = new String[source.DiskIds.length];
            for (int i = 0; i < source.DiskIds.length; i++) {
                this.DiskIds[i] = new String(source.DiskIds[i]);
            }
        }
        if (source.Hidden != null) {
            this.Hidden = new Boolean(source.Hidden);
        }
        if (source.IsCoordinationNode != null) {
            this.IsCoordinationNode = new Boolean(source.IsCoordinationNode);
        }
        if (source.CVMStatus != null) {
            this.CVMStatus = new String(source.CVMStatus);
        }
        if (source.CVMDisasterRecoverGroupId != null) {
            this.CVMDisasterRecoverGroupId = new String(source.CVMDisasterRecoverGroupId);
        }
        if (source.CVMDisasterRecoverGroupStatus != null) {
            this.CVMDisasterRecoverGroupStatus = new Long(source.CVMDisasterRecoverGroupStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "Visible", this.Visible);
        this.setParamSimple(map, prefix + "Break", this.Break);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "MemSize", this.MemSize);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "CpuNum", this.CpuNum);
        this.setParamSimple(map, prefix + "CpuUsage", this.CpuUsage);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "NodeRole", this.NodeRole);
        this.setParamSimple(map, prefix + "NodeHttpIp", this.NodeHttpIp);
        this.setParamSimple(map, prefix + "JvmMemUsage", this.JvmMemUsage);
        this.setParamSimple(map, prefix + "ShardNum", this.ShardNum);
        this.setParamArraySimple(map, prefix + "DiskIds.", this.DiskIds);
        this.setParamSimple(map, prefix + "Hidden", this.Hidden);
        this.setParamSimple(map, prefix + "IsCoordinationNode", this.IsCoordinationNode);
        this.setParamSimple(map, prefix + "CVMStatus", this.CVMStatus);
        this.setParamSimple(map, prefix + "CVMDisasterRecoverGroupId", this.CVMDisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "CVMDisasterRecoverGroupStatus", this.CVMDisasterRecoverGroupStatus);

    }
}

