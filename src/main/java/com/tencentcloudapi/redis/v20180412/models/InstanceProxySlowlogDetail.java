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
    * <p>Slow query duration. Measurement unit: ms.</p>
    */
    @SerializedName("Duration")
    @Expose
    private Long Duration;

    /**
    * <p>Client address.</p>
    */
    @SerializedName("Client")
    @Expose
    private String Client;

    /**
    * <p>Slow query command.</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>Slow query command line information.</p>
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * <p>Execution time.</p>
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
    * <p>Duration of receiving client requests (ms)</p>
    */
    @SerializedName("RecvClientEnd")
    @Expose
    private Long RecvClientEnd;

    /**
    * <p>Duration of sending client requests (ms)</p>
    */
    @SerializedName("SendClientEnd")
    @Expose
    private Long SendClientEnd;

    /**
    * <p>Proxy node ID.</p>
    */
    @SerializedName("Node")
    @Expose
    private String Node;

    /**
     * Get <p>Slow query duration. Measurement unit: ms.</p> 
     * @return Duration <p>Slow query duration. Measurement unit: ms.</p>
     */
    public Long getDuration() {
        return this.Duration;
    }

    /**
     * Set <p>Slow query duration. Measurement unit: ms.</p>
     * @param Duration <p>Slow query duration. Measurement unit: ms.</p>
     */
    public void setDuration(Long Duration) {
        this.Duration = Duration;
    }

    /**
     * Get <p>Client address.</p> 
     * @return Client <p>Client address.</p>
     */
    public String getClient() {
        return this.Client;
    }

    /**
     * Set <p>Client address.</p>
     * @param Client <p>Client address.</p>
     */
    public void setClient(String Client) {
        this.Client = Client;
    }

    /**
     * Get <p>Slow query command.</p> 
     * @return Command <p>Slow query command.</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>Slow query command.</p>
     * @param Command <p>Slow query command.</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>Slow query command line information.</p> 
     * @return CommandLine <p>Slow query command line information.</p>
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * Set <p>Slow query command line information.</p>
     * @param CommandLine <p>Slow query command line information.</p>
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

    /**
     * Get <p>Execution time.</p> 
     * @return ExecuteTime <p>Execution time.</p>
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * Set <p>Execution time.</p>
     * @param ExecuteTime <p>Execution time.</p>
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * Get <p>Duration of receiving client requests (ms)</p> 
     * @return RecvClientEnd <p>Duration of receiving client requests (ms)</p>
     */
    public Long getRecvClientEnd() {
        return this.RecvClientEnd;
    }

    /**
     * Set <p>Duration of receiving client requests (ms)</p>
     * @param RecvClientEnd <p>Duration of receiving client requests (ms)</p>
     */
    public void setRecvClientEnd(Long RecvClientEnd) {
        this.RecvClientEnd = RecvClientEnd;
    }

    /**
     * Get <p>Duration of sending client requests (ms)</p> 
     * @return SendClientEnd <p>Duration of sending client requests (ms)</p>
     */
    public Long getSendClientEnd() {
        return this.SendClientEnd;
    }

    /**
     * Set <p>Duration of sending client requests (ms)</p>
     * @param SendClientEnd <p>Duration of sending client requests (ms)</p>
     */
    public void setSendClientEnd(Long SendClientEnd) {
        this.SendClientEnd = SendClientEnd;
    }

    /**
     * Get <p>Proxy node ID.</p> 
     * @return Node <p>Proxy node ID.</p>
     */
    public String getNode() {
        return this.Node;
    }

    /**
     * Set <p>Proxy node ID.</p>
     * @param Node <p>Proxy node ID.</p>
     */
    public void setNode(String Node) {
        this.Node = Node;
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
        if (source.Node != null) {
            this.Node = new String(source.Node);
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
        this.setParamSimple(map, prefix + "Node", this.Node);

    }
}

