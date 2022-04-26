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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScheduleSettings extends AbstractModel{

    /**
    * Execution policy:
<br><li>`ONCE`: Execute once
<br><li>`RECURRENCE`: Execute repeatedly
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * Trigger the crontab expression. This field is required if `Policy` is `RECURRENCE`. The crontab expression is parsed in UTC+8.
    */
    @SerializedName("Recurrence")
    @Expose
    private String Recurrence;

    /**
    * The next execution time of the invoker. This field is required if `Policy` is `ONCE`.
    */
    @SerializedName("InvokeTime")
    @Expose
    private String InvokeTime;

    /**
     * Get Execution policy:
<br><li>`ONCE`: Execute once
<br><li>`RECURRENCE`: Execute repeatedly 
     * @return Policy Execution policy:
<br><li>`ONCE`: Execute once
<br><li>`RECURRENCE`: Execute repeatedly
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set Execution policy:
<br><li>`ONCE`: Execute once
<br><li>`RECURRENCE`: Execute repeatedly
     * @param Policy Execution policy:
<br><li>`ONCE`: Execute once
<br><li>`RECURRENCE`: Execute repeatedly
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get Trigger the crontab expression. This field is required if `Policy` is `RECURRENCE`. The crontab expression is parsed in UTC+8. 
     * @return Recurrence Trigger the crontab expression. This field is required if `Policy` is `RECURRENCE`. The crontab expression is parsed in UTC+8.
     */
    public String getRecurrence() {
        return this.Recurrence;
    }

    /**
     * Set Trigger the crontab expression. This field is required if `Policy` is `RECURRENCE`. The crontab expression is parsed in UTC+8.
     * @param Recurrence Trigger the crontab expression. This field is required if `Policy` is `RECURRENCE`. The crontab expression is parsed in UTC+8.
     */
    public void setRecurrence(String Recurrence) {
        this.Recurrence = Recurrence;
    }

    /**
     * Get The next execution time of the invoker. This field is required if `Policy` is `ONCE`. 
     * @return InvokeTime The next execution time of the invoker. This field is required if `Policy` is `ONCE`.
     */
    public String getInvokeTime() {
        return this.InvokeTime;
    }

    /**
     * Set The next execution time of the invoker. This field is required if `Policy` is `ONCE`.
     * @param InvokeTime The next execution time of the invoker. This field is required if `Policy` is `ONCE`.
     */
    public void setInvokeTime(String InvokeTime) {
        this.InvokeTime = InvokeTime;
    }

    public ScheduleSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScheduleSettings(ScheduleSettings source) {
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Recurrence != null) {
            this.Recurrence = new String(source.Recurrence);
        }
        if (source.InvokeTime != null) {
            this.InvokeTime = new String(source.InvokeTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Recurrence", this.Recurrence);
        this.setParamSimple(map, prefix + "InvokeTime", this.InvokeTime);

    }
}

