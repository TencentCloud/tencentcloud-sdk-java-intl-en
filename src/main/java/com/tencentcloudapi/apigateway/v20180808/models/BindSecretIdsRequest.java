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

public class BindSecretIdsRequest extends AbstractModel{

    /**
    * Unique ID of the usage plan to be bound.
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * Array of IDs of the keys to be bound.
    */
    @SerializedName("AccessKeyIds")
    @Expose
    private String [] AccessKeyIds;

    /**
     * Get Unique ID of the usage plan to be bound. 
     * @return UsagePlanId Unique ID of the usage plan to be bound.
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set Unique ID of the usage plan to be bound.
     * @param UsagePlanId Unique ID of the usage plan to be bound.
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get Array of IDs of the keys to be bound. 
     * @return AccessKeyIds Array of IDs of the keys to be bound.
     */
    public String [] getAccessKeyIds() {
        return this.AccessKeyIds;
    }

    /**
     * Set Array of IDs of the keys to be bound.
     * @param AccessKeyIds Array of IDs of the keys to be bound.
     */
    public void setAccessKeyIds(String [] AccessKeyIds) {
        this.AccessKeyIds = AccessKeyIds;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamArraySimple(map, prefix + "AccessKeyIds.", this.AccessKeyIds);

    }
}

