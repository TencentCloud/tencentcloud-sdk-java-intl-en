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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeBrokerVersionRequest extends AbstractModel {

    /**
    * The ckafka cluster instance Id.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 1. smooth configuration upgrade 2. vertical configuration upgrade.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Version number
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * Version number
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
    * Delay time.
    */
    @SerializedName("DelayTimeStamp")
    @Expose
    private String DelayTimeStamp;

    /**
     * Get The ckafka cluster instance Id. 
     * @return InstanceId The ckafka cluster instance Id.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set The ckafka cluster instance Id.
     * @param InstanceId The ckafka cluster instance Id.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 1. smooth configuration upgrade 2. vertical configuration upgrade. 
     * @return Type 1. smooth configuration upgrade 2. vertical configuration upgrade.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 1. smooth configuration upgrade 2. vertical configuration upgrade.
     * @param Type 1. smooth configuration upgrade 2. vertical configuration upgrade.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Version number 
     * @return SourceVersion Version number
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set Version number
     * @param SourceVersion Version number
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get Version number 
     * @return TargetVersion Version number
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set Version number
     * @param TargetVersion Version number
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
    }

    /**
     * Get Delay time. 
     * @return DelayTimeStamp Delay time.
     */
    public String getDelayTimeStamp() {
        return this.DelayTimeStamp;
    }

    /**
     * Set Delay time.
     * @param DelayTimeStamp Delay time.
     */
    public void setDelayTimeStamp(String DelayTimeStamp) {
        this.DelayTimeStamp = DelayTimeStamp;
    }

    public UpgradeBrokerVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeBrokerVersionRequest(UpgradeBrokerVersionRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SourceVersion != null) {
            this.SourceVersion = new String(source.SourceVersion);
        }
        if (source.TargetVersion != null) {
            this.TargetVersion = new String(source.TargetVersion);
        }
        if (source.DelayTimeStamp != null) {
            this.DelayTimeStamp = new String(source.DelayTimeStamp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceVersion", this.SourceVersion);
        this.setParamSimple(map, prefix + "TargetVersion", this.TargetVersion);
        this.setParamSimple(map, prefix + "DelayTimeStamp", this.DelayTimeStamp);

    }
}

