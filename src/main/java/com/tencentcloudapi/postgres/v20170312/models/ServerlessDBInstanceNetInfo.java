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

public class ServerlessDBInstanceNetInfo extends AbstractModel{

    /**
    * Address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Port number
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Status
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Network type
Note: this field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
     * Get Address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Address Address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Address Address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get IP address
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Ip IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Ip IP address
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Port number
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Port Port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Port Port number
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Status
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return Status Status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Status
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param Status Status
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Network type
Note: this field may return `null`, indicating that no valid values can be obtained. 
     * @return NetType Network type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * Set Network type
Note: this field may return `null`, indicating that no valid values can be obtained.
     * @param NetType Network type
Note: this field may return `null`, indicating that no valid values can be obtained.
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NetType", this.NetType);

    }
}

