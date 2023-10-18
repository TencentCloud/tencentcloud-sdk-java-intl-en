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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupsInboundAndOutbound extends AbstractModel {

    /**
    * Identify whether the IP and port for accessing the database are allowed
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * IP address for accessing the database
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Port number
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * Protocol type
    */
    @SerializedName("Proto")
    @Expose
    private String Proto;

    /**
     * Get Identify whether the IP and port for accessing the database are allowed 
     * @return Action Identify whether the IP and port for accessing the database are allowed
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set Identify whether the IP and port for accessing the database are allowed
     * @param Action Identify whether the IP and port for accessing the database are allowed
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get IP address for accessing the database 
     * @return Ip IP address for accessing the database
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set IP address for accessing the database
     * @param Ip IP address for accessing the database
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Port number 
     * @return Port Port number
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set Port number
     * @param Port Port number
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get Protocol type 
     * @return Proto Protocol type
     */
    public String getProto() {
        return this.Proto;
    }

    /**
     * Set Protocol type
     * @param Proto Protocol type
     */
    public void setProto(String Proto) {
        this.Proto = Proto;
    }

    public SecurityGroupsInboundAndOutbound() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupsInboundAndOutbound(SecurityGroupsInboundAndOutbound source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Proto != null) {
            this.Proto = new String(source.Proto);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Proto", this.Proto);

    }
}

