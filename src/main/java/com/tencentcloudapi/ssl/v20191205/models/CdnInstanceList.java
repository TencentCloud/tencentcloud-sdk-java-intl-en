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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CdnInstanceList extends AbstractModel {

    /**
    * The total number of CDN domains in this region.	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * The list of CDN domains.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceList")
    @Expose
    private CdnInstanceDetail [] InstanceList;

    /**
     * Get The total number of CDN domains in this region.	 
     * @return TotalCount The total number of CDN domains in this region.	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of CDN domains in this region.	
     * @param TotalCount The total number of CDN domains in this region.	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get The list of CDN domains.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceList The list of CDN domains.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public CdnInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set The list of CDN domains.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceList The list of CDN domains.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceList(CdnInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    public CdnInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CdnInstanceList(CdnInstanceList source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.InstanceList != null) {
            this.InstanceList = new CdnInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new CdnInstanceDetail(source.InstanceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);

    }
}

