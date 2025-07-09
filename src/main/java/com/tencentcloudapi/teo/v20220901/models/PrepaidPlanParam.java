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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PrepaidPlanParam extends AbstractModel {

    /**
    * Prepaid plan duration, unit: month. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.

If this field is not specified, the default value '1' will be used.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * The auto-renewal flag for prepaid plan has the following values:
<li> on: Enable auto-renewal;</li>
<li> off: Disable auto-renewal. </li>
If this field is not specified, the default value 'off' will be used. When auto-renewal is enabled, it defaults to renewing for one month.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Prepaid plan duration, unit: month. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.

If this field is not specified, the default value '1' will be used. 
     * @return Period Prepaid plan duration, unit: month. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.

If this field is not specified, the default value '1' will be used.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Prepaid plan duration, unit: month. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.

If this field is not specified, the default value '1' will be used.
     * @param Period Prepaid plan duration, unit: month. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.

If this field is not specified, the default value '1' will be used.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get The auto-renewal flag for prepaid plan has the following values:
<li> on: Enable auto-renewal;</li>
<li> off: Disable auto-renewal. </li>
If this field is not specified, the default value 'off' will be used. When auto-renewal is enabled, it defaults to renewing for one month. 
     * @return RenewFlag The auto-renewal flag for prepaid plan has the following values:
<li> on: Enable auto-renewal;</li>
<li> off: Disable auto-renewal. </li>
If this field is not specified, the default value 'off' will be used. When auto-renewal is enabled, it defaults to renewing for one month.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set The auto-renewal flag for prepaid plan has the following values:
<li> on: Enable auto-renewal;</li>
<li> off: Disable auto-renewal. </li>
If this field is not specified, the default value 'off' will be used. When auto-renewal is enabled, it defaults to renewing for one month.
     * @param RenewFlag The auto-renewal flag for prepaid plan has the following values:
<li> on: Enable auto-renewal;</li>
<li> off: Disable auto-renewal. </li>
If this field is not specified, the default value 'off' will be used. When auto-renewal is enabled, it defaults to renewing for one month.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public PrepaidPlanParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrepaidPlanParam(PrepaidPlanParam source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
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

