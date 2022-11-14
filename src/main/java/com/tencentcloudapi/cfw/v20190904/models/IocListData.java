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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IocListData extends AbstractModel{

    /**
    * IP address to be handled. Either IP or Domain is required.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
    * 0 or 1. 0: outbound; 1: inbound
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * Domain name to be handled. Either IP or Domain is required.
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get IP address to be handled. Either IP or Domain is required. 
     * @return IP IP address to be handled. Either IP or Domain is required.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address to be handled. Either IP or Domain is required.
     * @param IP IP address to be handled. Either IP or Domain is required.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    /**
     * Get 0 or 1. 0: outbound; 1: inbound 
     * @return Direction 0 or 1. 0: outbound; 1: inbound
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 0 or 1. 0: outbound; 1: inbound
     * @param Direction 0 or 1. 0: outbound; 1: inbound
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get Domain name to be handled. Either IP or Domain is required. 
     * @return Domain Domain name to be handled. Either IP or Domain is required.
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set Domain name to be handled. Either IP or Domain is required.
     * @param Domain Domain name to be handled. Either IP or Domain is required.
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public IocListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IocListData(IocListData source) {
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IP", this.IP);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

