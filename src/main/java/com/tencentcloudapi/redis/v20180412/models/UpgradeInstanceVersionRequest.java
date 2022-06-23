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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceVersionRequest extends AbstractModel{

    /**
    * The target instance type to which the instance will change. It is the same as the `TypeId` parameter in the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
    */
    @SerializedName("TargetInstanceType")
    @Expose
    private String TargetInstanceType;

    /**
    * Switch mode. Valid values: 1 (switch during the maintenance window), 2 (switch immediately).
    */
    @SerializedName("SwitchOption")
    @Expose
    private Long SwitchOption;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * Get The target instance type to which the instance will change. It is the same as the `TypeId` parameter in the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API. 
     * @return TargetInstanceType The target instance type to which the instance will change. It is the same as the `TypeId` parameter in the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
     */
    public String getTargetInstanceType() {
        return this.TargetInstanceType;
    }

    /**
     * Set The target instance type to which the instance will change. It is the same as the `TypeId` parameter in the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
     * @param TargetInstanceType The target instance type to which the instance will change. It is the same as the `TypeId` parameter in the [CreateInstances](https://intl.cloud.tencent.com/document/api/239/20026?from_cn_redirect=1) API.
     */
    public void setTargetInstanceType(String TargetInstanceType) {
        this.TargetInstanceType = TargetInstanceType;
    }

    /**
     * Get Switch mode. Valid values: 1 (switch during the maintenance window), 2 (switch immediately). 
     * @return SwitchOption Switch mode. Valid values: 1 (switch during the maintenance window), 2 (switch immediately).
     */
    public Long getSwitchOption() {
        return this.SwitchOption;
    }

    /**
     * Set Switch mode. Valid values: 1 (switch during the maintenance window), 2 (switch immediately).
     * @param SwitchOption Switch mode. Valid values: 1 (switch during the maintenance window), 2 (switch immediately).
     */
    public void setSwitchOption(Long SwitchOption) {
        this.SwitchOption = SwitchOption;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    public UpgradeInstanceVersionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceVersionRequest(UpgradeInstanceVersionRequest source) {
        if (source.TargetInstanceType != null) {
            this.TargetInstanceType = new String(source.TargetInstanceType);
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
        this.setParamSimple(map, prefix + "TargetInstanceType", this.TargetInstanceType);
        this.setParamSimple(map, prefix + "SwitchOption", this.SwitchOption);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

