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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFile extends AbstractModel{

    /**
    * Unique ID of a backup file
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * Backup file name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File size in KB
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Name of the database corresponding to the backup file
    */
    @SerializedName("DBs")
    @Expose
    private String [] DBs;

    /**
    * Download address
    */
    @SerializedName("DownloadLink")
    @Expose
    private String DownloadLink;

    /**
    * The code of the region where current instance resides
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The target region and download address of cross-region backup
    */
    @SerializedName("CrossBackupAddr")
    @Expose
    private CrossBackupAddr [] CrossBackupAddr;

    /**
     * Get Unique ID of a backup file 
     * @return Id Unique ID of a backup file
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set Unique ID of a backup file
     * @param Id Unique ID of a backup file
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get Backup file name 
     * @return FileName Backup file name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Backup file name
     * @param FileName Backup file name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File size in KB 
     * @return Size File size in KB
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set File size in KB
     * @param Size File size in KB
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Name of the database corresponding to the backup file 
     * @return DBs Name of the database corresponding to the backup file
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * Set Name of the database corresponding to the backup file
     * @param DBs Name of the database corresponding to the backup file
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * Get Download address 
     * @return DownloadLink Download address
     */
    public String getDownloadLink() {
        return this.DownloadLink;
    }

    /**
     * Set Download address
     * @param DownloadLink Download address
     */
    public void setDownloadLink(String DownloadLink) {
        this.DownloadLink = DownloadLink;
    }

    /**
     * Get The code of the region where current instance resides 
     * @return Region The code of the region where current instance resides
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set The code of the region where current instance resides
     * @param Region The code of the region where current instance resides
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The target region and download address of cross-region backup 
     * @return CrossBackupAddr The target region and download address of cross-region backup
     */
    public CrossBackupAddr [] getCrossBackupAddr() {
        return this.CrossBackupAddr;
    }

    /**
     * Set The target region and download address of cross-region backup
     * @param CrossBackupAddr The target region and download address of cross-region backup
     */
    public void setCrossBackupAddr(CrossBackupAddr [] CrossBackupAddr) {
        this.CrossBackupAddr = CrossBackupAddr;
    }

    public BackupFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFile(BackupFile source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.DBs != null) {
            this.DBs = new String[source.DBs.length];
            for (int i = 0; i < source.DBs.length; i++) {
                this.DBs[i] = new String(source.DBs[i]);
            }
        }
        if (source.DownloadLink != null) {
            this.DownloadLink = new String(source.DownloadLink);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.CrossBackupAddr != null) {
            this.CrossBackupAddr = new CrossBackupAddr[source.CrossBackupAddr.length];
            for (int i = 0; i < source.CrossBackupAddr.length; i++) {
                this.CrossBackupAddr[i] = new CrossBackupAddr(source.CrossBackupAddr[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArraySimple(map, prefix + "DBs.", this.DBs);
        this.setParamSimple(map, prefix + "DownloadLink", this.DownloadLink);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamArrayObj(map, prefix + "CrossBackupAddr.", this.CrossBackupAddr);

    }
}

