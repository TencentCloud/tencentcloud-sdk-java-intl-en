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

public class UpdateAuthorizationPolicyPriorityRequest extends AbstractModel {

    /**
    * tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Policy ID and priority.
    */
    @SerializedName("Priorities")
    @Expose
    private AuthorizationPolicyPriority [] Priorities;

    /**
     * Get tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console. 
     * @return InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     * @param InstanceId tencent cloud MQTT instance ID, obtained from the [DescribeInstanceList](https://www.tencentcloud.com/document/api/1778/111029?from_cn_redirect=1) api or console.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Policy ID and priority. 
     * @return Priorities Policy ID and priority.
     */
    public AuthorizationPolicyPriority [] getPriorities() {
        return this.Priorities;
    }

    /**
     * Set Policy ID and priority.
     * @param Priorities Policy ID and priority.
     */
    public void setPriorities(AuthorizationPolicyPriority [] Priorities) {
        this.Priorities = Priorities;
    }

    public UpdateAuthorizationPolicyPriorityRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateAuthorizationPolicyPriorityRequest(UpdateAuthorizationPolicyPriorityRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Priorities != null) {
            this.Priorities = new AuthorizationPolicyPriority[source.Priorities.length];
            for (int i = 0; i < source.Priorities.length; i++) {
                this.Priorities[i] = new AuthorizationPolicyPriority(source.Priorities[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Priorities.", this.Priorities);

    }
}

