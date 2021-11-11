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

public class DescribeStreamPushInfoListRequest extends AbstractModel{

    /**
    * Stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Start time point in the format of `yyyy-mm-dd HH:MM:SS`.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * End time in the format of yyyy-mm-dd HH:MM:SS. You can query data in the past 7 days. You’re advised to set the query period to up to 3 hours.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Push domain name.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

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
     * Get Start time point in the format of `yyyy-mm-dd HH:MM:SS`. 
     * @return StartTime Start time point in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time point in the format of `yyyy-mm-dd HH:MM:SS`.
     * @param StartTime Start time point in the format of `yyyy-mm-dd HH:MM:SS`.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time in the format of yyyy-mm-dd HH:MM:SS. You can query data in the past 7 days. You’re advised to set the query period to up to 3 hours. 
     * @return EndTime End time in the format of yyyy-mm-dd HH:MM:SS. You can query data in the past 7 days. You’re advised to set the query period to up to 3 hours.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time in the format of yyyy-mm-dd HH:MM:SS. You can query data in the past 7 days. You’re advised to set the query period to up to 3 hours.
     * @param EndTime End time in the format of yyyy-mm-dd HH:MM:SS. You can query data in the past 7 days. You’re advised to set the query period to up to 3 hours.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Push domain name. 
     * @return PushDomain Push domain name.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set Push domain name.
     * @param PushDomain Push domain name.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default. 
     * @return AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default.
     * @param AppName Push path, which is the same as the `AppName` in push and playback addresses and is `live` by default.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    public DescribeStreamPushInfoListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamPushInfoListRequest(DescribeStreamPushInfoListRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.PushDomain != null) {
            this.PushDomain = new String(source.PushDomain);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PushDomain", this.PushDomain);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

