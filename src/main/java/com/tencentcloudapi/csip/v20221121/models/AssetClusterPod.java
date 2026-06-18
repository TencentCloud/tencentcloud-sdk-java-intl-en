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

public class AssetClusterPod extends AbstractModel {

    /**
    * Tenant ID
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * Tenant UIN
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * Tenant name
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
    * Pod ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * Pod name
    */
    @SerializedName("AssetName")
    @Expose
    private String AssetName;

    /**
    * Pod Creation Time
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * Namespace
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster ID.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Host ID
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * host name
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * pod ip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Associated Service Count
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Associated container number
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

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
     * Get Tenant UIN 
     * @return Uin Tenant UIN
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set Tenant UIN
     * @param Uin Tenant UIN
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get Tenant name 
     * @return Nick Tenant name
     */
    public String getNick() {
        return this.Nick;
    }

    /**
     * Set Tenant name
     * @param Nick Tenant name
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
     * Get Pod ID 
     * @return AssetId Pod ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set Pod ID
     * @param AssetId Pod ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get Pod name 
     * @return AssetName Pod name
     */
    public String getAssetName() {
        return this.AssetName;
    }

    /**
     * Set Pod name
     * @param AssetName Pod name
     */
    public void setAssetName(String AssetName) {
        this.AssetName = AssetName;
    }

    /**
     * Get Pod Creation Time 
     * @return InstanceCreateTime Pod Creation Time
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set Pod Creation Time
     * @param InstanceCreateTime Pod Creation Time
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get Namespace 
     * @return Namespace Namespace
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
     * @param Namespace Namespace
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
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
     * Get Cluster ID. 
     * @return ClusterId Cluster ID.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID.
     * @param ClusterId Cluster ID.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name. 
     * @return ClusterName Cluster name.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name.
     * @param ClusterName Cluster name.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Host ID 
     * @return MachineId Host ID
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set Host ID
     * @param MachineId Host ID
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get host name 
     * @return MachineName host name
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set host name
     * @param MachineName host name
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get pod ip 
     * @return PodIp pod ip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set pod ip
     * @param PodIp pod ip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
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
     * Get Associated container number 
     * @return ContainerCount Associated container number
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Associated container number
     * @param ContainerCount Associated container number
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
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

    public AssetClusterPod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssetClusterPod(AssetClusterPod source) {
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
        if (source.InstanceCreateTime != null) {
            this.InstanceCreateTime = new String(source.InstanceCreateTime);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.ClusterName != null) {
            this.ClusterName = new String(source.ClusterName);
        }
        if (source.MachineId != null) {
            this.MachineId = new String(source.MachineId);
        }
        if (source.MachineName != null) {
            this.MachineName = new String(source.MachineName);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.ContainerCount != null) {
            this.ContainerCount = new Long(source.ContainerCount);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.IsCore != null) {
            this.IsCore = new Long(source.IsCore);
        }
        if (source.IsNewAsset != null) {
            this.IsNewAsset = new Long(source.IsNewAsset);
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
        this.setParamSimple(map, prefix + "InstanceCreateTime", this.InstanceCreateTime);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "MachineId", this.MachineId);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "ContainerCount", this.ContainerCount);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "IsCore", this.IsCore);
        this.setParamSimple(map, prefix + "IsNewAsset", this.IsNewAsset);

    }
}

