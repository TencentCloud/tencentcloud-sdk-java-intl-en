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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpecificationDataItem extends AbstractModel {

    /**
    * Task specification.
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * Statistics.
    */
    @SerializedName("Data")
    @Expose
    private TaskStatDataItem [] Data;

    /**
     * Get Task specification. 
     * @return Specification Task specification.
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set Task specification.
     * @param Specification Task specification.
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get Statistics. 
     * @return Data Statistics.
     */
    public TaskStatDataItem [] getData() {
        return this.Data;
    }

    /**
     * Set Statistics.
     * @param Data Statistics.
     */
    public void setData(TaskStatDataItem [] Data) {
        this.Data = Data;
    }

    public SpecificationDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpecificationDataItem(SpecificationDataItem source) {
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.Data != null) {
            this.Data = new TaskStatDataItem[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new TaskStatDataItem(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

