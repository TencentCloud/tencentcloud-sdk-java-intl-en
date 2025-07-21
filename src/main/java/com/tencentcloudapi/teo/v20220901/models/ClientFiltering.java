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

public class ClientFiltering extends AbstractModel {

    /**
    * Whether intelligent client filtering is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * The handling method of intelligent client filtering. when Enabled is on, this field is required. the Name parameter of SecurityAction supports: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
     * Get Whether intelligent client filtering is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>. 
     * @return Enabled Whether intelligent client filtering is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether intelligent client filtering is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     * @param Enabled Whether intelligent client filtering is enabled. valid values: <li>on: enable;</li> <li>off: disable.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get The handling method of intelligent client filtering. when Enabled is on, this field is required. the Name parameter of SecurityAction supports: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>. 
     * @return Action The handling method of intelligent client filtering. when Enabled is on, this field is required. the Name parameter of SecurityAction supports: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set The handling method of intelligent client filtering. when Enabled is on, this field is required. the Name parameter of SecurityAction supports: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     * @param Action The handling method of intelligent client filtering. when Enabled is on, this field is required. the Name parameter of SecurityAction supports: <li>Monitor: observation;</li> <li>Deny: block;</li> <li>Challenge: Challenge, where ChallengeActionParameters.Name only supports JSChallenge.</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    public ClientFiltering() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientFiltering(ClientFiltering source) {
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

