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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WrittenAdvancePolicy extends AbstractModel {

    /**
    * 
    */
    @SerializedName("CompactEnable")
    @Expose
    private String CompactEnable;

    /**
    * 
    */
    @SerializedName("DeleteEnable")
    @Expose
    private String DeleteEnable;

    /**
    * 
    */
    @SerializedName("MinInputFiles")
    @Expose
    private Long MinInputFiles;

    /**
    * 
    */
    @SerializedName("TargetFileSizeBytes")
    @Expose
    private Long TargetFileSizeBytes;

    /**
    * 
    */
    @SerializedName("RetainLast")
    @Expose
    private Long RetainLast;

    /**
    * 
    */
    @SerializedName("BeforeDays")
    @Expose
    private Long BeforeDays;

    /**
    * 
    */
    @SerializedName("ExpiredSnapshotsIntervalMin")
    @Expose
    private Long ExpiredSnapshotsIntervalMin;

    /**
    * 
    */
    @SerializedName("RemoveOrphanIntervalMin")
    @Expose
    private Long RemoveOrphanIntervalMin;

    /**
    * 
    */
    @SerializedName("CowCompactEnable")
    @Expose
    private String CowCompactEnable;

    /**
    * 
    */
    @SerializedName("CompactStrategy")
    @Expose
    private String CompactStrategy;

    /**
    * 
    */
    @SerializedName("SortOrders")
    @Expose
    private SortOrder [] SortOrders;

    /**
     * Get  
     * @return CompactEnable 
     */
    public String getCompactEnable() {
        return this.CompactEnable;
    }

    /**
     * Set 
     * @param CompactEnable 
     */
    public void setCompactEnable(String CompactEnable) {
        this.CompactEnable = CompactEnable;
    }

    /**
     * Get  
     * @return DeleteEnable 
     */
    public String getDeleteEnable() {
        return this.DeleteEnable;
    }

    /**
     * Set 
     * @param DeleteEnable 
     */
    public void setDeleteEnable(String DeleteEnable) {
        this.DeleteEnable = DeleteEnable;
    }

    /**
     * Get  
     * @return MinInputFiles 
     */
    public Long getMinInputFiles() {
        return this.MinInputFiles;
    }

    /**
     * Set 
     * @param MinInputFiles 
     */
    public void setMinInputFiles(Long MinInputFiles) {
        this.MinInputFiles = MinInputFiles;
    }

    /**
     * Get  
     * @return TargetFileSizeBytes 
     */
    public Long getTargetFileSizeBytes() {
        return this.TargetFileSizeBytes;
    }

    /**
     * Set 
     * @param TargetFileSizeBytes 
     */
    public void setTargetFileSizeBytes(Long TargetFileSizeBytes) {
        this.TargetFileSizeBytes = TargetFileSizeBytes;
    }

    /**
     * Get  
     * @return RetainLast 
     */
    public Long getRetainLast() {
        return this.RetainLast;
    }

    /**
     * Set 
     * @param RetainLast 
     */
    public void setRetainLast(Long RetainLast) {
        this.RetainLast = RetainLast;
    }

    /**
     * Get  
     * @return BeforeDays 
     */
    public Long getBeforeDays() {
        return this.BeforeDays;
    }

    /**
     * Set 
     * @param BeforeDays 
     */
    public void setBeforeDays(Long BeforeDays) {
        this.BeforeDays = BeforeDays;
    }

    /**
     * Get  
     * @return ExpiredSnapshotsIntervalMin 
     */
    public Long getExpiredSnapshotsIntervalMin() {
        return this.ExpiredSnapshotsIntervalMin;
    }

    /**
     * Set 
     * @param ExpiredSnapshotsIntervalMin 
     */
    public void setExpiredSnapshotsIntervalMin(Long ExpiredSnapshotsIntervalMin) {
        this.ExpiredSnapshotsIntervalMin = ExpiredSnapshotsIntervalMin;
    }

    /**
     * Get  
     * @return RemoveOrphanIntervalMin 
     */
    public Long getRemoveOrphanIntervalMin() {
        return this.RemoveOrphanIntervalMin;
    }

    /**
     * Set 
     * @param RemoveOrphanIntervalMin 
     */
    public void setRemoveOrphanIntervalMin(Long RemoveOrphanIntervalMin) {
        this.RemoveOrphanIntervalMin = RemoveOrphanIntervalMin;
    }

    /**
     * Get  
     * @return CowCompactEnable 
     */
    public String getCowCompactEnable() {
        return this.CowCompactEnable;
    }

    /**
     * Set 
     * @param CowCompactEnable 
     */
    public void setCowCompactEnable(String CowCompactEnable) {
        this.CowCompactEnable = CowCompactEnable;
    }

    /**
     * Get  
     * @return CompactStrategy 
     */
    public String getCompactStrategy() {
        return this.CompactStrategy;
    }

    /**
     * Set 
     * @param CompactStrategy 
     */
    public void setCompactStrategy(String CompactStrategy) {
        this.CompactStrategy = CompactStrategy;
    }

    /**
     * Get  
     * @return SortOrders 
     */
    public SortOrder [] getSortOrders() {
        return this.SortOrders;
    }

    /**
     * Set 
     * @param SortOrders 
     */
    public void setSortOrders(SortOrder [] SortOrders) {
        this.SortOrders = SortOrders;
    }

    public WrittenAdvancePolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WrittenAdvancePolicy(WrittenAdvancePolicy source) {
        if (source.CompactEnable != null) {
            this.CompactEnable = new String(source.CompactEnable);
        }
        if (source.DeleteEnable != null) {
            this.DeleteEnable = new String(source.DeleteEnable);
        }
        if (source.MinInputFiles != null) {
            this.MinInputFiles = new Long(source.MinInputFiles);
        }
        if (source.TargetFileSizeBytes != null) {
            this.TargetFileSizeBytes = new Long(source.TargetFileSizeBytes);
        }
        if (source.RetainLast != null) {
            this.RetainLast = new Long(source.RetainLast);
        }
        if (source.BeforeDays != null) {
            this.BeforeDays = new Long(source.BeforeDays);
        }
        if (source.ExpiredSnapshotsIntervalMin != null) {
            this.ExpiredSnapshotsIntervalMin = new Long(source.ExpiredSnapshotsIntervalMin);
        }
        if (source.RemoveOrphanIntervalMin != null) {
            this.RemoveOrphanIntervalMin = new Long(source.RemoveOrphanIntervalMin);
        }
        if (source.CowCompactEnable != null) {
            this.CowCompactEnable = new String(source.CowCompactEnable);
        }
        if (source.CompactStrategy != null) {
            this.CompactStrategy = new String(source.CompactStrategy);
        }
        if (source.SortOrders != null) {
            this.SortOrders = new SortOrder[source.SortOrders.length];
            for (int i = 0; i < source.SortOrders.length; i++) {
                this.SortOrders[i] = new SortOrder(source.SortOrders[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompactEnable", this.CompactEnable);
        this.setParamSimple(map, prefix + "DeleteEnable", this.DeleteEnable);
        this.setParamSimple(map, prefix + "MinInputFiles", this.MinInputFiles);
        this.setParamSimple(map, prefix + "TargetFileSizeBytes", this.TargetFileSizeBytes);
        this.setParamSimple(map, prefix + "RetainLast", this.RetainLast);
        this.setParamSimple(map, prefix + "BeforeDays", this.BeforeDays);
        this.setParamSimple(map, prefix + "ExpiredSnapshotsIntervalMin", this.ExpiredSnapshotsIntervalMin);
        this.setParamSimple(map, prefix + "RemoveOrphanIntervalMin", this.RemoveOrphanIntervalMin);
        this.setParamSimple(map, prefix + "CowCompactEnable", this.CowCompactEnable);
        this.setParamSimple(map, prefix + "CompactStrategy", this.CompactStrategy);
        this.setParamArrayObj(map, prefix + "SortOrders.", this.SortOrders);

    }
}

