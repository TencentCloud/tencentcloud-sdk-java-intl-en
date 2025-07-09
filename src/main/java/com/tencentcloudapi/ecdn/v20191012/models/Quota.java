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
package com.tencentcloudapi.ecdn.v20191012.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Quota extends AbstractModel {

    /**
    * Quota limit for one batch submission request.
    */
    @SerializedName("Batch")
    @Expose
    private Long Batch;

    /**
    * Daily submission quota limit.
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * Remaining daily submission quota.
    */
    @SerializedName("Available")
    @Expose
    private Long Available;

    /**
     * Get Quota limit for one batch submission request. 
     * @return Batch Quota limit for one batch submission request.
     */
    public Long getBatch() {
        return this.Batch;
    }

    /**
     * Set Quota limit for one batch submission request.
     * @param Batch Quota limit for one batch submission request.
     */
    public void setBatch(Long Batch) {
        this.Batch = Batch;
    }

    /**
     * Get Daily submission quota limit. 
     * @return Total Daily submission quota limit.
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set Daily submission quota limit.
     * @param Total Daily submission quota limit.
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get Remaining daily submission quota. 
     * @return Available Remaining daily submission quota.
     */
    public Long getAvailable() {
        return this.Available;
    }

    /**
     * Set Remaining daily submission quota.
     * @param Available Remaining daily submission quota.
     */
    public void setAvailable(Long Available) {
        this.Available = Available;
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
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Available != null) {
            this.Available = new Long(source.Available);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Batch", this.Batch);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Available", this.Available);

    }
}

