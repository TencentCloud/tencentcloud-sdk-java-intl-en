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

public class JoinGameServerSessionRequest extends AbstractModel{

    /**
    * Game server session ID. It should contain 1 to 256 ASCII characters.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Player ID. Up to 1024 ASCII characters are allowed.
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * Player custom data. Up to 2048 ASCII characters are allowed.
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

    /**
     * Get Game server session ID. It should contain 1 to 256 ASCII characters. 
     * @return GameServerSessionId Game server session ID. It should contain 1 to 256 ASCII characters.
     */
    public String getGameServerSessionId() {
        return this.GameServerSessionId;
    }

    /**
     * Set Game server session ID. It should contain 1 to 256 ASCII characters.
     * @param GameServerSessionId Game server session ID. It should contain 1 to 256 ASCII characters.
     */
    public void setGameServerSessionId(String GameServerSessionId) {
        this.GameServerSessionId = GameServerSessionId;
    }

    /**
     * Get Player ID. Up to 1024 ASCII characters are allowed. 
     * @return PlayerId Player ID. Up to 1024 ASCII characters are allowed.
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set Player ID. Up to 1024 ASCII characters are allowed.
     * @param PlayerId Player ID. Up to 1024 ASCII characters are allowed.
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get Player custom data. Up to 2048 ASCII characters are allowed. 
     * @return PlayerData Player custom data. Up to 2048 ASCII characters are allowed.
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set Player custom data. Up to 2048 ASCII characters are allowed.
     * @param PlayerData Player custom data. Up to 2048 ASCII characters are allowed.
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    public JoinGameServerSessionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinGameServerSessionRequest(JoinGameServerSessionRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.PlayerId != null) {
            this.PlayerId = new String(source.PlayerId);
        }
        if (source.PlayerData != null) {
            this.PlayerData = new String(source.PlayerData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerData", this.PlayerData);

    }
}

