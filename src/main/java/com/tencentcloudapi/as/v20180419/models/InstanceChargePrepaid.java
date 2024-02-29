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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Purchased usage period of an instance in months. Value range: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Auto-renewal flag. Valid values: <li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li> <li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not auto-renew.</li> <li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify and do not auto-renew</li> Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, and the account balance is sufficient, the instance will automatically renew monthly upon its expiration date.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Purchased usage period of an instance in months. Value range: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36. 
     * @return Period Purchased usage period of an instance in months. Value range: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchased usage period of an instance in months. Value range: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     * @param Period Purchased usage period of an instance in months. Value range: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Auto-renewal flag. Valid values: <li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li> <li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not auto-renew.</li> <li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify and do not auto-renew</li> Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, and the account balance is sufficient, the instance will automatically renew monthly upon its expiration date. 
     * @return RenewFlag Auto-renewal flag. Valid values: <li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li> <li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not auto-renew.</li> <li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify and do not auto-renew</li> Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, and the account balance is sufficient, the instance will automatically renew monthly upon its expiration date.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values: <li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li> <li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not auto-renew.</li> <li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify and do not auto-renew</li> Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, and the account balance is sufficient, the instance will automatically renew monthly upon its expiration date.
     * @param RenewFlag Auto-renewal flag. Valid values: <li>NOTIFY_AND_AUTO_RENEW: Notify upon expiration and automatically renew.</li> <li>NOTIFY_AND_MANUAL_RENEW: Notify upon expiration but do not auto-renew.</li> <li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify and do not auto-renew</li> Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, and the account balance is sufficient, the instance will automatically renew monthly upon its expiration date.
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

