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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyGroupInfo extends AbstractModel{

    /**
    * Proxy group ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * Proxy version Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyVersion")
    @Expose
    private String ProxyVersion;

    /**
    * Supported proxy upgrade version Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportUpgradeProxyVersion")
    @Expose
    private String SupportUpgradeProxyVersion;

    /**
    * Proxy status Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Proxy task status Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskStatus")
    @Expose
    private String TaskStatus;

    /**
    * Node information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyNode")
    @Expose
    private ProxyNode [] ProxyNode;

    /**
    * Address information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProxyAddress")
    @Expose
    private ProxyAddress [] ProxyAddress;

    /**
    * Connection pool threshold Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConnectionPoolLimit")
    @Expose
    private Long ConnectionPoolLimit;

    /**
    * Whether to support address creation Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SupportCreateProxyAddress")
    @Expose
    private Boolean SupportCreateProxyAddress;

    /**
    * TencentDB versions supporting proxy versions upgrade Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get Proxy version Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyVersion Proxy version Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProxyVersion() {
        return this.ProxyVersion;
    }

    /**
     * Set Proxy version Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyVersion Proxy version Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyVersion(String ProxyVersion) {
        this.ProxyVersion = ProxyVersion;
    }

    /**
     * Get Supported proxy upgrade version Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportUpgradeProxyVersion Supported proxy upgrade version Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupportUpgradeProxyVersion() {
        return this.SupportUpgradeProxyVersion;
    }

    /**
     * Set Supported proxy upgrade version Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportUpgradeProxyVersion Supported proxy upgrade version Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportUpgradeProxyVersion(String SupportUpgradeProxyVersion) {
        this.SupportUpgradeProxyVersion = SupportUpgradeProxyVersion;
    }

    /**
     * Get Proxy status Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Status Proxy status Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Proxy status Note: This field may return null, indicating that no valid values can be obtained.
     * @param Status Proxy status Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Proxy task status Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskStatus Proxy task status Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTaskStatus() {
        return this.TaskStatus;
    }

    /**
     * Set Proxy task status Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskStatus Proxy task status Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskStatus(String TaskStatus) {
        this.TaskStatus = TaskStatus;
    }

    /**
     * Get Node information of the proxy group Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyNode Node information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProxyNode [] getProxyNode() {
        return this.ProxyNode;
    }

    /**
     * Set Node information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyNode Node information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyNode(ProxyNode [] ProxyNode) {
        this.ProxyNode = ProxyNode;
    }

    /**
     * Get Address information of the proxy group Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProxyAddress Address information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ProxyAddress [] getProxyAddress() {
        return this.ProxyAddress;
    }

    /**
     * Set Address information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProxyAddress Address information of the proxy group Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProxyAddress(ProxyAddress [] ProxyAddress) {
        this.ProxyAddress = ProxyAddress;
    }

    /**
     * Get Connection pool threshold Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConnectionPoolLimit Connection pool threshold Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getConnectionPoolLimit() {
        return this.ConnectionPoolLimit;
    }

    /**
     * Set Connection pool threshold Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConnectionPoolLimit Connection pool threshold Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConnectionPoolLimit(Long ConnectionPoolLimit) {
        this.ConnectionPoolLimit = ConnectionPoolLimit;
    }

    /**
     * Get Whether to support address creation Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportCreateProxyAddress Whether to support address creation Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getSupportCreateProxyAddress() {
        return this.SupportCreateProxyAddress;
    }

    /**
     * Set Whether to support address creation Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportCreateProxyAddress Whether to support address creation Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSupportCreateProxyAddress(Boolean SupportCreateProxyAddress) {
        this.SupportCreateProxyAddress = SupportCreateProxyAddress;
    }

    /**
     * Get TencentDB versions supporting proxy versions upgrade Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SupportUpgradeProxyMysqlVersion TencentDB versions supporting proxy versions upgrade Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSupportUpgradeProxyMysqlVersion() {
        return this.SupportUpgradeProxyMysqlVersion;
    }

    /**
     * Set TencentDB versions supporting proxy versions upgrade Note: This field may return null, indicating that no valid values can be obtained.
     * @param SupportUpgradeProxyMysqlVersion TencentDB versions supporting proxy versions upgrade Note: This field may return null, indicating that no valid values can be obtained.
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

