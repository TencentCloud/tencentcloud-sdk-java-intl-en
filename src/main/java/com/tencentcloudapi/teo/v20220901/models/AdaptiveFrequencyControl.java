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

public class AdaptiveFrequencyControl extends AbstractModel {

    /**
    * Whether adaptive frequency control is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * The restriction level of adaptive frequency control. required when Enabled is on. valid values: <li>Loose: Loose</li><li>Moderate: Moderate</li><li>Strict: Strict</li>.
    */
    @SerializedName("Sensitivity")
    @Expose
    private String Sensitivity;

    /**
    * The handling method of adaptive frequency control. this field is required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Whether adaptive frequency control is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>. 
     * @return Enabled Whether adaptive frequency control is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether adaptive frequency control is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     * @param Enabled Whether adaptive frequency control is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The restriction level of adaptive frequency control. required when Enabled is on. valid values: <li>Loose: Loose</li><li>Moderate: Moderate</li><li>Strict: Strict</li>. 
     * @return Sensitivity The restriction level of adaptive frequency control. required when Enabled is on. valid values: <li>Loose: Loose</li><li>Moderate: Moderate</li><li>Strict: Strict</li>.
     */
    public String getSensitivity() {
        return this.Sensitivity;
    }

    /**
     * Set The restriction level of adaptive frequency control. required when Enabled is on. valid values: <li>Loose: Loose</li><li>Moderate: Moderate</li><li>Strict: Strict</li>.
     * @param Sensitivity The restriction level of adaptive frequency control. required when Enabled is on. valid values: <li>Loose: Loose</li><li>Moderate: Moderate</li><li>Strict: Strict</li>.
     */
    public void setSensitivity(String Sensitivity) {
        this.Sensitivity = Sensitivity;
    }

    /**
     * Get The handling method of adaptive frequency control. this field is required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>. 
     * @return Action The handling method of adaptive frequency control. this field is required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set The handling method of adaptive frequency control. this field is required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     * @param Action The handling method of adaptive frequency control. this field is required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public AdaptiveFrequencyControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdaptiveFrequencyControl(AdaptiveFrequencyControl source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Sensitivity != null) {
            this.Sensitivity = new String(source.Sensitivity);
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
        this.setParamSimple(map, prefix + "Sensitivity", this.Sensitivity);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

