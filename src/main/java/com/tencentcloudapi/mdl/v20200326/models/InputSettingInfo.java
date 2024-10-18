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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputSettingInfo extends AbstractModel {

    /**
    * Application name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Stream name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Source URL, which is valid if `Type` is `RTMP_PULL`, `HLS_PULL`,  `MP4_PULL`, `RTSP_PULL` or `SRT_PULL`, and can contain 1-512 characters
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SourceUrl")
    @Expose
    private String SourceUrl;

    /**
    * RTP/UDP input address, which does not need to be entered for the input parameter.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InputAddress")
    @Expose
    private String InputAddress;

    /**
    * Source type for stream pulling and relaying. To pull content from private-read COS buckets under the current account, set this parameter to `TencentCOS`; otherwise, leave it empty.
Note: this field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * Delayed time (ms) for playback, which is valid if `Type` is `RTMP_PUSH`
Value range: 0 (default) or 10000-600000
The value must be a multiple of 1,000.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("DelayTime")
    @Expose
    private Long DelayTime;

    /**
    * The domain name of the SRT_PUSH push address. No need to fill in the input parameter.
    */
    @SerializedName("InputDomain")
    @Expose
    private String InputDomain;

    /**
    * The username, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * The password, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * This parameter is valid when the input source is HLS_PULL and MP4_PULL. It indicates the type of file the source is. The optional values are: LIVE, VOD. Please note that if you do not enter this parameter, the system will take the default input value VOD.
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
     * Get Application name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found. 
     * @return AppName Application name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
     * @param AppName Application name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Stream name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found. 
     * @return StreamName Stream name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
     * @param StreamName Stream name, which is valid if `Type` is `RTMP_PUSH` and can contain 1-32 letters and digits
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Source URL, which is valid if `Type` is `RTMP_PULL`, `HLS_PULL`,  `MP4_PULL`, `RTSP_PULL` or `SRT_PULL`, and can contain 1-512 characters
Note: This field may return `null`, indicating that no valid value was found. 
     * @return SourceUrl Source URL, which is valid if `Type` is `RTMP_PULL`, `HLS_PULL`,  `MP4_PULL`, `RTSP_PULL` or `SRT_PULL`, and can contain 1-512 characters
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getSourceUrl() {
        return this.SourceUrl;
    }

    /**
     * Set Source URL, which is valid if `Type` is `RTMP_PULL`, `HLS_PULL`,  `MP4_PULL`, `RTSP_PULL` or `SRT_PULL`, and can contain 1-512 characters
Note: This field may return `null`, indicating that no valid value was found.
     * @param SourceUrl Source URL, which is valid if `Type` is `RTMP_PULL`, `HLS_PULL`,  `MP4_PULL`, `RTSP_PULL` or `SRT_PULL`, and can contain 1-512 characters
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setSourceUrl(String SourceUrl) {
        this.SourceUrl = SourceUrl;
    }

    /**
     * Get RTP/UDP input address, which does not need to be entered for the input parameter.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return InputAddress RTP/UDP input address, which does not need to be entered for the input parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getInputAddress() {
        return this.InputAddress;
    }

    /**
     * Set RTP/UDP input address, which does not need to be entered for the input parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param InputAddress RTP/UDP input address, which does not need to be entered for the input parameter.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setInputAddress(String InputAddress) {
        this.InputAddress = InputAddress;
    }

    /**
     * Get Source type for stream pulling and relaying. To pull content from private-read COS buckets under the current account, set this parameter to `TencentCOS`; otherwise, leave it empty.
Note: this field may return `null`, indicating that no valid value was found. 
     * @return SourceType Source type for stream pulling and relaying. To pull content from private-read COS buckets under the current account, set this parameter to `TencentCOS`; otherwise, leave it empty.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Source type for stream pulling and relaying. To pull content from private-read COS buckets under the current account, set this parameter to `TencentCOS`; otherwise, leave it empty.
Note: this field may return `null`, indicating that no valid value was found.
     * @param SourceType Source type for stream pulling and relaying. To pull content from private-read COS buckets under the current account, set this parameter to `TencentCOS`; otherwise, leave it empty.
Note: this field may return `null`, indicating that no valid value was found.
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Delayed time (ms) for playback, which is valid if `Type` is `RTMP_PUSH`
Value range: 0 (default) or 10000-600000
The value must be a multiple of 1,000.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return DelayTime Delayed time (ms) for playback, which is valid if `Type` is `RTMP_PUSH`
Value range: 0 (default) or 10000-600000
The value must be a multiple of 1,000.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getDelayTime() {
        return this.DelayTime;
    }

    /**
     * Set Delayed time (ms) for playback, which is valid if `Type` is `RTMP_PUSH`
Value range: 0 (default) or 10000-600000
The value must be a multiple of 1,000.
Note: This field may return `null`, indicating that no valid value was found.
     * @param DelayTime Delayed time (ms) for playback, which is valid if `Type` is `RTMP_PUSH`
Value range: 0 (default) or 10000-600000
The value must be a multiple of 1,000.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setDelayTime(Long DelayTime) {
        this.DelayTime = DelayTime;
    }

    /**
     * Get The domain name of the SRT_PUSH push address. No need to fill in the input parameter. 
     * @return InputDomain The domain name of the SRT_PUSH push address. No need to fill in the input parameter.
     */
    public String getInputDomain() {
        return this.InputDomain;
    }

    /**
     * Set The domain name of the SRT_PUSH push address. No need to fill in the input parameter.
     * @param InputDomain The domain name of the SRT_PUSH push address. No need to fill in the input parameter.
     */
    public void setInputDomain(String InputDomain) {
        this.InputDomain = InputDomain;
    }

    /**
     * Get The username, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return UserName The username, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set The username, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
     * @param UserName The username, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get The password, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return Password The password, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * Set The password, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
     * @param Password The password, which is used for authentication.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * Get This parameter is valid when the input source is HLS_PULL and MP4_PULL. It indicates the type of file the source is. The optional values are: LIVE, VOD. Please note that if you do not enter this parameter, the system will take the default input value VOD. 
     * @return ContentType This parameter is valid when the input source is HLS_PULL and MP4_PULL. It indicates the type of file the source is. The optional values are: LIVE, VOD. Please note that if you do not enter this parameter, the system will take the default input value VOD.
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set This parameter is valid when the input source is HLS_PULL and MP4_PULL. It indicates the type of file the source is. The optional values are: LIVE, VOD. Please note that if you do not enter this parameter, the system will take the default input value VOD.
     * @param ContentType This parameter is valid when the input source is HLS_PULL and MP4_PULL. It indicates the type of file the source is. The optional values are: LIVE, VOD. Please note that if you do not enter this parameter, the system will take the default input value VOD.
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    public InputSettingInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputSettingInfo(InputSettingInfo source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.SourceUrl != null) {
            this.SourceUrl = new String(source.SourceUrl);
        }
        if (source.InputAddress != null) {
            this.InputAddress = new String(source.InputAddress);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.DelayTime != null) {
            this.DelayTime = new Long(source.DelayTime);
        }
        if (source.InputDomain != null) {
            this.InputDomain = new String(source.InputDomain);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.Password != null) {
            this.Password = new String(source.Password);
        }
        if (source.ContentType != null) {
            this.ContentType = new String(source.ContentType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "SourceUrl", this.SourceUrl);
        this.setParamSimple(map, prefix + "InputAddress", this.InputAddress);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "DelayTime", this.DelayTime);
        this.setParamSimple(map, prefix + "InputDomain", this.InputDomain);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

