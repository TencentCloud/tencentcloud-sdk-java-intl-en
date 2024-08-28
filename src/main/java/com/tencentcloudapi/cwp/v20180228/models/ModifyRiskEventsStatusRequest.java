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

public class ModifyRiskEventsStatusRequest extends AbstractModel {

    /**
    * Operations - 0: Mark as Handled, 1: Ignore, 2: Delete Record, 3: Trojan Isolation, 4: Isolated Trojan Resumption, 5: Trojan Trust, 6: Trojan Untrust, 7: Kill Exceptional Process.
    */
    @SerializedName("Operate")
    @Expose
    private Long Operate;

    /**
    * Operation event types, file scan: MALWARE, exceptional login: HOST_LOGIN, password brute attack: BRUTE_ATTACK, malicious request: MALICIOUS_REQUEST, high-risk command: BASH_EVENT, local privilege escalation: PRIVILEGE_EVENT, reverse shell: REVERSE_SHELL, exceptional process: PROCESS.
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * An array of event IDs that need to be modified, and batch operation is supported.
    */
    @SerializedName("Ids")
    @Expose
    private Long [] Ids;

    /**
    * Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
    */
    @SerializedName("UpdateAll")
    @Expose
    private Boolean UpdateAll;

    /**
    * Excluded event ID: When operating on all events, this ID needs to be excluded.
    */
    @SerializedName("ExcludeId")
    @Expose
    private Long [] ExcludeId;

    /**
    * When Operate is Trojan isolation, it indicates whether to kill the process, other operations are invalid
    */
    @SerializedName("KillProcess")
    @Expose
    private Boolean KillProcess;

    /**
    * When RiskType is cross-region log-in and IDs are left blank, you can modify the status of events from all source IPs.
    */
    @SerializedName("Ip")
    @Expose
    private String [] Ip;

    /**
    * Filtering criteria. When RiskType is MALWARE.
1. When RiskType is MALWARE:
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - filter by status: 4 - pending; 5 -- trusted; 6 - isolated; 10 - isolation in progress; 11 - recovering from isolation</li>
When RiskType is PROCESS:
Filter criteria
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
     * Get Operations - 0: Mark as Handled, 1: Ignore, 2: Delete Record, 3: Trojan Isolation, 4: Isolated Trojan Resumption, 5: Trojan Trust, 6: Trojan Untrust, 7: Kill Exceptional Process. 
     * @return Operate Operations - 0: Mark as Handled, 1: Ignore, 2: Delete Record, 3: Trojan Isolation, 4: Isolated Trojan Resumption, 5: Trojan Trust, 6: Trojan Untrust, 7: Kill Exceptional Process.
     */
    public Long getOperate() {
        return this.Operate;
    }

    /**
     * Set Operations - 0: Mark as Handled, 1: Ignore, 2: Delete Record, 3: Trojan Isolation, 4: Isolated Trojan Resumption, 5: Trojan Trust, 6: Trojan Untrust, 7: Kill Exceptional Process.
     * @param Operate Operations - 0: Mark as Handled, 1: Ignore, 2: Delete Record, 3: Trojan Isolation, 4: Isolated Trojan Resumption, 5: Trojan Trust, 6: Trojan Untrust, 7: Kill Exceptional Process.
     */
    public void setOperate(Long Operate) {
        this.Operate = Operate;
    }

    /**
     * Get Operation event types, file scan: MALWARE, exceptional login: HOST_LOGIN, password brute attack: BRUTE_ATTACK, malicious request: MALICIOUS_REQUEST, high-risk command: BASH_EVENT, local privilege escalation: PRIVILEGE_EVENT, reverse shell: REVERSE_SHELL, exceptional process: PROCESS. 
     * @return RiskType Operation event types, file scan: MALWARE, exceptional login: HOST_LOGIN, password brute attack: BRUTE_ATTACK, malicious request: MALICIOUS_REQUEST, high-risk command: BASH_EVENT, local privilege escalation: PRIVILEGE_EVENT, reverse shell: REVERSE_SHELL, exceptional process: PROCESS.
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set Operation event types, file scan: MALWARE, exceptional login: HOST_LOGIN, password brute attack: BRUTE_ATTACK, malicious request: MALICIOUS_REQUEST, high-risk command: BASH_EVENT, local privilege escalation: PRIVILEGE_EVENT, reverse shell: REVERSE_SHELL, exceptional process: PROCESS.
     * @param RiskType Operation event types, file scan: MALWARE, exceptional login: HOST_LOGIN, password brute attack: BRUTE_ATTACK, malicious request: MALICIOUS_REQUEST, high-risk command: BASH_EVENT, local privilege escalation: PRIVILEGE_EVENT, reverse shell: REVERSE_SHELL, exceptional process: PROCESS.
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get An array of event IDs that need to be modified, and batch operation is supported. 
     * @return Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public Long [] getIds() {
        return this.Ids;
    }

    /**
     * Set An array of event IDs that need to be modified, and batch operation is supported.
     * @param Ids An array of event IDs that need to be modified, and batch operation is supported.
     */
    public void setIds(Long [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank. 
     * @return UpdateAll Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     */
    public Boolean getUpdateAll() {
        return this.UpdateAll;
    }

    /**
     * Set Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     * @param UpdateAll Whether to update all, i.e. whether to operate on all events; this parameter is invalid when IDs are not left blank.
     */
    public void setUpdateAll(Boolean UpdateAll) {
        this.UpdateAll = UpdateAll;
    }

    /**
     * Get Excluded event ID: When operating on all events, this ID needs to be excluded. 
     * @return ExcludeId Excluded event ID: When operating on all events, this ID needs to be excluded.
     */
    public Long [] getExcludeId() {
        return this.ExcludeId;
    }

    /**
     * Set Excluded event ID: When operating on all events, this ID needs to be excluded.
     * @param ExcludeId Excluded event ID: When operating on all events, this ID needs to be excluded.
     */
    public void setExcludeId(Long [] ExcludeId) {
        this.ExcludeId = ExcludeId;
    }

    /**
     * Get When Operate is Trojan isolation, it indicates whether to kill the process, other operations are invalid 
     * @return KillProcess When Operate is Trojan isolation, it indicates whether to kill the process, other operations are invalid
     */
    public Boolean getKillProcess() {
        return this.KillProcess;
    }

    /**
     * Set When Operate is Trojan isolation, it indicates whether to kill the process, other operations are invalid
     * @param KillProcess When Operate is Trojan isolation, it indicates whether to kill the process, other operations are invalid
     */
    public void setKillProcess(Boolean KillProcess) {
        this.KillProcess = KillProcess;
    }

    /**
     * Get When RiskType is cross-region log-in and IDs are left blank, you can modify the status of events from all source IPs. 
     * @return Ip When RiskType is cross-region log-in and IDs are left blank, you can modify the status of events from all source IPs.
     */
    public String [] getIp() {
        return this.Ip;
    }

    /**
     * Set When RiskType is cross-region log-in and IDs are left blank, you can modify the status of events from all source IPs.
     * @param Ip When RiskType is cross-region log-in and IDs are left blank, you can modify the status of events from all source IPs.
     */
    public void setIp(String [] Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Filtering criteria. When RiskType is MALWARE.
1. When RiskType is MALWARE:
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - filter by status: 4 - pending; 5 -- trusted; 6 - isolated; 10 - isolation in progress; 11 - recovering from isolation</li>
When RiskType is PROCESS:
Filter criteria
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li> 
     * @return Filters Filtering criteria. When RiskType is MALWARE.
1. When RiskType is MALWARE:
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - filter by status: 4 - pending; 5 -- trusted; 6 - isolated; 10 - isolation in progress; 11 - recovering from isolation</li>
When RiskType is PROCESS:
Filter criteria
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set Filtering criteria. When RiskType is MALWARE.
1. When RiskType is MALWARE:
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - filter by status: 4 - pending; 5 -- trusted; 6 - isolated; 10 - isolation in progress; 11 - recovering from isolation</li>
When RiskType is PROCESS:
Filter criteria
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
     * @param Filters Filtering criteria. When RiskType is MALWARE.
1. When RiskType is MALWARE:
<li>IpOrAlias - String - required: no - filter by host IP or alias</li>
<li>FilePath - String - required: no - filter by path</li>
<li>VirusName - String - required: no - filter by description</li>
<li>CreateBeginTime - String - required: no - filter by creation time - start time</li>
<li>CreateEndTime - String - required: no - filter by creation time - end time</li>
<li>Status - String - required: no - filter by status: 4 - pending; 5 -- trusted; 6 - isolated; 10 - isolation in progress; 11 - recovering from isolation</li>
When RiskType is PROCESS:
Filter criteria
<li>IpOrName - String - required: no - host IP or host name</li>
<li>VirusName - String - required: no - virus name</li>
<li>BeginTime - String - required: no - process startup time - begin</li>
<li>BeginTime - String - required: no - process startup time - end</li>
<li>Status - String - required: no - filter by status: 0 - pending; 1 - under detection; 2 - detected; 3 - exited; 4 - trusted</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    public ModifyRiskEventsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRiskEventsStatusRequest(ModifyRiskEventsStatusRequest source) {
        if (source.Operate != null) {
            this.Operate = new Long(source.Operate);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.Ids != null) {
            this.Ids = new Long[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new Long(source.Ids[i]);
            }
        }
        if (source.UpdateAll != null) {
            this.UpdateAll = new Boolean(source.UpdateAll);
        }
        if (source.ExcludeId != null) {
            this.ExcludeId = new Long[source.ExcludeId.length];
            for (int i = 0; i < source.ExcludeId.length; i++) {
                this.ExcludeId[i] = new Long(source.ExcludeId[i]);
            }
        }
        if (source.KillProcess != null) {
            this.KillProcess = new Boolean(source.KillProcess);
        }
        if (source.Ip != null) {
            this.Ip = new String[source.Ip.length];
            for (int i = 0; i < source.Ip.length; i++) {
                this.Ip[i] = new String(source.Ip[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operate", this.Operate);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamSimple(map, prefix + "UpdateAll", this.UpdateAll);
        this.setParamArraySimple(map, prefix + "ExcludeId.", this.ExcludeId);
        this.setParamSimple(map, prefix + "KillProcess", this.KillProcess);
        this.setParamArraySimple(map, prefix + "Ip.", this.Ip);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

