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

public class CreateGameServerSessionRequest extends AbstractModel {

    /**
    * The maximum number of players, which cannot be less than 0.
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * Alias ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
    */
    @SerializedName("AliasId")
    @Expose
    private String AliasId;

    /**
    * Creator ID. Up to 1024 ASCII characters are allowed.
    */
    @SerializedName("CreatorId")
    @Expose
    private String CreatorId;

    /**
    * Fleet ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
    */
    @SerializedName("FleetId")
    @Expose
    private String FleetId;

    /**
    * Game attributes. Up to 16 groups of attributes are allowed.
    */
    @SerializedName("GameProperties")
    @Expose
    private GameProperty [] GameProperties;

    /**
    * The attribute details of game server session. Up to 4096 ASCII characters are allowed.
    */
    @SerializedName("GameServerSessionData")
    @Expose
    private String GameServerSessionData;

    /**
    * The custom ID of game server session. Up to 4096 ASCII characters are allowed.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Idempotency token. Up to 48 ASCII characters are allowed.
    */
    @SerializedName("IdempotencyToken")
    @Expose
    private String IdempotencyToken;

    /**
    * The name of game server session. Up to 1024 ASCII characters are allowed.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get The maximum number of players, which cannot be less than 0. 
     * @return MaximumPlayerSessionCount The maximum number of players, which cannot be less than 0.
     */
    public Long getMaximumPlayerSessionCount() {
        return this.MaximumPlayerSessionCount;
    }

    /**
     * Set The maximum number of players, which cannot be less than 0.
     * @param MaximumPlayerSessionCount The maximum number of players, which cannot be less than 0.
     */
    public void setMaximumPlayerSessionCount(Long MaximumPlayerSessionCount) {
        this.MaximumPlayerSessionCount = MaximumPlayerSessionCount;
    }

    /**
     * Get Alias ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail. 
     * @return AliasId Alias ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
     */
    public String getAliasId() {
        return this.AliasId;
    }

    /**
     * Set Alias ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
     * @param AliasId Alias ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
     */
    public void setAliasId(String AliasId) {
        this.AliasId = AliasId;
    }

    /**
     * Get Creator ID. Up to 1024 ASCII characters are allowed. 
     * @return CreatorId Creator ID. Up to 1024 ASCII characters are allowed.
     */
    public String getCreatorId() {
        return this.CreatorId;
    }

    /**
     * Set Creator ID. Up to 1024 ASCII characters are allowed.
     * @param CreatorId Creator ID. Up to 1024 ASCII characters are allowed.
     */
    public void setCreatorId(String CreatorId) {
        this.CreatorId = CreatorId;
    }

    /**
     * Get Fleet ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail. 
     * @return FleetId Fleet ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
     */
    public String getFleetId() {
        return this.FleetId;
    }

    /**
     * Set Fleet ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
     * @param FleetId Fleet ID. You need to specify an alias ID or fleet ID for each request. If both of them are specified, the fleet ID shall prevail.
     */
    public void setFleetId(String FleetId) {
        this.FleetId = FleetId;
    }

    /**
     * Get Game attributes. Up to 16 groups of attributes are allowed. 
     * @return GameProperties Game attributes. Up to 16 groups of attributes are allowed.
     */
    public GameProperty [] getGameProperties() {
        return this.GameProperties;
    }

    /**
     * Set Game attributes. Up to 16 groups of attributes are allowed.
     * @param GameProperties Game attributes. Up to 16 groups of attributes are allowed.
     */
    public void setGameProperties(GameProperty [] GameProperties) {
        this.GameProperties = GameProperties;
    }

    /**
     * Get The attribute details of game server session. Up to 4096 ASCII characters are allowed. 
     * @return GameServerSessionData The attribute details of game server session. Up to 4096 ASCII characters are allowed.
     */
    public String getGameServerSessionData() {
        return this.GameServerSessionData;
    }

    /**
     * Set The attribute details of game server session. Up to 4096 ASCII characters are allowed.
     * @param GameServerSessionData The attribute details of game server session. Up to 4096 ASCII characters are allowed.
     */
    public void setGameServerSessionData(String GameServerSessionData) {
        this.GameServerSessionData = GameServerSessionData;
    }

    /**
     * Get The custom ID of game server session. Up to 4096 ASCII characters are allowed. 
     * @return GameServerSessionId The custom ID of game server session. Up to 4096 ASCII characters are allowed.
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set The custom ID of game server session. Up to 4096 ASCII characters are allowed.
     * @param GameServerSessionId The custom ID of game server session. Up to 4096 ASCII characters are allowed.
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get Idempotency token. Up to 48 ASCII characters are allowed. 
     * @return IdempotencyToken Idempotency token. Up to 48 ASCII characters are allowed.
     */
    public String getIdempotencyToken() {
        return this.IdempotencyToken;
    }

    /**
     * Set Idempotency token. Up to 48 ASCII characters are allowed.
     * @param IdempotencyToken Idempotency token. Up to 48 ASCII characters are allowed.
     */
    public void setIdempotencyToken(String IdempotencyToken) {
        this.IdempotencyToken = IdempotencyToken;
    }

    /**
     * Get The name of game server session. Up to 1024 ASCII characters are allowed. 
     * @return Name The name of game server session. Up to 1024 ASCII characters are allowed.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set The name of game server session. Up to 1024 ASCII characters are allowed.
     * @param Name The name of game server session. Up to 1024 ASCII characters are allowed.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public CreateGameServerSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateGameServerSessionRequest(CreateGameServerSessionRequest source) {
        if (source.MaximumPlayerSessionCount != null) {
            this.MaximumPlayerSessionCount = new Long(source.MaximumPlayerSessionCount);
        }
        if (source.AliasId != null) {
            this.AliasId = new String(source.AliasId);
        }
        if (source.CreatorId != null) {
            this.CreatorId = new String(source.CreatorId);
        }
        if (source.FleetId != null) {
            this.FleetId = new String(source.FleetId);
        }
        if (source.GameProperties != null) {
            this.GameProperties = new GameProperty[source.GameProperties.length];
            for (int i = 0; i < source.GameProperties.length; i++) {
                this.GameProperties[i] = new GameProperty(source.GameProperties[i]);
            }
        }
        if (source.GameServerSessionData != null) {
            this.GameServerSessionData = new String(source.GameServerSessionData);
        }
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.IdempotencyToken != null) {
            this.IdempotencyToken = new String(source.IdempotencyToken);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
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

