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

public class VertexDetail extends AbstractModel {

    /**
    * Node type. 1: process, 2: network, 3: file, 4: SSH.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Time used by each node type, in the format of 2022-11-29 00:00:00.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Alarm information.
    */
    @SerializedName("AlarmInfo")
    @Expose
    private AlarmInfo [] AlarmInfo;

    /**
    * Process name. This parameter takes effect when this node is a process.
    */
    @SerializedName("ProcName")
    @Expose
    private String ProcName;

    /**
    * Command line. This parameter takes effect when this node is a process.
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Process ID. This parameter takes effect when this node is a process.
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * File MD5. This parameter takes effect when this node is a file.
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * File write content. This parameter takes effect when this node is a file.
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * File path. This parameter takes effect when this node is a file.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * File creation time. This parameter takes effect when this node is a file.
    */
    @SerializedName("FileCreateTime")
    @Expose
    private String FileCreateTime;

    /**
    * Request destination address. This parameter takes effect when this node is a network.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Target port. This parameter takes effect when this node is a network.
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Login source IP address. This parameter takes effect when this node is ssh.
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * Login username and user group. This parameter takes effect when this node is ssh.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Vulnerability name. This parameter takes effect when this node is a vulnerability.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability exploitation time. This parameter takes effect when this node is a vulnerability.
    */
    @SerializedName("VulTime")
    @Expose
    private String VulTime;

    /**
    * HTTP request content. This parameter takes effect when this node is a vulnerability.
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
    * Source IP address of the vulnerability exploiter. This parameter takes effect when this node is a vulnerability.
    */
    @SerializedName("VulSrcIP")
    @Expose
    private String VulSrcIP;

    /**
    * Node ID.
    */
    @SerializedName("VertexId")
    @Expose
    private String VertexId;

    /**
     * Get Node type. 1: process, 2: network, 3: file, 4: SSH. 
     * @return Type Node type. 1: process, 2: network, 3: file, 4: SSH.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Node type. 1: process, 2: network, 3: file, 4: SSH.
     * @param Type Node type. 1: process, 2: network, 3: file, 4: SSH.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Time used by each node type, in the format of 2022-11-29 00:00:00. 
     * @return Time Time used by each node type, in the format of 2022-11-29 00:00:00.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time used by each node type, in the format of 2022-11-29 00:00:00.
     * @param Time Time used by each node type, in the format of 2022-11-29 00:00:00.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Alarm information. 
     * @return AlarmInfo Alarm information.
     */
    public AlarmInfo [] getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set Alarm information.
     * @param AlarmInfo Alarm information.
     */
    public void setAlarmInfo(AlarmInfo [] AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get Process name. This parameter takes effect when this node is a process. 
     * @return ProcName Process name. This parameter takes effect when this node is a process.
     */
    public String getProcName() {
        return this.ProcName;
    }

    /**
     * Set Process name. This parameter takes effect when this node is a process.
     * @param ProcName Process name. This parameter takes effect when this node is a process.
     */
    public void setProcName(String ProcName) {
        this.ProcName = ProcName;
    }

    /**
     * Get Command line. This parameter takes effect when this node is a process. 
     * @return CmdLine Command line. This parameter takes effect when this node is a process.
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command line. This parameter takes effect when this node is a process.
     * @param CmdLine Command line. This parameter takes effect when this node is a process.
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Process ID. This parameter takes effect when this node is a process. 
     * @return Pid Process ID. This parameter takes effect when this node is a process.
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID. This parameter takes effect when this node is a process.
     * @param Pid Process ID. This parameter takes effect when this node is a process.
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get File MD5. This parameter takes effect when this node is a file. 
     * @return FileMd5 File MD5. This parameter takes effect when this node is a file.
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set File MD5. This parameter takes effect when this node is a file.
     * @param FileMd5 File MD5. This parameter takes effect when this node is a file.
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get File write content. This parameter takes effect when this node is a file. 
     * @return FileContent File write content. This parameter takes effect when this node is a file.
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set File write content. This parameter takes effect when this node is a file.
     * @param FileContent File write content. This parameter takes effect when this node is a file.
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get File path. This parameter takes effect when this node is a file. 
     * @return FilePath File path. This parameter takes effect when this node is a file.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path. This parameter takes effect when this node is a file.
     * @param FilePath File path. This parameter takes effect when this node is a file.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get File creation time. This parameter takes effect when this node is a file. 
     * @return FileCreateTime File creation time. This parameter takes effect when this node is a file.
     */
    public String getFileCreateTime() {
        return this.FileCreateTime;
    }

    /**
     * Set File creation time. This parameter takes effect when this node is a file.
     * @param FileCreateTime File creation time. This parameter takes effect when this node is a file.
     */
    public void setFileCreateTime(String FileCreateTime) {
        this.FileCreateTime = FileCreateTime;
    }

    /**
     * Get Request destination address. This parameter takes effect when this node is a network. 
     * @return Address Request destination address. This parameter takes effect when this node is a network.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Request destination address. This parameter takes effect when this node is a network.
     * @param Address Request destination address. This parameter takes effect when this node is a network.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Target port. This parameter takes effect when this node is a network. 
     * @return DstPort Target port. This parameter takes effect when this node is a network.
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port. This parameter takes effect when this node is a network.
     * @param DstPort Target port. This parameter takes effect when this node is a network.
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Login source IP address. This parameter takes effect when this node is ssh. 
     * @return SrcIP Login source IP address. This parameter takes effect when this node is ssh.
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set Login source IP address. This parameter takes effect when this node is ssh.
     * @param SrcIP Login source IP address. This parameter takes effect when this node is ssh.
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get Login username and user group. This parameter takes effect when this node is ssh. 
     * @return User Login username and user group. This parameter takes effect when this node is ssh.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Login username and user group. This parameter takes effect when this node is ssh.
     * @param User Login username and user group. This parameter takes effect when this node is ssh.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Vulnerability name. This parameter takes effect when this node is a vulnerability. 
     * @return VulName Vulnerability name. This parameter takes effect when this node is a vulnerability.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name. This parameter takes effect when this node is a vulnerability.
     * @param VulName Vulnerability name. This parameter takes effect when this node is a vulnerability.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability exploitation time. This parameter takes effect when this node is a vulnerability. 
     * @return VulTime Vulnerability exploitation time. This parameter takes effect when this node is a vulnerability.
     */
    public String getVulTime() {
        return this.VulTime;
    }

    /**
     * Set Vulnerability exploitation time. This parameter takes effect when this node is a vulnerability.
     * @param VulTime Vulnerability exploitation time. This parameter takes effect when this node is a vulnerability.
     */
    public void setVulTime(String VulTime) {
        this.VulTime = VulTime;
    }

    /**
     * Get HTTP request content. This parameter takes effect when this node is a vulnerability. 
     * @return HttpContent HTTP request content. This parameter takes effect when this node is a vulnerability.
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * Set HTTP request content. This parameter takes effect when this node is a vulnerability.
     * @param HttpContent HTTP request content. This parameter takes effect when this node is a vulnerability.
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
    }

    /**
     * Get Source IP address of the vulnerability exploiter. This parameter takes effect when this node is a vulnerability. 
     * @return VulSrcIP Source IP address of the vulnerability exploiter. This parameter takes effect when this node is a vulnerability.
     */
    public String getVulSrcIP() {
        return this.VulSrcIP;
    }

    /**
     * Set Source IP address of the vulnerability exploiter. This parameter takes effect when this node is a vulnerability.
     * @param VulSrcIP Source IP address of the vulnerability exploiter. This parameter takes effect when this node is a vulnerability.
     */
    public void setVulSrcIP(String VulSrcIP) {
        this.VulSrcIP = VulSrcIP;
    }

    /**
     * Get Node ID. 
     * @return VertexId Node ID.
     */
    public String getVertexId() {
        return this.VertexId;
    }

    /**
     * Set Node ID.
     * @param VertexId Node ID.
     */
    public void setVertexId(String VertexId) {
        this.VertexId = VertexId;
    }

    public VertexDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VertexDetail(VertexDetail source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.AlarmInfo != null) {
            this.AlarmInfo = new AlarmInfo[source.AlarmInfo.length];
            for (int i = 0; i < source.AlarmInfo.length; i++) {
                this.AlarmInfo[i] = new AlarmInfo(source.AlarmInfo[i]);
            }
        }
        if (source.ProcName != null) {
            this.ProcName = new String(source.ProcName);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.Pid != null) {
            this.Pid = new String(source.Pid);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileCreateTime != null) {
            this.FileCreateTime = new String(source.FileCreateTime);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.DstPort != null) {
            this.DstPort = new Long(source.DstPort);
        }
        if (source.SrcIP != null) {
            this.SrcIP = new String(source.SrcIP);
        }
        if (source.User != null) {
            this.User = new String(source.User);
        }
        if (source.VulName != null) {
            this.VulName = new String(source.VulName);
        }
        if (source.VulTime != null) {
            this.VulTime = new String(source.VulTime);
        }
        if (source.HttpContent != null) {
            this.HttpContent = new String(source.HttpContent);
        }
        if (source.VulSrcIP != null) {
            this.VulSrcIP = new String(source.VulSrcIP);
        }
        if (source.VertexId != null) {
            this.VertexId = new String(source.VertexId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamArrayObj(map, prefix + "AlarmInfo.", this.AlarmInfo);
        this.setParamSimple(map, prefix + "ProcName", this.ProcName);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileCreateTime", this.FileCreateTime);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);
        this.setParamSimple(map, prefix + "SrcIP", this.SrcIP);
        this.setParamSimple(map, prefix + "User", this.User);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulTime", this.VulTime);
        this.setParamSimple(map, prefix + "HttpContent", this.HttpContent);
        this.setParamSimple(map, prefix + "VulSrcIP", this.VulSrcIP);
        this.setParamSimple(map, prefix + "VertexId", this.VertexId);

    }
}

