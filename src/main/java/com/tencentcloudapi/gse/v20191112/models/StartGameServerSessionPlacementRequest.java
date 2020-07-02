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

public class StartGameServerSessionPlacementRequest extends AbstractModel{

    /**
    * Unique ID of starting game server session placement
    */
    @SerializedName("PlacementId")
    @Expose
    private String PlacementId;

    /**
    * Game server session queue name
    */
    @SerializedName("GameServerSessionQueueName")
    @Expose
    private String GameServerSessionQueueName;

    /**
    * Maximum number of concurrent players allowed by the game server to connect to the game session
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * Player game session information
    */
    @SerializedName("DesiredPlayerSessions")
    @Expose
    private DesiredPlayerSession [] DesiredPlayerSessions;

    /**
    * Player game session attributes
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * Game server session data
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * Game server session name
    */
    @SerializedName("GameServerSessionName")
    @Expose
    private String GameServerSessionName;

    /**
    * Player latency
    */
    @SerializedName("PlayerLatencies")
    @Expose
    private PlayerLatency [] PlayerLatencies;

    /**
     * Get Unique ID of starting game server session placement 
     * @return PlacementId Unique ID of starting game server session placement
     */
    public String getPlacementId() {
        return this.PlacementId;
    }

    /**
     * Set Unique ID of starting game server session placement
     * @param PlacementId Unique ID of starting game server session placement
     */
    public void setPlacementId(String PlacementId) {
        this.PlacementId = PlacementId;
    }

    /**
     * Get Game server session queue name 
     * @return GameServerSessionQueueName Game server session queue name
     */
    public String getGameServerSessionQueueName() {
        return this.GameServerSessionQueueName;
    }

    /**
     * Set Game server session queue name
     * @param GameServerSessionQueueName Game server session queue name
     */
    public void setGameServerSessionQueueName(String GameServerSessionQueueName) {
        this.GameServerSessionQueueName = GameServerSessionQueueName;
    }

    /**
     * Get Maximum number of concurrent players allowed by the game server to connect to the game session 
     * @return MaximumPlayerSessionCount Maximum number of concurrent players allowed by the game server to connect to the game session
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set Maximum number of concurrent players allowed by the game server to connect to the game session
     * @param MaximumPlayerSessionCount Maximum number of concurrent players allowed by the game server to connect to the game session
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get Player game session information 
     * @return DesiredPlayerSessions Player game session information
     */
    public DesiredPlayerSession [] getDesiredPlayerSessions() {
        return this.DesiredPlayerSessions;
    }

    /**
     * Set Player game session information
     * @param DesiredPlayerSessions Player game session information
     */
    public void setDesiredPlayerSessions(DesiredPlayerSession [] DesiredPlayerSessions) {
        this.DesiredPlayerSessions = DesiredPlayerSessions;
    }

    /**
     * Get Player game session attributes 
     * @return GameProperties Player game session attributes
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Player game session attributes
     * @param GameProperties Player game session attributes
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get Game server session data 
     * @return GameServerSessionData Game server session data
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set Game server session data
     * @param GameServerSessionData Game server session data
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get Game server session name 
     * @return GameServerSessionName Game server session name
     */
    public String getGameServerSessionName() {
        return this.GameServerSessionName;
    }

    /**
     * Set Game server session name
     * @param GameServerSessionName Game server session name
     */
    public void setGameServerSessionName(String GameServerSessionName) {
        this.GameServerSessionName = GameServerSessionName;
    }

    /**
     * Get Player latency 
     * @return PlayerLatencies Player latency
     */
    public PlayerLatency [] getPlayerLatencies() {
        return this.PlayerLatencies;
    }

    /**
     * Set Player latency
     * @param PlayerLatencies Player latency
     */
    public void setPlayerLatencies(PlayerLatency [] PlayerLatencies) {
        this.PlayerLatencies = PlayerLatencies;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PlacementId", this.PlacementId);
        this.setParamSimple(map, prefix + "GameServerSessionQueueName", this.GameServerSessionQueueName);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamArrayObj(map, prefix + "DesiredPlayerSessions.", this.DesiredPlayerSessions);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "GameServerSessionName", this.GameServerSessionName);
        this.setParamArrayObj(map, prefix + "PlayerLatencies.", this.PlayerLatencies);

    }
}

