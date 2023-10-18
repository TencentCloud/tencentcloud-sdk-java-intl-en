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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRegionDomainConf extends AbstractModel {

    /**
    * Region ID.
    */
    @SerializedName("RegionId")
    @Expose
    private String RegionId;

    /**
    * Region/country code for the nearest access, which can be obtained via the DescribeCountryAreaMapping API.
    */
    @SerializedName("NationCountryInnerList")
    @Expose
    private String [] NationCountryInnerList;

    /**
     * Get Region ID. 
     * @return RegionId Region ID.
     */
    public String getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region ID.
     * @param RegionId Region ID.
     */
    public void setRegionId(String RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Region/country code for the nearest access, which can be obtained via the DescribeCountryAreaMapping API. 
     * @return NationCountryInnerList Region/country code for the nearest access, which can be obtained via the DescribeCountryAreaMapping API.
     */
    public String [] getNationCountryInnerList() {
        return this.NationCountryInnerList;
    }

    /**
     * Set Region/country code for the nearest access, which can be obtained via the DescribeCountryAreaMapping API.
     * @param NationCountryInnerList Region/country code for the nearest access, which can be obtained via the DescribeCountryAreaMapping API.
     */
    public void setNationCountryInnerList(String [] NationCountryInnerList) {
        this.NationCountryInnerList = NationCountryInnerList;
    }

    public AccessRegionDomainConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccessRegionDomainConf(AccessRegionDomainConf source) {
        if (source.RegionId != null) {
            this.RegionId = new String(source.RegionId);
        }
        if (source.NationCountryInnerList != null) {
            this.NationCountryInnerList = new String[source.NationCountryInnerList.length];
            for (int i = 0; i < source.NationCountryInnerList.length; i++) {
                this.NationCountryInnerList[i] = new String(source.NationCountryInnerList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamArraySimple(map, prefix + "NationCountryInnerList.", this.NationCountryInnerList);

    }
}

