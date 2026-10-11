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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FixBaselineDetectRequest extends AbstractModel {

    /**
    * Host ID
    */
    @SerializedName("HostId")
    @Expose
    private String HostId;

    /**
    * Item ID
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Repair content
    */
    @SerializedName("Data")
    @Expose
    private String [] Data;

    /**
     * Get Host ID 
     * @return HostId Host ID
     */
    public String getHostId() {
        return this.HostId;
    }

    /**
     * Set Host ID
     * @param HostId Host ID
     */
    public void setHostId(String HostId) {
        this.HostId = HostId;
    }

    /**
     * Get Item ID 
     * @return ItemId Item ID
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Item ID
     * @param ItemId Item ID
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Repair content 
     * @return Data Repair content
     */
    public String [] getData() {
        return this.Data;
    }

    /**
     * Set Repair content
     * @param Data Repair content
     */
    public void setData(String [] Data) {
        this.Data = Data;
    }

    public FixBaselineDetectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FixBaselineDetectRequest(FixBaselineDetectRequest source) {
        if (source.HostId != null) {
            this.HostId = new String(source.HostId);
        }
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.Data != null) {
            this.Data = new String[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new String(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostId", this.HostId);
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamArraySimple(map, prefix + "Data.", this.Data);

    }
}

