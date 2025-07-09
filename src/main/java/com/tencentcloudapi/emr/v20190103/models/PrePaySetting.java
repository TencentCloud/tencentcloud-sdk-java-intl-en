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

public class PrePaySetting extends AbstractModel {

    /**
    * Time.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Period")
    @Expose
    private Period Period;

    /**
    * Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
     * Get Time.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Period Time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Period getPeriod() {
        return this.Period;
    }

    /**
     * Set Time.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Period Time.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPeriod(Period Period) {
        this.Period = Period;
    }

    /**
     * Get Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew. 
     * @return AutoRenewFlag Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew.
     * @param AutoRenewFlag Auto-renewal flag. 0: notify before expiration but do not auto-renew; 1: notify before expiration and auto-renew; and 2: do not notify before expiration and do not auto-renew.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    public PrePaySetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PrePaySetting(PrePaySetting source) {
        if (source.Period != null) {
            this.Period = new Period(source.Period);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Period.", this.Period);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

