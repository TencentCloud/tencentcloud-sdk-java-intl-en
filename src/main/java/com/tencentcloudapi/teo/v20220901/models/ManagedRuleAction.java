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
    * Specific item under the managed rule group, used for rewriting the configuration content of this individual rule. For details, refer to the product documentation.	
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * Specifies the handling action for the managed rule item in RuleId. Supported values for SecurityAction Name: <li>Deny: Block. Responds with an interception page.</li><li>Monitor: Observe. Does not process the request but records security events in logs.</li><li>Disabled: Not enabled. Skips the rule without scanning requests.</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Specific item under the managed rule group, used for rewriting the configuration content of this individual rule. For details, refer to the product documentation.	 
     * @return RuleId Specific item under the managed rule group, used for rewriting the configuration content of this individual rule. For details, refer to the product documentation.	
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set Specific item under the managed rule group, used for rewriting the configuration content of this individual rule. For details, refer to the product documentation.	
     * @param RuleId Specific item under the managed rule group, used for rewriting the configuration content of this individual rule. For details, refer to the product documentation.	
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get Specifies the handling action for the managed rule item in RuleId. Supported values for SecurityAction Name: <li>Deny: Block. Responds with an interception page.</li><li>Monitor: Observe. Does not process the request but records security events in logs.</li><li>Disabled: Not enabled. Skips the rule without scanning requests.</li> 
     * @return Action Specifies the handling action for the managed rule item in RuleId. Supported values for SecurityAction Name: <li>Deny: Block. Responds with an interception page.</li><li>Monitor: Observe. Does not process the request but records security events in logs.</li><li>Disabled: Not enabled. Skips the rule without scanning requests.</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Specifies the handling action for the managed rule item in RuleId. Supported values for SecurityAction Name: <li>Deny: Block. Responds with an interception page.</li><li>Monitor: Observe. Does not process the request but records security events in logs.</li><li>Disabled: Not enabled. Skips the rule without scanning requests.</li>
     * @param Action Specifies the handling action for the managed rule item in RuleId. Supported values for SecurityAction Name: <li>Deny: Block. Responds with an interception page.</li><li>Monitor: Observe. Does not process the request but records security events in logs.</li><li>Disabled: Not enabled. Skips the rule without scanning requests.</li>
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

