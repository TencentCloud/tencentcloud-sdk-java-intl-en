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
    * Execution action for malicious Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
    */
    @SerializedName("HighRiskBotRequestsAction")
    @Expose
    private SecurityAction HighRiskBotRequestsAction;

    /**
    * The execution action for suspected Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
    */
    @SerializedName("LikelyBotRequestsAction")
    @Expose
    private SecurityAction LikelyBotRequestsAction;

    /**
    * Execution action for friendly Bot request. SecurityAction Name parameter supports: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: pass;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
    */
    @SerializedName("VerifiedBotRequestsAction")
    @Expose
    private SecurityAction VerifiedBotRequestsAction;

    /**
    * Execution action for a normal Bot request. valid values for the Name parameter in SecurityAction: <li>Allow: pass.</li>.
    */
    @SerializedName("HumanRequestsAction")
    @Expose
    private SecurityAction HumanRequestsAction;

    /**
     * Get Execution action for malicious Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>. 
     * @return HighRiskBotRequestsAction Execution action for malicious Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public SecurityAction getHighRiskBotRequestsAction() {
        return this.HighRiskBotRequestsAction;
    }

    /**
     * Set Execution action for malicious Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     * @param HighRiskBotRequestsAction Execution action for malicious Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public void setHighRiskBotRequestsAction(SecurityAction HighRiskBotRequestsAction) {
        this.HighRiskBotRequestsAction = HighRiskBotRequestsAction;
    }

    /**
     * Get The execution action for suspected Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>. 
     * @return LikelyBotRequestsAction The execution action for suspected Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public SecurityAction getLikelyBotRequestsAction() {
        return this.LikelyBotRequestsAction;
    }

    /**
     * Set The execution action for suspected Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     * @param LikelyBotRequestsAction The execution action for suspected Bot requests. valid values for the Name parameter in SecurityAction: <li>Deny: block;</li> <li>Monitor: observe;</li> <li>Allow: pass;</li> <li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public void setLikelyBotRequestsAction(SecurityAction LikelyBotRequestsAction) {
        this.LikelyBotRequestsAction = LikelyBotRequestsAction;
    }

    /**
     * Get Execution action for friendly Bot request. SecurityAction Name parameter supports: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: pass;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>. 
     * @return VerifiedBotRequestsAction Execution action for friendly Bot request. SecurityAction Name parameter supports: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: pass;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public SecurityAction getVerifiedBotRequestsAction() {
        return this.VerifiedBotRequestsAction;
    }

    /**
     * Set Execution action for friendly Bot request. SecurityAction Name parameter supports: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: pass;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     * @param VerifiedBotRequestsAction Execution action for friendly Bot request. SecurityAction Name parameter supports: <li>Deny: block;</li><li>Monitor: observe;</li><li>Allow: pass;</li><li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters supports JSChallenge and ManagedChallenge.</li>.
     */
    public void setVerifiedBotRequestsAction(SecurityAction VerifiedBotRequestsAction) {
        this.VerifiedBotRequestsAction = VerifiedBotRequestsAction;
    }

    /**
     * Get Execution action for a normal Bot request. valid values for the Name parameter in SecurityAction: <li>Allow: pass.</li>. 
     * @return HumanRequestsAction Execution action for a normal Bot request. valid values for the Name parameter in SecurityAction: <li>Allow: pass.</li>.
     */
    public SecurityAction getHumanRequestsAction() {
        return this.HumanRequestsAction;
    }

    /**
     * Set Execution action for a normal Bot request. valid values for the Name parameter in SecurityAction: <li>Allow: pass.</li>.
     * @param HumanRequestsAction Execution action for a normal Bot request. valid values for the Name parameter in SecurityAction: <li>Allow: pass.</li>.
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

