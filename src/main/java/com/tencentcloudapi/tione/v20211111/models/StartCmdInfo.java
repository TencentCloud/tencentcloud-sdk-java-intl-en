/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartCmdInfo extends AbstractModel {

    /**
    * Startup command.
    */
    @SerializedName("StartCmd")
    @Expose
    private String StartCmd;

    /**
    * Startup command for ps nodes.
    */
    @SerializedName("PsStartCmd")
    @Expose
    private String PsStartCmd;

    /**
    * Startup command for Worker nodes.
    */
    @SerializedName("WorkerStartCmd")
    @Expose
    private String WorkerStartCmd;

    /**
     * Get Startup command. 
     * @return StartCmd Startup command.
     */
    public String getStartCmd() {
        return this.StartCmd;
    }

    /**
     * Set Startup command.
     * @param StartCmd Startup command.
     */
    public void setStartCmd(String StartCmd) {
        this.StartCmd = StartCmd;
    }

    /**
     * Get Startup command for ps nodes. 
     * @return PsStartCmd Startup command for ps nodes.
     */
    public String getPsStartCmd() {
        return this.PsStartCmd;
    }

    /**
     * Set Startup command for ps nodes.
     * @param PsStartCmd Startup command for ps nodes.
     */
    public void setPsStartCmd(String PsStartCmd) {
        this.PsStartCmd = PsStartCmd;
    }

    /**
     * Get Startup command for Worker nodes. 
     * @return WorkerStartCmd Startup command for Worker nodes.
     */
    public String getWorkerStartCmd() {
        return this.WorkerStartCmd;
    }

    /**
     * Set Startup command for Worker nodes.
     * @param WorkerStartCmd Startup command for Worker nodes.
     */
    public void setWorkerStartCmd(String WorkerStartCmd) {
        this.WorkerStartCmd = WorkerStartCmd;
    }

    public StartCmdInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StartCmdInfo(StartCmdInfo source) {
        if (source.StartCmd != null) {
            this.StartCmd = new String(source.StartCmd);
        }
        if (source.PsStartCmd != null) {
            this.PsStartCmd = new String(source.PsStartCmd);
        }
        if (source.WorkerStartCmd != null) {
            this.WorkerStartCmd = new String(source.WorkerStartCmd);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartCmd", this.StartCmd);
        this.setParamSimple(map, prefix + "PsStartCmd", this.PsStartCmd);
        this.setParamSimple(map, prefix + "WorkerStartCmd", this.WorkerStartCmd);

    }
}

