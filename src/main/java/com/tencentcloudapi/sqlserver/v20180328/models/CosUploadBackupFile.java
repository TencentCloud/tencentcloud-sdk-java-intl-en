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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosUploadBackupFile extends AbstractModel {

    /**
    * Backup name
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * Backup size
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get Backup name 
     * @return FileName Backup name
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Backup name
     * @param FileName Backup name
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get Backup size 
     * @return Size Backup size
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set Backup size
     * @param Size Backup size
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    public CosUploadBackupFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosUploadBackupFile(CosUploadBackupFile source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

