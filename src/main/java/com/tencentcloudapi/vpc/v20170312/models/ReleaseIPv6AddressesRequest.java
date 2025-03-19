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

public class ReleaseIPv6AddressesRequest extends AbstractModel {

    /**
    * Unique ID of the IPv6 address.
    */
    @SerializedName("IPv6AddressIds")
    @Expose
    private String [] IPv6AddressIds;

    /**
     * Get Unique ID of the IPv6 address. 
     * @return IPv6AddressIds Unique ID of the IPv6 address.
     */
    public String [] getIPv6AddressIds() {
        return this.IPv6AddressIds;
    }

    /**
     * Set Unique ID of the IPv6 address.
     * @param IPv6AddressIds Unique ID of the IPv6 address.
     */
    public void setIPv6AddressIds(String [] IPv6AddressIds) {
        this.IPv6AddressIds = IPv6AddressIds;
    }

    public ReleaseIPv6AddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReleaseIPv6AddressesRequest(ReleaseIPv6AddressesRequest source) {
        if (source.IPv6AddressIds != null) {
            this.IPv6AddressIds = new String[source.IPv6AddressIds.length];
            for (int i = 0; i < source.IPv6AddressIds.length; i++) {
                this.IPv6AddressIds[i] = new String(source.IPv6AddressIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IPv6AddressIds.", this.IPv6AddressIds);

    }
}

