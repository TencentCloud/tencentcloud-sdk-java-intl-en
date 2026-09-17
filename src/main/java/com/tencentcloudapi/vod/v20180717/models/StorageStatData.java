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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StorageStatData extends AbstractModel {

    /**
    * 
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * 
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * 
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
    * 
    */
    @SerializedName("ArchiveStorage")
    @Expose
    private Long ArchiveStorage;

    /**
    * 
    */
    @SerializedName("DeepArchiveStorage")
    @Expose
    private Long DeepArchiveStorage;

    /**
     * Get  
     * @return Area 
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 
     * @param Area 
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get  
     * @return TotalStorage 
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set 
     * @param TotalStorage 
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get  
     * @return InfrequentStorage 
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set 
     * @param InfrequentStorage 
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get  
     * @return StandardStorage 
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set 
     * @param StandardStorage 
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    /**
     * Get  
     * @return ArchiveStorage 
     */
    public Long getArchiveStorage() {
        return this.ArchiveStorage;
    }

    /**
     * Set 
     * @param ArchiveStorage 
     */
    public void setArchiveStorage(Long ArchiveStorage) {
        this.ArchiveStorage = ArchiveStorage;
    }

    /**
     * Get  
     * @return DeepArchiveStorage 
     */
    public Long getDeepArchiveStorage() {
        return this.DeepArchiveStorage;
    }

    /**
     * Set 
     * @param DeepArchiveStorage 
     */
    public void setDeepArchiveStorage(Long DeepArchiveStorage) {
        this.DeepArchiveStorage = DeepArchiveStorage;
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
        if (source.ArchiveStorage != null) {
            this.ArchiveStorage = new Long(source.ArchiveStorage);
        }
        if (source.DeepArchiveStorage != null) {
            this.DeepArchiveStorage = new Long(source.DeepArchiveStorage);
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
        this.setParamSimple(map, prefix + "ArchiveStorage", this.ArchiveStorage);
        this.setParamSimple(map, prefix + "DeepArchiveStorage", this.DeepArchiveStorage);

    }
}

