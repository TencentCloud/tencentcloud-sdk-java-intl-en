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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosSettings extends AbstractModel {

    /**
    * Region of COS.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Bucket name of COS.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * File output path, which can be empty. If it is not empty, it  ends with /.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * User-defined name, supports alphanumeric characters, underscores, and hyphens, with a length between 1 and 32 characters.
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File suffix, only supports `jpg`.
    */
    @SerializedName("FileExt")
    @Expose
    private String FileExt;

    /**
    * Support `unix` or `utc0`, default unix.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get Region of COS. 
     * @return Region Region of COS.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region of COS.
     * @param Region Region of COS.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Bucket name of COS. 
     * @return Bucket Bucket name of COS.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket name of COS.
     * @param Bucket Bucket name of COS.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get File output path, which can be empty. If it is not empty, it  ends with /. 
     * @return FilePath File output path, which can be empty. If it is not empty, it  ends with /.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File output path, which can be empty. If it is not empty, it  ends with /.
     * @param FilePath File output path, which can be empty. If it is not empty, it  ends with /.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get User-defined name, supports alphanumeric characters, underscores, and hyphens, with a length between 1 and 32 characters. 
     * @return FileName User-defined name, supports alphanumeric characters, underscores, and hyphens, with a length between 1 and 32 characters.
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set User-defined name, supports alphanumeric characters, underscores, and hyphens, with a length between 1 and 32 characters.
     * @param FileName User-defined name, supports alphanumeric characters, underscores, and hyphens, with a length between 1 and 32 characters.
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File suffix, only supports `jpg`. 
     * @return FileExt File suffix, only supports `jpg`.
     */
    public String getFileExt() {
        return this.FileExt;
    }

    /**
     * Set File suffix, only supports `jpg`.
     * @param FileExt File suffix, only supports `jpg`.
     */
    public void setFileExt(String FileExt) {
        this.FileExt = FileExt;
    }

    /**
     * Get Support `unix` or `utc0`, default unix. 
     * @return TimeFormat Support `unix` or `utc0`, default unix.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Support `unix` or `utc0`, default unix.
     * @param TimeFormat Support `unix` or `utc0`, default unix.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    public CosSettings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosSettings(CosSettings source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileExt != null) {
            this.FileExt = new String(source.FileExt);
        }
        if (source.TimeFormat != null) {
            this.TimeFormat = new String(source.TimeFormat);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExt", this.FileExt);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

