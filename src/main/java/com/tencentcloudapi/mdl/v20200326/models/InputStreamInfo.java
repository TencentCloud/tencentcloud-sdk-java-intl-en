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

public class InputStreamInfo extends AbstractModel{

    /**
    * The input stream address.
    */
    @SerializedName("InputAddress")
    @Expose
    private String InputAddress;

    /**
    * The input stream path.
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * The input stream name.
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * The input stream status. `1` indicates the stream is active.
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get The input stream address. 
     * @return InputAddress The input stream address.
     */
    public String getInputAddress() {
        return this.InputAddress;
    }

    /**
     * Set The input stream address.
     * @param InputAddress The input stream address.
     */
    public void setInputAddress(String InputAddress) {
        this.InputAddress = InputAddress;
    }

    /**
     * Get The input stream path. 
     * @return AppName The input stream path.
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set The input stream path.
     * @param AppName The input stream path.
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get The input stream name. 
     * @return StreamName The input stream name.
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * Set The input stream name.
     * @param StreamName The input stream name.
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * Get The input stream status. `1` indicates the stream is active. 
     * @return Status The input stream status. `1` indicates the stream is active.
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set The input stream status. `1` indicates the stream is active.
     * @param Status The input stream status. `1` indicates the stream is active.
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public InputStreamInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InputStreamInfo(InputStreamInfo source) {
        if (source.InputAddress != null) {
            this.InputAddress = new String(source.InputAddress);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.StreamName != null) {
            this.StreamName = new String(source.StreamName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputAddress", this.InputAddress);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

