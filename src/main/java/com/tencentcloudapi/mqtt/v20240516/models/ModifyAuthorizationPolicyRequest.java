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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAuthorizationPolicyRequest extends AbstractModel {

    /**
    * Specifies the authorization policy ID, which can be obtained from the query authorization policy API (https://www.tencentcloud.comom/document/product/1778/111074?from_cn_redirect=1).
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.

    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Policy name, which cannot be empty, contains 3 to 64 characters, and supports chinese, letters, digits, "-", and "_".
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Policy version, defaults to 1. currently only support 1.
    */
    @SerializedName("PolicyVersion")
    @Expose
    private Long PolicyVersion;

    /**
    * Policy priority. a smaller value indicates a higher priority. must be unique.
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Specifies the decision.
allow. specifies the permission.
Denies.
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * Operation, supports multiple selections separated by commas. see the data plane policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Specifies the connection.
Specifies the publish action.
Sub. specifies the subscription.
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * Specifies the resource and subscription to match. supports configuration of multiple match rules, separated by commas. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).

    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * Specifies the condition-username.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Condition - message retention.
Matches message retention.
Matches non-retention messages.
3. match retained and non-retained messages.
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * Client ID. supports regular expressions.
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Condition: client IP address. supports IP or CIDR.
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Condition: specifies the service quality.
0: at most once.
Minimum once.
2: exactly once.
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * Specifies the remark information with a maximum length of 128 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Specifies the authorization policy ID, which can be obtained from the query authorization policy API (https://www.tencentcloud.comom/document/product/1778/111074?from_cn_redirect=1). 
     * @return Id Specifies the authorization policy ID, which can be obtained from the query authorization policy API (https://www.tencentcloud.comom/document/product/1778/111074?from_cn_redirect=1).
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Specifies the authorization policy ID, which can be obtained from the query authorization policy API (https://www.tencentcloud.comom/document/product/1778/111074?from_cn_redirect=1).
     * @param Id Specifies the authorization policy ID, which can be obtained from the query authorization policy API (https://www.tencentcloud.comom/document/product/1778/111074?from_cn_redirect=1).
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.
 
     * @return InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.

     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.

     * @param InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.comom/document/api/1778/111029?from_cn_redirect=1) api or console.

     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Policy name, which cannot be empty, contains 3 to 64 characters, and supports chinese, letters, digits, "-", and "_". 
     * @return PolicyName Policy name, which cannot be empty, contains 3 to 64 characters, and supports chinese, letters, digits, "-", and "_".
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Policy name, which cannot be empty, contains 3 to 64 characters, and supports chinese, letters, digits, "-", and "_".
     * @param PolicyName Policy name, which cannot be empty, contains 3 to 64 characters, and supports chinese, letters, digits, "-", and "_".
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Policy version, defaults to 1. currently only support 1. 
     * @return PolicyVersion Policy version, defaults to 1. currently only support 1.
     */
    public Long getPolicyVersion() {
        return this.PolicyVersion;
    }

    /**
     * Set Policy version, defaults to 1. currently only support 1.
     * @param PolicyVersion Policy version, defaults to 1. currently only support 1.
     */
    public void setPolicyVersion(Long PolicyVersion) {
        this.PolicyVersion = PolicyVersion;
    }

    /**
     * Get Policy priority. a smaller value indicates a higher priority. must be unique. 
     * @return Priority Policy priority. a smaller value indicates a higher priority. must be unique.
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Policy priority. a smaller value indicates a higher priority. must be unique.
     * @param Priority Policy priority. a smaller value indicates a higher priority. must be unique.
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Specifies the decision.
allow. specifies the permission.
Denies. 
     * @return Effect Specifies the decision.
allow. specifies the permission.
Denies.
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set Specifies the decision.
allow. specifies the permission.
Denies.
     * @param Effect Specifies the decision.
allow. specifies the permission.
Denies.
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get Operation, supports multiple selections separated by commas. see the data plane policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Specifies the connection.
Specifies the publish action.
Sub. specifies the subscription. 
     * @return Actions Operation, supports multiple selections separated by commas. see the data plane policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Specifies the connection.
Specifies the publish action.
Sub. specifies the subscription.
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set Operation, supports multiple selections separated by commas. see the data plane policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Specifies the connection.
Specifies the publish action.
Sub. specifies the subscription.
     * @param Actions Operation, supports multiple selections separated by commas. see the data plane policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Specifies the connection.
Specifies the publish action.
Sub. specifies the subscription.
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Specifies the resource and subscription to match. supports configuration of multiple match rules, separated by commas. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
 
     * @return Resources Specifies the resource and subscription to match. supports configuration of multiple match rules, separated by commas. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).

     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set Specifies the resource and subscription to match. supports configuration of multiple match rules, separated by commas. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).

     * @param Resources Specifies the resource and subscription to match. supports configuration of multiple match rules, separated by commas. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).

     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Specifies the condition-username. 
     * @return Username Specifies the condition-username.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Specifies the condition-username.
     * @param Username Specifies the condition-username.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Condition - message retention.
Matches message retention.
Matches non-retention messages.
3. match retained and non-retained messages. 
     * @return Retain Condition - message retention.
Matches message retention.
Matches non-retention messages.
3. match retained and non-retained messages.
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set Condition - message retention.
Matches message retention.
Matches non-retention messages.
3. match retained and non-retained messages.
     * @param Retain Condition - message retention.
Matches message retention.
Matches non-retention messages.
3. match retained and non-retained messages.
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get Client ID. supports regular expressions. 
     * @return ClientId Client ID. supports regular expressions.
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Client ID. supports regular expressions.
     * @param ClientId Client ID. supports regular expressions.
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Condition: client IP address. supports IP or CIDR. 
     * @return Ip Condition: client IP address. supports IP or CIDR.
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Condition: client IP address. supports IP or CIDR.
     * @param Ip Condition: client IP address. supports IP or CIDR.
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Condition: specifies the service quality.
0: at most once.
Minimum once.
2: exactly once. 
     * @return Qos Condition: specifies the service quality.
0: at most once.
Minimum once.
2: exactly once.
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set Condition: specifies the service quality.
0: at most once.
Minimum once.
2: exactly once.
     * @param Qos Condition: specifies the service quality.
0: at most once.
Minimum once.
2: exactly once.
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get Specifies the remark information with a maximum length of 128 characters. 
     * @return Remark Specifies the remark information with a maximum length of 128 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark information with a maximum length of 128 characters.
     * @param Remark Specifies the remark information with a maximum length of 128 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyAuthorizationPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAuthorizationPolicyRequest(ModifyAuthorizationPolicyRequest source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.PolicyVersion != null) {
            this.PolicyVersion = new Long(source.PolicyVersion);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.Effect != null) {
            this.Effect = new String(source.Effect);
        }
        if (source.Actions != null) {
            this.Actions = new String(source.Actions);
        }
        if (source.Resources != null) {
            this.Resources = new String(source.Resources);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Retain != null) {
            this.Retain = new Long(source.Retain);
        }
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "PolicyVersion", this.PolicyVersion);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

