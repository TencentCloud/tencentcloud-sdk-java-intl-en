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
package com.tencentcloudapi.chdfs.v20201112.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Summary extends AbstractModel{

    /**
    * Capacity usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CapacityUsed")
    @Expose
    private Long CapacityUsed;

    /**
    * COS STANDARD storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("StandardCapacityUsed")
    @Expose
    private Long StandardCapacityUsed;

    /**
    * COS STANDARD_IA storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DegradeCapacityUsed")
    @Expose
    private Long DegradeCapacityUsed;

    /**
    * COS ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ArchiveCapacityUsed")
    @Expose
    private Long ArchiveCapacityUsed;

    /**
    * COS DEEP ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeepArchiveCapacityUsed")
    @Expose
    private Long DeepArchiveCapacityUsed;

    /**
    * COS INTELLIGENT TIERING storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("IntelligentCapacityUsed")
    @Expose
    private Long IntelligentCapacityUsed;

    /**
     * Get Capacity usage in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CapacityUsed Capacity usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getCapacityUsed() {
        return this.CapacityUsed;
    }

    /**
     * Set Capacity usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CapacityUsed Capacity usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCapacityUsed(Long CapacityUsed) {
        this.CapacityUsed = CapacityUsed;
    }

    /**
     * Get COS STANDARD storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return StandardCapacityUsed COS STANDARD storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getStandardCapacityUsed() {
        return this.StandardCapacityUsed;
    }

    /**
     * Set COS STANDARD storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param StandardCapacityUsed COS STANDARD storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setStandardCapacityUsed(Long StandardCapacityUsed) {
        this.StandardCapacityUsed = StandardCapacityUsed;
    }

    /**
     * Get COS STANDARD_IA storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DegradeCapacityUsed COS STANDARD_IA storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDegradeCapacityUsed() {
        return this.DegradeCapacityUsed;
    }

    /**
     * Set COS STANDARD_IA storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DegradeCapacityUsed COS STANDARD_IA storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDegradeCapacityUsed(Long DegradeCapacityUsed) {
        this.DegradeCapacityUsed = DegradeCapacityUsed;
    }

    /**
     * Get COS ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ArchiveCapacityUsed COS ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getArchiveCapacityUsed() {
        return this.ArchiveCapacityUsed;
    }

    /**
     * Set COS ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ArchiveCapacityUsed COS ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setArchiveCapacityUsed(Long ArchiveCapacityUsed) {
        this.ArchiveCapacityUsed = ArchiveCapacityUsed;
    }

    /**
     * Get COS DEEP ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeepArchiveCapacityUsed COS DEEP ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getDeepArchiveCapacityUsed() {
        return this.DeepArchiveCapacityUsed;
    }

    /**
     * Set COS DEEP ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeepArchiveCapacityUsed COS DEEP ARCHIVE storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDeepArchiveCapacityUsed(Long DeepArchiveCapacityUsed) {
        this.DeepArchiveCapacityUsed = DeepArchiveCapacityUsed;
    }

    /**
     * Get COS INTELLIGENT TIERING storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return IntelligentCapacityUsed COS INTELLIGENT TIERING storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getIntelligentCapacityUsed() {
        return this.IntelligentCapacityUsed;
    }

    /**
     * Set COS INTELLIGENT TIERING storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     * @param IntelligentCapacityUsed COS INTELLIGENT TIERING storage usage in bytes
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setIntelligentCapacityUsed(Long IntelligentCapacityUsed) {
        this.IntelligentCapacityUsed = IntelligentCapacityUsed;
    }

    public Summary() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Summary(Summary source) {
        if (source.CapacityUsed != null) {
            this.CapacityUsed = new Long(source.CapacityUsed);
        }
        if (source.StandardCapacityUsed != null) {
            this.StandardCapacityUsed = new Long(source.StandardCapacityUsed);
        }
        if (source.DegradeCapacityUsed != null) {
            this.DegradeCapacityUsed = new Long(source.DegradeCapacityUsed);
        }
        if (source.ArchiveCapacityUsed != null) {
            this.ArchiveCapacityUsed = new Long(source.ArchiveCapacityUsed);
        }
        if (source.DeepArchiveCapacityUsed != null) {
            this.DeepArchiveCapacityUsed = new Long(source.DeepArchiveCapacityUsed);
        }
        if (source.IntelligentCapacityUsed != null) {
            this.IntelligentCapacityUsed = new Long(source.IntelligentCapacityUsed);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CapacityUsed", this.CapacityUsed);
        this.setParamSimple(map, prefix + "StandardCapacityUsed", this.StandardCapacityUsed);
        this.setParamSimple(map, prefix + "DegradeCapacityUsed", this.DegradeCapacityUsed);
        this.setParamSimple(map, prefix + "ArchiveCapacityUsed", this.ArchiveCapacityUsed);
        this.setParamSimple(map, prefix + "DeepArchiveCapacityUsed", this.DeepArchiveCapacityUsed);
        this.setParamSimple(map, prefix + "IntelligentCapacityUsed", this.IntelligentCapacityUsed);

    }
}

