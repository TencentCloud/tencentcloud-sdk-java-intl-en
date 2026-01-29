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

public class AssetCluster extends AbstractModel {

    /**
    * Tenant ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Tenant uin.
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Tenant Nickname
    */
    @SerializedName("Nick")
    @Expose
    private String Nick;

    /**
    * Region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Cluster ID.
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Cluster name.
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Cluster type.
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * Cluster Creation Time
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster protection status, enumerate on the left, display on the right.
Protection status of the cluster. 
0: not connected.
Unprotected. 
2: partial protection. 
3: under protection. 
4: access exception. 
5: accessing. 
Uninstalling. 
7: uninstallation exception.
    */
    @SerializedName("ProtectStatus")
    @Expose
    private Long ProtectStatus;

    /**
    * Access information, being empty indicates no access exception info.
    */
    @SerializedName("ProtectInfo")
    @Expose
    private String ProtectInfo;

    /**
    * VPC id.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPC name.
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * kubernetes version.
    */
    @SerializedName("KubernetesVersion")
    @Expose
    private String KubernetesVersion;

    /**
    * Runtime component.
    */
    @SerializedName("Component")
    @Expose
    private String Component;

    /**
    * Runtime component version.
    */
    @SerializedName("ComponentVersion")
    @Expose
    private String ComponentVersion;

    /**
    * Component status.
    */
    @SerializedName("ComponentStatus")
    @Expose
    private String ComponentStatus;

    /**
    * Health Checkup Time
    */
    @SerializedName("CheckTime")
    @Expose
    private String CheckTime;

    /**
    * Associated hosts.
    */
    @SerializedName("MachineCount")
    @Expose
    private Long MachineCount;

    /**
    * Associated Pod Count
    */
    @SerializedName("PodCount")
    @Expose
    private Long PodCount;

    /**
    * Associated Service Count
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Vulnerability risk.
    */
    @SerializedName("VulRisk")
    @Expose
    private Long VulRisk;

    /**
    * Configuration risk.
    */
    @SerializedName("CFGRisk")
    @Expose
    private Long CFGRisk;

    /**
    * Health Checkup Count
    */
    @SerializedName("CheckCount")
    @Expose
    private Long CheckCount;

    /**
    * Whether it is core. 1: Core; 2: Non-core.
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * New Asset or Not. 1: New
    */
    @SerializedName("IsNewAsset")
    @Expose
    private Long IsNewAsset;

    /**
    * Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
    */
    @SerializedName("CloudType")
    @Expose
    private Long CloudType;

    /**
     * Get Tenant ID 
     * @return AppId Tenant ID
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set Tenant ID
     * @param AppId Tenant ID
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get Tenant uin. 
     * @return Uin Tenant uin.
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Tenant uin.
     * @param Uin Tenant uin.
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Tenant Nickname 
     * @return Nick Tenant Nickname
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set Tenant Nickname
     * @param Nick Tenant Nickname
     */
    public void setNick(String Nick) {
        this.Nick = Nick;
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
     * Get Cluster ID. 
     * @return AssetId Cluster ID.
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Cluster ID.
     * @param AssetId Cluster ID.
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Cluster name. 
     * @return AssetName Cluster name.
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Cluster name.
     * @param AssetName Cluster name.
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Cluster type. 
     * @return AssetType Cluster type.
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set Cluster type.
     * @param AssetType Cluster type.
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get Cluster Creation Time 
     * @return InstanceCreateTime Cluster Creation Time
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set Cluster Creation Time
     * @param InstanceCreateTime Cluster Creation Time
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get Status. 
     * @return Status Status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status.
     * @param Status Status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster protection status, enumerate on the left, display on the right.
Protection status of the cluster. 
0: not connected.
Unprotected. 
2: partial protection. 
3: under protection. 
4: access exception. 
5: accessing. 
Uninstalling. 
7: uninstallation exception. 
     * @return ProtectStatus Cluster protection status, enumerate on the left, display on the right.
Protection status of the cluster. 
0: not connected.
Unprotected. 
2: partial protection. 
3: under protection. 
4: access exception. 
5: accessing. 
Uninstalling. 
7: uninstallation exception.
     */
    public Long getProtectStatus() {
        return this.ProtectStatus;
    }

    /**
     * Set Cluster protection status, enumerate on the left, display on the right.
Protection status of the cluster. 
0: not connected.
Unprotected. 
2: partial protection. 
3: under protection. 
4: access exception. 
5: accessing. 
Uninstalling. 
7: uninstallation exception.
     * @param ProtectStatus Cluster protection status, enumerate on the left, display on the right.
Protection status of the cluster. 
0: not connected.
Unprotected. 
2: partial protection. 
3: under protection. 
4: access exception. 
5: accessing. 
Uninstalling. 
7: uninstallation exception.
     */
    public void setProtectStatus(Long ProtectStatus) {
        this.ProtectStatus = ProtectStatus;
    }

    /**
     * Get Access information, being empty indicates no access exception info. 
     * @return ProtectInfo Access information, being empty indicates no access exception info.
     */
    public String getProtectInfo() {
        return this.ProtectInfo;
    }

    /**
     * Set Access information, being empty indicates no access exception info.
     * @param ProtectInfo Access information, being empty indicates no access exception info.
     */
    public void setProtectInfo(String ProtectInfo) {
        this.ProtectInfo = ProtectInfo;
    }

    /**
     * Get VPC id. 
     * @return VpcId VPC id.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC id.
     * @param VpcId VPC id.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get VPC name. 
     * @return VpcName VPC name.
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set VPC name.
     * @param VpcName VPC name.
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get kubernetes version. 
     * @return KubernetesVersion kubernetes version.
     */
    public String getKubernetesVersion() {
        return this.KubernetesVersion;
    }

    /**
     * Set kubernetes version.
     * @param KubernetesVersion kubernetes version.
     */
    public void setKubernetesVersion(String KubernetesVersion) {
        this.KubernetesVersion = KubernetesVersion;
    }

    /**
     * Get Runtime component. 
     * @return Component Runtime component.
     */
    public String getComponent() {
        return this.Component;
    }

    /**
     * Set Runtime component.
     * @param Component Runtime component.
     */
    public void setComponent(String Component) {
        this.Component = Component;
    }

    /**
     * Get Runtime component version. 
     * @return ComponentVersion Runtime component version.
     */
    public String getComponentVersion() {
        return this.ComponentVersion;
    }

    /**
     * Set Runtime component version.
     * @param ComponentVersion Runtime component version.
     */
    public void setComponentVersion(String ComponentVersion) {
        this.ComponentVersion = ComponentVersion;
    }

    /**
     * Get Component status. 
     * @return ComponentStatus Component status.
     */
    public String getComponentStatus() {
        return this.ComponentStatus;
    }

    /**
     * Set Component status.
     * @param ComponentStatus Component status.
     */
    public void setComponentStatus(String ComponentStatus) {
        this.ComponentStatus = ComponentStatus;
    }

    /**
     * Get Health Checkup Time 
     * @return CheckTime Health Checkup Time
     */
    public String getCheckTime() {
        return this.CheckTime;
    }

    /**
     * Set Health Checkup Time
     * @param CheckTime Health Checkup Time
     */
    public void setCheckTime(String CheckTime) {
        this.CheckTime = CheckTime;
    }

    /**
     * Get Associated hosts. 
     * @return MachineCount Associated hosts.
     */
    public Long getMachineCount() {
        return this.MachineCount;
    }

    /**
     * Set Associated hosts.
     * @param MachineCount Associated hosts.
     */
    public void setMachineCount(Long MachineCount) {
        this.MachineCount = MachineCount;
    }

    /**
     * Get Associated Pod Count 
     * @return PodCount Associated Pod Count
     */
    public Long getPodCount() {
        return this.PodCount;
    }

    /**
     * Set Associated Pod Count
     * @param PodCount Associated Pod Count
     */
    public void setPodCount(Long PodCount) {
        this.PodCount = PodCount;
    }

    /**
     * Get Associated Service Count 
     * @return ServiceCount Associated Service Count
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Associated Service Count
     * @param ServiceCount Associated Service Count
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Vulnerability risk. 
     * @return VulRisk Vulnerability risk.
     */
    public Long getVulRisk() {
        return this.VulRisk;
    }

    /**
     * Set Vulnerability risk.
     * @param VulRisk Vulnerability risk.
     */
    public void setVulRisk(Long VulRisk) {
        this.VulRisk = VulRisk;
    }

    /**
     * Get Configuration risk. 
     * @return CFGRisk Configuration risk.
     */
    public Long getCFGRisk() {
        return this.CFGRisk;
    }

    /**
     * Set Configuration risk.
     * @param CFGRisk Configuration risk.
     */
    public void setCFGRisk(Long CFGRisk) {
        this.CFGRisk = CFGRisk;
    }

    /**
     * Get Health Checkup Count 
     * @return CheckCount Health Checkup Count
     */
    public Long getCheckCount() {
        return this.CheckCount;
    }

    /**
     * Set Health Checkup Count
     * @param CheckCount Health Checkup Count
     */
    public void setCheckCount(Long CheckCount) {
        this.CheckCount = CheckCount;
    }

    /**
     * Get Whether it is core. 1: Core; 2: Non-core. 
     * @return IsCore Whether it is core. 1: Core; 2: Non-core.
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Whether it is core. 1: Core; 2: Non-core.
     * @param IsCore Whether it is core. 1: Core; 2: Non-core.
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get New Asset or Not. 1: New 
     * @return IsNewAsset New Asset or Not. 1: New
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set New Asset or Not. 1: New
     * @param IsNewAsset New Asset or Not. 1: New
     */
    public void setIsNewAsset(Long IsNewAsset) {
        this.IsNewAsset = IsNewAsset;
    }

    /**
     * Get Cloud asset type: 0: tencent cloud, 1: aws, 2: azure. 
     * @return CloudType Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
     */
    public Long getCloudType() {
        return this.CloudType;
    }

    /**
     * Set Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
     * @param CloudType Cloud asset type: 0: tencent cloud, 1: aws, 2: azure.
     */
    public void setCloudType(Long CloudType) {
        this.CloudType = CloudType;
    }

    public AssetCluster() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetCluster(AssetCluster source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.Nick != null) {
            this.Nick = new String(source.Nick);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.AssetName != null) {
            this.AssetName = new String(source.AssetName);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProtectStatus != null) {
            this.ProtectStatus = new Long(source.ProtectStatus);
        }
        if (source.ProtectInfo != null) {
            this.ProtectInfo = new String(source.ProtectInfo);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.KubernetesVersion != null) {
            this.KubernetesVersion = new String(source.KubernetesVersion);
        }
        if (source.Component != null) {
            this.Component = new String(source.Component);
        }
        if (source.ComponentVersion != null) {
            this.ComponentVersion = new String(source.ComponentVersion);
        }
        if (source.ComponentStatus != null) {
            this.ComponentStatus = new String(source.ComponentStatus);
        }
        if (source.CheckTime != null) {
            this.CheckTime = new String(source.CheckTime);
        }
        if (source.MachineCount != null) {
            this.MachineCount = new Long(source.MachineCount);
        }
        if (source.PodCount != null) {
            this.PodCount = new Long(source.PodCount);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.VulRisk != null) {
            this.VulRisk = new Long(source.VulRisk);
        }
        if (source.CFGRisk != null) {
            this.CFGRisk = new Long(source.CFGRisk);
        }
        if (source.CheckCount != null) {
            this.CheckCount = new Long(source.CheckCount);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
        }
        if (source.CloudType != null) {
            this.CloudType = new Long(source.CloudType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Nick", this.Nick);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "AssetName", this.AssetName);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProtectStatus", this.ProtectStatus);
        this.setParamSimple(map, prefix + "ProtectInfo", this.ProtectInfo);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "KubernetesVersion", this.KubernetesVersion);
        this.setParamSimple(map, prefix + "Component", this.Component);
        this.setParamSimple(map, prefix + "ComponentVersion", this.ComponentVersion);
        this.setParamSimple(map, prefix + "ComponentStatus", this.ComponentStatus);
        this.setParamSimple(map, prefix + "CheckTime", this.CheckTime);
        this.setParamSimple(map, prefix + "MachineCount", this.MachineCount);
        this.setParamSimple(map, prefix + "PodCount", this.PodCount);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "VulRisk", this.VulRisk);
        this.setParamSimple(map, prefix + "CFGRisk", this.CFGRisk);
        this.setParamSimple(map, prefix + "CheckCount", this.CheckCount);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);

    }
}

