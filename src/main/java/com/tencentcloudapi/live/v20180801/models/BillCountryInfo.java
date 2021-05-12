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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BillCountryInfo extends AbstractModel{

    /**
    * Country
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Detailed bandwidth information
    */
    @SerializedName("BandInfoList")
    @Expose
    private BillDataInfo [] BandInfoList;

    /**
     * Get Country 
     * @return Name Country
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Country
     * @param Name Country
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Detailed bandwidth information 
     * @return BandInfoList Detailed bandwidth information
     */
    public BillDataInfo [] getBandInfoList() {
        return this.BandInfoList;
    }

    /**
     * Set Detailed bandwidth information
     * @param BandInfoList Detailed bandwidth information
     */
    public void setBandInfoList(BillDataInfo [] BandInfoList) {
        this.BandInfoList = BandInfoList;
    }

    public BillCountryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BillCountryInfo(BillCountryInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.BandInfoList != null) {
            this.BandInfoList = new BillDataInfo[source.BandInfoList.length];
            for (int i = 0; i < source.BandInfoList.length; i++) {
                this.BandInfoList[i] = new BillDataInfo(source.BandInfoList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArrayObj(map, prefix + "BandInfoList.", this.BandInfoList);

    }
}

