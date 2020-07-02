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

public class CreateGameServerSessionRequest extends AbstractModel{

    /**
    * Maximum number of players
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * Alias ID
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * Creator ID
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Fleet ID
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Game attributes
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * Game server session attribute details
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * Custom ID of game server session
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Idempotency token
    */
    @SerializedName("IdempotencyToken")
    @Expose
    private String IdempotencyToken;

    /**
    * Game server session name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get Maximum number of players 
     * @return MaximumPlayerSessionCount Maximum number of players
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set Maximum number of players
     * @param MaximumPlayerSessionCount Maximum number of players
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get Alias ID 
     * @return AliasId Alias ID
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set Alias ID
     * @param AliasId Alias ID
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get Creator ID 
     * @return CreatorId Creator ID
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID
     * @param CreatorId Creator ID
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
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
     * Get Game attributes 
     * @return GameProperties Game attributes
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Game attributes
     * @param GameProperties Game attributes
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get Game server session attribute details 
     * @return GameServerSessionData Game server session attribute details
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set Game server session attribute details
     * @param GameServerSessionData Game server session attribute details
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get Custom ID of game server session 
     * @return GameServerSessionId Custom ID of game server session
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Custom ID of game server session
     * @param GameServerSessionId Custom ID of game server session
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get Idempotency token 
     * @return IdempotencyToken Idempotency token
     */
    public String getIdempotencyToken() {
        return this.IdempotencyToken;
    }

    /**
     * Set Idempotency token
     * @param IdempotencyToken Idempotency token
     */
    public void setIdempotencyToken(String IdempotencyToken) {
        this.IdempotencyToken = IdempotencyToken;
    }

    /**
     * Get Game server session name 
     * @return Name Game server session name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Game server session name
     * @param Name Game server session name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "AliasId", this.AliasId);
        this.setParamSimple(map, prefix + "CreatorId", this.CreatorId);
        this.setParamSimple(map, prefix + "FleetId", this.FleetId);
        this.setParamArrayObj(map, prefix + "GameProperties.", this.GameProperties);
        this.setParamSimple(map, prefix + "GameServerSessionData", this.GameServerSessionData);
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "IdempotencyToken", this.IdempotencyToken);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

