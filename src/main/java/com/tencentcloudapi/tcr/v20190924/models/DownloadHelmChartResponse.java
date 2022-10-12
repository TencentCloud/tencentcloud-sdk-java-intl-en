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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadHelmChartResponse extends AbstractModel{

    /**
    * Temporary token
    */
    @SerializedName("TmpToken")
    @Expose
    private String TmpToken;

    /**
    * Temporary `secretId`
    */
    @SerializedName("TmpSecretId")
    @Expose
    private String TmpSecretId;

    /**
    * Temporary `secretKey`
    */
    @SerializedName("TmpSecretKey")
    @Expose
    private String TmpSecretKey;

    /**
    * Bucket information
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Instance ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Chart information
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Start timestamp
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * Token expiration timestamp
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Temporary token 
     * @return TmpToken Temporary token
     */
    public String getTmpToken() {
        return this.TmpToken;
    }

    /**
     * Set Temporary token
     * @param TmpToken Temporary token
     */
    public void setTmpToken(String TmpToken) {
        this.TmpToken = TmpToken;
    }

    /**
     * Get Temporary `secretId` 
     * @return TmpSecretId Temporary `secretId`
     */
    public String getTmpSecretId() {
        return this.TmpSecretId;
    }

    /**
     * Set Temporary `secretId`
     * @param TmpSecretId Temporary `secretId`
     */
    public void setTmpSecretId(String TmpSecretId) {
        this.TmpSecretId = TmpSecretId;
    }

    /**
     * Get Temporary `secretKey` 
     * @return TmpSecretKey Temporary `secretKey`
     */
    public String getTmpSecretKey() {
        return this.TmpSecretKey;
    }

    /**
     * Set Temporary `secretKey`
     * @param TmpSecretKey Temporary `secretKey`
     */
    public void setTmpSecretKey(String TmpSecretKey) {
        this.TmpSecretKey = TmpSecretKey;
    }

    /**
     * Get Bucket information 
     * @return Bucket Bucket information
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket information
     * @param Bucket Bucket information
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Instance ID 
     * @return Region Instance ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Instance ID
     * @param Region Instance ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Chart information 
     * @return Path Chart information
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Chart information
     * @param Path Chart information
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Start timestamp 
     * @return StartTime Start timestamp
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start timestamp
     * @param StartTime Start timestamp
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Token expiration timestamp 
     * @return ExpiredTime Token expiration timestamp
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set Token expiration timestamp
     * @param ExpiredTime Token expiration timestamp
     */
    public void setExpiredTime(Long ExpiredTime) {
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

    public DownloadHelmChartResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadHelmChartResponse(DownloadHelmChartResponse source) {
        if (source.TmpToken != null) {
            this.TmpToken = new String(source.TmpToken);
        }
        if (source.TmpSecretId != null) {
            this.TmpSecretId = new String(source.TmpSecretId);
        }
        if (source.TmpSecretKey != null) {
            this.TmpSecretKey = new String(source.TmpSecretKey);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TmpToken", this.TmpToken);
        this.setParamSimple(map, prefix + "TmpSecretId", this.TmpSecretId);
        this.setParamSimple(map, prefix + "TmpSecretKey", this.TmpSecretKey);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

