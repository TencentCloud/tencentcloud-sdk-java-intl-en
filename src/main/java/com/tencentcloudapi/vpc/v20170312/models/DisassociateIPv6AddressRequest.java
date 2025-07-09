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

public class DisassociateIPv6AddressRequest extends AbstractModel {

    /**
    * Indicates the unique ID of the EIPv6, such as eipv6-11112222.
    */
    @SerializedName("IPv6AddressId")
    @Expose
    private String IPv6AddressId;

    /**
    * Indicates whether to keep the ENI bound when unbinding.
    */
    @SerializedName("KeepBindWithEni")
    @Expose
    private Boolean KeepBindWithEni;

    /**
     * Get Indicates the unique ID of the EIPv6, such as eipv6-11112222. 
     * @return IPv6AddressId Indicates the unique ID of the EIPv6, such as eipv6-11112222.
     */
    public String getIPv6AddressId() {
        return this.IPv6AddressId;
    }

    /**
     * Set Indicates the unique ID of the EIPv6, such as eipv6-11112222.
     * @param IPv6AddressId Indicates the unique ID of the EIPv6, such as eipv6-11112222.
     */
    public void setIPv6AddressId(String IPv6AddressId) {
        this.IPv6AddressId = IPv6AddressId;
    }

    /**
     * Get Indicates whether to keep the ENI bound when unbinding. 
     * @return KeepBindWithEni Indicates whether to keep the ENI bound when unbinding.
     */
    public Boolean getKeepBindWithEni() {
        return this.KeepBindWithEni;
    }

    /**
     * Set Indicates whether to keep the ENI bound when unbinding.
     * @param KeepBindWithEni Indicates whether to keep the ENI bound when unbinding.
     */
    public void setKeepBindWithEni(Boolean KeepBindWithEni) {
        this.KeepBindWithEni = KeepBindWithEni;
    }

    public DisassociateIPv6AddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisassociateIPv6AddressRequest(DisassociateIPv6AddressRequest source) {
        if (source.IPv6AddressId != null) {
            this.IPv6AddressId = new String(source.IPv6AddressId);
        }
        if (source.KeepBindWithEni != null) {
            this.KeepBindWithEni = new Boolean(source.KeepBindWithEni);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IPv6AddressId", this.IPv6AddressId);
        this.setParamSimple(map, prefix + "KeepBindWithEni", this.KeepBindWithEni);

    }
}

