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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OldAddrInfo extends AbstractModel {

    /**
    * IP
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * Port
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * Expected valid hours of old IPs
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReturnTime")
    @Expose
    private String ReturnTime;

    /**
     * Get IP
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vip IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set IP
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vip IP
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get Port
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Vport Port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set Port
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Vport Port
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get Expected valid hours of old IPs
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReturnTime Expected valid hours of old IPs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReturnTime() {
        return this.ReturnTime;
    }

    /**
     * Set Expected valid hours of old IPs
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReturnTime Expected valid hours of old IPs
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReturnTime(String ReturnTime) {
        this.ReturnTime = ReturnTime;
    }

    public OldAddrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OldAddrInfo(OldAddrInfo source) {
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.ReturnTime != null) {
            this.ReturnTime = new String(source.ReturnTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "ReturnTime", this.ReturnTime);

    }
}

