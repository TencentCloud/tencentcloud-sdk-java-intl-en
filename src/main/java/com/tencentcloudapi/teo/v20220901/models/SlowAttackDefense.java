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

public class SlowAttackDefense extends AbstractModel {

    /**
    * Whether slow attack protection is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Slow attack protection handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li>.
    */
    @SerializedName("Action")
    @Expose
    private SecurityAction Action;

    /**
    * The specific configuration of the minimum body transfer rate threshold is required when Enabled is on.
    */
    @SerializedName("MinimalRequestBodyTransferRate")
    @Expose
    private MinimalRequestBodyTransferRate MinimalRequestBodyTransferRate;

    /**
    * Specifies the specific configuration of body transfer timeout duration. required when Enabled is on.
    */
    @SerializedName("RequestBodyTransferTimeout")
    @Expose
    private RequestBodyTransferTimeout RequestBodyTransferTimeout;

    /**
     * Get Whether slow attack protection is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>. 
     * @return Enabled Whether slow attack protection is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether slow attack protection is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     * @param Enabled Whether slow attack protection is enabled. valid values: <li>on: enabled;</li> <li>off: disabled.</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Slow attack protection handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li>. 
     * @return Action Slow attack protection handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li>.
     */
    public SecurityAction getAction() {
        return this.Action;
    }

    /**
     * Set Slow attack protection handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li>.
     * @param Action Slow attack protection handling method. required when Enabled is on. valid values for SecurityAction Name: <li>Monitor: observation;</li> <li>Deny: block;</li>.
     */
    public void setAction(SecurityAction Action) {
        this.Action = Action;
    }

    /**
     * Get The specific configuration of the minimum body transfer rate threshold is required when Enabled is on. 
     * @return MinimalRequestBodyTransferRate The specific configuration of the minimum body transfer rate threshold is required when Enabled is on.
     */
    public MinimalRequestBodyTransferRate getMinimalRequestBodyTransferRate() {
        return this.MinimalRequestBodyTransferRate;
    }

    /**
     * Set The specific configuration of the minimum body transfer rate threshold is required when Enabled is on.
     * @param MinimalRequestBodyTransferRate The specific configuration of the minimum body transfer rate threshold is required when Enabled is on.
     */
    public void setMinimalRequestBodyTransferRate(MinimalRequestBodyTransferRate MinimalRequestBodyTransferRate) {
        this.MinimalRequestBodyTransferRate = MinimalRequestBodyTransferRate;
    }

    /**
     * Get Specifies the specific configuration of body transfer timeout duration. required when Enabled is on. 
     * @return RequestBodyTransferTimeout Specifies the specific configuration of body transfer timeout duration. required when Enabled is on.
     */
    public RequestBodyTransferTimeout getRequestBodyTransferTimeout() {
        return this.RequestBodyTransferTimeout;
    }

    /**
     * Set Specifies the specific configuration of body transfer timeout duration. required when Enabled is on.
     * @param RequestBodyTransferTimeout Specifies the specific configuration of body transfer timeout duration. required when Enabled is on.
     */
    public void setRequestBodyTransferTimeout(RequestBodyTransferTimeout RequestBodyTransferTimeout) {
        this.RequestBodyTransferTimeout = RequestBodyTransferTimeout;
    }

    public SlowAttackDefense() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowAttackDefense(SlowAttackDefense source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Action != null) {
            this.Action = new SecurityAction(source.Action);
        }
        if (source.MinimalRequestBodyTransferRate != null) {
            this.MinimalRequestBodyTransferRate = new MinimalRequestBodyTransferRate(source.MinimalRequestBodyTransferRate);
        }
        if (source.RequestBodyTransferTimeout != null) {
            this.RequestBodyTransferTimeout = new RequestBodyTransferTimeout(source.RequestBodyTransferTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "Action.", this.Action);
        this.setParamObj(map, prefix + "MinimalRequestBodyTransferRate.", this.MinimalRequestBodyTransferRate);
        this.setParamObj(map, prefix + "RequestBodyTransferTimeout.", this.RequestBodyTransferTimeout);

    }
}

