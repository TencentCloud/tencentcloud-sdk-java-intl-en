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

public class AssetBaseInfoResponse extends AbstractModel {

    /**
    * vpc-id
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc-name
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Asset name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Operating system.
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * Public IP address
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP address
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Asset type
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Asset ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Number of accounts
    */
    @SerializedName("AccountNum")
    @Expose
    private Long AccountNum;

    /**
    * Number of Ports
    */
    @SerializedName("PortNum")
    @Expose
    private Long PortNum;

    /**
    * Process quantity
    */
    @SerializedName("ProcessNum")
    @Expose
    private Long ProcessNum;

    /**
    * Number of Software Applications
    */
    @SerializedName("SoftApplicationNum")
    @Expose
    private Long SoftApplicationNum;

    /**
    * Database Count
    */
    @SerializedName("DatabaseNum")
    @Expose
    private Long DatabaseNum;

    /**
    * Number of Web Applications
    */
    @SerializedName("WebApplicationNum")
    @Expose
    private Long WebApplicationNum;

    /**
    * Number of services
    */
    @SerializedName("ServiceNum")
    @Expose
    private Long ServiceNum;

    /**
    * Web Framework Count
    */
    @SerializedName("WebFrameworkNum")
    @Expose
    private Long WebFrameworkNum;

    /**
    * Website Count
    */
    @SerializedName("WebSiteNum")
    @Expose
    private Long WebSiteNum;

    /**
    * Jar Package Count
    */
    @SerializedName("JarPackageNum")
    @Expose
    private Long JarPackageNum;

    /**
    * Started Service Count
    */
    @SerializedName("StartServiceNum")
    @Expose
    private Long StartServiceNum;

    /**
    * Number of Scheduled Tasks
    */
    @SerializedName("ScheduledTaskNum")
    @Expose
    private Long ScheduledTaskNum;

    /**
    * Number of Environment Variables
    */
    @SerializedName("EnvironmentVariableNum")
    @Expose
    private Long EnvironmentVariableNum;

    /**
    * Number of Kernel Modules
    */
    @SerializedName("KernelModuleNum")
    @Expose
    private Long KernelModuleNum;

    /**
    * System Installation Package Count
    */
    @SerializedName("SystemInstallationPackageNum")
    @Expose
    private Long SystemInstallationPackageNum;

    /**
    * remaining protection duration
    */
    @SerializedName("SurplusProtectDay")
    @Expose
    private Long SurplusProtectDay;

    /**
    * Whether client is installed. 1 for Installed, 0 for Not Installed.
    */
    @SerializedName("CWPStatus")
    @Expose
    private Long CWPStatus;

    /**
    * Tag.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Protection level
    */
    @SerializedName("ProtectLevel")
    @Expose
    private String ProtectLevel;

    /**
    * protection duration
    */
    @SerializedName("ProtectedDay")
    @Expose
    private Long ProtectedDay;

    /**
     * Get vpc-id 
     * @return VpcId vpc-id
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpc-id
     * @param VpcId vpc-id
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc-name 
     * @return VpcName vpc-name
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc-name
     * @param VpcName vpc-name
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Asset name 
     * @return AssetName Asset name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
     * @param AssetName Asset name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Operating system. 
     * @return Os Operating system.
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set Operating system.
     * @param Os Operating system.
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get Public IP address 
     * @return PublicIp Public IP address
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP address
     * @param PublicIp Public IP address
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP address 
     * @return PrivateIp Private IP address
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP address
     * @param PrivateIp Private IP address
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Region. 
     * @return Region Region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
     * @param Region Region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Asset type 
     * @return AssetType Asset type
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
     * @param AssetType Asset type
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Asset ID 
     * @return AssetId Asset ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
     * @param AssetId Asset ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Number of accounts 
     * @return AccountNum Number of accounts
     */
    public Long getAccountNum() {
        return this.AccountNum;
    }

    /**
     * Set Number of accounts
     * @param AccountNum Number of accounts
     */
    public void setAccountNum(Long AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * Get Number of Ports 
     * @return PortNum Number of Ports
     */
    public Long getPortNum() {
        return this.PortNum;
    }

    /**
     * Set Number of Ports
     * @param PortNum Number of Ports
     */
    public void setPortNum(Long PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get Process quantity 
     * @return ProcessNum Process quantity
     */
    public Long getProcessNum() {
        return this.ProcessNum;
    }

    /**
     * Set Process quantity
     * @param ProcessNum Process quantity
     */
    public void setProcessNum(Long ProcessNum) {
        this.ProcessNum = ProcessNum;
    }

    /**
     * Get Number of Software Applications 
     * @return SoftApplicationNum Number of Software Applications
     */
    public Long getSoftApplicationNum() {
        return this.SoftApplicationNum;
    }

    /**
     * Set Number of Software Applications
     * @param SoftApplicationNum Number of Software Applications
     */
    public void setSoftApplicationNum(Long SoftApplicationNum) {
        this.SoftApplicationNum = SoftApplicationNum;
    }

    /**
     * Get Database Count 
     * @return DatabaseNum Database Count
     */
    public Long getDatabaseNum() {
        return this.DatabaseNum;
    }

    /**
     * Set Database Count
     * @param DatabaseNum Database Count
     */
    public void setDatabaseNum(Long DatabaseNum) {
        this.DatabaseNum = DatabaseNum;
    }

    /**
     * Get Number of Web Applications 
     * @return WebApplicationNum Number of Web Applications
     */
    public Long getWebApplicationNum() {
        return this.WebApplicationNum;
    }

    /**
     * Set Number of Web Applications
     * @param WebApplicationNum Number of Web Applications
     */
    public void setWebApplicationNum(Long WebApplicationNum) {
        this.WebApplicationNum = WebApplicationNum;
    }

    /**
     * Get Number of services 
     * @return ServiceNum Number of services
     */
    public Long getServiceNum() {
        return this.ServiceNum;
    }

    /**
     * Set Number of services
     * @param ServiceNum Number of services
     */
    public void setServiceNum(Long ServiceNum) {
        this.ServiceNum = ServiceNum;
    }

    /**
     * Get Web Framework Count 
     * @return WebFrameworkNum Web Framework Count
     */
    public Long getWebFrameworkNum() {
        return this.WebFrameworkNum;
    }

    /**
     * Set Web Framework Count
     * @param WebFrameworkNum Web Framework Count
     */
    public void setWebFrameworkNum(Long WebFrameworkNum) {
        this.WebFrameworkNum = WebFrameworkNum;
    }

    /**
     * Get Website Count 
     * @return WebSiteNum Website Count
     */
    public Long getWebSiteNum() {
        return this.WebSiteNum;
    }

    /**
     * Set Website Count
     * @param WebSiteNum Website Count
     */
    public void setWebSiteNum(Long WebSiteNum) {
        this.WebSiteNum = WebSiteNum;
    }

    /**
     * Get Jar Package Count 
     * @return JarPackageNum Jar Package Count
     */
    public Long getJarPackageNum() {
        return this.JarPackageNum;
    }

    /**
     * Set Jar Package Count
     * @param JarPackageNum Jar Package Count
     */
    public void setJarPackageNum(Long JarPackageNum) {
        this.JarPackageNum = JarPackageNum;
    }

    /**
     * Get Started Service Count 
     * @return StartServiceNum Started Service Count
     */
    public Long getStartServiceNum() {
        return this.StartServiceNum;
    }

    /**
     * Set Started Service Count
     * @param StartServiceNum Started Service Count
     */
    public void setStartServiceNum(Long StartServiceNum) {
        this.StartServiceNum = StartServiceNum;
    }

    /**
     * Get Number of Scheduled Tasks 
     * @return ScheduledTaskNum Number of Scheduled Tasks
     */
    public Long getScheduledTaskNum() {
        return this.ScheduledTaskNum;
    }

    /**
     * Set Number of Scheduled Tasks
     * @param ScheduledTaskNum Number of Scheduled Tasks
     */
    public void setScheduledTaskNum(Long ScheduledTaskNum) {
        this.ScheduledTaskNum = ScheduledTaskNum;
    }

    /**
     * Get Number of Environment Variables 
     * @return EnvironmentVariableNum Number of Environment Variables
     */
    public Long getEnvironmentVariableNum() {
        return this.EnvironmentVariableNum;
    }

    /**
     * Set Number of Environment Variables
     * @param EnvironmentVariableNum Number of Environment Variables
     */
    public void setEnvironmentVariableNum(Long EnvironmentVariableNum) {
        this.EnvironmentVariableNum = EnvironmentVariableNum;
    }

    /**
     * Get Number of Kernel Modules 
     * @return KernelModuleNum Number of Kernel Modules
     */
    public Long getKernelModuleNum() {
        return this.KernelModuleNum;
    }

    /**
     * Set Number of Kernel Modules
     * @param KernelModuleNum Number of Kernel Modules
     */
    public void setKernelModuleNum(Long KernelModuleNum) {
        this.KernelModuleNum = KernelModuleNum;
    }

    /**
     * Get System Installation Package Count 
     * @return SystemInstallationPackageNum System Installation Package Count
     */
    public Long getSystemInstallationPackageNum() {
        return this.SystemInstallationPackageNum;
    }

    /**
     * Set System Installation Package Count
     * @param SystemInstallationPackageNum System Installation Package Count
     */
    public void setSystemInstallationPackageNum(Long SystemInstallationPackageNum) {
        this.SystemInstallationPackageNum = SystemInstallationPackageNum;
    }

    /**
     * Get remaining protection duration 
     * @return SurplusProtectDay remaining protection duration
     */
    public Long getSurplusProtectDay() {
        return this.SurplusProtectDay;
    }

    /**
     * Set remaining protection duration
     * @param SurplusProtectDay remaining protection duration
     */
    public void setSurplusProtectDay(Long SurplusProtectDay) {
        this.SurplusProtectDay = SurplusProtectDay;
    }

    /**
     * Get Whether client is installed. 1 for Installed, 0 for Not Installed. 
     * @return CWPStatus Whether client is installed. 1 for Installed, 0 for Not Installed.
     */
    public Long getCWPStatus() {
        return this.CWPStatus;
    }

    /**
     * Set Whether client is installed. 1 for Installed, 0 for Not Installed.
     * @param CWPStatus Whether client is installed. 1 for Installed, 0 for Not Installed.
     */
    public void setCWPStatus(Long CWPStatus) {
        this.CWPStatus = CWPStatus;
    }

    /**
     * Get Tag. 
     * @return Tag Tag.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tag.
     * @param Tag Tag.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Protection level 
     * @return ProtectLevel Protection level
     */
    public String getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set Protection level
     * @param ProtectLevel Protection level
     */
    public void setProtectLevel(String ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get protection duration 
     * @return ProtectedDay protection duration
     */
    public Long getProtectedDay() {
        return this.ProtectedDay;
    }

    /**
     * Set protection duration
     * @param ProtectedDay protection duration
     */
    public void setProtectedDay(Long ProtectedDay) {
        this.ProtectedDay = ProtectedDay;
    }

    public AssetBaseInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetBaseInfoResponse(AssetBaseInfoResponse source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.Os != null) {
            this.Os = new String(source.Os);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AccountNum != null) {
            this.AccountNum = new Long(source.AccountNum);
        }
        if (source.PortNum != null) {
            this.PortNum = new Long(source.PortNum);
        }
        if (source.ProcessNum != null) {
            this.ProcessNum = new Long(source.ProcessNum);
        }
        if (source.SoftApplicationNum != null) {
            this.SoftApplicationNum = new Long(source.SoftApplicationNum);
        }
        if (source.DatabaseNum != null) {
            this.DatabaseNum = new Long(source.DatabaseNum);
        }
        if (source.WebApplicationNum != null) {
            this.WebApplicationNum = new Long(source.WebApplicationNum);
        }
        if (source.ServiceNum != null) {
            this.ServiceNum = new Long(source.ServiceNum);
        }
        if (source.WebFrameworkNum != null) {
            this.WebFrameworkNum = new Long(source.WebFrameworkNum);
        }
        if (source.WebSiteNum != null) {
            this.WebSiteNum = new Long(source.WebSiteNum);
        }
        if (source.JarPackageNum != null) {
            this.JarPackageNum = new Long(source.JarPackageNum);
        }
        if (source.StartServiceNum != null) {
            this.StartServiceNum = new Long(source.StartServiceNum);
        }
        if (source.ScheduledTaskNum != null) {
            this.ScheduledTaskNum = new Long(source.ScheduledTaskNum);
        }
        if (source.EnvironmentVariableNum != null) {
            this.EnvironmentVariableNum = new Long(source.EnvironmentVariableNum);
        }
        if (source.KernelModuleNum != null) {
            this.KernelModuleNum = new Long(source.KernelModuleNum);
        }
        if (source.SystemInstallationPackageNum != null) {
            this.SystemInstallationPackageNum = new Long(source.SystemInstallationPackageNum);
        }
        if (source.SurplusProtectDay != null) {
            this.SurplusProtectDay = new Long(source.SurplusProtectDay);
        }
        if (source.CWPStatus != null) {
            this.CWPStatus = new Long(source.CWPStatus);
        }
        if (source.Tag != null) {
            this.Tag = new Tag[source.Tag.length];
            for (int i = 0; i < source.Tag.length; i++) {
                this.Tag[i] = new Tag(source.Tag[i]);
            }
        }
        if (source.ProtectLevel != null) {
            this.ProtectLevel = new String(source.ProtectLevel);
        }
        if (source.ProtectedDay != null) {
            this.ProtectedDay = new Long(source.ProtectedDay);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AccountNum", this.AccountNum);
        this.setParamSimple(map, prefix + "PortNum", this.PortNum);
        this.setParamSimple(map, prefix + "ProcessNum", this.ProcessNum);
        this.setParamSimple(map, prefix + "SoftApplicationNum", this.SoftApplicationNum);
        this.setParamSimple(map, prefix + "DatabaseNum", this.DatabaseNum);
        this.setParamSimple(map, prefix + "WebApplicationNum", this.WebApplicationNum);
        this.setParamSimple(map, prefix + "ServiceNum", this.ServiceNum);
        this.setParamSimple(map, prefix + "WebFrameworkNum", this.WebFrameworkNum);
        this.setParamSimple(map, prefix + "WebSiteNum", this.WebSiteNum);
        this.setParamSimple(map, prefix + "JarPackageNum", this.JarPackageNum);
        this.setParamSimple(map, prefix + "StartServiceNum", this.StartServiceNum);
        this.setParamSimple(map, prefix + "ScheduledTaskNum", this.ScheduledTaskNum);
        this.setParamSimple(map, prefix + "EnvironmentVariableNum", this.EnvironmentVariableNum);
        this.setParamSimple(map, prefix + "KernelModuleNum", this.KernelModuleNum);
        this.setParamSimple(map, prefix + "SystemInstallationPackageNum", this.SystemInstallationPackageNum);
        this.setParamSimple(map, prefix + "SurplusProtectDay", this.SurplusProtectDay);
        this.setParamSimple(map, prefix + "CWPStatus", this.CWPStatus);
        this.setParamArrayObj(map, prefix + "Tag.", this.Tag);
        this.setParamSimple(map, prefix + "ProtectLevel", this.ProtectLevel);
        this.setParamSimple(map, prefix + "ProtectedDay", this.ProtectedDay);

    }
}

