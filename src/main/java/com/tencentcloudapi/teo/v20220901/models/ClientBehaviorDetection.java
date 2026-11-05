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
    * Proof-of-work strength. Valid values: <li>low: Low;</li><li>medium: Medium;</li><li>high: High.</li>
    */
    @SerializedName("CryptoChallengeIntensity")
    @Expose
    private String CryptoChallengeIntensity;

    /**
    * Execution mode of client behavior validation. Valid values: <li>0ms: immediately execute;</li><li>100ms: execute after a 100ms delay;</li><li>200ms: execute after a 200ms delay;</li><li>300ms: execute after a 300ms delay;</li><li>400ms: execute after a 400ms delay;</li><li>500ms: execute after a 500ms delay;</li><li>600ms: execute after a 600ms delay;</li><li>700ms: execute after a 700ms delay;</li><li>800ms: execute after an 800ms delay;</li><li>900ms: execute after a 900ms delay;</li><li>1000ms: execute after a 1000ms delay.</li>
    */
    @SerializedName("CryptoChallengeDelayBefore")
    @Expose
    private String CryptoChallengeDelayBefore;

    /**
    * Time window for trigger threshold statistics. Valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>
    */
    @SerializedName("MaxChallengeCountInterval")
    @Expose
    private String MaxChallengeCountInterval;

    /**
    * Cumulative count of trigger threshold statistics. Value range: 1-100000000.
    */
    @SerializedName("MaxChallengeCountThreshold")
    @Expose
    private Long MaxChallengeCountThreshold;

    /**
    * Execution action when client-side JavaScript is not enabled (test not completed). Supported values for SecurityAction Name: <li>Deny: block. DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
    */
    @SerializedName("ChallengeNotFinishedAction")
    @Expose
    private SecurityAction ChallengeNotFinishedAction;

    /**
    * Execution action for client-side detection timeout. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
    */
    @SerializedName("ChallengeTimeoutAction")
    @Expose
    private SecurityAction ChallengeTimeoutAction;

    /**
    * Execution action of the Bot client. Supported values of Name in SecurityAction: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>
    */
    @SerializedName("BotClientAction")
    @Expose
    private SecurityAction BotClientAction;

    /**
     * Get Proof-of-work strength. Valid values: <li>low: Low;</li><li>medium: Medium;</li><li>high: High.</li> 
     * @return CryptoChallengeIntensity Proof-of-work strength. Valid values: <li>low: Low;</li><li>medium: Medium;</li><li>high: High.</li>
     */
    public String getCryptoChallengeIntensity() {
        return this.CryptoChallengeIntensity;
    }

    /**
     * Set Proof-of-work strength. Valid values: <li>low: Low;</li><li>medium: Medium;</li><li>high: High.</li>
     * @param CryptoChallengeIntensity Proof-of-work strength. Valid values: <li>low: Low;</li><li>medium: Medium;</li><li>high: High.</li>
     */
    public void setCryptoChallengeIntensity(String CryptoChallengeIntensity) {
        this.CryptoChallengeIntensity = CryptoChallengeIntensity;
    }

    /**
     * Get Execution mode of client behavior validation. Valid values: <li>0ms: immediately execute;</li><li>100ms: execute after a 100ms delay;</li><li>200ms: execute after a 200ms delay;</li><li>300ms: execute after a 300ms delay;</li><li>400ms: execute after a 400ms delay;</li><li>500ms: execute after a 500ms delay;</li><li>600ms: execute after a 600ms delay;</li><li>700ms: execute after a 700ms delay;</li><li>800ms: execute after an 800ms delay;</li><li>900ms: execute after a 900ms delay;</li><li>1000ms: execute after a 1000ms delay.</li> 
     * @return CryptoChallengeDelayBefore Execution mode of client behavior validation. Valid values: <li>0ms: immediately execute;</li><li>100ms: execute after a 100ms delay;</li><li>200ms: execute after a 200ms delay;</li><li>300ms: execute after a 300ms delay;</li><li>400ms: execute after a 400ms delay;</li><li>500ms: execute after a 500ms delay;</li><li>600ms: execute after a 600ms delay;</li><li>700ms: execute after a 700ms delay;</li><li>800ms: execute after an 800ms delay;</li><li>900ms: execute after a 900ms delay;</li><li>1000ms: execute after a 1000ms delay.</li>
     */
    public String getCryptoChallengeDelayBefore() {
        return this.CryptoChallengeDelayBefore;
    }

    /**
     * Set Execution mode of client behavior validation. Valid values: <li>0ms: immediately execute;</li><li>100ms: execute after a 100ms delay;</li><li>200ms: execute after a 200ms delay;</li><li>300ms: execute after a 300ms delay;</li><li>400ms: execute after a 400ms delay;</li><li>500ms: execute after a 500ms delay;</li><li>600ms: execute after a 600ms delay;</li><li>700ms: execute after a 700ms delay;</li><li>800ms: execute after an 800ms delay;</li><li>900ms: execute after a 900ms delay;</li><li>1000ms: execute after a 1000ms delay.</li>
     * @param CryptoChallengeDelayBefore Execution mode of client behavior validation. Valid values: <li>0ms: immediately execute;</li><li>100ms: execute after a 100ms delay;</li><li>200ms: execute after a 200ms delay;</li><li>300ms: execute after a 300ms delay;</li><li>400ms: execute after a 400ms delay;</li><li>500ms: execute after a 500ms delay;</li><li>600ms: execute after a 600ms delay;</li><li>700ms: execute after a 700ms delay;</li><li>800ms: execute after an 800ms delay;</li><li>900ms: execute after a 900ms delay;</li><li>1000ms: execute after a 1000ms delay.</li>
     */
    public void setCryptoChallengeDelayBefore(String CryptoChallengeDelayBefore) {
        this.CryptoChallengeDelayBefore = CryptoChallengeDelayBefore;
    }

    /**
     * Get Time window for trigger threshold statistics. Valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li> 
     * @return MaxChallengeCountInterval Time window for trigger threshold statistics. Valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>
     */
    public String getMaxChallengeCountInterval() {
        return this.MaxChallengeCountInterval;
    }

    /**
     * Set Time window for trigger threshold statistics. Valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>
     * @param MaxChallengeCountInterval Time window for trigger threshold statistics. Valid values: <li>5s: within 5 seconds;</li><li>10s: within 10 seconds;</li><li>15s: within 15 seconds;</li><li>30s: within 30 seconds;</li><li>60s: within 60 seconds;</li><li>5m: within 5 minutes;</li><li>10m: within 10 minutes;</li><li>30m: within 30 minutes;</li><li>60m: within 60 minutes.</li>
     */
    public void setMaxChallengeCountInterval(String MaxChallengeCountInterval) {
        this.MaxChallengeCountInterval = MaxChallengeCountInterval;
    }

    /**
     * Get Cumulative count of trigger threshold statistics. Value range: 1-100000000. 
     * @return MaxChallengeCountThreshold Cumulative count of trigger threshold statistics. Value range: 1-100000000.
     */
    public Long getMaxChallengeCountThreshold() {
        return this.MaxChallengeCountThreshold;
    }

    /**
     * Set Cumulative count of trigger threshold statistics. Value range: 1-100000000.
     * @param MaxChallengeCountThreshold Cumulative count of trigger threshold statistics. Value range: 1-100000000.
     */
    public void setMaxChallengeCountThreshold(Long MaxChallengeCountThreshold) {
        this.MaxChallengeCountThreshold = MaxChallengeCountThreshold;
    }

    /**
     * Get Execution action when client-side JavaScript is not enabled (test not completed). Supported values for SecurityAction Name: <li>Deny: block. DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li> 
     * @return ChallengeNotFinishedAction Execution action when client-side JavaScript is not enabled (test not completed). Supported values for SecurityAction Name: <li>Deny: block. DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public SecurityAction getChallengeNotFinishedAction() {
        return this.ChallengeNotFinishedAction;
    }

    /**
     * Set Execution action when client-side JavaScript is not enabled (test not completed). Supported values for SecurityAction Name: <li>Deny: block. DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     * @param ChallengeNotFinishedAction Execution action when client-side JavaScript is not enabled (test not completed). Supported values for SecurityAction Name: <li>Deny: block. DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting. AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public void setChallengeNotFinishedAction(SecurityAction ChallengeNotFinishedAction) {
        this.ChallengeNotFinishedAction = ChallengeNotFinishedAction;
    }

    /**
     * Get Execution action for client-side detection timeout. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li> 
     * @return ChallengeTimeoutAction Execution action for client-side detection timeout. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public SecurityAction getChallengeTimeoutAction() {
        return this.ChallengeTimeoutAction;
    }

    /**
     * Set Execution action for client-side detection timeout. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     * @param ChallengeTimeoutAction Execution action for client-side detection timeout. Supported values of SecurityAction Name: <li>Deny: block, where DenyActionParameters supports Stall configuration;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where AllowActionParameters requires MinDelayTime and MaxDelayTime configuration.</li>
     */
    public void setChallengeTimeoutAction(SecurityAction ChallengeTimeoutAction) {
        this.ChallengeTimeoutAction = ChallengeTimeoutAction;
    }

    /**
     * Get Execution action of the Bot client. Supported values of Name in SecurityAction: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li> 
     * @return BotClientAction Execution action of the Bot client. Supported values of Name in SecurityAction: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>
     */
    public SecurityAction getBotClientAction() {
        return this.BotClientAction;
    }

    /**
     * Set Execution action of the Bot client. Supported values of Name in SecurityAction: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>
     * @param BotClientAction Execution action of the Bot client. Supported values of Name in SecurityAction: <li>Deny: block, where Stall configuration is supported in DenyActionParameters;</li><li>Monitor: observe;</li><li>Allow: respond after waiting, where MinDelayTime and MaxDelayTime configuration is required in AllowActionParameters.</li>
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

