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
package com.tencentcloudapi.omics.v20221128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CVMOption extends AbstractModel {

    /**
    * CVM availability zone
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * CVM instance specifications
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
     * Get CVM availability zone 
     * @return Zone CVM availability zone
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set CVM availability zone
     * @param Zone CVM availability zone
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get CVM instance specifications 
     * @return InstanceType CVM instance specifications
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set CVM instance specifications
     * @param InstanceType CVM instance specifications
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    public CVMOption() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CVMOption(CVMOption source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

