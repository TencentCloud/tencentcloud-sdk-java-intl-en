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

public class BaselineRiskItem extends AbstractModel {

    /**
    * Detection item Id
    */
    @SerializedName("ItemId")
    @Expose
    private Long ItemId;

    /**
    * Detection Item Name
    */
    @SerializedName("ItemName")
    @Expose
    private String ItemName;

    /**
    * Risk level
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * Number of affected servers
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
     * Get Detection item Id 
     * @return ItemId Detection item Id
     */
    public Long getItemId() {
        return this.ItemId;
    }

    /**
     * Set Detection item Id
     * @param ItemId Detection item Id
     */
    public void setItemId(Long ItemId) {
        this.ItemId = ItemId;
    }

    /**
     * Get Detection Item Name 
     * @return ItemName Detection Item Name
     */
    public String getItemName() {
        return this.ItemName;
    }

    /**
     * Set Detection Item Name
     * @param ItemName Detection Item Name
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * Get Risk level 
     * @return Level Risk level
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set Risk level
     * @param Level Risk level
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get Number of affected servers 
     * @return HostCount Number of affected servers
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set Number of affected servers
     * @param HostCount Number of affected servers
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    public BaselineRiskItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineRiskItem(BaselineRiskItem source) {
        if (source.ItemId != null) {
            this.ItemId = new Long(source.ItemId);
        }
        if (source.ItemName != null) {
            this.ItemName = new String(source.ItemName);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ItemId", this.ItemId);
        this.setParamSimple(map, prefix + "ItemName", this.ItemName);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);

    }
}

