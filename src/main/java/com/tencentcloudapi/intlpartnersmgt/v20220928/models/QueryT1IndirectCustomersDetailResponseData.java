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
package com.tencentcloudapi.intlpartnersmgt.v20220928.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryT1IndirectCustomersDetailResponseData extends AbstractModel {

    /**
    * Customer uin.
    */
    @SerializedName("ClientUin")
    @Expose
    private Long ClientUin;

    /**
    * Customer name.
    */
    @SerializedName("ClientName")
    @Expose
    private String ClientName;

    /**
    * The time when a sub-customer binds a second-level reseller, time zone: UTC+08:00.
    */
    @SerializedName("ClientBindTime")
    @Expose
    private String ClientBindTime;

    /**
     * Get Customer uin. 
     * @return ClientUin Customer uin.
     */
    public Long getClientUin() {
        return this.ClientUin;
    }

    /**
     * Set Customer uin.
     * @param ClientUin Customer uin.
     */
    public void setClientUin(Long ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * Get Customer name. 
     * @return ClientName Customer name.
     */
    public String getClientName() {
        return this.ClientName;
    }

    /**
     * Set Customer name.
     * @param ClientName Customer name.
     */
    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    /**
     * Get The time when a sub-customer binds a second-level reseller, time zone: UTC+08:00. 
     * @return ClientBindTime The time when a sub-customer binds a second-level reseller, time zone: UTC+08:00.
     */
    public String getClientBindTime() {
        return this.ClientBindTime;
    }

    /**
     * Set The time when a sub-customer binds a second-level reseller, time zone: UTC+08:00.
     * @param ClientBindTime The time when a sub-customer binds a second-level reseller, time zone: UTC+08:00.
     */
    public void setClientBindTime(String ClientBindTime) {
        this.ClientBindTime = ClientBindTime;
    }

    public QueryT1IndirectCustomersDetailResponseData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryT1IndirectCustomersDetailResponseData(QueryT1IndirectCustomersDetailResponseData source) {
        if (source.ClientUin != null) {
            this.ClientUin = new Long(source.ClientUin);
        }
        if (source.ClientName != null) {
            this.ClientName = new String(source.ClientName);
        }
        if (source.ClientBindTime != null) {
            this.ClientBindTime = new String(source.ClientBindTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "ClientName", this.ClientName);
        this.setParamSimple(map, prefix + "ClientBindTime", this.ClientBindTime);

    }
}

