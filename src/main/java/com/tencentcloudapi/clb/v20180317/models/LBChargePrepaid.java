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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LBChargePrepaid extends AbstractModel {

    /**
    * Renewal type. AUTO_RENEW: automatic renewal; MANUAL_RENEW: manual renewal
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * Cycle, indicating the number of months (reserved field)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
     * Get Renewal type. AUTO_RENEW: automatic renewal; MANUAL_RENEW: manual renewal
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag Renewal type. AUTO_RENEW: automatic renewal; MANUAL_RENEW: manual renewal
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal type. AUTO_RENEW: automatic renewal; MANUAL_RENEW: manual renewal
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag Renewal type. AUTO_RENEW: automatic renewal; MANUAL_RENEW: manual renewal
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Cycle, indicating the number of months (reserved field)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Period Cycle, indicating the number of months (reserved field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Cycle, indicating the number of months (reserved field)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Period Cycle, indicating the number of months (reserved field)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    public LBChargePrepaid() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LBChargePrepaid(LBChargePrepaid source) {
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "Period", this.Period);

    }
}

