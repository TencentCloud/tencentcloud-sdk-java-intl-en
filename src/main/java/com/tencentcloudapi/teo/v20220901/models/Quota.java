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

public class Quota extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Batch")
    @Expose
    private Long Batch;

    /**
    * Daily submission quota limit.
    */
    @SerializedName("Daily")
    @Expose
    private Long Daily;

    /**
    * Remaining daily submission quota.
    */
    @SerializedName("DailyAvailable")
    @Expose
    private Long DailyAvailable;

    /**
    * Type of cache purging/pre-warming. Values:
<li>`purge_prefix`: Purge by prefix</li>
<li>`purge_url`: Purge by URL</li>
<li>`purge_host`: Purge by hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by cache tag</li><li>`prefetch_url`: Pre-warm by URL</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get  
     * @return Batch 
     */
    public Long getBatch() {
        return this.Batch;
    }

    /**
     * Set 
     * @param Batch 
     */
    public void setBatch(Long Batch) {
        this.Batch = Batch;
    }

    /**
     * Get Daily submission quota limit. 
     * @return Daily Daily submission quota limit.
     */
    public Long getDaily() {
        return this.Daily;
    }

    /**
     * Set Daily submission quota limit.
     * @param Daily Daily submission quota limit.
     */
    public void setDaily(Long Daily) {
        this.Daily = Daily;
    }

    /**
     * Get Remaining daily submission quota. 
     * @return DailyAvailable Remaining daily submission quota.
     */
    public Long getDailyAvailable() {
        return this.DailyAvailable;
    }

    /**
     * Set Remaining daily submission quota.
     * @param DailyAvailable Remaining daily submission quota.
     */
    public void setDailyAvailable(Long DailyAvailable) {
        this.DailyAvailable = DailyAvailable;
    }

    /**
     * Get Type of cache purging/pre-warming. Values:
<li>`purge_prefix`: Purge by prefix</li>
<li>`purge_url`: Purge by URL</li>
<li>`purge_host`: Purge by hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by cache tag</li><li>`prefetch_url`: Pre-warm by URL</li> 
     * @return Type Type of cache purging/pre-warming. Values:
<li>`purge_prefix`: Purge by prefix</li>
<li>`purge_url`: Purge by URL</li>
<li>`purge_host`: Purge by hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by cache tag</li><li>`prefetch_url`: Pre-warm by URL</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Type of cache purging/pre-warming. Values:
<li>`purge_prefix`: Purge by prefix</li>
<li>`purge_url`: Purge by URL</li>
<li>`purge_host`: Purge by hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by cache tag</li><li>`prefetch_url`: Pre-warm by URL</li>
     * @param Type Type of cache purging/pre-warming. Values:
<li>`purge_prefix`: Purge by prefix</li>
<li>`purge_url`: Purge by URL</li>
<li>`purge_host`: Purge by hostname</li>
<li>`purge_all`: Purge all caches</li>
<li>`purge_cache_tag`: Purge by cache tag</li><li>`prefetch_url`: Pre-warm by URL</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public Quota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Quota(Quota source) {
        if (source.Batch != null) {
            this.Batch = new Long(source.Batch);
        }
        if (source.Daily != null) {
            this.Daily = new Long(source.Daily);
        }
        if (source.DailyAvailable != null) {
            this.DailyAvailable = new Long(source.DailyAvailable);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Batch", this.Batch);
        this.setParamSimple(map, prefix + "Daily", this.Daily);
        this.setParamSimple(map, prefix + "DailyAvailable", this.DailyAvailable);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

