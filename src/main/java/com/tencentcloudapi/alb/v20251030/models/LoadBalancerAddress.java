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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancerAddress extends AbstractModel {

    /**
    * IPv4 address list
    */
    @SerializedName("IPv4Address")
    @Expose
    private IPAddressInfo [] IPv4Address;

    /**
    * IPv6 address list
    */
    @SerializedName("IPv6Address")
    @Expose
    private IPAddressInfo [] IPv6Address;

    /**
     * Get IPv4 address list 
     * @return IPv4Address IPv4 address list
     */
    public IPAddressInfo [] getIPv4Address() {
        return this.IPv4Address;
    }

    /**
     * Set IPv4 address list
     * @param IPv4Address IPv4 address list
     */
    public void setIPv4Address(IPAddressInfo [] IPv4Address) {
        this.IPv4Address = IPv4Address;
    }

    /**
     * Get IPv6 address list 
     * @return IPv6Address IPv6 address list
     */
    public IPAddressInfo [] getIPv6Address() {
        return this.IPv6Address;
    }

    /**
     * Set IPv6 address list
     * @param IPv6Address IPv6 address list
     */
    public void setIPv6Address(IPAddressInfo [] IPv6Address) {
        this.IPv6Address = IPv6Address;
    }

    public LoadBalancerAddress() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancerAddress(LoadBalancerAddress source) {
        if (source.IPv4Address != null) {
            this.IPv4Address = new IPAddressInfo[source.IPv4Address.length];
            for (int i = 0; i < source.IPv4Address.length; i++) {
                this.IPv4Address[i] = new IPAddressInfo(source.IPv4Address[i]);
            }
        }
        if (source.IPv6Address != null) {
            this.IPv6Address = new IPAddressInfo[source.IPv6Address.length];
            for (int i = 0; i < source.IPv6Address.length; i++) {
                this.IPv6Address[i] = new IPAddressInfo(source.IPv6Address[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "IPv4Address.", this.IPv4Address);
        this.setParamArrayObj(map, prefix + "IPv6Address.", this.IPv6Address);

    }
}

