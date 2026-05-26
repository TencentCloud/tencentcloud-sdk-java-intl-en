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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Cdc extends AbstractModel {

    /**
    * 
    */
    @SerializedName("CageId")
    @Expose
    private String CageId;

    /**
    * Exclusive cluster status. value ranges from:<br><li>NORMAL: NORMAL;</li><br><li>CLOSED: CLOSED. at this time, the exclusive cluster will be unavailable to create new cloud disks;</li><br><li>FAULT: abnormal exclusive cluster status. at this point, the exclusive cluster will be inoperable, and the tencent cloud ops team will promptly fix the cluster;</li><br><li>ISOLATED: the exclusive cluster is ISOLATED due to not renewed timely. at this moment, the exclusive cluster will be unavailable to create new cloud disks, and the corresponding cloud disks will also be inoperable.</li>.
    */
    @SerializedName("CdcState")
    @Expose
    private String CdcState;

    /**
    * Specifies the AZ ID of the exclusive cluster.
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 
    */
    @SerializedName("CdcName")
    @Expose
    private String CdcName;

    /**
    * Specifies the capacity size of the dedicated cluster.
    */
    @SerializedName("CdcResource")
    @Expose
    private CdcSize CdcResource;

    /**
    * 
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * Exclusive cluster type. valid values: <br><li>CLOUD_BASIC: BASIC CLOUD disk cluster</li><br><li>CLOUD_PREMIUM: high-performance CLOUD block storage cluster</li><br><li>CLOUD_SSD: SSD CLOUD disk cluster.</li>.
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Expiry time of the dedicated cloud disk cluster.
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Creation time of the resource pool.
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * Number of cloud disks created in the current cluster.
    */
    @SerializedName("DiskNumber")
    @Expose
    private Long DiskNumber;

    /**
     * Get  
     * @return CageId 
     */
    public String getCageId() {
        return this.CageId;
    }

    /**
     * Set 
     * @param CageId 
     */
    public void setCageId(String CageId) {
        this.CageId = CageId;
    }

    /**
     * Get Exclusive cluster status. value ranges from:<br><li>NORMAL: NORMAL;</li><br><li>CLOSED: CLOSED. at this time, the exclusive cluster will be unavailable to create new cloud disks;</li><br><li>FAULT: abnormal exclusive cluster status. at this point, the exclusive cluster will be inoperable, and the tencent cloud ops team will promptly fix the cluster;</li><br><li>ISOLATED: the exclusive cluster is ISOLATED due to not renewed timely. at this moment, the exclusive cluster will be unavailable to create new cloud disks, and the corresponding cloud disks will also be inoperable.</li>. 
     * @return CdcState Exclusive cluster status. value ranges from:<br><li>NORMAL: NORMAL;</li><br><li>CLOSED: CLOSED. at this time, the exclusive cluster will be unavailable to create new cloud disks;</li><br><li>FAULT: abnormal exclusive cluster status. at this point, the exclusive cluster will be inoperable, and the tencent cloud ops team will promptly fix the cluster;</li><br><li>ISOLATED: the exclusive cluster is ISOLATED due to not renewed timely. at this moment, the exclusive cluster will be unavailable to create new cloud disks, and the corresponding cloud disks will also be inoperable.</li>.
     */
    public String getCdcState() {
        return this.CdcState;
    }

    /**
     * Set Exclusive cluster status. value ranges from:<br><li>NORMAL: NORMAL;</li><br><li>CLOSED: CLOSED. at this time, the exclusive cluster will be unavailable to create new cloud disks;</li><br><li>FAULT: abnormal exclusive cluster status. at this point, the exclusive cluster will be inoperable, and the tencent cloud ops team will promptly fix the cluster;</li><br><li>ISOLATED: the exclusive cluster is ISOLATED due to not renewed timely. at this moment, the exclusive cluster will be unavailable to create new cloud disks, and the corresponding cloud disks will also be inoperable.</li>.
     * @param CdcState Exclusive cluster status. value ranges from:<br><li>NORMAL: NORMAL;</li><br><li>CLOSED: CLOSED. at this time, the exclusive cluster will be unavailable to create new cloud disks;</li><br><li>FAULT: abnormal exclusive cluster status. at this point, the exclusive cluster will be inoperable, and the tencent cloud ops team will promptly fix the cluster;</li><br><li>ISOLATED: the exclusive cluster is ISOLATED due to not renewed timely. at this moment, the exclusive cluster will be unavailable to create new cloud disks, and the corresponding cloud disks will also be inoperable.</li>.
     */
    public void setCdcState(String CdcState) {
        this.CdcState = CdcState;
    }

    /**
     * Get Specifies the AZ ID of the exclusive cluster. 
     * @return Zone Specifies the AZ ID of the exclusive cluster.
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Specifies the AZ ID of the exclusive cluster.
     * @param Zone Specifies the AZ ID of the exclusive cluster.
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get  
     * @return CdcName 
     */
    public String getCdcName() {
        return this.CdcName;
    }

    /**
     * Set 
     * @param CdcName 
     */
    public void setCdcName(String CdcName) {
        this.CdcName = CdcName;
    }

    /**
     * Get Specifies the capacity size of the dedicated cluster. 
     * @return CdcResource Specifies the capacity size of the dedicated cluster.
     */
    public CdcSize getCdcResource() {
        return this.CdcResource;
    }

    /**
     * Set Specifies the capacity size of the dedicated cluster.
     * @param CdcResource Specifies the capacity size of the dedicated cluster.
     */
    public void setCdcResource(CdcSize CdcResource) {
        this.CdcResource = CdcResource;
    }

    /**
     * Get  
     * @return CdcId 
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set 
     * @param CdcId 
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get Exclusive cluster type. valid values: <br><li>CLOUD_BASIC: BASIC CLOUD disk cluster</li><br><li>CLOUD_PREMIUM: high-performance CLOUD block storage cluster</li><br><li>CLOUD_SSD: SSD CLOUD disk cluster.</li>. 
     * @return DiskType Exclusive cluster type. valid values: <br><li>CLOUD_BASIC: BASIC CLOUD disk cluster</li><br><li>CLOUD_PREMIUM: high-performance CLOUD block storage cluster</li><br><li>CLOUD_SSD: SSD CLOUD disk cluster.</li>.
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Exclusive cluster type. valid values: <br><li>CLOUD_BASIC: BASIC CLOUD disk cluster</li><br><li>CLOUD_PREMIUM: high-performance CLOUD block storage cluster</li><br><li>CLOUD_SSD: SSD CLOUD disk cluster.</li>.
     * @param DiskType Exclusive cluster type. valid values: <br><li>CLOUD_BASIC: BASIC CLOUD disk cluster</li><br><li>CLOUD_PREMIUM: high-performance CLOUD block storage cluster</li><br><li>CLOUD_SSD: SSD CLOUD disk cluster.</li>.
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Expiry time of the dedicated cloud disk cluster. 
     * @return ExpiredTime Expiry time of the dedicated cloud disk cluster.
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Expiry time of the dedicated cloud disk cluster.
     * @param ExpiredTime Expiry time of the dedicated cloud disk cluster.
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Creation time of the resource pool. 
     * @return CreatedTime Creation time of the resource pool.
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time of the resource pool.
     * @param CreatedTime Creation time of the resource pool.
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Number of cloud disks created in the current cluster. 
     * @return DiskNumber Number of cloud disks created in the current cluster.
     */
    public Long getDiskNumber() {
        return this.DiskNumber;
    }

    /**
     * Set Number of cloud disks created in the current cluster.
     * @param DiskNumber Number of cloud disks created in the current cluster.
     */
    public void setDiskNumber(Long DiskNumber) {
        this.DiskNumber = DiskNumber;
    }

    public Cdc() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Cdc(Cdc source) {
        if (source.CageId != null) {
            this.CageId = new String(source.CageId);
        }
        if (source.CdcState != null) {
            this.CdcState = new String(source.CdcState);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.CdcName != null) {
            this.CdcName = new String(source.CdcName);
        }
        if (source.CdcResource != null) {
            this.CdcResource = new CdcSize(source.CdcResource);
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.DiskNumber != null) {
            this.DiskNumber = new Long(source.DiskNumber);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CageId", this.CageId);
        this.setParamSimple(map, prefix + "CdcState", this.CdcState);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CdcName", this.CdcName);
        this.setParamObj(map, prefix + "CdcResource.", this.CdcResource);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "DiskNumber", this.DiskNumber);

    }
}

