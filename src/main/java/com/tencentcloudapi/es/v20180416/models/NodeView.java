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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeView extends AbstractModel{

    /**
    * Node ID
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
    * Whether the node encounters circuit breaking
    */
    @SerializedName("Break")
    @Expose
    private Float Break;

    /**
    * Node disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Disk usage
    */
    @SerializedName("DiskUsage")
    @Expose
    private Float DiskUsage;

    /**
    * Node memory size (in GB)
    */
    @SerializedName("MemSize")
    @Expose
    private Long MemSize;

    /**
    * Memory usage
    */
    @SerializedName("MemUsage")
    @Expose
    private Float MemUsage;

    /**
    * Number of node CPUs
    */
    @SerializedName("CpuNum")
    @Expose
    private Long CpuNum;

    /**
    * CPU usage
    */
    @SerializedName("CpuUsage")
    @Expose
    private Float CpuUsage;

    /**
    * Availability zone
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
    * JVM memory usage
    */
    @SerializedName("JvmMemUsage")
    @Expose
    private Float JvmMemUsage;

    /**
    * Number of node shards
    */
    @SerializedName("ShardNum")
    @Expose
    private Long ShardNum;

    /**
    * ID list of node disks
    */
    @SerializedName("DiskIds")
    @Expose
    private String [] DiskIds;

    /**
    * Whether a hidden availability zone
    */
    @SerializedName("Hidden")
    @Expose
    private Boolean Hidden;

    /**
     * Get Node ID 
     * @return NodeId Node ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID
     * @param NodeId Node ID
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
     * Get Whether the node encounters circuit breaking 
     * @return Break Whether the node encounters circuit breaking
     */
    public Float getBreak() {
        return this.Break;
    }

    /**
     * Set Whether the node encounters circuit breaking
     * @param Break Whether the node encounters circuit breaking
     */
    public void setBreak(Float Break) {
        this.Break = Break;
    }

    /**
     * Get Node disk size 
     * @return DiskSize Node disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Node disk size
     * @param DiskSize Node disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Disk usage 
     * @return DiskUsage Disk usage
     */
    public Float getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * Set Disk usage
     * @param DiskUsage Disk usage
     */
    public void setDiskUsage(Float DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * Get Node memory size (in GB) 
     * @return MemSize Node memory size (in GB)
     */
    public Long getMemSize() {
        return this.MemSize;
    }

    /**
     * Set Node memory size (in GB)
     * @param MemSize Node memory size (in GB)
     */
    public void setMemSize(Long MemSize) {
        this.MemSize = MemSize;
    }

    /**
     * Get Memory usage 
     * @return MemUsage Memory usage
     */
    public Float getMemUsage() {
        return this.MemUsage;
    }

    /**
     * Set Memory usage
     * @param MemUsage Memory usage
     */
    public void setMemUsage(Float MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * Get Number of node CPUs 
     * @return CpuNum Number of node CPUs
     */
    public Long getCpuNum() {
        return this.CpuNum;
    }

    /**
     * Set Number of node CPUs
     * @param CpuNum Number of node CPUs
     */
    public void setCpuNum(Long CpuNum) {
        this.CpuNum = CpuNum;
    }

    /**
     * Get CPU usage 
     * @return CpuUsage CPU usage
     */
    public Float getCpuUsage() {
        return this.CpuUsage;
    }

    /**
     * Set CPU usage
     * @param CpuUsage CPU usage
     */
    public void setCpuUsage(Float CpuUsage) {
        this.CpuUsage = CpuUsage;
    }

    /**
     * Get Availability zone 
     * @return Zone Availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone
     * @param Zone Availability zone
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
     * Get JVM memory usage 
     * @return JvmMemUsage JVM memory usage
     */
    public Float getJvmMemUsage() {
        return this.JvmMemUsage;
    }

    /**
     * Set JVM memory usage
     * @param JvmMemUsage JVM memory usage
     */
    public void setJvmMemUsage(Float JvmMemUsage) {
        this.JvmMemUsage = JvmMemUsage;
    }

    /**
     * Get Number of node shards 
     * @return ShardNum Number of node shards
     */
    public Long getShardNum() {
        return this.ShardNum;
    }

    /**
     * Set Number of node shards
     * @param ShardNum Number of node shards
     */
    public void setShardNum(Long ShardNum) {
        this.ShardNum = ShardNum;
    }

    /**
     * Get ID list of node disks 
     * @return DiskIds ID list of node disks
     */
    public String [] getDiskIds() {
        return this.DiskIds;
    }

    /**
     * Set ID list of node disks
     * @param DiskIds ID list of node disks
     */
    public void setDiskIds(String [] DiskIds) {
        this.DiskIds = DiskIds;
    }

    /**
     * Get Whether a hidden availability zone 
     * @return Hidden Whether a hidden availability zone
     */
    public Boolean getHidden() {
        return this.Hidden;
    }

    /**
     * Set Whether a hidden availability zone
     * @param Hidden Whether a hidden availability zone
     */
    public void setHidden(Boolean Hidden) {
        this.Hidden = Hidden;
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

    }
}

