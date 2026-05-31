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
    * Binlog filename
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size in bytes
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Transaction start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Transaction end time
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Binlog file ID
    */
    @SerializedName("BinlogId")
    @Expose
    private Long BinlogId;

    /**
    * binlog cross-region coverage
    */
    @SerializedName("CrossRegions")
    @Expose
    private String [] CrossRegions;

    /**
    * Backup delivery status
    */
    @SerializedName("CopyStatus")
    @Expose
    private String CopyStatus;

    /**
    * Safe info
    */
    @SerializedName("VaultInfos")
    @Expose
    private VaultInfo [] VaultInfos;

    /**
    * Encryption key
    */
    @SerializedName("EncryptKeyId")
    @Expose
    private String EncryptKeyId;

    /**
    * Encrypt key region
    */
    @SerializedName("EncryptRegion")
    @Expose
    private String EncryptRegion;

    /**
     * Get Binlog filename 
     * @return FileName Binlog filename
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Binlog filename
     * @param FileName Binlog filename
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size in bytes 
     * @return FileSize File size in bytes
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set File size in bytes
     * @param FileSize File size in bytes
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Transaction start time 
     * @return StartTime Transaction start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Transaction start time
     * @param StartTime Transaction start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Transaction end time 
     * @return FinishTime Transaction end time
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set Transaction end time
     * @param FinishTime Transaction end time
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Binlog file ID 
     * @return BinlogId Binlog file ID
     */
    public Long getBinlogId() {
        return this.BinlogId;
    }

    /**
     * Set Binlog file ID
     * @param BinlogId Binlog file ID
     */
    public void setBinlogId(Long BinlogId) {
        this.BinlogId = BinlogId;
    }

    /**
     * Get binlog cross-region coverage 
     * @return CrossRegions binlog cross-region coverage
     */
    public String [] getCrossRegions() {
        return this.CrossRegions;
    }

    /**
     * Set binlog cross-region coverage
     * @param CrossRegions binlog cross-region coverage
     */
    public void setCrossRegions(String [] CrossRegions) {
        this.CrossRegions = CrossRegions;
    }

    /**
     * Get Backup delivery status 
     * @return CopyStatus Backup delivery status
     */
    public String getCopyStatus() {
        return this.CopyStatus;
    }

    /**
     * Set Backup delivery status
     * @param CopyStatus Backup delivery status
     */
    public void setCopyStatus(String CopyStatus) {
        this.CopyStatus = CopyStatus;
    }

    /**
     * Get Safe info 
     * @return VaultInfos Safe info
     */
    public VaultInfo [] getVaultInfos() {
        return this.VaultInfos;
    }

    /**
     * Set Safe info
     * @param VaultInfos Safe info
     */
    public void setVaultInfos(VaultInfo [] VaultInfos) {
        this.VaultInfos = VaultInfos;
    }

    /**
     * Get Encryption key 
     * @return EncryptKeyId Encryption key
     */
    public String getEncryptKeyId() {
        return this.EncryptKeyId;
    }

    /**
     * Set Encryption key
     * @param EncryptKeyId Encryption key
     */
    public void setEncryptKeyId(String EncryptKeyId) {
        this.EncryptKeyId = EncryptKeyId;
    }

    /**
     * Get Encrypt key region 
     * @return EncryptRegion Encrypt key region
     */
    public String getEncryptRegion() {
        return this.EncryptRegion;
    }

    /**
     * Set Encrypt key region
     * @param EncryptRegion Encrypt key region
     */
    public void setEncryptRegion(String EncryptRegion) {
        this.EncryptRegion = EncryptRegion;
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

    }
}

