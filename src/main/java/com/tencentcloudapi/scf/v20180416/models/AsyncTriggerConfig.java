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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AsyncTriggerConfig extends AbstractModel {

    /**
    * Async retry configuration of function upon user error
    */
    @SerializedName("RetryConfig")
    @Expose
    private RetryConfig [] RetryConfig;

    /**
    * Message retention period
    */
    @SerializedName("MsgTTL")
    @Expose
    private Long MsgTTL;

    /**
     * Get Async retry configuration of function upon user error 
     * @return RetryConfig Async retry configuration of function upon user error
     */
    public RetryConfig [] getRetryConfig() {
        return this.RetryConfig;
    }

    /**
     * Set Async retry configuration of function upon user error
     * @param RetryConfig Async retry configuration of function upon user error
     */
    public void setRetryConfig(RetryConfig [] RetryConfig) {
        this.RetryConfig = RetryConfig;
    }

    /**
     * Get Message retention period 
     * @return MsgTTL Message retention period
     */
    public Long getMsgTTL() {
        return this.MsgTTL;
    }

    /**
     * Set Message retention period
     * @param MsgTTL Message retention period
     */
    public void setMsgTTL(Long MsgTTL) {
        this.MsgTTL = MsgTTL;
    }

    public AsyncTriggerConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AsyncTriggerConfig(AsyncTriggerConfig source) {
        if (source.RetryConfig != null) {
            this.RetryConfig = new RetryConfig[source.RetryConfig.length];
            for (int i = 0; i < source.RetryConfig.length; i++) {
                this.RetryConfig[i] = new RetryConfig(source.RetryConfig[i]);
            }
        }
        if (source.MsgTTL != null) {
            this.MsgTTL = new Long(source.MsgTTL);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RetryConfig.", this.RetryConfig);
        this.setParamSimple(map, prefix + "MsgTTL", this.MsgTTL);

    }
}

