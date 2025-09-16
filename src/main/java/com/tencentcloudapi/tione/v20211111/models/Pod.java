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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Pod extends AbstractModel {

    /**
    * Pod name.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Unique ID of the Pod.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uid")
    @Expose
    private String Uid;

    /**
    * Service payment mode.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * Pod status.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Phase")
    @Expose
    private String Phase;

    /**
    * Pod IP address.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * Pod creation time.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Container list.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Containers")
    @Expose
    private Container Containers;

    /**
    * Container list.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ContainerInfos")
    @Expose
    private Container [] ContainerInfos;

    /**
    * Container calling information.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CrossTenantENIInfo")
    @Expose
    private CrossTenantENIInfo CrossTenantENIInfo;

    /**
    * Instance status information.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Instance scheduling start time.
    */
    @SerializedName("StartScheduleTime")
    @Expose
    private String StartScheduleTime;

    /**
    * Supplemental instance status information.
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * Node IP address of the current instance.
    */
    @SerializedName("NodeIP")
    @Expose
    private String NodeIP;

    /**
    * Node ID of the current instance.
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * Resource group ID to which the instance belonged.
    */
    @SerializedName("ResourceGroupId")
    @Expose
    private String ResourceGroupId;

    /**
    * Resource group name.
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * Resource usage information of the instance.
    */
    @SerializedName("ResourceInfo")
    @Expose
    private ResourceInfo ResourceInfo;

    /**
     * Get Pod name.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Pod name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Pod name.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Pod name.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Unique ID of the Pod.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uid Unique ID of the Pod.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUid() {
        return this.Uid;
    }

    /**
     * Set Unique ID of the Pod.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uid Unique ID of the Pod.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUid(String Uid) {
        this.Uid = Uid;
    }

    /**
     * Get Service payment mode.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ChargeType Service payment mode.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set Service payment mode.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ChargeType Service payment mode.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get Pod status.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Phase Pod status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPhase() {
        return this.Phase;
    }

    /**
     * Set Pod status.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Phase Pod status.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPhase(String Phase) {
        this.Phase = Phase;
    }

    /**
     * Get Pod IP address.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IP Pod IP address.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set Pod IP address.Note: This field may return null, indicating that no valid values can be obtained.
     * @param IP Pod IP address.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get Pod creation time.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CreateTime Pod creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Pod creation time.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CreateTime Pod creation time.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Container list.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Containers Container list.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public Container getContainers() {
        return this.Containers;
    }

    /**
     * Set Container list.Note: This field may return null, indicating that no valid values can be obtained.
     * @param Containers Container list.Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setContainers(Container Containers) {
        this.Containers = Containers;
    }

    /**
     * Get Container list.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ContainerInfos Container list.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Container [] getContainerInfos() {
        return this.ContainerInfos;
    }

    /**
     * Set Container list.Note: This field may return null, indicating that no valid values can be obtained.
     * @param ContainerInfos Container list.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setContainerInfos(Container [] ContainerInfos) {
        this.ContainerInfos = ContainerInfos;
    }

    /**
     * Get Container calling information.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CrossTenantENIInfo Container calling information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CrossTenantENIInfo getCrossTenantENIInfo() {
        return this.CrossTenantENIInfo;
    }

    /**
     * Set Container calling information.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CrossTenantENIInfo Container calling information.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCrossTenantENIInfo(CrossTenantENIInfo CrossTenantENIInfo) {
        this.CrossTenantENIInfo = CrossTenantENIInfo;
    }

    /**
     * Get Instance status information. 
     * @return Status Instance status information.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Instance status information.
     * @param Status Instance status information.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Instance scheduling start time. 
     * @return StartScheduleTime Instance scheduling start time.
     */
    public String getStartScheduleTime() {
        return this.StartScheduleTime;
    }

    /**
     * Set Instance scheduling start time.
     * @param StartScheduleTime Instance scheduling start time.
     */
    public void setStartScheduleTime(String StartScheduleTime) {
        this.StartScheduleTime = StartScheduleTime;
    }

    /**
     * Get Supplemental instance status information. 
     * @return Message Supplemental instance status information.
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set Supplemental instance status information.
     * @param Message Supplemental instance status information.
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get Node IP address of the current instance. 
     * @return NodeIP Node IP address of the current instance.
     */
    public String getNodeIP() {
        return this.NodeIP;
    }

    /**
     * Set Node IP address of the current instance.
     * @param NodeIP Node IP address of the current instance.
     */
    public void setNodeIP(String NodeIP) {
        this.NodeIP = NodeIP;
    }

    /**
     * Get Node ID of the current instance. 
     * @return NodeId Node ID of the current instance.
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set Node ID of the current instance.
     * @param NodeId Node ID of the current instance.
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get Resource group ID to which the instance belonged. 
     * @return ResourceGroupId Resource group ID to which the instance belonged.
     */
    public String getResourceGroupId() {
        return this.ResourceGroupId;
    }

    /**
     * Set Resource group ID to which the instance belonged.
     * @param ResourceGroupId Resource group ID to which the instance belonged.
     */
    public void setResourceGroupId(String ResourceGroupId) {
        this.ResourceGroupId = ResourceGroupId;
    }

    /**
     * Get Resource group name. 
     * @return ResourceGroupName Resource group name.
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Resource group name.
     * @param ResourceGroupName Resource group name.
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get Resource usage information of the instance. 
     * @return ResourceInfo Resource usage information of the instance.
     */
    public ResourceInfo getResourceInfo() {
        return this.ResourceInfo;
    }

    /**
     * Set Resource usage information of the instance.
     * @param ResourceInfo Resource usage information of the instance.
     */
    public void setResourceInfo(ResourceInfo ResourceInfo) {
        this.ResourceInfo = ResourceInfo;
    }

    public Pod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Pod(Pod source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Uid != null) {
            this.Uid = new String(source.Uid);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.Phase != null) {
            this.Phase = new String(source.Phase);
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Containers != null) {
            this.Containers = new Container(source.Containers);
        }
        if (source.ContainerInfos != null) {
            this.ContainerInfos = new Container[source.ContainerInfos.length];
            for (int i = 0; i < source.ContainerInfos.length; i++) {
                this.ContainerInfos[i] = new Container(source.ContainerInfos[i]);
            }
        }
        if (source.CrossTenantENIInfo != null) {
            this.CrossTenantENIInfo = new CrossTenantENIInfo(source.CrossTenantENIInfo);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StartScheduleTime != null) {
            this.StartScheduleTime = new String(source.StartScheduleTime);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.NodeIP != null) {
            this.NodeIP = new String(source.NodeIP);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.ResourceGroupId != null) {
            this.ResourceGroupId = new String(source.ResourceGroupId);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
        }
        if (source.ResourceInfo != null) {
            this.ResourceInfo = new ResourceInfo(source.ResourceInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Uid", this.Uid);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "Phase", this.Phase);
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamObj(map, prefix + "Containers.", this.Containers);
        this.setParamArrayObj(map, prefix + "ContainerInfos.", this.ContainerInfos);
        this.setParamObj(map, prefix + "CrossTenantENIInfo.", this.CrossTenantENIInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartScheduleTime", this.StartScheduleTime);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "NodeIP", this.NodeIP);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "ResourceGroupId", this.ResourceGroupId);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamObj(map, prefix + "ResourceInfo.", this.ResourceInfo);

    }
}

