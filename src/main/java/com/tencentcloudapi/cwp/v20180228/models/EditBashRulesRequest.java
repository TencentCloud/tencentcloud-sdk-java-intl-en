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

public class EditBashRulesRequest extends AbstractModel {

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
    * Rule name, which cannot be modified during editing
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Risk level (0: none; 1: high-risk; 2: medium-risk; 3: low-risk)
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Regular expression, which cannot be modified during editing. Apply the QueryEscape function to the content and then perform Base64 encoding.
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Whether the rule is global. 1: global; 0: not global (default value).
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * 0: blocklist; 1: allowlist
    */
    @SerializedName("White")
    @Expose
    private Long White;

    /**
    * When it is added to the allowlist, the event ID needs to be passed in.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Whether to add existing events to the allowlist. 0: no; 1: yes.
    */
    @SerializedName("DealOldEvents")
    @Expose
    private Long DealOldEvents;

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
     * Get Rule name, which cannot be modified during editing 
     * @return Name Rule name, which cannot be modified during editing
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Rule name, which cannot be modified during editing
     * @param Name Rule name, which cannot be modified during editing
     */
    public void setName(String Name) {
        this.Name = Name;
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
     * Get Regular expression, which cannot be modified during editing. Apply the QueryEscape function to the content and then perform Base64 encoding. 
     * @return Rule Regular expression, which cannot be modified during editing. Apply the QueryEscape function to the content and then perform Base64 encoding.
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set Regular expression, which cannot be modified during editing. Apply the QueryEscape function to the content and then perform Base64 encoding.
     * @param Rule Regular expression, which cannot be modified during editing. Apply the QueryEscape function to the content and then perform Base64 encoding.
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Whether the rule is global. 1: global; 0: not global (default value). 
     * @return IsGlobal Whether the rule is global. 1: global; 0: not global (default value).
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule is global. 1: global; 0: not global (default value).
     * @param IsGlobal Whether the rule is global. 1: global; 0: not global (default value).
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
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
     * Get When it is added to the allowlist, the event ID needs to be passed in. 
     * @return EventId When it is added to the allowlist, the event ID needs to be passed in.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set When it is added to the allowlist, the event ID needs to be passed in.
     * @param EventId When it is added to the allowlist, the event ID needs to be passed in.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Whether to add existing events to the allowlist. 0: no; 1: yes. 
     * @return DealOldEvents Whether to add existing events to the allowlist. 0: no; 1: yes.
     */
    public Long getDealOldEvents() {
        return this.DealOldEvents;
    }

    /**
     * Set Whether to add existing events to the allowlist. 0: no; 1: yes.
     * @param DealOldEvents Whether to add existing events to the allowlist. 0: no; 1: yes.
     */
    public void setDealOldEvents(Long DealOldEvents) {
        this.DealOldEvents = DealOldEvents;
    }

    public EditBashRulesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditBashRulesRequest(EditBashRulesRequest source) {
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
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.White != null) {
            this.White = new Long(source.White);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.DealOldEvents != null) {
            this.DealOldEvents = new Long(source.DealOldEvents);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "White", this.White);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "DealOldEvents", this.DealOldEvents);

    }
}

