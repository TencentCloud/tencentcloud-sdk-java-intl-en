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
    * Exception mode. Values:
<li>`complete`: Skip the exception rule for full requests.</li>
<li>`partial`: Skip the exception rule for partial requests.</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Effective module. the field value can be:.
<li>`waf`: tencent cloud-managed rules</li>.
<Li>`Rate`: rate limit</li>.
<li>`acl`: custom rule</li>.
<Li>`Cc`: cc attack defense</li>.
<Li>`Bot`: bot protection</li>.
    */
    @SerializedName("Modules")
    @Expose
    private String [] Modules;

    /**
    * Skip exception rule details for some rule ids. if null, use the last set configuration by default.
    */
    @SerializedName("PartialModules")
    @Expose
    private PartialModule [] PartialModules;

    /**
    * Details of the exception rule for skipping specific fields. if null, use the last set configuration by default.
    */
    @SerializedName("SkipConditions")
    @Expose
    private SkipCondition [] SkipConditions;

    /**
     * Get Exception mode. Values:
<li>`complete`: Skip the exception rule for full requests.</li>
<li>`partial`: Skip the exception rule for partial requests.</li> 
     * @return Type Exception mode. Values:
<li>`complete`: Skip the exception rule for full requests.</li>
<li>`partial`: Skip the exception rule for partial requests.</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Exception mode. Values:
<li>`complete`: Skip the exception rule for full requests.</li>
<li>`partial`: Skip the exception rule for partial requests.</li>
     * @param Type Exception mode. Values:
<li>`complete`: Skip the exception rule for full requests.</li>
<li>`partial`: Skip the exception rule for partial requests.</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Effective module. the field value can be:.
<li>`waf`: tencent cloud-managed rules</li>.
<Li>`Rate`: rate limit</li>.
<li>`acl`: custom rule</li>.
<Li>`Cc`: cc attack defense</li>.
<Li>`Bot`: bot protection</li>. 
     * @return Modules Effective module. the field value can be:.
<li>`waf`: tencent cloud-managed rules</li>.
<Li>`Rate`: rate limit</li>.
<li>`acl`: custom rule</li>.
<Li>`Cc`: cc attack defense</li>.
<Li>`Bot`: bot protection</li>.
     */
    public String [] getModules() {
        return this.Modules;
    }

    /**
     * Set Effective module. the field value can be:.
<li>`waf`: tencent cloud-managed rules</li>.
<Li>`Rate`: rate limit</li>.
<li>`acl`: custom rule</li>.
<Li>`Cc`: cc attack defense</li>.
<Li>`Bot`: bot protection</li>.
     * @param Modules Effective module. the field value can be:.
<li>`waf`: tencent cloud-managed rules</li>.
<Li>`Rate`: rate limit</li>.
<li>`acl`: custom rule</li>.
<Li>`Cc`: cc attack defense</li>.
<Li>`Bot`: bot protection</li>.
     */
    public void setModules(String [] Modules) {
        this.Modules = Modules;
    }

    /**
     * Get Skip exception rule details for some rule ids. if null, use the last set configuration by default. 
     * @return PartialModules Skip exception rule details for some rule ids. if null, use the last set configuration by default.
     */
    public PartialModule [] getPartialModules() {
        return this.PartialModules;
    }

    /**
     * Set Skip exception rule details for some rule ids. if null, use the last set configuration by default.
     * @param PartialModules Skip exception rule details for some rule ids. if null, use the last set configuration by default.
     */
    public void setPartialModules(PartialModule [] PartialModules) {
        this.PartialModules = PartialModules;
    }

    /**
     * Get Details of the exception rule for skipping specific fields. if null, use the last set configuration by default. 
     * @return SkipConditions Details of the exception rule for skipping specific fields. if null, use the last set configuration by default.
     */
    public SkipCondition [] getSkipConditions() {
        return this.SkipConditions;
    }

    /**
     * Set Details of the exception rule for skipping specific fields. if null, use the last set configuration by default.
     * @param SkipConditions Details of the exception rule for skipping specific fields. if null, use the last set configuration by default.
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

