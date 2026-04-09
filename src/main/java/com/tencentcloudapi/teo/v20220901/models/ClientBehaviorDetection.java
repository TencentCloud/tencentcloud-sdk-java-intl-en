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

public class ClientBehaviorDetection extends AbstractModel {

    /**
    * Specifies the proof-of-work strength. valid values: <li>low: low;</li><li>medium: medium;</li><li>high: high.</li>.
    */
    @SerializedName("CryptoChallengeIntensity")
    @Expose
    private String CryptoChallengeIntensity;

    /**
    * Specifies the execution mode for client behavior verification. valid values: <li>0ms: immediate execution;</li> <li>100ms: delay 100ms execution;</li> <li>200ms: delay 200ms execution;</li> <li>300ms: delay 300ms execution;</li> <li>400ms: delay 400ms execution;</li> <li>500ms: delay 500ms execution;</li> <li>600ms: delay 600ms execution;</li> <li>700ms: delay 700ms execution;</li> <li>800ms: delay 800ms execution;</li> <li>900ms: delay 900ms execution;</li> <li>1000ms: delay 1000ms execution.</li>.
    */
    @SerializedName("CryptoChallengeDelayBefore")
    @Expose
    private String CryptoChallengeDelayBefore;

    /**
    * Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
    */
    @SerializedName("MaxChallengeCountInterval")
    @Expose
    private String MaxChallengeCountInterval;

    /**
    * Trigger threshold cumulative count. value range: 1-100000000.
    */
    @SerializedName("MaxChallengeCountThreshold")
    @Expose
    private Long MaxChallengeCountThreshold;

    /**
    * Execution action when client-side javascript is not enabled (test not completed). valid values for SecurityAction Name: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>.
    */
    @SerializedName("ChallengeNotFinishedAction")
    @Expose
    private SecurityAction ChallengeNotFinishedAction;

    /**
    * The execution action for client-side detection timeout. valid values for the Name parameter in SecurityAction: <li>Deny: block, where Stall can be configured in DenyActionParameters;</li> <li>Monitor: observe;</li> <li>Allow: respond after wait, where MinDelayTime and MaxDelayTime must be configured in AllowActionParameters.</li>.
    */
    @SerializedName("ChallengeTimeoutAction")
    @Expose
    private SecurityAction ChallengeTimeoutAction;

    /**
    * The execution action of the Bot client. valid values for the Name parameter in SecurityAction: <li>Deny: block, where the Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observation;</li><li>Allow: respond after wait, where MinDelayTime and MaxDelayTime configurations are required in AllowActionParameters.</li>.
    */
    @SerializedName("BotClientAction")
    @Expose
    private SecurityAction BotClientAction;

    /**
     * Get Specifies the proof-of-work strength. valid values: <li>low: low;</li><li>medium: medium;</li><li>high: high.</li>. 
     * @return CryptoChallengeIntensity Specifies the proof-of-work strength. valid values: <li>low: low;</li><li>medium: medium;</li><li>high: high.</li>.
     */
    public String getCryptoChallengeIntensity() {
        return this.CryptoChallengeIntensity;
    }

    /**
     * Set Specifies the proof-of-work strength. valid values: <li>low: low;</li><li>medium: medium;</li><li>high: high.</li>.
     * @param CryptoChallengeIntensity Specifies the proof-of-work strength. valid values: <li>low: low;</li><li>medium: medium;</li><li>high: high.</li>.
     */
    public void setCryptoChallengeIntensity(String CryptoChallengeIntensity) {
        this.CryptoChallengeIntensity = CryptoChallengeIntensity;
    }

    /**
     * Get Specifies the execution mode for client behavior verification. valid values: <li>0ms: immediate execution;</li> <li>100ms: delay 100ms execution;</li> <li>200ms: delay 200ms execution;</li> <li>300ms: delay 300ms execution;</li> <li>400ms: delay 400ms execution;</li> <li>500ms: delay 500ms execution;</li> <li>600ms: delay 600ms execution;</li> <li>700ms: delay 700ms execution;</li> <li>800ms: delay 800ms execution;</li> <li>900ms: delay 900ms execution;</li> <li>1000ms: delay 1000ms execution.</li>. 
     * @return CryptoChallengeDelayBefore Specifies the execution mode for client behavior verification. valid values: <li>0ms: immediate execution;</li> <li>100ms: delay 100ms execution;</li> <li>200ms: delay 200ms execution;</li> <li>300ms: delay 300ms execution;</li> <li>400ms: delay 400ms execution;</li> <li>500ms: delay 500ms execution;</li> <li>600ms: delay 600ms execution;</li> <li>700ms: delay 700ms execution;</li> <li>800ms: delay 800ms execution;</li> <li>900ms: delay 900ms execution;</li> <li>1000ms: delay 1000ms execution.</li>.
     */
    public String getCryptoChallengeDelayBefore() {
        return this.CryptoChallengeDelayBefore;
    }

    /**
     * Set Specifies the execution mode for client behavior verification. valid values: <li>0ms: immediate execution;</li> <li>100ms: delay 100ms execution;</li> <li>200ms: delay 200ms execution;</li> <li>300ms: delay 300ms execution;</li> <li>400ms: delay 400ms execution;</li> <li>500ms: delay 500ms execution;</li> <li>600ms: delay 600ms execution;</li> <li>700ms: delay 700ms execution;</li> <li>800ms: delay 800ms execution;</li> <li>900ms: delay 900ms execution;</li> <li>1000ms: delay 1000ms execution.</li>.
     * @param CryptoChallengeDelayBefore Specifies the execution mode for client behavior verification. valid values: <li>0ms: immediate execution;</li> <li>100ms: delay 100ms execution;</li> <li>200ms: delay 200ms execution;</li> <li>300ms: delay 300ms execution;</li> <li>400ms: delay 400ms execution;</li> <li>500ms: delay 500ms execution;</li> <li>600ms: delay 600ms execution;</li> <li>700ms: delay 700ms execution;</li> <li>800ms: delay 800ms execution;</li> <li>900ms: delay 900ms execution;</li> <li>1000ms: delay 1000ms execution.</li>.
     */
    public void setCryptoChallengeDelayBefore(String CryptoChallengeDelayBefore) {
        this.CryptoChallengeDelayBefore = CryptoChallengeDelayBefore;
    }

    /**
     * Get Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>. 
     * @return MaxChallengeCountInterval Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
     */
    public String getMaxChallengeCountInterval() {
        return this.MaxChallengeCountInterval;
    }

    /**
     * Set Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
     * @param MaxChallengeCountInterval Time window for trigger threshold statistics. valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>.
     */
    public void setMaxChallengeCountInterval(String MaxChallengeCountInterval) {
        this.MaxChallengeCountInterval = MaxChallengeCountInterval;
    }

    /**
     * Get Trigger threshold cumulative count. value range: 1-100000000. 
     * @return MaxChallengeCountThreshold Trigger threshold cumulative count. value range: 1-100000000.
     */
    public Long getMaxChallengeCountThreshold() {
        return this.MaxChallengeCountThreshold;
    }

    /**
     * Set Trigger threshold cumulative count. value range: 1-100000000.
     * @param MaxChallengeCountThreshold Trigger threshold cumulative count. value range: 1-100000000.
     */
    public void setMaxChallengeCountThreshold(Long MaxChallengeCountThreshold) {
        this.MaxChallengeCountThreshold = MaxChallengeCountThreshold;
    }

    /**
     * Get Execution action when client-side javascript is not enabled (test not completed). valid values for SecurityAction Name: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>. 
     * @return ChallengeNotFinishedAction Execution action when client-side javascript is not enabled (test not completed). valid values for SecurityAction Name: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>.
     */
    public SecurityAction getChallengeNotFinishedAction() {
        return this.ChallengeNotFinishedAction;
    }

    /**
     * Set Execution action when client-side javascript is not enabled (test not completed). valid values for SecurityAction Name: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>.
     * @param ChallengeNotFinishedAction Execution action when client-side javascript is not enabled (test not completed). valid values for SecurityAction Name: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>.
     */
    public void setChallengeNotFinishedAction(SecurityAction ChallengeNotFinishedAction) {
        this.ChallengeNotFinishedAction = ChallengeNotFinishedAction;
    }

    /**
     * Get The execution action for client-side detection timeout. valid values for the Name parameter in SecurityAction: <li>Deny: block, where Stall can be configured in DenyActionParameters;</li> <li>Monitor: observe;</li> <li>Allow: respond after wait, where MinDelayTime and MaxDelayTime must be configured in AllowActionParameters.</li>. 
     * @return ChallengeTimeoutAction The execution action for client-side detection timeout. valid values for the Name parameter in SecurityAction: <li>Deny: block, where Stall can be configured in DenyActionParameters;</li> <li>Monitor: observe;</li> <li>Allow: respond after wait, where MinDelayTime and MaxDelayTime must be configured in AllowActionParameters.</li>.
     */
    public SecurityAction getChallengeTimeoutAction() {
        return this.ChallengeTimeoutAction;
    }

    /**
     * Set The execution action for client-side detection timeout. valid values for the Name parameter in SecurityAction: <li>Deny: block, where Stall can be configured in DenyActionParameters;</li> <li>Monitor: observe;</li> <li>Allow: respond after wait, where MinDelayTime and MaxDelayTime must be configured in AllowActionParameters.</li>.
     * @param ChallengeTimeoutAction The execution action for client-side detection timeout. valid values for the Name parameter in SecurityAction: <li>Deny: block, where Stall can be configured in DenyActionParameters;</li> <li>Monitor: observe;</li> <li>Allow: respond after wait, where MinDelayTime and MaxDelayTime must be configured in AllowActionParameters.</li>.
     */
    public void setChallengeTimeoutAction(SecurityAction ChallengeTimeoutAction) {
        this.ChallengeTimeoutAction = ChallengeTimeoutAction;
    }

    /**
     * Get The execution action of the Bot client. valid values for the Name parameter in SecurityAction: <li>Deny: block, where the Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observation;</li><li>Allow: respond after wait, where MinDelayTime and MaxDelayTime configurations are required in AllowActionParameters.</li>. 
     * @return BotClientAction The execution action of the Bot client. valid values for the Name parameter in SecurityAction: <li>Deny: block, where the Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observation;</li><li>Allow: respond after wait, where MinDelayTime and MaxDelayTime configurations are required in AllowActionParameters.</li>.
     */
    public SecurityAction getBotClientAction() {
        return this.BotClientAction;
    }

    /**
     * Set The execution action of the Bot client. valid values for the Name parameter in SecurityAction: <li>Deny: block, where the Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observation;</li><li>Allow: respond after wait, where MinDelayTime and MaxDelayTime configurations are required in AllowActionParameters.</li>.
     * @param BotClientAction The execution action of the Bot client. valid values for the Name parameter in SecurityAction: <li>Deny: block, where the Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observation;</li><li>Allow: respond after wait, where MinDelayTime and MaxDelayTime configurations are required in AllowActionParameters.</li>.
     */
    public void setBotClientAction(SecurityAction BotClientAction) {
        this.BotClientAction = BotClientAction;
    }

    public ClientBehaviorDetection() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientBehaviorDetection(ClientBehaviorDetection source) {
        if (source.CryptoChallengeIntensity != null) {
            this.CryptoChallengeIntensity = new String(source.CryptoChallengeIntensity);
        }
        if (source.CryptoChallengeDelayBefore != null) {
            this.CryptoChallengeDelayBefore = new String(source.CryptoChallengeDelayBefore);
        }
        if (source.MaxChallengeCountInterval != null) {
            this.MaxChallengeCountInterval = new String(source.MaxChallengeCountInterval);
        }
        if (source.MaxChallengeCountThreshold != null) {
            this.MaxChallengeCountThreshold = new Long(source.MaxChallengeCountThreshold);
        }
        if (source.ChallengeNotFinishedAction != null) {
            this.ChallengeNotFinishedAction = new SecurityAction(source.ChallengeNotFinishedAction);
        }
        if (source.ChallengeTimeoutAction != null) {
            this.ChallengeTimeoutAction = new SecurityAction(source.ChallengeTimeoutAction);
        }
        if (source.BotClientAction != null) {
            this.BotClientAction = new SecurityAction(source.BotClientAction);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CryptoChallengeIntensity", this.CryptoChallengeIntensity);
        this.setParamSimple(map, prefix + "CryptoChallengeDelayBefore", this.CryptoChallengeDelayBefore);
        this.setParamSimple(map, prefix + "MaxChallengeCountInterval", this.MaxChallengeCountInterval);
        this.setParamSimple(map, prefix + "MaxChallengeCountThreshold", this.MaxChallengeCountThreshold);
        this.setParamObj(map, prefix + "ChallengeNotFinishedAction.", this.ChallengeNotFinishedAction);
        this.setParamObj(map, prefix + "ChallengeTimeoutAction.", this.ChallengeTimeoutAction);
        this.setParamObj(map, prefix + "BotClientAction.", this.BotClientAction);

    }
}

