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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NatGatewayAddress extends AbstractModel {

    /**
    * The unique ID of the Elastic IP (EIP), such as `eip-11112222`.
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * The public IP address, such as `123.121.34.33`.
    */
    @SerializedName("PublicIpAddress")
    @Expose
    private String PublicIpAddress;

    /**
    * The block status of the resource. `true` indicates the EIP is blocked. `false` indicates that the EIP is not blocked.
    */
    @SerializedName("IsBlocked")
    @Expose
    private Boolean IsBlocked;

    /**
     * Get The unique ID of the Elastic IP (EIP), such as `eip-11112222`. 
     * @return AddressId The unique ID of the Elastic IP (EIP), such as `eip-11112222`.
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set The unique ID of the Elastic IP (EIP), such as `eip-11112222`.
     * @param AddressId The unique ID of the Elastic IP (EIP), such as `eip-11112222`.
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get The public IP address, such as `123.121.34.33`. 
     * @return PublicIpAddress The public IP address, such as `123.121.34.33`.
     */
    public String getPublicIpAddress() {
        return this.PublicIpAddress;
    }

    /**
     * Set The public IP address, such as `123.121.34.33`.
     * @param PublicIpAddress The public IP address, such as `123.121.34.33`.
     */
    public void setPublicIpAddress(String PublicIpAddress) {
        this.PublicIpAddress = PublicIpAddress;
    }

    /**
     * Get The block status of the resource. `true` indicates the EIP is blocked. `false` indicates that the EIP is not blocked. 
     * @return IsBlocked The block status of the resource. `true` indicates the EIP is blocked. `false` indicates that the EIP is not blocked.
     */
    public Boolean getIsBlocked() {
        return this.IsBlocked;
    }

    /**
     * Set The block status of the resource. `true` indicates the EIP is blocked. `false` indicates that the EIP is not blocked.
     * @param IsBlocked The block status of the resource. `true` indicates the EIP is blocked. `false` indicates that the EIP is not blocked.
     */
    public void setIsBlocked(Boolean IsBlocked) {
        this.IsBlocked = IsBlocked;
    }

    public NatGatewayAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NatGatewayAddress(NatGatewayAddress source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.PublicIpAddress != null) {
            this.PublicIpAddress = new String(source.PublicIpAddress);
        }
        if (source.IsBlocked != null) {
            this.IsBlocked = new Boolean(source.IsBlocked);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "PublicIpAddress", this.PublicIpAddress);
        this.setParamSimple(map, prefix + "IsBlocked", this.IsBlocked);

    }
}

