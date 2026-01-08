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

public class AuthorizationPolicyItem extends AbstractModel {

    /**
    * Policy rule ID.
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * MQTT cluster ID.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Specifies the policy rule name.
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Rule syntax version. currently only support 1. defaults to 1.
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

    /**
    * Policy priority. a smaller priority ID indicates the policy takes effect with higher priority. see [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * Specifies the decision.
allow specifies permission for access requests from devices that match this policy.
deny: denies access requests to the device that override the policy.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Effect")
    @Expose
    private String Effect;

    /**
    * Operation.
Specifies the connection.
Publishes an mqtt message.
Sub. specifies the subscription to mqtt messages.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Actions")
    @Expose
    private String Actions;

    /**
    * Resource. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Resources")
    @Expose
    private String Resources;

    /**
    * Specifies the device ID for connection. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("ClientId")
    @Expose
    private String ClientId;

    /**
    * Condition - username. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Specifies the client IP address. see the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * Condition - service quality. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
    */
    @SerializedName("Qos")
    @Expose
    private String Qos;

    /**
    * Condition - message retention. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Indicates the match of retain messages.
2: indicates non-retain messages.
3: indicates matching retain and non-retain messages.
    */
    @SerializedName("Retain")
    @Expose
    private Long Retain;

    /**
    * Specifies the remark with length not exceeding 128 characters.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Creation time. millisecond-level timestamp.
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * Update time. millisecond-level timestamp.
    */
    @SerializedName("UpdateTime")
    @Expose
    private Long UpdateTime;

    /**
     * Get Policy rule ID. 
     * @return Id Policy rule ID.
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Policy rule ID.
     * @param Id Policy rule ID.
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get MQTT cluster ID. 
     * @return InstanceId MQTT cluster ID.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set MQTT cluster ID.
     * @param InstanceId MQTT cluster ID.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Specifies the policy rule name. 
     * @return PolicyName Specifies the policy rule name.
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Specifies the policy rule name.
     * @param PolicyName Specifies the policy rule name.
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Rule syntax version. currently only support 1. defaults to 1. 
     * @return Version Rule syntax version. currently only support 1. defaults to 1.
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set Rule syntax version. currently only support 1. defaults to 1.
     * @param Version Rule syntax version. currently only support 1. defaults to 1.
     */
    public void setVersion(Long Version) {
        this.Version = Version;
    }

    /**
     * Get Policy priority. a smaller priority ID indicates the policy takes effect with higher priority. see [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Priority Policy priority. a smaller priority ID indicates the policy takes effect with higher priority. see [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set Policy priority. a smaller priority ID indicates the policy takes effect with higher priority. see [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Priority Policy priority. a smaller priority ID indicates the policy takes effect with higher priority. see [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get Specifies the decision.
allow specifies permission for access requests from devices that match this policy.
deny: denies access requests to the device that override the policy.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Effect Specifies the decision.
allow specifies permission for access requests from devices that match this policy.
deny: denies access requests to the device that override the policy.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getEffect() {
        return this.Effect;
    }

    /**
     * Set Specifies the decision.
allow specifies permission for access requests from devices that match this policy.
deny: denies access requests to the device that override the policy.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Effect Specifies the decision.
allow specifies permission for access requests from devices that match this policy.
deny: denies access requests to the device that override the policy.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setEffect(String Effect) {
        this.Effect = Effect;
    }

    /**
     * Get Operation.
Specifies the connection.
Publishes an mqtt message.
Sub. specifies the subscription to mqtt messages.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Actions Operation.
Specifies the connection.
Publishes an mqtt message.
Sub. specifies the subscription to mqtt messages.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getActions() {
        return this.Actions;
    }

    /**
     * Set Operation.
Specifies the connection.
Publishes an mqtt message.
Sub. specifies the subscription to mqtt messages.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Actions Operation.
Specifies the connection.
Publishes an mqtt message.
Sub. specifies the subscription to mqtt messages.
Refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setActions(String Actions) {
        this.Actions = Actions;
    }

    /**
     * Get Resource. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Resources Resource. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getResources() {
        return this.Resources;
    }

    /**
     * Set Resource. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Resources Resource. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setResources(String Resources) {
        this.Resources = Resources;
    }

    /**
     * Get Specifies the device ID for connection. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return ClientId Specifies the device ID for connection. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getClientId() {
        return this.ClientId;
    }

    /**
     * Set Specifies the device ID for connection. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param ClientId Specifies the device ID for connection. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setClientId(String ClientId) {
        this.ClientId = ClientId;
    }

    /**
     * Get Condition - username. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Username Condition - username. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Condition - username. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Username Condition - username. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Specifies the client IP address. see the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Ip Specifies the client IP address. see the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set Specifies the client IP address. see the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Ip Specifies the client IP address. see the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get Condition - service quality. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1). 
     * @return Qos Condition - service quality. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public String getQos() {
        return this.Qos;
    }

    /**
     * Set Condition - service quality. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     * @param Qos Condition - service quality. see the data plane authorization policy description (https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
     */
    public void setQos(String Qos) {
        this.Qos = Qos;
    }

    /**
     * Get Condition - message retention. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Indicates the match of retain messages.
2: indicates non-retain messages.
3: indicates matching retain and non-retain messages. 
     * @return Retain Condition - message retention. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Indicates the match of retain messages.
2: indicates non-retain messages.
3: indicates matching retain and non-retain messages.
     */
    public Long getRetain() {
        return this.Retain;
    }

    /**
     * Set Condition - message retention. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Indicates the match of retain messages.
2: indicates non-retain messages.
3: indicates matching retain and non-retain messages.
     * @param Retain Condition - message retention. refer to the [data plane authorization policy description](https://www.tencentcloud.comom/document/product/1778/109715?from_cn_redirect=1).
Indicates the match of retain messages.
2: indicates non-retain messages.
3: indicates matching retain and non-retain messages.
     */
    public void setRetain(Long Retain) {
        this.Retain = Retain;
    }

    /**
     * Get Specifies the remark with length not exceeding 128 characters. 
     * @return Remark Specifies the remark with length not exceeding 128 characters.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Specifies the remark with length not exceeding 128 characters.
     * @param Remark Specifies the remark with length not exceeding 128 characters.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Creation time. millisecond-level timestamp. 
     * @return CreatedTime Creation time. millisecond-level timestamp.
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. millisecond-level timestamp.
     * @param CreatedTime Creation time. millisecond-level timestamp.
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Update time. millisecond-level timestamp. 
     * @return UpdateTime Update time. millisecond-level timestamp.
     */
    public Long getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set Update time. millisecond-level timestamp.
     * @param UpdateTime Update time. millisecond-level timestamp.
     */
    public void setUpdateTime(Long UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public AuthorizationPolicyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuthorizationPolicyItem(AuthorizationPolicyItem source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
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
        if (source.ClientId != null) {
            this.ClientId = new String(source.ClientId);
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Qos != null) {
            this.Qos = new String(source.Qos);
        }
        if (source.Retain != null) {
            this.Retain = new Long(source.Retain);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new Long(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Effect", this.Effect);
        this.setParamSimple(map, prefix + "Actions", this.Actions);
        this.setParamSimple(map, prefix + "Resources", this.Resources);
        this.setParamSimple(map, prefix + "ClientId", this.ClientId);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Qos", this.Qos);
        this.setParamSimple(map, prefix + "Retain", this.Retain);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

