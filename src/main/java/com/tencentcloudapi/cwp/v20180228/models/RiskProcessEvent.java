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

public class RiskProcessEvent extends AbstractModel {

    /**
    * Event ID
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Host name
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * Host IP
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Public IP address
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * Process ID
    */
    @SerializedName("ProcessId")
    @Expose
    private Long ProcessId;

    /**
    * File path
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * Executed commands
    */
    @SerializedName("CmdLine")
    @Expose
    private String CmdLine;

    /**
    * Process startup time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Last detection time
    */
    @SerializedName("DetectTime")
    @Expose
    private String DetectTime;

    /**
    * Virus name
    */
    @SerializedName("VirusName")
    @Expose
    private String VirusName;

    /**
    * Trojan detection platform [1: Cloud search engine |2:TAV | 3: Binary Ai | 4: Abnormal behavior | 5: threat intelligence]
    */
    @SerializedName("CheckPlatform")
    @Expose
    private String [] CheckPlatform;

    /**
    * Virus tag
    */
    @SerializedName("VirusTags")
    @Expose
    private String [] VirusTags;

    /**
    * Threat description
    */
    @SerializedName("ThreatDesc")
    @Expose
    private String ThreatDesc;

    /**
    * Recommended solution
    */
    @SerializedName("SuggestSolution")
    @Expose
    private String SuggestSolution;

    /**
    * Reference link
    */
    @SerializedName("ReferenceLink")
    @Expose
    private String ReferenceLink;

    /**
    * Processing Status [0 Pending; 1 Processed; 2 Scanning; 3 Scanned; 4 Exited; 5 Ignore]
    */
    @SerializedName("HandleStatus")
    @Expose
    private Long HandleStatus;

    /**
    * Host Online Status
    */
    @SerializedName("OnlineStatus")
    @Expose
    private Long OnlineStatus;

    /**
    * Additional information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MachineExtraInfo")
    @Expose
    private MachineExtraInfo MachineExtraInfo;

    /**
    * Host UUID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
     * Get Event ID 
     * @return EventId Event ID
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID
     * @param EventId Event ID
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Host name 
     * @return HostName Host name
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set Host name
     * @param HostName Host name
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get Host IP 
     * @return HostIp Host IP
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP
     * @param HostIp Host IP
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Public IP address 
     * @return WanIp Public IP address
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * Set Public IP address
     * @param WanIp Public IP address
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * Get Process ID 
     * @return ProcessId Process ID
     */
    public Long getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set Process ID
     * @param ProcessId Process ID
     */
    public void setProcessId(Long ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get File path 
     * @return FilePath File path
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File path
     * @param FilePath File path
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get Executed commands 
     * @return CmdLine Executed commands
     */
    public String getCmdLine() {
        return this.CmdLine;
    }

    /**
     * Set Executed commands
     * @param CmdLine Executed commands
     */
    public void setCmdLine(String CmdLine) {
        this.CmdLine = CmdLine;
    }

    /**
     * Get Process startup time 
     * @return StartTime Process startup time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Process startup time
     * @param StartTime Process startup time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Last detection time 
     * @return DetectTime Last detection time
     */
    public String getDetectTime() {
        return this.DetectTime;
    }

    /**
     * Set Last detection time
     * @param DetectTime Last detection time
     */
    public void setDetectTime(String DetectTime) {
        this.DetectTime = DetectTime;
    }

    /**
     * Get Virus name 
     * @return VirusName Virus name
     */
    public String getVirusName() {
        return this.VirusName;
    }

    /**
     * Set Virus name
     * @param VirusName Virus name
     */
    public void setVirusName(String VirusName) {
        this.VirusName = VirusName;
    }

    /**
     * Get Trojan detection platform [1: Cloud search engine |2:TAV | 3: Binary Ai | 4: Abnormal behavior | 5: threat intelligence] 
     * @return CheckPlatform Trojan detection platform [1: Cloud search engine |2:TAV | 3: Binary Ai | 4: Abnormal behavior | 5: threat intelligence]
     */
    public String [] getCheckPlatform() {
        return this.CheckPlatform;
    }

    /**
     * Set Trojan detection platform [1: Cloud search engine |2:TAV | 3: Binary Ai | 4: Abnormal behavior | 5: threat intelligence]
     * @param CheckPlatform Trojan detection platform [1: Cloud search engine |2:TAV | 3: Binary Ai | 4: Abnormal behavior | 5: threat intelligence]
     */
    public void setCheckPlatform(String [] CheckPlatform) {
        this.CheckPlatform = CheckPlatform;
    }

    /**
     * Get Virus tag 
     * @return VirusTags Virus tag
     */
    public String [] getVirusTags() {
        return this.VirusTags;
    }

    /**
     * Set Virus tag
     * @param VirusTags Virus tag
     */
    public void setVirusTags(String [] VirusTags) {
        this.VirusTags = VirusTags;
    }

    /**
     * Get Threat description 
     * @return ThreatDesc Threat description
     */
    public String getThreatDesc() {
        return this.ThreatDesc;
    }

    /**
     * Set Threat description
     * @param ThreatDesc Threat description
     */
    public void setThreatDesc(String ThreatDesc) {
        this.ThreatDesc = ThreatDesc;
    }

    /**
     * Get Recommended solution 
     * @return SuggestSolution Recommended solution
     */
    public String getSuggestSolution() {
        return this.SuggestSolution;
    }

    /**
     * Set Recommended solution
     * @param SuggestSolution Recommended solution
     */
    public void setSuggestSolution(String SuggestSolution) {
        this.SuggestSolution = SuggestSolution;
    }

    /**
     * Get Reference link 
     * @return ReferenceLink Reference link
     */
    public String getReferenceLink() {
        return this.ReferenceLink;
    }

    /**
     * Set Reference link
     * @param ReferenceLink Reference link
     */
    public void setReferenceLink(String ReferenceLink) {
        this.ReferenceLink = ReferenceLink;
    }

    /**
     * Get Processing Status [0 Pending; 1 Processed; 2 Scanning; 3 Scanned; 4 Exited; 5 Ignore] 
     * @return HandleStatus Processing Status [0 Pending; 1 Processed; 2 Scanning; 3 Scanned; 4 Exited; 5 Ignore]
     */
    public Long getHandleStatus() {
        return this.HandleStatus;
    }

    /**
     * Set Processing Status [0 Pending; 1 Processed; 2 Scanning; 3 Scanned; 4 Exited; 5 Ignore]
     * @param HandleStatus Processing Status [0 Pending; 1 Processed; 2 Scanning; 3 Scanned; 4 Exited; 5 Ignore]
     */
    public void setHandleStatus(Long HandleStatus) {
        this.HandleStatus = HandleStatus;
    }

    /**
     * Get Host Online Status 
     * @return OnlineStatus Host Online Status
     */
    public Long getOnlineStatus() {
        return this.OnlineStatus;
    }

    /**
     * Set Host Online Status
     * @param OnlineStatus Host Online Status
     */
    public void setOnlineStatus(Long OnlineStatus) {
        this.OnlineStatus = OnlineStatus;
    }

    /**
     * Get Additional information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public MachineExtraInfo getMachineExtraInfo() {
        return this.MachineExtraInfo;
    }

    /**
     * Set Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param MachineExtraInfo Additional information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setMachineExtraInfo(MachineExtraInfo MachineExtraInfo) {
        this.MachineExtraInfo = MachineExtraInfo;
    }

    /**
     * Get Host UUID 
     * @return Uuid Host UUID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Host UUID
     * @param Uuid Host UUID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    public RiskProcessEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskProcessEvent(RiskProcessEvent source) {
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.WanIp != null) {
            this.WanIp = new String(source.WanIp);
        }
        if (source.ProcessId != null) {
            this.ProcessId = new Long(source.ProcessId);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.CmdLine != null) {
            this.CmdLine = new String(source.CmdLine);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.DetectTime != null) {
            this.DetectTime = new String(source.DetectTime);
        }
        if (source.VirusName != null) {
            this.VirusName = new String(source.VirusName);
        }
        if (source.CheckPlatform != null) {
            this.CheckPlatform = new String[source.CheckPlatform.length];
            for (int i = 0; i < source.CheckPlatform.length; i++) {
                this.CheckPlatform[i] = new String(source.CheckPlatform[i]);
            }
        }
        if (source.VirusTags != null) {
            this.VirusTags = new String[source.VirusTags.length];
            for (int i = 0; i < source.VirusTags.length; i++) {
                this.VirusTags[i] = new String(source.VirusTags[i]);
            }
        }
        if (source.ThreatDesc != null) {
            this.ThreatDesc = new String(source.ThreatDesc);
        }
        if (source.SuggestSolution != null) {
            this.SuggestSolution = new String(source.SuggestSolution);
        }
        if (source.ReferenceLink != null) {
            this.ReferenceLink = new String(source.ReferenceLink);
        }
        if (source.HandleStatus != null) {
            this.HandleStatus = new Long(source.HandleStatus);
        }
        if (source.OnlineStatus != null) {
            this.OnlineStatus = new Long(source.OnlineStatus);
        }
        if (source.MachineExtraInfo != null) {
            this.MachineExtraInfo = new MachineExtraInfo(source.MachineExtraInfo);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "CmdLine", this.CmdLine);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DetectTime", this.DetectTime);
        this.setParamSimple(map, prefix + "VirusName", this.VirusName);
        this.setParamArraySimple(map, prefix + "CheckPlatform.", this.CheckPlatform);
        this.setParamArraySimple(map, prefix + "VirusTags.", this.VirusTags);
        this.setParamSimple(map, prefix + "ThreatDesc", this.ThreatDesc);
        this.setParamSimple(map, prefix + "SuggestSolution", this.SuggestSolution);
        this.setParamSimple(map, prefix + "ReferenceLink", this.ReferenceLink);
        this.setParamSimple(map, prefix + "HandleStatus", this.HandleStatus);
        this.setParamSimple(map, prefix + "OnlineStatus", this.OnlineStatus);
        this.setParamObj(map, prefix + "MachineExtraInfo.", this.MachineExtraInfo);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);

    }
}

