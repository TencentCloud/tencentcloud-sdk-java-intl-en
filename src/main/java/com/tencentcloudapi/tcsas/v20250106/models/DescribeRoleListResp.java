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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRoleListResp extends AbstractModel {

    /**
    * Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * List data
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataList")
    @Expose
    private DescribeRoleListData [] DataList;

    /**
     * Get Total number of entries
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Total number of entries
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get List data
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataList List data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeRoleListData [] getDataList() {
        return this.DataList;
    }

    /**
     * Set List data
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataList List data
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataList(DescribeRoleListData [] DataList) {
        this.DataList = DataList;
    }

    public DescribeRoleListResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListResp(DescribeRoleListResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataList != null) {
            this.DataList = new DescribeRoleListData[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new DescribeRoleListData(source.DataList[i]);
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

