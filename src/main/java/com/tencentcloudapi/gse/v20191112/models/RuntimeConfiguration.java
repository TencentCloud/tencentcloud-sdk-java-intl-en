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

public class RuntimeConfiguration extends AbstractModel {

    /**
    * Game session timeout. Value range: 1-600. Unit: second.
    */
    @SerializedName("GameServerSessionActivationTimeoutSeconds")
    @Expose
    private Long GameServerSessionActivationTimeoutSeconds;

    /**
    * Maximum number of game sessions. Value range: 1-2,147,483,647.
    */
    @SerializedName("MaxConcurrentGameServerSessionActivations")
    @Expose
    private Long MaxConcurrentGameServerSessionActivations;

    /**
    * Service process configuration. There must be at least one service configuration.
    */
    @SerializedName("ServerProcesses")
    @Expose
    private ServerProcesse [] ServerProcesses;

    /**
     * Get Game session timeout. Value range: 1-600. Unit: second. 
     * @return GameServerSessionActivationTimeoutSeconds Game session timeout. Value range: 1-600. Unit: second.
     */
    public Long getGameServerSessionActivationTimeoutSeconds() {
        return this.GameServerSessionActivationTimeoutSeconds;
    }

    /**
     * Set Game session timeout. Value range: 1-600. Unit: second.
     * @param GameServerSessionActivationTimeoutSeconds Game session timeout. Value range: 1-600. Unit: second.
     */
    public void setGameServerSessionActivationTimeoutSeconds(Long GameServerSessionActivationTimeoutSeconds) {
        this.GameServerSessionActivationTimeoutSeconds = GameServerSessionActivationTimeoutSeconds;
    }

    /**
     * Get Maximum number of game sessions. Value range: 1-2,147,483,647. 
     * @return MaxConcurrentGameServerSessionActivations Maximum number of game sessions. Value range: 1-2,147,483,647.
     */
    public Long getMaxConcurrentGameServerSessionActivations() {
        return this.MaxConcurrentGameServerSessionActivations;
    }

    /**
     * Set Maximum number of game sessions. Value range: 1-2,147,483,647.
     * @param MaxConcurrentGameServerSessionActivations Maximum number of game sessions. Value range: 1-2,147,483,647.
     */
    public void setMaxConcurrentGameServerSessionActivations(Long MaxConcurrentGameServerSessionActivations) {
        this.MaxConcurrentGameServerSessionActivations = MaxConcurrentGameServerSessionActivations;
    }

    /**
     * Get Service process configuration. There must be at least one service configuration. 
     * @return ServerProcesses Service process configuration. There must be at least one service configuration.
     */
    public ServerProcesse [] getServerProcesses() {
        return this.ServerProcesses;
    }

    /**
     * Set Service process configuration. There must be at least one service configuration.
     * @param ServerProcesses Service process configuration. There must be at least one service configuration.
     */
    public void setServerProcesses(ServerProcesse [] ServerProcesses) {
        this.ServerProcesses = ServerProcesses;
    }

    public RuntimeConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeConfiguration(RuntimeConfiguration source) {
        if (source.GameServerSessionActivationTimeoutSeconds != null) {
            this.GameServerSessionActivationTimeoutSeconds = new Long(source.GameServerSessionActivationTimeoutSeconds);
        }
        if (source.MaxConcurrentGameServerSessionActivations != null) {
            this.MaxConcurrentGameServerSessionActivations = new Long(source.MaxConcurrentGameServerSessionActivations);
        }
        if (source.ServerProcesses != null) {
            this.ServerProcesses = new ServerProcesse[source.ServerProcesses.length];
            for (int i = 0; i < source.ServerProcesses.length; i++) {
                this.ServerProcesses[i] = new ServerProcesse(source.ServerProcesses[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GameServerSessionActivationTimeoutSeconds", this.GameServerSessionActivationTimeoutSeconds);
        this.setParamSimple(map, prefix + "MaxConcurrentGameServerSessionActivations", this.MaxConcurrentGameServerSessionActivations);
        this.setParamArrayObj(map, prefix + "ServerProcesses.", this.ServerProcesses);

    }
}

