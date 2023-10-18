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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StaticInfo extends AbstractModel {

    /**
    * Number
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
    * Port
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Address
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Asset ID
    */
    @SerializedName("InsID")
    @Expose
    private String InsID;

    /**
    * Asset name
    */
    @SerializedName("InsName")
    @Expose
    private String InsName;

    /**
     * Get Number 
     * @return Num Number
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set Number
     * @param Num Number
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    /**
     * Get Port 
     * @return Port Port
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port
     * @param Port Port
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get IP 
     * @return Ip IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP
     * @param Ip IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Address 
     * @return Address Address
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Address
     * @param Address Address
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Asset ID 
     * @return InsID Asset ID
     */
    public String getInsID() {
        return this.InsID;
    }

    /**
     * Set Asset ID
     * @param InsID Asset ID
     */
    public void setInsID(String InsID) {
        this.InsID = InsID;
    }

    /**
     * Get Asset name 
     * @return InsName Asset name
     */
    public String getInsName() {
        return this.InsName;
    }

    /**
     * Set Asset name
     * @param InsName Asset name
     */
    public void setInsName(String InsName) {
        this.InsName = InsName;
    }

    public StaticInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StaticInfo(StaticInfo source) {
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.InsID != null) {
            this.InsID = new String(source.InsID);
        }
        if (source.InsName != null) {
            this.InsName = new String(source.InsName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Num", this.Num);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "InsID", this.InsID);
        this.setParamSimple(map, prefix + "InsName", this.InsName);

    }
}

