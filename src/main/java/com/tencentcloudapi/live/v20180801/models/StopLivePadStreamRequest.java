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

public class StopLivePadStreamRequest extends AbstractModel {

    /**
    * Ensure the streaming path uses the same AppName as the push/play URLs (default: 'live')
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Your RTMP push domain.
    */
    @SerializedName("PushDomainName")
    @Expose
    private String PushDomainName;

    /**
    * Your stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * Operator notes.
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get Ensure the streaming path uses the same AppName as the push/play URLs (default: 'live') 
     * @return AppName Ensure the streaming path uses the same AppName as the push/play URLs (default: 'live')
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set Ensure the streaming path uses the same AppName as the push/play URLs (default: 'live')
     * @param AppName Ensure the streaming path uses the same AppName as the push/play URLs (default: 'live')
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Your RTMP push domain. 
     * @return PushDomainName Your RTMP push domain.
     */
    public String getPushDomainName() {
        return this.PushDomainName;
    }

    /**
     * Set Your RTMP push domain.
     * @param PushDomainName Your RTMP push domain.
     */
    public void setPushDomainName(String PushDomainName) {
        this.PushDomainName = PushDomainName;
    }

    /**
     * Get Your stream name. 
     * @return StreamName Your stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set Your stream name.
     * @param StreamName Your stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get Operator notes. 
     * @return Operator Operator notes.
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set Operator notes.
     * @param Operator Operator notes.
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public StopLivePadStreamRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StopLivePadStreamRequest(StopLivePadStreamRequest source) {
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.PushDomainName != null) {
            this.PushDomainName = new String(source.PushDomainName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "PushDomainName", this.PushDomainName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

