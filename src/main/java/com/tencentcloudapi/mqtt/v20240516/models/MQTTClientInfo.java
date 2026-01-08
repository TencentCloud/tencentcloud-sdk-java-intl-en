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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTClientInfo extends AbstractModel {

    /**
    * Client ID
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Client network address.
    */
    @SerializedName("ClientAddress")
    @Expose
    private String ClientAddress;

    /**
    * MQTT protocol version.
3: indicates MQTT version 3.1.
4: indicates MQTT 3.1.1.
5: indicates the MQTT 5.0 protocol.
    */
    @SerializedName("ProtocolVersion")
    @Expose
    private Long ProtocolVersion;

    /**
    * Keep-alive duration. Unit: second.
    */
    @SerializedName("Keepalive")
    @Expose
    private Long Keepalive;

    /**
    * Connection status. CONNECTED: connected; DISCONNECTED: not connected.
    */
    @SerializedName("ConnectionStatus")
    @Expose
    private String ConnectionStatus;

    /**
    * Client creation time. millisecond-level timestamp.
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * Last connection establishment time. millisecond-level timestamp.
    */
    @SerializedName("ConnectTime")
    @Expose
    private Long ConnectTime;

    /**
    * Last disconnection time, only applicable to persistent sessions (cleanSession=false) and when the client is currently disconnected, millisecond-level timestamp.
    */
    @SerializedName("DisconnectTime")
    @Expose
    private Long DisconnectTime;

    /**
    * Client subscription list.
    */
    @SerializedName("MQTTClientSubscriptions")
    @Expose
    private MQTTClientSubscription [] MQTTClientSubscriptions;

    /**
     * Get Client ID 
     * @return ClientId Client ID
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID
     * @param ClientId Client ID
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Client network address. 
     * @return ClientAddress Client network address.
     */
    public String getClientAddress() {
        return this.ClientAddress;
    }

    /**
     * Set Client network address.
     * @param ClientAddress Client network address.
     */
    public void setClientAddress(String ClientAddress) {
        this.ClientAddress = ClientAddress;
    }

    /**
     * Get MQTT protocol version.
3: indicates MQTT version 3.1.
4: indicates MQTT 3.1.1.
5: indicates the MQTT 5.0 protocol. 
     * @return ProtocolVersion MQTT protocol version.
3: indicates MQTT version 3.1.
4: indicates MQTT 3.1.1.
5: indicates the MQTT 5.0 protocol.
     */
    public Long getProtocolVersion() {
        return this.ProtocolVersion;
    }

    /**
     * Set MQTT protocol version.
3: indicates MQTT version 3.1.
4: indicates MQTT 3.1.1.
5: indicates the MQTT 5.0 protocol.
     * @param ProtocolVersion MQTT protocol version.
3: indicates MQTT version 3.1.
4: indicates MQTT 3.1.1.
5: indicates the MQTT 5.0 protocol.
     */
    public void setProtocolVersion(Long ProtocolVersion) {
        this.ProtocolVersion = ProtocolVersion;
    }

    /**
     * Get Keep-alive duration. Unit: second. 
     * @return Keepalive Keep-alive duration. Unit: second.
     */
    public Long getKeepalive() {
        return this.Keepalive;
    }

    /**
     * Set Keep-alive duration. Unit: second.
     * @param Keepalive Keep-alive duration. Unit: second.
     */
    public void setKeepalive(Long Keepalive) {
        this.Keepalive = Keepalive;
    }

    /**
     * Get Connection status. CONNECTED: connected; DISCONNECTED: not connected. 
     * @return ConnectionStatus Connection status. CONNECTED: connected; DISCONNECTED: not connected.
     */
    public String getConnectionStatus() {
        return this.ConnectionStatus;
    }

    /**
     * Set Connection status. CONNECTED: connected; DISCONNECTED: not connected.
     * @param ConnectionStatus Connection status. CONNECTED: connected; DISCONNECTED: not connected.
     */
    public void setConnectionStatus(String ConnectionStatus) {
        this.ConnectionStatus = ConnectionStatus;
    }

    /**
     * Get Client creation time. millisecond-level timestamp. 
     * @return CreateTime Client creation time. millisecond-level timestamp.
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Client creation time. millisecond-level timestamp.
     * @param CreateTime Client creation time. millisecond-level timestamp.
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Last connection establishment time. millisecond-level timestamp. 
     * @return ConnectTime Last connection establishment time. millisecond-level timestamp.
     */
    public Long getConnectTime() {
        return this.ConnectTime;
    }

    /**
     * Set Last connection establishment time. millisecond-level timestamp.
     * @param ConnectTime Last connection establishment time. millisecond-level timestamp.
     */
    public void setConnectTime(Long ConnectTime) {
        this.ConnectTime = ConnectTime;
    }

    /**
     * Get Last disconnection time, only applicable to persistent sessions (cleanSession=false) and when the client is currently disconnected, millisecond-level timestamp. 
     * @return DisconnectTime Last disconnection time, only applicable to persistent sessions (cleanSession=false) and when the client is currently disconnected, millisecond-level timestamp.
     */
    public Long getDisconnectTime() {
        return this.DisconnectTime;
    }

    /**
     * Set Last disconnection time, only applicable to persistent sessions (cleanSession=false) and when the client is currently disconnected, millisecond-level timestamp.
     * @param DisconnectTime Last disconnection time, only applicable to persistent sessions (cleanSession=false) and when the client is currently disconnected, millisecond-level timestamp.
     */
    public void setDisconnectTime(Long DisconnectTime) {
        this.DisconnectTime = DisconnectTime;
    }

    /**
     * Get Client subscription list. 
     * @return MQTTClientSubscriptions Client subscription list.
     */
    public MQTTClientSubscription [] getMQTTClientSubscriptions() {
        return this.MQTTClientSubscriptions;
    }

    /**
     * Set Client subscription list.
     * @param MQTTClientSubscriptions Client subscription list.
     */
    public void setMQTTClientSubscriptions(MQTTClientSubscription [] MQTTClientSubscriptions) {
        this.MQTTClientSubscriptions = MQTTClientSubscriptions;
    }

    public MQTTClientInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTClientInfo(MQTTClientInfo source) {
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.ClientAddress != null) {
            this.ClientAddress = new String(source.ClientAddress);
        }
        if (source.ProtocolVersion != null) {
            this.ProtocolVersion = new Long(source.ProtocolVersion);
        }
        if (source.Keepalive != null) {
            this.Keepalive = new Long(source.Keepalive);
        }
        if (source.ConnectionStatus != null) {
            this.ConnectionStatus = new String(source.ConnectionStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ConnectTime != null) {
            this.ConnectTime = new Long(source.ConnectTime);
        }
        if (source.DisconnectTime != null) {
            this.DisconnectTime = new Long(source.DisconnectTime);
        }
        if (source.MQTTClientSubscriptions != null) {
            this.MQTTClientSubscriptions = new MQTTClientSubscription[source.MQTTClientSubscriptions.length];
            for (int i = 0; i < source.MQTTClientSubscriptions.length; i++) {
                this.MQTTClientSubscriptions[i] = new MQTTClientSubscription(source.MQTTClientSubscriptions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "ClientAddress", this.ClientAddress);
        this.setParamSimple(map, prefix + "ProtocolVersion", this.ProtocolVersion);
        this.setParamSimple(map, prefix + "Keepalive", this.Keepalive);
        this.setParamSimple(map, prefix + "ConnectionStatus", this.ConnectionStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ConnectTime", this.ConnectTime);
        this.setParamSimple(map, prefix + "DisconnectTime", this.DisconnectTime);
        this.setParamArrayObj(map, prefix + "MQTTClientSubscriptions.", this.MQTTClientSubscriptions);

    }
}

