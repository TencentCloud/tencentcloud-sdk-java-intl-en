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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReserveIpAddressInfo extends AbstractModel {

    /**
    * Unique ID of the reserved private IP address.
    */
    @SerializedName("ReserveIpId")
    @Expose
    private String ReserveIpId;

    /**
    * Unique ID of the VPC.
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * Unique ID of the subnet.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * Reserved private IP address.
    */
    @SerializedName("ReserveIpAddress")
    @Expose
    private String ReserveIpAddress;

    /**
    * Resource instance ID bound to the reserved private IP address.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * IpType applied for the product.
    */
    @SerializedName("IpType")
    @Expose
    private Long IpType;

    /**
    * Binding status. UnBind: unbound; Bind: bound.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * Name of the reserved private IP address.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the reserved private IP address.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Creation time.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Tag key-value pair.
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * Get Unique ID of the reserved private IP address. 
     * @return ReserveIpId Unique ID of the reserved private IP address.
     */
    public String getReserveIpId() {
        return this.ReserveIpId;
    }

    /**
     * Set Unique ID of the reserved private IP address.
     * @param ReserveIpId Unique ID of the reserved private IP address.
     */
    public void setReserveIpId(String ReserveIpId) {
        this.ReserveIpId = ReserveIpId;
    }

    /**
     * Get Unique ID of the VPC. 
     * @return VpcId Unique ID of the VPC.
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set Unique ID of the VPC.
     * @param VpcId Unique ID of the VPC.
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get Unique ID of the subnet. 
     * @return SubnetId Unique ID of the subnet.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set Unique ID of the subnet.
     * @param SubnetId Unique ID of the subnet.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get Reserved private IP address. 
     * @return ReserveIpAddress Reserved private IP address.
     */
    public String getReserveIpAddress() {
        return this.ReserveIpAddress;
    }

    /**
     * Set Reserved private IP address.
     * @param ReserveIpAddress Reserved private IP address.
     */
    public void setReserveIpAddress(String ReserveIpAddress) {
        this.ReserveIpAddress = ReserveIpAddress;
    }

    /**
     * Get Resource instance ID bound to the reserved private IP address. 
     * @return ResourceId Resource instance ID bound to the reserved private IP address.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource instance ID bound to the reserved private IP address.
     * @param ResourceId Resource instance ID bound to the reserved private IP address.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get IpType applied for the product. 
     * @return IpType IpType applied for the product.
     */
    public Long getIpType() {
        return this.IpType;
    }

    /**
     * Set IpType applied for the product.
     * @param IpType IpType applied for the product.
     */
    public void setIpType(Long IpType) {
        this.IpType = IpType;
    }

    /**
     * Get Binding status. UnBind: unbound; Bind: bound. 
     * @return State Binding status. UnBind: unbound; Bind: bound.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Binding status. UnBind: unbound; Bind: bound.
     * @param State Binding status. UnBind: unbound; Bind: bound.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get Name of the reserved private IP address. 
     * @return Name Name of the reserved private IP address.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of the reserved private IP address.
     * @param Name Name of the reserved private IP address.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the reserved private IP address. 
     * @return Description Description of the reserved private IP address.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description of the reserved private IP address.
     * @param Description Description of the reserved private IP address.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Creation time. 
     * @return CreatedTime Creation time.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time.
     * @param CreatedTime Creation time.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Tag key-value pair. 
     * @return TagSet Tag key-value pair.
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set Tag key-value pair.
     * @param TagSet Tag key-value pair.
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    public ReserveIpAddressInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReserveIpAddressInfo(ReserveIpAddressInfo source) {
        if (source.ReserveIpId != null) {
            this.ReserveIpId = new String(source.ReserveIpId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.ReserveIpAddress != null) {
            this.ReserveIpAddress = new String(source.ReserveIpAddress);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.IpType != null) {
            this.IpType = new Long(source.IpType);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReserveIpId", this.ReserveIpId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "ReserveIpAddress", this.ReserveIpAddress);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "IpType", this.IpType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

