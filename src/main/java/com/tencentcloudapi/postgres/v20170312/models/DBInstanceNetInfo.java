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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstanceNetInfo extends AbstractModel{

    /**
    * DNS domain name
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Connection port address
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Network type. 1: inner (private network address), 2: public (public network address)
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * Network connection status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get DNS domain name 
     * @return Address DNS domain name
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set DNS domain name
     * @param Address DNS domain name
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Ip 
     * @return Ip Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Ip
     * @param Ip Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Connection port address 
     * @return Port Connection port address
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Connection port address
     * @param Port Connection port address
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Network type. 1: inner (private network address), 2: public (public network address) 
     * @return NetType Network type. 1: inner (private network address), 2: public (public network address)
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type. 1: inner (private network address), 2: public (public network address)
     * @param NetType Network type. 1: inner (private network address), 2: public (public network address)
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Get Network connection status 
     * @return Status Network connection status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Network connection status
     * @param Status Network connection status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public DBInstanceNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBInstanceNetInfo(DBInstanceNetInfo source) {
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.NetType != null) {
            this.NetType = new String(source.NetType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

