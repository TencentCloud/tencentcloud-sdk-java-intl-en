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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Policys extends AbstractModel {

    /**
    * Collection of policies
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("PolicySet")
    @Expose
    private Policy [] PolicySet;

    /**
    * Total policies
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get Collection of policies
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return PolicySet Collection of policies
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Policy [] getPolicySet() {
        return this.PolicySet;
    }

    /**
     * Set Collection of policies
Note: This field may return null, indicating that no valid values can be obtained.
     * @param PolicySet Collection of policies
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPolicySet(Policy [] PolicySet) {
        this.PolicySet = PolicySet;
    }

    /**
     * Get Total policies
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total policies
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total policies
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total policies
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public Policys() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Policys(Policys source) {
        if (source.PolicySet != null) {
            this.PolicySet = new Policy[source.PolicySet.length];
            for (int i = 0; i < source.PolicySet.length; i++) {
                this.PolicySet[i] = new Policy(source.PolicySet[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "PolicySet.", this.PolicySet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

