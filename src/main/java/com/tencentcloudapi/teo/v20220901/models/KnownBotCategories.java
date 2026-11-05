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

public class KnownBotCategories extends AbstractModel {

    /**
    * Handling method for access requests from known commercial or open-source tools. Supported values of SecurityAction Name: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Disabled: Not enabled, disable the specified rule;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: Release (to be deprecated).</li>
    */
    @SerializedName("BaseAction")
    @Expose
    private SecurityAction BaseAction;

    /**
    * Specify the handling method for access requests from known commercial or open-source tools.
    */
    @SerializedName("BotManagementActionOverrides")
    @Expose
    private BotManagementActionOverrides [] BotManagementActionOverrides;

    /**
     * Get Handling method for access requests from known commercial or open-source tools. Supported values of SecurityAction Name: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Disabled: Not enabled, disable the specified rule;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: Release (to be deprecated).</li> 
     * @return BaseAction Handling method for access requests from known commercial or open-source tools. Supported values of SecurityAction Name: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Disabled: Not enabled, disable the specified rule;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: Release (to be deprecated).</li>
     */
    public SecurityAction getBaseAction() {
        return this.BaseAction;
    }

    /**
     * Set Handling method for access requests from known commercial or open-source tools. Supported values of SecurityAction Name: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Disabled: Not enabled, disable the specified rule;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: Release (to be deprecated).</li>
     * @param BaseAction Handling method for access requests from known commercial or open-source tools. Supported values of SecurityAction Name: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Disabled: Not enabled, disable the specified rule;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge;</li><li>Allow: Release (to be deprecated).</li>
     */
    public void setBaseAction(SecurityAction BaseAction) {
        this.BaseAction = BaseAction;
    }

    /**
     * Get Specify the handling method for access requests from known commercial or open-source tools. 
     * @return BotManagementActionOverrides Specify the handling method for access requests from known commercial or open-source tools.
     */
    public BotManagementActionOverrides [] getBotManagementActionOverrides() {
        return this.BotManagementActionOverrides;
    }

    /**
     * Set Specify the handling method for access requests from known commercial or open-source tools.
     * @param BotManagementActionOverrides Specify the handling method for access requests from known commercial or open-source tools.
     */
    public void setBotManagementActionOverrides(BotManagementActionOverrides [] BotManagementActionOverrides) {
        this.BotManagementActionOverrides = BotManagementActionOverrides;
    }

    public KnownBotCategories() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public KnownBotCategories(KnownBotCategories source) {
        if (source.BaseAction != null) {
            this.BaseAction = new SecurityAction(source.BaseAction);
        }
        if (source.BotManagementActionOverrides != null) {
            this.BotManagementActionOverrides = new BotManagementActionOverrides[source.BotManagementActionOverrides.length];
            for (int i = 0; i < source.BotManagementActionOverrides.length; i++) {
                this.BotManagementActionOverrides[i] = new BotManagementActionOverrides(source.BotManagementActionOverrides[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BaseAction.", this.BaseAction);
        this.setParamArrayObj(map, prefix + "BotManagementActionOverrides.", this.BotManagementActionOverrides);

    }
}

