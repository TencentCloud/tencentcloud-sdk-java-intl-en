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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClusterNodeListItem extends AbstractModel {

    /**
    * <p>Asset ID.</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>appid</p>
    */
    @SerializedName("AppID")
    @Expose
    private Long AppID;

    /**
    * <p>Node ID.</p>
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>Node name.</p>
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>Public ip address</p>
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * <p>Private ip</p>
    */
    @SerializedName("InternalIP")
    @Expose
    private String InternalIP;

    /**
    * <p>Node type</p>
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * <p>Number of cores.</p>
    */
    @SerializedName("CoresCount")
    @Expose
    private Long CoresCount;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * <p>Running state</p>
    */
    @SerializedName("RunStatus")
    @Expose
    private String RunStatus;

    /**
    * <p>Whether it is a new asset</p>
    */
    @SerializedName("IsNew")
    @Expose
    private Boolean IsNew;

    /**
    * <p>Unique ID of the node</p>
    */
    @SerializedName("UniqueID")
    @Expose
    private String UniqueID;

    /**
    * <p>Client status</p><p>Enumeration values:</p><ul><li>ONLINE: online</li><li>OFFLINE: offline</li><li>UNINSTALL: not installed</li></ul>
    */
    @SerializedName("ClientStatus")
    @Expose
    private String ClientStatus;

    /**
    * <p>Node instance ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Asset ID.</p> 
     * @return AssetId <p>Asset ID.</p>
     * @deprecated
     */
    @Deprecated
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset ID.</p>
     * @param AssetId <p>Asset ID.</p>
     * @deprecated
     */
    @Deprecated
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>appid</p> 
     * @return AppID <p>appid</p>
     */
    public Long getAppID() {
        return this.AppID;
    }

    /**
     * Set <p>appid</p>
     * @param AppID <p>appid</p>
     */
    public void setAppID(Long AppID) {
        this.AppID = AppID;
    }

    /**
     * Get <p>Node ID.</p> 
     * @return NodeId <p>Node ID.</p>
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>Node ID.</p>
     * @param NodeId <p>Node ID.</p>
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>Node name.</p> 
     * @return NodeName <p>Node name.</p>
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>Node name.</p>
     * @param NodeName <p>Node name.</p>
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>Public ip address</p> 
     * @return PublicIP <p>Public ip address</p>
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set <p>Public ip address</p>
     * @param PublicIP <p>Public ip address</p>
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get <p>Private ip</p> 
     * @return InternalIP <p>Private ip</p>
     */
    public String getInternalIP() {
        return this.InternalIP;
    }

    /**
     * Set <p>Private ip</p>
     * @param InternalIP <p>Private ip</p>
     */
    public void setInternalIP(String InternalIP) {
        this.InternalIP = InternalIP;
    }

    /**
     * Get <p>Node type</p> 
     * @return NodeType <p>Node type</p>
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>Node type</p>
     * @param NodeType <p>Node type</p>
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>Number of cores.</p> 
     * @return CoresCount <p>Number of cores.</p>
     */
    public Long getCoresCount() {
        return this.CoresCount;
    }

    /**
     * Set <p>Number of cores.</p>
     * @param CoresCount <p>Number of cores.</p>
     */
    public void setCoresCount(Long CoresCount) {
        this.CoresCount = CoresCount;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tags <p>Tag.</p>
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tags <p>Tag.</p>
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>Running state</p> 
     * @return RunStatus <p>Running state</p>
     */
    public String getRunStatus() {
        return this.RunStatus;
    }

    /**
     * Set <p>Running state</p>
     * @param RunStatus <p>Running state</p>
     */
    public void setRunStatus(String RunStatus) {
        this.RunStatus = RunStatus;
    }

    /**
     * Get <p>Whether it is a new asset</p> 
     * @return IsNew <p>Whether it is a new asset</p>
     */
    public Boolean getIsNew() {
        return this.IsNew;
    }

    /**
     * Set <p>Whether it is a new asset</p>
     * @param IsNew <p>Whether it is a new asset</p>
     */
    public void setIsNew(Boolean IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get <p>Unique ID of the node</p> 
     * @return UniqueID <p>Unique ID of the node</p>
     */
    public String getUniqueID() {
        return this.UniqueID;
    }

    /**
     * Set <p>Unique ID of the node</p>
     * @param UniqueID <p>Unique ID of the node</p>
     */
    public void setUniqueID(String UniqueID) {
        this.UniqueID = UniqueID;
    }

    /**
     * Get <p>Client status</p><p>Enumeration values:</p><ul><li>ONLINE: online</li><li>OFFLINE: offline</li><li>UNINSTALL: not installed</li></ul> 
     * @return ClientStatus <p>Client status</p><p>Enumeration values:</p><ul><li>ONLINE: online</li><li>OFFLINE: offline</li><li>UNINSTALL: not installed</li></ul>
     */
    public String getClientStatus() {
        return this.ClientStatus;
    }

    /**
     * Set <p>Client status</p><p>Enumeration values:</p><ul><li>ONLINE: online</li><li>OFFLINE: offline</li><li>UNINSTALL: not installed</li></ul>
     * @param ClientStatus <p>Client status</p><p>Enumeration values:</p><ul><li>ONLINE: online</li><li>OFFLINE: offline</li><li>UNINSTALL: not installed</li></ul>
     */
    public void setClientStatus(String ClientStatus) {
        this.ClientStatus = ClientStatus;
    }

    /**
     * Get <p>Node instance ID</p> 
     * @return InstanceId <p>Node instance ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Node instance ID</p>
     * @param InstanceId <p>Node instance ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ClusterNodeListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClusterNodeListItem(ClusterNodeListItem source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AppID != null) {
            this.AppID = new Long(source.AppID);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.InternalIP != null) {
            this.InternalIP = new String(source.InternalIP);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.CoresCount != null) {
            this.CoresCount = new Long(source.CoresCount);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.RunStatus != null) {
            this.RunStatus = new String(source.RunStatus);
        }
        if (source.IsNew != null) {
            this.IsNew = new Boolean(source.IsNew);
        }
        if (source.UniqueID != null) {
            this.UniqueID = new String(source.UniqueID);
        }
        if (source.ClientStatus != null) {
            this.ClientStatus = new String(source.ClientStatus);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "InternalIP", this.InternalIP);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "CoresCount", this.CoresCount);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RunStatus", this.RunStatus);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "UniqueID", this.UniqueID);
        this.setParamSimple(map, prefix + "ClientStatus", this.ClientStatus);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

