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

public class DescribeStorageDataResponse extends AbstractModel{

    /**
    * Total number of current media files.
    */
    @SerializedName("MediaCount")
    @Expose
    private Long MediaCount;

    /**
    * Total current storage capacity in bytes.
    */
    @SerializedName("TotalStorage")
    @Expose
    private Long TotalStorage;

    /**
    * Current Standard storage capacity in bytes.
    */
    @SerializedName("StandardStorage")
    @Expose
    private Long StandardStorage;

    /**
    * Current Standard_IA storage capacity in bytes.
    */
    @SerializedName("InfrequentStorage")
    @Expose
    private Long InfrequentStorage;

    /**
    * The current ARCHIVE storage usage in bytes.
    */
    @SerializedName("ArchiveStorage")
    @Expose
    private Long ArchiveStorage;

    /**
    * The current DEEP ARCHIVE storage usage in bytes.
    */
    @SerializedName("DeepArchiveStorage")
    @Expose
    private Long DeepArchiveStorage;

    /**
    * Storage usage by billing region.
    */
    @SerializedName("StorageStat")
    @Expose
    private StorageStatData [] StorageStat;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total number of current media files. 
     * @return MediaCount Total number of current media files.
     */
    public Long getMediaCount() {
        return this.MediaCount;
    }

    /**
     * Set Total number of current media files.
     * @param MediaCount Total number of current media files.
     */
    public void setMediaCount(Long MediaCount) {
        this.MediaCount = MediaCount;
    }

    /**
     * Get Total current storage capacity in bytes. 
     * @return TotalStorage Total current storage capacity in bytes.
     */
    public Long getTotalStorage() {
        return this.TotalStorage;
    }

    /**
     * Set Total current storage capacity in bytes.
     * @param TotalStorage Total current storage capacity in bytes.
     */
    public void setTotalStorage(Long TotalStorage) {
        this.TotalStorage = TotalStorage;
    }

    /**
     * Get Current Standard storage capacity in bytes. 
     * @return StandardStorage Current Standard storage capacity in bytes.
     */
    public Long getStandardStorage() {
        return this.StandardStorage;
    }

    /**
     * Set Current Standard storage capacity in bytes.
     * @param StandardStorage Current Standard storage capacity in bytes.
     */
    public void setStandardStorage(Long StandardStorage) {
        this.StandardStorage = StandardStorage;
    }

    /**
     * Get Current Standard_IA storage capacity in bytes. 
     * @return InfrequentStorage Current Standard_IA storage capacity in bytes.
     */
    public Long getInfrequentStorage() {
        return this.InfrequentStorage;
    }

    /**
     * Set Current Standard_IA storage capacity in bytes.
     * @param InfrequentStorage Current Standard_IA storage capacity in bytes.
     */
    public void setInfrequentStorage(Long InfrequentStorage) {
        this.InfrequentStorage = InfrequentStorage;
    }

    /**
     * Get The current ARCHIVE storage usage in bytes. 
     * @return ArchiveStorage The current ARCHIVE storage usage in bytes.
     */
    public Long getArchiveStorage() {
        return this.ArchiveStorage;
    }

    /**
     * Set The current ARCHIVE storage usage in bytes.
     * @param ArchiveStorage The current ARCHIVE storage usage in bytes.
     */
    public void setArchiveStorage(Long ArchiveStorage) {
        this.ArchiveStorage = ArchiveStorage;
    }

    /**
     * Get The current DEEP ARCHIVE storage usage in bytes. 
     * @return DeepArchiveStorage The current DEEP ARCHIVE storage usage in bytes.
     */
    public Long getDeepArchiveStorage() {
        return this.DeepArchiveStorage;
    }

    /**
     * Set The current DEEP ARCHIVE storage usage in bytes.
     * @param DeepArchiveStorage The current DEEP ARCHIVE storage usage in bytes.
     */
    public void setDeepArchiveStorage(Long DeepArchiveStorage) {
        this.DeepArchiveStorage = DeepArchiveStorage;
    }

    /**
     * Get Storage usage by billing region. 
     * @return StorageStat Storage usage by billing region.
     */
    public StorageStatData [] getStorageStat() {
        return this.StorageStat;
    }

    /**
     * Set Storage usage by billing region.
     * @param StorageStat Storage usage by billing region.
     */
    public void setStorageStat(StorageStatData [] StorageStat) {
        this.StorageStat = StorageStat;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeStorageDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageDataResponse(DescribeStorageDataResponse source) {
        if (source.MediaCount != null) {
            this.MediaCount = new Long(source.MediaCount);
        }
        if (source.TotalStorage != null) {
            this.TotalStorage = new Long(source.TotalStorage);
        }
        if (source.StandardStorage != null) {
            this.StandardStorage = new Long(source.StandardStorage);
        }
        if (source.InfrequentStorage != null) {
            this.InfrequentStorage = new Long(source.InfrequentStorage);
        }
        if (source.ArchiveStorage != null) {
            this.ArchiveStorage = new Long(source.ArchiveStorage);
        }
        if (source.DeepArchiveStorage != null) {
            this.DeepArchiveStorage = new Long(source.DeepArchiveStorage);
        }
        if (source.StorageStat != null) {
            this.StorageStat = new StorageStatData[source.StorageStat.length];
            for (int i = 0; i < source.StorageStat.length; i++) {
                this.StorageStat[i] = new StorageStatData(source.StorageStat[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MediaCount", this.MediaCount);
        this.setParamSimple(map, prefix + "TotalStorage", this.TotalStorage);
        this.setParamSimple(map, prefix + "StandardStorage", this.StandardStorage);
        this.setParamSimple(map, prefix + "InfrequentStorage", this.InfrequentStorage);
        this.setParamSimple(map, prefix + "ArchiveStorage", this.ArchiveStorage);
        this.setParamSimple(map, prefix + "DeepArchiveStorage", this.DeepArchiveStorage);
        this.setParamArrayObj(map, prefix + "StorageStat.", this.StorageStat);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

