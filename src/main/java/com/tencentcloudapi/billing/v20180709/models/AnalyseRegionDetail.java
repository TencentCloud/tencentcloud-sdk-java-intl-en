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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalyseRegionDetail extends AbstractModel {

    /**
    * Region ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region nameNote: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
     * Get Region ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionId Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param RegionId Region ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region nameNote: This field may return null, indicating that no valid values can be obtained. 
     * @return RegionName Region nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region nameNote: This field may return null, indicating that no valid values can be obtained.
     * @param RegionName Region nameNote: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    public AnalyseRegionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalyseRegionDetail(AnalyseRegionDetail source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);

    }
}

