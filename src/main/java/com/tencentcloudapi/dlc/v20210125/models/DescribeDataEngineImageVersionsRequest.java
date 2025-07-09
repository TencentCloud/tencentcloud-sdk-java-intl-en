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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDataEngineImageVersionsRequest extends AbstractModel {

    /**
    * Types of engines: SQL, SparkBatch, StandardSpark, and StandardPresto
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 
    */
    @SerializedName("Sort")
    @Expose
    private String Sort;

    /**
    * 
    */
    @SerializedName("Asc")
    @Expose
    private Boolean Asc;

    /**
     * Get Types of engines: SQL, SparkBatch, StandardSpark, and StandardPresto 
     * @return EngineType Types of engines: SQL, SparkBatch, StandardSpark, and StandardPresto
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set Types of engines: SQL, SparkBatch, StandardSpark, and StandardPresto
     * @param EngineType Types of engines: SQL, SparkBatch, StandardSpark, and StandardPresto
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get  
     * @return Sort 
     */
    public String getSort() {
        return this.Sort;
    }

    /**
     * Set 
     * @param Sort 
     */
    public void setSort(String Sort) {
        this.Sort = Sort;
    }

    /**
     * Get  
     * @return Asc 
     */
    public Boolean getAsc() {
        return this.Asc;
    }

    /**
     * Set 
     * @param Asc 
     */
    public void setAsc(Boolean Asc) {
        this.Asc = Asc;
    }

    public DescribeDataEngineImageVersionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDataEngineImageVersionsRequest(DescribeDataEngineImageVersionsRequest source) {
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.Sort != null) {
            this.Sort = new String(source.Sort);
        }
        if (source.Asc != null) {
            this.Asc = new Boolean(source.Asc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "Sort", this.Sort);
        this.setParamSimple(map, prefix + "Asc", this.Asc);

    }
}

