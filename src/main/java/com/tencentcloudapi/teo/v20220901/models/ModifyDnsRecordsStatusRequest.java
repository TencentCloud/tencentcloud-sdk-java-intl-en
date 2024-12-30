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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDnsRecordsStatusRequest extends AbstractModel {

    /**
    * Site ID.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of DNS record IDs to be enabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
    */
    @SerializedName("RecordsToEnable")
    @Expose
    private String [] RecordsToEnable;

    /**
    * List of DNS record IDs to be disabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
    */
    @SerializedName("RecordsToDisable")
    @Expose
    private String [] RecordsToDisable;

    /**
     * Get Site ID. 
     * @return ZoneId Site ID.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Site ID.
     * @param ZoneId Site ID.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of DNS record IDs to be enabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable. 
     * @return RecordsToEnable List of DNS record IDs to be enabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
     */
    public String [] getRecordsToEnable() {
        return this.RecordsToEnable;
    }

    /**
     * Set List of DNS record IDs to be enabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
     * @param RecordsToEnable List of DNS record IDs to be enabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
     */
    public void setRecordsToEnable(String [] RecordsToEnable) {
        this.RecordsToEnable = RecordsToEnable;
    }

    /**
     * Get List of DNS record IDs to be disabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable. 
     * @return RecordsToDisable List of DNS record IDs to be disabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
     */
    public String [] getRecordsToDisable() {
        return this.RecordsToDisable;
    }

    /**
     * Set List of DNS record IDs to be disabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
     * @param RecordsToDisable List of DNS record IDs to be disabled, with a limit of 200. Note: The same DNS record ID cannot exist in both RecordsToEnable and RecordsToDisable.
     */
    public void setRecordsToDisable(String [] RecordsToDisable) {
        this.RecordsToDisable = RecordsToDisable;
    }

    public ModifyDnsRecordsStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDnsRecordsStatusRequest(ModifyDnsRecordsStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.RecordsToEnable != null) {
            this.RecordsToEnable = new String[source.RecordsToEnable.length];
            for (int i = 0; i < source.RecordsToEnable.length; i++) {
                this.RecordsToEnable[i] = new String(source.RecordsToEnable[i]);
            }
        }
        if (source.RecordsToDisable != null) {
            this.RecordsToDisable = new String[source.RecordsToDisable.length];
            for (int i = 0; i < source.RecordsToDisable.length; i++) {
                this.RecordsToDisable[i] = new String(source.RecordsToDisable[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamArraySimple(map, prefix + "RecordsToEnable.", this.RecordsToEnable);
        this.setParamArraySimple(map, prefix + "RecordsToDisable.", this.RecordsToDisable);

    }
}

