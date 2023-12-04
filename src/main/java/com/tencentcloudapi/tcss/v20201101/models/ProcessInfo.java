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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProcessInfo extends AbstractModel {

    /**
    * Process start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Operator
    */
    @SerializedName("RunAs")
    @Expose
    private String RunAs;

    /**
    * Command line parameter
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Exe path
    */
    @SerializedName("Exe")
    @Expose
    private String Exe;

    /**
    * Server PID
    */
    @SerializedName("PID")
    @Expose
    private Long PID;

    /**
    * Container PID
    */
    @SerializedName("ContainerPID")
    @Expose
    private Long ContainerPID;

    /**
    * Container name
    */
    @SerializedName("ContainerName")
    @Expose
    private String ContainerName;

    /**
    * Server ID
    */
    @SerializedName("HostID")
    @Expose
    private String HostID;

    /**
    * Server IP
    */
    @SerializedName("HostIP")
    @Expose
    private String HostIP;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Server name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Public IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * Node ID
    */
    @SerializedName("NodeID")
    @Expose
    private String NodeID;

    /**
    * Pod IP
    */
    @SerializedName("PodIP")
    @Expose
    private String PodIP;

    /**
    * Pod name
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * Node type.
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * UID of the super node
    */
    @SerializedName("NodeUniqueID")
    @Expose
    private String NodeUniqueID;

    /**
     * Get Process start time 
     * @return StartTime Process start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Process start time
     * @param StartTime Process start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Operator 
     * @return RunAs Operator
     */
    public String getRunAs() {
        return this.RunAs;
    }

    /**
     * Set Operator
     * @param RunAs Operator
     */
    public void setRunAs(String RunAs) {
        this.RunAs = RunAs;
    }

    /**
     * Get Command line parameter 
     * @return CmdLine Command line parameter
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command line parameter
     * @param CmdLine Command line parameter
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Exe path 
     * @return Exe Exe path
     */
    public String getExe() {
        return this.Exe;
    }

    /**
     * Set Exe path
     * @param Exe Exe path
     */
    public void setExe(String Exe) {
        this.Exe = Exe;
    }

    /**
     * Get Server PID 
     * @return PID Server PID
     */
    public Long getPID() {
        return this.PID;
    }

    /**
     * Set Server PID
     * @param PID Server PID
     */
    public void setPID(Long PID) {
        this.PID = PID;
    }

    /**
     * Get Container PID 
     * @return ContainerPID Container PID
     */
    public Long getContainerPID() {
        return this.ContainerPID;
    }

    /**
     * Set Container PID
     * @param ContainerPID Container PID
     */
    public void setContainerPID(Long ContainerPID) {
        this.ContainerPID = ContainerPID;
    }

    /**
     * Get Container name 
     * @return ContainerName Container name
     */
    public String getContainerName() {
        return this.ContainerName;
    }

    /**
     * Set Container name
     * @param ContainerName Container name
     */
    public void setContainerName(String ContainerName) {
        this.ContainerName = ContainerName;
    }

    /**
     * Get Server ID 
     * @return HostID Server ID
     */
    public String getHostID() {
        return this.HostID;
    }

    /**
     * Set Server ID
     * @param HostID Server ID
     */
    public void setHostID(String HostID) {
        this.HostID = HostID;
    }

    /**
     * Get Server IP 
     * @return HostIP Server IP
     */
    public String getHostIP() {
        return this.HostIP;
    }

    /**
     * Set Server IP
     * @param HostIP Server IP
     */
    public void setHostIP(String HostIP) {
        this.HostIP = HostIP;
    }

    /**
     * Get Process name 
     * @return ProcessName Process name
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set Process name
     * @param ProcessName Process name
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get Server name 
     * @return HostName Server name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Server name
     * @param HostName Server name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Public IP 
     * @return PublicIp Public IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set Public IP
     * @param PublicIp Public IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get Node ID 
     * @return NodeID Node ID
     */
    public String getNodeID() {
        return this.NodeID;
    }

    /**
     * Set Node ID
     * @param NodeID Node ID
     */
    public void setNodeID(String NodeID) {
        this.NodeID = NodeID;
    }

    /**
     * Get Pod IP 
     * @return PodIP Pod IP
     */
    public String getPodIP() {
        return this.PodIP;
    }

    /**
     * Set Pod IP
     * @param PodIP Pod IP
     */
    public void setPodIP(String PodIP) {
        this.PodIP = PodIP;
    }

    /**
     * Get Pod name 
     * @return PodName Pod name
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set Pod name
     * @param PodName Pod name
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get Node type. 
     * @return NodeType Node type.
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node type.
     * @param NodeType Node type.
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get UID of the super node 
     * @return NodeUniqueID UID of the super node
     */
    public String getNodeUniqueID() {
        return this.NodeUniqueID;
    }

    /**
     * Set UID of the super node
     * @param NodeUniqueID UID of the super node
     */
    public void setNodeUniqueID(String NodeUniqueID) {
        this.NodeUniqueID = NodeUniqueID;
    }

    public ProcessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProcessInfo(ProcessInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.RunAs != null) {
            this.RunAs = new String(source.RunAs);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Exe != null) {
            this.Exe = new String(source.Exe);
        }
        if (source.PID != null) {
            this.PID = new Long(source.PID);
        }
        if (source.ContainerPID != null) {
            this.ContainerPID = new Long(source.ContainerPID);
        }
        if (source.ContainerName != null) {
            this.ContainerName = new String(source.ContainerName);
        }
        if (source.HostID != null) {
            this.HostID = new String(source.HostID);
        }
        if (source.HostIP != null) {
            this.HostIP = new String(source.HostIP);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.NodeID != null) {
            this.NodeID = new String(source.NodeID);
        }
        if (source.PodIP != null) {
            this.PodIP = new String(source.PodIP);
        }
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeUniqueID != null) {
            this.NodeUniqueID = new String(source.NodeUniqueID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "RunAs", this.RunAs);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Exe", this.Exe);
        this.setParamSimple(map, prefix + "PID", this.PID);
        this.setParamSimple(map, prefix + "ContainerPID", this.ContainerPID);
        this.setParamSimple(map, prefix + "ContainerName", this.ContainerName);
        this.setParamSimple(map, prefix + "HostID", this.HostID);
        this.setParamSimple(map, prefix + "HostIP", this.HostIP);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "NodeID", this.NodeID);
        this.setParamSimple(map, prefix + "PodIP", this.PodIP);
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeUniqueID", this.NodeUniqueID);

    }
}

