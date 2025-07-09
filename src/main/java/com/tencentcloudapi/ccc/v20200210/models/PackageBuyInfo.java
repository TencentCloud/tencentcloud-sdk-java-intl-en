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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PackageBuyInfo extends AbstractModel {

    /**
    * Package id.
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * Package type, 0 - outbound call package | 1 - 400 inbound call package.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <TOTAL_PACKAGE>.
    */
    @SerializedName("CapacitySize")
    @Expose
    private Long CapacitySize;

    /**
    * Remaining package balance.
    */
    @SerializedName("CapacityRemain")
    @Expose
    private Long CapacityRemain;

    /**
    * Purchased timestamp.
    */
    @SerializedName("BuyTime")
    @Expose
    private Long BuyTime;

    /**
    * Deadline timestamp.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get Package id. 
     * @return PackageId Package id.
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * Set Package id.
     * @param PackageId Package id.
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * Get Package type, 0 - outbound call package | 1 - 400 inbound call package. 
     * @return Type Package type, 0 - outbound call package | 1 - 400 inbound call package.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Package type, 0 - outbound call package | 1 - 400 inbound call package.
     * @param Type Package type, 0 - outbound call package | 1 - 400 inbound call package.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <TOTAL_PACKAGE>. 
     * @return CapacitySize <TOTAL_PACKAGE>.
     */
    public Long getCapacitySize() {
        return this.CapacitySize;
    }

    /**
     * Set <TOTAL_PACKAGE>.
     * @param CapacitySize <TOTAL_PACKAGE>.
     */
    public void setCapacitySize(Long CapacitySize) {
        this.CapacitySize = CapacitySize;
    }

    /**
     * Get Remaining package balance. 
     * @return CapacityRemain Remaining package balance.
     */
    public Long getCapacityRemain() {
        return this.CapacityRemain;
    }

    /**
     * Set Remaining package balance.
     * @param CapacityRemain Remaining package balance.
     */
    public void setCapacityRemain(Long CapacityRemain) {
        this.CapacityRemain = CapacityRemain;
    }

    /**
     * Get Purchased timestamp. 
     * @return BuyTime Purchased timestamp.
     */
    public Long getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set Purchased timestamp.
     * @param BuyTime Purchased timestamp.
     */
    public void setBuyTime(Long BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get Deadline timestamp. 
     * @return EndTime Deadline timestamp.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Deadline timestamp.
     * @param EndTime Deadline timestamp.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public PackageBuyInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PackageBuyInfo(PackageBuyInfo source) {
        if (source.PackageId != null) {
            this.PackageId = new String(source.PackageId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.CapacitySize != null) {
            this.CapacitySize = new Long(source.CapacitySize);
        }
        if (source.CapacityRemain != null) {
            this.CapacityRemain = new Long(source.CapacityRemain);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new Long(source.BuyTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CapacitySize", this.CapacitySize);
        this.setParamSimple(map, prefix + "CapacityRemain", this.CapacityRemain);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

