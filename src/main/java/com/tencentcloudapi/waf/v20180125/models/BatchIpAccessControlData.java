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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchIpAccessControlData extends AbstractModel {

    /**
    * Total number
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Entries of blocklist/allowlist
    */
    @SerializedName("Res")
    @Expose
    private BatchIpAccessControlItem [] Res;

    /**
     * Get Total number 
     * @return TotalCount Total number
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number
     * @param TotalCount Total number
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Entries of blocklist/allowlist 
     * @return Res Entries of blocklist/allowlist
     */
    public BatchIpAccessControlItem [] getRes() {
        return this.Res;
    }

    /**
     * Set Entries of blocklist/allowlist
     * @param Res Entries of blocklist/allowlist
     */
    public void setRes(BatchIpAccessControlItem [] Res) {
        this.Res = Res;
    }

    public BatchIpAccessControlData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchIpAccessControlData(BatchIpAccessControlData source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Res != null) {
            this.Res = new BatchIpAccessControlItem[source.Res.length];
            for (int i = 0; i < source.Res.length; i++) {
                this.Res[i] = new BatchIpAccessControlItem(source.Res[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Res.", this.Res);

    }
}

