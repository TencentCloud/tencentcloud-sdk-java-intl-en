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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBinlogBackupOverviewResponse extends AbstractModel {

    /**
    * Total capacity of log backups in bytes (including remote log backups)
    */
    @SerializedName("BinlogBackupVolume")
    @Expose
    private Long BinlogBackupVolume;

    /**
    * Total number of log backups (include remote log backups)
    */
    @SerializedName("BinlogBackupCount")
    @Expose
    private Long BinlogBackupCount;

    /**
    * Capacity of remote log backups in bytes
    */
    @SerializedName("RemoteBinlogVolume")
    @Expose
    private Long RemoteBinlogVolume;

    /**
    * Number of remote backups
    */
    @SerializedName("RemoteBinlogCount")
    @Expose
    private Long RemoteBinlogCount;

    /**
    * Capacity of archive log backups in bytes
    */
    @SerializedName("BinlogArchiveVolume")
    @Expose
    private Long BinlogArchiveVolume;

    /**
    * Number of archived log backups
    */
    @SerializedName("BinlogArchiveCount")
    @Expose
    private Long BinlogArchiveCount;

    /**
    * Log backup capacity of standard storage in bytes
    */
    @SerializedName("BinlogStandbyVolume")
    @Expose
    private Long BinlogStandbyVolume;

    /**
    * Number of log backups of standard storage
    */
    @SerializedName("BinlogStandbyCount")
    @Expose
    private Long BinlogStandbyCount;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Total capacity of log backups in bytes (including remote log backups) 
     * @return BinlogBackupVolume Total capacity of log backups in bytes (including remote log backups)
     */
    public Long getBinlogBackupVolume() {
        return this.BinlogBackupVolume;
    }

    /**
     * Set Total capacity of log backups in bytes (including remote log backups)
     * @param BinlogBackupVolume Total capacity of log backups in bytes (including remote log backups)
     */
    public void setBinlogBackupVolume(Long BinlogBackupVolume) {
        this.BinlogBackupVolume = BinlogBackupVolume;
    }

    /**
     * Get Total number of log backups (include remote log backups) 
     * @return BinlogBackupCount Total number of log backups (include remote log backups)
     */
    public Long getBinlogBackupCount() {
        return this.BinlogBackupCount;
    }

    /**
     * Set Total number of log backups (include remote log backups)
     * @param BinlogBackupCount Total number of log backups (include remote log backups)
     */
    public void setBinlogBackupCount(Long BinlogBackupCount) {
        this.BinlogBackupCount = BinlogBackupCount;
    }

    /**
     * Get Capacity of remote log backups in bytes 
     * @return RemoteBinlogVolume Capacity of remote log backups in bytes
     */
    public Long getRemoteBinlogVolume() {
        return this.RemoteBinlogVolume;
    }

    /**
     * Set Capacity of remote log backups in bytes
     * @param RemoteBinlogVolume Capacity of remote log backups in bytes
     */
    public void setRemoteBinlogVolume(Long RemoteBinlogVolume) {
        this.RemoteBinlogVolume = RemoteBinlogVolume;
    }

    /**
     * Get Number of remote backups 
     * @return RemoteBinlogCount Number of remote backups
     */
    public Long getRemoteBinlogCount() {
        return this.RemoteBinlogCount;
    }

    /**
     * Set Number of remote backups
     * @param RemoteBinlogCount Number of remote backups
     */
    public void setRemoteBinlogCount(Long RemoteBinlogCount) {
        this.RemoteBinlogCount = RemoteBinlogCount;
    }

    /**
     * Get Capacity of archive log backups in bytes 
     * @return BinlogArchiveVolume Capacity of archive log backups in bytes
     */
    public Long getBinlogArchiveVolume() {
        return this.BinlogArchiveVolume;
    }

    /**
     * Set Capacity of archive log backups in bytes
     * @param BinlogArchiveVolume Capacity of archive log backups in bytes
     */
    public void setBinlogArchiveVolume(Long BinlogArchiveVolume) {
        this.BinlogArchiveVolume = BinlogArchiveVolume;
    }

    /**
     * Get Number of archived log backups 
     * @return BinlogArchiveCount Number of archived log backups
     */
    public Long getBinlogArchiveCount() {
        return this.BinlogArchiveCount;
    }

    /**
     * Set Number of archived log backups
     * @param BinlogArchiveCount Number of archived log backups
     */
    public void setBinlogArchiveCount(Long BinlogArchiveCount) {
        this.BinlogArchiveCount = BinlogArchiveCount;
    }

    /**
     * Get Log backup capacity of standard storage in bytes 
     * @return BinlogStandbyVolume Log backup capacity of standard storage in bytes
     */
    public Long getBinlogStandbyVolume() {
        return this.BinlogStandbyVolume;
    }

    /**
     * Set Log backup capacity of standard storage in bytes
     * @param BinlogStandbyVolume Log backup capacity of standard storage in bytes
     */
    public void setBinlogStandbyVolume(Long BinlogStandbyVolume) {
        this.BinlogStandbyVolume = BinlogStandbyVolume;
    }

    /**
     * Get Number of log backups of standard storage 
     * @return BinlogStandbyCount Number of log backups of standard storage
     */
    public Long getBinlogStandbyCount() {
        return this.BinlogStandbyCount;
    }

    /**
     * Set Number of log backups of standard storage
     * @param BinlogStandbyCount Number of log backups of standard storage
     */
    public void setBinlogStandbyCount(Long BinlogStandbyCount) {
        this.BinlogStandbyCount = BinlogStandbyCount;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeBinlogBackupOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBinlogBackupOverviewResponse(DescribeBinlogBackupOverviewResponse source) {
        if (source.BinlogBackupVolume != null) {
            this.BinlogBackupVolume = new Long(source.BinlogBackupVolume);
        }
        if (source.BinlogBackupCount != null) {
            this.BinlogBackupCount = new Long(source.BinlogBackupCount);
        }
        if (source.RemoteBinlogVolume != null) {
            this.RemoteBinlogVolume = new Long(source.RemoteBinlogVolume);
        }
        if (source.RemoteBinlogCount != null) {
            this.RemoteBinlogCount = new Long(source.RemoteBinlogCount);
        }
        if (source.BinlogArchiveVolume != null) {
            this.BinlogArchiveVolume = new Long(source.BinlogArchiveVolume);
        }
        if (source.BinlogArchiveCount != null) {
            this.BinlogArchiveCount = new Long(source.BinlogArchiveCount);
        }
        if (source.BinlogStandbyVolume != null) {
            this.BinlogStandbyVolume = new Long(source.BinlogStandbyVolume);
        }
        if (source.BinlogStandbyCount != null) {
            this.BinlogStandbyCount = new Long(source.BinlogStandbyCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BinlogBackupVolume", this.BinlogBackupVolume);
        this.setParamSimple(map, prefix + "BinlogBackupCount", this.BinlogBackupCount);
        this.setParamSimple(map, prefix + "RemoteBinlogVolume", this.RemoteBinlogVolume);
        this.setParamSimple(map, prefix + "RemoteBinlogCount", this.RemoteBinlogCount);
        this.setParamSimple(map, prefix + "BinlogArchiveVolume", this.BinlogArchiveVolume);
        this.setParamSimple(map, prefix + "BinlogArchiveCount", this.BinlogArchiveCount);
        this.setParamSimple(map, prefix + "BinlogStandbyVolume", this.BinlogStandbyVolume);
        this.setParamSimple(map, prefix + "BinlogStandbyCount", this.BinlogStandbyCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

