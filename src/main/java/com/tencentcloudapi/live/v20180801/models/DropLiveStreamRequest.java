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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropLiveStreamRequest extends AbstractModel {

    /**
    * The stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Your push domain.
    */
    @SerializedName("DomainName")
    @Expose
    private String DomainName;

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
     * Get Your push domain. 
     * @return DomainName Your push domain.
     */
    public String getDomainName() {
        return this.DomainName;
    }

    /**
     * Set Your push domain.
     * @param DomainName Your push domain.
     */
    public void setDomainName(String DomainName) {
        this.DomainName = DomainName;
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

    public DropLiveStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropLiveStreamRequest(DropLiveStreamRequest source) {
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.DomainName != null) {
            this.DomainName = new String(source.DomainName);
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
        this.setParamSimple(map, prefix + "DomainName", this.DomainName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

