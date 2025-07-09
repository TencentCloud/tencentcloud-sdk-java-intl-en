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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RateLimitOption extends AbstractModel {

    /**
    * The number of full export threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentDumpThread")
    @Expose
    private Long CurrentDumpThread;

    /**
    * The default number of full export threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultDumpThread")
    @Expose
    private Long DefaultDumpThread;

    /**
    * The full export Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentDumpRps")
    @Expose
    private Long CurrentDumpRps;

    /**
    * The default full export Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultDumpRps")
    @Expose
    private Long DefaultDumpRps;

    /**
    * The number of full import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentLoadThread")
    @Expose
    private Long CurrentLoadThread;

    /**
    * The default number of full import threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultLoadThread")
    @Expose
    private Long DefaultLoadThread;

    /**
    * The full import Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentLoadRps")
    @Expose
    private Long CurrentLoadRps;

    /**
    * The default full import Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultLoadRps")
    @Expose
    private Long DefaultLoadRps;

    /**
    * The number of incremental import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 128.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CurrentSinkerThread")
    @Expose
    private Long CurrentSinkerThread;

    /**
    * The default number of incremental import threads. This field is only meaningful in the output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DefaultSinkerThread")
    @Expose
    private Long DefaultSinkerThread;

    /**
    * enum:"no"/"yes", no: the user has not set a speed limit; yes: a speed limit has been set. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("HasUserSetRateLimit")
    @Expose
    private String HasUserSetRateLimit;

    /**
     * Get The number of full export threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentDumpThread The number of full export threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentDumpThread() {
        return this.CurrentDumpThread;
    }

    /**
     * Set The number of full export threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentDumpThread The number of full export threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentDumpThread(Long CurrentDumpThread) {
        this.CurrentDumpThread = CurrentDumpThread;
    }

    /**
     * Get The default number of full export threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultDumpThread The default number of full export threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultDumpThread() {
        return this.DefaultDumpThread;
    }

    /**
     * Set The default number of full export threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultDumpThread The default number of full export threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultDumpThread(Long DefaultDumpThread) {
        this.DefaultDumpThread = DefaultDumpThread;
    }

    /**
     * Get The full export Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentDumpRps The full export Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentDumpRps() {
        return this.CurrentDumpRps;
    }

    /**
     * Set The full export Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentDumpRps The full export Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentDumpRps(Long CurrentDumpRps) {
        this.CurrentDumpRps = CurrentDumpRps;
    }

    /**
     * Get The default full export Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultDumpRps The default full export Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultDumpRps() {
        return this.DefaultDumpRps;
    }

    /**
     * Set The default full export Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultDumpRps The default full export Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultDumpRps(Long DefaultDumpRps) {
        this.DefaultDumpRps = DefaultDumpRps;
    }

    /**
     * Get The number of full import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentLoadThread The number of full import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentLoadThread() {
        return this.CurrentLoadThread;
    }

    /**
     * Set The number of full import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentLoadThread The number of full import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 16.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentLoadThread(Long CurrentLoadThread) {
        this.CurrentLoadThread = CurrentLoadThread;
    }

    /**
     * Get The default number of full import threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultLoadThread The default number of full import threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultLoadThread() {
        return this.DefaultLoadThread;
    }

    /**
     * Set The default number of full import threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultLoadThread The default number of full import threads. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultLoadThread(Long DefaultLoadThread) {
        this.DefaultLoadThread = DefaultLoadThread;
    }

    /**
     * Get The full import Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentLoadRps The full import Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentLoadRps() {
        return this.CurrentLoadRps;
    }

    /**
     * Set The full import Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentLoadRps The full import Rps currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 50,000,000.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentLoadRps(Long CurrentLoadRps) {
        this.CurrentLoadRps = CurrentLoadRps;
    }

    /**
     * Get The default full import Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultLoadRps The default full import Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultLoadRps() {
        return this.DefaultLoadRps;
    }

    /**
     * Set The default full import Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultLoadRps The default full import Rps. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultLoadRps(Long DefaultLoadRps) {
        this.DefaultLoadRps = DefaultLoadRps;
    }

    /**
     * Get The number of incremental import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 128.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CurrentSinkerThread The number of incremental import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 128.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCurrentSinkerThread() {
        return this.CurrentSinkerThread;
    }

    /**
     * Set The number of incremental import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 128.Note: This field may return null, indicating that no valid values can be obtained.
     * @param CurrentSinkerThread The number of incremental import threads currently in effect. The value of this field can be adjusted when configuring the task. Note: If it is not set or set to 0, it means the current value is maintained. The maximum value is 128.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCurrentSinkerThread(Long CurrentSinkerThread) {
        this.CurrentSinkerThread = CurrentSinkerThread;
    }

    /**
     * Get The default number of incremental import threads. This field is only meaningful in the output parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DefaultSinkerThread The default number of incremental import threads. This field is only meaningful in the output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDefaultSinkerThread() {
        return this.DefaultSinkerThread;
    }

    /**
     * Set The default number of incremental import threads. This field is only meaningful in the output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DefaultSinkerThread The default number of incremental import threads. This field is only meaningful in the output parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDefaultSinkerThread(Long DefaultSinkerThread) {
        this.DefaultSinkerThread = DefaultSinkerThread;
    }

    /**
     * Get enum:"no"/"yes", no: the user has not set a speed limit; yes: a speed limit has been set. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained. 
     * @return HasUserSetRateLimit enum:"no"/"yes", no: the user has not set a speed limit; yes: a speed limit has been set. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getHasUserSetRateLimit() {
        return this.HasUserSetRateLimit;
    }

    /**
     * Set enum:"no"/"yes", no: the user has not set a speed limit; yes: a speed limit has been set. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     * @param HasUserSetRateLimit enum:"no"/"yes", no: the user has not set a speed limit; yes: a speed limit has been set. This field is only meaningful in the output parameter.Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setHasUserSetRateLimit(String HasUserSetRateLimit) {
        this.HasUserSetRateLimit = HasUserSetRateLimit;
    }

    public RateLimitOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RateLimitOption(RateLimitOption source) {
        if (source.CurrentDumpThread != null) {
            this.CurrentDumpThread = new Long(source.CurrentDumpThread);
        }
        if (source.DefaultDumpThread != null) {
            this.DefaultDumpThread = new Long(source.DefaultDumpThread);
        }
        if (source.CurrentDumpRps != null) {
            this.CurrentDumpRps = new Long(source.CurrentDumpRps);
        }
        if (source.DefaultDumpRps != null) {
            this.DefaultDumpRps = new Long(source.DefaultDumpRps);
        }
        if (source.CurrentLoadThread != null) {
            this.CurrentLoadThread = new Long(source.CurrentLoadThread);
        }
        if (source.DefaultLoadThread != null) {
            this.DefaultLoadThread = new Long(source.DefaultLoadThread);
        }
        if (source.CurrentLoadRps != null) {
            this.CurrentLoadRps = new Long(source.CurrentLoadRps);
        }
        if (source.DefaultLoadRps != null) {
            this.DefaultLoadRps = new Long(source.DefaultLoadRps);
        }
        if (source.CurrentSinkerThread != null) {
            this.CurrentSinkerThread = new Long(source.CurrentSinkerThread);
        }
        if (source.DefaultSinkerThread != null) {
            this.DefaultSinkerThread = new Long(source.DefaultSinkerThread);
        }
        if (source.HasUserSetRateLimit != null) {
            this.HasUserSetRateLimit = new String(source.HasUserSetRateLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentDumpThread", this.CurrentDumpThread);
        this.setParamSimple(map, prefix + "DefaultDumpThread", this.DefaultDumpThread);
        this.setParamSimple(map, prefix + "CurrentDumpRps", this.CurrentDumpRps);
        this.setParamSimple(map, prefix + "DefaultDumpRps", this.DefaultDumpRps);
        this.setParamSimple(map, prefix + "CurrentLoadThread", this.CurrentLoadThread);
        this.setParamSimple(map, prefix + "DefaultLoadThread", this.DefaultLoadThread);
        this.setParamSimple(map, prefix + "CurrentLoadRps", this.CurrentLoadRps);
        this.setParamSimple(map, prefix + "DefaultLoadRps", this.DefaultLoadRps);
        this.setParamSimple(map, prefix + "CurrentSinkerThread", this.CurrentSinkerThread);
        this.setParamSimple(map, prefix + "DefaultSinkerThread", this.DefaultSinkerThread);
        this.setParamSimple(map, prefix + "HasUserSetRateLimit", this.HasUserSetRateLimit);

    }
}

