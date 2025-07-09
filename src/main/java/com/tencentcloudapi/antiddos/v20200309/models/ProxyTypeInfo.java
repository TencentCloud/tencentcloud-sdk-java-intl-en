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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyTypeInfo extends AbstractModel {

    /**
    * List of forwarding listening ports. Value range: 1–65535.
    */
    @SerializedName("ProxyPorts")
    @Expose
    private Long [] ProxyPorts;

    /**
    * Forwarding protocol:
`http`: HTTP protocol
`https`: HTTPS protocol
]
    */
    @SerializedName("ProxyType")
    @Expose
    private String ProxyType;

    /**
     * Get List of forwarding listening ports. Value range: 1–65535. 
     * @return ProxyPorts List of forwarding listening ports. Value range: 1–65535.
     */
    public Long [] getProxyPorts() {
        return this.ProxyPorts;
    }

    /**
     * Set List of forwarding listening ports. Value range: 1–65535.
     * @param ProxyPorts List of forwarding listening ports. Value range: 1–65535.
     */
    public void setProxyPorts(Long [] ProxyPorts) {
        this.ProxyPorts = ProxyPorts;
    }

    /**
     * Get Forwarding protocol:
`http`: HTTP protocol
`https`: HTTPS protocol
] 
     * @return ProxyType Forwarding protocol:
`http`: HTTP protocol
`https`: HTTPS protocol
]
     */
    public String getProxyType() {
        return this.ProxyType;
    }

    /**
     * Set Forwarding protocol:
`http`: HTTP protocol
`https`: HTTPS protocol
]
     * @param ProxyType Forwarding protocol:
`http`: HTTP protocol
`https`: HTTPS protocol
]
     */
    public void setProxyType(String ProxyType) {
        this.ProxyType = ProxyType;
    }

    public ProxyTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProxyTypeInfo(ProxyTypeInfo source) {
        if (source.ProxyPorts != null) {
            this.ProxyPorts = new Long[source.ProxyPorts.length];
            for (int i = 0; i < source.ProxyPorts.length; i++) {
                this.ProxyPorts[i] = new Long(source.ProxyPorts[i]);
            }
        }
        if (source.ProxyType != null) {
            this.ProxyType = new String(source.ProxyType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ProxyPorts.", this.ProxyPorts);
        this.setParamSimple(map, prefix + "ProxyType", this.ProxyType);

    }
}

