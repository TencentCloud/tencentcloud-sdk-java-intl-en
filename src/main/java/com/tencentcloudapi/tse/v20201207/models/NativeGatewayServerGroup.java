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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NativeGatewayServerGroup extends AbstractModel {

    /**
    * Cloud-Native Gateway Group Unique id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * Group name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description information
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Node specification, number of nodes info
    */
    @SerializedName("NodeConfig")
    @Expose
    private CloudNativeAPIGatewayNodeConfig NodeConfig;

    /**
    * Gateway group status.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Creation time.
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Whether it is the default group.
0: No.
1: Yes.
    */
    @SerializedName("IsFirstGroup")
    @Expose
    private Long IsFirstGroup;

    /**
    * Associate policy information
    */
    @SerializedName("BindingStrategy")
    @Expose
    private CloudNativeAPIGatewayStrategy BindingStrategy;

    /**
    * Gateway instance ID.
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * Bandwidth
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * Modification time.
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * Subnet ID
    */
    @SerializedName("SubnetIds")
    @Expose
    private String SubnetIds;

    /**
    * Default weight of the group
    */
    @SerializedName("DefaultWeight")
    @Expose
    private Long DefaultWeight;

    /**
    * elastic node
    */
    @SerializedName("ElasticNumber")
    @Expose
    private Long ElasticNumber;

    /**
    * Whether TOA is supported
    */
    @SerializedName("SupportTOA")
    @Expose
    private Boolean SupportTOA;

    /**
    * Whether IPV6 is supported
    */
    @SerializedName("SupportIPV6")
    @Expose
    private Boolean SupportIPV6;

    /**
     * Get Cloud-Native Gateway Group Unique id 
     * @return GroupId Cloud-Native Gateway Group Unique id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set Cloud-Native Gateway Group Unique id
     * @param GroupId Cloud-Native Gateway Group Unique id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get Group name 
     * @return Name Group name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Group name
     * @param Name Group name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description information 
     * @return Description Description information
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description information
     * @param Description Description information
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Node specification, number of nodes info 
     * @return NodeConfig Node specification, number of nodes info
     */
    public CloudNativeAPIGatewayNodeConfig getNodeConfig() {
        return this.NodeConfig;
    }

    /**
     * Set Node specification, number of nodes info
     * @param NodeConfig Node specification, number of nodes info
     */
    public void setNodeConfig(CloudNativeAPIGatewayNodeConfig NodeConfig) {
        this.NodeConfig = NodeConfig;
    }

    /**
     * Get Gateway group status. 
     * @return Status Gateway group status.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Gateway group status.
     * @param Status Gateway group status.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time. 
     * @return CreateTime Creation time.
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time.
     * @param CreateTime Creation time.
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Whether it is the default group.
0: No.
1: Yes. 
     * @return IsFirstGroup Whether it is the default group.
0: No.
1: Yes.
     */
    public Long getIsFirstGroup() {
        return this.IsFirstGroup;
    }

    /**
     * Set Whether it is the default group.
0: No.
1: Yes.
     * @param IsFirstGroup Whether it is the default group.
0: No.
1: Yes.
     */
    public void setIsFirstGroup(Long IsFirstGroup) {
        this.IsFirstGroup = IsFirstGroup;
    }

    /**
     * Get Associate policy information 
     * @return BindingStrategy Associate policy information
     */
    public CloudNativeAPIGatewayStrategy getBindingStrategy() {
        return this.BindingStrategy;
    }

    /**
     * Set Associate policy information
     * @param BindingStrategy Associate policy information
     */
    public void setBindingStrategy(CloudNativeAPIGatewayStrategy BindingStrategy) {
        this.BindingStrategy = BindingStrategy;
    }

    /**
     * Get Gateway instance ID. 
     * @return GatewayId Gateway instance ID.
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set Gateway instance ID.
     * @param GatewayId Gateway instance ID.
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get Bandwidth 
     * @return InternetMaxBandwidthOut Bandwidth
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Bandwidth
     * @param InternetMaxBandwidthOut Bandwidth
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get Modification time. 
     * @return ModifyTime Modification time.
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time.
     * @param ModifyTime Modification time.
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get Subnet ID 
     * @return SubnetIds Subnet ID
     */
    public String getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set Subnet ID
     * @param SubnetIds Subnet ID
     */
    public void setSubnetIds(String SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get Default weight of the group 
     * @return DefaultWeight Default weight of the group
     */
    public Long getDefaultWeight() {
        return this.DefaultWeight;
    }

    /**
     * Set Default weight of the group
     * @param DefaultWeight Default weight of the group
     */
    public void setDefaultWeight(Long DefaultWeight) {
        this.DefaultWeight = DefaultWeight;
    }

    /**
     * Get elastic node 
     * @return ElasticNumber elastic node
     */
    public Long getElasticNumber() {
        return this.ElasticNumber;
    }

    /**
     * Set elastic node
     * @param ElasticNumber elastic node
     */
    public void setElasticNumber(Long ElasticNumber) {
        this.ElasticNumber = ElasticNumber;
    }

    /**
     * Get Whether TOA is supported 
     * @return SupportTOA Whether TOA is supported
     */
    public Boolean getSupportTOA() {
        return this.SupportTOA;
    }

    /**
     * Set Whether TOA is supported
     * @param SupportTOA Whether TOA is supported
     */
    public void setSupportTOA(Boolean SupportTOA) {
        this.SupportTOA = SupportTOA;
    }

    /**
     * Get Whether IPV6 is supported 
     * @return SupportIPV6 Whether IPV6 is supported
     */
    public Boolean getSupportIPV6() {
        return this.SupportIPV6;
    }

    /**
     * Set Whether IPV6 is supported
     * @param SupportIPV6 Whether IPV6 is supported
     */
    public void setSupportIPV6(Boolean SupportIPV6) {
        this.SupportIPV6 = SupportIPV6;
    }

    public NativeGatewayServerGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NativeGatewayServerGroup(NativeGatewayServerGroup source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NodeConfig != null) {
            this.NodeConfig = new CloudNativeAPIGatewayNodeConfig(source.NodeConfig);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.IsFirstGroup != null) {
            this.IsFirstGroup = new Long(source.IsFirstGroup);
        }
        if (source.BindingStrategy != null) {
            this.BindingStrategy = new CloudNativeAPIGatewayStrategy(source.BindingStrategy);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String(source.SubnetIds);
        }
        if (source.DefaultWeight != null) {
            this.DefaultWeight = new Long(source.DefaultWeight);
        }
        if (source.ElasticNumber != null) {
            this.ElasticNumber = new Long(source.ElasticNumber);
        }
        if (source.SupportTOA != null) {
            this.SupportTOA = new Boolean(source.SupportTOA);
        }
        if (source.SupportIPV6 != null) {
            this.SupportIPV6 = new Boolean(source.SupportIPV6);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "NodeConfig.", this.NodeConfig);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "IsFirstGroup", this.IsFirstGroup);
        this.setParamObj(map, prefix + "BindingStrategy.", this.BindingStrategy);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "SubnetIds", this.SubnetIds);
        this.setParamSimple(map, prefix + "DefaultWeight", this.DefaultWeight);
        this.setParamSimple(map, prefix + "ElasticNumber", this.ElasticNumber);
        this.setParamSimple(map, prefix + "SupportTOA", this.SupportTOA);
        this.setParamSimple(map, prefix + "SupportIPV6", this.SupportIPV6);

    }
}

