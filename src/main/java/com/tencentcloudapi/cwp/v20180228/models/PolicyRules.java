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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PolicyRules extends AbstractModel {

    /**
    * Process
    */
    @SerializedName("Process")
    @Expose
    private CommandLine Process;

    /**
    * Parent process
    */
    @SerializedName("PProcess")
    @Expose
    private CommandLine PProcess;

    /**
    * Ancestor process
    */
    @SerializedName("AProcess")
    @Expose
    private CommandLine AProcess;

    /**
     * Get Process 
     * @return Process Process
     */
    public CommandLine getProcess() {
        return this.Process;
    }

    /**
     * Set Process
     * @param Process Process
     */
    public void setProcess(CommandLine Process) {
        this.Process = Process;
    }

    /**
     * Get Parent process 
     * @return PProcess Parent process
     */
    public CommandLine getPProcess() {
        return this.PProcess;
    }

    /**
     * Set Parent process
     * @param PProcess Parent process
     */
    public void setPProcess(CommandLine PProcess) {
        this.PProcess = PProcess;
    }

    /**
     * Get Ancestor process 
     * @return AProcess Ancestor process
     */
    public CommandLine getAProcess() {
        return this.AProcess;
    }

    /**
     * Set Ancestor process
     * @param AProcess Ancestor process
     */
    public void setAProcess(CommandLine AProcess) {
        this.AProcess = AProcess;
    }

    public PolicyRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PolicyRules(PolicyRules source) {
        if (source.Process != null) {
            this.Process = new CommandLine(source.Process);
        }
        if (source.PProcess != null) {
            this.PProcess = new CommandLine(source.PProcess);
        }
        if (source.AProcess != null) {
            this.AProcess = new CommandLine(source.AProcess);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Process.", this.Process);
        this.setParamObj(map, prefix + "PProcess.", this.PProcess);
        this.setParamObj(map, prefix + "AProcess.", this.AProcess);

    }
}

