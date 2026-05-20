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

public class GAAPInstanceList extends AbstractModel {

    /**
    * Instance details
    */
    @SerializedName("InstanceList")
    @Expose
    private GAAPInstanceDetail [] InstanceList;

    /**
    * Total number.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Error message	
    */
    @SerializedName("Error")
    @Expose
    private String Error;

    /**
     * Get Instance details 
     * @return InstanceList Instance details
     */
    public GAAPInstanceDetail [] getInstanceList() {
        return this.InstanceList;
    }

    /**
     * Set Instance details
     * @param InstanceList Instance details
     */
    public void setInstanceList(GAAPInstanceDetail [] InstanceList) {
        this.InstanceList = InstanceList;
    }

    /**
     * Get Total number. 
     * @return TotalCount Total number.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Total number.
     * @param TotalCount Total number.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Error message	 
     * @return Error Error message	
     */
    public String getError() {
        return this.Error;
    }

    /**
     * Set Error message	
     * @param Error Error message	
     */
    public void setError(String Error) {
        this.Error = Error;
    }

    public GAAPInstanceList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GAAPInstanceList(GAAPInstanceList source) {
        if (source.InstanceList != null) {
            this.InstanceList = new GAAPInstanceDetail[source.InstanceList.length];
            for (int i = 0; i < source.InstanceList.length; i++) {
                this.InstanceList[i] = new GAAPInstanceDetail(source.InstanceList[i]);
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

