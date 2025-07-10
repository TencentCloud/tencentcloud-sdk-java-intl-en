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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Instance purchase duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Default value: 1.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Automatic renewal flag. Valid values:
 - NOTIFY_AND_AUTO_RENEW: A notification is sent upon expiration, and the instance is renewed automatically. If the account balance is sufficient, the instance will be renewed automatically on a monthly basis after expiration.
 - NOTIFY_AND_MANUAL_RENEW: A notification is sent upon expiration, but the instance is not renewed automatically. Default value: NOTIFY_AND_MANUAL_RENEW.
 - DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification is sent upon expiration, and the instance is not renewed automatically.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Instance purchase duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Default value: 1. 
     * @return Period Instance purchase duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Default value: 1.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Instance purchase duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Default value: 1.
     * @param Period Instance purchase duration. Unit: months. Valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, and 36. Default value: 1.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Automatic renewal flag. Valid values:
 - NOTIFY_AND_AUTO_RENEW: A notification is sent upon expiration, and the instance is renewed automatically. If the account balance is sufficient, the instance will be renewed automatically on a monthly basis after expiration.
 - NOTIFY_AND_MANUAL_RENEW: A notification is sent upon expiration, but the instance is not renewed automatically. Default value: NOTIFY_AND_MANUAL_RENEW.
 - DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification is sent upon expiration, and the instance is not renewed automatically. 
     * @return RenewFlag Automatic renewal flag. Valid values:
 - NOTIFY_AND_AUTO_RENEW: A notification is sent upon expiration, and the instance is renewed automatically. If the account balance is sufficient, the instance will be renewed automatically on a monthly basis after expiration.
 - NOTIFY_AND_MANUAL_RENEW: A notification is sent upon expiration, but the instance is not renewed automatically. Default value: NOTIFY_AND_MANUAL_RENEW.
 - DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification is sent upon expiration, and the instance is not renewed automatically.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Automatic renewal flag. Valid values:
 - NOTIFY_AND_AUTO_RENEW: A notification is sent upon expiration, and the instance is renewed automatically. If the account balance is sufficient, the instance will be renewed automatically on a monthly basis after expiration.
 - NOTIFY_AND_MANUAL_RENEW: A notification is sent upon expiration, but the instance is not renewed automatically. Default value: NOTIFY_AND_MANUAL_RENEW.
 - DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification is sent upon expiration, and the instance is not renewed automatically.
     * @param RenewFlag Automatic renewal flag. Valid values:
 - NOTIFY_AND_AUTO_RENEW: A notification is sent upon expiration, and the instance is renewed automatically. If the account balance is sufficient, the instance will be renewed automatically on a monthly basis after expiration.
 - NOTIFY_AND_MANUAL_RENEW: A notification is sent upon expiration, but the instance is not renewed automatically. Default value: NOTIFY_AND_MANUAL_RENEW.
 - DISABLE_NOTIFY_AND_MANUAL_RENEW: No notification is sent upon expiration, and the instance is not renewed automatically.
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

