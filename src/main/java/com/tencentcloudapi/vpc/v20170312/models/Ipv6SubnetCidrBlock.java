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

public class Ipv6SubnetCidrBlock extends AbstractModel {

    /**
    * The `ID` of the subnet instance, such as `subnet-pxir56ns`.
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * The `IPv6` subnet IP range, such as `3402:4e00:20:1001::/64`
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
     * Get The `ID` of the subnet instance, such as `subnet-pxir56ns`. 
     * @return SubnetId The `ID` of the subnet instance, such as `subnet-pxir56ns`.
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set The `ID` of the subnet instance, such as `subnet-pxir56ns`.
     * @param SubnetId The `ID` of the subnet instance, such as `subnet-pxir56ns`.
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get The `IPv6` subnet IP range, such as `3402:4e00:20:1001::/64` 
     * @return Ipv6CidrBlock The `IPv6` subnet IP range, such as `3402:4e00:20:1001::/64`
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * Set The `IPv6` subnet IP range, such as `3402:4e00:20:1001::/64`
     * @param Ipv6CidrBlock The `IPv6` subnet IP range, such as `3402:4e00:20:1001::/64`
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    public Ipv6SubnetCidrBlock() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Ipv6SubnetCidrBlock(Ipv6SubnetCidrBlock source) {
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.Ipv6CidrBlock != null) {
            this.Ipv6CidrBlock = new String(source.Ipv6CidrBlock);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);

    }
}

