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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PlayerSession extends AbstractModel{

    /**
    * Player session creation time
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * ID of the DNS where the game server session is running
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * Fleet ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Game server session ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Address of the CVM instance where the game server session is running
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * Player information
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

    /**
    * Player ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * Player session ID
    */
    @SerializedName("PlayerSessionId")
    @Expose
    private String PlayerSessionId;

    /**
    * Port number
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Player session status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Player session termination time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TerminationTime")
    @Expose
    private String TerminationTime;

    /**
     * Get Player session creation time 
     * @return CreationTime Player session creation time
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set Player session creation time
     * @param CreationTime Player session creation time
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get ID of the DNS where the game server session is running
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DnsName ID of the DNS where the game server session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set ID of the DNS where the game server session is running
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DnsName ID of the DNS where the game server session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get Fleet ID 
     * @return FleetId Fleet ID
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Fleet ID
     * @param FleetId Fleet ID
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Game server session ID 
     * @return GameServerSessionId Game server session ID
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game server session ID
     * @param GameServerSessionId Game server session ID
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get Address of the CVM instance where the game server session is running 
     * @return IpAddress Address of the CVM instance where the game server session is running
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set Address of the CVM instance where the game server session is running
     * @param IpAddress Address of the CVM instance where the game server session is running
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get Player information
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayerData Player information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set Player information
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayerData Player information
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    /**
     * Get Player ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayerId Player ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set Player ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayerId Player ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get Player session ID 
     * @return PlayerSessionId Player session ID
     */
    public String getPlayerSessionId() {
        return this.PlayerSessionId;
    }

    /**
     * Set Player session ID
     * @param PlayerSessionId Player session ID
     */
    public void setPlayerSessionId(String PlayerSessionId) {
        this.PlayerSessionId = PlayerSessionId;
    }

    /**
     * Get Port number 
     * @return Port Port number
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number
     * @param Port Port number
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Player session status 
     * @return Status Player session status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Player session status
     * @param Status Player session status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Player session termination time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TerminationTime Player session termination time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTerminationTime() {
        return this.TerminationTime;
    }

    /**
     * Set Player session termination time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TerminationTime Player session termination time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTerminationTime(String TerminationTime) {
        this.TerminationTime = TerminationTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "PlayerData", this.PlayerData);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerSessionId", this.PlayerSessionId);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "TerminationTime", this.TerminationTime);

    }
}

