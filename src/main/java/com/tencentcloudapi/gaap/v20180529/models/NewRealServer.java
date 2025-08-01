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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NewRealServer extends AbstractModel {

    /**
    * Origin server ID
    */
    @SerializedName("RealServerId")
    @Expose
    private String RealServerId;

    /**
    * Origin server IP or domain name
    */
    @SerializedName("RealServerIP")
    @Expose
    private String RealServerIP;

    /**
     * Get Origin server ID 
     * @return RealServerId Origin server ID
     */
    public String getRealServerId() {
        return this.RealServerId;
    }

    /**
     * Set Origin server ID
     * @param RealServerId Origin server ID
     */
    public void setRealServerId(String RealServerId) {
        this.RealServerId = RealServerId;
    }

    /**
     * Get Origin server IP or domain name 
     * @return RealServerIP Origin server IP or domain name
     */
    public String getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * Set Origin server IP or domain name
     * @param RealServerIP Origin server IP or domain name
     */
    public void setRealServerIP(String RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    public NewRealServer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NewRealServer(NewRealServer source) {
        if (source.RealServerId != null) {
            this.RealServerId = new String(source.RealServerId);
        }
        if (source.RealServerIP != null) {
            this.RealServerIP = new String(source.RealServerIP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RealServerId", this.RealServerId);
        this.setParamSimple(map, prefix + "RealServerIP", this.RealServerIP);

    }
}

