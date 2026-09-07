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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Purchase duration. unit: month.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * NOTIFY_AND_MANUAL_RENEW: notifies that the account is about to expire but does not automatically renew the account.
NOTIFY_AND_AUTO_RENEW: specifies expiration notification and auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.
Defaults to notify expiration without auto-renew.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Purchase duration. unit: month.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Period Purchase duration. unit: month.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Purchase duration. unit: month.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Period Purchase duration. unit: month.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get NOTIFY_AND_MANUAL_RENEW: notifies that the account is about to expire but does not automatically renew the account.
NOTIFY_AND_AUTO_RENEW: specifies expiration notification and auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.
Defaults to notify expiration without auto-renew.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RenewFlag NOTIFY_AND_MANUAL_RENEW: notifies that the account is about to expire but does not automatically renew the account.
NOTIFY_AND_AUTO_RENEW: specifies expiration notification and auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.
Defaults to notify expiration without auto-renew.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set NOTIFY_AND_MANUAL_RENEW: notifies that the account is about to expire but does not automatically renew the account.
NOTIFY_AND_AUTO_RENEW: specifies expiration notification and auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.
Defaults to notify expiration without auto-renew.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RenewFlag NOTIFY_AND_MANUAL_RENEW: notifies that the account is about to expire but does not automatically renew the account.
NOTIFY_AND_AUTO_RENEW: specifies expiration notification and auto-renewal.
DISABLE_NOTIFY_AND_MANUAL_RENEW: no notification is sent upon expiration, and the instance is not renewed automatically.
Defaults to notify expiration without auto-renew.
Note: This field may return null, indicating that no valid values can be obtained.
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

