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

public class ModifyUsagePlanRequest extends AbstractModel {

    /**
    * Unique usage plan ID.
    */
    @SerializedName("UsagePlanId")
    @Expose
    private String UsagePlanId;

    /**
    * Custom usage plan name after modification.
    */
    @SerializedName("UsagePlanName")
    @Expose
    private String UsagePlanName;

    /**
    * Custom usage plan description after modification.
    */
    @SerializedName("UsagePlanDesc")
    @Expose
    private String UsagePlanDesc;

    /**
    * Total number of requests allowed. Valid values: -1, [1,99999999]. The default value is `-1`, which indicates no limit.
    */
    @SerializedName("MaxRequestNum")
    @Expose
    private Long MaxRequestNum;

    /**
    * Limit of requests per second. Valid values: -1, [1,2000]. The default value is `-1`, which indicates no limit.
    */
    @SerializedName("MaxRequestNumPreSec")
    @Expose
    private Long MaxRequestNumPreSec;

    /**
     * Get Unique usage plan ID. 
     * @return UsagePlanId Unique usage plan ID.
     */
    public String getUsagePlanId() {
        return this.UsagePlanId;
    }

    /**
     * Set Unique usage plan ID.
     * @param UsagePlanId Unique usage plan ID.
     */
    public void setUsagePlanId(String UsagePlanId) {
        this.UsagePlanId = UsagePlanId;
    }

    /**
     * Get Custom usage plan name after modification. 
     * @return UsagePlanName Custom usage plan name after modification.
     */
    public String getUsagePlanName() {
        return this.UsagePlanName;
    }

    /**
     * Set Custom usage plan name after modification.
     * @param UsagePlanName Custom usage plan name after modification.
     */
    public void setUsagePlanName(String UsagePlanName) {
        this.UsagePlanName = UsagePlanName;
    }

    /**
     * Get Custom usage plan description after modification. 
     * @return UsagePlanDesc Custom usage plan description after modification.
     */
    public String getUsagePlanDesc() {
        return this.UsagePlanDesc;
    }

    /**
     * Set Custom usage plan description after modification.
     * @param UsagePlanDesc Custom usage plan description after modification.
     */
    public void setUsagePlanDesc(String UsagePlanDesc) {
        this.UsagePlanDesc = UsagePlanDesc;
    }

    /**
     * Get Total number of requests allowed. Valid values: -1, [1,99999999]. The default value is `-1`, which indicates no limit. 
     * @return MaxRequestNum Total number of requests allowed. Valid values: -1, [1,99999999]. The default value is `-1`, which indicates no limit.
     */
    public Long getMaxRequestNum() {
        return this.MaxRequestNum;
    }

    /**
     * Set Total number of requests allowed. Valid values: -1, [1,99999999]. The default value is `-1`, which indicates no limit.
     * @param MaxRequestNum Total number of requests allowed. Valid values: -1, [1,99999999]. The default value is `-1`, which indicates no limit.
     */
    public void setMaxRequestNum(Long MaxRequestNum) {
        this.MaxRequestNum = MaxRequestNum;
    }

    /**
     * Get Limit of requests per second. Valid values: -1, [1,2000]. The default value is `-1`, which indicates no limit. 
     * @return MaxRequestNumPreSec Limit of requests per second. Valid values: -1, [1,2000]. The default value is `-1`, which indicates no limit.
     */
    public Long getMaxRequestNumPreSec() {
        return this.MaxRequestNumPreSec;
    }

    /**
     * Set Limit of requests per second. Valid values: -1, [1,2000]. The default value is `-1`, which indicates no limit.
     * @param MaxRequestNumPreSec Limit of requests per second. Valid values: -1, [1,2000]. The default value is `-1`, which indicates no limit.
     */
    public void setMaxRequestNumPreSec(Long MaxRequestNumPreSec) {
        this.MaxRequestNumPreSec = MaxRequestNumPreSec;
    }

    public ModifyUsagePlanRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyUsagePlanRequest(ModifyUsagePlanRequest source) {
        if (source.UsagePlanId != null) {
            this.UsagePlanId = new String(source.UsagePlanId);
        }
        if (source.UsagePlanName != null) {
            this.UsagePlanName = new String(source.UsagePlanName);
        }
        if (source.UsagePlanDesc != null) {
            this.UsagePlanDesc = new String(source.UsagePlanDesc);
        }
        if (source.MaxRequestNum != null) {
            this.MaxRequestNum = new Long(source.MaxRequestNum);
        }
        if (source.MaxRequestNumPreSec != null) {
            this.MaxRequestNumPreSec = new Long(source.MaxRequestNumPreSec);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UsagePlanId", this.UsagePlanId);
        this.setParamSimple(map, prefix + "UsagePlanName", this.UsagePlanName);
        this.setParamSimple(map, prefix + "UsagePlanDesc", this.UsagePlanDesc);
        this.setParamSimple(map, prefix + "MaxRequestNum", this.MaxRequestNum);
        this.setParamSimple(map, prefix + "MaxRequestNumPreSec", this.MaxRequestNumPreSec);

    }
}

