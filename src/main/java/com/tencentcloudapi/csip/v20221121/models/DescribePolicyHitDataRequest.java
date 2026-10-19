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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePolicyHitDataRequest extends AbstractModel {

    /**
    * Timestamp of the date and time to view
    */
    @SerializedName("IndexTimestamp")
    @Expose
    private Long IndexTimestamp;

    /**
    * Group Account Member ID
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get Timestamp of the date and time to view 
     * @return IndexTimestamp Timestamp of the date and time to view
     */
    public Long getIndexTimestamp() {
        return this.IndexTimestamp;
    }

    /**
     * Set Timestamp of the date and time to view
     * @param IndexTimestamp Timestamp of the date and time to view
     */
    public void setIndexTimestamp(Long IndexTimestamp) {
        this.IndexTimestamp = IndexTimestamp;
    }

    /**
     * Get Group Account Member ID 
     * @return MemberId Group Account Member ID
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set Group Account Member ID
     * @param MemberId Group Account Member ID
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public DescribePolicyHitDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePolicyHitDataRequest(DescribePolicyHitDataRequest source) {
        if (source.IndexTimestamp != null) {
            this.IndexTimestamp = new Long(source.IndexTimestamp);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IndexTimestamp", this.IndexTimestamp);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

