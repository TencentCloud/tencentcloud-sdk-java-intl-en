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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSUnblockQuota extends AbstractModel {

    /**
    * <p>Total quota of the number of unblocking times.</p>
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * <p>Total quota used.</p>
    */
    @SerializedName("UsedQuota")
    @Expose
    private Long UsedQuota;

    /**
    * <p>Start time when the quota takes effect.</p>
    */
    @SerializedName("QuotaStartTime")
    @Expose
    private String QuotaStartTime;

    /**
    * <p>End time when the quota takes effect.</p>
    */
    @SerializedName("QuotaEndTime")
    @Expose
    private String QuotaEndTime;

    /**
     * Get <p>Total quota of the number of unblocking times.</p> 
     * @return TotalQuota <p>Total quota of the number of unblocking times.</p>
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set <p>Total quota of the number of unblocking times.</p>
     * @param TotalQuota <p>Total quota of the number of unblocking times.</p>
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get <p>Total quota used.</p> 
     * @return UsedQuota <p>Total quota used.</p>
     */
    public Long getUsedQuota() {
        return this.UsedQuota;
    }

    /**
     * Set <p>Total quota used.</p>
     * @param UsedQuota <p>Total quota used.</p>
     */
    public void setUsedQuota(Long UsedQuota) {
        this.UsedQuota = UsedQuota;
    }

    /**
     * Get <p>Start time when the quota takes effect.</p> 
     * @return QuotaStartTime <p>Start time when the quota takes effect.</p>
     */
    public String getQuotaStartTime() {
        return this.QuotaStartTime;
    }

    /**
     * Set <p>Start time when the quota takes effect.</p>
     * @param QuotaStartTime <p>Start time when the quota takes effect.</p>
     */
    public void setQuotaStartTime(String QuotaStartTime) {
        this.QuotaStartTime = QuotaStartTime;
    }

    /**
     * Get <p>End time when the quota takes effect.</p> 
     * @return QuotaEndTime <p>End time when the quota takes effect.</p>
     */
    public String getQuotaEndTime() {
        return this.QuotaEndTime;
    }

    /**
     * Set <p>End time when the quota takes effect.</p>
     * @param QuotaEndTime <p>End time when the quota takes effect.</p>
     */
    public void setQuotaEndTime(String QuotaEndTime) {
        this.QuotaEndTime = QuotaEndTime;
    }

    public DDoSUnblockQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSUnblockQuota(DDoSUnblockQuota source) {
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.UsedQuota != null) {
            this.UsedQuota = new Long(source.UsedQuota);
        }
        if (source.QuotaStartTime != null) {
            this.QuotaStartTime = new String(source.QuotaStartTime);
        }
        if (source.QuotaEndTime != null) {
            this.QuotaEndTime = new String(source.QuotaEndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "UsedQuota", this.UsedQuota);
        this.setParamSimple(map, prefix + "QuotaStartTime", this.QuotaStartTime);
        this.setParamSimple(map, prefix + "QuotaEndTime", this.QuotaEndTime);

    }
}

