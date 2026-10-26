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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoDownloadUrlData extends AbstractModel {

    /**
    * Video recording file download URL
Note:
The URL is valid for 10 minutes. Access will be denied after expiry. Obtain a new one if needed. 
Video file download uses chunked transfer encoding, and the response header is Transfer-Encoding: chunked. 
The naming format of the downloaded file is {ChannelId}-{BeginTime}-{EndTime}.{FileType}
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Actual download start time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
    */
    @SerializedName("ActualBeginTime")
    @Expose
    private String ActualBeginTime;

    /**
    * Actual download end time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
    */
    @SerializedName("ActualEndTime")
    @Expose
    private String ActualEndTime;

    /**
     * Get Video recording file download URL
Note:
The URL is valid for 10 minutes. Access will be denied after expiry. Obtain a new one if needed. 
Video file download uses chunked transfer encoding, and the response header is Transfer-Encoding: chunked. 
The naming format of the downloaded file is {ChannelId}-{BeginTime}-{EndTime}.{FileType} 
     * @return Url Video recording file download URL
Note:
The URL is valid for 10 minutes. Access will be denied after expiry. Obtain a new one if needed. 
Video file download uses chunked transfer encoding, and the response header is Transfer-Encoding: chunked. 
The naming format of the downloaded file is {ChannelId}-{BeginTime}-{EndTime}.{FileType}
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Video recording file download URL
Note:
The URL is valid for 10 minutes. Access will be denied after expiry. Obtain a new one if needed. 
Video file download uses chunked transfer encoding, and the response header is Transfer-Encoding: chunked. 
The naming format of the downloaded file is {ChannelId}-{BeginTime}-{EndTime}.{FileType}
     * @param Url Video recording file download URL
Note:
The URL is valid for 10 minutes. Access will be denied after expiry. Obtain a new one if needed. 
Video file download uses chunked transfer encoding, and the response header is Transfer-Encoding: chunked. 
The naming format of the downloaded file is {ChannelId}-{BeginTime}-{EndTime}.{FileType}
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Actual download start time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request. 
     * @return ActualBeginTime Actual download start time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
     */
    public String getActualBeginTime() {
        return this.ActualBeginTime;
    }

    /**
     * Set Actual download start time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
     * @param ActualBeginTime Actual download start time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
     */
    public void setActualBeginTime(String ActualBeginTime) {
        this.ActualBeginTime = ActualBeginTime;
    }

    /**
     * Get Actual download end time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request. 
     * @return ActualEndTime Actual download end time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
     */
    public String getActualEndTime() {
        return this.ActualEndTime;
    }

    /**
     * Set Actual download end time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
     * @param ActualEndTime Actual download end time of the video recording
Note: This field is returned only when the IsRespActualTime parameter is set to true in the request.
     */
    public void setActualEndTime(String ActualEndTime) {
        this.ActualEndTime = ActualEndTime;
    }

    public DescribeVideoDownloadUrlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoDownloadUrlData(DescribeVideoDownloadUrlData source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.ActualBeginTime != null) {
            this.ActualBeginTime = new String(source.ActualBeginTime);
        }
        if (source.ActualEndTime != null) {
            this.ActualEndTime = new String(source.ActualEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "ActualBeginTime", this.ActualBeginTime);
        this.setParamSimple(map, prefix + "ActualEndTime", this.ActualEndTime);

    }
}

