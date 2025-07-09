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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Ipv6Address extends AbstractModel {

    /**
    * IPv6 address, such as `3402:4e00:20:100:0:8cd9:2a67:71f3`
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Whether it is the primary IP.
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * EIP instance ID, such as `eip-hxlqja90`.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * Description.
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
    * IPv6 address status:
PENDING: generating
MIGRATING: migrating
DELETING: deleting
AVAILABLE: available
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get IPv6 address, such as `3402:4e00:20:100:0:8cd9:2a67:71f3` 
     * @return Address IPv6 address, such as `3402:4e00:20:100:0:8cd9:2a67:71f3`
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set IPv6 address, such as `3402:4e00:20:100:0:8cd9:2a67:71f3`
     * @param Address IPv6 address, such as `3402:4e00:20:100:0:8cd9:2a67:71f3`
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Whether it is the primary IP. 
     * @return Primary Whether it is the primary IP.
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * Set Whether it is the primary IP.
     * @param Primary Whether it is the primary IP.
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * Get EIP instance ID, such as `eip-hxlqja90`. 
     * @return AddressId EIP instance ID, such as `eip-hxlqja90`.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set EIP instance ID, such as `eip-hxlqja90`.
     * @param AddressId EIP instance ID, such as `eip-hxlqja90`.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get Description. 
     * @return Description Description.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Description.
     * @param Description Description.
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
     * Get IPv6 address status:
PENDING: generating
MIGRATING: migrating
DELETING: deleting
AVAILABLE: available 
     * @return State IPv6 address status:
PENDING: generating
MIGRATING: migrating
DELETING: deleting
AVAILABLE: available
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set IPv6 address status:
PENDING: generating
MIGRATING: migrating
DELETING: deleting
AVAILABLE: available
     * @param State IPv6 address status:
PENDING: generating
MIGRATING: migrating
DELETING: deleting
AVAILABLE: available
     */
    public void setState(String State) {
        this.State = State;
    }

    public Ipv6Address() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ipv6Address(Ipv6Address source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Primary != null) {
            this.Primary = new Boolean(source.Primary);
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
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "IsWanIpBlocked", this.IsWanIpBlocked);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

