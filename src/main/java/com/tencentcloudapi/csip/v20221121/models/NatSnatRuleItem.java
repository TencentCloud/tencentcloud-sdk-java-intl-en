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

public class NatSnatRuleItem extends AbstractModel {

    /**
    * <p>Gateway SNat ID</p>
    */
    @SerializedName("NatGatewaySnatId")
    @Expose
    private String NatGatewaySnatId;

    /**
    * <p>Resource ID</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>Resource type.</p>
    */
    @SerializedName("ResourceType")
    @Expose
    private String ResourceType;

    /**
    * <p>Private IP address.</p>
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * <p>Public IP address.</p>
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String PublicIpAddresses;

    /**
    * <p>Description.</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>Creation time.</p>
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get <p>Gateway SNat ID</p> 
     * @return NatGatewaySnatId <p>Gateway SNat ID</p>
     */
    public String getNatGatewaySnatId() {
        return this.NatGatewaySnatId;
    }

    /**
     * Set <p>Gateway SNat ID</p>
     * @param NatGatewaySnatId <p>Gateway SNat ID</p>
     */
    public void setNatGatewaySnatId(String NatGatewaySnatId) {
        this.NatGatewaySnatId = NatGatewaySnatId;
    }

    /**
     * Get <p>Resource ID</p> 
     * @return ResourceId <p>Resource ID</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>Resource ID</p>
     * @param ResourceId <p>Resource ID</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>Resource type.</p> 
     * @return ResourceType <p>Resource type.</p>
     */
    public String getResourceType() {
        return this.ResourceType;
    }

    /**
     * Set <p>Resource type.</p>
     * @param ResourceType <p>Resource type.</p>
     */
    public void setResourceType(String ResourceType) {
        this.ResourceType = ResourceType;
    }

    /**
     * Get <p>Private IP address.</p> 
     * @return PrivateIpAddress <p>Private IP address.</p>
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set <p>Private IP address.</p>
     * @param PrivateIpAddress <p>Private IP address.</p>
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get <p>Public IP address.</p> 
     * @return PublicIpAddresses <p>Public IP address.</p>
     */
    public String getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set <p>Public IP address.</p>
     * @param PublicIpAddresses <p>Public IP address.</p>
     */
    public void setPublicIpAddresses(String PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get <p>Description.</p> 
     * @return Description <p>Description.</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>Description.</p>
     * @param Description <p>Description.</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>Creation time.</p> 
     * @return CreatedTime <p>Creation time.</p>
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set <p>Creation time.</p>
     * @param CreatedTime <p>Creation time.</p>
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public NatSnatRuleItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatSnatRuleItem(NatSnatRuleItem source) {
        if (source.NatGatewaySnatId != null) {
            this.NatGatewaySnatId = new String(source.NatGatewaySnatId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceType != null) {
            this.ResourceType = new String(source.ResourceType);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String(source.PublicIpAddresses);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewaySnatId", this.NatGatewaySnatId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceType", this.ResourceType);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "PublicIpAddresses", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

