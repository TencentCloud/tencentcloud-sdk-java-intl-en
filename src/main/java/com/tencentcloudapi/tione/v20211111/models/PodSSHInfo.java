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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PodSSHInfo extends AbstractModel {

    /**
    * IP address of the Pod.
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * SSH port of the Pod.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * SSH access command.
    */
    @SerializedName("LoginCommand")
    @Expose
    private String LoginCommand;

    /**
     * Get IP address of the Pod. 
     * @return Host IP address of the Pod.
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set IP address of the Pod.
     * @param Host IP address of the Pod.
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get SSH port of the Pod. 
     * @return Port SSH port of the Pod.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set SSH port of the Pod.
     * @param Port SSH port of the Pod.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get SSH access command. 
     * @return LoginCommand SSH access command.
     */
    public String getLoginCommand() {
        return this.LoginCommand;
    }

    /**
     * Set SSH access command.
     * @param LoginCommand SSH access command.
     */
    public void setLoginCommand(String LoginCommand) {
        this.LoginCommand = LoginCommand;
    }

    public PodSSHInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PodSSHInfo(PodSSHInfo source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.LoginCommand != null) {
            this.LoginCommand = new String(source.LoginCommand);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LoginCommand", this.LoginCommand);

    }
}

