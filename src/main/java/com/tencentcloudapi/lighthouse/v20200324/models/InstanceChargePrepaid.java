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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Duration of instance purchase. measurement unit: month.
-Valid values when creating an instance: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60.
-When renewing an instance, valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * AUTO-Renewal flag. valid values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY AND AUTO-RENEW on expiration</li><br><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiration without AUTO-RENEW. users need to manually RENEW.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no AUTO-renewal AND no notification</li><br><br>default value: NOTIFY_AND_MANUAL_RENEW. if this parameter is set to NOTIFY_AND_AUTO_RENEW, the instance will automatically RENEW on a monthly basis after expiration when the account balance is sufficient.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Duration of instance purchase. measurement unit: month.
-Valid values when creating an instance: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60.
-When renewing an instance, valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36. 
     * @return Period Duration of instance purchase. measurement unit: month.
-Valid values when creating an instance: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60.
-When renewing an instance, valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Duration of instance purchase. measurement unit: month.
-Valid values when creating an instance: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60.
-When renewing an instance, valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     * @param Period Duration of instance purchase. measurement unit: month.
-Valid values when creating an instance: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36, 48, 60.
-When renewing an instance, valid values: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 24, 36.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get AUTO-Renewal flag. valid values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY AND AUTO-RENEW on expiration</li><br><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiration without AUTO-RENEW. users need to manually RENEW.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no AUTO-renewal AND no notification</li><br><br>default value: NOTIFY_AND_MANUAL_RENEW. if this parameter is set to NOTIFY_AND_AUTO_RENEW, the instance will automatically RENEW on a monthly basis after expiration when the account balance is sufficient. 
     * @return RenewFlag AUTO-Renewal flag. valid values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY AND AUTO-RENEW on expiration</li><br><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiration without AUTO-RENEW. users need to manually RENEW.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no AUTO-renewal AND no notification</li><br><br>default value: NOTIFY_AND_MANUAL_RENEW. if this parameter is set to NOTIFY_AND_AUTO_RENEW, the instance will automatically RENEW on a monthly basis after expiration when the account balance is sufficient.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set AUTO-Renewal flag. valid values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY AND AUTO-RENEW on expiration</li><br><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiration without AUTO-RENEW. users need to manually RENEW.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no AUTO-renewal AND no notification</li><br><br>default value: NOTIFY_AND_MANUAL_RENEW. if this parameter is set to NOTIFY_AND_AUTO_RENEW, the instance will automatically RENEW on a monthly basis after expiration when the account balance is sufficient.
     * @param RenewFlag AUTO-Renewal flag. valid values:<br><li>NOTIFY_AND_AUTO_RENEW: NOTIFY AND AUTO-RENEW on expiration</li><br><li>NOTIFY_AND_MANUAL_RENEW: NOTIFY expiration without AUTO-RENEW. users need to manually RENEW.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: no AUTO-renewal AND no notification</li><br><br>default value: NOTIFY_AND_MANUAL_RENEW. if this parameter is set to NOTIFY_AND_AUTO_RENEW, the instance will automatically RENEW on a monthly basis after expiration when the account balance is sufficient.
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

