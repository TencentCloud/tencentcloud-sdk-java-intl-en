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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AllocateCreditPoolRequest extends AbstractModel {

    /**
    * Second-level reseller UIN.
    */
    @SerializedName("SubAgentUin")
    @Expose
    private Long SubAgentUin;

    /**
    * Allocated amount.
    */
    @SerializedName("Credit")
    @Expose
    private Float Credit;

    /**
     * Get Second-level reseller UIN. 
     * @return SubAgentUin Second-level reseller UIN.
     */
    public Long getSubAgentUin() {
        return this.SubAgentUin;
    }

    /**
     * Set Second-level reseller UIN.
     * @param SubAgentUin Second-level reseller UIN.
     */
    public void setSubAgentUin(Long SubAgentUin) {
        this.SubAgentUin = SubAgentUin;
    }

    /**
     * Get Allocated amount. 
     * @return Credit Allocated amount.
     */
    public Float getCredit() {
        return this.Credit;
    }

    /**
     * Set Allocated amount.
     * @param Credit Allocated amount.
     */
    public void setCredit(Float Credit) {
        this.Credit = Credit;
    }

    public AllocateCreditPoolRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AllocateCreditPoolRequest(AllocateCreditPoolRequest source) {
        if (source.SubAgentUin != null) {
            this.SubAgentUin = new Long(source.SubAgentUin);
        }
        if (source.Credit != null) {
            this.Credit = new Float(source.Credit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAgentUin", this.SubAgentUin);
        this.setParamSimple(map, prefix + "Credit", this.Credit);

    }
}

