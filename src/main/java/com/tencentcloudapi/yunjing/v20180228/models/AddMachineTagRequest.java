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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddMachineTagRequest extends AbstractModel {

    /**
    * Server ID
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
    * Tag ID
    */
    @SerializedName("TagId")
    @Expose
    private Long TagId;

    /**
    * Server region
    */
    @SerializedName("MRegion")
    @Expose
    private String MRegion;

    /**
    * Server type (`CVM` or `BM`)
    */
    @SerializedName("MArea")
    @Expose
    private String MArea;

    /**
     * Get Server ID 
     * @return Quuid Server ID
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set Server ID
     * @param Quuid Server ID
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    /**
     * Get Tag ID 
     * @return TagId Tag ID
     */
    public Long getTagId() {
        return this.TagId;
    }

    /**
     * Set Tag ID
     * @param TagId Tag ID
     */
    public void setTagId(Long TagId) {
        this.TagId = TagId;
    }

    /**
     * Get Server region 
     * @return MRegion Server region
     */
    public String getMRegion() {
        return this.MRegion;
    }

    /**
     * Set Server region
     * @param MRegion Server region
     */
    public void setMRegion(String MRegion) {
        this.MRegion = MRegion;
    }

    /**
     * Get Server type (`CVM` or `BM`) 
     * @return MArea Server type (`CVM` or `BM`)
     */
    public String getMArea() {
        return this.MArea;
    }

    /**
     * Set Server type (`CVM` or `BM`)
     * @param MArea Server type (`CVM` or `BM`)
     */
    public void setMArea(String MArea) {
        this.MArea = MArea;
    }

    public AddMachineTagRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AddMachineTagRequest(AddMachineTagRequest source) {
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
        if (source.TagId != null) {
            this.TagId = new Long(source.TagId);
        }
        if (source.MRegion != null) {
            this.MRegion = new String(source.MRegion);
        }
        if (source.MArea != null) {
            this.MArea = new String(source.MArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "MRegion", this.MRegion);
        this.setParamSimple(map, prefix + "MArea", this.MArea);

    }
}

