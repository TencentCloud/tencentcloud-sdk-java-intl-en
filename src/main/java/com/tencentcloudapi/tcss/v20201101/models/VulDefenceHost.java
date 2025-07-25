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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulDefenceHost extends AbstractModel {

    /**
    * General node/Super node name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Server IP, which is the private IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Node QUuid/Super node ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Public IP
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * First enablement time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Update time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Node type. Values: `NORMAL` (general node), `SUPER` (super node).
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Super node subnet name
    */
    @SerializedName("NodeSubNetName")
    @Expose
    private String NodeSubNetName;

    /**
    * Super node subnet IP range
    */
    @SerializedName("NodeSubNetCIDR")
    @Expose
    private String NodeSubNetCIDR;

    /**
    * Super node subnet ID
    */
    @SerializedName("NodeSubNetID")
    @Expose
    private String NodeSubNetID;

    /**
    * UID of a super node
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
    * ID of a super node
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Pod IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
     * Get General node/Super node name 
     * @return HostName General node/Super node name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set General node/Super node name
     * @param HostName General node/Super node name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Server IP, which is the private IP 
     * @return HostIP Server IP, which is the private IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP, which is the private IP
     * @param HostIP Server IP, which is the private IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Node QUuid/Super node ID 
     * @return HostID Node QUuid/Super node ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Node QUuid/Super node ID
     * @param HostID Node QUuid/Super node ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended). 
     * @return Status Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
     * @param Status Plugin status. Valid values: `SUCCESS` (normal); `FAIL` (abnormal); `NO_DEFENDED` (not defended).
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Public IP 
     * @return PublicIP Public IP
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP
     * @param PublicIP Public IP
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get First enablement time 
     * @return CreateTime First enablement time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First enablement time
     * @param CreateTime First enablement time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Update time 
     * @return ModifyTime Update time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Update time
     * @param ModifyTime Update time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Node type. Values: `NORMAL` (general node), `SUPER` (super node). 
     * @return NodeType Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     * @param NodeType Node type. Values: `NORMAL` (general node), `SUPER` (super node).
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Super node subnet name 
     * @return NodeSubNetName Super node subnet name
     */
    public String getNodeSubNetName() {
        return this.NodeSubNetName;
    }

    /**
     * Set Super node subnet name
     * @param NodeSubNetName Super node subnet name
     */
    public void setNodeSubNetName(String NodeSubNetName) {
        this.NodeSubNetName = NodeSubNetName;
    }

    /**
     * Get Super node subnet IP range 
     * @return NodeSubNetCIDR Super node subnet IP range
     */
    public String getNodeSubNetCIDR() {
        return this.NodeSubNetCIDR;
    }

    /**
     * Set Super node subnet IP range
     * @param NodeSubNetCIDR Super node subnet IP range
     */
    public void setNodeSubNetCIDR(String NodeSubNetCIDR) {
        this.NodeSubNetCIDR = NodeSubNetCIDR;
    }

    /**
     * Get Super node subnet ID 
     * @return NodeSubNetID Super node subnet ID
     */
    public String getNodeSubNetID() {
        return this.NodeSubNetID;
    }

    /**
     * Set Super node subnet ID
     * @param NodeSubNetID Super node subnet ID
     */
    public void setNodeSubNetID(String NodeSubNetID) {
        this.NodeSubNetID = NodeSubNetID;
    }

    /**
     * Get UID of a super node 
     * @return NodeUniqueID UID of a super node
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set UID of a super node
     * @param NodeUniqueID UID of a super node
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    /**
     * Get ID of a super node 
     * @return NodeID ID of a super node
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set ID of a super node
     * @param NodeID ID of a super node
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Pod IP 
     * @return PodIP Pod IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod IP
     * @param PodIP Pod IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Pod name 
     * @return PodName Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
     * @param PodName Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    public VulDefenceHost() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulDefenceHost(VulDefenceHost source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeSubNetName != null) {
            this.NodeSubNetName = new String(source.NodeSubNetName);
        }
        if (source.NodeSubNetCIDR != null) {
            this.NodeSubNetCIDR = new String(source.NodeSubNetCIDR);
        }
        if (source.NodeSubNetID != null) {
            this.NodeSubNetID = new String(source.NodeSubNetID);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeSubNetName", this.NodeSubNetName);
        this.setParamSimple(map, prefix + "NodeSubNetCIDR", this.NodeSubNetCIDR);
        this.setParamSimple(map, prefix + "NodeSubNetID", this.NodeSubNetID);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);

    }
}

