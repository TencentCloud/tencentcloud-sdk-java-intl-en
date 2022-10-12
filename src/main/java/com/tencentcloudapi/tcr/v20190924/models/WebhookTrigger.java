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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WebhookTrigger extends AbstractModel{

    /**
    * Trigger name
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Trigger target
    */
    @SerializedName("Targets")
    @Expose
    private WebhookTarget [] Targets;

    /**
    * Action to be triggered
    */
    @SerializedName("EventTypes")
    @Expose
    private String [] EventTypes;

    /**
    * Trigger rule
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Whether to enable the trigger
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * Trigger ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Trigger description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * ID of the namespace of the trigger
    */
    @SerializedName("NamespaceId")
    @Expose
    private Long NamespaceId;

    /**
     * Get Trigger name 
     * @return Name Trigger name
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Trigger name
     * @param Name Trigger name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Trigger target 
     * @return Targets Trigger target
     */
    public WebhookTarget [] getTargets() {
        return this.Targets;
    }

    /**
     * Set Trigger target
     * @param Targets Trigger target
     */
    public void setTargets(WebhookTarget [] Targets) {
        this.Targets = Targets;
    }

    /**
     * Get Action to be triggered 
     * @return EventTypes Action to be triggered
     */
    public String [] getEventTypes() {
        return this.EventTypes;
    }

    /**
     * Set Action to be triggered
     * @param EventTypes Action to be triggered
     */
    public void setEventTypes(String [] EventTypes) {
        this.EventTypes = EventTypes;
    }

    /**
     * Get Trigger rule 
     * @return Condition Trigger rule
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set Trigger rule
     * @param Condition Trigger rule
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Whether to enable the trigger 
     * @return Enabled Whether to enable the trigger
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether to enable the trigger
     * @param Enabled Whether to enable the trigger
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Trigger ID 
     * @return Id Trigger ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Trigger ID
     * @param Id Trigger ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Trigger description 
     * @return Description Trigger description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set Trigger description
     * @param Description Trigger description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get ID of the namespace of the trigger 
     * @return NamespaceId ID of the namespace of the trigger
     */
    public Long getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * Set ID of the namespace of the trigger
     * @param NamespaceId ID of the namespace of the trigger
     */
    public void setNamespaceId(Long NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    public WebhookTrigger() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookTrigger(WebhookTrigger source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Targets != null) {
            this.Targets = new WebhookTarget[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new WebhookTarget(source.Targets[i]);
            }
        }
        if (source.EventTypes != null) {
            this.EventTypes = new String[source.EventTypes.length];
            for (int i = 0; i < source.EventTypes.length; i++) {
                this.EventTypes[i] = new String(source.EventTypes[i]);
            }
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.NamespaceId != null) {
            this.NamespaceId = new Long(source.NamespaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "Targets.", this.Targets);
        this.setParamArraySimple(map, prefix + "EventTypes.", this.EventTypes);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);

    }
}

