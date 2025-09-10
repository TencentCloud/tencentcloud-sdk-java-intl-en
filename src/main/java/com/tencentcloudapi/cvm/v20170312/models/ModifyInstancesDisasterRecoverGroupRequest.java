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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyInstancesDisasterRecoverGroupRequest extends AbstractModel {

    /**
    * One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). the maximum number of instances per request is 100.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Spread placement group ID. obtain through the api [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261).
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * Whether to forcibly change instance hosts. value range:<br><li>true: indicates that the instance is allowed to change hosts, allowing the instance to reboot. local disk machine does not support specifying this parameter.</li><br><li>false: does not allow the instance to change hosts. instances can only be added to the placement group on the current host. this may result in a failure to change the placement group.</li><br><br>default value: false.
    */
    @SerializedName("Force")
    @Expose
    private Boolean Force;

    /**
     * Get One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). the maximum number of instances per request is 100. 
     * @return InstanceIds One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). the maximum number of instances per request is 100.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). the maximum number of instances per request is 100.
     * @param InstanceIds One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/zh/document/api/213/33258). the maximum number of instances per request is 100.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Spread placement group ID. obtain through the api [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261). 
     * @return DisasterRecoverGroupId Spread placement group ID. obtain through the api [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261).
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * Set Spread placement group ID. obtain through the api [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261).
     * @param DisasterRecoverGroupId Spread placement group ID. obtain through the api [DescribeDisasterRecoverGroups](https://www.tencentcloud.com/zh/document/api/213/33261).
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * Get Whether to forcibly change instance hosts. value range:<br><li>true: indicates that the instance is allowed to change hosts, allowing the instance to reboot. local disk machine does not support specifying this parameter.</li><br><li>false: does not allow the instance to change hosts. instances can only be added to the placement group on the current host. this may result in a failure to change the placement group.</li><br><br>default value: false. 
     * @return Force Whether to forcibly change instance hosts. value range:<br><li>true: indicates that the instance is allowed to change hosts, allowing the instance to reboot. local disk machine does not support specifying this parameter.</li><br><li>false: does not allow the instance to change hosts. instances can only be added to the placement group on the current host. this may result in a failure to change the placement group.</li><br><br>default value: false.
     */
    public Boolean getForce() {
        return this.Force;
    }

    /**
     * Set Whether to forcibly change instance hosts. value range:<br><li>true: indicates that the instance is allowed to change hosts, allowing the instance to reboot. local disk machine does not support specifying this parameter.</li><br><li>false: does not allow the instance to change hosts. instances can only be added to the placement group on the current host. this may result in a failure to change the placement group.</li><br><br>default value: false.
     * @param Force Whether to forcibly change instance hosts. value range:<br><li>true: indicates that the instance is allowed to change hosts, allowing the instance to reboot. local disk machine does not support specifying this parameter.</li><br><li>false: does not allow the instance to change hosts. instances can only be added to the placement group on the current host. this may result in a failure to change the placement group.</li><br><br>default value: false.
     */
    public void setForce(Boolean Force) {
        this.Force = Force;
    }

    public ModifyInstancesDisasterRecoverGroupRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesDisasterRecoverGroupRequest(ModifyInstancesDisasterRecoverGroupRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.DisasterRecoverGroupId != null) {
            this.DisasterRecoverGroupId = new String(source.DisasterRecoverGroupId);
        }
        if (source.Force != null) {
            this.Force = new Boolean(source.Force);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

