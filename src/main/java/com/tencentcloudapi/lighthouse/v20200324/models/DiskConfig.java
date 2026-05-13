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
    * <P>Availability zone.</p>.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>CLOUD disk type. valid values as follows:</p><li>CLOUD_BASIC: ordinary CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_SSD: SSD CLOUD disk</li>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * <P>Cloud block storage (cbs) saleable state.</p>.
    */
    @SerializedName("DiskSalesState")
    @Expose
    private String DiskSalesState;

    /**
    * <p>Maximum CBS size.</p><p>unit: GB</p>.
    */
    @SerializedName("MaxDiskSize")
    @Expose
    private Long MaxDiskSize;

    /**
    * <p>Minimum CBS disk size.</p><p>unit: GB</p>.
    */
    @SerializedName("MinDiskSize")
    @Expose
    private Long MinDiskSize;

    /**
    * <p>Cloud block storage (cbs) step length.</p><p>unit: GB</p>.
    */
    @SerializedName("DiskStepSize")
    @Expose
    private Long DiskStepSize;

    /**
     * Get <P>Availability zone.</p>. 
     * @return Zone <P>Availability zone.</p>.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <P>Availability zone.</p>.
     * @param Zone <P>Availability zone.</p>.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>CLOUD disk type. valid values as follows:</p><li>CLOUD_BASIC: ordinary CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_SSD: SSD CLOUD disk</li>. 
     * @return DiskType <p>CLOUD disk type. valid values as follows:</p><li>CLOUD_BASIC: ordinary CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_SSD: SSD CLOUD disk</li>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set <p>CLOUD disk type. valid values as follows:</p><li>CLOUD_BASIC: ordinary CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_SSD: SSD CLOUD disk</li>.
     * @param DiskType <p>CLOUD disk type. valid values as follows:</p><li>CLOUD_BASIC: ordinary CLOUD disk</li><li>CLOUD_PREMIUM: high-performance CLOUD block storage</li><li>CLOUD_SSD: SSD CLOUD disk</li>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get <P>Cloud block storage (cbs) saleable state.</p>. 
     * @return DiskSalesState <P>Cloud block storage (cbs) saleable state.</p>.
     */
    public String getDiskSalesState() {
        return this.DiskSalesState;
    }

    /**
     * Set <P>Cloud block storage (cbs) saleable state.</p>.
     * @param DiskSalesState <P>Cloud block storage (cbs) saleable state.</p>.
     */
    public void setDiskSalesState(String DiskSalesState) {
        this.DiskSalesState = DiskSalesState;
    }

    /**
     * Get <p>Maximum CBS size.</p><p>unit: GB</p>. 
     * @return MaxDiskSize <p>Maximum CBS size.</p><p>unit: GB</p>.
     */
    public Long getMaxDiskSize() {
        return this.MaxDiskSize;
    }

    /**
     * Set <p>Maximum CBS size.</p><p>unit: GB</p>.
     * @param MaxDiskSize <p>Maximum CBS size.</p><p>unit: GB</p>.
     */
    public void setMaxDiskSize(Long MaxDiskSize) {
        this.MaxDiskSize = MaxDiskSize;
    }

    /**
     * Get <p>Minimum CBS disk size.</p><p>unit: GB</p>. 
     * @return MinDiskSize <p>Minimum CBS disk size.</p><p>unit: GB</p>.
     */
    public Long getMinDiskSize() {
        return this.MinDiskSize;
    }

    /**
     * Set <p>Minimum CBS disk size.</p><p>unit: GB</p>.
     * @param MinDiskSize <p>Minimum CBS disk size.</p><p>unit: GB</p>.
     */
    public void setMinDiskSize(Long MinDiskSize) {
        this.MinDiskSize = MinDiskSize;
    }

    /**
     * Get <p>Cloud block storage (cbs) step length.</p><p>unit: GB</p>. 
     * @return DiskStepSize <p>Cloud block storage (cbs) step length.</p><p>unit: GB</p>.
     */
    public Long getDiskStepSize() {
        return this.DiskStepSize;
    }

    /**
     * Set <p>Cloud block storage (cbs) step length.</p><p>unit: GB</p>.
     * @param DiskStepSize <p>Cloud block storage (cbs) step length.</p><p>unit: GB</p>.
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

