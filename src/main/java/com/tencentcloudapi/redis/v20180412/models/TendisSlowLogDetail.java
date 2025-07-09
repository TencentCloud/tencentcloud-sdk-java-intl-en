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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TendisSlowLogDetail extends AbstractModel {

    /**
    * Execution time
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * Duration of the slow query (ms)
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Command
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Command line details
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * Node ID
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
     * Get Execution time 
     * @return ExecuteTime Execution time
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set Execution time
     * @param ExecuteTime Execution time
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * Get Duration of the slow query (ms) 
     * @return Duration Duration of the slow query (ms)
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Duration of the slow query (ms)
     * @param Duration Duration of the slow query (ms)
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Command 
     * @return Command Command
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Command
     * @param Command Command
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Command line details 
     * @return CommandLine Command line details
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * Set Command line details
     * @param CommandLine Command line details
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

    /**
     * Get Node ID 
     * @return Node Node ID
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set Node ID
     * @param Node Node ID
     */
    public void setNode(String Node) {
        this.Node = Node;
    }

    public TendisSlowLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TendisSlowLogDetail(TendisSlowLogDetail source) {
        if (source.ExecuteTime != null) {
            this.ExecuteTime = new String(source.ExecuteTime);
        }
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.CommandLine != null) {
            this.CommandLine = new String(source.CommandLine);
        }
        if (source.Node != null) {
            this.Node = new String(source.Node);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExecuteTime", this.ExecuteTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "CommandLine", this.CommandLine);
        this.setParamSimple(map, prefix + "Node", this.Node);

    }
}

