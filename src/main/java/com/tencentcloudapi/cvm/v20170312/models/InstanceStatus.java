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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceStatus extends AbstractModel {

    /**
    * Instance `ID`.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance status. Valid values:<br><li>PENDING: Creating.<br></li><li>LAUNCH_FAILED: Creation failed.<br></li><li>RUNNING: Running.<br></li><li>STOPPED: Shut down.<br></li><li>STARTING: Starting up.<br></li><li>STOPPING: Shutting down.<br></li><li>REBOOTING: Restarting.<br></li><li>SHUTDOWN: Shut down and to be terminated.<br></li><li>TERMINATING: Terminating.<br></li><li>ENTER_RESCUE_MODE: Entering the rescue mode.<br></li><li>RESCUE_MODE: In the rescue mode.<br></li><li>EXIT_RESCUE_MODE: Exiting the rescue mode.<br></li><li>ENTER_SERVICE_LIVE_MIGRATE: Entering online service migration.<br></li><li>SERVICE_LIVE_MIGRATE: In online service migration.<br></li><li>EXIT_SERVICE_LIVE_MIGRATE: Exiting online service migration.<br></li>
    */
    @SerializedName("InstanceState")
    @Expose
    private String InstanceState;

    /**
     * Get Instance `ID`. 
     * @return InstanceId Instance `ID`.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance `ID`.
     * @param InstanceId Instance `ID`.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance status. Valid values:<br><li>PENDING: Creating.<br></li><li>LAUNCH_FAILED: Creation failed.<br></li><li>RUNNING: Running.<br></li><li>STOPPED: Shut down.<br></li><li>STARTING: Starting up.<br></li><li>STOPPING: Shutting down.<br></li><li>REBOOTING: Restarting.<br></li><li>SHUTDOWN: Shut down and to be terminated.<br></li><li>TERMINATING: Terminating.<br></li><li>ENTER_RESCUE_MODE: Entering the rescue mode.<br></li><li>RESCUE_MODE: In the rescue mode.<br></li><li>EXIT_RESCUE_MODE: Exiting the rescue mode.<br></li><li>ENTER_SERVICE_LIVE_MIGRATE: Entering online service migration.<br></li><li>SERVICE_LIVE_MIGRATE: In online service migration.<br></li><li>EXIT_SERVICE_LIVE_MIGRATE: Exiting online service migration.<br></li> 
     * @return InstanceState Instance status. Valid values:<br><li>PENDING: Creating.<br></li><li>LAUNCH_FAILED: Creation failed.<br></li><li>RUNNING: Running.<br></li><li>STOPPED: Shut down.<br></li><li>STARTING: Starting up.<br></li><li>STOPPING: Shutting down.<br></li><li>REBOOTING: Restarting.<br></li><li>SHUTDOWN: Shut down and to be terminated.<br></li><li>TERMINATING: Terminating.<br></li><li>ENTER_RESCUE_MODE: Entering the rescue mode.<br></li><li>RESCUE_MODE: In the rescue mode.<br></li><li>EXIT_RESCUE_MODE: Exiting the rescue mode.<br></li><li>ENTER_SERVICE_LIVE_MIGRATE: Entering online service migration.<br></li><li>SERVICE_LIVE_MIGRATE: In online service migration.<br></li><li>EXIT_SERVICE_LIVE_MIGRATE: Exiting online service migration.<br></li>
     */
    public String getInstanceState() {
        return this.InstanceState;
    }

    /**
     * Set Instance status. Valid values:<br><li>PENDING: Creating.<br></li><li>LAUNCH_FAILED: Creation failed.<br></li><li>RUNNING: Running.<br></li><li>STOPPED: Shut down.<br></li><li>STARTING: Starting up.<br></li><li>STOPPING: Shutting down.<br></li><li>REBOOTING: Restarting.<br></li><li>SHUTDOWN: Shut down and to be terminated.<br></li><li>TERMINATING: Terminating.<br></li><li>ENTER_RESCUE_MODE: Entering the rescue mode.<br></li><li>RESCUE_MODE: In the rescue mode.<br></li><li>EXIT_RESCUE_MODE: Exiting the rescue mode.<br></li><li>ENTER_SERVICE_LIVE_MIGRATE: Entering online service migration.<br></li><li>SERVICE_LIVE_MIGRATE: In online service migration.<br></li><li>EXIT_SERVICE_LIVE_MIGRATE: Exiting online service migration.<br></li>
     * @param InstanceState Instance status. Valid values:<br><li>PENDING: Creating.<br></li><li>LAUNCH_FAILED: Creation failed.<br></li><li>RUNNING: Running.<br></li><li>STOPPED: Shut down.<br></li><li>STARTING: Starting up.<br></li><li>STOPPING: Shutting down.<br></li><li>REBOOTING: Restarting.<br></li><li>SHUTDOWN: Shut down and to be terminated.<br></li><li>TERMINATING: Terminating.<br></li><li>ENTER_RESCUE_MODE: Entering the rescue mode.<br></li><li>RESCUE_MODE: In the rescue mode.<br></li><li>EXIT_RESCUE_MODE: Exiting the rescue mode.<br></li><li>ENTER_SERVICE_LIVE_MIGRATE: Entering online service migration.<br></li><li>SERVICE_LIVE_MIGRATE: In online service migration.<br></li><li>EXIT_SERVICE_LIVE_MIGRATE: Exiting online service migration.<br></li>
     */
    public void setInstanceState(String InstanceState) {
        this.InstanceState = InstanceState;
    }

    public InstanceStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceStatus(InstanceStatus source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceState != null) {
            this.InstanceState = new String(source.InstanceState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceState", this.InstanceState);

    }
}

