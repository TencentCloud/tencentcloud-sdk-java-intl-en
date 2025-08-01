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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteScalingPolicyRequest extends AbstractModel {

    /**
    * The Alarm policy ID to be deleted. you can obtain the Alarm policy ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeScalingPolicies](https://intl.cloud.tencent.com/document/api/377/33178?from_cn_redirect=1) and retrieving the AutoScalingPolicyId from the returned information.
    */
    @SerializedName("AutoScalingPolicyId")
    @Expose
    private String AutoScalingPolicyId;

    /**
     * Get The Alarm policy ID to be deleted. you can obtain the Alarm policy ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeScalingPolicies](https://intl.cloud.tencent.com/document/api/377/33178?from_cn_redirect=1) and retrieving the AutoScalingPolicyId from the returned information. 
     * @return AutoScalingPolicyId The Alarm policy ID to be deleted. you can obtain the Alarm policy ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeScalingPolicies](https://intl.cloud.tencent.com/document/api/377/33178?from_cn_redirect=1) and retrieving the AutoScalingPolicyId from the returned information.
     */
    public String getAutoScalingPolicyId() {
        return this.AutoScalingPolicyId;
    }

    /**
     * Set The Alarm policy ID to be deleted. you can obtain the Alarm policy ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeScalingPolicies](https://intl.cloud.tencent.com/document/api/377/33178?from_cn_redirect=1) and retrieving the AutoScalingPolicyId from the returned information.
     * @param AutoScalingPolicyId The Alarm policy ID to be deleted. you can obtain the Alarm policy ID by logging in to the console (https://console.cloud.tencent.com/autoscaling/group) or calling the api [DescribeScalingPolicies](https://intl.cloud.tencent.com/document/api/377/33178?from_cn_redirect=1) and retrieving the AutoScalingPolicyId from the returned information.
     */
    public void setAutoScalingPolicyId(String AutoScalingPolicyId) {
        this.AutoScalingPolicyId = AutoScalingPolicyId;
    }

    public DeleteScalingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteScalingPolicyRequest(DeleteScalingPolicyRequest source) {
        if (source.AutoScalingPolicyId != null) {
            this.AutoScalingPolicyId = new String(source.AutoScalingPolicyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoScalingPolicyId", this.AutoScalingPolicyId);

    }
}

