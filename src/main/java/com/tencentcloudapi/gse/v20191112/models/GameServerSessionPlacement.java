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

public class GameServerSessionPlacement extends AbstractModel{

    /**
    * Deployment ID
    */
    @SerializedName("PlacementId")
    @Expose
    private String PlacementId;

    /**
    * Service deployment group name
    */
    @SerializedName("GameServerSessionQueueName")
    @Expose
    private String GameServerSessionQueueName;

    /**
    * Player latency
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlayerLatencies")
    @Expose
    private PlayerLatency [] PlayerLatencies;

    /**
    * Service deployment status
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * DNS ID assigned to the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DnsName")
    @Expose
    private String DnsName;

    /**
    * Game session ID
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Game session name
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessionName")
    @Expose
    private String GameServerSessionName;

    /**
    * Service deployment region
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessionRegion")
    @Expose
    private String GameServerSessionRegion;

    /**
    * Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * The maximum number of players that can be connected simultaneously to the game session. It should a value between 1 to the maximum number of player sessions.
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * Game session data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * IP address of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IpAddress")
    @Expose
    private String IpAddress;

    /**
    * Port number of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * Game match data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MatchmakerData")
    @Expose
    private String MatchmakerData;

    /**
    * Deployed player game data
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PlacedPlayerSessions")
    @Expose
    private PlacedPlayerSession [] PlacedPlayerSessions;

    /**
    * Start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get Deployment ID 
     * @return PlacementId Deployment ID
     */
    public String getPlacementId() {
        return this.PlacementId;
    }

    /**
     * Set Deployment ID
     * @param PlacementId Deployment ID
     */
    public void setPlacementId(String PlacementId) {
        this.PlacementId = PlacementId;
    }

    /**
     * Get Service deployment group name 
     * @return GameServerSessionQueueName Service deployment group name
     */
    public String getGameServerSessionQueueName() {
        return this.GameServerSessionQueueName;
    }

    /**
     * Set Service deployment group name
     * @param GameServerSessionQueueName Service deployment group name
     */
    public void setGameServerSessionQueueName(String GameServerSessionQueueName) {
        this.GameServerSessionQueueName = GameServerSessionQueueName;
    }

    /**
     * Get Player latency
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlayerLatencies Player latency
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PlayerLatency [] getPlayerLatencies() {
        return this.PlayerLatencies;
    }

    /**
     * Set Player latency
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlayerLatencies Player latency
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlayerLatencies(PlayerLatency [] PlayerLatencies) {
        this.PlayerLatencies = PlayerLatencies;
    }

    /**
     * Get Service deployment status 
     * @return Status Service deployment status
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Service deployment status
     * @param Status Service deployment status
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get DNS ID assigned to the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return DnsName DNS ID assigned to the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getDnsName() {
        return this.DnsName;
    }

    /**
     * Set DNS ID assigned to the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     * @param DnsName DNS ID assigned to the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setDnsName(String DnsName) {
        this.DnsName = DnsName;
    }

    /**
     * Get Game session ID
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessionId Game session ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game session ID
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessionId Game session ID
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get Game session name
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessionName Game session name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getGameServerSessionName() {
        return this.GameServerSessionName;
    }

    /**
     * Set Game session name
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessionName Game session name
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessionName(String GameServerSessionName) {
        this.GameServerSessionName = GameServerSessionName;
    }

    /**
     * Get Service deployment region
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessionRegion Service deployment region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getGameServerSessionRegion() {
        return this.GameServerSessionRegion;
    }

    /**
     * Set Service deployment region
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessionRegion Service deployment region
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessionRegion(String GameServerSessionRegion) {
        this.GameServerSessionRegion = GameServerSessionRegion;
    }

    /**
     * Get Game attributes
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameProperties Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameProperties Game attributes
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get The maximum number of players that can be connected simultaneously to the game session. It should a value between 1 to the maximum number of player sessions. 
     * @return MaximumPlayerSessionCount The maximum number of players that can be connected simultaneously to the game session. It should a value between 1 to the maximum number of player sessions.
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set The maximum number of players that can be connected simultaneously to the game session. It should a value between 1 to the maximum number of player sessions.
     * @param MaximumPlayerSessionCount The maximum number of players that can be connected simultaneously to the game session. It should a value between 1 to the maximum number of player sessions.
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get Game session data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return GameServerSessionData Game session data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set Game session data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param GameServerSessionData Game session data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get IP address of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return IpAddress IP address of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getIpAddress() {
        return this.IpAddress;
    }

    /**
     * Set IP address of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     * @param IpAddress IP address of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setIpAddress(String IpAddress) {
        this.IpAddress = IpAddress;
    }

    /**
     * Get Port number of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Port Port number of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set Port number of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Port Port number of the instance where the game session is running
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get Game match data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MatchmakerData Game match data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMatchmakerData() {
        return this.MatchmakerData;
    }

    /**
     * Set Game match data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MatchmakerData Game match data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMatchmakerData(String MatchmakerData) {
        this.MatchmakerData = MatchmakerData;
    }

    /**
     * Get Deployed player game data
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return PlacedPlayerSessions Deployed player game data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public PlacedPlayerSession [] getPlacedPlayerSessions() {
        return this.PlacedPlayerSessions;
    }

    /**
     * Set Deployed player game data
Note: this field may return null, indicating that no valid values can be obtained.
     * @param PlacedPlayerSessions Deployed player game data
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPlacedPlayerSessions(PlacedPlayerSession [] PlacedPlayerSessions) {
        this.PlacedPlayerSessions = PlacedPlayerSessions;
    }

    /**
     * Get Start time 
     * @return StartTime Start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time
     * @param StartTime Start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return EndTime End time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time
Note: this field may return null, indicating that no valid values can be obtained.
     * @param EndTime End time
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public GameServerSessionPlacement() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GameServerSessionPlacement(GameServerSessionPlacement source) {
        if (source.PlacementId != null) {
            this.PlacementId = new String(source.PlacementId);
        }
        if (source.GameServerSessionQueueName != null) {
            this.GameServerSessionQueueName = new String(source.GameServerSessionQueueName);
        }
        if (source.PlayerLatencies != null) {
            this.PlayerLatencies = new PlayerLatency[source.PlayerLatencies.length];
            for (int i = 0; i < source.PlayerLatencies.length; i++) {
                this.PlayerLatencies[i] = new PlayerLatency(source.PlayerLatencies[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.DnsName != null) {
            this.DnsName = new String(source.DnsName);
        }
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.GameServerSessionName != null) {
            this.GameServerSessionName = new String(source.GameServerSessionName);
        }
        if (source.GameServerSessionRegion != null) {
            this.GameServerSessionRegion = new String(source.GameServerSessionRegion);
        }
        if (source.GameProperties != null) {
            this.GameProperties = new GameProperty[source.GameProperties.length];
            for (int i = 0; i < source.GameProperties.length; i++) {
                this.GameProperties[i] = new GameProperty(source.GameProperties[i]);
            }
        }
        if (source.MaximumPlayerSessionCount != null) {
            this.MaximumPlayerSessionCount = new Long(source.MaximumPlayerSessionCount);
        }
        if (source.GameServerSessionData != null) {
            this.GameServerSessionData = new String(source.GameServerSessionData);
        }
        if (source.IpAddress != null) {
            this.IpAddress = new String(source.IpAddress);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.MatchmakerData != null) {
            this.MatchmakerData = new String(source.MatchmakerData);
        }
        if (source.PlacedPlayerSessions != null) {
            this.PlacedPlayerSessions = new PlacedPlayerSession[source.PlacedPlayerSessions.length];
            for (int i = 0; i < source.PlacedPlayerSessions.length; i++) {
                this.PlacedPlayerSessions[i] = new PlacedPlayerSession(source.PlacedPlayerSessions[i]);
            }
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlacementId", this.PlacementId);
        this.setParamSimple(map, prefix + "GameServerSessionQueueName", this.GameServerSessionQueueName);
        this.setParamArrayObj(map, prefix + "PlayerLatencies.", this.PlayerLatencies);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DnsName", this.DnsName);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "GameServerSessionName", this.GameServerSessionName);
        this.setParamSimple(map, prefix + "GameServerSessionRegion", this.GameServerSessionRegion);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "IpAddress", this.IpAddress);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "MatchmakerData", this.MatchmakerData);
        this.setParamArrayObj(map, prefix + "PlacedPlayerSessions.", this.PlacedPlayerSessions);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

