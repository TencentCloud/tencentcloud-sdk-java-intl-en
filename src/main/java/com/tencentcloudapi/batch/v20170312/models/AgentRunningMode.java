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
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AgentRunningMode extends AbstractModel{

    /**
    * Scenario type. Windows is supported
    */
    @SerializedName("Scene")
    @Expose
    private String Scene;

    /**
    * The user that runs the Agent
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * The session that runs the Agent
    */
    @SerializedName("Session")
    @Expose
    private String Session;

    /**
     * Get Scenario type. Windows is supported 
     * @return Scene Scenario type. Windows is supported
     */
    public String getScene() {
        return this.Scene;
    }

    /**
     * Set Scenario type. Windows is supported
     * @param Scene Scenario type. Windows is supported
     */
    public void setScene(String Scene) {
        this.Scene = Scene;
    }

    /**
     * Get The user that runs the Agent 
     * @return User The user that runs the Agent
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set The user that runs the Agent
     * @param User The user that runs the Agent
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get The session that runs the Agent 
     * @return Session The session that runs the Agent
     */
    public String getSession() {
        return this.Session;
    }

    /**
     * Set The session that runs the Agent
     * @param Session The session that runs the Agent
     */
    public void setSession(String Session) {
        this.Session = Session;
    }

    public AgentRunningMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AgentRunningMode(AgentRunningMode source) {
        if (source.Scene != null) {
            this.Scene = new String(source.Scene);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.Session != null) {
            this.Session = new String(source.Session);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "Session", this.Session);

    }
}

