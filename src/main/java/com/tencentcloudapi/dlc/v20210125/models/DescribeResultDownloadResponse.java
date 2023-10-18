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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResultDownloadResponse extends AbstractModel {

    /**
    * The file save path.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * The task status. Valid values: `init`, `queue`, `format`, `compress`, `success`, `timeout`, and `error`.
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * The task exception cause.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * The temporary secret ID.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * The temporary secret key.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * The temporary token.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get The file save path.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Path The file save path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set The file save path.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Path The file save path.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get The task status. Valid values: `init`, `queue`, `format`, `compress`, `success`, `timeout`, and `error`. 
     * @return Status The task status. Valid values: `init`, `queue`, `format`, `compress`, `success`, `timeout`, and `error`.
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set The task status. Valid values: `init`, `queue`, `format`, `compress`, `success`, `timeout`, and `error`.
     * @param Status The task status. Valid values: `init`, `queue`, `format`, `compress`, `success`, `timeout`, and `error`.
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get The task exception cause.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Reason The task exception cause.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set The task exception cause.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Reason The task exception cause.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get The temporary secret ID.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretId The temporary secret ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set The temporary secret ID.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretId The temporary secret ID.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get The temporary secret key.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SecretKey The temporary secret key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set The temporary secret key.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SecretKey The temporary secret key.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get The temporary token.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Token The temporary token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set The temporary token.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Token The temporary token.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setToken(String Token) {
        this.Token = Token;
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

    public DescribeResultDownloadResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResultDownloadResponse(DescribeResultDownloadResponse source) {
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

