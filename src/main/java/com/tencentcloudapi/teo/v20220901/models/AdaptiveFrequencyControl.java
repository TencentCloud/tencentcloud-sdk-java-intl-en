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
    * Whether adaptive frequency control is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Rule ID of adaptive frequency control, returned only as an output parameter.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * The limitation level of adaptive frequency control. This field is required when Enabled is on. Valid values: <li>Loose: loose;</li><li>Moderate: moderate;</li><li>Strict: strict.</li>
    */
    @SerializedName("Sensitivity")
    @Expose
    private String Sensitivity;

    /**
    * Handling method of adaptive frequency control. This field is required when Enabled is on. Supported values for SecurityAction Name: <li>Monitor: monitor;</li><li>Deny: block;</li><li>Challenge: challenge. ChallengeActionParameters.Name only supports JSChallenge.</li>
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Whether adaptive frequency control is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li> 
     * @return Enabled Whether adaptive frequency control is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether adaptive frequency control is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     * @param Enabled Whether adaptive frequency control is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Rule ID of adaptive frequency control, returned only as an output parameter. 
     * @return Id Rule ID of adaptive frequency control, returned only as an output parameter.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Rule ID of adaptive frequency control, returned only as an output parameter.
     * @param Id Rule ID of adaptive frequency control, returned only as an output parameter.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get The limitation level of adaptive frequency control. This field is required when Enabled is on. Valid values: <li>Loose: loose;</li><li>Moderate: moderate;</li><li>Strict: strict.</li> 
     * @return Sensitivity The limitation level of adaptive frequency control. This field is required when Enabled is on. Valid values: <li>Loose: loose;</li><li>Moderate: moderate;</li><li>Strict: strict.</li>
     */
    public String getSensitivity() {
        return this.Sensitivity;
    }

    /**
     * Set The limitation level of adaptive frequency control. This field is required when Enabled is on. Valid values: <li>Loose: loose;</li><li>Moderate: moderate;</li><li>Strict: strict.</li>
     * @param Sensitivity The limitation level of adaptive frequency control. This field is required when Enabled is on. Valid values: <li>Loose: loose;</li><li>Moderate: moderate;</li><li>Strict: strict.</li>
     */
    public void setSensitivity(String Sensitivity) {
        this.Sensitivity = Sensitivity;
    }

    /**
     * Get Handling method of adaptive frequency control. This field is required when Enabled is on. Supported values for SecurityAction Name: <li>Monitor: monitor;</li><li>Deny: block;</li><li>Challenge: challenge. ChallengeActionParameters.Name only supports JSChallenge.</li> 
     * @return Action Handling method of adaptive frequency control. This field is required when Enabled is on. Supported values for SecurityAction Name: <li>Monitor: monitor;</li><li>Deny: block;</li><li>Challenge: challenge. ChallengeActionParameters.Name only supports JSChallenge.</li>
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Handling method of adaptive frequency control. This field is required when Enabled is on. Supported values for SecurityAction Name: <li>Monitor: monitor;</li><li>Deny: block;</li><li>Challenge: challenge. ChallengeActionParameters.Name only supports JSChallenge.</li>
     * @param Action Handling method of adaptive frequency control. This field is required when Enabled is on. Supported values for SecurityAction Name: <li>Monitor: monitor;</li><li>Deny: block;</li><li>Challenge: challenge. ChallengeActionParameters.Name only supports JSChallenge.</li>
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
        if (source.Id != null) {
            this.Id = new String(source.Id);
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
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Sensitivity", this.Sensitivity);
        this.setParamObj(map, prefix + "Action.", this.Action);

    }
}

