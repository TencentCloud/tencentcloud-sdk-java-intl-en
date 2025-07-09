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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostAlias extends AbstractModel {

    /**
    * Domain list to be bound.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("HostNames")
    @Expose
    private String [] HostNames;

    /**
    * IP address to be bound.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("IP")
    @Expose
    private String IP;

    /**
     * Get Domain list to be bound.

Note: This field may return null, indicating that no valid value is found. 
     * @return HostNames Domain list to be bound.

Note: This field may return null, indicating that no valid value is found.
     */
    public String [] getHostNames() {
        return this.HostNames;
    }

    /**
     * Set Domain list to be bound.

Note: This field may return null, indicating that no valid value is found.
     * @param HostNames Domain list to be bound.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setHostNames(String [] HostNames) {
        this.HostNames = HostNames;
    }

    /**
     * Get IP address to be bound.

Note: This field may return null, indicating that no valid value is found. 
     * @return IP IP address to be bound.

Note: This field may return null, indicating that no valid value is found.
     */
    public String getIP() {
        return this.IP;
    }

    /**
     * Set IP address to be bound.

Note: This field may return null, indicating that no valid value is found.
     * @param IP IP address to be bound.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setIP(String IP) {
        this.IP = IP;
    }

    public HostAlias() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostAlias(HostAlias source) {
        if (source.HostNames != null) {
            this.HostNames = new String[source.HostNames.length];
            for (int i = 0; i < source.HostNames.length; i++) {
                this.HostNames[i] = new String(source.HostNames[i]);
            }
        }
        if (source.IP != null) {
            this.IP = new String(source.IP);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "HostNames.", this.HostNames);
        this.setParamSimple(map, prefix + "IP", this.IP);

    }
}

