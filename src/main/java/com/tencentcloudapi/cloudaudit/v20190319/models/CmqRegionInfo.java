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
package com.tencentcloudapi.cloudaudit.v20190319.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CmqRegionInfo extends AbstractModel{

    /**
    * Region description
    */
    @SerializedName("CmqRegionName")
    @Expose
    private String CmqRegionName;

    /**
    * CMQ region
    */
    @SerializedName("CmqRegion")
    @Expose
    private String CmqRegion;

    /**
     * Get Region description 
     * @return CmqRegionName Region description
     */
    public String getCmqRegionName() {
        return this.CmqRegionName;
    }

    /**
     * Set Region description
     * @param CmqRegionName Region description
     */
    public void setCmqRegionName(String CmqRegionName) {
        this.CmqRegionName = CmqRegionName;
    }

    /**
     * Get CMQ region 
     * @return CmqRegion CMQ region
     */
    public String getCmqRegion() {
        return this.CmqRegion;
    }

    /**
     * Set CMQ region
     * @param CmqRegion CMQ region
     */
    public void setCmqRegion(String CmqRegion) {
        this.CmqRegion = CmqRegion;
    }

    public CmqRegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CmqRegionInfo(CmqRegionInfo source) {
        if (source.CmqRegionName != null) {
            this.CmqRegionName = new String(source.CmqRegionName);
        }
        if (source.CmqRegion != null) {
            this.CmqRegion = new String(source.CmqRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CmqRegionName", this.CmqRegionName);
        this.setParamSimple(map, prefix + "CmqRegion", this.CmqRegion);

    }
}

