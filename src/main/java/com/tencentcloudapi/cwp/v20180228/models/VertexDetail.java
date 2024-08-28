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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VertexDetail extends AbstractModel {

    /**
    * Node type. process - 1; network - 2; file - 3; SSH - 4
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Time used for each node type, which is in the format of 2022-11-29 00:00:00.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * Alarm information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AlarmInfo")
    @Expose
    private AlarmInfo [] AlarmInfo;

    /**
    * Process name, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProcName")
    @Expose
    private String ProcName;

    /**
    * Command line, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Process ID, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Pid")
    @Expose
    private String Pid;

    /**
    * File MD5, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * Content written to the file, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * File path, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * File creation time, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FileCreateTime")
    @Expose
    private String FileCreateTime;

    /**
    * Request destination address, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Target port, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
    * Log-in source IP, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SrcIP")
    @Expose
    private String SrcIP;

    /**
    * Log-in username and user group, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("User")
    @Expose
    private String User;

    /**
    * Vulnerability name, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * Vulnerability exploitation time, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulTime")
    @Expose
    private String VulTime;

    /**
    * HTTP request content, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HttpContent")
    @Expose
    private String HttpContent;

    /**
    * Vulnerability exploiter source IP, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VulSrcIP")
    @Expose
    private String VulSrcIP;

    /**
    * Node ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("VertexId")
    @Expose
    private String VertexId;

    /**
     * Get Node type. process - 1; network - 2; file - 3; SSH - 4
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Type Node type. process - 1; network - 2; file - 3; SSH - 4
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Node type. process - 1; network - 2; file - 3; SSH - 4
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Type Node type. process - 1; network - 2; file - 3; SSH - 4
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Time used for each node type, which is in the format of 2022-11-29 00:00:00.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Time Time used for each node type, which is in the format of 2022-11-29 00:00:00.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set Time used for each node type, which is in the format of 2022-11-29 00:00:00.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Time Time used for each node type, which is in the format of 2022-11-29 00:00:00.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get Alarm information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AlarmInfo Alarm information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public AlarmInfo [] getAlarmInfo() {
        return this.AlarmInfo;
    }

    /**
     * Set Alarm information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AlarmInfo Alarm information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAlarmInfo(AlarmInfo [] AlarmInfo) {
        this.AlarmInfo = AlarmInfo;
    }

    /**
     * Get Process name, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ProcName Process name, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getProcName() {
        return this.ProcName;
    }

    /**
     * Set Process name, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ProcName Process name, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setProcName(String ProcName) {
        this.ProcName = ProcName;
    }

    /**
     * Get Command line, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CmdLine Command line, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Command line, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CmdLine Command line, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Process ID, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Pid Process ID, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPid() {
        return this.Pid;
    }

    /**
     * Set Process ID, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Pid Process ID, which is effective when the node type is process.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPid(String Pid) {
        this.Pid = Pid;
    }

    /**
     * Get File MD5, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileMd5 File MD5, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set File MD5, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileMd5 File MD5, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get Content written to the file, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileContent Content written to the file, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set Content written to the file, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileContent Content written to the file, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get File path, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FilePath File path, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FilePath File path, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get File creation time, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FileCreateTime File creation time, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getFileCreateTime() {
        return this.FileCreateTime;
    }

    /**
     * Set File creation time, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FileCreateTime File creation time, which is effective when the node type is file.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFileCreateTime(String FileCreateTime) {
        this.FileCreateTime = FileCreateTime;
    }

    /**
     * Get Request destination address, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Address Request destination address, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set Request destination address, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Address Request destination address, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get Target port, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DstPort Target port, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set Target port, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DstPort Target port, which is effective when the node type is network.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Get Log-in source IP, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SrcIP Log-in source IP, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSrcIP() {
        return this.SrcIP;
    }

    /**
     * Set Log-in source IP, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SrcIP Log-in source IP, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSrcIP(String SrcIP) {
        this.SrcIP = SrcIP;
    }

    /**
     * Get Log-in username and user group, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return User Log-in username and user group, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getUser() {
        return this.User;
    }

    /**
     * Set Log-in username and user group, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param User Log-in username and user group, which is effective when the node type is SSH.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUser(String User) {
        this.User = User;
    }

    /**
     * Get Vulnerability name, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulName Vulnerability name, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * Set Vulnerability name, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulName Vulnerability name, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * Get Vulnerability exploitation time, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulTime Vulnerability exploitation time, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVulTime() {
        return this.VulTime;
    }

    /**
     * Set Vulnerability exploitation time, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulTime Vulnerability exploitation time, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulTime(String VulTime) {
        this.VulTime = VulTime;
    }

    /**
     * Get HTTP request content, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HttpContent HTTP request content, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHttpContent() {
        return this.HttpContent;
    }

    /**
     * Set HTTP request content, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param HttpContent HTTP request content, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHttpContent(String HttpContent) {
        this.HttpContent = HttpContent;
    }

    /**
     * Get Vulnerability exploiter source IP, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VulSrcIP Vulnerability exploiter source IP, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVulSrcIP() {
        return this.VulSrcIP;
    }

    /**
     * Set Vulnerability exploiter source IP, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VulSrcIP Vulnerability exploiter source IP, which is effective when the node type is vulnerability.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVulSrcIP(String VulSrcIP) {
        this.VulSrcIP = VulSrcIP;
    }

    /**
     * Get Node ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return VertexId Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVertexId() {
        return this.VertexId;
    }

    /**
     * Set Node ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param VertexId Node ID
Note: This field may return null, indicating that no valid values can be obtained.
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

