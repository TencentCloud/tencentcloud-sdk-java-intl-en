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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterInstancesRequest extends AbstractModel{

    /**
    * Cluster ID. Enter the ClusterId field returned by the DescribeClusters API
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
    */
    @SerializedName("RunInstancePara")
    @Expose
    private String RunInstancePara;

    /**
    * Additional parameter to be set for the instance
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
     * Get Cluster ID. Enter the ClusterId field returned by the DescribeClusters API 
     * @return ClusterId Cluster ID. Enter the ClusterId field returned by the DescribeClusters API
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Cluster ID. Enter the ClusterId field returned by the DescribeClusters API
     * @param ClusterId Cluster ID. Enter the ClusterId field returned by the DescribeClusters API
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API. 
     * @return RunInstancePara Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
     */
    public String getRunInstancePara() {
        return this.RunInstancePara;
    }

    /**
     * Set Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
     * @param RunInstancePara Pass-through parameter for CVM creation in the format of a JSON string. For more information, see the [RunInstances](https://intl.cloud.tencent.com/document/product/213/15730?from_cn_redirect=1) API.
     */
    public void setRunInstancePara(String RunInstancePara) {
        this.RunInstancePara = RunInstancePara;
    }

    /**
     * Get Additional parameter to be set for the instance 
     * @return InstanceAdvancedSettings Additional parameter to be set for the instance
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * Set Additional parameter to be set for the instance
     * @param InstanceAdvancedSettings Additional parameter to be set for the instance
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RunInstancePara", this.RunInstancePara);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);

    }
}

