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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssetBaseInfoResponse extends AbstractModel {

    /**
    * 
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * vpc-name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Operating system
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Total number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("AccountNum")
    @Expose
    private Long AccountNum;

    /**
    * Number of ports
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PortNum")
    @Expose
    private Long PortNum;

    /**
    * Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcessNum")
    @Expose
    private Long ProcessNum;

    /**
    * Numbernumb of software applications
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SoftApplicationNum")
    @Expose
    private Long SoftApplicationNum;

    /**
    * Number of databases
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("DatabaseNum")
    @Expose
    private Long DatabaseNum;

    /**
    * Number of web applications
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebApplicationNum")
    @Expose
    private Long WebApplicationNum;

    /**
    * Number of services
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceNum")
    @Expose
    private Long ServiceNum;

    /**
    * Number of web frameworks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebFrameworkNum")
    @Expose
    private Long WebFrameworkNum;

    /**
    * Number of websites
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("WebSiteNum")
    @Expose
    private Long WebSiteNum;

    /**
    * Number of JAR packages
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("JarPackageNum")
    @Expose
    private Long JarPackageNum;

    /**
    * Number of enabled services
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("StartServiceNum")
    @Expose
    private Long StartServiceNum;

    /**
    * Number of scheduled tasks
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ScheduledTaskNum")
    @Expose
    private Long ScheduledTaskNum;

    /**
    * Number of environment variables
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnvironmentVariableNum")
    @Expose
    private Long EnvironmentVariableNum;

    /**
    * Number of kernel modules
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("KernelModuleNum")
    @Expose
    private Long KernelModuleNum;

    /**
    * Number of system installation packages
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SystemInstallationPackageNum")
    @Expose
    private Long SystemInstallationPackageNum;

    /**
    * Remaining service validity in days
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("SurplusProtectDay")
    @Expose
    private Long SurplusProtectDay;

    /**
    * Whether the CWPP agent is installed. Values: `1` (installed) and `0` (not installed)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("CWPStatus")
    @Expose
    private Long CWPStatus;

    /**
    * Tags
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tag")
    @Expose
    private Tag [] Tag;

    /**
    * Protection level
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectLevel")
    @Expose
    private String ProtectLevel;

    /**
    * Usage of CWPP service in days
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectedDay")
    @Expose
    private Long ProtectedDay;

    /**
     * Get  
     * @return VpcId 
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 
     * @param VpcId 
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get vpc-name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return VpcName vpc-name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set vpc-name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param VpcName vpc-name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get Asset name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetName Asset name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Operating system
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Os Operating system
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * Set Operating system
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Os Operating system
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * Get Public IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PublicIp Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PublicIp Public IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Private IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PrivateIp Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PrivateIp Private IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get Region
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Asset type
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetType Asset type
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Asset ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AssetId Asset ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Total number of accounts
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return AccountNum Total number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getAccountNum() {
        return this.AccountNum;
    }

    /**
     * Set Total number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param AccountNum Total number of accounts
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setAccountNum(Long AccountNum) {
        this.AccountNum = AccountNum;
    }

    /**
     * Get Number of ports
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PortNum Number of ports
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getPortNum() {
        return this.PortNum;
    }

    /**
     * Set Number of ports
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PortNum Number of ports
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPortNum(Long PortNum) {
        this.PortNum = PortNum;
    }

    /**
     * Get Number of processes
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ProcessNum Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getProcessNum() {
        return this.ProcessNum;
    }

    /**
     * Set Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ProcessNum Number of processes
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setProcessNum(Long ProcessNum) {
        this.ProcessNum = ProcessNum;
    }

    /**
     * Get Numbernumb of software applications
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SoftApplicationNum Numbernumb of software applications
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getSoftApplicationNum() {
        return this.SoftApplicationNum;
    }

    /**
     * Set Numbernumb of software applications
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SoftApplicationNum Numbernumb of software applications
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSoftApplicationNum(Long SoftApplicationNum) {
        this.SoftApplicationNum = SoftApplicationNum;
    }

    /**
     * Get Number of databases
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return DatabaseNum Number of databases
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getDatabaseNum() {
        return this.DatabaseNum;
    }

    /**
     * Set Number of databases
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param DatabaseNum Number of databases
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setDatabaseNum(Long DatabaseNum) {
        this.DatabaseNum = DatabaseNum;
    }

    /**
     * Get Number of web applications
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WebApplicationNum Number of web applications
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWebApplicationNum() {
        return this.WebApplicationNum;
    }

    /**
     * Set Number of web applications
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WebApplicationNum Number of web applications
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWebApplicationNum(Long WebApplicationNum) {
        this.WebApplicationNum = WebApplicationNum;
    }

    /**
     * Get Number of services
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ServiceNum Number of services
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getServiceNum() {
        return this.ServiceNum;
    }

    /**
     * Set Number of services
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ServiceNum Number of services
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setServiceNum(Long ServiceNum) {
        this.ServiceNum = ServiceNum;
    }

    /**
     * Get Number of web frameworks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WebFrameworkNum Number of web frameworks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWebFrameworkNum() {
        return this.WebFrameworkNum;
    }

    /**
     * Set Number of web frameworks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WebFrameworkNum Number of web frameworks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWebFrameworkNum(Long WebFrameworkNum) {
        this.WebFrameworkNum = WebFrameworkNum;
    }

    /**
     * Get Number of websites
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return WebSiteNum Number of websites
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getWebSiteNum() {
        return this.WebSiteNum;
    }

    /**
     * Set Number of websites
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param WebSiteNum Number of websites
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setWebSiteNum(Long WebSiteNum) {
        this.WebSiteNum = WebSiteNum;
    }

    /**
     * Get Number of JAR packages
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return JarPackageNum Number of JAR packages
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getJarPackageNum() {
        return this.JarPackageNum;
    }

    /**
     * Set Number of JAR packages
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param JarPackageNum Number of JAR packages
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setJarPackageNum(Long JarPackageNum) {
        this.JarPackageNum = JarPackageNum;
    }

    /**
     * Get Number of enabled services
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return StartServiceNum Number of enabled services
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getStartServiceNum() {
        return this.StartServiceNum;
    }

    /**
     * Set Number of enabled services
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param StartServiceNum Number of enabled services
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStartServiceNum(Long StartServiceNum) {
        this.StartServiceNum = StartServiceNum;
    }

    /**
     * Get Number of scheduled tasks
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ScheduledTaskNum Number of scheduled tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getScheduledTaskNum() {
        return this.ScheduledTaskNum;
    }

    /**
     * Set Number of scheduled tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ScheduledTaskNum Number of scheduled tasks
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setScheduledTaskNum(Long ScheduledTaskNum) {
        this.ScheduledTaskNum = ScheduledTaskNum;
    }

    /**
     * Get Number of environment variables
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return EnvironmentVariableNum Number of environment variables
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getEnvironmentVariableNum() {
        return this.EnvironmentVariableNum;
    }

    /**
     * Set Number of environment variables
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param EnvironmentVariableNum Number of environment variables
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setEnvironmentVariableNum(Long EnvironmentVariableNum) {
        this.EnvironmentVariableNum = EnvironmentVariableNum;
    }

    /**
     * Get Number of kernel modules
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return KernelModuleNum Number of kernel modules
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getKernelModuleNum() {
        return this.KernelModuleNum;
    }

    /**
     * Set Number of kernel modules
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param KernelModuleNum Number of kernel modules
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setKernelModuleNum(Long KernelModuleNum) {
        this.KernelModuleNum = KernelModuleNum;
    }

    /**
     * Get Number of system installation packages
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SystemInstallationPackageNum Number of system installation packages
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getSystemInstallationPackageNum() {
        return this.SystemInstallationPackageNum;
    }

    /**
     * Set Number of system installation packages
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SystemInstallationPackageNum Number of system installation packages
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSystemInstallationPackageNum(Long SystemInstallationPackageNum) {
        this.SystemInstallationPackageNum = SystemInstallationPackageNum;
    }

    /**
     * Get Remaining service validity in days
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return SurplusProtectDay Remaining service validity in days
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getSurplusProtectDay() {
        return this.SurplusProtectDay;
    }

    /**
     * Set Remaining service validity in days
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param SurplusProtectDay Remaining service validity in days
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setSurplusProtectDay(Long SurplusProtectDay) {
        this.SurplusProtectDay = SurplusProtectDay;
    }

    /**
     * Get Whether the CWPP agent is installed. Values: `1` (installed) and `0` (not installed)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return CWPStatus Whether the CWPP agent is installed. Values: `1` (installed) and `0` (not installed)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getCWPStatus() {
        return this.CWPStatus;
    }

    /**
     * Set Whether the CWPP agent is installed. Values: `1` (installed) and `0` (not installed)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param CWPStatus Whether the CWPP agent is installed. Values: `1` (installed) and `0` (not installed)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setCWPStatus(Long CWPStatus) {
        this.CWPStatus = CWPStatus;
    }

    /**
     * Get Tags
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Tag Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Tag [] getTag() {
        return this.Tag;
    }

    /**
     * Set Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Tag Tags
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setTag(Tag [] Tag) {
        this.Tag = Tag;
    }

    /**
     * Get Protection level
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ProtectLevel Protection level
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getProtectLevel() {
        return this.ProtectLevel;
    }

    /**
     * Set Protection level
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ProtectLevel Protection level
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setProtectLevel(String ProtectLevel) {
        this.ProtectLevel = ProtectLevel;
    }

    /**
     * Get Usage of CWPP service in days
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ProtectedDay Usage of CWPP service in days
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getProtectedDay() {
        return this.ProtectedDay;
    }

    /**
     * Set Usage of CWPP service in days
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ProtectedDay Usage of CWPP service in days
Note: This field may return·null, indicating that no valid values can be obtained.
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

