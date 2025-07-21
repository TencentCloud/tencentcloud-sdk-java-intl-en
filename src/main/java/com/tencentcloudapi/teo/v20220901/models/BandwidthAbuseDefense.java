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

public class BandwidthAbuseDefense extends AbstractModel {

    /**
    * Whether bandwidth abuse protection (applicable to chinese mainland only) is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Bandwidth abuse protection (applicable to chinese mainland) handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observe;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Whether bandwidth abuse protection (applicable to chinese mainland only) is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>. 
     * @return Enabled Whether bandwidth abuse protection (applicable to chinese mainland only) is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether bandwidth abuse protection (applicable to chinese mainland only) is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     * @param Enabled Whether bandwidth abuse protection (applicable to chinese mainland only) is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Bandwidth abuse protection (applicable to chinese mainland) handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observe;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>. 
     * @return Action Bandwidth abuse protection (applicable to chinese mainland) handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observe;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Bandwidth abuse protection (applicable to chinese mainland) handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observe;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     * @param Action Bandwidth abuse protection (applicable to chinese mainland) handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observe;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public BandwidthAbuseDefense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BandwidthAbuseDefense(BandwidthAbuseDefense source) {
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

