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
    * CDN domain name details.	
    */
    @SerializedName("InstanceList")
    @Expose
    private CdnInstanceDetail [] InstanceList;

    /**
    * Whether to query exceptions.
    */
    @SerializedName("Error")
    @Expose
    private String Error;

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
     * Get CDN domain name details.	 
     * @return InstanceList CDN domain name details.	
     */
    public CdnInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set CDN domain name details.	
     * @param InstanceList CDN domain name details.	
     */
    public void setInstanceList(CdnInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get Whether to query exceptions. 
     * @return Error Whether to query exceptions.
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set Whether to query exceptions.
     * @param Error Whether to query exceptions.
     */
    public void setError(String Error) {
        this.Error = Error;
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
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

