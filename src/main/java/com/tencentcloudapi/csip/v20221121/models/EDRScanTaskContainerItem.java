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

public class EDRScanTaskContainerItem extends AbstractModel {

    /**
    * <p>Container ID</p>
    */
    @SerializedName("ContainerID")
    @Expose
    private String ContainerID;

    /**
    * <p>Container name</p>
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * <p>Pod Name</p>
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

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
    * <p>Cluster type.</p>
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * <p>Account name of asset ownership (enriched from the backend)</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>AppId of the associated account</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Cloud type</p>
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
    * <p>Scan status: WAIT/SCANNING/FINISHED/FAILED</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Alarm count</p>
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * <p>Failure reason</p>
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * <p>Solution.</p>
    */
    @SerializedName("FixSuggestion")
    @Expose
    private String FixSuggestion;

    /**
     * Get <p>Container ID</p> 
     * @return ContainerID <p>Container ID</p>
     */
    public String getContainerID() {
        return this.ContainerID;
    }

    /**
     * Set <p>Container ID</p>
     * @param ContainerID <p>Container ID</p>
     */
    public void setContainerID(String ContainerID) {
        this.ContainerID = ContainerID;
    }

    /**
     * Get <p>Container name</p> 
     * @return ContainerName <p>Container name</p>
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set <p>Container name</p>
     * @param ContainerName <p>Container name</p>
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get <p>Pod Name</p> 
     * @return PodName <p>Pod Name</p>
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set <p>Pod Name</p>
     * @param PodName <p>Pod Name</p>
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

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
     * Get <p>Cluster type.</p> 
     * @return ClusterType <p>Cluster type.</p>
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * Set <p>Cluster type.</p>
     * @param ClusterType <p>Cluster type.</p>
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * Get <p>Account name of asset ownership (enriched from the backend)</p> 
     * @return AccountName <p>Account name of asset ownership (enriched from the backend)</p>
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * Set <p>Account name of asset ownership (enriched from the backend)</p>
     * @param AccountName <p>Account name of asset ownership (enriched from the backend)</p>
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * Get <p>AppId of the associated account</p> 
     * @return AppId <p>AppId of the associated account</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppId of the associated account</p>
     * @param AppId <p>AppId of the associated account</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Cloud type</p> 
     * @return CloudType <p>Cloud type</p>
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>Cloud type</p>
     * @param CloudType <p>Cloud type</p>
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>Scan status: WAIT/SCANNING/FINISHED/FAILED</p> 
     * @return Status <p>Scan status: WAIT/SCANNING/FINISHED/FAILED</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Scan status: WAIT/SCANNING/FINISHED/FAILED</p>
     * @param Status <p>Scan status: WAIT/SCANNING/FINISHED/FAILED</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Alarm count</p> 
     * @return RiskCount <p>Alarm count</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Alarm count</p>
     * @param RiskCount <p>Alarm count</p>
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get <p>Failure reason</p> 
     * @return FailReason <p>Failure reason</p>
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set <p>Failure reason</p>
     * @param FailReason <p>Failure reason</p>
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get <p>Solution.</p> 
     * @return FixSuggestion <p>Solution.</p>
     */
    public String getFixSuggestion() {
        return this.FixSuggestion;
    }

    /**
     * Set <p>Solution.</p>
     * @param FixSuggestion <p>Solution.</p>
     */
    public void setFixSuggestion(String FixSuggestion) {
        this.FixSuggestion = FixSuggestion;
    }

    public EDRScanTaskContainerItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRScanTaskContainerItem(EDRScanTaskContainerItem source) {
        if (source.ContainerID != null) {
            this.ContainerID = new String(source.ContainerID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.ClusterType != null) {
            this.ClusterType = new String(source.ClusterType);
        }
        if (source.AccountName != null) {
            this.AccountName = new String(source.AccountName);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.FixSuggestion != null) {
            this.FixSuggestion = new String(source.FixSuggestion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ContainerID", this.ContainerID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);

    }
}

