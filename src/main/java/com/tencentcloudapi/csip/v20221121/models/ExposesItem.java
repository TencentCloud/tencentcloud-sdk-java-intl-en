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
    * Cloud service provider.
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * Account name.
    */
    @SerializedName("CloudAccountName")
    @Expose
    private String CloudAccountName;

    /**
    * Cloud account.
    */
    @SerializedName("CloudAccountId")
    @Expose
    private String CloudAccountId;

    /**
    * Domain
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Port or port range.
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Open.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Risk type.
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * acl type.
    */
    @SerializedName("AclType")
    @Expose
    private String AclType;

    /**
    * ACL list.
    */
    @SerializedName("AclList")
    @Expose
    private String AclList;

    /**
    * Asset ID.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Asset type.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Port service quantity.
    */
    @SerializedName("PortServiceCount")
    @Expose
    private Long PortServiceCount;

    /**
    * Number of high-risk ports.
    */
    @SerializedName("HighRiskPortServiceCount")
    @Expose
    private Long HighRiskPortServiceCount;

    /**
    * Number of web applications.
    */
    @SerializedName("WebAppCount")
    @Expose
    private Long WebAppCount;

    /**
    * Number of web applications at risk.
    */
    @SerializedName("RiskWebAppCount")
    @Expose
    private Long RiskWebAppCount;

    /**
    * Number of Weak Passwords
    */
    @SerializedName("WeakPasswordCount")
    @Expose
    private Long WeakPasswordCount;

    /**
    * Number of vulnerabilities
    */
    @SerializedName("VulCount")
    @Expose
    private Long VulCount;

    /**
    * First detection time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Latest update time.
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * Instance Type Name
    */
    @SerializedName("AssetTypeName")
    @Expose
    private String AssetTypeName;

    /**
    * Open status.
    */
    @SerializedName("DisplayStatus")
    @Expose
    private String DisplayStatus;

    /**
    * Port status.
    */
    @SerializedName("DisplayRiskType")
    @Expose
    private String DisplayRiskType;

    /**
    * Scan task status.
    */
    @SerializedName("ScanTaskStatus")
    @Expose
    private String ScanTaskStatus;

    /**
    * uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Whether a security check has been performed.
    */
    @SerializedName("HasScan")
    @Expose
    private String HasScan;

    /**
    * Tenant ID.
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Tenant ID string.
    */
    @SerializedName("AppIdStr")
    @Expose
    private String AppIdStr;

    /**
    * Record ID
    */
    @SerializedName("ExposureID")
    @Expose
    private Long ExposureID;

    /**
    * Number of ports open.
    */
    @SerializedName("PortDetectCount")
    @Expose
    private Long PortDetectCount;

    /**
    * Port exposure result.
    */
    @SerializedName("PortDetectResult")
    @Expose
    private String PortDetectResult;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * Remarks
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * Number of risks to be governed.
    */
    @SerializedName("ToGovernedRiskCount")
    @Expose
    private Long ToGovernedRiskCount;

    /**
    * Risk content to be governed.
    */
    @SerializedName("ToGovernedRiskContent")
    @Expose
    private String ToGovernedRiskContent;

    /**
     * Get Cloud service provider. 
     * @return Provider Cloud service provider.
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set Cloud service provider.
     * @param Provider Cloud service provider.
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get Account name. 
     * @return CloudAccountName Account name.
     */
    public String getCloudAccountName() {
        return this.CloudAccountName;
    }

    /**
     * Set Account name.
     * @param CloudAccountName Account name.
     */
    public void setCloudAccountName(String CloudAccountName) {
        this.CloudAccountName = CloudAccountName;
    }

    /**
     * Get Cloud account. 
     * @return CloudAccountId Cloud account.
     */
    public String getCloudAccountId() {
        return this.CloudAccountId;
    }

    /**
     * Set Cloud account.
     * @param CloudAccountId Cloud account.
     */
    public void setCloudAccountId(String CloudAccountId) {
        this.CloudAccountId = CloudAccountId;
    }

    /**
     * Get Domain 
     * @return Domain Domain
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain
     * @param Domain Domain
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Port or port range. 
     * @return Port Port or port range.
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port or port range.
     * @param Port Port or port range.
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Open. 
     * @return Status Open.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Open.
     * @param Status Open.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Risk type. 
     * @return RiskType Risk type.
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set Risk type.
     * @param RiskType Risk type.
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get acl type. 
     * @return AclType acl type.
     */
    public String getAclType() {
        return this.AclType;
    }

    /**
     * Set acl type.
     * @param AclType acl type.
     */
    public void setAclType(String AclType) {
        this.AclType = AclType;
    }

    /**
     * Get ACL list. 
     * @return AclList ACL list.
     */
    public String getAclList() {
        return this.AclList;
    }

    /**
     * Set ACL list.
     * @param AclList ACL list.
     */
    public void setAclList(String AclList) {
        this.AclList = AclList;
    }

    /**
     * Get Asset ID. 
     * @return AssetId Asset ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID.
     * @param AssetId Asset ID.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Asset type. 
     * @return AssetType Asset type.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type.
     * @param AssetType Asset type.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Port service quantity. 
     * @return PortServiceCount Port service quantity.
     */
    public Long getPortServiceCount() {
        return this.PortServiceCount;
    }

    /**
     * Set Port service quantity.
     * @param PortServiceCount Port service quantity.
     */
    public void setPortServiceCount(Long PortServiceCount) {
        this.PortServiceCount = PortServiceCount;
    }

    /**
     * Get Number of high-risk ports. 
     * @return HighRiskPortServiceCount Number of high-risk ports.
     */
    public Long getHighRiskPortServiceCount() {
        return this.HighRiskPortServiceCount;
    }

    /**
     * Set Number of high-risk ports.
     * @param HighRiskPortServiceCount Number of high-risk ports.
     */
    public void setHighRiskPortServiceCount(Long HighRiskPortServiceCount) {
        this.HighRiskPortServiceCount = HighRiskPortServiceCount;
    }

    /**
     * Get Number of web applications. 
     * @return WebAppCount Number of web applications.
     */
    public Long getWebAppCount() {
        return this.WebAppCount;
    }

    /**
     * Set Number of web applications.
     * @param WebAppCount Number of web applications.
     */
    public void setWebAppCount(Long WebAppCount) {
        this.WebAppCount = WebAppCount;
    }

    /**
     * Get Number of web applications at risk. 
     * @return RiskWebAppCount Number of web applications at risk.
     */
    public Long getRiskWebAppCount() {
        return this.RiskWebAppCount;
    }

    /**
     * Set Number of web applications at risk.
     * @param RiskWebAppCount Number of web applications at risk.
     */
    public void setRiskWebAppCount(Long RiskWebAppCount) {
        this.RiskWebAppCount = RiskWebAppCount;
    }

    /**
     * Get Number of Weak Passwords 
     * @return WeakPasswordCount Number of Weak Passwords
     */
    public Long getWeakPasswordCount() {
        return this.WeakPasswordCount;
    }

    /**
     * Set Number of Weak Passwords
     * @param WeakPasswordCount Number of Weak Passwords
     */
    public void setWeakPasswordCount(Long WeakPasswordCount) {
        this.WeakPasswordCount = WeakPasswordCount;
    }

    /**
     * Get Number of vulnerabilities 
     * @return VulCount Number of vulnerabilities
     */
    public Long getVulCount() {
        return this.VulCount;
    }

    /**
     * Set Number of vulnerabilities
     * @param VulCount Number of vulnerabilities
     */
    public void setVulCount(Long VulCount) {
        this.VulCount = VulCount;
    }

    /**
     * Get First detection time 
     * @return CreateTime First detection time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set First detection time
     * @param CreateTime First detection time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Latest update time. 
     * @return UpdateTime Latest update time.
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Latest update time.
     * @param UpdateTime Latest update time.
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get Instance Type Name 
     * @return AssetTypeName Instance Type Name
     */
    public String getAssetTypeName() {
        return this.AssetTypeName;
    }

    /**
     * Set Instance Type Name
     * @param AssetTypeName Instance Type Name
     */
    public void setAssetTypeName(String AssetTypeName) {
        this.AssetTypeName = AssetTypeName;
    }

    /**
     * Get Open status. 
     * @return DisplayStatus Open status.
     */
    public String getDisplayStatus() {
        return this.DisplayStatus;
    }

    /**
     * Set Open status.
     * @param DisplayStatus Open status.
     */
    public void setDisplayStatus(String DisplayStatus) {
        this.DisplayStatus = DisplayStatus;
    }

    /**
     * Get Port status. 
     * @return DisplayRiskType Port status.
     */
    public String getDisplayRiskType() {
        return this.DisplayRiskType;
    }

    /**
     * Set Port status.
     * @param DisplayRiskType Port status.
     */
    public void setDisplayRiskType(String DisplayRiskType) {
        this.DisplayRiskType = DisplayRiskType;
    }

    /**
     * Get Scan task status. 
     * @return ScanTaskStatus Scan task status.
     */
    public String getScanTaskStatus() {
        return this.ScanTaskStatus;
    }

    /**
     * Set Scan task status.
     * @param ScanTaskStatus Scan task status.
     */
    public void setScanTaskStatus(String ScanTaskStatus) {
        this.ScanTaskStatus = ScanTaskStatus;
    }

    /**
     * Get uuid 
     * @return Uuid uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set uuid
     * @param Uuid uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Whether a security check has been performed. 
     * @return HasScan Whether a security check has been performed.
     */
    public String getHasScan() {
        return this.HasScan;
    }

    /**
     * Set Whether a security check has been performed.
     * @param HasScan Whether a security check has been performed.
     */
    public void setHasScan(String HasScan) {
        this.HasScan = HasScan;
    }

    /**
     * Get Tenant ID. 
     * @return AppId Tenant ID.
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tenant ID.
     * @param AppId Tenant ID.
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Tenant ID string. 
     * @return AppIdStr Tenant ID string.
     */
    public String getAppIdStr() {
        return this.AppIdStr;
    }

    /**
     * Set Tenant ID string.
     * @param AppIdStr Tenant ID string.
     */
    public void setAppIdStr(String AppIdStr) {
        this.AppIdStr = AppIdStr;
    }

    /**
     * Get Record ID 
     * @return ExposureID Record ID
     */
    public Long getExposureID() {
        return this.ExposureID;
    }

    /**
     * Set Record ID
     * @param ExposureID Record ID
     */
    public void setExposureID(Long ExposureID) {
        this.ExposureID = ExposureID;
    }

    /**
     * Get Number of ports open. 
     * @return PortDetectCount Number of ports open.
     */
    public Long getPortDetectCount() {
        return this.PortDetectCount;
    }

    /**
     * Set Number of ports open.
     * @param PortDetectCount Number of ports open.
     */
    public void setPortDetectCount(Long PortDetectCount) {
        this.PortDetectCount = PortDetectCount;
    }

    /**
     * Get Port exposure result. 
     * @return PortDetectResult Port exposure result.
     */
    public String getPortDetectResult() {
        return this.PortDetectResult;
    }

    /**
     * Set Port exposure result.
     * @param PortDetectResult Port exposure result.
     */
    public void setPortDetectResult(String PortDetectResult) {
        this.PortDetectResult = PortDetectResult;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Remarks 
     * @return Comment Remarks
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set Remarks
     * @param Comment Remarks
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get Number of risks to be governed. 
     * @return ToGovernedRiskCount Number of risks to be governed.
     */
    public Long getToGovernedRiskCount() {
        return this.ToGovernedRiskCount;
    }

    /**
     * Set Number of risks to be governed.
     * @param ToGovernedRiskCount Number of risks to be governed.
     */
    public void setToGovernedRiskCount(Long ToGovernedRiskCount) {
        this.ToGovernedRiskCount = ToGovernedRiskCount;
    }

    /**
     * Get Risk content to be governed. 
     * @return ToGovernedRiskContent Risk content to be governed.
     */
    public String getToGovernedRiskContent() {
        return this.ToGovernedRiskContent;
    }

    /**
     * Set Risk content to be governed.
     * @param ToGovernedRiskContent Risk content to be governed.
     */
    public void setToGovernedRiskContent(String ToGovernedRiskContent) {
        this.ToGovernedRiskContent = ToGovernedRiskContent;
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

    }
}

