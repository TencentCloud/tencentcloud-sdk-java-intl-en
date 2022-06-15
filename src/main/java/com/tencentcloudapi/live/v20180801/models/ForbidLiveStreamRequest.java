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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ForbidLiveStreamRequest extends AbstractModel{

    /**
    * Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Your push domain name.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The time (in UTC format) to resume the stream, such as 2018-11-29T19:00:00Z.
Notes:
1. The default stream disabling period is seven days. A stream can be disabled for up to 90 days.
2. Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
    */
    @SerializedName("ResumeTime")
    @Expose
    private String ResumeTime;

    /**
    * Reason for forbidding.
Note: Be sure to enter the reason for forbidding to avoid any faulty operations.
Length limit: 2,048 bytes.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get Push path, which is the same as the AppName in push and playback addresses and is "live" by default. 
     * @return AppName Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
     * @param AppName Push path, which is the same as the AppName in push and playback addresses and is "live" by default.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Your push domain name. 
     * @return DomainName Your push domain name.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Your push domain name.
     * @param DomainName Your push domain name.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
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
     * Get The time (in UTC format) to resume the stream, such as 2018-11-29T19:00:00Z.
Notes:
1. The default stream disabling period is seven days. A stream can be disabled for up to 90 days.
2. Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used. 
     * @return ResumeTime The time (in UTC format) to resume the stream, such as 2018-11-29T19:00:00Z.
Notes:
1. The default stream disabling period is seven days. A stream can be disabled for up to 90 days.
2. Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public String getResumeTime() {
        return this.ResumeTime;
    }

    /**
     * Set The time (in UTC format) to resume the stream, such as 2018-11-29T19:00:00Z.
Notes:
1. The default stream disabling period is seven days. A stream can be disabled for up to 90 days.
2. Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     * @param ResumeTime The time (in UTC format) to resume the stream, such as 2018-11-29T19:00:00Z.
Notes:
1. The default stream disabling period is seven days. A stream can be disabled for up to 90 days.
2. Beijing time is 8 hours ahead of UTC. The [ISO 8601 format](https://intl.cloud.tencent.com/document/product/266/11732#iso-date-format) is used.
     */
    public void setResumeTime(String ResumeTime) {
        this.ResumeTime = ResumeTime;
    }

    /**
     * Get Reason for forbidding.
Note: Be sure to enter the reason for forbidding to avoid any faulty operations.
Length limit: 2,048 bytes. 
     * @return Reason Reason for forbidding.
Note: Be sure to enter the reason for forbidding to avoid any faulty operations.
Length limit: 2,048 bytes.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set Reason for forbidding.
Note: Be sure to enter the reason for forbidding to avoid any faulty operations.
Length limit: 2,048 bytes.
     * @param Reason Reason for forbidding.
Note: Be sure to enter the reason for forbidding to avoid any faulty operations.
Length limit: 2,048 bytes.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public ForbidLiveStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ForbidLiveStreamRequest(ForbidLiveStreamRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.ResumeTime != null) {
            this.ResumeTime = new String(source.ResumeTime);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "ResumeTime", this.ResumeTime);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

