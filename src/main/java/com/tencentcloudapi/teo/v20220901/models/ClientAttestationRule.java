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
    * Client authentication rule ID. supported rule configuration operations by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing rules not included in the ClientAttestationRule list under BotManagement parameters will be deleted.</li>.
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * Specifies the name of the client authentication rule.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Whether the rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * Priority of rules. a smaller value indicates higher priority execution. value range: 0-100. default value: 0.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * The rule content must comply with expression grammar. for details, see the product document.
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Specifies the client authentication option ID.
    */
    @SerializedName("AttesterId")
    @Expose
    private String AttesterId;

    /**
    * Client device configuration. if the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter, keep the existing client device configuration and do not modify it.
    */
    @SerializedName("DeviceProfiles")
    @Expose
    private DeviceProfile [] DeviceProfiles;

    /**
    * Handling method for failed client authentication. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
    */
    @SerializedName("InvalidAttestationAction")
    @Expose
    private SecurityAction InvalidAttestationAction;

    /**
     * Get Client authentication rule ID. supported rule configuration operations by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing rules not included in the ClientAttestationRule list under BotManagement parameters will be deleted.</li>. 
     * @return Id Client authentication rule ID. supported rule configuration operations by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing rules not included in the ClientAttestationRule list under BotManagement parameters will be deleted.</li>.
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Client authentication rule ID. supported rule configuration operations by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing rules not included in the ClientAttestationRule list under BotManagement parameters will be deleted.</li>.
     * @param Id Client authentication rule ID. supported rule configuration operations by rule ID: <li> <b>add</b> a new rule: leave the ID empty or do not specify the ID parameter.</li> <li> <b>modify</b> an existing rule: specify the rule ID that needs to be updated/modified.</li> <li> <b>delete</b> an existing rule: existing rules not included in the ClientAttestationRule list under BotManagement parameters will be deleted.</li>.
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get Specifies the name of the client authentication rule. 
     * @return Name Specifies the name of the client authentication rule.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Specifies the name of the client authentication rule.
     * @param Name Specifies the name of the client authentication rule.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Whether the rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>. 
     * @return Enabled Whether the rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set Whether the rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
     * @param Enabled Whether the rule is enabled. valid values: <li>`on`: enable</li> <li>`off`: disable</li>.
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get Priority of rules. a smaller value indicates higher priority execution. value range: 0-100. default value: 0. 
     * @return Priority Priority of rules. a smaller value indicates higher priority execution. value range: 0-100. default value: 0.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Priority of rules. a smaller value indicates higher priority execution. value range: 0-100. default value: 0.
     * @param Priority Priority of rules. a smaller value indicates higher priority execution. value range: 0-100. default value: 0.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get The rule content must comply with expression grammar. for details, see the product document. 
     * @return Condition The rule content must comply with expression grammar. for details, see the product document.
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set The rule content must comply with expression grammar. for details, see the product document.
     * @param Condition The rule content must comply with expression grammar. for details, see the product document.
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get Specifies the client authentication option ID. 
     * @return AttesterId Specifies the client authentication option ID.
     */
    public String getAttesterId() {
        return this.AttesterId;
    }

    /**
     * Set Specifies the client authentication option ID.
     * @param AttesterId Specifies the client authentication option ID.
     */
    public void setAttesterId(String AttesterId) {
        this.AttesterId = AttesterId;
    }

    /**
     * Get Client device configuration. if the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter, keep the existing client device configuration and do not modify it. 
     * @return DeviceProfiles Client device configuration. if the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter, keep the existing client device configuration and do not modify it.
     */
    public DeviceProfile [] getDeviceProfiles() {
        return this.DeviceProfiles;
    }

    /**
     * Set Client device configuration. if the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter, keep the existing client device configuration and do not modify it.
     * @param DeviceProfiles Client device configuration. if the DeviceProfiles parameter value is not specified in the ClientAttestationRules parameter, keep the existing client device configuration and do not modify it.
     */
    public void setDeviceProfiles(DeviceProfile [] DeviceProfiles) {
        this.DeviceProfiles = DeviceProfiles;
    }

    /**
     * Get Handling method for failed client authentication. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor. 
     * @return InvalidAttestationAction Handling method for failed client authentication. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
     */
    public SecurityAction getInvalidAttestationAction() {
        return this.InvalidAttestationAction;
    }

    /**
     * Set Handling method for failed client authentication. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
     * @param InvalidAttestationAction Handling method for failed client authentication. valid values for SecurityAction Name: <li>Deny: block;</li> <li>Monitor: observation;</li> <li>Redirect: redirection;</li> <li>Challenge: Challenge.</li> default value: Monitor.
     */
    public void setInvalidAttestationAction(SecurityAction InvalidAttestationAction) {
        this.InvalidAttestationAction = InvalidAttestationAction;
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
        if (source.DeviceProfiles != null) {
            this.DeviceProfiles = new DeviceProfile[source.DeviceProfiles.length];
            for (int i = 0; i < source.DeviceProfiles.length; i++) {
                this.DeviceProfiles[i] = new DeviceProfile(source.DeviceProfiles[i]);
            }
        }
        if (source.InvalidAttestationAction != null) {
            this.InvalidAttestationAction = new SecurityAction(source.InvalidAttestationAction);
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
        this.setParamArrayObj(map, prefix + "DeviceProfiles.", this.DeviceProfiles);
        this.setParamObj(map, prefix + "InvalidAttestationAction.", this.InvalidAttestationAction);

    }
}

