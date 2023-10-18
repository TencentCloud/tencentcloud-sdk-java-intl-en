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
package com.tencentcloudapi.ssm.v20190923.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSecretResponse extends AbstractModel {

    /**
    * Name of the new Secret.
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * ID of the new Secret version.
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * Return code of tag operation. `0`: success; `1`: internal error; `2`: business processing error
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * Return message of tag operation.
Note: This field may return `null`, indicating that no valid value was found.
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Name of the new Secret. 
     * @return SecretName Name of the new Secret.
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set Name of the new Secret.
     * @param SecretName Name of the new Secret.
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get ID of the new Secret version. 
     * @return VersionId ID of the new Secret version.
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set ID of the new Secret version.
     * @param VersionId ID of the new Secret version.
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get Return code of tag operation. `0`: success; `1`: internal error; `2`: business processing error
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TagCode Return code of tag operation. `0`: success; `1`: internal error; `2`: business processing error
Note: This field may return `null`, indicating that no valid value was found.
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set Return code of tag operation. `0`: success; `1`: internal error; `2`: business processing error
Note: This field may return `null`, indicating that no valid value was found.
     * @param TagCode Return code of tag operation. `0`: success; `1`: internal error; `2`: business processing error
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get Return message of tag operation.
Note: This field may return `null`, indicating that no valid value was found. 
     * @return TagMsg Return message of tag operation.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set Return message of tag operation.
Note: This field may return `null`, indicating that no valid value was found.
     * @param TagMsg Return message of tag operation.
Note: This field may return `null`, indicating that no valid value was found.
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
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

    public CreateSecretResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSecretResponse(CreateSecretResponse source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.TagCode != null) {
            this.TagCode = new Long(source.TagCode);
        }
        if (source.TagMsg != null) {
            this.TagMsg = new String(source.TagMsg);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

