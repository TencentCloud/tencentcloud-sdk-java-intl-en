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
package com.tencentcloudapi.privatedns.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TldQuota extends AbstractModel{

    /**
    * Total quota
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Used quota
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
    * Available quota
    */
    @SerializedName("Stock")
    @Expose
    private Long Stock;

    /**
    * User’s quota
    */
    @SerializedName("Quota")
    @Expose
    private Long Quota;

    /**
     * Get Total quota 
     * @return Total Total quota
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Total quota
     * @param Total Total quota
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Used quota 
     * @return Used Used quota
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set Used quota
     * @param Used Used quota
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    /**
     * Get Available quota 
     * @return Stock Available quota
     */
    public Long getStock() {
        return this.Stock;
    }

    /**
     * Set Available quota
     * @param Stock Available quota
     */
    public void setStock(Long Stock) {
        this.Stock = Stock;
    }

    /**
     * Get User’s quota 
     * @return Quota User’s quota
     */
    public Long getQuota() {
        return this.Quota;
    }

    /**
     * Set User’s quota
     * @param Quota User’s quota
     */
    public void setQuota(Long Quota) {
        this.Quota = Quota;
    }

    public TldQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TldQuota(TldQuota source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
        if (source.Stock != null) {
            this.Stock = new Long(source.Stock);
        }
        if (source.Quota != null) {
            this.Quota = new Long(source.Quota);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Used", this.Used);
        this.setParamSimple(map, prefix + "Stock", this.Stock);
        this.setParamSimple(map, prefix + "Quota", this.Quota);

    }
}

