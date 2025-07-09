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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationSimpleListInfoResp extends AbstractModel {

    /**
    * Total number of results.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List information
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataList")
    @Expose
    private ApplicationSimpleInfoResp [] DataList;

    /**
     * Get Total number of results.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of results.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of results.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of results.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List information
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataList List information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ApplicationSimpleInfoResp [] getDataList() {
        return this.DataList;
    }

    /**
     * Set List information
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataList List information
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataList(ApplicationSimpleInfoResp [] DataList) {
        this.DataList = DataList;
    }

    public ApplicationSimpleListInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationSimpleListInfoResp(ApplicationSimpleListInfoResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataList != null) {
            this.DataList = new ApplicationSimpleInfoResp[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new ApplicationSimpleInfoResp(source.DataList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "DataList.", this.DataList);

    }
}

