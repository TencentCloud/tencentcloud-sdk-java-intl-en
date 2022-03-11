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
package com.tencentcloudapi.ecm.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSecurityGroupPoliciesRequest extends AbstractModel{

    /**
    * Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/1108/47697?from_cn_redirect=1).
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
     * Get Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/1108/47697?from_cn_redirect=1). 
     * @return SecurityGroupId Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/1108/47697?from_cn_redirect=1).
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * Set Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/1108/47697?from_cn_redirect=1).
     * @param SecurityGroupId Security group instance ID, such as `esg-33ocnj9n`, which can be obtained through [DescribeSecurityGroups](https://intl.cloud.tencent.com/document/product/1108/47697?from_cn_redirect=1).
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    public DescribeSecurityGroupPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSecurityGroupPoliciesRequest(DescribeSecurityGroupPoliciesRequest source) {
        if (source.SecurityGroupId != null) {
            this.SecurityGroupId = new String(source.SecurityGroupId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);

    }
}

