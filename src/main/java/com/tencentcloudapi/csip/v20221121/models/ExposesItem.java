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

public class ExposesItem extends AbstractModel {

    /**
    * <p>Cloud vendor</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>Cloud account name</p>
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * <p>Cloud Account</p>
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * <p>Domain name</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>IP</p>
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * <p>Port or port range</p>
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * <p>Open</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Risk type</p>
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * <p>acl type</p>
    */
    @SerializedName("AclType")
    @Expose
    private String AclType;

    /**
    * <p>acl list</p>
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * <p>Asset ID</p>
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * <p>Instance name</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>Asset type</p>
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * <p>Number of port services</p>
    */
    @SerializedName("PortServiceCount")
    @Expose
    private Long PortServiceCount;

    /**
    * <p>Number of high-risk ports</p>
    */
    @SerializedName("HighRiskPortServiceCount")
    @Expose
    private Long HighRiskPortServiceCount;

    /**
    * <p>Number of web applications</p>
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * <p>Number of web applications at risk</p>
    */
    @SerializedName("RiskWebAppCount")
    @Expose
    private Long RiskWebAppCount;

    /**
    * <p>Number of weak passwords.</p>
    */
    @SerializedName("WeakPasswordCount")
    @Expose
    private Long WeakPasswordCount;

    /**
    * <p>Vulnerability count</p>
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * <p>First discovery time</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>Latest update time.</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>Instance Type Name</p>
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * <p>Open status</p>
    */
    @SerializedName("DisplayStatus")
    @Expose
    private String DisplayStatus;

    /**
    * <p>Port status</p>
    */
    @SerializedName("DisplayRiskType")
    @Expose
    private String DisplayRiskType;

    /**
    * <p>Scan task status</p>
    */
    @SerializedName("ScanTaskStatus")
    @Expose
    private String ScanTaskStatus;

    /**
    * <p>uuid</p>
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * <p>Whether a security check has been performed</p>
    */
    @SerializedName("HasScan")
    @Expose
    private String HasScan;

    /**
    * <p>Tenant ID</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>Tenant ID string</p>
    */
    @SerializedName("AppIdStr")
    @Expose
    private String AppIdStr;

    /**
    * <p>Record ID</p>
    */
    @SerializedName("ExposureID")
    @Expose
    private Long ExposureID;

    /**
    * <p>Number of open ports</p>
    */
    @SerializedName("PortDetectCount")
    @Expose
    private Long PortDetectCount;

    /**
    * <p>Port exposure result</p>
    */
    @SerializedName("PortDetectResult")
    @Expose
    private String PortDetectResult;

    /**
    * <p>Tag.</p>
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * <p>Remark</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>Number of risks to be governed</p>
    */
    @SerializedName("ToGovernedRiskCount")
    @Expose
    private Long ToGovernedRiskCount;

    /**
    * <p>Risk content to be governed</p>
    */
    @SerializedName("ToGovernedRiskContent")
    @Expose
    private String ToGovernedRiskContent;

    /**
    * <p>Type icon of asset</p>
    */
    @SerializedName("AssetTypeIconURL")
    @Expose
    private String AssetTypeIconURL;

    /**
    * <p>Asset type 3D icon</p>
    */
    @SerializedName("AssetTypeIconSolidURL")
    @Expose
    private String AssetTypeIconSolidURL;

    /**
     * Get <p>Cloud vendor</p> 
     * @return Provider <p>Cloud vendor</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Cloud vendor</p>
     * @param Provider <p>Cloud vendor</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>Cloud account name</p> 
     * @return CloudAccountName <p>Cloud account name</p>
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set <p>Cloud account name</p>
     * @param CloudAccountName <p>Cloud account name</p>
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get <p>Cloud Account</p> 
     * @return CloudAccountId <p>Cloud Account</p>
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set <p>Cloud Account</p>
     * @param CloudAccountId <p>Cloud Account</p>
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get <p>Domain name</p> 
     * @return Domain <p>Domain name</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain name</p>
     * @param Domain <p>Domain name</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>IP</p> 
     * @return Ip <p>IP</p>
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set <p>IP</p>
     * @param Ip <p>IP</p>
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get <p>Port or port range</p> 
     * @return Port <p>Port or port range</p>
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set <p>Port or port range</p>
     * @param Port <p>Port or port range</p>
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get <p>Open</p> 
     * @return Status <p>Open</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Open</p>
     * @param Status <p>Open</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Risk type</p> 
     * @return RiskType <p>Risk type</p>
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set <p>Risk type</p>
     * @param RiskType <p>Risk type</p>
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get <p>acl type</p> 
     * @return AclType <p>acl type</p>
     */
    public String getAclType() {
        return this.AclType;
    }

    /**
     * Set <p>acl type</p>
     * @param AclType <p>acl type</p>
     */
    public void setAclType(String AclType) {
        this.AclType = AclType;
    }

    /**
     * Get <p>acl list</p> 
     * @return AclList <p>acl list</p>
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set <p>acl list</p>
     * @param AclList <p>acl list</p>
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get <p>Asset ID</p> 
     * @return AssetId <p>Asset ID</p>
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set <p>Asset ID</p>
     * @param AssetId <p>Asset ID</p>
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get <p>Instance name</p> 
     * @return InstanceName <p>Instance name</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>Instance name</p>
     * @param InstanceName <p>Instance name</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>Asset type</p> 
     * @return AssetType <p>Asset type</p>
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set <p>Asset type</p>
     * @param AssetType <p>Asset type</p>
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get <p>Number of port services</p> 
     * @return PortServiceCount <p>Number of port services</p>
     */
    public Long getPortServiceCount() {
        return this.PortServiceCount;
    }

    /**
     * Set <p>Number of port services</p>
     * @param PortServiceCount <p>Number of port services</p>
     */
    public void setPortServiceCount(Long PortServiceCount) {
        this.PortServiceCount = PortServiceCount;
    }

    /**
     * Get <p>Number of high-risk ports</p> 
     * @return HighRiskPortServiceCount <p>Number of high-risk ports</p>
     */
    public Long getHighRiskPortServiceCount() {
        return this.HighRiskPortServiceCount;
    }

    /**
     * Set <p>Number of high-risk ports</p>
     * @param HighRiskPortServiceCount <p>Number of high-risk ports</p>
     */
    public void setHighRiskPortServiceCount(Long HighRiskPortServiceCount) {
        this.HighRiskPortServiceCount = HighRiskPortServiceCount;
    }

    /**
     * Get <p>Number of web applications</p> 
     * @return WebAppCount <p>Number of web applications</p>
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set <p>Number of web applications</p>
     * @param WebAppCount <p>Number of web applications</p>
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get <p>Number of web applications at risk</p> 
     * @return RiskWebAppCount <p>Number of web applications at risk</p>
     */
    public Long getRiskWebAppCount() {
        return this.RiskWebAppCount;
    }

    /**
     * Set <p>Number of web applications at risk</p>
     * @param RiskWebAppCount <p>Number of web applications at risk</p>
     */
    public void setRiskWebAppCount(Long RiskWebAppCount) {
        this.RiskWebAppCount = RiskWebAppCount;
    }

    /**
     * Get <p>Number of weak passwords.</p> 
     * @return WeakPasswordCount <p>Number of weak passwords.</p>
     */
    public Long getWeakPasswordCount() {
        return this.WeakPasswordCount;
    }

    /**
     * Set <p>Number of weak passwords.</p>
     * @param WeakPasswordCount <p>Number of weak passwords.</p>
     */
    public void setWeakPasswordCount(Long WeakPasswordCount) {
        this.WeakPasswordCount = WeakPasswordCount;
    }

    /**
     * Get <p>Vulnerability count</p> 
     * @return VulCount <p>Vulnerability count</p>
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set <p>Vulnerability count</p>
     * @param VulCount <p>Vulnerability count</p>
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get <p>First discovery time</p> 
     * @return CreateTime <p>First discovery time</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>First discovery time</p>
     * @param CreateTime <p>First discovery time</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>Latest update time.</p> 
     * @return UpdateTime <p>Latest update time.</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>Latest update time.</p>
     * @param UpdateTime <p>Latest update time.</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>Instance Type Name</p> 
     * @return AssetTypeName <p>Instance Type Name</p>
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set <p>Instance Type Name</p>
     * @param AssetTypeName <p>Instance Type Name</p>
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get <p>Open status</p> 
     * @return DisplayStatus <p>Open status</p>
     */
    public String getDisplayStatus() {
        return this.DisplayStatus;
    }

    /**
     * Set <p>Open status</p>
     * @param DisplayStatus <p>Open status</p>
     */
    public void setDisplayStatus(String DisplayStatus) {
        this.DisplayStatus = DisplayStatus;
    }

    /**
     * Get <p>Port status</p> 
     * @return DisplayRiskType <p>Port status</p>
     */
    public String getDisplayRiskType() {
        return this.DisplayRiskType;
    }

    /**
     * Set <p>Port status</p>
     * @param DisplayRiskType <p>Port status</p>
     */
    public void setDisplayRiskType(String DisplayRiskType) {
        this.DisplayRiskType = DisplayRiskType;
    }

    /**
     * Get <p>Scan task status</p> 
     * @return ScanTaskStatus <p>Scan task status</p>
     */
    public String getScanTaskStatus() {
        return this.ScanTaskStatus;
    }

    /**
     * Set <p>Scan task status</p>
     * @param ScanTaskStatus <p>Scan task status</p>
     */
    public void setScanTaskStatus(String ScanTaskStatus) {
        this.ScanTaskStatus = ScanTaskStatus;
    }

    /**
     * Get <p>uuid</p> 
     * @return Uuid <p>uuid</p>
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set <p>uuid</p>
     * @param Uuid <p>uuid</p>
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get <p>Whether a security check has been performed</p> 
     * @return HasScan <p>Whether a security check has been performed</p>
     */
    public String getHasScan() {
        return this.HasScan;
    }

    /**
     * Set <p>Whether a security check has been performed</p>
     * @param HasScan <p>Whether a security check has been performed</p>
     */
    public void setHasScan(String HasScan) {
        this.HasScan = HasScan;
    }

    /**
     * Get <p>Tenant ID</p> 
     * @return AppId <p>Tenant ID</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>Tenant ID</p>
     * @param AppId <p>Tenant ID</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>Tenant ID string</p> 
     * @return AppIdStr <p>Tenant ID string</p>
     */
    public String getAppIdStr() {
        return this.AppIdStr;
    }

    /**
     * Set <p>Tenant ID string</p>
     * @param AppIdStr <p>Tenant ID string</p>
     */
    public void setAppIdStr(String AppIdStr) {
        this.AppIdStr = AppIdStr;
    }

    /**
     * Get <p>Record ID</p> 
     * @return ExposureID <p>Record ID</p>
     */
    public Long getExposureID() {
        return this.ExposureID;
    }

    /**
     * Set <p>Record ID</p>
     * @param ExposureID <p>Record ID</p>
     */
    public void setExposureID(Long ExposureID) {
        this.ExposureID = ExposureID;
    }

    /**
     * Get <p>Number of open ports</p> 
     * @return PortDetectCount <p>Number of open ports</p>
     */
    public Long getPortDetectCount() {
        return this.PortDetectCount;
    }

    /**
     * Set <p>Number of open ports</p>
     * @param PortDetectCount <p>Number of open ports</p>
     */
    public void setPortDetectCount(Long PortDetectCount) {
        this.PortDetectCount = PortDetectCount;
    }

    /**
     * Get <p>Port exposure result</p> 
     * @return PortDetectResult <p>Port exposure result</p>
     */
    public String getPortDetectResult() {
        return this.PortDetectResult;
    }

    /**
     * Set <p>Port exposure result</p>
     * @param PortDetectResult <p>Port exposure result</p>
     */
    public void setPortDetectResult(String PortDetectResult) {
        this.PortDetectResult = PortDetectResult;
    }

    /**
     * Get <p>Tag.</p> 
     * @return Tag <p>Tag.</p>
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set <p>Tag.</p>
     * @param Tag <p>Tag.</p>
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get <p>Remark</p> 
     * @return Comment <p>Remark</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>Remark</p>
     * @param Comment <p>Remark</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>Number of risks to be governed</p> 
     * @return ToGovernedRiskCount <p>Number of risks to be governed</p>
     */
    public Long getToGovernedRiskCount() {
        return this.ToGovernedRiskCount;
    }

    /**
     * Set <p>Number of risks to be governed</p>
     * @param ToGovernedRiskCount <p>Number of risks to be governed</p>
     */
    public void setToGovernedRiskCount(Long ToGovernedRiskCount) {
        this.ToGovernedRiskCount = ToGovernedRiskCount;
    }

    /**
     * Get <p>Risk content to be governed</p> 
     * @return ToGovernedRiskContent <p>Risk content to be governed</p>
     */
    public String getToGovernedRiskContent() {
        return this.ToGovernedRiskContent;
    }

    /**
     * Set <p>Risk content to be governed</p>
     * @param ToGovernedRiskContent <p>Risk content to be governed</p>
     */
    public void setToGovernedRiskContent(String ToGovernedRiskContent) {
        this.ToGovernedRiskContent = ToGovernedRiskContent;
    }

    /**
     * Get <p>Type icon of asset</p> 
     * @return AssetTypeIconURL <p>Type icon of asset</p>
     */
    public String getAssetTypeIconURL() {
        return this.AssetTypeIconURL;
    }

    /**
     * Set <p>Type icon of asset</p>
     * @param AssetTypeIconURL <p>Type icon of asset</p>
     */
    public void setAssetTypeIconURL(String AssetTypeIconURL) {
        this.AssetTypeIconURL = AssetTypeIconURL;
    }

    /**
     * Get <p>Asset type 3D icon</p> 
     * @return AssetTypeIconSolidURL <p>Asset type 3D icon</p>
     */
    public String getAssetTypeIconSolidURL() {
        return this.AssetTypeIconSolidURL;
    }

    /**
     * Set <p>Asset type 3D icon</p>
     * @param AssetTypeIconSolidURL <p>Asset type 3D icon</p>
     */
    public void setAssetTypeIconSolidURL(String AssetTypeIconSolidURL) {
        this.AssetTypeIconSolidURL = AssetTypeIconSolidURL;
    }

    public ExposesItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExposesItem(ExposesItem source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.CloudAccountName != null) {
            this.CloudAccountName = new String(source.CloudAccountName);
        }
        if (source.CloudAccountId != null) {
            this.CloudAccountId = new String(source.CloudAccountId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.AclType != null) {
            this.AclType = new String(source.AclType);
        }
        if (source.AclList != null) {
            this.AclList = new String(source.AclList);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.PortServiceCount != null) {
            this.PortServiceCount = new Long(source.PortServiceCount);
        }
        if (source.HighRiskPortServiceCount != null) {
            this.HighRiskPortServiceCount = new Long(source.HighRiskPortServiceCount);
        }
        if (source.WebAppCount != null) {
            this.WebAppCount = new Long(source.WebAppCount);
        }
        if (source.RiskWebAppCount != null) {
            this.RiskWebAppCount = new Long(source.RiskWebAppCount);
        }
        if (source.WeakPasswordCount != null) {
            this.WeakPasswordCount = new Long(source.WeakPasswordCount);
        }
        if (source.VulCount != null) {
            this.VulCount = new Long(source.VulCount);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.AssetTypeName != null) {
            this.AssetTypeName = new String(source.AssetTypeName);
        }
        if (source.DisplayStatus != null) {
            this.DisplayStatus = new String(source.DisplayStatus);
        }
        if (source.DisplayRiskType != null) {
            this.DisplayRiskType = new String(source.DisplayRiskType);
        }
        if (source.ScanTaskStatus != null) {
            this.ScanTaskStatus = new String(source.ScanTaskStatus);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.HasScan != null) {
            this.HasScan = new String(source.HasScan);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.AppIdStr != null) {
            this.AppIdStr = new String(source.AppIdStr);
        }
        if (source.ExposureID != null) {
            this.ExposureID = new Long(source.ExposureID);
        }
        if (source.PortDetectCount != null) {
            this.PortDetectCount = new Long(source.PortDetectCount);
        }
        if (source.PortDetectResult != null) {
            this.PortDetectResult = new String(source.PortDetectResult);
        }
        if (source.Tag != null) {
            this.Tag = new String(source.Tag);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.ToGovernedRiskCount != null) {
            this.ToGovernedRiskCount = new Long(source.ToGovernedRiskCount);
        }
        if (source.ToGovernedRiskContent != null) {
            this.ToGovernedRiskContent = new String(source.ToGovernedRiskContent);
        }
        if (source.AssetTypeIconURL != null) {
            this.AssetTypeIconURL = new String(source.AssetTypeIconURL);
        }
        if (source.AssetTypeIconSolidURL != null) {
            this.AssetTypeIconSolidURL = new String(source.AssetTypeIconSolidURL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "CloudAccountName", this.CloudAccountName);
        this.setParamSimple(map, prefix + "CloudAccountId", this.CloudAccountId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "AclType", this.AclType);
        this.setParamSimple(map, prefix + "AclList", this.AclList);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "PortServiceCount", this.PortServiceCount);
        this.setParamSimple(map, prefix + "HighRiskPortServiceCount", this.HighRiskPortServiceCount);
        this.setParamSimple(map, prefix + "WebAppCount", this.WebAppCount);
        this.setParamSimple(map, prefix + "RiskWebAppCount", this.RiskWebAppCount);
        this.setParamSimple(map, prefix + "WeakPasswordCount", this.WeakPasswordCount);
        this.setParamSimple(map, prefix + "VulCount", this.VulCount);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "AssetTypeName", this.AssetTypeName);
        this.setParamSimple(map, prefix + "DisplayStatus", this.DisplayStatus);
        this.setParamSimple(map, prefix + "DisplayRiskType", this.DisplayRiskType);
        this.setParamSimple(map, prefix + "ScanTaskStatus", this.ScanTaskStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "HasScan", this.HasScan);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AppIdStr", this.AppIdStr);
        this.setParamSimple(map, prefix + "ExposureID", this.ExposureID);
        this.setParamSimple(map, prefix + "PortDetectCount", this.PortDetectCount);
        this.setParamSimple(map, prefix + "PortDetectResult", this.PortDetectResult);
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "ToGovernedRiskCount", this.ToGovernedRiskCount);
        this.setParamSimple(map, prefix + "ToGovernedRiskContent", this.ToGovernedRiskContent);
        this.setParamSimple(map, prefix + "AssetTypeIconURL", this.AssetTypeIconURL);
        this.setParamSimple(map, prefix + "AssetTypeIconSolidURL", this.AssetTypeIconSolidURL);

    }
}

