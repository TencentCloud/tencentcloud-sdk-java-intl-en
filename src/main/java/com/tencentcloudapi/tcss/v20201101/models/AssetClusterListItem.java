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

public class AssetClusterListItem extends AbstractModel {

    /**
    * <p>Cluster ID.</p>
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>Cluster name.</p>
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * <p>Cluster status<br>CSR_RUNNING: Running<br>CSR_EXCEPTION: Exception<br>CSR_DEL: Deleted</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>ID of the bound cluster</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BindRuleID")
    @Expose
    private String BindRuleID;

    /**
    * <p>Binding rule name</p>
    */
    @SerializedName("BindRuleName")
    @Expose
    private String BindRuleName;

    /**
    * <p>ClusterType:<br>CT_TKE: tke cluster;<br>CT_USER_CREATE: user-built cluster;<br>CT_TKE_SERVERLESS: TKE Serverless Cluster;</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>Cluster edition</p>
    */
    @SerializedName("ClusterVersion")
    @Expose
    private String ClusterVersion;

    /**
    * <p>Memory capacity</p>
    */
    @SerializedName("MemLimit")
    @Expose
    private Long MemLimit;

    /**
    * <p>cpu</p>
    */
    @SerializedName("CpuLimit")
    @Expose
    private Long CpuLimit;

    /**
    * <p>Cluster audit switch status:<br>Closed/Closing/CloseFailed/Opened/Opening/OpenFailed</p>
    */
    @SerializedName("ClusterAuditStatus")
    @Expose
    private String ClusterAuditStatus;

    /**
    * <p>Access status:<br>Not connected: AccessedNone<br>Defended: AccessedDefended<br>No protection: AccessedInstalled<br>Partial protection: AccessedPartialDefence<br>Access exception: AccessedException<br>Uninstallation exception: AccessedUninstallException<br>Accessing: AccessedInstalling<br>Uninstalling: AccessedUninstalling</p>
    */
    @SerializedName("AccessedStatus")
    @Expose
    private String AccessedStatus;

    /**
     * Get <p>Cluster ID.</p> 
     * @return ClusterID <p>Cluster ID.</p>
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>Cluster ID.</p>
     * @param ClusterID <p>Cluster ID.</p>
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>Cluster name.</p> 
     * @return ClusterName <p>Cluster name.</p>
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set <p>Cluster name.</p>
     * @param ClusterName <p>Cluster name.</p>
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get <p>Cluster status<br>CSR_RUNNING: Running<br>CSR_EXCEPTION: Exception<br>CSR_DEL: Deleted</p> 
     * @return Status <p>Cluster status<br>CSR_RUNNING: Running<br>CSR_EXCEPTION: Exception<br>CSR_DEL: Deleted</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Cluster status<br>CSR_RUNNING: Running<br>CSR_EXCEPTION: Exception<br>CSR_DEL: Deleted</p>
     * @param Status <p>Cluster status<br>CSR_RUNNING: Running<br>CSR_EXCEPTION: Exception<br>CSR_DEL: Deleted</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>ID of the bound cluster</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BindRuleID <p>ID of the bound cluster</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBindRuleID() {
        return this.BindRuleID;
    }

    /**
     * Set <p>ID of the bound cluster</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BindRuleID <p>ID of the bound cluster</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBindRuleID(String BindRuleID) {
        this.BindRuleID = BindRuleID;
    }

    /**
     * Get <p>Binding rule name</p> 
     * @return BindRuleName <p>Binding rule name</p>
     */
    public String getBindRuleName() {
        return this.BindRuleName;
    }

    /**
     * Set <p>Binding rule name</p>
     * @param BindRuleName <p>Binding rule name</p>
     */
    public void setBindRuleName(String BindRuleName) {
        this.BindRuleName = BindRuleName;
    }

    /**
     * Get <p>ClusterType:<br>CT_TKE: tke cluster;<br>CT_USER_CREATE: user-built cluster;<br>CT_TKE_SERVERLESS: TKE Serverless Cluster;</p> 
     * @return ClusterType <p>ClusterType:<br>CT_TKE: tke cluster;<br>CT_USER_CREATE: user-built cluster;<br>CT_TKE_SERVERLESS: TKE Serverless Cluster;</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>ClusterType:<br>CT_TKE: tke cluster;<br>CT_USER_CREATE: user-built cluster;<br>CT_TKE_SERVERLESS: TKE Serverless Cluster;</p>
     * @param ClusterType <p>ClusterType:<br>CT_TKE: tke cluster;<br>CT_USER_CREATE: user-built cluster;<br>CT_TKE_SERVERLESS: TKE Serverless Cluster;</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Cluster edition</p> 
     * @return ClusterVersion <p>Cluster edition</p>
     */
    public String getClusterVersion() {
        return this.ClusterVersion;
    }

    /**
     * Set <p>Cluster edition</p>
     * @param ClusterVersion <p>Cluster edition</p>
     */
    public void setClusterVersion(String ClusterVersion) {
        this.ClusterVersion = ClusterVersion;
    }

    /**
     * Get <p>Memory capacity</p> 
     * @return MemLimit <p>Memory capacity</p>
     */
    public Long getMemLimit() {
        return this.MemLimit;
    }

    /**
     * Set <p>Memory capacity</p>
     * @param MemLimit <p>Memory capacity</p>
     */
    public void setMemLimit(Long MemLimit) {
        this.MemLimit = MemLimit;
    }

    /**
     * Get <p>cpu</p> 
     * @return CpuLimit <p>cpu</p>
     */
    public Long getCpuLimit() {
        return this.CpuLimit;
    }

    /**
     * Set <p>cpu</p>
     * @param CpuLimit <p>cpu</p>
     */
    public void setCpuLimit(Long CpuLimit) {
        this.CpuLimit = CpuLimit;
    }

    /**
     * Get <p>Cluster audit switch status:<br>Closed/Closing/CloseFailed/Opened/Opening/OpenFailed</p> 
     * @return ClusterAuditStatus <p>Cluster audit switch status:<br>Closed/Closing/CloseFailed/Opened/Opening/OpenFailed</p>
     */
    public String getClusterAuditStatus() {
        return this.ClusterAuditStatus;
    }

    /**
     * Set <p>Cluster audit switch status:<br>Closed/Closing/CloseFailed/Opened/Opening/OpenFailed</p>
     * @param ClusterAuditStatus <p>Cluster audit switch status:<br>Closed/Closing/CloseFailed/Opened/Opening/OpenFailed</p>
     */
    public void setClusterAuditStatus(String ClusterAuditStatus) {
        this.ClusterAuditStatus = ClusterAuditStatus;
    }

    /**
     * Get <p>Access status:<br>Not connected: AccessedNone<br>Defended: AccessedDefended<br>No protection: AccessedInstalled<br>Partial protection: AccessedPartialDefence<br>Access exception: AccessedException<br>Uninstallation exception: AccessedUninstallException<br>Accessing: AccessedInstalling<br>Uninstalling: AccessedUninstalling</p> 
     * @return AccessedStatus <p>Access status:<br>Not connected: AccessedNone<br>Defended: AccessedDefended<br>No protection: AccessedInstalled<br>Partial protection: AccessedPartialDefence<br>Access exception: AccessedException<br>Uninstallation exception: AccessedUninstallException<br>Accessing: AccessedInstalling<br>Uninstalling: AccessedUninstalling</p>
     */
    public String getAccessedStatus() {
        return this.AccessedStatus;
    }

    /**
     * Set <p>Access status:<br>Not connected: AccessedNone<br>Defended: AccessedDefended<br>No protection: AccessedInstalled<br>Partial protection: AccessedPartialDefence<br>Access exception: AccessedException<br>Uninstallation exception: AccessedUninstallException<br>Accessing: AccessedInstalling<br>Uninstalling: AccessedUninstalling</p>
     * @param AccessedStatus <p>Access status:<br>Not connected: AccessedNone<br>Defended: AccessedDefended<br>No protection: AccessedInstalled<br>Partial protection: AccessedPartialDefence<br>Access exception: AccessedException<br>Uninstallation exception: AccessedUninstallException<br>Accessing: AccessedInstalling<br>Uninstalling: AccessedUninstalling</p>
     */
    public void setAccessedStatus(String AccessedStatus) {
        this.AccessedStatus = AccessedStatus;
    }

    public AssetClusterListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetClusterListItem(AssetClusterListItem source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.BindRuleID != null) {
            this.BindRuleID = new String(source.BindRuleID);
        }
        if (source.BindRuleName != null) {
            this.BindRuleName = new String(source.BindRuleName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.ClusterVersion != null) {
            this.ClusterVersion = new String(source.ClusterVersion);
        }
        if (source.MemLimit != null) {
            this.MemLimit = new Long(source.MemLimit);
        }
        if (source.CpuLimit != null) {
            this.CpuLimit = new Long(source.CpuLimit);
        }
        if (source.ClusterAuditStatus != null) {
            this.ClusterAuditStatus = new String(source.ClusterAuditStatus);
        }
        if (source.AccessedStatus != null) {
            this.AccessedStatus = new String(source.AccessedStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BindRuleID", this.BindRuleID);
        this.setParamSimple(map, prefix + "BindRuleName", this.BindRuleName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ClusterVersion", this.ClusterVersion);
        this.setParamSimple(map, prefix + "MemLimit", this.MemLimit);
        this.setParamSimple(map, prefix + "CpuLimit", this.CpuLimit);
        this.setParamSimple(map, prefix + "ClusterAuditStatus", this.ClusterAuditStatus);
        this.setParamSimple(map, prefix + "AccessedStatus", this.AccessedStatus);

    }
}

