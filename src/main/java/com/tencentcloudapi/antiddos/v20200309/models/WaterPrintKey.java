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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintKey extends AbstractModel {

    /**
    * Key version
    */
    @SerializedName("KeyVersion")
    @Expose
    private String KeyVersion;

    /**
    * Key content
    */
    @SerializedName("KeyContent")
    @Expose
    private String KeyContent;

    /**
    * Key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Key status. Valid value: `1` (enabled).
    */
    @SerializedName("KeyOpenStatus")
    @Expose
    private Long KeyOpenStatus;

    /**
    * Key creation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Key version 
     * @return KeyVersion Key version
     */
    public String getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * Set Key version
     * @param KeyVersion Key version
     */
    public void setKeyVersion(String KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * Get Key content 
     * @return KeyContent Key content
     */
    public String getKeyContent() {
        return this.KeyContent;
    }

    /**
     * Set Key content
     * @param KeyContent Key content
     */
    public void setKeyContent(String KeyContent) {
        this.KeyContent = KeyContent;
    }

    /**
     * Get Key ID 
     * @return KeyId Key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Key ID
     * @param KeyId Key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Key status. Valid value: `1` (enabled). 
     * @return KeyOpenStatus Key status. Valid value: `1` (enabled).
     */
    public Long getKeyOpenStatus() {
        return this.KeyOpenStatus;
    }

    /**
     * Set Key status. Valid value: `1` (enabled).
     * @param KeyOpenStatus Key status. Valid value: `1` (enabled).
     */
    public void setKeyOpenStatus(Long KeyOpenStatus) {
        this.KeyOpenStatus = KeyOpenStatus;
    }

    /**
     * Get Key creation time 
     * @return CreateTime Key creation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Key creation time
     * @param CreateTime Key creation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    public WaterPrintKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WaterPrintKey(WaterPrintKey source) {
        if (source.KeyVersion != null) {
            this.KeyVersion = new String(source.KeyVersion);
        }
        if (source.KeyContent != null) {
            this.KeyContent = new String(source.KeyContent);
        }
        if (source.KeyId != null) {
            this.KeyId = new String(source.KeyId);
        }
        if (source.KeyOpenStatus != null) {
            this.KeyOpenStatus = new Long(source.KeyOpenStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyVersion", this.KeyVersion);
        this.setParamSimple(map, prefix + "KeyContent", this.KeyContent);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyOpenStatus", this.KeyOpenStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

