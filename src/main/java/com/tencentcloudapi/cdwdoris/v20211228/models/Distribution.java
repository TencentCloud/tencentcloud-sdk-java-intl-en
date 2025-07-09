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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Distribution extends AbstractModel {

    /**
    * Bucket type:
●Hash: hash bucket
●Random: random number bucket

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DistributionType")
    @Expose
    private String DistributionType;

    /**
    * Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get Bucket type:
●Hash: hash bucket
●Random: random number bucket

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DistributionType Bucket type:
●Hash: hash bucket
●Random: random number bucket

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDistributionType() {
        return this.DistributionType;
    }

    /**
     * Set Bucket type:
●Hash: hash bucket
●Random: random number bucket

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DistributionType Bucket type:
●Hash: hash bucket
●Random: random number bucket

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDistributionType(String DistributionType) {
        this.DistributionType = DistributionType;
    }

    /**
     * Get Number of buckets
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Count Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Count Number of buckets
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public Distribution() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Distribution(Distribution source) {
        if (source.DistributionType != null) {
            this.DistributionType = new String(source.DistributionType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DistributionType", this.DistributionType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

