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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DiskConfig extends AbstractModel {

    /**
    * Availability zone.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Cloud disk type.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Cloud disk sale status.
    */
    @SerializedName("DiskSalesState")
    @Expose
    private String DiskSalesState;

    /**
    * Maximum cloud disk size.
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * Minimum cloud disk size.
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * Cloud disk increment.
    */
    @SerializedName("DiskStepSize")
    @Expose
    private Long DiskStepSize;

    /**
     * Get Availability zone. 
     * @return Zone Availability zone.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Availability zone.
     * @param Zone Availability zone.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Cloud disk type. 
     * @return DiskType Cloud disk type.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Cloud disk type.
     * @param DiskType Cloud disk type.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Cloud disk sale status. 
     * @return DiskSalesState Cloud disk sale status.
     */
    public String getDiskSalesState() {
        return this.DiskSalesState;
    }

    /**
     * Set Cloud disk sale status.
     * @param DiskSalesState Cloud disk sale status.
     */
    public void setDiskSalesState(String DiskSalesState) {
        this.DiskSalesState = DiskSalesState;
    }

    /**
     * Get Maximum cloud disk size. 
     * @return MaxDiskSize Maximum cloud disk size.
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set Maximum cloud disk size.
     * @param MaxDiskSize Maximum cloud disk size.
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get Minimum cloud disk size. 
     * @return MinDiskSize Minimum cloud disk size.
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set Minimum cloud disk size.
     * @param MinDiskSize Minimum cloud disk size.
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get Cloud disk increment. 
     * @return DiskStepSize Cloud disk increment.
     */
    public Long getDiskStepSize() {
        return this.DiskStepSize;
    }

    /**
     * Set Cloud disk increment.
     * @param DiskStepSize Cloud disk increment.
     */
    public void setDiskStepSize(Long DiskStepSize) {
        this.DiskStepSize = DiskStepSize;
    }

    public DiskConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DiskConfig(DiskConfig source) {
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSalesState != null) {
            this.DiskSalesState = new String(source.DiskSalesState);
        }
        if (source.MaxDiskSize != null) {
            this.MaxDiskSize = new Long(source.MaxDiskSize);
        }
        if (source.MinDiskSize != null) {
            this.MinDiskSize = new Long(source.MinDiskSize);
        }
        if (source.DiskStepSize != null) {
            this.DiskStepSize = new Long(source.DiskStepSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSalesState", this.DiskSalesState);
        this.setParamSimple(map, prefix + "MaxDiskSize", this.MaxDiskSize);
        this.setParamSimple(map, prefix + "MinDiskSize", this.MinDiskSize);
        this.setParamSimple(map, prefix + "DiskStepSize", this.DiskStepSize);

    }
}

