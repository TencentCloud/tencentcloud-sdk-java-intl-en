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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceServer extends AbstractModel {

    /**
    * Types of the real server address, such as IP or domain name.
    */
    @SerializedName("RealServer")
    @Expose
    private String RealServer;

    /**
    * Types of the real server address:
`1`: domain name
`2`: IP
]
    */
    @SerializedName("RsType")
    @Expose
    private Long RsType;

    /**
    * Forward weight of the real server. Value range: 1–100.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
    * Port number. Value range: 0-65535.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get Types of the real server address, such as IP or domain name. 
     * @return RealServer Types of the real server address, such as IP or domain name.
     */
    public String getRealServer() {
        return this.RealServer;
    }

    /**
     * Set Types of the real server address, such as IP or domain name.
     * @param RealServer Types of the real server address, such as IP or domain name.
     */
    public void setRealServer(String RealServer) {
        this.RealServer = RealServer;
    }

    /**
     * Get Types of the real server address:
`1`: domain name
`2`: IP
] 
     * @return RsType Types of the real server address:
`1`: domain name
`2`: IP
]
     */
    public Long getRsType() {
        return this.RsType;
    }

    /**
     * Set Types of the real server address:
`1`: domain name
`2`: IP
]
     * @param RsType Types of the real server address:
`1`: domain name
`2`: IP
]
     */
    public void setRsType(Long RsType) {
        this.RsType = RsType;
    }

    /**
     * Get Forward weight of the real server. Value range: 1–100. 
     * @return Weight Forward weight of the real server. Value range: 1–100.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set Forward weight of the real server. Value range: 1–100.
     * @param Weight Forward weight of the real server. Value range: 1–100.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    /**
     * Get Port number. Value range: 0-65535. 
     * @return Port Port number. Value range: 0-65535.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number. Value range: 0-65535.
     * @param Port Port number. Value range: 0-65535.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public SourceServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceServer(SourceServer source) {
        if (source.RealServer != null) {
            this.RealServer = new String(source.RealServer);
        }
        if (source.RsType != null) {
            this.RsType = new Long(source.RsType);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServer", this.RealServer);
        this.setParamSimple(map, prefix + "RsType", this.RsType);
        this.setParamSimple(map, prefix + "Weight", this.Weight);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

