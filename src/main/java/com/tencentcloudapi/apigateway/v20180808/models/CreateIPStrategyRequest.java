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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIPStrategyRequest extends AbstractModel {

    /**
    * Unique service ID.
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * Custom policy name.
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
    */
    @SerializedName("StrategyType")
    @Expose
    private String StrategyType;

    /**
    * Policy details. Multiple IPs are separated with \n.
    */
    @SerializedName("StrategyData")
    @Expose
    private String StrategyData;

    /**
     * Get Unique service ID. 
     * @return ServiceId Unique service ID.
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set Unique service ID.
     * @param ServiceId Unique service ID.
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get Custom policy name. 
     * @return StrategyName Custom policy name.
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set Custom policy name.
     * @param StrategyName Custom policy name.
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get Policy type. Valid values: WHITE (allowlist), BLACK (blocklist). 
     * @return StrategyType Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
     */
    public String getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
     * @param StrategyType Policy type. Valid values: WHITE (allowlist), BLACK (blocklist).
     */
    public void setStrategyType(String StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get Policy details. Multiple IPs are separated with \n. 
     * @return StrategyData Policy details. Multiple IPs are separated with \n.
     */
    public String getStrategyData() {
        return this.StrategyData;
    }

    /**
     * Set Policy details. Multiple IPs are separated with \n.
     * @param StrategyData Policy details. Multiple IPs are separated with \n.
     */
    public void setStrategyData(String StrategyData) {
        this.StrategyData = StrategyData;
    }

    public CreateIPStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIPStrategyRequest(CreateIPStrategyRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new String(source.StrategyType);
        }
        if (source.StrategyData != null) {
            this.StrategyData = new String(source.StrategyData);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "StrategyData", this.StrategyData);

    }
}

