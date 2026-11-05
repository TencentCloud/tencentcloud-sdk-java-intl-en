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

public class ClientAttestationRule extends AbstractModel {

    /**
    * <p>ID of the client authentication rule.<br>Different rule configuration operations are supported by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the ClientAttestationRule list in the BotManagement parameter will be deleted.</li></p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>Name of the client authentication rule.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Whether the rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * <p>Priority of rules. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.</p>
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * <p>The specific content of the rule must comply with the expression syntax. For detailed specifications, see the product document.</p>
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * <p>Client authentication option ID.</p>
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
    * <p>Handling method when client authentication fails. SecurityAction.Name values are as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge, ManagedChallenge, InterstitialChallenge, and InlineChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
    */
    @SerializedName("InvalidAttestationAction")
    @Expose
    private SecurityAction InvalidAttestationAction;

    /**
    * <p>Client device configuration. If the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter: keep the existing client device configuration without modification.</p>
    */
    @SerializedName("DeviceProfiles")
    @Expose
    private DeviceProfile [] DeviceProfiles;

    /**
    * <p>Account protection configuration.</p>
    */
    @SerializedName("AccountProtectionSettings")
    @Expose
    private AccountProtectionSettings AccountProtectionSettings;

    /**
     * Get <p>ID of the client authentication rule.<br>Different rule configuration operations are supported by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the ClientAttestationRule list in the BotManagement parameter will be deleted.</li></p> 
     * @return Id <p>ID of the client authentication rule.<br>Different rule configuration operations are supported by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the ClientAttestationRule list in the BotManagement parameter will be deleted.</li></p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>ID of the client authentication rule.<br>Different rule configuration operations are supported by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the ClientAttestationRule list in the BotManagement parameter will be deleted.</li></p>
     * @param Id <p>ID of the client authentication rule.<br>Different rule configuration operations are supported by rule ID:<br> <li> <b>Add</b> a new rule: leave ID empty or do not specify the ID parameter;</li><li> <b>Modify</b> an existing rule: specify the rule ID to be updated/modified;</li><li> <b>Delete</b> an existing rule: existing rules not included in the ClientAttestationRule list in the BotManagement parameter will be deleted.</li></p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>Name of the client authentication rule.</p> 
     * @return Name <p>Name of the client authentication rule.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Name of the client authentication rule.</p>
     * @param Name <p>Name of the client authentication rule.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Whether the rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p> 
     * @return Enabled <p>Whether the rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>Whether the rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
     * @param Enabled <p>Whether the rule is enabled. Valid values: <li>on: enabled;</li><li>off: disabled.</li></p>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>Priority of rules. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.</p> 
     * @return Priority <p>Priority of rules. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.</p>
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set <p>Priority of rules. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.</p>
     * @param Priority <p>Priority of rules. A smaller value indicates higher priority. Value range: 0-100. Default value: 0.</p>
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get <p>The specific content of the rule must comply with the expression syntax. For detailed specifications, see the product document.</p> 
     * @return Condition <p>The specific content of the rule must comply with the expression syntax. For detailed specifications, see the product document.</p>
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set <p>The specific content of the rule must comply with the expression syntax. For detailed specifications, see the product document.</p>
     * @param Condition <p>The specific content of the rule must comply with the expression syntax. For detailed specifications, see the product document.</p>
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get <p>Client authentication option ID.</p> 
     * @return AttesterId <p>Client authentication option ID.</p>
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set <p>Client authentication option ID.</p>
     * @param AttesterId <p>Client authentication option ID.</p>
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    /**
     * Get <p>Handling method when client authentication fails. SecurityAction.Name values are as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge, ManagedChallenge, InterstitialChallenge, and InlineChallenge;</li><li>Redirect: redirect to a URL.</li></ul> 
     * @return InvalidAttestationAction <p>Handling method when client authentication fails. SecurityAction.Name values are as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge, ManagedChallenge, InterstitialChallenge, and InlineChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     */
    public SecurityAction getInvalidAttestationAction() {
        return this.InvalidAttestationAction;
    }

    /**
     * Set <p>Handling method when client authentication fails. SecurityAction.Name values are as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge, ManagedChallenge, InterstitialChallenge, and InlineChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     * @param InvalidAttestationAction <p>Handling method when client authentication fails. SecurityAction.Name values are as follows:</p><ul><li>Allow: allow, where AllowActionParameters supports MinDelayTime and MaxDelayTime configuration;</li><li>Deny: block, where DenyActionParameters supports BlockIp, ReturnCustomPage, and Stall configuration;</li><li>Monitor: observe;</li><li>Challenge: challenge, where ChallengeActionParameters.ChallengeOption supports JSChallenge, ManagedChallenge, InterstitialChallenge, and InlineChallenge;</li><li>Redirect: redirect to a URL.</li></ul>
     */
    public void setInvalidAttestationAction(SecurityAction InvalidAttestationAction) {
        this.InvalidAttestationAction = InvalidAttestationAction;
    }

    /**
     * Get <p>Client device configuration. If the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter: keep the existing client device configuration without modification.</p> 
     * @return DeviceProfiles <p>Client device configuration. If the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter: keep the existing client device configuration without modification.</p>
     */
    public DeviceProfile [] getDeviceProfiles() {
        return this.DeviceProfiles;
    }

    /**
     * Set <p>Client device configuration. If the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter: keep the existing client device configuration without modification.</p>
     * @param DeviceProfiles <p>Client device configuration. If the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter: keep the existing client device configuration without modification.</p>
     */
    public void setDeviceProfiles(DeviceProfile [] DeviceProfiles) {
        this.DeviceProfiles = DeviceProfiles;
    }

    /**
     * Get <p>Account protection configuration.</p> 
     * @return AccountProtectionSettings <p>Account protection configuration.</p>
     */
    public AccountProtectionSettings getAccountProtectionSettings() {
        return this.AccountProtectionSettings;
    }

    /**
     * Set <p>Account protection configuration.</p>
     * @param AccountProtectionSettings <p>Account protection configuration.</p>
     */
    public void setAccountProtectionSettings(AccountProtectionSettings AccountProtectionSettings) {
        this.AccountProtectionSettings = AccountProtectionSettings;
    }

    public ClientAttestationRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClientAttestationRule(ClientAttestationRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.AttesterId != null) {
            this.AttesterId = new String(source.AttesterId);
        }
        if (source.InvalidAttestationAction != null) {
            this.InvalidAttestationAction = new SecurityAction(source.InvalidAttestationAction);
        }
        if (source.DeviceProfiles != null) {
            this.DeviceProfiles = new DeviceProfile[source.DeviceProfiles.length];
            for (int i = 0; i < source.DeviceProfiles.length; i++) {
                this.DeviceProfiles[i] = new DeviceProfile(source.DeviceProfiles[i]);
            }
        }
        if (source.AccountProtectionSettings != null) {
            this.AccountProtectionSettings = new AccountProtectionSettings(source.AccountProtectionSettings);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "AttesterId", this.AttesterId);
        this.setParamObj(map, prefix + "InvalidAttestationAction.", this.InvalidAttestationAction);
        this.setParamArrayObj(map, prefix + "DeviceProfiles.", this.DeviceProfiles);
        this.setParamObj(map, prefix + "AccountProtectionSettings.", this.AccountProtectionSettings);

    }
}

