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
package com.tencentcloudapi.mdc.v20200828.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SRTAddressDestination extends AbstractModel{

    /**
    * Destination address IP.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Destination address port.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get Destination address IP. 
     * @return Ip Destination address IP.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Destination address IP.
     * @param Ip Destination address IP.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Destination address port. 
     * @return Port Destination address port.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Destination address port.
     * @param Port Destination address port.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

