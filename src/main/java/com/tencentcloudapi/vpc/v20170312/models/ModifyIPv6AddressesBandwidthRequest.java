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

public class ModifyIPv6AddressesBandwidthRequest extends AbstractModel {

    /**
    * Unique ID of the EIPv6 address
    */
    @SerializedName("IPv6AddressIds")
    @Expose
    private String [] IPv6AddressIds;

    /**
    * Network bandwidth of the EIPv6 address
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
     * Get Unique ID of the EIPv6 address 
     * @return IPv6AddressIds Unique ID of the EIPv6 address
     */
    public String [] getIPv6AddressIds() {
        return this.IPv6AddressIds;
    }

    /**
     * Set Unique ID of the EIPv6 address
     * @param IPv6AddressIds Unique ID of the EIPv6 address
     */
    public void setIPv6AddressIds(String [] IPv6AddressIds) {
        this.IPv6AddressIds = IPv6AddressIds;
    }

    /**
     * Get Network bandwidth of the EIPv6 address 
     * @return InternetMaxBandwidthOut Network bandwidth of the EIPv6 address
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set Network bandwidth of the EIPv6 address
     * @param InternetMaxBandwidthOut Network bandwidth of the EIPv6 address
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    public ModifyIPv6AddressesBandwidthRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyIPv6AddressesBandwidthRequest(ModifyIPv6AddressesBandwidthRequest source) {
        if (source.IPv6AddressIds != null) {
            this.IPv6AddressIds = new String[source.IPv6AddressIds.length];
            for (int i = 0; i < source.IPv6AddressIds.length; i++) {
                this.IPv6AddressIds[i] = new String(source.IPv6AddressIds[i]);
            }
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPv6AddressIds.", this.IPv6AddressIds);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

