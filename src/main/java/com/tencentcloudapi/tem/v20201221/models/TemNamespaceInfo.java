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
package com.tencentcloudapi.tem.v20201221.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemNamespaceInfo extends AbstractModel{

    /**
    * Namespace ID
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * Channel
    */
    @SerializedName("Channel")
    @Expose
    private String Channel;

    /**
    * Namespace name
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * Region name
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Namespace description
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Status. 1: terminated; 0: normal
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * VPC
    */
    @SerializedName("Vpc")
    @Expose
    private String Vpc;

    /**
    * Creation time
    */
    @SerializedName("CreateDate")
    @Expose
    private String CreateDate;

    /**
    * Modification time
    */
    @SerializedName("ModifyDate")
    @Expose
    private String ModifyDate;

    /**
    * Modifier
    */
    @SerializedName("Modifier")
    @Expose
    private String Modifier;

    /**
    * Creator
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * Number of services
    */
    @SerializedName("ServiceNum")
    @Expose
    private Long ServiceNum;

    /**
    * Number of running instances
    */
    @SerializedName("RunInstancesNum")
    @Expose
    private Long RunInstancesNum;

    /**
    * Subnet
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * TCB environment status
    */
    @SerializedName("TcbEnvStatus")
    @Expose
    private String TcbEnvStatus;

    /**
    * eks cluster status
    */
    @SerializedName("ClusterStatus")
    @Expose
    private String ClusterStatus;

    /**
    * Whether to enable TSW
    */
    @SerializedName("EnableTswTraceService")
    @Expose
    private Boolean EnableTswTraceService;

    /**
     * Get Namespace ID 
     * @return NamespaceId Namespace ID
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set Namespace ID
     * @param NamespaceId Namespace ID
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * Get Channel 
     * @return Channel Channel
     */
    public String getChannel() {
        return this.Channel;
    }

    /**
     * Set Channel
     * @param Channel Channel
     */
    public void setChannel(String Channel) {
        this.Channel = Channel;
    }

    /**
     * Get Namespace name 
     * @return NamespaceName Namespace name
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * Set Namespace name
     * @param NamespaceName Namespace name
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * Get Region name 
     * @return Region Region name
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name
     * @param Region Region name
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Namespace description
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Description Namespace description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Namespace description
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Description Namespace description
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Status. 1: terminated; 0: normal 
     * @return Status Status. 1: terminated; 0: normal
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status. 1: terminated; 0: normal
     * @param Status Status. 1: terminated; 0: normal
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get VPC 
     * @return Vpc VPC
     */
    public String getVpc() {
        return this.Vpc;
    }

    /**
     * Set VPC
     * @param Vpc VPC
     */
    public void setVpc(String Vpc) {
        this.Vpc = Vpc;
    }

    /**
     * Get Creation time 
     * @return CreateDate Creation time
     */
    public String getCreateDate() {
        return this.CreateDate;
    }

    /**
     * Set Creation time
     * @param CreateDate Creation time
     */
    public void setCreateDate(String CreateDate) {
        this.CreateDate = CreateDate;
    }

    /**
     * Get Modification time 
     * @return ModifyDate Modification time
     */
    public String getModifyDate() {
        return this.ModifyDate;
    }

    /**
     * Set Modification time
     * @param ModifyDate Modification time
     */
    public void setModifyDate(String ModifyDate) {
        this.ModifyDate = ModifyDate;
    }

    /**
     * Get Modifier 
     * @return Modifier Modifier
     */
    public String getModifier() {
        return this.Modifier;
    }

    /**
     * Set Modifier
     * @param Modifier Modifier
     */
    public void setModifier(String Modifier) {
        this.Modifier = Modifier;
    }

    /**
     * Get Creator 
     * @return Creator Creator
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set Creator
     * @param Creator Creator
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
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
     * Get Number of running instances 
     * @return RunInstancesNum Number of running instances
     */
    public Long getRunInstancesNum() {
        return this.RunInstancesNum;
    }

    /**
     * Set Number of running instances
     * @param RunInstancesNum Number of running instances
     */
    public void setRunInstancesNum(Long RunInstancesNum) {
        this.RunInstancesNum = RunInstancesNum;
    }

    /**
     * Get Subnet 
     * @return SubnetId Subnet
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Subnet
     * @param SubnetId Subnet
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get TCB environment status 
     * @return TcbEnvStatus TCB environment status
     */
    public String getTcbEnvStatus() {
        return this.TcbEnvStatus;
    }

    /**
     * Set TCB environment status
     * @param TcbEnvStatus TCB environment status
     */
    public void setTcbEnvStatus(String TcbEnvStatus) {
        this.TcbEnvStatus = TcbEnvStatus;
    }

    /**
     * Get eks cluster status 
     * @return ClusterStatus eks cluster status
     */
    public String getClusterStatus() {
        return this.ClusterStatus;
    }

    /**
     * Set eks cluster status
     * @param ClusterStatus eks cluster status
     */
    public void setClusterStatus(String ClusterStatus) {
        this.ClusterStatus = ClusterStatus;
    }

    /**
     * Get Whether to enable TSW 
     * @return EnableTswTraceService Whether to enable TSW
     */
    public Boolean getEnableTswTraceService() {
        return this.EnableTswTraceService;
    }

    /**
     * Set Whether to enable TSW
     * @param EnableTswTraceService Whether to enable TSW
     */
    public void setEnableTswTraceService(Boolean EnableTswTraceService) {
        this.EnableTswTraceService = EnableTswTraceService;
    }

    public TemNamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemNamespaceInfo(TemNamespaceInfo source) {
        if (source.NamespaceId != null) {
            this.NamespaceId = new String(source.NamespaceId);
        }
        if (source.Channel != null) {
            this.Channel = new String(source.Channel);
        }
        if (source.NamespaceName != null) {
            this.NamespaceName = new String(source.NamespaceName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Vpc != null) {
            this.Vpc = new String(source.Vpc);
        }
        if (source.CreateDate != null) {
            this.CreateDate = new String(source.CreateDate);
        }
        if (source.ModifyDate != null) {
            this.ModifyDate = new String(source.ModifyDate);
        }
        if (source.Modifier != null) {
            this.Modifier = new String(source.Modifier);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.ServiceNum != null) {
            this.ServiceNum = new Long(source.ServiceNum);
        }
        if (source.RunInstancesNum != null) {
            this.RunInstancesNum = new Long(source.RunInstancesNum);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.TcbEnvStatus != null) {
            this.TcbEnvStatus = new String(source.TcbEnvStatus);
        }
        if (source.ClusterStatus != null) {
            this.ClusterStatus = new String(source.ClusterStatus);
        }
        if (source.EnableTswTraceService != null) {
            this.EnableTswTraceService = new Boolean(source.EnableTswTraceService);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Channel", this.Channel);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Vpc", this.Vpc);
        this.setParamSimple(map, prefix + "CreateDate", this.CreateDate);
        this.setParamSimple(map, prefix + "ModifyDate", this.ModifyDate);
        this.setParamSimple(map, prefix + "Modifier", this.Modifier);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "ServiceNum", this.ServiceNum);
        this.setParamSimple(map, prefix + "RunInstancesNum", this.RunInstancesNum);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "TcbEnvStatus", this.TcbEnvStatus);
        this.setParamSimple(map, prefix + "ClusterStatus", this.ClusterStatus);
        this.setParamSimple(map, prefix + "EnableTswTraceService", this.EnableTswTraceService);

    }
}

