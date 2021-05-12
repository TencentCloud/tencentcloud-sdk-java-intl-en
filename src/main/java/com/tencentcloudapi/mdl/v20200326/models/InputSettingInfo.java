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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InputSettingInfo extends AbstractModel{

    /**
    * Application name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Stream name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Origin-pull URL, which is used for RTMP_PULL/HLS_PULL/MP4_PULL. Length limit: [1,512].
Note: this field may return null, indicating that no valid values can be obtained.
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
     * Get Application name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AppName Application name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Application name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AppName Application name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Stream name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return StreamName Stream name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Stream name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param StreamName Stream name, which is used for RTMP_PUSH and can contain 1-32 letters and digits.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Origin-pull URL, which is used for RTMP_PULL/HLS_PULL/MP4_PULL. Length limit: [1,512].
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SourceUrl Origin-pull URL, which is used for RTMP_PULL/HLS_PULL/MP4_PULL. Length limit: [1,512].
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceUrl() {
        return this.SourceUrl;
    }

    /**
     * Set Origin-pull URL, which is used for RTMP_PULL/HLS_PULL/MP4_PULL. Length limit: [1,512].
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SourceUrl Origin-pull URL, which is used for RTMP_PULL/HLS_PULL/MP4_PULL. Length limit: [1,512].
Note: this field may return null, indicating that no valid values can be obtained.
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "SourceUrl", this.SourceUrl);
        this.setParamSimple(map, prefix + "InputAddress", this.InputAddress);

    }
}

