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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitInstanceUpgradeCheckJobRequest extends AbstractModel {

    /**
    * Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Target database version.
Description: Available values: 5.6, 5.7, 8.0. Cross-version upgrade is not supported. Version downgrade is unsupported after upgrade.
    */
    @SerializedName("DstMysqlVersion")
    @Expose
    private String DstMysqlVersion;

    /**
     * Get Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API. 
     * @return InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     * @param InstanceId Instance ID, which can be obtained through the [DescribeDBInstances](https://www.tencentcloud.com/document/product/236/15872?from_cn_redirect=1) API.
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Target database version.
Description: Available values: 5.6, 5.7, 8.0. Cross-version upgrade is not supported. Version downgrade is unsupported after upgrade. 
     * @return DstMysqlVersion Target database version.
Description: Available values: 5.6, 5.7, 8.0. Cross-version upgrade is not supported. Version downgrade is unsupported after upgrade.
     */
    public String getDstMysqlVersion() {
        return this.DstMysqlVersion;
    }

    /**
     * Set Target database version.
Description: Available values: 5.6, 5.7, 8.0. Cross-version upgrade is not supported. Version downgrade is unsupported after upgrade.
     * @param DstMysqlVersion Target database version.
Description: Available values: 5.6, 5.7, 8.0. Cross-version upgrade is not supported. Version downgrade is unsupported after upgrade.
     */
    public void setDstMysqlVersion(String DstMysqlVersion) {
        this.DstMysqlVersion = DstMysqlVersion;
    }

    public SubmitInstanceUpgradeCheckJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SubmitInstanceUpgradeCheckJobRequest(SubmitInstanceUpgradeCheckJobRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstMysqlVersion != null) {
            this.DstMysqlVersion = new String(source.DstMysqlVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstMysqlVersion", this.DstMysqlVersion);

    }
}

