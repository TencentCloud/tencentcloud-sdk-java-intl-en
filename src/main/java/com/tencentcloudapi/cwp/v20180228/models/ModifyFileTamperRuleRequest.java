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

public class ModifyFileTamperRuleRequest extends AbstractModel {

    /**
    * Rule name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Rule content
    */
    @SerializedName("Rules")
    @Expose
    private FileTamperRule [] Rules;

    /**
    * Whether the rule is global (not global by default). 0: no; 1: yes. If the value is 1, Uuids can be left blank.
    */
    @SerializedName("IsGlobal")
    @Expose
    private Long IsGlobal;

    /**
    * Enabling status. 0: enabled; 1: disabled.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Rule ID. If this parameter is left blank or set to 0, the rule is to be added.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * UUID array of affected hosts
    */
    @SerializedName("Uuids")
    @Expose
    private String [] Uuids;

    /**
    * Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all objects that meet the conditions to the allowlist</li>
    */
    @SerializedName("AddWhiteType")
    @Expose
    private String AddWhiteType;

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
     * Get Rule content 
     * @return Rules Rule content
     */
    public FileTamperRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set Rule content
     * @param Rules Rule content
     */
    public void setRules(FileTamperRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Get Whether the rule is global (not global by default). 0: no; 1: yes. If the value is 1, Uuids can be left blank. 
     * @return IsGlobal Whether the rule is global (not global by default). 0: no; 1: yes. If the value is 1, Uuids can be left blank.
     */
    public Long getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * Set Whether the rule is global (not global by default). 0: no; 1: yes. If the value is 1, Uuids can be left blank.
     * @param IsGlobal Whether the rule is global (not global by default). 0: no; 1: yes. If the value is 1, Uuids can be left blank.
     */
    public void setIsGlobal(Long IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * Get Enabling status. 0: enabled; 1: disabled. 
     * @return Status Enabling status. 0: enabled; 1: disabled.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Enabling status. 0: enabled; 1: disabled.
     * @param Status Enabling status. 0: enabled; 1: disabled.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Rule ID. If this parameter is left blank or set to 0, the rule is to be added. 
     * @return Id Rule ID. If this parameter is left blank or set to 0, the rule is to be added.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID. If this parameter is left blank or set to 0, the rule is to be added.
     * @param Id Rule ID. If this parameter is left blank or set to 0, the rule is to be added.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get UUID array of affected hosts 
     * @return Uuids UUID array of affected hosts
     */
    public String [] getUuids() {
        return this.Uuids;
    }

    /**
     * Set UUID array of affected hosts
     * @param Uuids UUID array of affected hosts
     */
    public void setUuids(String [] Uuids) {
        this.Uuids = Uuids;
    }

    /**
     * Get Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk 
     * @return Level Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     * @param Level Risk Level. 0: None; 1: High-Risk; 2: Medium-Risk; 3: Low-Risk
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all objects that meet the conditions to the allowlist</li> 
     * @return AddWhiteType Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all objects that meet the conditions to the allowlist</li>
     */
    public String getAddWhiteType() {
        return this.AddWhiteType;
    }

    /**
     * Set Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all objects that meet the conditions to the allowlist</li>
     * @param AddWhiteType Allowlisted processing type
<li>cur: add the current items to the allowlist</li>
<li>all: add all objects that meet the conditions to the allowlist</li>
     */
    public void setAddWhiteType(String AddWhiteType) {
        this.AddWhiteType = AddWhiteType;
    }

    public ModifyFileTamperRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyFileTamperRuleRequest(ModifyFileTamperRuleRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rules != null) {
            this.Rules = new FileTamperRule[source.Rules.length];
            for (int i = 0; i < source.Rules.length; i++) {
                this.Rules[i] = new FileTamperRule(source.Rules[i]);
            }
        }
        if (source.IsGlobal != null) {
            this.IsGlobal = new Long(source.IsGlobal);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Uuids != null) {
            this.Uuids = new String[source.Uuids.length];
            for (int i = 0; i < source.Uuids.length; i++) {
                this.Uuids[i] = new String(source.Uuids[i]);
            }
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.AddWhiteType != null) {
            this.AddWhiteType = new String(source.AddWhiteType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "Uuids.", this.Uuids);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "AddWhiteType", this.AddWhiteType);

    }
}

