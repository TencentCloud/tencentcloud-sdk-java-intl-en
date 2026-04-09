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

public class BotManagementActionOverrides extends AbstractModel {

    /**
    * Specific item under Bot rules used to rewrite the configuration content of this single rule. refer to the returned message from the DescribeBotManagedRules API for detailed information corresponding to Ids.
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * Specifies the handling action for Bot rule items in Ids. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: Disabled, disable the specified rule;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: pass (only for Bot basic feature management).</li>.

    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Specific item under Bot rules used to rewrite the configuration content of this single rule. refer to the returned message from the DescribeBotManagedRules API for detailed information corresponding to Ids. 
     * @return Ids Specific item under Bot rules used to rewrite the configuration content of this single rule. refer to the returned message from the DescribeBotManagedRules API for detailed information corresponding to Ids.
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set Specific item under Bot rules used to rewrite the configuration content of this single rule. refer to the returned message from the DescribeBotManagedRules API for detailed information corresponding to Ids.
     * @param Ids Specific item under Bot rules used to rewrite the configuration content of this single rule. refer to the returned message from the DescribeBotManagedRules API for detailed information corresponding to Ids.
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Specifies the handling action for Bot rule items in Ids. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: Disabled, disable the specified rule;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: pass (only for Bot basic feature management).</li>.
 
     * @return Action Specifies the handling action for Bot rule items in Ids. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: Disabled, disable the specified rule;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: pass (only for Bot basic feature management).</li>.

     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Specifies the handling action for Bot rule items in Ids. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: Disabled, disable the specified rule;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: pass (only for Bot basic feature management).</li>.

     * @param Action Specifies the handling action for Bot rule items in Ids. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: Disabled, disable the specified rule;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: pass (only for Bot basic feature management).</li>.

     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public BotManagementActionOverrides() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotManagementActionOverrides(BotManagementActionOverrides source) {
        if (source.Ids != null) {
            this.Ids = new String[source.Ids.length];
            for (int i = 0; i < source.Ids.length; i++) {
                this.Ids[i] = new String(source.Ids[i]);
            }
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Ids.", this.Ids);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

