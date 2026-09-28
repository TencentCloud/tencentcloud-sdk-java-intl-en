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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QuotaInfo extends AbstractModel {

    /**
    * Current remaining available amount. Calculation method: Limit - Used. A valid value is returned only when the request parameter DisplayFields includes available. If not requested, it is not returned or is empty.
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
    * Quota upper limit. Different quota types have different units. It usually represents the number of resources. For timeout-related quotas, it represents seconds.
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * Quota type, corresponding to the values in the request parameter QuotaTypes. For the meaning of each quota type, see the QuotaTypes parameter description.
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * Resource ID.
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * Currently used amount. A valid value is returned only when the request parameter DisplayFields includes used. If not requested, it is not returned or is empty.
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get Current remaining available amount. Calculation method: Limit - Used. A valid value is returned only when the request parameter DisplayFields includes available. If not requested, it is not returned or is empty. 
     * @return Available Current remaining available amount. Calculation method: Limit - Used. A valid value is returned only when the request parameter DisplayFields includes available. If not requested, it is not returned or is empty.
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set Current remaining available amount. Calculation method: Limit - Used. A valid value is returned only when the request parameter DisplayFields includes available. If not requested, it is not returned or is empty.
     * @param Available Current remaining available amount. Calculation method: Limit - Used. A valid value is returned only when the request parameter DisplayFields includes available. If not requested, it is not returned or is empty.
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
    }

    /**
     * Get Quota upper limit. Different quota types have different units. It usually represents the number of resources. For timeout-related quotas, it represents seconds. 
     * @return Limit Quota upper limit. Different quota types have different units. It usually represents the number of resources. For timeout-related quotas, it represents seconds.
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set Quota upper limit. Different quota types have different units. It usually represents the number of resources. For timeout-related quotas, it represents seconds.
     * @param Limit Quota upper limit. Different quota types have different units. It usually represents the number of resources. For timeout-related quotas, it represents seconds.
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get Quota type, corresponding to the values in the request parameter QuotaTypes. For the meaning of each quota type, see the QuotaTypes parameter description. 
     * @return QuotaType Quota type, corresponding to the values in the request parameter QuotaTypes. For the meaning of each quota type, see the QuotaTypes parameter description.
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set Quota type, corresponding to the values in the request parameter QuotaTypes. For the meaning of each quota type, see the QuotaTypes parameter description.
     * @param QuotaType Quota type, corresponding to the values in the request parameter QuotaTypes. For the meaning of each quota type, see the QuotaTypes parameter description.
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get Resource ID. 
     * @return ResourceId Resource ID.
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Resource ID.
     * @param ResourceId Resource ID.
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get Currently used amount. A valid value is returned only when the request parameter DisplayFields includes used. If not requested, it is not returned or is empty. 
     * @return Used Currently used amount. A valid value is returned only when the request parameter DisplayFields includes used. If not requested, it is not returned or is empty.
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set Currently used amount. A valid value is returned only when the request parameter DisplayFields includes used. If not requested, it is not returned or is empty.
     * @param Used Currently used amount. A valid value is returned only when the request parameter DisplayFields includes used. If not requested, it is not returned or is empty.
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public QuotaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QuotaInfo(QuotaInfo source) {
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Available", this.Available);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

