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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateWhiteBoxKeyResponse extends AbstractModel {

    /**
    * Base64-encoded encryption key
    */
    @SerializedName("EncryptKey")
    @Expose
    private String EncryptKey;

    /**
    * Base64-encoded decryption key
    */
    @SerializedName("DecryptKey")
    @Expose
    private String DecryptKey;

    /**
    * Globally unique white-box key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Return code of Tag operation. `0`: success; `1`: internal error; `2`: business processing error.
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * Response information of Tag operation.
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Base64-encoded encryption key 
     * @return EncryptKey Base64-encoded encryption key
     */
    public String getEncryptKey() {
        return this.EncryptKey;
    }

    /**
     * Set Base64-encoded encryption key
     * @param EncryptKey Base64-encoded encryption key
     */
    public void setEncryptKey(String EncryptKey) {
        this.EncryptKey = EncryptKey;
    }

    /**
     * Get Base64-encoded decryption key 
     * @return DecryptKey Base64-encoded decryption key
     */
    public String getDecryptKey() {
        return this.DecryptKey;
    }

    /**
     * Set Base64-encoded decryption key
     * @param DecryptKey Base64-encoded decryption key
     */
    public void setDecryptKey(String DecryptKey) {
        this.DecryptKey = DecryptKey;
    }

    /**
     * Get Globally unique white-box key ID 
     * @return KeyId Globally unique white-box key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique white-box key ID
     * @param KeyId Globally unique white-box key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Return code of Tag operation. `0`: success; `1`: internal error; `2`: business processing error. 
     * @return TagCode Return code of Tag operation. `0`: success; `1`: internal error; `2`: business processing error.
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set Return code of Tag operation. `0`: success; `1`: internal error; `2`: business processing error.
     * @param TagCode Return code of Tag operation. `0`: success; `1`: internal error; `2`: business processing error.
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get Response information of Tag operation. 
     * @return TagMsg Response information of Tag operation.
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set Response information of Tag operation.
     * @param TagMsg Response information of Tag operation.
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CreateWhiteBoxKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateWhiteBoxKeyResponse(CreateWhiteBoxKeyResponse source) {
        if (source.EncryptKey != null) {
            this.EncryptKey = new String(source.EncryptKey);
        }
        if (source.DecryptKey != null) {
            this.DecryptKey = new String(source.DecryptKey);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
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
        this.setParamSimple(map, prefix + "EncryptKey", this.EncryptKey);
        this.setParamSimple(map, prefix + "DecryptKey", this.DecryptKey);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

