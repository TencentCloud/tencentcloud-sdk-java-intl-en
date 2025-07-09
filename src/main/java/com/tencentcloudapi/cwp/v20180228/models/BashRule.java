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

public class BashRule extends AbstractModel {

    /**
    * Rule ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Client ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Risk level (0: none, 1: high-risk, 2: medium-risk, 3: low-risk)
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Regular expression
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Rule description
    */
    @SerializedName("Decription")
    @Expose
    private String Decription;

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
    * Host IP
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
    * Arrays of UUIDs for servers to be effective
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * 0= blocklist; 1= allowlist
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * Rule description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * @return Uuid Client ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Client ID
     * @param Uuid Client ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get Rule name 
     * @return Name Rule name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name
     * @param Name Rule name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Risk level (0: none, 1: high-risk, 2: medium-risk, 3: low-risk) 
     * @return Level Risk level (0: none, 1: high-risk, 2: medium-risk, 3: low-risk)
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level (0: none, 1: high-risk, 2: medium-risk, 3: low-risk)
     * @param Level Risk level (0: none, 1: high-risk, 2: medium-risk, 3: low-risk)
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Regular expression 
     * @return Rule Regular expression
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Regular expression
     * @param Rule Regular expression
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Rule description 
     * @return Decription Rule description
     * @deprecated
     */
    @Deprecated
    public String getDecription() {
        return this.Decription;
    }

    /**
     * Set Rule description
     * @param Decription Rule description
     * @deprecated
     */
    @Deprecated
    public void setDecription(String Decription) {
        this.Decription = Decription;
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
     * Get Host IP 
     * @return Hostip Host IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * Set Host IP
     * @param Hostip Host IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * Get Arrays of UUIDs for servers to be effective
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Uuids Arrays of UUIDs for servers to be effective
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Arrays of UUIDs for servers to be effective
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Uuids Arrays of UUIDs for servers to be effective
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get 0= blocklist; 1= allowlist
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return White 0= blocklist; 1= allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getWhite() {
        return this.White;
    }

    /**
     * Set 0= blocklist; 1= allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     * @param White 0= blocklist; 1= allowlist
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setWhite(Long White) {
        this.White = White;
    }

    /**
     * Get Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealOldEvents Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealOldEvents Whether to process previous events: 0: do not process; 1: process
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get Rule description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Description Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Description Rule description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public BashRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashRule(BashRule source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Decription != null) {
            this.Decription = new String(source.Decription);
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
        if (source.Hostip != null) {
            this.Hostip = new String(source.Hostip);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Decription", this.Decription);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

