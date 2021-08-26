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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosToken extends AbstractModel{

    /**
    * Unique request ID
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
    * Bucket name
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Bucket region
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Temporary key SecretId
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary key SecretKey
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * `sessionToken` of temporary key
    */
    @SerializedName("SessionToken")
    @Expose
    private String SessionToken;

    /**
    * Start time of temporary key acquisition
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * `ExpiredTime` of temporary key
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * Full package path
    */
    @SerializedName("FullPath")
    @Expose
    private String FullPath;

    /**
     * Get Unique request ID 
     * @return RequestId Unique request ID
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set Unique request ID
     * @param RequestId Unique request ID
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Get Bucket name 
     * @return Bucket Bucket name
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket name
     * @param Bucket Bucket name
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Bucket region 
     * @return Region Bucket region
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Bucket region
     * @param Region Bucket region
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Temporary key SecretId 
     * @return TmpSecretId Temporary key SecretId
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary key SecretId
     * @param TmpSecretId Temporary key SecretId
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary key SecretKey 
     * @return TmpSecretKey Temporary key SecretKey
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary key SecretKey
     * @param TmpSecretKey Temporary key SecretKey
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get `sessionToken` of temporary key 
     * @return SessionToken `sessionToken` of temporary key
     */
    public String getSessionToken() {
        return this.SessionToken;
    }

    /**
     * Set `sessionToken` of temporary key
     * @param SessionToken `sessionToken` of temporary key
     */
    public void setSessionToken(String SessionToken) {
        this.SessionToken = SessionToken;
    }

    /**
     * Get Start time of temporary key acquisition 
     * @return StartTime Start time of temporary key acquisition
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time of temporary key acquisition
     * @param StartTime Start time of temporary key acquisition
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get `ExpiredTime` of temporary key 
     * @return ExpiredTime `ExpiredTime` of temporary key
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set `ExpiredTime` of temporary key
     * @param ExpiredTime `ExpiredTime` of temporary key
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get Full package path 
     * @return FullPath Full package path
     */
    public String getFullPath() {
        return this.FullPath;
    }

    /**
     * Set Full package path
     * @param FullPath Full package path
     */
    public void setFullPath(String FullPath) {
        this.FullPath = FullPath;
    }

    public CosToken() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosToken(CosToken source) {
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.SessionToken != null) {
            this.SessionToken = new String(source.SessionToken);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.FullPath != null) {
            this.FullPath = new String(source.FullPath);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "SessionToken", this.SessionToken);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "FullPath", this.FullPath);

    }
}

