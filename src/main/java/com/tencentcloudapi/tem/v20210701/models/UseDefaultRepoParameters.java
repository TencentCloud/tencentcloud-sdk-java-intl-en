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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UseDefaultRepoParameters extends AbstractModel {

    /**
    * TCR Enterprise instance name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnterpriseInstanceName")
    @Expose
    private String EnterpriseInstanceName;

    /**
    * TCR Enterprise billing mode. `0`: Pay-as-you-go 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnterpriseInstanceChargeType")
    @Expose
    private Long EnterpriseInstanceChargeType;

    /**
    * Edition of the TCR Enterprise. Values: `basic`, `standard`, `premium` (Advanced edition)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EnterpriseInstanceType")
    @Expose
    private String EnterpriseInstanceType;

    /**
     * Get TCR Enterprise instance name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnterpriseInstanceName TCR Enterprise instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnterpriseInstanceName() {
        return this.EnterpriseInstanceName;
    }

    /**
     * Set TCR Enterprise instance name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnterpriseInstanceName TCR Enterprise instance name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnterpriseInstanceName(String EnterpriseInstanceName) {
        this.EnterpriseInstanceName = EnterpriseInstanceName;
    }

    /**
     * Get TCR Enterprise billing mode. `0`: Pay-as-you-go 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnterpriseInstanceChargeType TCR Enterprise billing mode. `0`: Pay-as-you-go 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getEnterpriseInstanceChargeType() {
        return this.EnterpriseInstanceChargeType;
    }

    /**
     * Set TCR Enterprise billing mode. `0`: Pay-as-you-go 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnterpriseInstanceChargeType TCR Enterprise billing mode. `0`: Pay-as-you-go 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnterpriseInstanceChargeType(Long EnterpriseInstanceChargeType) {
        this.EnterpriseInstanceChargeType = EnterpriseInstanceChargeType;
    }

    /**
     * Get Edition of the TCR Enterprise. Values: `basic`, `standard`, `premium` (Advanced edition)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EnterpriseInstanceType Edition of the TCR Enterprise. Values: `basic`, `standard`, `premium` (Advanced edition)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getEnterpriseInstanceType() {
        return this.EnterpriseInstanceType;
    }

    /**
     * Set Edition of the TCR Enterprise. Values: `basic`, `standard`, `premium` (Advanced edition)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param EnterpriseInstanceType Edition of the TCR Enterprise. Values: `basic`, `standard`, `premium` (Advanced edition)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEnterpriseInstanceType(String EnterpriseInstanceType) {
        this.EnterpriseInstanceType = EnterpriseInstanceType;
    }

    public UseDefaultRepoParameters() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UseDefaultRepoParameters(UseDefaultRepoParameters source) {
        if (source.EnterpriseInstanceName != null) {
            this.EnterpriseInstanceName = new String(source.EnterpriseInstanceName);
        }
        if (source.EnterpriseInstanceChargeType != null) {
            this.EnterpriseInstanceChargeType = new Long(source.EnterpriseInstanceChargeType);
        }
        if (source.EnterpriseInstanceType != null) {
            this.EnterpriseInstanceType = new String(source.EnterpriseInstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnterpriseInstanceName", this.EnterpriseInstanceName);
        this.setParamSimple(map, prefix + "EnterpriseInstanceChargeType", this.EnterpriseInstanceChargeType);
        this.setParamSimple(map, prefix + "EnterpriseInstanceType", this.EnterpriseInstanceType);

    }
}

