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

public class GameServerSessionDetail extends AbstractModel{

    /**
    * Game server session
    */
    @SerializedName("GameServerSession")
    @Expose
    private GameServerSession GameServerSession;

    /**
    * Protection policy. Valid values: NoProtection, FullProtection
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProtectionPolicy")
    @Expose
    private String ProtectionPolicy;

    /**
     * Get Game server session 
     * @return GameServerSession Game server session
     */
    public GameServerSession getGameServerSession() {
        return this.GameServerSession;
    }

    /**
     * Set Game server session
     * @param GameServerSession Game server session
     */
    public void setGameServerSession(GameServerSession GameServerSession) {
        this.GameServerSession = GameServerSession;
    }

    /**
     * Get Protection policy. Valid values: NoProtection, FullProtection
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProtectionPolicy Protection policy. Valid values: NoProtection, FullProtection
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProtectionPolicy() {
        return this.ProtectionPolicy;
    }

    /**
     * Set Protection policy. Valid values: NoProtection, FullProtection
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProtectionPolicy Protection policy. Valid values: NoProtection, FullProtection
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProtectionPolicy(String ProtectionPolicy) {
        this.ProtectionPolicy = ProtectionPolicy;
    }

    public GameServerSessionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GameServerSessionDetail(GameServerSessionDetail source) {
        if (source.GameServerSession != null) {
            this.GameServerSession = new GameServerSession(source.GameServerSession);
        }
        if (source.ProtectionPolicy != null) {
            this.ProtectionPolicy = new String(source.ProtectionPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "GameServerSession.", this.GameServerSession);
        this.setParamSimple(map, prefix + "ProtectionPolicy", this.ProtectionPolicy);

    }
}

