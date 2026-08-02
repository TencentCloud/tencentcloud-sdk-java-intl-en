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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogItem extends AbstractModel {

    /**
    * <p>Binlog filename</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>File size, measurement unit: byte</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>Earliest transaction time</p>
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * <p>Latest transaction time</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * <p>Binlog file ID</p>
    */
    @SerializedName("BinlogId")
    @Expose
    private Long BinlogId;

    /**
    * <p>Cross-regional binlog</p>
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * <p>Backup delivery status</p>
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * <p>Safe information</p>
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * <p>Encryption key</p>
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * <p>Key region for encryption</p>
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
    * <p>Geographical distribution of backups</p>
    */
    @SerializedName("ExistRegions")
    @Expose
    private BinlogRegionInfo [] ExistRegions;

    /**
     * Get <p>Binlog filename</p> 
     * @return FileName <p>Binlog filename</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>Binlog filename</p>
     * @param FileName <p>Binlog filename</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>File size, measurement unit: byte</p> 
     * @return FileSize <p>File size, measurement unit: byte</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>File size, measurement unit: byte</p>
     * @param FileSize <p>File size, measurement unit: byte</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get <p>Earliest transaction time</p> 
     * @return StartTime <p>Earliest transaction time</p>
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>Earliest transaction time</p>
     * @param StartTime <p>Earliest transaction time</p>
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>Latest transaction time</p> 
     * @return FinishTime <p>Latest transaction time</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>Latest transaction time</p>
     * @param FinishTime <p>Latest transaction time</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get <p>Binlog file ID</p> 
     * @return BinlogId <p>Binlog file ID</p>
     */
    public Long getBinlogId() {
        return this.BinlogId;
    }

    /**
     * Set <p>Binlog file ID</p>
     * @param BinlogId <p>Binlog file ID</p>
     */
    public void setBinlogId(Long BinlogId) {
        this.BinlogId = BinlogId;
    }

    /**
     * Get <p>Cross-regional binlog</p> 
     * @return CrossRegions <p>Cross-regional binlog</p>
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set <p>Cross-regional binlog</p>
     * @param CrossRegions <p>Cross-regional binlog</p>
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get <p>Backup delivery status</p> 
     * @return CopyStatus <p>Backup delivery status</p>
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set <p>Backup delivery status</p>
     * @param CopyStatus <p>Backup delivery status</p>
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get <p>Safe information</p> 
     * @return VaultInfos <p>Safe information</p>
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set <p>Safe information</p>
     * @param VaultInfos <p>Safe information</p>
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get <p>Encryption key</p> 
     * @return EncryptKeyId <p>Encryption key</p>
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set <p>Encryption key</p>
     * @param EncryptKeyId <p>Encryption key</p>
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get <p>Key region for encryption</p> 
     * @return EncryptRegion <p>Key region for encryption</p>
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set <p>Key region for encryption</p>
     * @param EncryptRegion <p>Key region for encryption</p>
     */
    public void setEncryptRegion(String EncryptRegion) {
        this.EncryptRegion = EncryptRegion;
    }

    /**
     * Get <p>Geographical distribution of backups</p> 
     * @return ExistRegions <p>Geographical distribution of backups</p>
     */
    public BinlogRegionInfo [] getExistRegions() {
        return this.ExistRegions;
    }

    /**
     * Set <p>Geographical distribution of backups</p>
     * @param ExistRegions <p>Geographical distribution of backups</p>
     */
    public void setExistRegions(BinlogRegionInfo [] ExistRegions) {
        this.ExistRegions = ExistRegions;
    }

    public BinlogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogItem(BinlogItem source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.BinlogId != null) {
            this.BinlogId = new Long(source.BinlogId);
        }
        if (source.CrossRegions != null) {
            this.CrossRegions = new String[source.CrossRegions.length];
            for (int i = 0; i < source.CrossRegions.length; i++) {
                this.CrossRegions[i] = new String(source.CrossRegions[i]);
            }
        }
        if (source.CopyStatus != null) {
            this.CopyStatus = new String(source.CopyStatus);
        }
        if (source.VaultInfos != null) {
            this.VaultInfos = new VaultInfo[source.VaultInfos.length];
            for (int i = 0; i < source.VaultInfos.length; i++) {
                this.VaultInfos[i] = new VaultInfo(source.VaultInfos[i]);
            }
        }
        if (source.EncryptKeyId != null) {
            this.EncryptKeyId = new String(source.EncryptKeyId);
        }
        if (source.EncryptRegion != null) {
            this.EncryptRegion = new String(source.EncryptRegion);
        }
        if (source.ExistRegions != null) {
            this.ExistRegions = new BinlogRegionInfo[source.ExistRegions.length];
            for (int i = 0; i < source.ExistRegions.length; i++) {
                this.ExistRegions[i] = new BinlogRegionInfo(source.ExistRegions[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "BinlogId", this.BinlogId);
        this.setParamArraySimple(map, prefix + "CrossRegions.", this.CrossRegions);
        this.setParamSimple(map, prefix + "CopyStatus", this.CopyStatus);
        this.setParamArrayObj(map, prefix + "VaultInfos.", this.VaultInfos);
        this.setParamSimple(map, prefix + "EncryptKeyId", this.EncryptKeyId);
        this.setParamSimple(map, prefix + "EncryptRegion", this.EncryptRegion);
        this.setParamArrayObj(map, prefix + "ExistRegions.", this.ExistRegions);

    }
}

