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
package com.tencentcloudapi.tke.v20220501.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Billing cycle of the pay-as-you-go mode (unit: month):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Renewal method of the prepayment mode:
- NOTIFY_AND_AUTO_RENEW: Notify the user of expiration and auto-renew (default)
- NOTIFY_AND_MANUAL_RENEW: Notify the user of expiration but do not auto-renew
- DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify the user of expiration and do not auto-renew

    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Billing cycle of the pay-as-you-go mode (unit: month):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60 
     * @return Period Billing cycle of the pay-as-you-go mode (unit: month):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Billing cycle of the pay-as-you-go mode (unit: month):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60
     * @param Period Billing cycle of the pay-as-you-go mode (unit: month):
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Renewal method of the prepayment mode:
- NOTIFY_AND_AUTO_RENEW: Notify the user of expiration and auto-renew (default)
- NOTIFY_AND_MANUAL_RENEW: Notify the user of expiration but do not auto-renew
- DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify the user of expiration and do not auto-renew
 
     * @return RenewFlag Renewal method of the prepayment mode:
- NOTIFY_AND_AUTO_RENEW: Notify the user of expiration and auto-renew (default)
- NOTIFY_AND_MANUAL_RENEW: Notify the user of expiration but do not auto-renew
- DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify the user of expiration and do not auto-renew

     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Renewal method of the prepayment mode:
- NOTIFY_AND_AUTO_RENEW: Notify the user of expiration and auto-renew (default)
- NOTIFY_AND_MANUAL_RENEW: Notify the user of expiration but do not auto-renew
- DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify the user of expiration and do not auto-renew

     * @param RenewFlag Renewal method of the prepayment mode:
- NOTIFY_AND_AUTO_RENEW: Notify the user of expiration and auto-renew (default)
- NOTIFY_AND_MANUAL_RENEW: Notify the user of expiration but do not auto-renew
- DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify the user of expiration and do not auto-renew

     */
    public void setRenewFlag(String RenewFlag) {
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

