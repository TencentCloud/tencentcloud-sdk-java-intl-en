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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSlowlogDetail extends AbstractModel{

    /**
    * Slow log duration
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * Client address
    */
    @SerializedName("Client")
    @Expose
    private String Client;

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
    * Execution duration
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * Node ID
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
     * Get Slow log duration 
     * @return Duration Slow log duration
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Slow log duration
     * @param Duration Slow log duration
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get Client address 
     * @return Client Client address
     */
    public String getClient() {
        return this.Client;
    }

    /**
     * Set Client address
     * @param Client Client address
     */
    public void setClient(String Client) {
        this.Client = Client;
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
     * Get Execution duration 
     * @return ExecuteTime Execution duration
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set Execution duration
     * @param ExecuteTime Execution duration
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Client", this.Client);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "CommandLine", this.CommandLine);
        this.setParamSimple(map, prefix + "ExecuteTime", this.ExecuteTime);
        this.setParamSimple(map, prefix + "Node", this.Node);

    }
}

