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

public class ModifyReverseShellRulesAggregationRequest extends AbstractModel {

    /**
    * Rule ID (leave this parameter blank for addition)
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID array
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Host IP address
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * Target IP address
    */
    @SerializedName("DestIp")
    @Expose
    private String DestIp;

    /**
    * Target port
    */
    @SerializedName("DestPort")
    @Expose
    private String DestPort;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * Whether the rule is global (not global by default)
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * ID of the associated event when clicking Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Allowlisting method. 0: regular allowlisting, 1: regular expression allowlisting.
    */
    @SerializedName("WhiteType")
    @Expose
    private Long WhiteType;

    /**
    * Regular expression
    */
    @SerializedName("RuleRegexp")
    @Expose
    private String RuleRegexp;

    /**
    * Whether to process historical events. 0: no, 1: yes.
    */
    @SerializedName("HandleHistory")
    @Expose
    private Long HandleHistory;

    /**
    * Batch ID.
    */
    @SerializedName("GroupID")
    @Expose
    private String GroupID;

    /**
     * Get Rule ID (leave this parameter blank for addition) 
     * @return Id Rule ID (leave this parameter blank for addition)
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID (leave this parameter blank for addition)
     * @param Id Rule ID (leave this parameter blank for addition)
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID array 
     * @return Uuids Client ID array
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Client ID array
     * @param Uuids Client ID array
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get Host IP address 
     * @return HostIp Host IP address
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set Host IP address
     * @param HostIp Host IP address
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get Target IP address 
     * @return DestIp Target IP address
     */
    public String getDestIp() {
        return this.DestIp;
    }

    /**
     * Set Target IP address
     * @param DestIp Target IP address
     */
    public void setDestIp(String DestIp) {
        this.DestIp = DestIp;
    }

    /**
     * Get Target port 
     * @return DestPort Target port
     */
    public String getDestPort() {
        return this.DestPort;
    }

    /**
     * Set Target port
     * @param DestPort Target port
     */
    public void setDestPort(String DestPort) {
        this.DestPort = DestPort;
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
     * Get Whether the rule is global (not global by default) 
     * @return IsGlobal Whether the rule is global (not global by default)
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule is global (not global by default)
     * @param IsGlobal Whether the rule is global (not global by default)
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get ID of the associated event when clicking Add to Allowlist on the event list and details page (leave this parameter blank for rule addition) 
     * @return EventId ID of the associated event when clicking Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set ID of the associated event when clicking Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
     * @param EventId ID of the associated event when clicking Add to Allowlist on the event list and details page (leave this parameter blank for rule addition)
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Allowlisting method. 0: regular allowlisting, 1: regular expression allowlisting. 
     * @return WhiteType Allowlisting method. 0: regular allowlisting, 1: regular expression allowlisting.
     */
    public Long getWhiteType() {
        return this.WhiteType;
    }

    /**
     * Set Allowlisting method. 0: regular allowlisting, 1: regular expression allowlisting.
     * @param WhiteType Allowlisting method. 0: regular allowlisting, 1: regular expression allowlisting.
     */
    public void setWhiteType(Long WhiteType) {
        this.WhiteType = WhiteType;
    }

    /**
     * Get Regular expression 
     * @return RuleRegexp Regular expression
     */
    public String getRuleRegexp() {
        return this.RuleRegexp;
    }

    /**
     * Set Regular expression
     * @param RuleRegexp Regular expression
     */
    public void setRuleRegexp(String RuleRegexp) {
        this.RuleRegexp = RuleRegexp;
    }

    /**
     * Get Whether to process historical events. 0: no, 1: yes. 
     * @return HandleHistory Whether to process historical events. 0: no, 1: yes.
     */
    public Long getHandleHistory() {
        return this.HandleHistory;
    }

    /**
     * Set Whether to process historical events. 0: no, 1: yes.
     * @param HandleHistory Whether to process historical events. 0: no, 1: yes.
     */
    public void setHandleHistory(Long HandleHistory) {
        this.HandleHistory = HandleHistory;
    }

    /**
     * Get Batch ID. 
     * @return GroupID Batch ID.
     */
    public String getGroupID() {
        return this.GroupID;
    }

    /**
     * Set Batch ID.
     * @param GroupID Batch ID.
     */
    public void setGroupID(String GroupID) {
        this.GroupID = GroupID;
    }

    public ModifyReverseShellRulesAggregationRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyReverseShellRulesAggregationRequest(ModifyReverseShellRulesAggregationRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.DestIp != null) {
            this.DestIp = new String(source.DestIp);
        }
        if (source.DestPort != null) {
            this.DestPort = new String(source.DestPort);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.WhiteType != null) {
            this.WhiteType = new Long(source.WhiteType);
        }
        if (source.RuleRegexp != null) {
            this.RuleRegexp = new String(source.RuleRegexp);
        }
        if (source.HandleHistory != null) {
            this.HandleHistory = new Long(source.HandleHistory);
        }
        if (source.GroupID != null) {
            this.GroupID = new String(source.GroupID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "DestIp", this.DestIp);
        this.setParamSimple(map, prefix + "DestPort", this.DestPort);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);
        this.setParamSimple(map, prefix + "RuleRegexp", this.RuleRegexp);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);

    }
}

