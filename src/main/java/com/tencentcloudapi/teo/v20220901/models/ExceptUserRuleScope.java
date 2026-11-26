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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExceptUserRuleScope extends AbstractModel {

    /**
    * Exception rule type. Among them, complete mode represents exceptions for full data, while partial mode represents selecting specified modules and specified fields for exceptions. The field values include:
<li>complete: skip entirely mode;</li>
<li>partial: Partially skip mode.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Effective module. Valid values:
<li>waf: managed rules;</li>
<li>rate: rate limit;</li>
<li>acl: custom rule;</li>
<li>cc: CC attack defense;</li>
<li>bot: bot protection.</li>
    */
    @SerializedName("Modules")
    @Expose
    private String [] Modules;

    /**
    * Skip the exception rule details of some rule IDs. If it is null, use the last set configuration by default.
    */
    @SerializedName("PartialModules")
    @Expose
    private PartialModule [] PartialModules;

    /**
    * Exception rule details for skipping specific fields during scan. If null, use the last set configuration by default.
    */
    @SerializedName("SkipConditions")
    @Expose
    private SkipCondition [] SkipConditions;

    /**
     * Get Exception rule type. Among them, complete mode represents exceptions for full data, while partial mode represents selecting specified modules and specified fields for exceptions. The field values include:
<li>complete: skip entirely mode;</li>
<li>partial: Partially skip mode.</li> 
     * @return Type Exception rule type. Among them, complete mode represents exceptions for full data, while partial mode represents selecting specified modules and specified fields for exceptions. The field values include:
<li>complete: skip entirely mode;</li>
<li>partial: Partially skip mode.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exception rule type. Among them, complete mode represents exceptions for full data, while partial mode represents selecting specified modules and specified fields for exceptions. The field values include:
<li>complete: skip entirely mode;</li>
<li>partial: Partially skip mode.</li>
     * @param Type Exception rule type. Among them, complete mode represents exceptions for full data, while partial mode represents selecting specified modules and specified fields for exceptions. The field values include:
<li>complete: skip entirely mode;</li>
<li>partial: Partially skip mode.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Effective module. Valid values:
<li>waf: managed rules;</li>
<li>rate: rate limit;</li>
<li>acl: custom rule;</li>
<li>cc: CC attack defense;</li>
<li>bot: bot protection.</li> 
     * @return Modules Effective module. Valid values:
<li>waf: managed rules;</li>
<li>rate: rate limit;</li>
<li>acl: custom rule;</li>
<li>cc: CC attack defense;</li>
<li>bot: bot protection.</li>
     */
    public String [] getModules() {
        return this.Modules;
    }

    /**
     * Set Effective module. Valid values:
<li>waf: managed rules;</li>
<li>rate: rate limit;</li>
<li>acl: custom rule;</li>
<li>cc: CC attack defense;</li>
<li>bot: bot protection.</li>
     * @param Modules Effective module. Valid values:
<li>waf: managed rules;</li>
<li>rate: rate limit;</li>
<li>acl: custom rule;</li>
<li>cc: CC attack defense;</li>
<li>bot: bot protection.</li>
     */
    public void setModules(String [] Modules) {
        this.Modules = Modules;
    }

    /**
     * Get Skip the exception rule details of some rule IDs. If it is null, use the last set configuration by default. 
     * @return PartialModules Skip the exception rule details of some rule IDs. If it is null, use the last set configuration by default.
     */
    public PartialModule [] getPartialModules() {
        return this.PartialModules;
    }

    /**
     * Set Skip the exception rule details of some rule IDs. If it is null, use the last set configuration by default.
     * @param PartialModules Skip the exception rule details of some rule IDs. If it is null, use the last set configuration by default.
     */
    public void setPartialModules(PartialModule [] PartialModules) {
        this.PartialModules = PartialModules;
    }

    /**
     * Get Exception rule details for skipping specific fields during scan. If null, use the last set configuration by default. 
     * @return SkipConditions Exception rule details for skipping specific fields during scan. If null, use the last set configuration by default.
     */
    public SkipCondition [] getSkipConditions() {
        return this.SkipConditions;
    }

    /**
     * Set Exception rule details for skipping specific fields during scan. If null, use the last set configuration by default.
     * @param SkipConditions Exception rule details for skipping specific fields during scan. If null, use the last set configuration by default.
     */
    public void setSkipConditions(SkipCondition [] SkipConditions) {
        this.SkipConditions = SkipConditions;
    }

    public ExceptUserRuleScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExceptUserRuleScope(ExceptUserRuleScope source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Modules != null) {
            this.Modules = new String[source.Modules.length];
            for (int i = 0; i < source.Modules.length; i++) {
                this.Modules[i] = new String(source.Modules[i]);
            }
        }
        if (source.PartialModules != null) {
            this.PartialModules = new PartialModule[source.PartialModules.length];
            for (int i = 0; i < source.PartialModules.length; i++) {
                this.PartialModules[i] = new PartialModule(source.PartialModules[i]);
            }
        }
        if (source.SkipConditions != null) {
            this.SkipConditions = new SkipCondition[source.SkipConditions.length];
            for (int i = 0; i < source.SkipConditions.length; i++) {
                this.SkipConditions[i] = new SkipCondition(source.SkipConditions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Modules.", this.Modules);
        this.setParamArrayObj(map, prefix + "PartialModules.", this.PartialModules);
        this.setParamArrayObj(map, prefix + "SkipConditions.", this.SkipConditions);

    }
}

