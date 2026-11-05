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

public class BotSessionValidation extends AbstractModel {

    /**
    * Whether to update the Cookie and verify. Valid values: <li>on: update the Cookie and verify;</li><li>off: verify only.</li>
    */
    @SerializedName("IssueNewBotSessionCookie")
    @Expose
    private String IssueNewBotSessionCookie;

    /**
    * Update threshold for cookie update and validation. Valid only when IssueNewBotSessionCookie is on.
    */
    @SerializedName("MaxNewSessionTriggerConfig")
    @Expose
    private MaxNewSessionTriggerConfig MaxNewSessionTriggerConfig;

    /**
    * Execution action without a Cookie or with an expired Cookie. Supported Name values for SecurityAction: <li>Deny: block. DenyActionParameters supports Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
    */
    @SerializedName("SessionExpiredAction")
    @Expose
    private SecurityAction SessionExpiredAction;

    /**
    * Execution action for invalid Cookie. The Name parameter of SecurityAction supports the following values: <li>Deny: block. DenyActionParameters supports the Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires the MinDelayTime and MaxDelayTime configurations.</li>
    */
    @SerializedName("SessionInvalidAction")
    @Expose
    private SecurityAction SessionInvalidAction;

    /**
    * Specific configuration for session rate and periodic feature verification.
    */
    @SerializedName("SessionRateControl")
    @Expose
    private SessionRateControl SessionRateControl;

    /**
     * Get Whether to update the Cookie and verify. Valid values: <li>on: update the Cookie and verify;</li><li>off: verify only.</li> 
     * @return IssueNewBotSessionCookie Whether to update the Cookie and verify. Valid values: <li>on: update the Cookie and verify;</li><li>off: verify only.</li>
     */
    public String getIssueNewBotSessionCookie() {
        return this.IssueNewBotSessionCookie;
    }

    /**
     * Set Whether to update the Cookie and verify. Valid values: <li>on: update the Cookie and verify;</li><li>off: verify only.</li>
     * @param IssueNewBotSessionCookie Whether to update the Cookie and verify. Valid values: <li>on: update the Cookie and verify;</li><li>off: verify only.</li>
     */
    public void setIssueNewBotSessionCookie(String IssueNewBotSessionCookie) {
        this.IssueNewBotSessionCookie = IssueNewBotSessionCookie;
    }

    /**
     * Get Update threshold for cookie update and validation. Valid only when IssueNewBotSessionCookie is on. 
     * @return MaxNewSessionTriggerConfig Update threshold for cookie update and validation. Valid only when IssueNewBotSessionCookie is on.
     */
    public MaxNewSessionTriggerConfig getMaxNewSessionTriggerConfig() {
        return this.MaxNewSessionTriggerConfig;
    }

    /**
     * Set Update threshold for cookie update and validation. Valid only when IssueNewBotSessionCookie is on.
     * @param MaxNewSessionTriggerConfig Update threshold for cookie update and validation. Valid only when IssueNewBotSessionCookie is on.
     */
    public void setMaxNewSessionTriggerConfig(MaxNewSessionTriggerConfig MaxNewSessionTriggerConfig) {
        this.MaxNewSessionTriggerConfig = MaxNewSessionTriggerConfig;
    }

    /**
     * Get Execution action without a Cookie or with an expired Cookie. Supported Name values for SecurityAction: <li>Deny: block. DenyActionParameters supports Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li> 
     * @return SessionExpiredAction Execution action without a Cookie or with an expired Cookie. Supported Name values for SecurityAction: <li>Deny: block. DenyActionParameters supports Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public SecurityAction getSessionExpiredAction() {
        return this.SessionExpiredAction;
    }

    /**
     * Set Execution action without a Cookie or with an expired Cookie. Supported Name values for SecurityAction: <li>Deny: block. DenyActionParameters supports Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     * @param SessionExpiredAction Execution action without a Cookie or with an expired Cookie. Supported Name values for SecurityAction: <li>Deny: block. DenyActionParameters supports Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public void setSessionExpiredAction(SecurityAction SessionExpiredAction) {
        this.SessionExpiredAction = SessionExpiredAction;
    }

    /**
     * Get Execution action for invalid Cookie. The Name parameter of SecurityAction supports the following values: <li>Deny: block. DenyActionParameters supports the Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires the MinDelayTime and MaxDelayTime configurations.</li> 
     * @return SessionInvalidAction Execution action for invalid Cookie. The Name parameter of SecurityAction supports the following values: <li>Deny: block. DenyActionParameters supports the Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires the MinDelayTime and MaxDelayTime configurations.</li>
     */
    public SecurityAction getSessionInvalidAction() {
        return this.SessionInvalidAction;
    }

    /**
     * Set Execution action for invalid Cookie. The Name parameter of SecurityAction supports the following values: <li>Deny: block. DenyActionParameters supports the Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires the MinDelayTime and MaxDelayTime configurations.</li>
     * @param SessionInvalidAction Execution action for invalid Cookie. The Name parameter of SecurityAction supports the following values: <li>Deny: block. DenyActionParameters supports the Stall configuration.</li><li>Monitor: observe.</li><li>Allow: respond after waiting. AllowActionParameters requires the MinDelayTime and MaxDelayTime configurations.</li>
     */
    public void setSessionInvalidAction(SecurityAction SessionInvalidAction) {
        this.SessionInvalidAction = SessionInvalidAction;
    }

    /**
     * Get Specific configuration for session rate and periodic feature verification. 
     * @return SessionRateControl Specific configuration for session rate and periodic feature verification.
     */
    public SessionRateControl getSessionRateControl() {
        return this.SessionRateControl;
    }

    /**
     * Set Specific configuration for session rate and periodic feature verification.
     * @param SessionRateControl Specific configuration for session rate and periodic feature verification.
     */
    public void setSessionRateControl(SessionRateControl SessionRateControl) {
        this.SessionRateControl = SessionRateControl;
    }

    public BotSessionValidation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotSessionValidation(BotSessionValidation source) {
        if (source.IssueNewBotSessionCookie != null) {
            this.IssueNewBotSessionCookie = new String(source.IssueNewBotSessionCookie);
        }
        if (source.MaxNewSessionTriggerConfig != null) {
            this.MaxNewSessionTriggerConfig = new MaxNewSessionTriggerConfig(source.MaxNewSessionTriggerConfig);
        }
        if (source.SessionExpiredAction != null) {
            this.SessionExpiredAction = new SecurityAction(source.SessionExpiredAction);
        }
        if (source.SessionInvalidAction != null) {
            this.SessionInvalidAction = new SecurityAction(source.SessionInvalidAction);
        }
        if (source.SessionRateControl != null) {
            this.SessionRateControl = new SessionRateControl(source.SessionRateControl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IssueNewBotSessionCookie", this.IssueNewBotSessionCookie);
        this.setParamObj(map, prefix + "MaxNewSessionTriggerConfig.", this.MaxNewSessionTriggerConfig);
        this.setParamObj(map, prefix + "SessionExpiredAction.", this.SessionExpiredAction);
        this.setParamObj(map, prefix + "SessionInvalidAction.", this.SessionInvalidAction);
        this.setParamObj(map, prefix + "SessionRateControl.", this.SessionRateControl);

    }
}

