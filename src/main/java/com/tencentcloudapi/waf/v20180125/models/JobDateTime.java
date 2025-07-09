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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobDateTime extends AbstractModel {

    /**
    * Time parameters for scheduled execution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Timed")
    @Expose
    private TimedJob [] Timed;

    /**
    * Time parameters for periodic execution
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Cron")
    @Expose
    private CronJob [] Cron;

    /**
    * Time zone
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TimeTZone")
    @Expose
    private String TimeTZone;

    /**
     * Get Time parameters for scheduled execution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Timed Time parameters for scheduled execution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TimedJob [] getTimed() {
        return this.Timed;
    }

    /**
     * Set Time parameters for scheduled execution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Timed Time parameters for scheduled execution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimed(TimedJob [] Timed) {
        this.Timed = Timed;
    }

    /**
     * Get Time parameters for periodic execution
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Cron Time parameters for periodic execution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CronJob [] getCron() {
        return this.Cron;
    }

    /**
     * Set Time parameters for periodic execution
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Cron Time parameters for periodic execution
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCron(CronJob [] Cron) {
        this.Cron = Cron;
    }

    /**
     * Get Time zone
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TimeTZone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTimeTZone() {
        return this.TimeTZone;
    }

    /**
     * Set Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TimeTZone Time zone
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTimeTZone(String TimeTZone) {
        this.TimeTZone = TimeTZone;
    }

    public JobDateTime() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public JobDateTime(JobDateTime source) {
        if (source.Timed != null) {
            this.Timed = new TimedJob[source.Timed.length];
            for (int i = 0; i < source.Timed.length; i++) {
                this.Timed[i] = new TimedJob(source.Timed[i]);
            }
        }
        if (source.Cron != null) {
            this.Cron = new CronJob[source.Cron.length];
            for (int i = 0; i < source.Cron.length; i++) {
                this.Cron[i] = new CronJob(source.Cron[i]);
            }
        }
        if (source.TimeTZone != null) {
            this.TimeTZone = new String(source.TimeTZone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Timed.", this.Timed);
        this.setParamArrayObj(map, prefix + "Cron.", this.Cron);
        this.setParamSimple(map, prefix + "TimeTZone", this.TimeTZone);

    }
}

