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

public class AICrawlerDetection extends AbstractModel {

    /**
    * Whether AI crawler detection is enabled. valid values:.
<li>`on`: Enable;</li>
<li>off: Disable.</li>

    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * AI crawler detection execution action. this field is required when Enabled is on. valid values for the Name parameter in SecurityAction:.
<Li>Deny: block;</li>.
<Li>Monitor: observation.</li>.
<Li>Allow: pass;</li>.
<li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters only supports JSChallenge and ManagedChallenge.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Whether AI crawler detection is enabled. valid values:.
<li>`on`: Enable;</li>
<li>off: Disable.</li>
 
     * @return Enabled Whether AI crawler detection is enabled. valid values:.
<li>`on`: Enable;</li>
<li>off: Disable.</li>

     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether AI crawler detection is enabled. valid values:.
<li>`on`: Enable;</li>
<li>off: Disable.</li>

     * @param Enabled Whether AI crawler detection is enabled. valid values:.
<li>`on`: Enable;</li>
<li>off: Disable.</li>

     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get AI crawler detection execution action. this field is required when Enabled is on. valid values for the Name parameter in SecurityAction:.
<Li>Deny: block;</li>.
<Li>Monitor: observation.</li>.
<Li>Allow: pass;</li>.
<li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters only supports JSChallenge and ManagedChallenge.</li>. 
     * @return Action AI crawler detection execution action. this field is required when Enabled is on. valid values for the Name parameter in SecurityAction:.
<Li>Deny: block;</li>.
<Li>Monitor: observation.</li>.
<Li>Allow: pass;</li>.
<li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters only supports JSChallenge and ManagedChallenge.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set AI crawler detection execution action. this field is required when Enabled is on. valid values for the Name parameter in SecurityAction:.
<Li>Deny: block;</li>.
<Li>Monitor: observation.</li>.
<Li>Allow: pass;</li>.
<li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters only supports JSChallenge and ManagedChallenge.</li>.
     * @param Action AI crawler detection execution action. this field is required when Enabled is on. valid values for the Name parameter in SecurityAction:.
<Li>Deny: block;</li>.
<Li>Monitor: observation.</li>.
<Li>Allow: pass;</li>.
<li>Challenge: Challenge, where ChallengeOption in ChallengeActionParameters only supports JSChallenge and ManagedChallenge.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public AICrawlerDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICrawlerDetection(AICrawlerDetection source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

