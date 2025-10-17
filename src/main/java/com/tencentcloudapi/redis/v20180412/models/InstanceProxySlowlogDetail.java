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

public class InstanceProxySlowlogDetail extends AbstractModel {

    /**
    * Slow query duration in milliseconds
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
    * Slow query command
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * Detailed command line information of slow query
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * Execution time
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * Duration of receiving client requests (ms).
    */
    @SerializedName("RecvClientEnd")
    @Expose
    private Long RecvClientEnd;

    /**
    * Duration of sending client requests (ms).
    */
    @SerializedName("SendClientEnd")
    @Expose
    private Long SendClientEnd;

    /**
     * Get Slow query duration in milliseconds 
     * @return Duration Slow query duration in milliseconds
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set Slow query duration in milliseconds
     * @param Duration Slow query duration in milliseconds
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
     * Get Slow query command 
     * @return Command Slow query command
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set Slow query command
     * @param Command Slow query command
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get Detailed command line information of slow query 
     * @return CommandLine Detailed command line information of slow query
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * Set Detailed command line information of slow query
     * @param CommandLine Detailed command line information of slow query
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

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
     * Get Duration of receiving client requests (ms). 
     * @return RecvClientEnd Duration of receiving client requests (ms).
     */
    public Long getRecvClientEnd() {
        return this.RecvClientEnd;
    }

    /**
     * Set Duration of receiving client requests (ms).
     * @param RecvClientEnd Duration of receiving client requests (ms).
     */
    public void setRecvClientEnd(Long RecvClientEnd) {
        this.RecvClientEnd = RecvClientEnd;
    }

    /**
     * Get Duration of sending client requests (ms). 
     * @return SendClientEnd Duration of sending client requests (ms).
     */
    public Long getSendClientEnd() {
        return this.SendClientEnd;
    }

    /**
     * Set Duration of sending client requests (ms).
     * @param SendClientEnd Duration of sending client requests (ms).
     */
    public void setSendClientEnd(Long SendClientEnd) {
        this.SendClientEnd = SendClientEnd;
    }

    public InstanceProxySlowlogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceProxySlowlogDetail(InstanceProxySlowlogDetail source) {
        if (source.Duration != null) {
            this.Duration = new Long(source.Duration);
        }
        if (source.Client != null) {
            this.Client = new String(source.Client);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.CommandLine != null) {
            this.CommandLine = new String(source.CommandLine);
        }
        if (source.ExecuteTime != null) {
            this.ExecuteTime = new String(source.ExecuteTime);
        }
        if (source.RecvClientEnd != null) {
            this.RecvClientEnd = new Long(source.RecvClientEnd);
        }
        if (source.SendClientEnd != null) {
            this.SendClientEnd = new Long(source.SendClientEnd);
        }
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
        this.setParamSimple(map, prefix + "RecvClientEnd", this.RecvClientEnd);
        this.setParamSimple(map, prefix + "SendClientEnd", this.SendClientEnd);

    }
}

