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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateKeyResponse extends AbstractModel {

    /**
    * Globally unique CMK ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Alias that makes a key more recognizable and understandable
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Key creation time in UNIX timestamp format
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * CMK description
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * CMK status
    */
    @SerializedName("KeyState")
    @Expose
    private String KeyState;

    /**
    * CMK usage
    */
    @SerializedName("KeyUsage")
    @Expose
    private String KeyUsage;

    /**
    * Tag operation return code. 0: success; 1: internal error; 2: business processing error
    */
    @SerializedName("TagCode")
    @Expose
    private Long TagCode;

    /**
    * Tag operation return information
    */
    @SerializedName("TagMsg")
    @Expose
    private String TagMsg;

    /**
    * ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("HsmClusterId")
    @Expose
    private String HsmClusterId;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Globally unique CMK ID 
     * @return KeyId Globally unique CMK ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Globally unique CMK ID
     * @param KeyId Globally unique CMK ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Alias that makes a key more recognizable and understandable 
     * @return Alias Alias that makes a key more recognizable and understandable
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Alias that makes a key more recognizable and understandable
     * @param Alias Alias that makes a key more recognizable and understandable
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Key creation time in UNIX timestamp format 
     * @return CreateTime Key creation time in UNIX timestamp format
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Key creation time in UNIX timestamp format
     * @param CreateTime Key creation time in UNIX timestamp format
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get CMK description 
     * @return Description CMK description
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set CMK description
     * @param Description CMK description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get CMK status 
     * @return KeyState CMK status
     */
    public String getKeyState() {
        return this.KeyState;
    }

    /**
     * Set CMK status
     * @param KeyState CMK status
     */
    public void setKeyState(String KeyState) {
        this.KeyState = KeyState;
    }

    /**
     * Get CMK usage 
     * @return KeyUsage CMK usage
     */
    public String getKeyUsage() {
        return this.KeyUsage;
    }

    /**
     * Set CMK usage
     * @param KeyUsage CMK usage
     */
    public void setKeyUsage(String KeyUsage) {
        this.KeyUsage = KeyUsage;
    }

    /**
     * Get Tag operation return code. 0: success; 1: internal error; 2: business processing error 
     * @return TagCode Tag operation return code. 0: success; 1: internal error; 2: business processing error
     */
    public Long getTagCode() {
        return this.TagCode;
    }

    /**
     * Set Tag operation return code. 0: success; 1: internal error; 2: business processing error
     * @param TagCode Tag operation return code. 0: success; 1: internal error; 2: business processing error
     */
    public void setTagCode(Long TagCode) {
        this.TagCode = TagCode;
    }

    /**
     * Get Tag operation return information 
     * @return TagMsg Tag operation return information
     */
    public String getTagMsg() {
        return this.TagMsg;
    }

    /**
     * Set Tag operation return information
     * @param TagMsg Tag operation return information
     */
    public void setTagMsg(String TagMsg) {
        this.TagMsg = TagMsg;
    }

    /**
     * Get ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return HsmClusterId ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String getHsmClusterId() {
        return this.HsmClusterId;
    }

    /**
     * Set ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param HsmClusterId ID of the HSM cluster. This field is only valid for Exclusive and Managed KMS instances.
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setHsmClusterId(String HsmClusterId) {
        this.HsmClusterId = HsmClusterId;
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

    public CreateKeyResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateKeyResponse(CreateKeyResponse source) {
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.KeyState != null) {
            this.KeyState = new String(source.KeyState);
        }
        if (source.KeyUsage != null) {
            this.KeyUsage = new String(source.KeyUsage);
        }
        if (source.TagCode != null) {
            this.TagCode = new Long(source.TagCode);
        }
        if (source.TagMsg != null) {
            this.TagMsg = new String(source.TagMsg);
        }
        if (source.HsmClusterId != null) {
            this.HsmClusterId = new String(source.HsmClusterId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "KeyState", this.KeyState);
        this.setParamSimple(map, prefix + "KeyUsage", this.KeyUsage);
        this.setParamSimple(map, prefix + "TagCode", this.TagCode);
        this.setParamSimple(map, prefix + "TagMsg", this.TagMsg);
        this.setParamSimple(map, prefix + "HsmClusterId", this.HsmClusterId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

