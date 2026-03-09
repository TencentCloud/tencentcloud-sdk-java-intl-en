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

public class CreateResourceGroupRequest extends AbstractModel {

    /**
    * Resource group name. specifies the name of a general resource group. it must start with a letter, may include letters, numbers, and underscores (_), and can contain up to 64 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Opened resource group information.
    */
    @SerializedName("Type")
    @Expose
    private ResourceType Type;

    /**
    * Whether to perform auto-renewal.
    */
    @SerializedName("AutoRenewEnabled")
    @Expose
    private Boolean AutoRenewEnabled;

    /**
    * Purchase duration, in unit month.
    */
    @SerializedName("PurchasePeriod")
    @Expose
    private Long PurchasePeriod;

    /**
    * vpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Subnet
    */
    @SerializedName("SubNet")
    @Expose
    private String SubNet;

    /**
    * Resource purchase region.
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * Project id of the associated project space.
    */
    @SerializedName("AssociatedProjectId")
    @Expose
    private String AssociatedProjectId;

    /**
    * Resource group description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Resource group name. specifies the name of a general resource group. it must start with a letter, may include letters, numbers, and underscores (_), and can contain up to 64 characters. 
     * @return Name Resource group name. specifies the name of a general resource group. it must start with a letter, may include letters, numbers, and underscores (_), and can contain up to 64 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Resource group name. specifies the name of a general resource group. it must start with a letter, may include letters, numbers, and underscores (_), and can contain up to 64 characters.
     * @param Name Resource group name. specifies the name of a general resource group. it must start with a letter, may include letters, numbers, and underscores (_), and can contain up to 64 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Opened resource group information. 
     * @return Type Opened resource group information.
     */
    public ResourceType getType() {
        return this.Type;
    }

    /**
     * Set Opened resource group information.
     * @param Type Opened resource group information.
     */
    public void setType(ResourceType Type) {
        this.Type = Type;
    }

    /**
     * Get Whether to perform auto-renewal. 
     * @return AutoRenewEnabled Whether to perform auto-renewal.
     */
    public Boolean getAutoRenewEnabled() {
        return this.AutoRenewEnabled;
    }

    /**
     * Set Whether to perform auto-renewal.
     * @param AutoRenewEnabled Whether to perform auto-renewal.
     */
    public void setAutoRenewEnabled(Boolean AutoRenewEnabled) {
        this.AutoRenewEnabled = AutoRenewEnabled;
    }

    /**
     * Get Purchase duration, in unit month. 
     * @return PurchasePeriod Purchase duration, in unit month.
     */
    public Long getPurchasePeriod() {
        return this.PurchasePeriod;
    }

    /**
     * Set Purchase duration, in unit month.
     * @param PurchasePeriod Purchase duration, in unit month.
     */
    public void setPurchasePeriod(Long PurchasePeriod) {
        this.PurchasePeriod = PurchasePeriod;
    }

    /**
     * Get vpcId 
     * @return VpcId vpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set vpcId
     * @param VpcId vpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Subnet 
     * @return SubNet Subnet
     */
    public String getSubNet() {
        return this.SubNet;
    }

    /**
     * Set Subnet
     * @param SubNet Subnet
     */
    public void setSubNet(String SubNet) {
        this.SubNet = SubNet;
    }

    /**
     * Get Resource purchase region. 
     * @return ResourceRegion Resource purchase region.
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set Resource purchase region.
     * @param ResourceRegion Resource purchase region.
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * Get Project id of the associated project space. 
     * @return AssociatedProjectId Project id of the associated project space.
     */
    public String getAssociatedProjectId() {
        return this.AssociatedProjectId;
    }

    /**
     * Set Project id of the associated project space.
     * @param AssociatedProjectId Project id of the associated project space.
     */
    public void setAssociatedProjectId(String AssociatedProjectId) {
        this.AssociatedProjectId = AssociatedProjectId;
    }

    /**
     * Get Resource group description 
     * @return Description Resource group description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Resource group description
     * @param Description Resource group description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public CreateResourceGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateResourceGroupRequest(CreateResourceGroupRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new ResourceType(source.Type);
        }
        if (source.AutoRenewEnabled != null) {
            this.AutoRenewEnabled = new Boolean(source.AutoRenewEnabled);
        }
        if (source.PurchasePeriod != null) {
            this.PurchasePeriod = new Long(source.PurchasePeriod);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubNet != null) {
            this.SubNet = new String(source.SubNet);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
        if (source.AssociatedProjectId != null) {
            this.AssociatedProjectId = new String(source.AssociatedProjectId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamObj(map, prefix + "Type.", this.Type);
        this.setParamSimple(map, prefix + "AutoRenewEnabled", this.AutoRenewEnabled);
        this.setParamSimple(map, prefix + "PurchasePeriod", this.PurchasePeriod);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubNet", this.SubNet);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "AssociatedProjectId", this.AssociatedProjectId);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

