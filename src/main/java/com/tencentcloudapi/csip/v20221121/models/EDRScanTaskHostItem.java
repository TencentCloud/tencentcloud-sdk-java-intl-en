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

public class EDRScanTaskHostItem extends AbstractModel {

    /**
    * <p>Host unique identifier</p>
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * <p>Host name.</p>
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * <p>Instance ID.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Public IP address</p>
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * <p>Operating system.</p>
    */
    @SerializedName("OsType")
    @Expose
    private String OsType;

    /**
    * <p>Account name of asset ownership (enriched from the backend)</p>
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * <p>AppId of the account associated with the asset</p>
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
    * <p>Risk count</p>
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
     * Get <p>Host unique identifier</p> 
     * @return Quuid <p>Host unique identifier</p>
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set <p>Host unique identifier</p>
     * @param Quuid <p>Host unique identifier</p>
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get <p>Host name.</p> 
     * @return HostName <p>Host name.</p>
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set <p>Host name.</p>
     * @param HostName <p>Host name.</p>
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get <p>Instance ID.</p> 
     * @return InstanceId <p>Instance ID.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Instance ID.</p>
     * @param InstanceId <p>Instance ID.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Public IP address</p> 
     * @return PublicIp <p>Public IP address</p>
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set <p>Public IP address</p>
     * @param PublicIp <p>Public IP address</p>
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIp <p>Private IP address.</p>
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIp <p>Private IP address.</p>
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get <p>Operating system.</p> 
     * @return OsType <p>Operating system.</p>
     */
    public String getOsType() {
        return this.OsType;
    }

    /**
     * Set <p>Operating system.</p>
     * @param OsType <p>Operating system.</p>
     */
    public void setOsType(String OsType) {
        this.OsType = OsType;
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
     * Get <p>AppId of the account associated with the asset</p> 
     * @return AppId <p>AppId of the account associated with the asset</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>AppId of the account associated with the asset</p>
     * @param AppId <p>AppId of the account associated with the asset</p>
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
     * Get <p>Risk count</p> 
     * @return RiskCount <p>Risk count</p>
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set <p>Risk count</p>
     * @param RiskCount <p>Risk count</p>
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

    public EDRScanTaskHostItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EDRScanTaskHostItem(EDRScanTaskHostItem source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.OsType != null) {
            this.OsType = new String(source.OsType);
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
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "OsType", this.OsType);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "FixSuggestion", this.FixSuggestion);

    }
}

