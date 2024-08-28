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

public class BashPolicy extends AbstractModel {

    /**
    * Policy name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 1: valid; 0: invalid
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 0: blocklist; 1: allowlist
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * 0: alarm; 1: allowlist; 2: intercept
    */
    @SerializedName("BashAction")
    @Expose
    private Long BashAction;

    /**
    * Regular expression
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Risk level (0: none; 1: high-risk; 2: medium-risk; 3: low-risk)
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Effective scope (0: a group of QUUID; 1: all professional editions (including ultimate edition); 2: all ultimate editions; 3: all hosts)
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * Policy ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Policy description
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Descript")
    @Expose
    private String Descript;

    /**
    * When it is added to the allowlist, the EventId needs to be passed in.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Whether to process old events as allowlisted ones: 0 - no; 1 - yes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

    /**
    * A collection of QUUIDs for effective hosts
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Quuids")
    @Expose
    private String [] Quuids;

    /**
    * Policy type: 0 - system; 1 - user
    */
    @SerializedName("Category")
    @Expose
    private Long Category;

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
    * Compatibility with older versions may be needed.
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
     * Get Policy name 
     * @return Name Policy name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Policy name
     * @param Name Policy name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 1: valid; 0: invalid 
     * @return Enable 1: valid; 0: invalid
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 1: valid; 0: invalid
     * @param Enable 1: valid; 0: invalid
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 0: blocklist; 1: allowlist 
     * @return White 0: blocklist; 1: allowlist
     */
    public Long getWhite() {
        return this.White;
    }

    /**
     * Set 0: blocklist; 1: allowlist
     * @param White 0: blocklist; 1: allowlist
     */
    public void setWhite(Long White) {
        this.White = White;
    }

    /**
     * Get 0: alarm; 1: allowlist; 2: intercept 
     * @return BashAction 0: alarm; 1: allowlist; 2: intercept
     */
    public Long getBashAction() {
        return this.BashAction;
    }

    /**
     * Set 0: alarm; 1: allowlist; 2: intercept
     * @param BashAction 0: alarm; 1: allowlist; 2: intercept
     */
    public void setBashAction(Long BashAction) {
        this.BashAction = BashAction;
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
     * Get Risk level (0: none; 1: high-risk; 2: medium-risk; 3: low-risk) 
     * @return Level Risk level (0: none; 1: high-risk; 2: medium-risk; 3: low-risk)
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level (0: none; 1: high-risk; 2: medium-risk; 3: low-risk)
     * @param Level Risk level (0: none; 1: high-risk; 2: medium-risk; 3: low-risk)
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Effective scope (0: a group of QUUID; 1: all professional editions (including ultimate edition); 2: all ultimate editions; 3: all hosts) 
     * @return Scope Effective scope (0: a group of QUUID; 1: all professional editions (including ultimate edition); 2: all ultimate editions; 3: all hosts)
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set Effective scope (0: a group of QUUID; 1: all professional editions (including ultimate edition); 2: all ultimate editions; 3: all hosts)
     * @param Scope Effective scope (0: a group of QUUID; 1: all professional editions (including ultimate edition); 2: all ultimate editions; 3: all hosts)
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get Policy ID 
     * @return Id Policy ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Policy ID
     * @param Id Policy ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Policy description
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Descript Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDescript() {
        return this.Descript;
    }

    /**
     * Set Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Descript Policy description
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDescript(String Descript) {
        this.Descript = Descript;
    }

    /**
     * Get When it is added to the allowlist, the EventId needs to be passed in.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EventId When it is added to the allowlist, the EventId needs to be passed in.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set When it is added to the allowlist, the EventId needs to be passed in.Note: This field may return null, indicating that no valid values can be obtained.
     * @param EventId When it is added to the allowlist, the EventId needs to be passed in.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Whether to process old events as allowlisted ones: 0 - no; 1 - yes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DealOldEvents Whether to process old events as allowlisted ones: 0 - no; 1 - yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set Whether to process old events as allowlisted ones: 0 - no; 1 - yes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DealOldEvents Whether to process old events as allowlisted ones: 0 - no; 1 - yes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    /**
     * Get A collection of QUUIDs for effective hosts
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Quuids A collection of QUUIDs for effective hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getQuuids() {
        return this.Quuids;
    }

    /**
     * Set A collection of QUUIDs for effective hosts
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Quuids A collection of QUUIDs for effective hosts
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setQuuids(String [] Quuids) {
        this.Quuids = Quuids;
    }

    /**
     * Get Policy type: 0 - system; 1 - user 
     * @return Category Policy type: 0 - system; 1 - user
     */
    public Long getCategory() {
        return this.Category;
    }

    /**
     * Set Policy type: 0 - system; 1 - user
     * @param Category Policy type: 0 - system; 1 - user
     */
    public void setCategory(Long Category) {
        this.Category = Category;
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
     * Get Compatibility with older versions may be needed. 
     * @return Uuids Compatibility with older versions may be needed.
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set Compatibility with older versions may be needed.
     * @param Uuids Compatibility with older versions may be needed.
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    public BashPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BashPolicy(BashPolicy source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.BashAction != null) {
            this.BashAction = new Long(source.BashAction);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Descript != null) {
            this.Descript = new String(source.Descript);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
        if (source.Quuids != null) {
            this.Quuids = new String[source.Quuids.length];
            for (int i = 0; i < source.Quuids.length; i++) {
                this.Quuids[i] = new String(source.Quuids[i]);
            }
        }
        if (source.Category != null) {
            this.Category = new Long(source.Category);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "BashAction", this.BashAction);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Descript", this.Descript);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);
        this.setParamArraySimple(map, prefix + "Quuids.", this.Quuids);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);

    }
}

