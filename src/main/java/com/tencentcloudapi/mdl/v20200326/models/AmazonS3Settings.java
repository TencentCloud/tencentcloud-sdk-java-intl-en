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
package com.tencentcloudapi.mdl.v20200326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AmazonS3Settings extends AbstractModel {

    /**
    * Access key ID of the S3 sub-user.
    */
    @SerializedName("AccessKeyID")
    @Expose
    private String AccessKeyID;

    /**
    * Secret access key of the S3 sub-user.
    */
    @SerializedName("SecretAccessKey")
    @Expose
    private String SecretAccessKey;

    /**
    * S3 region.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Bucket name of S3.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * File output path, can be empty, starts and ends with / if not empty.
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * User-defined name supports 1 to 32 characters consisting of digits, letters, underscores (_), and hyphens (-).
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * File suffix only supports jpg.
    */
    @SerializedName("FileExt")
    @Expose
    private String FileExt;

    /**
    * Support [unix|utc0]. Default is unix.
    */
    @SerializedName("TimeFormat")
    @Expose
    private String TimeFormat;

    /**
     * Get Access key ID of the S3 sub-user. 
     * @return AccessKeyID Access key ID of the S3 sub-user.
     */
    public String getAccessKeyID() {
        return this.AccessKeyID;
    }

    /**
     * Set Access key ID of the S3 sub-user.
     * @param AccessKeyID Access key ID of the S3 sub-user.
     */
    public void setAccessKeyID(String AccessKeyID) {
        this.AccessKeyID = AccessKeyID;
    }

    /**
     * Get Secret access key of the S3 sub-user. 
     * @return SecretAccessKey Secret access key of the S3 sub-user.
     */
    public String getSecretAccessKey() {
        return this.SecretAccessKey;
    }

    /**
     * Set Secret access key of the S3 sub-user.
     * @param SecretAccessKey Secret access key of the S3 sub-user.
     */
    public void setSecretAccessKey(String SecretAccessKey) {
        this.SecretAccessKey = SecretAccessKey;
    }

    /**
     * Get S3 region. 
     * @return Region S3 region.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set S3 region.
     * @param Region S3 region.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Bucket name of S3. 
     * @return Bucket Bucket name of S3.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket name of S3.
     * @param Bucket Bucket name of S3.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get File output path, can be empty, starts and ends with / if not empty. 
     * @return FilePath File output path, can be empty, starts and ends with / if not empty.
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set File output path, can be empty, starts and ends with / if not empty.
     * @param FilePath File output path, can be empty, starts and ends with / if not empty.
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get User-defined name supports 1 to 32 characters consisting of digits, letters, underscores (_), and hyphens (-). 
     * @return FileName User-defined name supports 1 to 32 characters consisting of digits, letters, underscores (_), and hyphens (-).
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set User-defined name supports 1 to 32 characters consisting of digits, letters, underscores (_), and hyphens (-).
     * @param FileName User-defined name supports 1 to 32 characters consisting of digits, letters, underscores (_), and hyphens (-).
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get File suffix only supports jpg. 
     * @return FileExt File suffix only supports jpg.
     */
    public String getFileExt() {
        return this.FileExt;
    }

    /**
     * Set File suffix only supports jpg.
     * @param FileExt File suffix only supports jpg.
     */
    public void setFileExt(String FileExt) {
        this.FileExt = FileExt;
    }

    /**
     * Get Support [unix|utc0]. Default is unix. 
     * @return TimeFormat Support [unix|utc0]. Default is unix.
     */
    public String getTimeFormat() {
        return this.TimeFormat;
    }

    /**
     * Set Support [unix|utc0]. Default is unix.
     * @param TimeFormat Support [unix|utc0]. Default is unix.
     */
    public void setTimeFormat(String TimeFormat) {
        this.TimeFormat = TimeFormat;
    }

    public AmazonS3Settings() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AmazonS3Settings(AmazonS3Settings source) {
        if (source.AccessKeyID != null) {
            this.AccessKeyID = new String(source.AccessKeyID);
        }
        if (source.SecretAccessKey != null) {
            this.SecretAccessKey = new String(source.SecretAccessKey);
        }
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
        this.setParamSimple(map, prefix + "AccessKeyID", this.AccessKeyID);
        this.setParamSimple(map, prefix + "SecretAccessKey", this.SecretAccessKey);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileExt", this.FileExt);
        this.setParamSimple(map, prefix + "TimeFormat", this.TimeFormat);

    }
}

