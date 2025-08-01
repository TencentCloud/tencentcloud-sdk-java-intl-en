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

public class TeoInstanceList extends AbstractModel {

    /**
    * The list of EDGEONE instances.	
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("InstanceList")
    @Expose
    private TeoInstanceDetail [] InstanceList;

    /**
    * The total number of EDGEONE instances.	
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Whether to query exceptions.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get The list of EDGEONE instances.	
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return InstanceList The list of EDGEONE instances.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TeoInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set The list of EDGEONE instances.	
Note: This field may return null, indicating that no valid values can be obtained.
     * @param InstanceList The list of EDGEONE instances.	
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setInstanceList(TeoInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get The total number of EDGEONE instances.	 
     * @return TotalCount The total number of EDGEONE instances.	
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set The total number of EDGEONE instances.	
     * @param TotalCount The total number of EDGEONE instances.	
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Whether to query exceptions.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Error Whether to query exceptions.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set Whether to query exceptions.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Error Whether to query exceptions.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public TeoInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TeoInstanceList(TeoInstanceList source) {
        if (source.InstanceList != null) {
            this.InstanceList = new TeoInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new TeoInstanceDetail(source.InstanceList[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Error != null) {
            this.Error = new String(source.Error);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "InstanceList.", this.InstanceList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Error", this.Error);

    }
}

