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
    * <p>ckafka cluster instance Id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>Upgrade type</p><p>Enumeration value:</p><ul><li>1: Minor version migration (recommended)</li></ul>
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * <p>Version number.</p>
    */
    @SerializedName("SourceVersion")
    @Expose
    private String SourceVersion;

    /**
    * <p>Version number.</p>
    */
    @SerializedName("TargetVersion")
    @Expose
    private String TargetVersion;

    /**
    * <p>Delay time</p>
    */
    @SerializedName("DelayTimeStamp")
    @Expose
    private String DelayTimeStamp;

    /**
     * Get <p>ckafka cluster instance Id</p> 
     * @return InstanceId <p>ckafka cluster instance Id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>ckafka cluster instance Id</p>
     * @param InstanceId <p>ckafka cluster instance Id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>Upgrade type</p><p>Enumeration value:</p><ul><li>1: Minor version migration (recommended)</li></ul> 
     * @return Type <p>Upgrade type</p><p>Enumeration value:</p><ul><li>1: Minor version migration (recommended)</li></ul>
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set <p>Upgrade type</p><p>Enumeration value:</p><ul><li>1: Minor version migration (recommended)</li></ul>
     * @param Type <p>Upgrade type</p><p>Enumeration value:</p><ul><li>1: Minor version migration (recommended)</li></ul>
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get <p>Version number.</p> 
     * @return SourceVersion <p>Version number.</p>
     */
    public String getSourceVersion() {
        return this.SourceVersion;
    }

    /**
     * Set <p>Version number.</p>
     * @param SourceVersion <p>Version number.</p>
     */
    public void setSourceVersion(String SourceVersion) {
        this.SourceVersion = SourceVersion;
    }

    /**
     * Get <p>Version number.</p> 
     * @return TargetVersion <p>Version number.</p>
     */
    public String getTargetVersion() {
        return this.TargetVersion;
    }

    /**
     * Set <p>Version number.</p>
     * @param TargetVersion <p>Version number.</p>
     */
    public void setTargetVersion(String TargetVersion) {
        this.TargetVersion = TargetVersion;
    }

    /**
     * Get <p>Delay time</p> 
     * @return DelayTimeStamp <p>Delay time</p>
     */
    public String getDelayTimeStamp() {
        return this.DelayTimeStamp;
    }

    /**
     * Set <p>Delay time</p>
     * @param DelayTimeStamp <p>Delay time</p>
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

