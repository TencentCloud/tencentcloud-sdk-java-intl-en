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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CynosdbInstanceGroup extends AbstractModel {

    /**
    * 
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * 
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 
    */
    @SerializedName("DeletedTime")
    @Expose
    private String DeletedTime;

    /**
    * 
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private String InstanceGroupId;

    /**
    * 
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Type of the instance group (network). ha-ha group; ro - read-only group; proxy - proxy; singleRo - read-only instance exclusive.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * 
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * 
    */
    @SerializedName("WanDomain")
    @Expose
    private String WanDomain;

    /**
    * 
    */
    @SerializedName("WanIP")
    @Expose
    private String WanIP;

    /**
    * 
    */
    @SerializedName("WanPort")
    @Expose
    private Long WanPort;

    /**
    * 
    */
    @SerializedName("WanStatus")
    @Expose
    private String WanStatus;

    /**
    * 
    */
    @SerializedName("InstanceSet")
    @Expose
    private CynosdbInstance [] InstanceSet;

    /**
    * VPC ID
    */
    @SerializedName("UniqVpcId")
    @Expose
    private String UniqVpcId;

    /**
    * Specifies the subnet ID.
    */
    @SerializedName("UniqSubnetId")
    @Expose
    private String UniqSubnetId;

    /**
    * Recycling IP information.
    */
    @SerializedName("OldAddrInfo")
    @Expose
    private OldAddrInfo OldAddrInfo;

    /**
    * 
    */
    @SerializedName("ProcessingTasks")
    @Expose
    private String [] ProcessingTasks;

    /**
    * 
    */
    @SerializedName("Tasks")
    @Expose
    private ObjectTask [] Tasks;

    /**
    * 
    */
    @SerializedName("NetServiceId")
    @Expose
    private Long NetServiceId;

    /**
     * Get  
     * @return AppId 
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 
     * @param AppId 
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get  
     * @return ClusterId 
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 
     * @param ClusterId 
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get  
     * @return CreatedTime 
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 
     * @param CreatedTime 
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get  
     * @return DeletedTime 
     */
    public String getDeletedTime() {
        return this.DeletedTime;
    }

    /**
     * Set 
     * @param DeletedTime 
     */
    public void setDeletedTime(String DeletedTime) {
        this.DeletedTime = DeletedTime;
    }

    /**
     * Get  
     * @return InstanceGroupId 
     */
    public String getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set 
     * @param InstanceGroupId 
     */
    public void setInstanceGroupId(String InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get  
     * @return Status 
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 
     * @param Status 
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Type of the instance group (network). ha-ha group; ro - read-only group; proxy - proxy; singleRo - read-only instance exclusive. 
     * @return Type Type of the instance group (network). ha-ha group; ro - read-only group; proxy - proxy; singleRo - read-only instance exclusive.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of the instance group (network). ha-ha group; ro - read-only group; proxy - proxy; singleRo - read-only instance exclusive.
     * @param Type Type of the instance group (network). ha-ha group; ro - read-only group; proxy - proxy; singleRo - read-only instance exclusive.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get  
     * @return UpdatedTime 
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * Set 
     * @param UpdatedTime 
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * Get  
     * @return Vip 
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 
     * @param Vip 
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get  
     * @return Vport 
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set 
     * @param Vport 
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get  
     * @return WanDomain 
     */
    public String getWanDomain() {
        return this.WanDomain;
    }

    /**
     * Set 
     * @param WanDomain 
     */
    public void setWanDomain(String WanDomain) {
        this.WanDomain = WanDomain;
    }

    /**
     * Get  
     * @return WanIP 
     */
    public String getWanIP() {
        return this.WanIP;
    }

    /**
     * Set 
     * @param WanIP 
     */
    public void setWanIP(String WanIP) {
        this.WanIP = WanIP;
    }

    /**
     * Get  
     * @return WanPort 
     */
    public Long getWanPort() {
        return this.WanPort;
    }

    /**
     * Set 
     * @param WanPort 
     */
    public void setWanPort(Long WanPort) {
        this.WanPort = WanPort;
    }

    /**
     * Get  
     * @return WanStatus 
     */
    public String getWanStatus() {
        return this.WanStatus;
    }

    /**
     * Set 
     * @param WanStatus 
     */
    public void setWanStatus(String WanStatus) {
        this.WanStatus = WanStatus;
    }

    /**
     * Get  
     * @return InstanceSet 
     */
    public CynosdbInstance [] getInstanceSet() {
        return this.InstanceSet;
    }

    /**
     * Set 
     * @param InstanceSet 
     */
    public void setInstanceSet(CynosdbInstance [] InstanceSet) {
        this.InstanceSet = InstanceSet;
    }

    /**
     * Get VPC ID 
     * @return UniqVpcId VPC ID
     */
    public String getUniqVpcId() {
        return this.UniqVpcId;
    }

    /**
     * Set VPC ID
     * @param UniqVpcId VPC ID
     */
    public void setUniqVpcId(String UniqVpcId) {
        this.UniqVpcId = UniqVpcId;
    }

    /**
     * Get Specifies the subnet ID. 
     * @return UniqSubnetId Specifies the subnet ID.
     */
    public String getUniqSubnetId() {
        return this.UniqSubnetId;
    }

    /**
     * Set Specifies the subnet ID.
     * @param UniqSubnetId Specifies the subnet ID.
     */
    public void setUniqSubnetId(String UniqSubnetId) {
        this.UniqSubnetId = UniqSubnetId;
    }

    /**
     * Get Recycling IP information. 
     * @return OldAddrInfo Recycling IP information.
     */
    public OldAddrInfo getOldAddrInfo() {
        return this.OldAddrInfo;
    }

    /**
     * Set Recycling IP information.
     * @param OldAddrInfo Recycling IP information.
     */
    public void setOldAddrInfo(OldAddrInfo OldAddrInfo) {
        this.OldAddrInfo = OldAddrInfo;
    }

    /**
     * Get  
     * @return ProcessingTasks 
     */
    public String [] getProcessingTasks() {
        return this.ProcessingTasks;
    }

    /**
     * Set 
     * @param ProcessingTasks 
     */
    public void setProcessingTasks(String [] ProcessingTasks) {
        this.ProcessingTasks = ProcessingTasks;
    }

    /**
     * Get  
     * @return Tasks 
     */
    public ObjectTask [] getTasks() {
        return this.Tasks;
    }

    /**
     * Set 
     * @param Tasks 
     */
    public void setTasks(ObjectTask [] Tasks) {
        this.Tasks = Tasks;
    }

    /**
     * Get  
     * @return NetServiceId 
     */
    public Long getNetServiceId() {
        return this.NetServiceId;
    }

    /**
     * Set 
     * @param NetServiceId 
     */
    public void setNetServiceId(Long NetServiceId) {
        this.NetServiceId = NetServiceId;
    }

    public CynosdbInstanceGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CynosdbInstanceGroup(CynosdbInstanceGroup source) {
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DeletedTime != null) {
            this.DeletedTime = new String(source.DeletedTime);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new String(source.InstanceGroupId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.UpdatedTime != null) {
            this.UpdatedTime = new String(source.UpdatedTime);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.WanDomain != null) {
            this.WanDomain = new String(source.WanDomain);
        }
        if (source.WanIP != null) {
            this.WanIP = new String(source.WanIP);
        }
        if (source.WanPort != null) {
            this.WanPort = new Long(source.WanPort);
        }
        if (source.WanStatus != null) {
            this.WanStatus = new String(source.WanStatus);
        }
        if (source.InstanceSet != null) {
            this.InstanceSet = new CynosdbInstance[source.InstanceSet.length];
            for (int i = 0; i < source.InstanceSet.length; i++) {
                this.InstanceSet[i] = new CynosdbInstance(source.InstanceSet[i]);
            }
        }
        if (source.UniqVpcId != null) {
            this.UniqVpcId = new String(source.UniqVpcId);
        }
        if (source.UniqSubnetId != null) {
            this.UniqSubnetId = new String(source.UniqSubnetId);
        }
        if (source.OldAddrInfo != null) {
            this.OldAddrInfo = new OldAddrInfo(source.OldAddrInfo);
        }
        if (source.ProcessingTasks != null) {
            this.ProcessingTasks = new String[source.ProcessingTasks.length];
            for (int i = 0; i < source.ProcessingTasks.length; i++) {
                this.ProcessingTasks[i] = new String(source.ProcessingTasks[i]);
            }
        }
        if (source.Tasks != null) {
            this.Tasks = new ObjectTask[source.Tasks.length];
            for (int i = 0; i < source.Tasks.length; i++) {
                this.Tasks[i] = new ObjectTask(source.Tasks[i]);
            }
        }
        if (source.NetServiceId != null) {
            this.NetServiceId = new Long(source.NetServiceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DeletedTime", this.DeletedTime);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "WanDomain", this.WanDomain);
        this.setParamSimple(map, prefix + "WanIP", this.WanIP);
        this.setParamSimple(map, prefix + "WanPort", this.WanPort);
        this.setParamSimple(map, prefix + "WanStatus", this.WanStatus);
        this.setParamArrayObj(map, prefix + "InstanceSet.", this.InstanceSet);
        this.setParamSimple(map, prefix + "UniqVpcId", this.UniqVpcId);
        this.setParamSimple(map, prefix + "UniqSubnetId", this.UniqSubnetId);
        this.setParamObj(map, prefix + "OldAddrInfo.", this.OldAddrInfo);
        this.setParamArraySimple(map, prefix + "ProcessingTasks.", this.ProcessingTasks);
        this.setParamArrayObj(map, prefix + "Tasks.", this.Tasks);
        this.setParamSimple(map, prefix + "NetServiceId", this.NetServiceId);

    }
}

