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

public class TSEInstanceList extends AbstractModel {

    /**
    * TSE instance details
Note: This field may return null, indicating that no valid value can be obtained.
    */
    @SerializedName("InstanceList")
    @Expose
    private TSEInstanceDetail [] InstanceList;

    /**
    * Total TSE instances in this region	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Region	
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
     * Get TSE instance details
Note: This field may return null, indicating that no valid value can be obtained. 
     * @return InstanceList TSE instance details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public TSEInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set TSE instance details
Note: This field may return null, indicating that no valid value can be obtained.
     * @param InstanceList TSE instance details
Note: This field may return null, indicating that no valid value can be obtained.
     */
    public void setInstanceList(TSEInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get Total TSE instances in this region	 
     * @return TotalCount Total TSE instances in this region	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total TSE instances in this region	
     * @param TotalCount Total TSE instances in this region	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Region	 
     * @return Region Region	
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region	
     * @param Region Region	
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    public TSEInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TSEInstanceList(TSEInstanceList source) {
        if (source.InstanceList != null) {
            this.InstanceList = new TSEInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new TSEInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Region", this.Region);

    }
}

