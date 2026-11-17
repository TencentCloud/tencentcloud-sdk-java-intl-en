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
    * Currently effective number of threads for full export. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
    */
    @SerializedName("CurrentDumpThread")
    @Expose
    private Long CurrentDumpThread;

    /**
    * The default number of threads for full export. This field is only meaningful in the output parameters.
    */
    @SerializedName("DefaultDumpThread")
    @Expose
    private Long DefaultDumpThread;

    /**
    * The currently effective Rps for full export. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.
    */
    @SerializedName("CurrentDumpRps")
    @Expose
    private Long CurrentDumpRps;

    /**
    * The default Rps for full export. This field is only meaningful in the output parameters.
    */
    @SerializedName("DefaultDumpRps")
    @Expose
    private Long DefaultDumpRps;

    /**
    * Currently effective number of threads for full import. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
    */
    @SerializedName("CurrentLoadThread")
    @Expose
    private Long CurrentLoadThread;

    /**
    * The default number of threads for full import. This field is only meaningful in the output parameters.
    */
    @SerializedName("DefaultLoadThread")
    @Expose
    private Long DefaultLoadThread;

    /**
    * The currently effective Rps for full import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.	
    */
    @SerializedName("CurrentLoadRps")
    @Expose
    private Long CurrentLoadRps;

    /**
    * Default full import Rps. This field is only meaningful in the output parameter.	
    */
    @SerializedName("DefaultLoadRps")
    @Expose
    private Long DefaultLoadRps;

    /**
    * The currently effective number of threads for incremental import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 128.
    */
    @SerializedName("CurrentSinkerThread")
    @Expose
    private Long CurrentSinkerThread;

    /**
    * The default number of threads for incremental import. This field is only meaningful in the output parameters.
    */
    @SerializedName("DefaultSinkerThread")
    @Expose
    private Long DefaultSinkerThread;

    /**
    * enum: "no"/"yes". no indicates that the user has not set a speed limit, while yes indicates that a speed limit has been set. This field is only meaningful in the output parameters.
    */
    @SerializedName("HasUserSetRateLimit")
    @Expose
    private String HasUserSetRateLimit;

    /**
    * Default full export BPS, currently supported only for MongoDB links.
    */
    @SerializedName("DefaultDumpBps")
    @Expose
    private Long DefaultDumpBps;

    /**
    * Incremental import RPS, currently supported only for MongoDB links.
    */
    @SerializedName("CurrentSinkerRps")
    @Expose
    private Long CurrentSinkerRps;

    /**
    * Default incremental import RPS, currently supported only for MongoDB links.
    */
    @SerializedName("DefaultSinkerRps")
    @Expose
    private Long DefaultSinkerRps;

    /**
    * Current import BPS. Currently, it is only used for Redis.
    */
    @SerializedName("CurrentLoadBps")
    @Expose
    private Long CurrentLoadBps;

    /**
    * Number of shards in the target database. Currently, only used for Redis.
    */
    @SerializedName("CurrentDstShardCount")
    @Expose
    private Long CurrentDstShardCount;

    /**
    * Full export BPS, currently supported only for MongoDB links.
    */
    @SerializedName("CurrentDumpBps")
    @Expose
    private Long CurrentDumpBps;

    /**
    * Incremental import BPS, currently supported only for MongoDB links.
    */
    @SerializedName("CurrentSinkerBps")
    @Expose
    private Long CurrentSinkerBps;

    /**
    * Default incremental import BPS, currently supported only for MongoDB links.
    */
    @SerializedName("DefaultSinkerBps")
    @Expose
    private Long DefaultSinkerBps;

    /**
     * Get Currently effective number of threads for full export. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16. 
     * @return CurrentDumpThread Currently effective number of threads for full export. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
     */
    public Long getCurrentDumpThread() {
        return this.CurrentDumpThread;
    }

    /**
     * Set Currently effective number of threads for full export. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
     * @param CurrentDumpThread Currently effective number of threads for full export. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
     */
    public void setCurrentDumpThread(Long CurrentDumpThread) {
        this.CurrentDumpThread = CurrentDumpThread;
    }

    /**
     * Get The default number of threads for full export. This field is only meaningful in the output parameters. 
     * @return DefaultDumpThread The default number of threads for full export. This field is only meaningful in the output parameters.
     */
    public Long getDefaultDumpThread() {
        return this.DefaultDumpThread;
    }

    /**
     * Set The default number of threads for full export. This field is only meaningful in the output parameters.
     * @param DefaultDumpThread The default number of threads for full export. This field is only meaningful in the output parameters.
     */
    public void setDefaultDumpThread(Long DefaultDumpThread) {
        this.DefaultDumpThread = DefaultDumpThread;
    }

    /**
     * Get The currently effective Rps for full export. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000. 
     * @return CurrentDumpRps The currently effective Rps for full export. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.
     */
    public Long getCurrentDumpRps() {
        return this.CurrentDumpRps;
    }

    /**
     * Set The currently effective Rps for full export. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.
     * @param CurrentDumpRps The currently effective Rps for full export. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.
     */
    public void setCurrentDumpRps(Long CurrentDumpRps) {
        this.CurrentDumpRps = CurrentDumpRps;
    }

    /**
     * Get The default Rps for full export. This field is only meaningful in the output parameters. 
     * @return DefaultDumpRps The default Rps for full export. This field is only meaningful in the output parameters.
     */
    public Long getDefaultDumpRps() {
        return this.DefaultDumpRps;
    }

    /**
     * Set The default Rps for full export. This field is only meaningful in the output parameters.
     * @param DefaultDumpRps The default Rps for full export. This field is only meaningful in the output parameters.
     */
    public void setDefaultDumpRps(Long DefaultDumpRps) {
        this.DefaultDumpRps = DefaultDumpRps;
    }

    /**
     * Get Currently effective number of threads for full import. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16. 
     * @return CurrentLoadThread Currently effective number of threads for full import. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
     */
    public Long getCurrentLoadThread() {
        return this.CurrentLoadThread;
    }

    /**
     * Set Currently effective number of threads for full import. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
     * @param CurrentLoadThread Currently effective number of threads for full import. You can adjust this field value when the task is configured. Note: If it is not set or set to 0, the current value is kept. The maximum value is 16.
     */
    public void setCurrentLoadThread(Long CurrentLoadThread) {
        this.CurrentLoadThread = CurrentLoadThread;
    }

    /**
     * Get The default number of threads for full import. This field is only meaningful in the output parameters. 
     * @return DefaultLoadThread The default number of threads for full import. This field is only meaningful in the output parameters.
     */
    public Long getDefaultLoadThread() {
        return this.DefaultLoadThread;
    }

    /**
     * Set The default number of threads for full import. This field is only meaningful in the output parameters.
     * @param DefaultLoadThread The default number of threads for full import. This field is only meaningful in the output parameters.
     */
    public void setDefaultLoadThread(Long DefaultLoadThread) {
        this.DefaultLoadThread = DefaultLoadThread;
    }

    /**
     * Get The currently effective Rps for full import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.	 
     * @return CurrentLoadRps The currently effective Rps for full import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.	
     */
    public Long getCurrentLoadRps() {
        return this.CurrentLoadRps;
    }

    /**
     * Set The currently effective Rps for full import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.	
     * @param CurrentLoadRps The currently effective Rps for full import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 50000000.	
     */
    public void setCurrentLoadRps(Long CurrentLoadRps) {
        this.CurrentLoadRps = CurrentLoadRps;
    }

    /**
     * Get Default full import Rps. This field is only meaningful in the output parameter.	 
     * @return DefaultLoadRps Default full import Rps. This field is only meaningful in the output parameter.	
     */
    public Long getDefaultLoadRps() {
        return this.DefaultLoadRps;
    }

    /**
     * Set Default full import Rps. This field is only meaningful in the output parameter.	
     * @param DefaultLoadRps Default full import Rps. This field is only meaningful in the output parameter.	
     */
    public void setDefaultLoadRps(Long DefaultLoadRps) {
        this.DefaultLoadRps = DefaultLoadRps;
    }

    /**
     * Get The currently effective number of threads for incremental import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 128. 
     * @return CurrentSinkerThread The currently effective number of threads for incremental import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 128.
     */
    public Long getCurrentSinkerThread() {
        return this.CurrentSinkerThread;
    }

    /**
     * Set The currently effective number of threads for incremental import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 128.
     * @param CurrentSinkerThread The currently effective number of threads for incremental import. You can adjust this field value when configuring the task. Note: If not set or set to 0, it indicates to keep the current value. The maximum value is 128.
     */
    public void setCurrentSinkerThread(Long CurrentSinkerThread) {
        this.CurrentSinkerThread = CurrentSinkerThread;
    }

    /**
     * Get The default number of threads for incremental import. This field is only meaningful in the output parameters. 
     * @return DefaultSinkerThread The default number of threads for incremental import. This field is only meaningful in the output parameters.
     */
    public Long getDefaultSinkerThread() {
        return this.DefaultSinkerThread;
    }

    /**
     * Set The default number of threads for incremental import. This field is only meaningful in the output parameters.
     * @param DefaultSinkerThread The default number of threads for incremental import. This field is only meaningful in the output parameters.
     */
    public void setDefaultSinkerThread(Long DefaultSinkerThread) {
        this.DefaultSinkerThread = DefaultSinkerThread;
    }

    /**
     * Get enum: "no"/"yes". no indicates that the user has not set a speed limit, while yes indicates that a speed limit has been set. This field is only meaningful in the output parameters. 
     * @return HasUserSetRateLimit enum: "no"/"yes". no indicates that the user has not set a speed limit, while yes indicates that a speed limit has been set. This field is only meaningful in the output parameters.
     */
    public String getHasUserSetRateLimit() {
        return this.HasUserSetRateLimit;
    }

    /**
     * Set enum: "no"/"yes". no indicates that the user has not set a speed limit, while yes indicates that a speed limit has been set. This field is only meaningful in the output parameters.
     * @param HasUserSetRateLimit enum: "no"/"yes". no indicates that the user has not set a speed limit, while yes indicates that a speed limit has been set. This field is only meaningful in the output parameters.
     */
    public void setHasUserSetRateLimit(String HasUserSetRateLimit) {
        this.HasUserSetRateLimit = HasUserSetRateLimit;
    }

    /**
     * Get Default full export BPS, currently supported only for MongoDB links. 
     * @return DefaultDumpBps Default full export BPS, currently supported only for MongoDB links.
     */
    public Long getDefaultDumpBps() {
        return this.DefaultDumpBps;
    }

    /**
     * Set Default full export BPS, currently supported only for MongoDB links.
     * @param DefaultDumpBps Default full export BPS, currently supported only for MongoDB links.
     */
    public void setDefaultDumpBps(Long DefaultDumpBps) {
        this.DefaultDumpBps = DefaultDumpBps;
    }

    /**
     * Get Incremental import RPS, currently supported only for MongoDB links. 
     * @return CurrentSinkerRps Incremental import RPS, currently supported only for MongoDB links.
     */
    public Long getCurrentSinkerRps() {
        return this.CurrentSinkerRps;
    }

    /**
     * Set Incremental import RPS, currently supported only for MongoDB links.
     * @param CurrentSinkerRps Incremental import RPS, currently supported only for MongoDB links.
     */
    public void setCurrentSinkerRps(Long CurrentSinkerRps) {
        this.CurrentSinkerRps = CurrentSinkerRps;
    }

    /**
     * Get Default incremental import RPS, currently supported only for MongoDB links. 
     * @return DefaultSinkerRps Default incremental import RPS, currently supported only for MongoDB links.
     */
    public Long getDefaultSinkerRps() {
        return this.DefaultSinkerRps;
    }

    /**
     * Set Default incremental import RPS, currently supported only for MongoDB links.
     * @param DefaultSinkerRps Default incremental import RPS, currently supported only for MongoDB links.
     */
    public void setDefaultSinkerRps(Long DefaultSinkerRps) {
        this.DefaultSinkerRps = DefaultSinkerRps;
    }

    /**
     * Get Current import BPS. Currently, it is only used for Redis. 
     * @return CurrentLoadBps Current import BPS. Currently, it is only used for Redis.
     */
    public Long getCurrentLoadBps() {
        return this.CurrentLoadBps;
    }

    /**
     * Set Current import BPS. Currently, it is only used for Redis.
     * @param CurrentLoadBps Current import BPS. Currently, it is only used for Redis.
     */
    public void setCurrentLoadBps(Long CurrentLoadBps) {
        this.CurrentLoadBps = CurrentLoadBps;
    }

    /**
     * Get Number of shards in the target database. Currently, only used for Redis. 
     * @return CurrentDstShardCount Number of shards in the target database. Currently, only used for Redis.
     */
    public Long getCurrentDstShardCount() {
        return this.CurrentDstShardCount;
    }

    /**
     * Set Number of shards in the target database. Currently, only used for Redis.
     * @param CurrentDstShardCount Number of shards in the target database. Currently, only used for Redis.
     */
    public void setCurrentDstShardCount(Long CurrentDstShardCount) {
        this.CurrentDstShardCount = CurrentDstShardCount;
    }

    /**
     * Get Full export BPS, currently supported only for MongoDB links. 
     * @return CurrentDumpBps Full export BPS, currently supported only for MongoDB links.
     */
    public Long getCurrentDumpBps() {
        return this.CurrentDumpBps;
    }

    /**
     * Set Full export BPS, currently supported only for MongoDB links.
     * @param CurrentDumpBps Full export BPS, currently supported only for MongoDB links.
     */
    public void setCurrentDumpBps(Long CurrentDumpBps) {
        this.CurrentDumpBps = CurrentDumpBps;
    }

    /**
     * Get Incremental import BPS, currently supported only for MongoDB links. 
     * @return CurrentSinkerBps Incremental import BPS, currently supported only for MongoDB links.
     */
    public Long getCurrentSinkerBps() {
        return this.CurrentSinkerBps;
    }

    /**
     * Set Incremental import BPS, currently supported only for MongoDB links.
     * @param CurrentSinkerBps Incremental import BPS, currently supported only for MongoDB links.
     */
    public void setCurrentSinkerBps(Long CurrentSinkerBps) {
        this.CurrentSinkerBps = CurrentSinkerBps;
    }

    /**
     * Get Default incremental import BPS, currently supported only for MongoDB links. 
     * @return DefaultSinkerBps Default incremental import BPS, currently supported only for MongoDB links.
     */
    public Long getDefaultSinkerBps() {
        return this.DefaultSinkerBps;
    }

    /**
     * Set Default incremental import BPS, currently supported only for MongoDB links.
     * @param DefaultSinkerBps Default incremental import BPS, currently supported only for MongoDB links.
     */
    public void setDefaultSinkerBps(Long DefaultSinkerBps) {
        this.DefaultSinkerBps = DefaultSinkerBps;
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
        if (source.DefaultDumpBps != null) {
            this.DefaultDumpBps = new Long(source.DefaultDumpBps);
        }
        if (source.CurrentSinkerRps != null) {
            this.CurrentSinkerRps = new Long(source.CurrentSinkerRps);
        }
        if (source.DefaultSinkerRps != null) {
            this.DefaultSinkerRps = new Long(source.DefaultSinkerRps);
        }
        if (source.CurrentLoadBps != null) {
            this.CurrentLoadBps = new Long(source.CurrentLoadBps);
        }
        if (source.CurrentDstShardCount != null) {
            this.CurrentDstShardCount = new Long(source.CurrentDstShardCount);
        }
        if (source.CurrentDumpBps != null) {
            this.CurrentDumpBps = new Long(source.CurrentDumpBps);
        }
        if (source.CurrentSinkerBps != null) {
            this.CurrentSinkerBps = new Long(source.CurrentSinkerBps);
        }
        if (source.DefaultSinkerBps != null) {
            this.DefaultSinkerBps = new Long(source.DefaultSinkerBps);
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
        this.setParamSimple(map, prefix + "DefaultDumpBps", this.DefaultDumpBps);
        this.setParamSimple(map, prefix + "CurrentSinkerRps", this.CurrentSinkerRps);
        this.setParamSimple(map, prefix + "DefaultSinkerRps", this.DefaultSinkerRps);
        this.setParamSimple(map, prefix + "CurrentLoadBps", this.CurrentLoadBps);
        this.setParamSimple(map, prefix + "CurrentDstShardCount", this.CurrentDstShardCount);
        this.setParamSimple(map, prefix + "CurrentDumpBps", this.CurrentDumpBps);
        this.setParamSimple(map, prefix + "CurrentSinkerBps", this.CurrentSinkerBps);
        this.setParamSimple(map, prefix + "DefaultSinkerBps", this.DefaultSinkerBps);

    }
}

