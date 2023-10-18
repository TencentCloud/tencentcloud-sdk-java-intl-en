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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTagsRequest extends AbstractModel {

    /**
    * CVM instance type.
<li>CVM: CVM</li>
<li>BM: CPM</li>
    */
    @SerializedName("MachineType")
    @Expose
    private String MachineType;

    /**
    * Server region, such as `ap-guangzhou` and `ap-shanghai`
    */
    @SerializedName("MachineRegion")
    @Expose
    private String MachineRegion;

    /**
     * Get CVM instance type.
<li>CVM: CVM</li>
<li>BM: CPM</li> 
     * @return MachineType CVM instance type.
<li>CVM: CVM</li>
<li>BM: CPM</li>
     */
    public String getMachineType() {
        return this.MachineType;
    }

    /**
     * Set CVM instance type.
<li>CVM: CVM</li>
<li>BM: CPM</li>
     * @param MachineType CVM instance type.
<li>CVM: CVM</li>
<li>BM: CPM</li>
     */
    public void setMachineType(String MachineType) {
        this.MachineType = MachineType;
    }

    /**
     * Get Server region, such as `ap-guangzhou` and `ap-shanghai` 
     * @return MachineRegion Server region, such as `ap-guangzhou` and `ap-shanghai`
     */
    public String getMachineRegion() {
        return this.MachineRegion;
    }

    /**
     * Set Server region, such as `ap-guangzhou` and `ap-shanghai`
     * @param MachineRegion Server region, such as `ap-guangzhou` and `ap-shanghai`
     */
    public void setMachineRegion(String MachineRegion) {
        this.MachineRegion = MachineRegion;
    }

    public DescribeTagsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTagsRequest(DescribeTagsRequest source) {
        if (source.MachineType != null) {
            this.MachineType = new String(source.MachineType);
        }
        if (source.MachineRegion != null) {
            this.MachineRegion = new String(source.MachineRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MachineType", this.MachineType);
        this.setParamSimple(map, prefix + "MachineRegion", this.MachineRegion);

    }
}

