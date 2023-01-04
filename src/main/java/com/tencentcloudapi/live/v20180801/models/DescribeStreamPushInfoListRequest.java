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
    * The stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The start time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * The end time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”. You can query data from the past seven days for a period of preferably not longer than three hours.
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * The push domain.
    */
    @SerializedName("PushDomain")
    @Expose
    private String PushDomain;

    /**
    * The push path, which should be the same as `AppName` in the push and playback URL. The default value is `live`.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
     * Get The stream name. 
     * @return StreamName The stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The stream name.
     * @param StreamName The stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The start time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”. 
     * @return StartTime The start time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set The start time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”.
     * @param StartTime The start time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get The end time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”. You can query data from the past seven days for a period of preferably not longer than three hours. 
     * @return EndTime The end time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”. You can query data from the past seven days for a period of preferably not longer than three hours.
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set The end time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”. You can query data from the past seven days for a period of preferably not longer than three hours.
     * @param EndTime The end time (UTC+8) in the format of “yyyy-mm-dd HH:MM:SS”. You can query data from the past seven days for a period of preferably not longer than three hours.
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get The push domain. 
     * @return PushDomain The push domain.
     */
    public String getPushDomain() {
        return this.PushDomain;
    }

    /**
     * Set The push domain.
     * @param PushDomain The push domain.
     */
    public void setPushDomain(String PushDomain) {
        this.PushDomain = PushDomain;
    }

    /**
     * Get The push path, which should be the same as `AppName` in the push and playback URL. The default value is `live`. 
     * @return AppName The push path, which should be the same as `AppName` in the push and playback URL. The default value is `live`.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The push path, which should be the same as `AppName` in the push and playback URL. The default value is `live`.
     * @param AppName The push path, which should be the same as `AppName` in the push and playback URL. The default value is `live`.
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

