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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceProductVersionRequest extends AbstractModel {

    /**
    * <p>Target product type for the update.</p><p>Enumeration values:</p><ul><li>localv2: General Type II</li></ul>
    */
    @SerializedName("TargetProductVersion")
    @Expose
    private String TargetProductVersion;

    /**
    * <p>Switch time.</p><ul><li>1: Switch during maintenance window.</li><li>2: Switch immediately.</li></ul>
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
    * <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a> and copy the instance ID from the instance list.</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get <p>Target product type for the update.</p><p>Enumeration values:</p><ul><li>localv2: General Type II</li></ul> 
     * @return TargetProductVersion <p>Target product type for the update.</p><p>Enumeration values:</p><ul><li>localv2: General Type II</li></ul>
     */
    public String getTargetProductVersion() {
        return this.TargetProductVersion;
    }

    /**
     * Set <p>Target product type for the update.</p><p>Enumeration values:</p><ul><li>localv2: General Type II</li></ul>
     * @param TargetProductVersion <p>Target product type for the update.</p><p>Enumeration values:</p><ul><li>localv2: General Type II</li></ul>
     */
    public void setTargetProductVersion(String TargetProductVersion) {
        this.TargetProductVersion = TargetProductVersion;
    }

    /**
     * Get <p>Switch time.</p><ul><li>1: Switch during maintenance window.</li><li>2: Switch immediately.</li></ul> 
     * @return SwitchOption <p>Switch time.</p><ul><li>1: Switch during maintenance window.</li><li>2: Switch immediately.</li></ul>
     */
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set <p>Switch time.</p><ul><li>1: Switch during maintenance window.</li><li>2: Switch immediately.</li></ul>
     * @param SwitchOption <p>Switch time.</p><ul><li>1: Switch during maintenance window.</li><li>2: Switch immediately.</li></ul>
     */
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    /**
     * Get <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a> and copy the instance ID from the instance list.</p> 
     * @return InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a> and copy the instance ID from the instance list.</p>
     * @param InstanceId <p>Specifies the instance ID. Example: crs-xjhsdj****. Log in to the <a href="https://console.cloud.tencent.com/redis#/">Redis console</a> and copy the instance ID from the instance list.</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public UpgradeInstanceProductVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceProductVersionRequest(UpgradeInstanceProductVersionRequest source) {
        if (source.TargetProductVersion != null) {
            this.TargetProductVersion = new String(source.TargetProductVersion);
        }
        if (source.SwitchOption != null) {
            this.SwitchOption = new Long(source.SwitchOption);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetProductVersion", this.TargetProductVersion);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

