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

public class ReverseShellRuleAggregation extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID
    */
    @SerializedName("UuidHostips")
    @Expose
    private UuidHostip [] UuidHostips;

    /**
    * Process name
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

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
    * Operator
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * Whether a global rule
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Status (0: valid; 1: invalid)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Modification time
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

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
    * Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
    */
    @SerializedName("MachinesNums")
    @Expose
    private String MachinesNums;

    /**
     * Get Rule ID 
     * @return Id Rule ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID
     * @param Id Rule ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Client ID 
     * @return UuidHostips Client ID
     */
    public UuidHostip [] getUuidHostips() {
        return this.UuidHostips;
    }

    /**
     * Set Client ID
     * @param UuidHostips Client ID
     */
    public void setUuidHostips(UuidHostip [] UuidHostips) {
        this.UuidHostips = UuidHostips;
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
     * Get Operator 
     * @return Operator Operator
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator
     * @param Operator Operator
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get Whether a global rule 
     * @return IsGlobal Whether a global rule
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether a global rule
     * @param IsGlobal Whether a global rule
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Status (0: valid; 1: invalid) 
     * @return Status Status (0: valid; 1: invalid)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Status (0: valid; 1: invalid)
     * @param Status Status (0: valid; 1: invalid)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Creation time 
     * @return CreateTime Creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time
     * @param CreateTime Creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Modification time 
     * @return ModifyTime Modification time
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set Modification time
     * @param ModifyTime Modification time
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
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

    /**
     * Get Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed. 
     * @return MachinesNums Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
     */
    public String getMachinesNums() {
        return this.MachinesNums;
    }

    /**
     * Set Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
     * @param MachinesNums Number of servers covered by a rule. When IsGlobal is set to 1, all servers are displayed.
     */
    public void setMachinesNums(String MachinesNums) {
        this.MachinesNums = MachinesNums;
    }

    public ReverseShellRuleAggregation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReverseShellRuleAggregation(ReverseShellRuleAggregation source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.UuidHostips != null) {
            this.UuidHostips = new UuidHostip[source.UuidHostips.length];
            for (int i = 0; i < source.UuidHostips.length; i++) {
                this.UuidHostips[i] = new UuidHostip(source.UuidHostips[i]);
            }
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.DestIp != null) {
            this.DestIp = new String(source.DestIp);
        }
        if (source.DestPort != null) {
            this.DestPort = new String(source.DestPort);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        if (source.MachinesNums != null) {
            this.MachinesNums = new String(source.MachinesNums);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "UuidHostips.", this.UuidHostips);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "DestIp", this.DestIp);
        this.setParamSimple(map, prefix + "DestPort", this.DestPort);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "WhiteType", this.WhiteType);
        this.setParamSimple(map, prefix + "RuleRegexp", this.RuleRegexp);
        this.setParamSimple(map, prefix + "HandleHistory", this.HandleHistory);
        this.setParamSimple(map, prefix + "GroupID", this.GroupID);
        this.setParamSimple(map, prefix + "MachinesNums", this.MachinesNums);

    }
}

