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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyLLMStatusRequest extends AbstractModel {

    /**
    * <p>Switch status. true: enabled; false: disabled.</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>Domain or service ID to operate on</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>Switch type, used to specify the protection module switch to operate on. Valid values: <br>1: Master protection switch, controls the global enablement/disablement of the large model protection feature. <br>2: Compute consumption protection rule switch, controls the enablement/disablement of the compute consumption limiting feature. <br>3: Custom protection rule switch, controls the enablement/disablement of the custom content security rule feature. <br>4: ToolCall protection switch, controls the enablement/disablement of the tool call security detection feature. <br>5: Prompt attack protection switch, controls the enablement/disablement of the prompt injection/jailbreak attack detection feature. <br>6: Content compliance detection switch, controls the enablement/disablement of the input/output content compliance detection feature. <br>7: Sensitive data detection switch, controls the enablement/disablement of the sensitive information leakage detection (DLP) feature. <br>8: Skill security detection switch, controls the enablement/disablement of the Skill/Plugin call security detection feature. <br>9: Intent behavior detection switch, controls the enablement/disablement of the user intent recognition and behavior detection feature. <br>10: Malicious URL detection switch, controls the enablement/disablement of the malicious link detection feature in responses.</p>
    */
    @SerializedName("SwitchType")
    @Expose
    private Long SwitchType;

    /**
    * <p>WAF instance ID, indicating the WAF instance to which the current operation belongs. It can be obtained through the DescribeInstances API.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Switch status. true: enabled; false: disabled.</p> 
     * @return Status <p>Switch status. true: enabled; false: disabled.</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Switch status. true: enabled; false: disabled.</p>
     * @param Status <p>Switch status. true: enabled; false: disabled.</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Domain or service ID to operate on</p> 
     * @return Domain <p>Domain or service ID to operate on</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>Domain or service ID to operate on</p>
     * @param Domain <p>Domain or service ID to operate on</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>Switch type, used to specify the protection module switch to operate on. Valid values: <br>1: Master protection switch, controls the global enablement/disablement of the large model protection feature. <br>2: Compute consumption protection rule switch, controls the enablement/disablement of the compute consumption limiting feature. <br>3: Custom protection rule switch, controls the enablement/disablement of the custom content security rule feature. <br>4: ToolCall protection switch, controls the enablement/disablement of the tool call security detection feature. <br>5: Prompt attack protection switch, controls the enablement/disablement of the prompt injection/jailbreak attack detection feature. <br>6: Content compliance detection switch, controls the enablement/disablement of the input/output content compliance detection feature. <br>7: Sensitive data detection switch, controls the enablement/disablement of the sensitive information leakage detection (DLP) feature. <br>8: Skill security detection switch, controls the enablement/disablement of the Skill/Plugin call security detection feature. <br>9: Intent behavior detection switch, controls the enablement/disablement of the user intent recognition and behavior detection feature. <br>10: Malicious URL detection switch, controls the enablement/disablement of the malicious link detection feature in responses.</p> 
     * @return SwitchType <p>Switch type, used to specify the protection module switch to operate on. Valid values: <br>1: Master protection switch, controls the global enablement/disablement of the large model protection feature. <br>2: Compute consumption protection rule switch, controls the enablement/disablement of the compute consumption limiting feature. <br>3: Custom protection rule switch, controls the enablement/disablement of the custom content security rule feature. <br>4: ToolCall protection switch, controls the enablement/disablement of the tool call security detection feature. <br>5: Prompt attack protection switch, controls the enablement/disablement of the prompt injection/jailbreak attack detection feature. <br>6: Content compliance detection switch, controls the enablement/disablement of the input/output content compliance detection feature. <br>7: Sensitive data detection switch, controls the enablement/disablement of the sensitive information leakage detection (DLP) feature. <br>8: Skill security detection switch, controls the enablement/disablement of the Skill/Plugin call security detection feature. <br>9: Intent behavior detection switch, controls the enablement/disablement of the user intent recognition and behavior detection feature. <br>10: Malicious URL detection switch, controls the enablement/disablement of the malicious link detection feature in responses.</p>
     */
    public Long getSwitchType() {
        return this.SwitchType;
    }

    /**
     * Set <p>Switch type, used to specify the protection module switch to operate on. Valid values: <br>1: Master protection switch, controls the global enablement/disablement of the large model protection feature. <br>2: Compute consumption protection rule switch, controls the enablement/disablement of the compute consumption limiting feature. <br>3: Custom protection rule switch, controls the enablement/disablement of the custom content security rule feature. <br>4: ToolCall protection switch, controls the enablement/disablement of the tool call security detection feature. <br>5: Prompt attack protection switch, controls the enablement/disablement of the prompt injection/jailbreak attack detection feature. <br>6: Content compliance detection switch, controls the enablement/disablement of the input/output content compliance detection feature. <br>7: Sensitive data detection switch, controls the enablement/disablement of the sensitive information leakage detection (DLP) feature. <br>8: Skill security detection switch, controls the enablement/disablement of the Skill/Plugin call security detection feature. <br>9: Intent behavior detection switch, controls the enablement/disablement of the user intent recognition and behavior detection feature. <br>10: Malicious URL detection switch, controls the enablement/disablement of the malicious link detection feature in responses.</p>
     * @param SwitchType <p>Switch type, used to specify the protection module switch to operate on. Valid values: <br>1: Master protection switch, controls the global enablement/disablement of the large model protection feature. <br>2: Compute consumption protection rule switch, controls the enablement/disablement of the compute consumption limiting feature. <br>3: Custom protection rule switch, controls the enablement/disablement of the custom content security rule feature. <br>4: ToolCall protection switch, controls the enablement/disablement of the tool call security detection feature. <br>5: Prompt attack protection switch, controls the enablement/disablement of the prompt injection/jailbreak attack detection feature. <br>6: Content compliance detection switch, controls the enablement/disablement of the input/output content compliance detection feature. <br>7: Sensitive data detection switch, controls the enablement/disablement of the sensitive information leakage detection (DLP) feature. <br>8: Skill security detection switch, controls the enablement/disablement of the Skill/Plugin call security detection feature. <br>9: Intent behavior detection switch, controls the enablement/disablement of the user intent recognition and behavior detection feature. <br>10: Malicious URL detection switch, controls the enablement/disablement of the malicious link detection feature in responses.</p>
     */
    public void setSwitchType(Long SwitchType) {
        this.SwitchType = SwitchType;
    }

    /**
     * Get <p>WAF instance ID, indicating the WAF instance to which the current operation belongs. It can be obtained through the DescribeInstances API.</p> 
     * @return InstanceId <p>WAF instance ID, indicating the WAF instance to which the current operation belongs. It can be obtained through the DescribeInstances API.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>WAF instance ID, indicating the WAF instance to which the current operation belongs. It can be obtained through the DescribeInstances API.</p>
     * @param InstanceId <p>WAF instance ID, indicating the WAF instance to which the current operation belongs. It can be obtained through the DescribeInstances API.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public ModifyLLMStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLLMStatusRequest(ModifyLLMStatusRequest source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SwitchType != null) {
            this.SwitchType = new Long(source.SwitchType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SwitchType", this.SwitchType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

