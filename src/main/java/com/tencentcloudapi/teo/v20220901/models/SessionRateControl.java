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

public class SessionRateControl extends AbstractModel {

    /**
    * Whether session rate and periodic feature verification are enabled. Valid values: <li>on: enable</li><li>off: disable</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Session rate and periodic feature verification for high-risk executed actions. The Name parameter of SecurityAction supports the following values: <li>Deny: block, with Stall configuration supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
    */
    @SerializedName("HighRateSessionAction")
    @Expose
    private SecurityAction HighRateSessionAction;

    /**
    * Execution action for medium-risk session rate and periodic feature verification. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
    */
    @SerializedName("MidRateSessionAction")
    @Expose
    private SecurityAction MidRateSessionAction;

    /**
    * Session rate and periodic feature verification are low-risk execution actions. The Name parameter of SecurityAction supports: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: wait then respond, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
    */
    @SerializedName("LowRateSessionAction")
    @Expose
    private SecurityAction LowRateSessionAction;

    /**
     * Get Whether session rate and periodic feature verification are enabled. Valid values: <li>on: enable</li><li>off: disable</li> 
     * @return Enabled Whether session rate and periodic feature verification are enabled. Valid values: <li>on: enable</li><li>off: disable</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether session rate and periodic feature verification are enabled. Valid values: <li>on: enable</li><li>off: disable</li>
     * @param Enabled Whether session rate and periodic feature verification are enabled. Valid values: <li>on: enable</li><li>off: disable</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Session rate and periodic feature verification for high-risk executed actions. The Name parameter of SecurityAction supports the following values: <li>Deny: block, with Stall configuration supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li> 
     * @return HighRateSessionAction Session rate and periodic feature verification for high-risk executed actions. The Name parameter of SecurityAction supports the following values: <li>Deny: block, with Stall configuration supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public SecurityAction getHighRateSessionAction() {
        return this.HighRateSessionAction;
    }

    /**
     * Set Session rate and periodic feature verification for high-risk executed actions. The Name parameter of SecurityAction supports the following values: <li>Deny: block, with Stall configuration supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     * @param HighRateSessionAction Session rate and periodic feature verification for high-risk executed actions. The Name parameter of SecurityAction supports the following values: <li>Deny: block, with Stall configuration supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public void setHighRateSessionAction(SecurityAction HighRateSessionAction) {
        this.HighRateSessionAction = HighRateSessionAction;
    }

    /**
     * Get Execution action for medium-risk session rate and periodic feature verification. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li> 
     * @return MidRateSessionAction Execution action for medium-risk session rate and periodic feature verification. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public SecurityAction getMidRateSessionAction() {
        return this.MidRateSessionAction;
    }

    /**
     * Set Execution action for medium-risk session rate and periodic feature verification. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     * @param MidRateSessionAction Execution action for medium-risk session rate and periodic feature verification. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public void setMidRateSessionAction(SecurityAction MidRateSessionAction) {
        this.MidRateSessionAction = MidRateSessionAction;
    }

    /**
     * Get Session rate and periodic feature verification are low-risk execution actions. The Name parameter of SecurityAction supports: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: wait then respond, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li> 
     * @return LowRateSessionAction Session rate and periodic feature verification are low-risk execution actions. The Name parameter of SecurityAction supports: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: wait then respond, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public SecurityAction getLowRateSessionAction() {
        return this.LowRateSessionAction;
    }

    /**
     * Set Session rate and periodic feature verification are low-risk execution actions. The Name parameter of SecurityAction supports: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: wait then respond, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     * @param LowRateSessionAction Session rate and periodic feature verification are low-risk execution actions. The Name parameter of SecurityAction supports: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: wait then respond, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public void setLowRateSessionAction(SecurityAction LowRateSessionAction) {
        this.LowRateSessionAction = LowRateSessionAction;
    }

    public SessionRateControl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SessionRateControl(SessionRateControl source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.HighRateSessionAction != null) {
            this.HighRateSessionAction = new SecurityAction(source.HighRateSessionAction);
        }
        if (source.MidRateSessionAction != null) {
            this.MidRateSessionAction = new SecurityAction(source.MidRateSessionAction);
        }
        if (source.LowRateSessionAction != null) {
            this.LowRateSessionAction = new SecurityAction(source.LowRateSessionAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "HighRateSessionAction.", this.HighRateSessionAction);
        this.setParamObj(map, prefix + "MidRateSessionAction.", this.MidRateSessionAction);
        this.setParamObj(map, prefix + "LowRateSessionAction.", this.LowRateSessionAction);

    }
}

