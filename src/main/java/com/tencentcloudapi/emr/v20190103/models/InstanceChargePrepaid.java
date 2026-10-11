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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Yearly/monthly subscription duration. Default value: 1. Unit: month.Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, and 60.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Whether to enable auto-renewal, which defaults to no.
<li>true: yes</li>
<li>false: no</li>
    */
    @SerializedName("RenewFlag")
    @Expose
    private Boolean RenewFlag;

    /**
     * Get Yearly/monthly subscription duration. Default value: 1. Unit: month.Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, and 60. 
     * @return Period Yearly/monthly subscription duration. Default value: 1. Unit: month.Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, and 60.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Yearly/monthly subscription duration. Default value: 1. Unit: month.Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, and 60.
     * @param Period Yearly/monthly subscription duration. Default value: 1. Unit: month.Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, and 60.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Whether to enable auto-renewal, which defaults to no.
<li>true: yes</li>
<li>false: no</li> 
     * @return RenewFlag Whether to enable auto-renewal, which defaults to no.
<li>true: yes</li>
<li>false: no</li>
     */
    public Boolean getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether to enable auto-renewal, which defaults to no.
<li>true: yes</li>
<li>false: no</li>
     * @param RenewFlag Whether to enable auto-renewal, which defaults to no.
<li>true: yes</li>
<li>false: no</li>
     */
    public void setRenewFlag(Boolean RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public InstanceChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceChargePrepaid(InstanceChargePrepaid source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Boolean(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

