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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OldVip extends AbstractModel {

    /**
    * Unrecovered old IP addresses
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * IP recovery time
    */
    @SerializedName("RecycleTime")
    @Expose
    private String RecycleTime;

    /**
    * Old IP retention time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("OldIpRetainTime")
    @Expose
    private Long OldIpRetainTime;

    /**
     * Get Unrecovered old IP addresses 
     * @return Vip Unrecovered old IP addresses
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set Unrecovered old IP addresses
     * @param Vip Unrecovered old IP addresses
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get IP recovery time 
     * @return RecycleTime IP recovery time
     */
    public String getRecycleTime() {
        return this.RecycleTime;
    }

    /**
     * Set IP recovery time
     * @param RecycleTime IP recovery time
     */
    public void setRecycleTime(String RecycleTime) {
        this.RecycleTime = RecycleTime;
    }

    /**
     * Get Old IP retention time (hours)
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return OldIpRetainTime Old IP retention time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getOldIpRetainTime() {
        return this.OldIpRetainTime;
    }

    /**
     * Set Old IP retention time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
     * @param OldIpRetainTime Old IP retention time (hours)
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setOldIpRetainTime(Long OldIpRetainTime) {
        this.OldIpRetainTime = OldIpRetainTime;
    }

    public OldVip() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OldVip(OldVip source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.RecycleTime != null) {
            this.RecycleTime = new String(source.RecycleTime);
        }
        if (source.OldIpRetainTime != null) {
            this.OldIpRetainTime = new Long(source.OldIpRetainTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "RecycleTime", this.RecycleTime);
        this.setParamSimple(map, prefix + "OldIpRetainTime", this.OldIpRetainTime);

    }
}

