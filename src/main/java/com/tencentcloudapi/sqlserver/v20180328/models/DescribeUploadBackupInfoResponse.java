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

public class DescribeUploadBackupInfoResponse extends AbstractModel{

    /**
    * Bucket name
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * Bucket location information
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Storage path
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Temporary key ID
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary key (Key)
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * Temporary key (Token)
    */
    @SerializedName("XCosSecurityToken")
    @Expose
    private String XCosSecurityToken;

    /**
    * Temporary key start time
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Temporary key expiration time
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Bucket name 
     * @return BucketName Bucket name
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set Bucket name
     * @param BucketName Bucket name
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get Bucket location information 
     * @return Region Bucket location information
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Bucket location information
     * @param Region Bucket location information
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Storage path 
     * @return Path Storage path
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Storage path
     * @param Path Storage path
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Temporary key ID 
     * @return TmpSecretId Temporary key ID
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary key ID
     * @param TmpSecretId Temporary key ID
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary key (Key) 
     * @return TmpSecretKey Temporary key (Key)
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary key (Key)
     * @param TmpSecretKey Temporary key (Key)
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get Temporary key (Token) 
     * @return XCosSecurityToken Temporary key (Token)
     */
    public String getXCosSecurityToken() {
        return this.XCosSecurityToken;
    }

    /**
     * Set Temporary key (Token)
     * @param XCosSecurityToken Temporary key (Token)
     */
    public void setXCosSecurityToken(String XCosSecurityToken) {
        this.XCosSecurityToken = XCosSecurityToken;
    }

    /**
     * Get Temporary key start time 
     * @return StartTime Temporary key start time
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Temporary key start time
     * @param StartTime Temporary key start time
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Temporary key expiration time 
     * @return ExpiredTime Temporary key expiration time
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Temporary key expiration time
     * @param ExpiredTime Temporary key expiration time
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "XCosSecurityToken", this.XCosSecurityToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

