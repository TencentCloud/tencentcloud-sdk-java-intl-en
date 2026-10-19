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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCosPolicyRequest extends AbstractModel {

    /**
    * Collection of policies to delete
    */
    @SerializedName("PolicyIdSet")
    @Expose
    private Long [] PolicyIdSet;

    /**
    * Delete all or not
    */
    @SerializedName("IsDeleteAll")
    @Expose
    private Long IsDeleteAll;

    /**
     * Get Collection of policies to delete 
     * @return PolicyIdSet Collection of policies to delete
     */
    public Long [] getPolicyIdSet() {
        return this.PolicyIdSet;
    }

    /**
     * Set Collection of policies to delete
     * @param PolicyIdSet Collection of policies to delete
     */
    public void setPolicyIdSet(Long [] PolicyIdSet) {
        this.PolicyIdSet = PolicyIdSet;
    }

    /**
     * Get Delete all or not 
     * @return IsDeleteAll Delete all or not
     */
    public Long getIsDeleteAll() {
        return this.IsDeleteAll;
    }

    /**
     * Set Delete all or not
     * @param IsDeleteAll Delete all or not
     */
    public void setIsDeleteAll(Long IsDeleteAll) {
        this.IsDeleteAll = IsDeleteAll;
    }

    public DeleteCosPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteCosPolicyRequest(DeleteCosPolicyRequest source) {
        if (source.PolicyIdSet != null) {
            this.PolicyIdSet = new Long[source.PolicyIdSet.length];
            for (int i = 0; i < source.PolicyIdSet.length; i++) {
                this.PolicyIdSet[i] = new Long(source.PolicyIdSet[i]);
            }
        }
        if (source.IsDeleteAll != null) {
            this.IsDeleteAll = new Long(source.IsDeleteAll);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyIdSet.", this.PolicyIdSet);
        this.setParamSimple(map, prefix + "IsDeleteAll", this.IsDeleteAll);

    }
}

