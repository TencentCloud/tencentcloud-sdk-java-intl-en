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

public class JoinGameServerSessionBatchRequest extends AbstractModel {

    /**
    * Game server session ID. It should contain 1 to 256 ASCII characters.
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Player ID list. At least 1 ID and up to 25 IDs.
    */
    @SerializedName("PlayerIds")
    @Expose
    private String [] PlayerIds;

    /**
    * Player custom data
    */
    @SerializedName("PlayerDataMap")
    @Expose
    private PlayerDataMap PlayerDataMap;

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
     * Get Player ID list. At least 1 ID and up to 25 IDs. 
     * @return PlayerIds Player ID list. At least 1 ID and up to 25 IDs.
     */
    public String [] getPlayerIds() {
        return this.PlayerIds;
    }

    /**
     * Set Player ID list. At least 1 ID and up to 25 IDs.
     * @param PlayerIds Player ID list. At least 1 ID and up to 25 IDs.
     */
    public void setPlayerIds(String [] PlayerIds) {
        this.PlayerIds = PlayerIds;
    }

    /**
     * Get Player custom data 
     * @return PlayerDataMap Player custom data
     */
    public PlayerDataMap getPlayerDataMap() {
        return this.PlayerDataMap;
    }

    /**
     * Set Player custom data
     * @param PlayerDataMap Player custom data
     */
    public void setPlayerDataMap(PlayerDataMap PlayerDataMap) {
        this.PlayerDataMap = PlayerDataMap;
    }

    public JoinGameServerSessionBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JoinGameServerSessionBatchRequest(JoinGameServerSessionBatchRequest source) {
        if (source.GameServerSessionId != null) {
            this.GameServerSessionId = new String(source.GameServerSessionId);
        }
        if (source.PlayerIds != null) {
            this.PlayerIds = new String[source.PlayerIds.length];
            for (int i = 0; i < source.PlayerIds.length; i++) {
                this.PlayerIds[i] = new String(source.PlayerIds[i]);
            }
        }
        if (source.PlayerDataMap != null) {
            this.PlayerDataMap = new PlayerDataMap(source.PlayerDataMap);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamArraySimple(map, prefix + "PlayerIds.", this.PlayerIds);
        this.setParamObj(map, prefix + "PlayerDataMap.", this.PlayerDataMap);

    }
}

