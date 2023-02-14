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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DidCluster extends AbstractModel{

    /**
    * The chain ID.
    */
    @SerializedName("ChainId")
    @Expose
    private Long ChainId;

    /**
    * The chain name.
    */
    @SerializedName("ChainName")
    @Expose
    private String ChainName;

    /**
    * The number of organizations.
    */
    @SerializedName("AgencyCount")
    @Expose
    private Long AgencyCount;

    /**
    * The consortium ID.
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
    * The creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * The expiration time.
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * The network status.
    */
    @SerializedName("ChainStatus")
    @Expose
    private Long ChainStatus;

    /**
    * The resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * The network ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * The consortium name.
    */
    @SerializedName("ConsortiumName")
    @Expose
    private String ConsortiumName;

    /**
    * The organization ID.
    */
    @SerializedName("AgencyId")
    @Expose
    private Long AgencyId;

    /**
    * Whether auto-renewal is enabled.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * The total number of network nodes.
    */
    @SerializedName("TotalNetworkNode")
    @Expose
    private Long TotalNetworkNode;

    /**
    * The number of nodes of the current organization.
    */
    @SerializedName("TotalCreateNode")
    @Expose
    private Long TotalCreateNode;

    /**
    * The total number of groups.
    */
    @SerializedName("TotalGroups")
    @Expose
    private Long TotalGroups;

    /**
    * The total number of DIDs.
    */
    @SerializedName("DidCount")
    @Expose
    private Long DidCount;

    /**
     * Get The chain ID. 
     * @return ChainId The chain ID.
     */
    public Long getChainId() {
        return this.ChainId;
    }

    /**
     * Set The chain ID.
     * @param ChainId The chain ID.
     */
    public void setChainId(Long ChainId) {
        this.ChainId = ChainId;
    }

    /**
     * Get The chain name. 
     * @return ChainName The chain name.
     */
    public String getChainName() {
        return this.ChainName;
    }

    /**
     * Set The chain name.
     * @param ChainName The chain name.
     */
    public void setChainName(String ChainName) {
        this.ChainName = ChainName;
    }

    /**
     * Get The number of organizations. 
     * @return AgencyCount The number of organizations.
     */
    public Long getAgencyCount() {
        return this.AgencyCount;
    }

    /**
     * Set The number of organizations.
     * @param AgencyCount The number of organizations.
     */
    public void setAgencyCount(Long AgencyCount) {
        this.AgencyCount = AgencyCount;
    }

    /**
     * Get The consortium ID. 
     * @return ConsortiumId The consortium ID.
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set The consortium ID.
     * @param ConsortiumId The consortium ID.
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    /**
     * Get The creation time. 
     * @return CreateTime The creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set The creation time.
     * @param CreateTime The creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get The expiration time. 
     * @return ExpireTime The expiration time.
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set The expiration time.
     * @param ExpireTime The expiration time.
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get The network status. 
     * @return ChainStatus The network status.
     */
    public Long getChainStatus() {
        return this.ChainStatus;
    }

    /**
     * Set The network status.
     * @param ChainStatus The network status.
     */
    public void setChainStatus(Long ChainStatus) {
        this.ChainStatus = ChainStatus;
    }

    /**
     * Get The resource ID. 
     * @return ResourceId The resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set The resource ID.
     * @param ResourceId The resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get The network ID. 
     * @return ClusterId The network ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set The network ID.
     * @param ClusterId The network ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get The consortium name. 
     * @return ConsortiumName The consortium name.
     */
    public String getConsortiumName() {
        return this.ConsortiumName;
    }

    /**
     * Set The consortium name.
     * @param ConsortiumName The consortium name.
     */
    public void setConsortiumName(String ConsortiumName) {
        this.ConsortiumName = ConsortiumName;
    }

    /**
     * Get The organization ID. 
     * @return AgencyId The organization ID.
     */
    public Long getAgencyId() {
        return this.AgencyId;
    }

    /**
     * Set The organization ID.
     * @param AgencyId The organization ID.
     */
    public void setAgencyId(Long AgencyId) {
        this.AgencyId = AgencyId;
    }

    /**
     * Get Whether auto-renewal is enabled. 
     * @return AutoRenewFlag Whether auto-renewal is enabled.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Whether auto-renewal is enabled.
     * @param AutoRenewFlag Whether auto-renewal is enabled.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get The total number of network nodes. 
     * @return TotalNetworkNode The total number of network nodes.
     */
    public Long getTotalNetworkNode() {
        return this.TotalNetworkNode;
    }

    /**
     * Set The total number of network nodes.
     * @param TotalNetworkNode The total number of network nodes.
     */
    public void setTotalNetworkNode(Long TotalNetworkNode) {
        this.TotalNetworkNode = TotalNetworkNode;
    }

    /**
     * Get The number of nodes of the current organization. 
     * @return TotalCreateNode The number of nodes of the current organization.
     */
    public Long getTotalCreateNode() {
        return this.TotalCreateNode;
    }

    /**
     * Set The number of nodes of the current organization.
     * @param TotalCreateNode The number of nodes of the current organization.
     */
    public void setTotalCreateNode(Long TotalCreateNode) {
        this.TotalCreateNode = TotalCreateNode;
    }

    /**
     * Get The total number of groups. 
     * @return TotalGroups The total number of groups.
     */
    public Long getTotalGroups() {
        return this.TotalGroups;
    }

    /**
     * Set The total number of groups.
     * @param TotalGroups The total number of groups.
     */
    public void setTotalGroups(Long TotalGroups) {
        this.TotalGroups = TotalGroups;
    }

    /**
     * Get The total number of DIDs. 
     * @return DidCount The total number of DIDs.
     */
    public Long getDidCount() {
        return this.DidCount;
    }

    /**
     * Set The total number of DIDs.
     * @param DidCount The total number of DIDs.
     */
    public void setDidCount(Long DidCount) {
        this.DidCount = DidCount;
    }

    public DidCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DidCluster(DidCluster source) {
        if (source.ChainId != null) {
            this.ChainId = new Long(source.ChainId);
        }
        if (source.ChainName != null) {
            this.ChainName = new String(source.ChainName);
        }
        if (source.AgencyCount != null) {
            this.AgencyCount = new Long(source.AgencyCount);
        }
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ChainStatus != null) {
            this.ChainStatus = new Long(source.ChainStatus);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ConsortiumName != null) {
            this.ConsortiumName = new String(source.ConsortiumName);
        }
        if (source.AgencyId != null) {
            this.AgencyId = new Long(source.AgencyId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.TotalNetworkNode != null) {
            this.TotalNetworkNode = new Long(source.TotalNetworkNode);
        }
        if (source.TotalCreateNode != null) {
            this.TotalCreateNode = new Long(source.TotalCreateNode);
        }
        if (source.TotalGroups != null) {
            this.TotalGroups = new Long(source.TotalGroups);
        }
        if (source.DidCount != null) {
            this.DidCount = new Long(source.DidCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ChainId", this.ChainId);
        this.setParamSimple(map, prefix + "ChainName", this.ChainName);
        this.setParamSimple(map, prefix + "AgencyCount", this.AgencyCount);
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ChainStatus", this.ChainStatus);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ConsortiumName", this.ConsortiumName);
        this.setParamSimple(map, prefix + "AgencyId", this.AgencyId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "TotalNetworkNode", this.TotalNetworkNode);
        this.setParamSimple(map, prefix + "TotalCreateNode", this.TotalCreateNode);
        this.setParamSimple(map, prefix + "TotalGroups", this.TotalGroups);
        this.setParamSimple(map, prefix + "DidCount", this.DidCount);

    }
}

