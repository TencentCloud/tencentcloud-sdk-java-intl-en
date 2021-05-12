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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrivateIpAddressSpecification extends AbstractModel{

    /**
    * Private IP address.
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * Whether it is a primary IP.
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * Public IP address.
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * EIP instance ID, such as `eip-11112222`.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * Private IP description.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * Whether the public IP is blocked.
    */
    @SerializedName("IsWanIpBlocked")
    @Expose
    private Boolean IsWanIpBlocked;

    /**
    * IP status:
PENDING: Creating
MIGRATING: Migrating
DELETING: Deleting
AVAILABLE: Available
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get Private IP address. 
     * @return PrivateIpAddress Private IP address.
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set Private IP address.
     * @param PrivateIpAddress Private IP address.
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get Whether it is a primary IP. 
     * @return Primary Whether it is a primary IP.
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set Whether it is a primary IP.
     * @param Primary Whether it is a primary IP.
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get Public IP address. 
     * @return PublicIpAddress Public IP address.
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set Public IP address.
     * @param PublicIpAddress Public IP address.
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get EIP instance ID, such as `eip-11112222`. 
     * @return AddressId EIP instance ID, such as `eip-11112222`.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP instance ID, such as `eip-11112222`.
     * @param AddressId EIP instance ID, such as `eip-11112222`.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get Private IP description. 
     * @return Description Private IP description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Private IP description.
     * @param Description Private IP description.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get Whether the public IP is blocked. 
     * @return IsWanIpBlocked Whether the public IP is blocked.
     */
    public Boolean getIsWanIpBlocked() {
        return this.IsWanIpBlocked;
    }

    /**
     * Set Whether the public IP is blocked.
     * @param IsWanIpBlocked Whether the public IP is blocked.
     */
    public void setIsWanIpBlocked(Boolean IsWanIpBlocked) {
        this.IsWanIpBlocked = IsWanIpBlocked;
    }

    /**
     * Get IP status:
PENDING: Creating
MIGRATING: Migrating
DELETING: Deleting
AVAILABLE: Available 
     * @return State IP status:
PENDING: Creating
MIGRATING: Migrating
DELETING: Deleting
AVAILABLE: Available
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set IP status:
PENDING: Creating
MIGRATING: Migrating
DELETING: Deleting
AVAILABLE: Available
     * @param State IP status:
PENDING: Creating
MIGRATING: Migrating
DELETING: Deleting
AVAILABLE: Available
     */
    public void setState(String State) {
        this.State = State;
    }

    public PrivateIpAddressSpecification() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrivateIpAddressSpecification(PrivateIpAddressSpecification source) {
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.IsWanIpBlocked != null) {
            this.IsWanIpBlocked = new Boolean(source.IsWanIpBlocked);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsWanIpBlocked", this.IsWanIpBlocked);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

