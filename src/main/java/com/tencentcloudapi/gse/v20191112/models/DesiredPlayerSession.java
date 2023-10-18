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

public class DesiredPlayerSession extends AbstractModel {

    /**
    * Unique player ID associated with player session
    */
    @SerializedName("PlayerId")
    @Expose
    private String PlayerId;

    /**
    * Developer-defined player data
    */
    @SerializedName("PlayerData")
    @Expose
    private String PlayerData;

    /**
     * Get Unique player ID associated with player session 
     * @return PlayerId Unique player ID associated with player session
     */
    public String getPlayerId() {
        return this.PlayerId;
    }

    /**
     * Set Unique player ID associated with player session
     * @param PlayerId Unique player ID associated with player session
     */
    public void setPlayerId(String PlayerId) {
        this.PlayerId = PlayerId;
    }

    /**
     * Get Developer-defined player data 
     * @return PlayerData Developer-defined player data
     */
    public String getPlayerData() {
        return this.PlayerData;
    }

    /**
     * Set Developer-defined player data
     * @param PlayerData Developer-defined player data
     */
    public void setPlayerData(String PlayerData) {
        this.PlayerData = PlayerData;
    }

    public DesiredPlayerSession() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DesiredPlayerSession(DesiredPlayerSession source) {
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
        this.setParamSimple(map, prefix + "PlayerId", this.PlayerId);
        this.setParamSimple(map, prefix + "PlayerData", this.PlayerData);

    }
}

