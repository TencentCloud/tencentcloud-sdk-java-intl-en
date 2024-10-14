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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceChargePrepaid extends AbstractModel {

    /**
    * Subscription period (in month). Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48’, `60`.
Note: This field may return `null`, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * Auto-renewal flag. Valid values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify of expiration and automatically renew.</li><br><li>NOTIFY_AND_MANUAL_RENEW: Notify of expiration and manually renew.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify of expiration and do not automatically renew.</li><br><br>Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, an instance will be automatically renewed monthly after expiration, provided that the account balance is sufficient.
Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
     * Get Subscription period (in month). Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48’, `60`.
Note: This field may return `null`, indicating that no valid values can be obtained. 
     * @return Period Subscription period (in month). Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48’, `60`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set Subscription period (in month). Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48’, `60`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     * @param Period Subscription period (in month). Valid values: `1`, `2`, `3`, `4`, `5`, `6`, `7`, `8`, `9`, `10`, `11`, `12`, `24`, `36`, `48’, `60`.
Note: This field may return `null`, indicating that no valid values can be obtained.
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get Auto-renewal flag. Valid values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify of expiration and automatically renew.</li><br><li>NOTIFY_AND_MANUAL_RENEW: Notify of expiration and manually renew.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify of expiration and do not automatically renew.</li><br><br>Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, an instance will be automatically renewed monthly after expiration, provided that the account balance is sufficient.
Note: This field may return null, indicating that no valid value is found. 
     * @return RenewFlag Auto-renewal flag. Valid values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify of expiration and automatically renew.</li><br><li>NOTIFY_AND_MANUAL_RENEW: Notify of expiration and manually renew.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify of expiration and do not automatically renew.</li><br><br>Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, an instance will be automatically renewed monthly after expiration, provided that the account balance is sufficient.
Note: This field may return null, indicating that no valid value is found.
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Auto-renewal flag. Valid values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify of expiration and automatically renew.</li><br><li>NOTIFY_AND_MANUAL_RENEW: Notify of expiration and manually renew.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify of expiration and do not automatically renew.</li><br><br>Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, an instance will be automatically renewed monthly after expiration, provided that the account balance is sufficient.
Note: This field may return null, indicating that no valid value is found.
     * @param RenewFlag Auto-renewal flag. Valid values:<br><li>NOTIFY_AND_AUTO_RENEW: Notify of expiration and automatically renew.</li><br><li>NOTIFY_AND_MANUAL_RENEW: Notify of expiration and manually renew.</li><br><li>DISABLE_NOTIFY_AND_MANUAL_RENEW: Do not notify of expiration and do not automatically renew.</li><br><br>Default value: NOTIFY_AND_MANUAL_RENEW. If this parameter is set to NOTIFY_AND_AUTO_RENEW, an instance will be automatically renewed monthly after expiration, provided that the account balance is sufficient.
Note: This field may return null, indicating that no valid value is found.
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

