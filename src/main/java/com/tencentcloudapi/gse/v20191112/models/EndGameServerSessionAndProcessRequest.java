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
package com.tencentcloudapi.gse.v20191112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EndGameServerSessionAndProcessRequest extends AbstractModel {

    /**
    * Game server session ID. If a game server session ID is passed in, its corresponding processes, game server sessions, and player sessions will be terminated.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * The public IP of the CVM. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * Port number. Value range: 1025 - 60000. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions (if any exists) and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
     * Get Game server session ID. If a game server session ID is passed in, its corresponding processes, game server sessions, and player sessions will be terminated. 
     * @return GameServerSessionId Game server session ID. If a game server session ID is passed in, its corresponding processes, game server sessions, and player sessions will be terminated.
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game server session ID. If a game server session ID is passed in, its corresponding processes, game server sessions, and player sessions will be terminated.
     * @param GameServerSessionId Game server session ID. If a game server session ID is passed in, its corresponding processes, game server sessions, and player sessions will be terminated.
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get The public IP of the CVM. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in. 
     * @return IpAddress The public IP of the CVM. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set The public IP of the CVM. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
     * @param IpAddress The public IP of the CVM. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get Port number. Value range: 1025 - 60000. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions (if any exists) and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in. 
     * @return Port Port number. Value range: 1025 - 60000. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions (if any exists) and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number. Value range: 1025 - 60000. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions (if any exists) and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
     * @param Port Port number. Value range: 1025 - 60000. You need to pass in `IpAddress` and `Port` at the same time to terminate the matched processes, game server sessions (if any exists) and player sessions (if any exists). It does not take effect in case only the `IpAddress` passed in.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    public EndGameServerSessionAndProcessRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EndGameServerSessionAndProcessRequest(EndGameServerSessionAndProcessRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

