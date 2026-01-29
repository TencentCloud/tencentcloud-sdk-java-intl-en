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

public class ServiceSupport extends AbstractModel {

    /**
    * Product name.
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
    */
    @SerializedName("ServiceName")
    @Expose
    private String ServiceName;

    /**
    * Total number of processed assets.
    */
    @SerializedName("SupportHandledCount")
    @Expose
    private Long SupportHandledCount;

    /**
    * Total number of supported assets.
    */
    @SerializedName("SupportTotalCount")
    @Expose
    private Long SupportTotalCount;

    /**
    * Whether the product is supported: 1 for supported; 0 for unsupported.
    */
    @SerializedName("IsSupport")
    @Expose
    private Boolean IsSupport;

    /**
     * Get Product name.
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix" 
     * @return ServiceName Product name.
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
     */
    public String getServiceName() {
        return this.ServiceName;
    }

    /**
     * Set Product name.
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
     * @param ServiceName Product name.
"cfw_waf_virtual", "cwp_detect", "cwp_defense", "cwp_fix"
     */
    public void setServiceName(String ServiceName) {
        this.ServiceName = ServiceName;
    }

    /**
     * Get Total number of processed assets. 
     * @return SupportHandledCount Total number of processed assets.
     */
    public Long getSupportHandledCount() {
        return this.SupportHandledCount;
    }

    /**
     * Set Total number of processed assets.
     * @param SupportHandledCount Total number of processed assets.
     */
    public void setSupportHandledCount(Long SupportHandledCount) {
        this.SupportHandledCount = SupportHandledCount;
    }

    /**
     * Get Total number of supported assets. 
     * @return SupportTotalCount Total number of supported assets.
     */
    public Long getSupportTotalCount() {
        return this.SupportTotalCount;
    }

    /**
     * Set Total number of supported assets.
     * @param SupportTotalCount Total number of supported assets.
     */
    public void setSupportTotalCount(Long SupportTotalCount) {
        this.SupportTotalCount = SupportTotalCount;
    }

    /**
     * Get Whether the product is supported: 1 for supported; 0 for unsupported. 
     * @return IsSupport Whether the product is supported: 1 for supported; 0 for unsupported.
     */
    public Boolean getIsSupport() {
        return this.IsSupport;
    }

    /**
     * Set Whether the product is supported: 1 for supported; 0 for unsupported.
     * @param IsSupport Whether the product is supported: 1 for supported; 0 for unsupported.
     */
    public void setIsSupport(Boolean IsSupport) {
        this.IsSupport = IsSupport;
    }

    public ServiceSupport() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceSupport(ServiceSupport source) {
        if (source.ServiceName != null) {
            this.ServiceName = new String(source.ServiceName);
        }
        if (source.SupportHandledCount != null) {
            this.SupportHandledCount = new Long(source.SupportHandledCount);
        }
        if (source.SupportTotalCount != null) {
            this.SupportTotalCount = new Long(source.SupportTotalCount);
        }
        if (source.IsSupport != null) {
            this.IsSupport = new Boolean(source.IsSupport);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceName", this.ServiceName);
        this.setParamSimple(map, prefix + "SupportHandledCount", this.SupportHandledCount);
        this.setParamSimple(map, prefix + "SupportTotalCount", this.SupportTotalCount);
        this.setParamSimple(map, prefix + "IsSupport", this.IsSupport);

    }
}

