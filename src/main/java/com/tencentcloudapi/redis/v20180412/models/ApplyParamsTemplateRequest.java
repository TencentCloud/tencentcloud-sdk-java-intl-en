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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyParamsTemplateRequest extends AbstractModel {

    /**
    * Instance ID list. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy the instance ID in the instance list.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * ID of the applied parameter template.
- The parameter template ID can be obtained through the response parameter **TemplateId** of the API [DescribeParamTemplateInfo](https://www.tencentcloud.comom/document/product/239/58748?from_cn_redirect=1).
- The operation can only be successfully performed when the parameter template version matches the architecture version of the target instance. A version mismatch will trigger an execution error.
    */
    @SerializedName("TemplateId")
    @Expose
    private String TemplateId;

    /**
     * Get Instance ID list. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy the instance ID in the instance list. 
     * @return InstanceIds Instance ID list. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy the instance ID in the instance list.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Instance ID list. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy the instance ID in the instance list.
     * @param InstanceIds Instance ID list. Log in to the [Redis console](https://console.tencentcloud.com/redis/instance) and copy the instance ID in the instance list.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get ID of the applied parameter template.
- The parameter template ID can be obtained through the response parameter **TemplateId** of the API [DescribeParamTemplateInfo](https://www.tencentcloud.comom/document/product/239/58748?from_cn_redirect=1).
- The operation can only be successfully performed when the parameter template version matches the architecture version of the target instance. A version mismatch will trigger an execution error. 
     * @return TemplateId ID of the applied parameter template.
- The parameter template ID can be obtained through the response parameter **TemplateId** of the API [DescribeParamTemplateInfo](https://www.tencentcloud.comom/document/product/239/58748?from_cn_redirect=1).
- The operation can only be successfully performed when the parameter template version matches the architecture version of the target instance. A version mismatch will trigger an execution error.
     */
    public String getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set ID of the applied parameter template.
- The parameter template ID can be obtained through the response parameter **TemplateId** of the API [DescribeParamTemplateInfo](https://www.tencentcloud.comom/document/product/239/58748?from_cn_redirect=1).
- The operation can only be successfully performed when the parameter template version matches the architecture version of the target instance. A version mismatch will trigger an execution error.
     * @param TemplateId ID of the applied parameter template.
- The parameter template ID can be obtained through the response parameter **TemplateId** of the API [DescribeParamTemplateInfo](https://www.tencentcloud.comom/document/product/239/58748?from_cn_redirect=1).
- The operation can only be successfully performed when the parameter template version matches the architecture version of the target instance. A version mismatch will trigger an execution error.
     */
    public void setTemplateId(String TemplateId) {
        this.TemplateId = TemplateId;
    }

    public ApplyParamsTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyParamsTemplateRequest(ApplyParamsTemplateRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.TemplateId != null) {
            this.TemplateId = new String(source.TemplateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);

    }
}

