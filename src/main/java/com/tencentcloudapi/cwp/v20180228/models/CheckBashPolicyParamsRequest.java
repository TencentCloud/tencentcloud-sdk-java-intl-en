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

public class CheckBashPolicyParamsRequest extends AbstractModel {

    /**
    * Verify content Name or Rule. (Use a comma to separate them if both need to be verified.)
    */
    @SerializedName("CheckField")
    @Expose
    private String CheckField;

    /**
    * Event ID needs to be submitted when allowlisting an event in the event list.
    */
    @SerializedName("EventId")
    @Expose
    private Long EventId;

    /**
    * Name of rule to be entered
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * The regular expression to be entered by the user: It must match command content corresponding to the submitted EventId.
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * Rule ID passed during editing
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
     * Get Verify content Name or Rule. (Use a comma to separate them if both need to be verified.) 
     * @return CheckField Verify content Name or Rule. (Use a comma to separate them if both need to be verified.)
     */
    public String getCheckField() {
        return this.CheckField;
    }

    /**
     * Set Verify content Name or Rule. (Use a comma to separate them if both need to be verified.)
     * @param CheckField Verify content Name or Rule. (Use a comma to separate them if both need to be verified.)
     */
    public void setCheckField(String CheckField) {
        this.CheckField = CheckField;
    }

    /**
     * Get Event ID needs to be submitted when allowlisting an event in the event list. 
     * @return EventId Event ID needs to be submitted when allowlisting an event in the event list.
     */
    public Long getEventId() {
        return this.EventId;
    }

    /**
     * Set Event ID needs to be submitted when allowlisting an event in the event list.
     * @param EventId Event ID needs to be submitted when allowlisting an event in the event list.
     */
    public void setEventId(Long EventId) {
        this.EventId = EventId;
    }

    /**
     * Get Name of rule to be entered 
     * @return Name Name of rule to be entered
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Name of rule to be entered
     * @param Name Name of rule to be entered
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get The regular expression to be entered by the user: It must match command content corresponding to the submitted EventId. 
     * @return Rule The regular expression to be entered by the user: It must match command content corresponding to the submitted EventId.
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set The regular expression to be entered by the user: It must match command content corresponding to the submitted EventId.
     * @param Rule The regular expression to be entered by the user: It must match command content corresponding to the submitted EventId.
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get Rule ID passed during editing 
     * @return Id Rule ID passed during editing
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Rule ID passed during editing
     * @param Id Rule ID passed during editing
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    public CheckBashPolicyParamsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CheckBashPolicyParamsRequest(CheckBashPolicyParamsRequest source) {
        if (source.CheckField != null) {
            this.CheckField = new String(source.CheckField);
        }
        if (source.EventId != null) {
            this.EventId = new Long(source.EventId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CheckField", this.CheckField);
        this.setParamSimple(map, prefix + "EventId", this.EventId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

