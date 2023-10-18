/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAlarmPolicyResponse extends AbstractModel {

    /**
    * Alarm policy ID
    */
    @SerializedName("PolicyId")
    @Expose
    private String PolicyId;

    /**
    * Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
    */
    @SerializedName("OriginId")
    @Expose
    private String OriginId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Alarm policy ID 
     * @return PolicyId Alarm policy ID
     */
    public String getPolicyId() {
        return this.PolicyId;
    }

    /**
     * Set Alarm policy ID
     * @param PolicyId Alarm policy ID
     */
    public void setPolicyId(String PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * Get Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy 
     * @return OriginId Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
     */
    public String getOriginId() {
        return this.OriginId;
    }

    /**
     * Set Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
     * @param OriginId Alarm policy ID, which can be used when you call APIs ([BindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40421?from_cn_redirect=1), [UnBindingAllPolicyObject](https://intl.cloud.tencent.com/document/product/248/40568?from_cn_redirect=1), [UnBindingPolicyObject](https://intl.cloud.tencent.com/document/product/248/40567?from_cn_redirect=1)) to bind/unbind instances or instance groups to/from an alarm policy
     */
    public void setOriginId(String OriginId) {
        this.OriginId = OriginId;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateAlarmPolicyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAlarmPolicyResponse(CreateAlarmPolicyResponse source) {
        if (source.PolicyId != null) {
            this.PolicyId = new String(source.PolicyId);
        }
        if (source.OriginId != null) {
            this.OriginId = new String(source.OriginId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "OriginId", this.OriginId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

