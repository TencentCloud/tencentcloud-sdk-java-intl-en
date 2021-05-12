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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageStatData extends AbstractModel{

    /**
    * VOD storage billing region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Current total storage capacity in bytes.
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * Current STANDARD_IA storage capacity in bytes.
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * Current STANDARD storage capacity in bytes.
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
     * Get VOD storage billing region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li> 
     * @return Area VOD storage billing region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set VOD storage billing region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
     * @param Area VOD storage billing region. Valid values:
<li>Chinese Mainland</li>
<li>Outside Chinese Mainland</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Current total storage capacity in bytes. 
     * @return TotalStorage Current total storage capacity in bytes.
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set Current total storage capacity in bytes.
     * @param TotalStorage Current total storage capacity in bytes.
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get Current STANDARD_IA storage capacity in bytes. 
     * @return InfrequentStorage Current STANDARD_IA storage capacity in bytes.
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set Current STANDARD_IA storage capacity in bytes.
     * @param InfrequentStorage Current STANDARD_IA storage capacity in bytes.
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get Current STANDARD storage capacity in bytes. 
     * @return StandardStorage Current STANDARD storage capacity in bytes.
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set Current STANDARD storage capacity in bytes.
     * @param StandardStorage Current STANDARD storage capacity in bytes.
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    public StorageStatData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StorageStatData(StorageStatData source) {
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
        if (source.TotalStorage != null) {
            this.TotalStorage = new Long(source.TotalStorage);
        }
        if (source.InfrequentStorage != null) {
            this.InfrequentStorage = new Long(source.InfrequentStorage);
        }
        if (source.StandardStorage != null) {
            this.StandardStorage = new Long(source.StandardStorage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "TotalStorage", this.TotalStorage);
        this.setParamSimple(map, prefix + "InfrequentStorage", this.InfrequentStorage);
        this.setParamSimple(map, prefix + "StandardStorage", this.StandardStorage);

    }
}

