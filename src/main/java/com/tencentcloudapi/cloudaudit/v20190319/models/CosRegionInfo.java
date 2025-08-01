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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosRegionInfo extends AbstractModel {

    /**
    * COS region
    */
    @SerializedName("CosRegion")
    @Expose
    private String CosRegion;

    /**
    * Region description
    */
    @SerializedName("CosRegionName")
    @Expose
    private String CosRegionName;

    /**
     * Get COS region 
     * @return CosRegion COS region
     */
    public String getCosRegion() {
        return this.CosRegion;
    }

    /**
     * Set COS region
     * @param CosRegion COS region
     */
    public void setCosRegion(String CosRegion) {
        this.CosRegion = CosRegion;
    }

    /**
     * Get Region description 
     * @return CosRegionName Region description
     */
    public String getCosRegionName() {
        return this.CosRegionName;
    }

    /**
     * Set Region description
     * @param CosRegionName Region description
     */
    public void setCosRegionName(String CosRegionName) {
        this.CosRegionName = CosRegionName;
    }

    public CosRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosRegionInfo(CosRegionInfo source) {
        if (source.CosRegion != null) {
            this.CosRegion = new String(source.CosRegion);
        }
        if (source.CosRegionName != null) {
            this.CosRegionName = new String(source.CosRegionName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosRegion", this.CosRegion);
        this.setParamSimple(map, prefix + "CosRegionName", this.CosRegionName);

    }
}

