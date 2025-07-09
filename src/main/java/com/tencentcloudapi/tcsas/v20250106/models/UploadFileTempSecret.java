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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFileTempSecret extends AbstractModel {

    /**
    * Bucket
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * Region
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * Destination of upload
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * Temporary secret ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TempSecretId")
    @Expose
    private String TempSecretId;

    /**
    * Temporary secret key
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TempSecretKey")
    @Expose
    private String TempSecretKey;

    /**
    * Token 
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * Whether to enable global acceleration. Valid values: 0 (no), 1 (yes)
    */
    @SerializedName("AccelerateEnable")
    @Expose
    private Long AccelerateEnable;

    /**
     * Get Bucket
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Bucket Bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set Bucket
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Bucket Bucket
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get Region
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Region Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set Region
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Region Region
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get Destination of upload
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path Destination of upload
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set Destination of upload
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path Destination of upload
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get Temporary secret ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TempSecretId Temporary secret ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTempSecretId() {
        return this.TempSecretId;
    }

    /**
     * Set Temporary secret ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TempSecretId Temporary secret ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTempSecretId(String TempSecretId) {
        this.TempSecretId = TempSecretId;
    }

    /**
     * Get Temporary secret key
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TempSecretKey Temporary secret key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTempSecretKey() {
        return this.TempSecretKey;
    }

    /**
     * Set Temporary secret key
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TempSecretKey Temporary secret key
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTempSecretKey(String TempSecretKey) {
        this.TempSecretKey = TempSecretKey;
    }

    /**
     * Get Token 
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Token Token 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set Token 
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Token Token 
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get Whether to enable global acceleration. Valid values: 0 (no), 1 (yes) 
     * @return AccelerateEnable Whether to enable global acceleration. Valid values: 0 (no), 1 (yes)
     */
    public Long getAccelerateEnable() {
        return this.AccelerateEnable;
    }

    /**
     * Set Whether to enable global acceleration. Valid values: 0 (no), 1 (yes)
     * @param AccelerateEnable Whether to enable global acceleration. Valid values: 0 (no), 1 (yes)
     */
    public void setAccelerateEnable(Long AccelerateEnable) {
        this.AccelerateEnable = AccelerateEnable;
    }

    public UploadFileTempSecret() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFileTempSecret(UploadFileTempSecret source) {
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.TempSecretId != null) {
            this.TempSecretId = new String(source.TempSecretId);
        }
        if (source.TempSecretKey != null) {
            this.TempSecretKey = new String(source.TempSecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.AccelerateEnable != null) {
            this.AccelerateEnable = new Long(source.AccelerateEnable);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "TempSecretId", this.TempSecretId);
        this.setParamSimple(map, prefix + "TempSecretKey", this.TempSecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "AccelerateEnable", this.AccelerateEnable);

    }
}

