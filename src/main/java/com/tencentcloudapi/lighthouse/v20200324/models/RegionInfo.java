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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo extends AbstractModel {

    /**
    * Region name, such as `ap-guangzhou`.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Region description, such as South China (Guangzhou).
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * Region availability status. Its value can only be `AVAILABLE`.
    */
    @SerializedName("RegionState")
    @Expose
    private String RegionState;

    /**
    * Whether the region is in the Chinese mainland
    */
    @SerializedName("IsChinaMainland")
    @Expose
    private Boolean IsChinaMainland;

    /**
     * Get Region name, such as `ap-guangzhou`. 
     * @return Region Region name, such as `ap-guangzhou`.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region name, such as `ap-guangzhou`.
     * @param Region Region name, such as `ap-guangzhou`.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Region description, such as South China (Guangzhou). 
     * @return RegionName Region description, such as South China (Guangzhou).
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set Region description, such as South China (Guangzhou).
     * @param RegionName Region description, such as South China (Guangzhou).
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get Region availability status. Its value can only be `AVAILABLE`. 
     * @return RegionState Region availability status. Its value can only be `AVAILABLE`.
     */
    public String getRegionState() {
        return this.RegionState;
    }

    /**
     * Set Region availability status. Its value can only be `AVAILABLE`.
     * @param RegionState Region availability status. Its value can only be `AVAILABLE`.
     */
    public void setRegionState(String RegionState) {
        this.RegionState = RegionState;
    }

    /**
     * Get Whether the region is in the Chinese mainland 
     * @return IsChinaMainland Whether the region is in the Chinese mainland
     */
    public Boolean getIsChinaMainland() {
        return this.IsChinaMainland;
    }

    /**
     * Set Whether the region is in the Chinese mainland
     * @param IsChinaMainland Whether the region is in the Chinese mainland
     */
    public void setIsChinaMainland(Boolean IsChinaMainland) {
        this.IsChinaMainland = IsChinaMainland;
    }

    public RegionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionInfo(RegionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.RegionState != null) {
            this.RegionState = new String(source.RegionState);
        }
        if (source.IsChinaMainland != null) {
            this.IsChinaMainland = new Boolean(source.IsChinaMainland);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamSimple(map, prefix + "RegionState", this.RegionState);
        this.setParamSimple(map, prefix + "IsChinaMainland", this.IsChinaMainland);

    }
}

