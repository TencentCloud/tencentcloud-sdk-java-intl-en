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

public class SecurityWeightedAction extends AbstractModel {

    /**
    * The handling method of the Bot custom rule. valid values: <li>Allow: pass, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li> <li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li> <li>Monitor: observation;</li> <li>Challenge: Challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL.</li>.
    */
    @SerializedName("SecurityAction")
    @Expose
    private SecurityAction SecurityAction;

    /**
    * The Weight of the current SecurityAction, only supported between 10 and 100 and must be a multiple of 10. the total of all Weight parameters must equal 100.
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get The handling method of the Bot custom rule. valid values: <li>Allow: pass, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li> <li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li> <li>Monitor: observation;</li> <li>Challenge: Challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL.</li>. 
     * @return SecurityAction The handling method of the Bot custom rule. valid values: <li>Allow: pass, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li> <li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li> <li>Monitor: observation;</li> <li>Challenge: Challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL.</li>.
     */
    public SecurityAction getSecurityAction() {
        return this.SecurityAction;
    }

    /**
     * Set The handling method of the Bot custom rule. valid values: <li>Allow: pass, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li> <li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li> <li>Monitor: observation;</li> <li>Challenge: Challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL.</li>.
     * @param SecurityAction The handling method of the Bot custom rule. valid values: <li>Allow: pass, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li> <li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li> <li>Monitor: observation;</li> <li>Challenge: Challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge and ManagedChallenge;</li> <li>Redirect: Redirect to URL.</li>.
     */
    public void setSecurityAction(SecurityAction SecurityAction) {
        this.SecurityAction = SecurityAction;
    }

    /**
     * Get The Weight of the current SecurityAction, only supported between 10 and 100 and must be a multiple of 10. the total of all Weight parameters must equal 100. 
     * @return Weight The Weight of the current SecurityAction, only supported between 10 and 100 and must be a multiple of 10. the total of all Weight parameters must equal 100.
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set The Weight of the current SecurityAction, only supported between 10 and 100 and must be a multiple of 10. the total of all Weight parameters must equal 100.
     * @param Weight The Weight of the current SecurityAction, only supported between 10 and 100 and must be a multiple of 10. the total of all Weight parameters must equal 100.
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public SecurityWeightedAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityWeightedAction(SecurityWeightedAction source) {
        if (source.SecurityAction != null) {
            this.SecurityAction = new SecurityAction(source.SecurityAction);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "SecurityAction.", this.SecurityAction);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

