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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel {

    /**
    * Proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * proxy version
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * Proxy supports edition upgrade
    */
    @SerializedName("SupportUpgradeProxyVersion")
    @Expose
    private String SupportUpgradeProxyVersion;

    /**
    * Agent status. 0 - Initializing, 1 - Online, 2 - Online - Read-write separation, 3 - Offline, 4 - Terminated.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Agent task status, Upgrading - upgrading, UpgradeTo - upgrade pending switch, UpgradeSwitching - upgrade and switch in progress, ProxyCreateAddress - configuring address, ProxyModifyAddress - changing address, ProxyCloseAddress - closing address.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Proxy group node information
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNode [] ProxyNode;

    /**
    * Proxy group address information
    */
    @SerializedName("ProxyAddress")
    @Expose
    private ProxyAddress [] ProxyAddress;

    /**
    * Connection pool threshold
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
    * Support creating an address
    */
    @SerializedName("SupportCreateProxyAddress")
    @Expose
    private Boolean SupportCreateProxyAddress;

    /**
    * cdb version required for proxy version upgrade
    */
    @SerializedName("SupportUpgradeProxyMysqlVersion")
    @Expose
    private String SupportUpgradeProxyMysqlVersion;

    /**
     * Get Proxy group ID 
     * @return ProxyGroupId Proxy group ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set Proxy group ID
     * @param ProxyGroupId Proxy group ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get proxy version 
     * @return ProxyVersion proxy version
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set proxy version
     * @param ProxyVersion proxy version
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get Proxy supports edition upgrade 
     * @return SupportUpgradeProxyVersion Proxy supports edition upgrade
     */
    public String getSupportUpgradeProxyVersion() {
        return this.SupportUpgradeProxyVersion;
    }

    /**
     * Set Proxy supports edition upgrade
     * @param SupportUpgradeProxyVersion Proxy supports edition upgrade
     */
    public void setSupportUpgradeProxyVersion(String SupportUpgradeProxyVersion) {
        this.SupportUpgradeProxyVersion = SupportUpgradeProxyVersion;
    }

    /**
     * Get Agent status. 0 - Initializing, 1 - Online, 2 - Online - Read-write separation, 3 - Offline, 4 - Terminated. 
     * @return Status Agent status. 0 - Initializing, 1 - Online, 2 - Online - Read-write separation, 3 - Offline, 4 - Terminated.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Agent status. 0 - Initializing, 1 - Online, 2 - Online - Read-write separation, 3 - Offline, 4 - Terminated.
     * @param Status Agent status. 0 - Initializing, 1 - Online, 2 - Online - Read-write separation, 3 - Offline, 4 - Terminated.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Agent task status, Upgrading - upgrading, UpgradeTo - upgrade pending switch, UpgradeSwitching - upgrade and switch in progress, ProxyCreateAddress - configuring address, ProxyModifyAddress - changing address, ProxyCloseAddress - closing address. 
     * @return TaskStatus Agent task status, Upgrading - upgrading, UpgradeTo - upgrade pending switch, UpgradeSwitching - upgrade and switch in progress, ProxyCreateAddress - configuring address, ProxyModifyAddress - changing address, ProxyCloseAddress - closing address.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Agent task status, Upgrading - upgrading, UpgradeTo - upgrade pending switch, UpgradeSwitching - upgrade and switch in progress, ProxyCreateAddress - configuring address, ProxyModifyAddress - changing address, ProxyCloseAddress - closing address.
     * @param TaskStatus Agent task status, Upgrading - upgrading, UpgradeTo - upgrade pending switch, UpgradeSwitching - upgrade and switch in progress, ProxyCreateAddress - configuring address, ProxyModifyAddress - changing address, ProxyCloseAddress - closing address.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Proxy group node information 
     * @return ProxyNode Proxy group node information
     */
    public ProxyNode [] getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set Proxy group node information
     * @param ProxyNode Proxy group node information
     */
    public void setProxyNode(ProxyNode [] ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get Proxy group address information 
     * @return ProxyAddress Proxy group address information
     */
    public ProxyAddress [] getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set Proxy group address information
     * @param ProxyAddress Proxy group address information
     */
    public void setProxyAddress(ProxyAddress [] ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get Connection pool threshold 
     * @return ConnectionPoolLimit Connection pool threshold
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set Connection pool threshold
     * @param ConnectionPoolLimit Connection pool threshold
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    /**
     * Get Support creating an address 
     * @return SupportCreateProxyAddress Support creating an address
     */
    public Boolean getSupportCreateProxyAddress() {
        return this.SupportCreateProxyAddress;
    }

    /**
     * Set Support creating an address
     * @param SupportCreateProxyAddress Support creating an address
     */
    public void setSupportCreateProxyAddress(Boolean SupportCreateProxyAddress) {
        this.SupportCreateProxyAddress = SupportCreateProxyAddress;
    }

    /**
     * Get cdb version required for proxy version upgrade 
     * @return SupportUpgradeProxyMysqlVersion cdb version required for proxy version upgrade
     */
    public String getSupportUpgradeProxyMysqlVersion() {
        return this.SupportUpgradeProxyMysqlVersion;
    }

    /**
     * Set cdb version required for proxy version upgrade
     * @param SupportUpgradeProxyMysqlVersion cdb version required for proxy version upgrade
     */
    public void setSupportUpgradeProxyMysqlVersion(String SupportUpgradeProxyMysqlVersion) {
        this.SupportUpgradeProxyMysqlVersion = SupportUpgradeProxyMysqlVersion;
    }

    public ProxyGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyGroupInfo(ProxyGroupInfo source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.ProxyVersion != null) {
            this.ProxyVersion = new String(source.ProxyVersion);
        }
        if (source.SupportUpgradeProxyVersion != null) {
            this.SupportUpgradeProxyVersion = new String(source.SupportUpgradeProxyVersion);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TaskStatus != null) {
            this.TaskStatus = new String(source.TaskStatus);
        }
        if (source.ProxyNode != null) {
            this.ProxyNode = new ProxyNode[source.ProxyNode.length];
            for (int i = 0; i < source.ProxyNode.length; i++) {
                this.ProxyNode[i] = new ProxyNode(source.ProxyNode[i]);
            }
        }
        if (source.ProxyAddress != null) {
            this.ProxyAddress = new ProxyAddress[source.ProxyAddress.length];
            for (int i = 0; i < source.ProxyAddress.length; i++) {
                this.ProxyAddress[i] = new ProxyAddress(source.ProxyAddress[i]);
            }
        }
        if (source.ConnectionPoolLimit != null) {
            this.ConnectionPoolLimit = new Long(source.ConnectionPoolLimit);
        }
        if (source.SupportCreateProxyAddress != null) {
            this.SupportCreateProxyAddress = new Boolean(source.SupportCreateProxyAddress);
        }
        if (source.SupportUpgradeProxyMysqlVersion != null) {
            this.SupportUpgradeProxyMysqlVersion = new String(source.SupportUpgradeProxyMysqlVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "ProxyVersion", this.ProxyVersion);
        this.setParamSimple(map, prefix + "SupportUpgradeProxyVersion", this.SupportUpgradeProxyVersion);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TaskStatus", this.TaskStatus);
        this.setParamArrayObj(map, prefix + "ProxyNode.", this.ProxyNode);
        this.setParamArrayObj(map, prefix + "ProxyAddress.", this.ProxyAddress);
        this.setParamSimple(map, prefix + "ConnectionPoolLimit", this.ConnectionPoolLimit);
        this.setParamSimple(map, prefix + "SupportCreateProxyAddress", this.SupportCreateProxyAddress);
        this.setParamSimple(map, prefix + "SupportUpgradeProxyMysqlVersion", this.SupportUpgradeProxyMysqlVersion);

    }
}

