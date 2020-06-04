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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintKey extends AbstractModel{

    /**
    * Watermark key ID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * Watermark key value
    */
    @SerializedName("KeyContent")
    @Expose
    private String KeyContent;

    /**
    * Watermark key version number
    */
    @SerializedName("KeyVersion")
    @Expose
    private String KeyVersion;

    /**
    * Whether it is enabled. Valid values: [0 (no), 1 (yes)]
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
    * Key generation time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get Watermark key ID 
     * @return KeyId Watermark key ID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set Watermark key ID
     * @param KeyId Watermark key ID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get Watermark key value 
     * @return KeyContent Watermark key value
     */
    public String getKeyContent() {
        return this.KeyContent;
    }

    /**
     * Set Watermark key value
     * @param KeyContent Watermark key value
     */
    public void setKeyContent(String KeyContent) {
        this.KeyContent = KeyContent;
    }

    /**
     * Get Watermark key version number 
     * @return KeyVersion Watermark key version number
     */
    public String getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * Set Watermark key version number
     * @param KeyVersion Watermark key version number
     */
    public void setKeyVersion(String KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * Get Whether it is enabled. Valid values: [0 (no), 1 (yes)] 
     * @return OpenStatus Whether it is enabled. Valid values: [0 (no), 1 (yes)]
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * Set Whether it is enabled. Valid values: [0 (no), 1 (yes)]
     * @param OpenStatus Whether it is enabled. Valid values: [0 (no), 1 (yes)]
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * Get Key generation time 
     * @return CreateTime Key generation time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Key generation time
     * @param CreateTime Key generation time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyContent", this.KeyContent);
        this.setParamSimple(map, prefix + "KeyVersion", this.KeyVersion);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

