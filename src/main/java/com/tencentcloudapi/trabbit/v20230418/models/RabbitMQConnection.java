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
package com.tencentcloudapi.trabbit.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQConnection extends AbstractModel {

    /**
    * Connection name.
    */
    @SerializedName("ConnectionName")
    @Expose
    private String ConnectionName;

    /**
    * Client IP
    */
    @SerializedName("PeerHost")
    @Expose
    private String PeerHost;

    /**
    * Specifies the connection status, including starting, tuning, opening, running, flow, blocking, blocked, closing, and closed.
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * User that who has created this connection.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Whether ssl is enabled.
    */
    @SerializedName("SSL")
    @Expose
    private Boolean SSL;

    /**
    * Connection protocol.
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * Specifies the number of channels under the connection.
    */
    @SerializedName("Channels")
    @Expose
    private Long Channels;

    /**
     * Get Connection name. 
     * @return ConnectionName Connection name.
     */
    public String getConnectionName() {
        return this.ConnectionName;
    }

    /**
     * Set Connection name.
     * @param ConnectionName Connection name.
     */
    public void setConnectionName(String ConnectionName) {
        this.ConnectionName = ConnectionName;
    }

    /**
     * Get Client IP 
     * @return PeerHost Client IP
     */
    public String getPeerHost() {
        return this.PeerHost;
    }

    /**
     * Set Client IP
     * @param PeerHost Client IP
     */
    public void setPeerHost(String PeerHost) {
        this.PeerHost = PeerHost;
    }

    /**
     * Get Specifies the connection status, including starting, tuning, opening, running, flow, blocking, blocked, closing, and closed. 
     * @return State Specifies the connection status, including starting, tuning, opening, running, flow, blocking, blocked, closing, and closed.
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set Specifies the connection status, including starting, tuning, opening, running, flow, blocking, blocked, closing, and closed.
     * @param State Specifies the connection status, including starting, tuning, opening, running, flow, blocking, blocked, closing, and closed.
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get User that who has created this connection. 
     * @return User User that who has created this connection.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set User that who has created this connection.
     * @param User User that who has created this connection.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Whether ssl is enabled. 
     * @return SSL Whether ssl is enabled.
     */
    public Boolean getSSL() {
        return this.SSL;
    }

    /**
     * Set Whether ssl is enabled.
     * @param SSL Whether ssl is enabled.
     */
    public void setSSL(Boolean SSL) {
        this.SSL = SSL;
    }

    /**
     * Get Connection protocol. 
     * @return Protocol Connection protocol.
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set Connection protocol.
     * @param Protocol Connection protocol.
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get Specifies the number of channels under the connection. 
     * @return Channels Specifies the number of channels under the connection.
     */
    public Long getChannels() {
        return this.Channels;
    }

    /**
     * Set Specifies the number of channels under the connection.
     * @param Channels Specifies the number of channels under the connection.
     */
    public void setChannels(Long Channels) {
        this.Channels = Channels;
    }

    public RabbitMQConnection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQConnection(RabbitMQConnection source) {
        if (source.ConnectionName != null) {
            this.ConnectionName = new String(source.ConnectionName);
        }
        if (source.PeerHost != null) {
            this.PeerHost = new String(source.PeerHost);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.SSL != null) {
            this.SSL = new Boolean(source.SSL);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Channels != null) {
            this.Channels = new Long(source.Channels);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectionName", this.ConnectionName);
        this.setParamSimple(map, prefix + "PeerHost", this.PeerHost);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "SSL", this.SSL);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Channels", this.Channels);

    }
}

