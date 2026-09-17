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

public class AigcUsageDataItem extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Specification")
    @Expose
    private String Specification;

    /**
    * 
    */
    @SerializedName("DataSet")
    @Expose
    private TaskStatDataItem [] DataSet;

    /**
     * Get  
     * @return Specification 
     */
    public String getSpecification() {
        return this.Specification;
    }

    /**
     * Set 
     * @param Specification 
     */
    public void setSpecification(String Specification) {
        this.Specification = Specification;
    }

    /**
     * Get  
     * @return DataSet 
     */
    public TaskStatDataItem [] getDataSet() {
        return this.DataSet;
    }

    /**
     * Set 
     * @param DataSet 
     */
    public void setDataSet(TaskStatDataItem [] DataSet) {
        this.DataSet = DataSet;
    }

    public AigcUsageDataItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AigcUsageDataItem(AigcUsageDataItem source) {
        if (source.Specification != null) {
            this.Specification = new String(source.Specification);
        }
        if (source.DataSet != null) {
            this.DataSet = new TaskStatDataItem[source.DataSet.length];
            for (int i = 0; i < source.DataSet.length; i++) {
                this.DataSet[i] = new TaskStatDataItem(source.DataSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Specification", this.Specification);
        this.setParamArrayObj(map, prefix + "DataSet.", this.DataSet);

    }
}

