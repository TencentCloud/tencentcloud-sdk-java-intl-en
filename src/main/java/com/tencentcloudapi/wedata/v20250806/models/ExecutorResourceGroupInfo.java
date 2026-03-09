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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExecutorResourceGroupInfo extends AbstractModel {

    /**
    * Resource group unique id.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Resource group description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Execute the resource group type. values cannot be empty.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupType")
    @Expose
    private String ResourceGroupType;

    /**
    * Project set.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AssociateProjects")
    @Expose
    private BindProject [] AssociateProjects;

    /**
    * Region.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * vpcId
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SubNet")
    @Expose
    private String SubNet;

    /**
    * Whether to perform auto-renewal.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
     * Get Resource group unique id. 
     * @return Id Resource group unique id.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Resource group unique id.
     * @param Id Resource group unique id.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Resource group name.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Name Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Name Resource group name.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Resource group description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Resource group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Resource group description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Resource group description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Execute the resource group type. values cannot be empty.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupType Execute the resource group type. values cannot be empty.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupType() {
        return this.ResourceGroupType;
    }

    /**
     * Set Execute the resource group type. values cannot be empty.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupType Execute the resource group type. values cannot be empty.

-Schedule --- scheduling resource group.
-Integration - integration resource group.
-DataService - data service resource group.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupType(String ResourceGroupType) {
        this.ResourceGroupType = ResourceGroupType;
    }

    /**
     * Get Project set.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AssociateProjects Project set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public BindProject [] getAssociateProjects() {
        return this.AssociateProjects;
    }

    /**
     * Set Project set.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AssociateProjects Project set.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAssociateProjects(BindProject [] AssociateProjects) {
        this.AssociateProjects = AssociateProjects;
    }

    /**
     * Get Region.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get vpcId
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VpcId vpcId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VpcId vpcId
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SubNet Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSubNet() {
        return this.SubNet;
    }

    /**
     * Set Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SubNet Subnet ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSubNet(String SubNet) {
        this.SubNet = SubNet;
    }

    /**
     * Get Whether to perform auto-renewal.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AutoRenewEnabled Whether to perform auto-renewal.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set Whether to perform auto-renewal.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AutoRenewEnabled Whether to perform auto-renewal.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    public ExecutorResourceGroupInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExecutorResourceGroupInfo(ExecutorResourceGroupInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ResourceGroupType != null) {
            this.ResourceGroupType = new String(source.ResourceGroupType);
        }
        if (source.AssociateProjects != null) {
            this.AssociateProjects = new BindProject[source.AssociateProjects.length];
            for (int i = 0; i < source.AssociateProjects.length; i++) {
                this.AssociateProjects[i] = new BindProject(source.AssociateProjects[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubNet != null) {
            this.SubNet = new String(source.SubNet);
        }
        if (source.AutoRenewEnabled != null) {
            this.AutoRenewEnabled = new Boolean(source.AutoRenewEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ResourceGroupType", this.ResourceGroupType);
        this.setParamArrayObj(map, prefix + "AssociateProjects.", this.AssociateProjects);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubNet", this.SubNet);
        this.setParamSimple(map, prefix + "AutoRenewEnabled", this.AutoRenewEnabled);

    }
}

