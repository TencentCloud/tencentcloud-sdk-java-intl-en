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
    * Billing region of VOD storage. Possible values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * Current total storage capacity, in bytes.
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * Current infrequent access storage capacity, in bytes.
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * Current standard storage capacity, in bytes.
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
    * Current archive storage capacity, in bytes.
    */
    @SerializedName("ArchiveStorage")
    @Expose
    private Long ArchiveStorage;

    /**
    * Current deep archive storage capacity, in bytes.
    */
    @SerializedName("DeepArchiveStorage")
    @Expose
    private Long DeepArchiveStorage;

    /**
     * Get Billing region of VOD storage. Possible values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li> 
     * @return Area Billing region of VOD storage. Possible values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set Billing region of VOD storage. Possible values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     * @param Area Billing region of VOD storage. Possible values:
<li>Chinese Mainland: within the Chinese mainland (excluding Hong Kong (China), Macao (China), and Taiwan (China)).</li>
<li>Outside Chinese Mainland: outside the Chinese mainland.</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * Get Current total storage capacity, in bytes. 
     * @return TotalStorage Current total storage capacity, in bytes.
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set Current total storage capacity, in bytes.
     * @param TotalStorage Current total storage capacity, in bytes.
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get Current infrequent access storage capacity, in bytes. 
     * @return InfrequentStorage Current infrequent access storage capacity, in bytes.
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set Current infrequent access storage capacity, in bytes.
     * @param InfrequentStorage Current infrequent access storage capacity, in bytes.
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get Current standard storage capacity, in bytes. 
     * @return StandardStorage Current standard storage capacity, in bytes.
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set Current standard storage capacity, in bytes.
     * @param StandardStorage Current standard storage capacity, in bytes.
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    /**
     * Get Current archive storage capacity, in bytes. 
     * @return ArchiveStorage Current archive storage capacity, in bytes.
     */
    public Long getArchiveStorage() {
        return this.ArchiveStorage;
    }

    /**
     * Set Current archive storage capacity, in bytes.
     * @param ArchiveStorage Current archive storage capacity, in bytes.
     */
    public void setArchiveStorage(Long ArchiveStorage) {
        this.ArchiveStorage = ArchiveStorage;
    }

    /**
     * Get Current deep archive storage capacity, in bytes. 
     * @return DeepArchiveStorage Current deep archive storage capacity, in bytes.
     */
    public Long getDeepArchiveStorage() {
        return this.DeepArchiveStorage;
    }

    /**
     * Set Current deep archive storage capacity, in bytes.
     * @param DeepArchiveStorage Current deep archive storage capacity, in bytes.
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

