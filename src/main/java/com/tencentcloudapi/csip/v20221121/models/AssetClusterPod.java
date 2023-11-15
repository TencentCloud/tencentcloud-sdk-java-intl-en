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
    * Region
Note: This field may return·null, indicating that no valid values can be obtained.
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
    * Creation time of the pod
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceCreateTime")
    @Expose
    private String InstanceCreateTime;

    /**
    * Namespace
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * Status
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Cluster ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Cluster name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * Server ID
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineId")
    @Expose
    private String MachineId;

    /**
    * Server name
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * Pod IP
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * Number of associated services
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * Number of associated containers
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerCount")
    @Expose
    private Long ContainerCount;

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
    * Whether it's a critical asset. Values: `1` (critical asset), `0` (non-critical asset)
Note: This field may return·null, indicating that no valid values can be obtained.
    */
    @SerializedName("IsCore")
    @Expose
    private Long IsCore;

    /**
    * Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
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
     * Get Creation time of the pod
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return InstanceCreateTime Creation time of the pod
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getInstanceCreateTime() {
        return this.InstanceCreateTime;
    }

    /**
     * Set Creation time of the pod
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param InstanceCreateTime Creation time of the pod
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setInstanceCreateTime(String InstanceCreateTime) {
        this.InstanceCreateTime = InstanceCreateTime;
    }

    /**
     * Get Namespace
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Namespace Namespace
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set Namespace
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Namespace Namespace
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get Status
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return Status Status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param Status Status
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Cluster ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ClusterId Cluster ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ClusterId Cluster ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Cluster name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ClusterName Cluster name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set Cluster name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ClusterName Cluster name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get Server ID
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return MachineId Server ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getMachineId() {
        return this.MachineId;
    }

    /**
     * Set Server ID
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param MachineId Server ID
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setMachineId(String MachineId) {
        this.MachineId = MachineId;
    }

    /**
     * Get Server name
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return MachineName Server name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * Set Server name
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param MachineName Server name
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * Get Pod IP
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return PodIp Pod IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set Pod IP
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param PodIp Pod IP
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get Number of associated services
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ServiceCount Number of associated services
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set Number of associated services
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ServiceCount Number of associated services
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get Number of associated containers
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return ContainerCount Number of associated containers
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getContainerCount() {
        return this.ContainerCount;
    }

    /**
     * Set Number of associated containers
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param ContainerCount Number of associated containers
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setContainerCount(Long ContainerCount) {
        this.ContainerCount = ContainerCount;
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
     * Get Whether it's a critical asset. Values: `1` (critical asset), `0` (non-critical asset)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsCore Whether it's a critical asset. Values: `1` (critical asset), `0` (non-critical asset)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsCore() {
        return this.IsCore;
    }

    /**
     * Set Whether it's a critical asset. Values: `1` (critical asset), `0` (non-critical asset)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsCore Whether it's a critical asset. Values: `1` (critical asset), `0` (non-critical asset)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public void setIsCore(Long IsCore) {
        this.IsCore = IsCore;
    }

    /**
     * Get Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained. 
     * @return IsNewAsset Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     */
    public Long getIsNewAsset() {
        return this.IsNewAsset;
    }

    /**
     * Set Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
     * @param IsNewAsset Whether it's a newly-added asset. Values: `1` (Yes), `0` (No)
Note: This field may return·null, indicating that no valid values can be obtained.
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

