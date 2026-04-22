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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNGSensitiveAPIPermissionListResp extends AbstractModel {

    /**
    * <p>Total number of entries</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>List data</p>
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataList")
    @Expose
    private DescribeMNGSensitiveAPIPermissionListData [] DataList;

    /**
     * Get <p>Total number of entries</p> 
     * @return TotalCount <p>Total number of entries</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>Total number of entries</p>
     * @param TotalCount <p>Total number of entries</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>List data</p>
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataList <p>List data</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DescribeMNGSensitiveAPIPermissionListData [] getDataList() {
        return this.DataList;
    }

    /**
     * Set <p>List data</p>
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataList <p>List data</p>
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataList(DescribeMNGSensitiveAPIPermissionListData [] DataList) {
        this.DataList = DataList;
    }

    public DescribeMNGSensitiveAPIPermissionListResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNGSensitiveAPIPermissionListResp(DescribeMNGSensitiveAPIPermissionListResp source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.DataList != null) {
            this.DataList = new DescribeMNGSensitiveAPIPermissionListData[source.DataList.length];
            for (int i = 0; i < source.DataList.length; i++) {
                this.DataList[i] = new DescribeMNGSensitiveAPIPermissionListData(source.DataList[i]);
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

