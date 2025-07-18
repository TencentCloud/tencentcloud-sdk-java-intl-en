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

public class ManagedRuleAction extends AbstractModel {

    /**
    * Specific items under ManagedRuleGroup, used to rewrite the configuration of this individual rule item, refer to product documentation for details.	
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Action for the managed rule item specified by RuleId, the SecurityAction Name parameter supports: <li>`Deny`: block and respond with an block page;</li> <li>`Monitor`: observe, do not process the request and record the security event in logs;</li> <li>`Disabled`: disabled, do not scan the request and skip this rule.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Specific items under ManagedRuleGroup, used to rewrite the configuration of this individual rule item, refer to product documentation for details.	 
     * @return RuleId Specific items under ManagedRuleGroup, used to rewrite the configuration of this individual rule item, refer to product documentation for details.	
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Specific items under ManagedRuleGroup, used to rewrite the configuration of this individual rule item, refer to product documentation for details.	
     * @param RuleId Specific items under ManagedRuleGroup, used to rewrite the configuration of this individual rule item, refer to product documentation for details.	
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Action for the managed rule item specified by RuleId, the SecurityAction Name parameter supports: <li>`Deny`: block and respond with an block page;</li> <li>`Monitor`: observe, do not process the request and record the security event in logs;</li> <li>`Disabled`: disabled, do not scan the request and skip this rule.</li>. 
     * @return Action Action for the managed rule item specified by RuleId, the SecurityAction Name parameter supports: <li>`Deny`: block and respond with an block page;</li> <li>`Monitor`: observe, do not process the request and record the security event in logs;</li> <li>`Disabled`: disabled, do not scan the request and skip this rule.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Action for the managed rule item specified by RuleId, the SecurityAction Name parameter supports: <li>`Deny`: block and respond with an block page;</li> <li>`Monitor`: observe, do not process the request and record the security event in logs;</li> <li>`Disabled`: disabled, do not scan the request and skip this rule.</li>.
     * @param Action Action for the managed rule item specified by RuleId, the SecurityAction Name parameter supports: <li>`Deny`: block and respond with an block page;</li> <li>`Monitor`: observe, do not process the request and record the security event in logs;</li> <li>`Disabled`: disabled, do not scan the request and skip this rule.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public ManagedRuleAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ManagedRuleAction(ManagedRuleAction source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

