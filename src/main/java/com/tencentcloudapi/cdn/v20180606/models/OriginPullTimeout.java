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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OriginPullTimeout extends AbstractModel{

    /**
    * The origin-pull connection timeout (in seconds). Valid range: 5-60.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * The origin-pull receipt timeout (in seconds). Valid range: 10-300.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("ReceiveTimeout")
    @Expose
    private Long ReceiveTimeout;

    /**
     * Get The origin-pull connection timeout (in seconds). Valid range: 5-60.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ConnectTimeout The origin-pull connection timeout (in seconds). Valid range: 5-60.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set The origin-pull connection timeout (in seconds). Valid range: 5-60.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ConnectTimeout The origin-pull connection timeout (in seconds). Valid range: 5-60.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get The origin-pull receipt timeout (in seconds). Valid range: 10-300.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return ReceiveTimeout The origin-pull receipt timeout (in seconds). Valid range: 10-300.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Long getReceiveTimeout() {
        return this.ReceiveTimeout;
    }

    /**
     * Set The origin-pull receipt timeout (in seconds). Valid range: 10-300.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param ReceiveTimeout The origin-pull receipt timeout (in seconds). Valid range: 10-300.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setReceiveTimeout(Long ReceiveTimeout) {
        this.ReceiveTimeout = ReceiveTimeout;
    }

    public OriginPullTimeout() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OriginPullTimeout(OriginPullTimeout source) {
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.ReceiveTimeout != null) {
            this.ReceiveTimeout = new Long(source.ReceiveTimeout);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "ReceiveTimeout", this.ReceiveTimeout);

    }
}

