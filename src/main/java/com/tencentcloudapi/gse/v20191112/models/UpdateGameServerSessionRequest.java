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

public class UpdateGameServerSessionRequest extends AbstractModel{

    /**
    * Game server session ID
    */
    @SerializedName("GameServerSessionId")
    @Expose
    private String GameServerSessionId;

    /**
    * Maximum number of players
    */
    @SerializedName("MaximumPlayerSessionCount")
    @Expose
    private Long MaximumPlayerSessionCount;

    /**
    * Game server session name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Player session creation policy. Valid values: ACCEPT_ALL, DENY_ALL
    */
    @SerializedName("PlayerSessionCreationPolicy")
    @Expose
    private String PlayerSessionCreationPolicy;

    /**
    * Protection policy. Valid values: NoProtection, TimeLimitProtection, FullProtection
    */
    @SerializedName("ProtectionPolicy")
    @Expose
    private String ProtectionPolicy;

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
     * Get Player session creation policy. Valid values: ACCEPT_ALL, DENY_ALL 
     * @return PlayerSessionCreationPolicy Player session creation policy. Valid values: ACCEPT_ALL, DENY_ALL
     */
    public String getPlayerSessionCreationPolicy() {
        return this.PlayerSessionCreationPolicy;
    }

    /**
     * Set Player session creation policy. Valid values: ACCEPT_ALL, DENY_ALL
     * @param PlayerSessionCreationPolicy Player session creation policy. Valid values: ACCEPT_ALL, DENY_ALL
     */
    public void setPlayerSessionCreationPolicy(String PlayerSessionCreationPolicy) {
        this.PlayerSessionCreationPolicy = PlayerSessionCreationPolicy;
    }

    /**
     * Get Protection policy. Valid values: NoProtection, TimeLimitProtection, FullProtection 
     * @return ProtectionPolicy Protection policy. Valid values: NoProtection, TimeLimitProtection, FullProtection
     */
    public String getProtectionPolicy() {
        return this.ProtectionPolicy;
    }

    /**
     * Set Protection policy. Valid values: NoProtection, TimeLimitProtection, FullProtection
     * @param ProtectionPolicy Protection policy. Valid values: NoProtection, TimeLimitProtection, FullProtection
     */
    public void setProtectionPolicy(String ProtectionPolicy) {
        this.ProtectionPolicy = ProtectionPolicy;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionId", this.GameServerSessionId);
        this.setParamSimple(map, prefix + "MaximumPlayerSessionCount", this.MaximumPlayerSessionCount);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "PlayerSessionCreationPolicy", this.PlayerSessionCreationPolicy);
        this.setParamSimple(map, prefix + "ProtectionPolicy", this.ProtectionPolicy);

    }
}

