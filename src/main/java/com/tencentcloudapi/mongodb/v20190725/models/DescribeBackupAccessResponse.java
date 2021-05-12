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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupAccessResponse extends AbstractModel{

    /**
    * Instance region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * The bucket where a backup file is located
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Storage information of a backup file
    */
    @SerializedName("Files")
    @Expose
    private BackupFile [] Files;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance region 
     * @return Region Instance region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance region
     * @param Region Instance region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get The bucket where a backup file is located 
     * @return Bucket The bucket where a backup file is located
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set The bucket where a backup file is located
     * @param Bucket The bucket where a backup file is located
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Storage information of a backup file 
     * @return Files Storage information of a backup file
     */
    public BackupFile [] getFiles() {
        return this.Files;
    }

    /**
     * Set Storage information of a backup file
     * @param Files Storage information of a backup file
     */
    public void setFiles(BackupFile [] Files) {
        this.Files = Files;
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

    public DescribeBackupAccessResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupAccessResponse(DescribeBackupAccessResponse source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Files != null) {
            this.Files = new BackupFile[source.Files.length];
            for (int i = 0; i < source.Files.length; i++) {
                this.Files[i] = new BackupFile(source.Files[i]);
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
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamArrayObj(map, prefix + "Files.", this.Files);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

