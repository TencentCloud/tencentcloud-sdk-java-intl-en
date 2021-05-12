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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnBindSecretIdsRequest extends AbstractModel{

    /**
    * Unique ID of the usage plan to be unbound.
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * Array of IDs of the keys to be unbound.
    */
    @SerializedName("AccessKeyIds")
    @Expose
    private String [] AccessKeyIds;

    /**
     * Get Unique ID of the usage plan to be unbound. 
     * @return UsagePlanId Unique ID of the usage plan to be unbound.
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set Unique ID of the usage plan to be unbound.
     * @param UsagePlanId Unique ID of the usage plan to be unbound.
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get Array of IDs of the keys to be unbound. 
     * @return AccessKeyIds Array of IDs of the keys to be unbound.
     */
    public String [] getAccessKeyIds() {
        return this.AccessKeyIds;
    }

    /**
     * Set Array of IDs of the keys to be unbound.
     * @param AccessKeyIds Array of IDs of the keys to be unbound.
     */
    public void setAccessKeyIds(String [] AccessKeyIds) {
        this.AccessKeyIds = AccessKeyIds;
    }

    public UnBindSecretIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnBindSecretIdsRequest(UnBindSecretIdsRequest source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.AccessKeyIds != null) {
            this.AccessKeyIds = new String[source.AccessKeyIds.length];
            for (int i = 0; i < source.AccessKeyIds.length; i++) {
                this.AccessKeyIds[i] = new String(source.AccessKeyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamArraySimple(map, prefix + "AccessKeyIds.", this.AccessKeyIds);

    }
}

