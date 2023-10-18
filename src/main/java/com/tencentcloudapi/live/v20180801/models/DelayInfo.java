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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DelayInfo extends AbstractModel {

    /**
    * Push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Push path, which is the same as the 
 `AppName` in push and playback addresses and is `live` by default.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Delay time in seconds.
    */
    @SerializedName("DelayInterval")
    @Expose
    private Long DelayInterval;

    /**
    * Creation time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Expiration time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Current status:
-1: expired.
1: in effect.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get Push domain name. 
     * @return DomainName Push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Push domain name.
     * @param DomainName Push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
    }

    /**
     * Get Push path, which is the same as the 
 `AppName` in push and playback addresses and is `live` by default. 
     * @return AppName Push path, which is the same as the 
 `AppName` in push and playback addresses and is `live` by default.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the 
 `AppName` in push and playback addresses and is `live` by default.
     * @param AppName Push path, which is the same as the 
 `AppName` in push and playback addresses and is `live` by default.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Stream name. 
     * @return StreamName Stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name.
     * @param StreamName Stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Delay time in seconds. 
     * @return DelayInterval Delay time in seconds.
     */
    public Long getDelayInterval() {
        return this.DelayInterval;
    }

    /**
     * Set Delay time in seconds.
     * @param DelayInterval Delay time in seconds.
     */
    public void setDelayInterval(Long DelayInterval) {
        this.DelayInterval = DelayInterval;
    }

    /**
     * Get Creation time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time). 
     * @return CreateTime Creation time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Creation time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
     * @param CreateTime Creation time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Expiration time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time). 
     * @return ExpireTime Expiration time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expiration time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
     * @param ExpireTime Expiration time in UTC time.
Note: the difference between UTC time and Beijing time is 8 hours.
Example: 2019-06-18T12:00:00Z (i.e., June 18, 2019 20:00:00 Beijing time).
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Current status:
-1: expired.
1: in effect. 
     * @return Status Current status:
-1: expired.
1: in effect.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set Current status:
-1: expired.
1: in effect.
     * @param Status Current status:
-1: expired.
1: in effect.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public DelayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DelayInfo(DelayInfo source) {
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DelayInterval != null) {
            this.DelayInterval = new Long(source.DelayInterval);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "DelayInterval", this.DelayInterval);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

