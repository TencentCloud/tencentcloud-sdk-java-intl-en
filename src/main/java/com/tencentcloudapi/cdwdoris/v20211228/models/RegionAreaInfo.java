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

public class RegionAreaInfo extends AbstractModel {

    /**
    * Region category information, such as south_china, east_china, etc.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Description of the corresponding Name, such as South China, East China, etc.
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * Specific region list 1
    */
    @SerializedName("Regions")
    @Expose
    private RegionInfo [] Regions;

    /**
     * Get Region category information, such as south_china, east_china, etc. 
     * @return Name Region category information, such as south_china, east_china, etc.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Region category information, such as south_china, east_china, etc.
     * @param Name Region category information, such as south_china, east_china, etc.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Description of the corresponding Name, such as South China, East China, etc. 
     * @return Desc Description of the corresponding Name, such as South China, East China, etc.
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set Description of the corresponding Name, such as South China, East China, etc.
     * @param Desc Description of the corresponding Name, such as South China, East China, etc.
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get Specific region list 1 
     * @return Regions Specific region list 1
     */
    public RegionInfo [] getRegions() {
        return this.Regions;
    }

    /**
     * Set Specific region list 1
     * @param Regions Specific region list 1
     */
    public void setRegions(RegionInfo [] Regions) {
        this.Regions = Regions;
    }

    public RegionAreaInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RegionAreaInfo(RegionAreaInfo source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.Regions != null) {
            this.Regions = new RegionInfo[source.Regions.length];
            for (int i = 0; i < source.Regions.length; i++) {
                this.Regions[i] = new RegionInfo(source.Regions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamArrayObj(map, prefix + "Regions.", this.Regions);

    }
}

