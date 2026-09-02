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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttackRule extends AbstractModel {

    /**
    * <p>Time range of the brute force cracking event (unit: second)</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * <p>Number of failed blasting incidents</p>
    */
    @SerializedName("LoginFailTimes")
    @Expose
    private Long LoginFailTimes;

    /**
     * Get <p>Time range of the brute force cracking event (unit: second)</p> 
     * @return TimeRange <p>Time range of the brute force cracking event (unit: second)</p>
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>Time range of the brute force cracking event (unit: second)</p>
     * @param TimeRange <p>Time range of the brute force cracking event (unit: second)</p>
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>Number of failed blasting incidents</p> 
     * @return LoginFailTimes <p>Number of failed blasting incidents</p>
     */
    public Long getLoginFailTimes() {
        return this.LoginFailTimes;
    }

    /**
     * Set <p>Number of failed blasting incidents</p>
     * @param LoginFailTimes <p>Number of failed blasting incidents</p>
     */
    public void setLoginFailTimes(Long LoginFailTimes) {
        this.LoginFailTimes = LoginFailTimes;
    }

    public BruteAttackRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttackRule(BruteAttackRule source) {
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.LoginFailTimes != null) {
            this.LoginFailTimes = new Long(source.LoginFailTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "LoginFailTimes", this.LoginFailTimes);

    }
}

