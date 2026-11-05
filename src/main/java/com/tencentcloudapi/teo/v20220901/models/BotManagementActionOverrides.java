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
    * Specific item under the Bot rule group, used to rewrite the configuration content of this individual rule item. For detailed information corresponding to the Ids, see the returned message of the DescribeBotManagedRules API.
    */
    @SerializedName("Ids")
    @Expose
    private String [] Ids;

    /**
    * Handling action for the Bot rule item specified in Ids. Supported values for SecurityAction Name: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: not enabled, disable the specified rule;</li><li>Challenge: challenge. ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: allow (only for basic feature management of Bot).</li>

    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Specific item under the Bot rule group, used to rewrite the configuration content of this individual rule item. For detailed information corresponding to the Ids, see the returned message of the DescribeBotManagedRules API. 
     * @return Ids Specific item under the Bot rule group, used to rewrite the configuration content of this individual rule item. For detailed information corresponding to the Ids, see the returned message of the DescribeBotManagedRules API.
     */
    public String [] getIds() {
        return this.Ids;
    }

    /**
     * Set Specific item under the Bot rule group, used to rewrite the configuration content of this individual rule item. For detailed information corresponding to the Ids, see the returned message of the DescribeBotManagedRules API.
     * @param Ids Specific item under the Bot rule group, used to rewrite the configuration content of this individual rule item. For detailed information corresponding to the Ids, see the returned message of the DescribeBotManagedRules API.
     */
    public void setIds(String [] Ids) {
        this.Ids = Ids;
    }

    /**
     * Get Handling action for the Bot rule item specified in Ids. Supported values for SecurityAction Name: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: not enabled, disable the specified rule;</li><li>Challenge: challenge. ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: allow (only for basic feature management of Bot).</li>
 
     * @return Action Handling action for the Bot rule item specified in Ids. Supported values for SecurityAction Name: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: not enabled, disable the specified rule;</li><li>Challenge: challenge. ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: allow (only for basic feature management of Bot).</li>

     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Handling action for the Bot rule item specified in Ids. Supported values for SecurityAction Name: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: not enabled, disable the specified rule;</li><li>Challenge: challenge. ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: allow (only for basic feature management of Bot).</li>

     * @param Action Handling action for the Bot rule item specified in Ids. Supported values for SecurityAction Name: <li>Deny: block;</li><li>Monitor: observe;</li><li>Disabled: not enabled, disable the specified rule;</li><li>Challenge: challenge. ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: allow (only for basic feature management of Bot).</li>

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

