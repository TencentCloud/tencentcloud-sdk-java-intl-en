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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlotNetInfo extends AbstractModel {

    /**
    * NIC Name
    */
    @SerializedName("NetInfoName")
    @Expose
    private String NetInfoName;

    /**
    * Public IP address
    */
    @SerializedName("PublicIP")
    @Expose
    private String PublicIP;

    /**
    * Metric data (bps/ms/%)
    */
    @SerializedName("Current")
    @Expose
    private Float Current;

    /**
     * Get NIC Name 
     * @return NetInfoName NIC Name
     */
    public String getNetInfoName() {
        return this.NetInfoName;
    }

    /**
     * Set NIC Name
     * @param NetInfoName NIC Name
     */
    public void setNetInfoName(String NetInfoName) {
        this.NetInfoName = NetInfoName;
    }

    /**
     * Get Public IP address 
     * @return PublicIP Public IP address
     */
    public String getPublicIP() {
        return this.PublicIP;
    }

    /**
     * Set Public IP address
     * @param PublicIP Public IP address
     */
    public void setPublicIP(String PublicIP) {
        this.PublicIP = PublicIP;
    }

    /**
     * Get Metric data (bps/ms/%) 
     * @return Current Metric data (bps/ms/%)
     */
    public Float getCurrent() {
        return this.Current;
    }

    /**
     * Set Metric data (bps/ms/%)
     * @param Current Metric data (bps/ms/%)
     */
    public void setCurrent(Float Current) {
        this.Current = Current;
    }

    public SlotNetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlotNetInfo(SlotNetInfo source) {
        if (source.NetInfoName != null) {
            this.NetInfoName = new String(source.NetInfoName);
        }
        if (source.PublicIP != null) {
            this.PublicIP = new String(source.PublicIP);
        }
        if (source.Current != null) {
            this.Current = new Float(source.Current);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetInfoName", this.NetInfoName);
        this.setParamSimple(map, prefix + "PublicIP", this.PublicIP);
        this.setParamSimple(map, prefix + "Current", this.Current);

    }
}

