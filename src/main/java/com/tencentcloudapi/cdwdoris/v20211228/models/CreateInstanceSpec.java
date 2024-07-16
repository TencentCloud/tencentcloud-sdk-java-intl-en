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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInstanceSpec extends AbstractModel {

    /**
    * Specification name
    */
    @SerializedName("SpecName")
    @Expose
    private String SpecName;

    /**
    * Quantities
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Cloud disk size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
     * Get Specification name 
     * @return SpecName Specification name
     */
    public String getSpecName() {
        return this.SpecName;
    }

    /**
     * Set Specification name
     * @param SpecName Specification name
     */
    public void setSpecName(String SpecName) {
        this.SpecName = SpecName;
    }

    /**
     * Get Quantities 
     * @return Count Quantities
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantities
     * @param Count Quantities
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Cloud disk size 
     * @return DiskSize Cloud disk size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Cloud disk size
     * @param DiskSize Cloud disk size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    public CreateInstanceSpec() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInstanceSpec(CreateInstanceSpec source) {
        if (source.SpecName != null) {
            this.SpecName = new String(source.SpecName);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SpecName", this.SpecName);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);

    }
}

