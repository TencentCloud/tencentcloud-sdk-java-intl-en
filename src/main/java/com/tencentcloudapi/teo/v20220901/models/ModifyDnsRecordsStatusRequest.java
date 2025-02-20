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
    * Zone id.
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * List of dns record ids to be enabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
    */
    @SerializedName("RecordsToEnable")
    @Expose
    private String [] RecordsToEnable;

    /**
    * List of dns record ids to be disabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
    */
    @SerializedName("RecordsToDisable")
    @Expose
    private String [] RecordsToDisable;

    /**
     * Get Zone id. 
     * @return ZoneId Zone id.
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set Zone id.
     * @param ZoneId Zone id.
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get List of dns record ids to be enabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable. 
     * @return RecordsToEnable List of dns record ids to be enabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
     */
    public String [] getRecordsToEnable() {
        return this.RecordsToEnable;
    }

    /**
     * Set List of dns record ids to be enabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
     * @param RecordsToEnable List of dns record ids to be enabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
     */
    public void setRecordsToEnable(String [] RecordsToEnable) {
        this.RecordsToEnable = RecordsToEnable;
    }

    /**
     * Get List of dns record ids to be disabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable. 
     * @return RecordsToDisable List of dns record ids to be disabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
     */
    public String [] getRecordsToDisable() {
        return this.RecordsToDisable;
    }

    /**
     * Set List of dns record ids to be disabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
     * @param RecordsToDisable List of dns record ids to be disabled, upper limit: 200. <br>note: the same dns record id cannot exist in both recordstoenable and recordstodisable.
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

