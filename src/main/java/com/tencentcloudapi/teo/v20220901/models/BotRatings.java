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

public class BotRatings extends AbstractModel {

    /**
    * Execution action for malicious Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
    */
    @SerializedName("HighRiskBotRequestsAction")
    @Expose
    private SecurityAction HighRiskBotRequestsAction;

    /**
    * Execution action for suspected Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
    */
    @SerializedName("LikelyBotRequestsAction")
    @Expose
    private SecurityAction LikelyBotRequestsAction;

    /**
    * Execution action of friendly Bot requests. The Name parameter of SecurityAction supports the following values: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
    */
    @SerializedName("VerifiedBotRequestsAction")
    @Expose
    private SecurityAction VerifiedBotRequestsAction;

    /**
    * Execution action for normal Bot requests. Valid values of SecurityAction Name: <li>Allow: Allow.</li>
    */
    @SerializedName("HumanRequestsAction")
    @Expose
    private SecurityAction HumanRequestsAction;

    /**
     * Get Execution action for malicious Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li> 
     * @return HighRiskBotRequestsAction Execution action for malicious Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     */
    public SecurityAction getHighRiskBotRequestsAction() {
        return this.HighRiskBotRequestsAction;
    }

    /**
     * Set Execution action for malicious Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     * @param HighRiskBotRequestsAction Execution action for malicious Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. Among them, ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     */
    public void setHighRiskBotRequestsAction(SecurityAction HighRiskBotRequestsAction) {
        this.HighRiskBotRequestsAction = HighRiskBotRequestsAction;
    }

    /**
     * Get Execution action for suspected Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li> 
     * @return LikelyBotRequestsAction Execution action for suspected Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     */
    public SecurityAction getLikelyBotRequestsAction() {
        return this.LikelyBotRequestsAction;
    }

    /**
     * Set Execution action for suspected Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     * @param LikelyBotRequestsAction Execution action for suspected Bot requests. Supported values for the Name parameter of SecurityAction: <li>Deny: Block;</li><li>Monitor: Observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     */
    public void setLikelyBotRequestsAction(SecurityAction LikelyBotRequestsAction) {
        this.LikelyBotRequestsAction = LikelyBotRequestsAction;
    }

    /**
     * Get Execution action of friendly Bot requests. The Name parameter of SecurityAction supports the following values: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li> 
     * @return VerifiedBotRequestsAction Execution action of friendly Bot requests. The Name parameter of SecurityAction supports the following values: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     */
    public SecurityAction getVerifiedBotRequestsAction() {
        return this.VerifiedBotRequestsAction;
    }

    /**
     * Set Execution action of friendly Bot requests. The Name parameter of SecurityAction supports the following values: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     * @param VerifiedBotRequestsAction Execution action of friendly Bot requests. The Name parameter of SecurityAction supports the following values: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: Allow;</li><li>Challenge: Challenge. The ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>
     */
    public void setVerifiedBotRequestsAction(SecurityAction VerifiedBotRequestsAction) {
        this.VerifiedBotRequestsAction = VerifiedBotRequestsAction;
    }

    /**
     * Get Execution action for normal Bot requests. Valid values of SecurityAction Name: <li>Allow: Allow.</li> 
     * @return HumanRequestsAction Execution action for normal Bot requests. Valid values of SecurityAction Name: <li>Allow: Allow.</li>
     */
    public SecurityAction getHumanRequestsAction() {
        return this.HumanRequestsAction;
    }

    /**
     * Set Execution action for normal Bot requests. Valid values of SecurityAction Name: <li>Allow: Allow.</li>
     * @param HumanRequestsAction Execution action for normal Bot requests. Valid values of SecurityAction Name: <li>Allow: Allow.</li>
     */
    public void setHumanRequestsAction(SecurityAction HumanRequestsAction) {
        this.HumanRequestsAction = HumanRequestsAction;
    }

    public BotRatings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotRatings(BotRatings source) {
        if (source.HighRiskBotRequestsAction != null) {
            this.HighRiskBotRequestsAction = new SecurityAction(source.HighRiskBotRequestsAction);
        }
        if (source.LikelyBotRequestsAction != null) {
            this.LikelyBotRequestsAction = new SecurityAction(source.LikelyBotRequestsAction);
        }
        if (source.VerifiedBotRequestsAction != null) {
            this.VerifiedBotRequestsAction = new SecurityAction(source.VerifiedBotRequestsAction);
        }
        if (source.HumanRequestsAction != null) {
            this.HumanRequestsAction = new SecurityAction(source.HumanRequestsAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HighRiskBotRequestsAction.", this.HighRiskBotRequestsAction);
        this.setParamObj(map, prefix + "LikelyBotRequestsAction.", this.LikelyBotRequestsAction);
        this.setParamObj(map, prefix + "VerifiedBotRequestsAction.", this.VerifiedBotRequestsAction);
        this.setParamObj(map, prefix + "HumanRequestsAction.", this.HumanRequestsAction);

    }
}

