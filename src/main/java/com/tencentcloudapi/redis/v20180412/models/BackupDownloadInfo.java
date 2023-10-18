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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDownloadInfo extends AbstractModel {

    /**
    * Backup file name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Backup file size in bytes. If the parameter value is `0`, the backup file size is unknown.
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * Address (valid for six hours) used to download the backup file over the public network
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * Address (valid for six hours) used to download the backup file over the private network
    */
    @SerializedName("InnerDownloadUrl")
    @Expose
    private String InnerDownloadUrl;

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
     * Get Backup file size in bytes. If the parameter value is `0`, the backup file size is unknown. 
     * @return FileSize Backup file size in bytes. If the parameter value is `0`, the backup file size is unknown.
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set Backup file size in bytes. If the parameter value is `0`, the backup file size is unknown.
     * @param FileSize Backup file size in bytes. If the parameter value is `0`, the backup file size is unknown.
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get Address (valid for six hours) used to download the backup file over the public network 
     * @return DownloadUrl Address (valid for six hours) used to download the backup file over the public network
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set Address (valid for six hours) used to download the backup file over the public network
     * @param DownloadUrl Address (valid for six hours) used to download the backup file over the public network
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get Address (valid for six hours) used to download the backup file over the private network 
     * @return InnerDownloadUrl Address (valid for six hours) used to download the backup file over the private network
     */
    public String getInnerDownloadUrl() {
        return this.InnerDownloadUrl;
    }

    /**
     * Set Address (valid for six hours) used to download the backup file over the private network
     * @param InnerDownloadUrl Address (valid for six hours) used to download the backup file over the private network
     */
    public void setInnerDownloadUrl(String InnerDownloadUrl) {
        this.InnerDownloadUrl = InnerDownloadUrl;
    }

    public BackupDownloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupDownloadInfo(BackupDownloadInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.InnerDownloadUrl != null) {
            this.InnerDownloadUrl = new String(source.InnerDownloadUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "InnerDownloadUrl", this.InnerDownloadUrl);

    }
}

