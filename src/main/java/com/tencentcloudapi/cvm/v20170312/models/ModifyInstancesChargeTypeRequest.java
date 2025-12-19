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

public class ModifyInstancesChargeTypeRequest extends AbstractModel {

    /**
    * One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1). the maximum number of instances per request is 20.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Modified instance [billing type](https://www.tencentcloud.com/document/product/213/2180?from_cn_redirect=1). <li>`PREPAID`: monthly subscription.</li> 
**Note:** Only supports converting pay-as-you-go instances to annual and monthly subscription instances.

default value: `PREPAID`
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * Modified prepaid mode, parameter settings related to monthly/annual subscription. by specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. 
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * Whether to switch the billing mode of elastic data cloud disks simultaneously. valid values: <li> true: means switching the billing mode of elastic data cloud disks</li><li> false: means not switching the billing mode of elastic data cloud disks</li>default value: false.
    */
    @SerializedName("ModifyPortableDataDisk")
    @Expose
    private Boolean ModifyPortableDataDisk;

    /**
     * Get One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1). the maximum number of instances per request is 20. 
     * @return InstanceIds One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1). the maximum number of instances per request is 20.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1). the maximum number of instances per request is 20.
     * @param InstanceIds One or more instance ids to be operated. you can obtain the instance ID through the `InstanceId` in the return value from the api [DescribeInstances](https://www.tencentcloud.com/document/api/213/15728?from_cn_redirect=1). the maximum number of instances per request is 20.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Modified instance [billing type](https://www.tencentcloud.com/document/product/213/2180?from_cn_redirect=1). <li>`PREPAID`: monthly subscription.</li> 
**Note:** Only supports converting pay-as-you-go instances to annual and monthly subscription instances.

default value: `PREPAID` 
     * @return InstanceChargeType Modified instance [billing type](https://www.tencentcloud.com/document/product/213/2180?from_cn_redirect=1). <li>`PREPAID`: monthly subscription.</li> 
**Note:** Only supports converting pay-as-you-go instances to annual and monthly subscription instances.

default value: `PREPAID`
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set Modified instance [billing type](https://www.tencentcloud.com/document/product/213/2180?from_cn_redirect=1). <li>`PREPAID`: monthly subscription.</li> 
**Note:** Only supports converting pay-as-you-go instances to annual and monthly subscription instances.

default value: `PREPAID`
     * @param InstanceChargeType Modified instance [billing type](https://www.tencentcloud.com/document/product/213/2180?from_cn_redirect=1). <li>`PREPAID`: monthly subscription.</li> 
**Note:** Only supports converting pay-as-you-go instances to annual and monthly subscription instances.

default value: `PREPAID`
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get Modified prepaid mode, parameter settings related to monthly/annual subscription. by specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes.  
     * @return InstanceChargePrepaid Modified prepaid mode, parameter settings related to monthly/annual subscription. by specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. 
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set Modified prepaid mode, parameter settings related to monthly/annual subscription. by specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. 
     * @param InstanceChargePrepaid Modified prepaid mode, parameter settings related to monthly/annual subscription. by specifying this parameter, you can specify the purchase duration of annual and monthly subscription instances, whether to enable auto-renewal, and other attributes. 
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get Whether to switch the billing mode of elastic data cloud disks simultaneously. valid values: <li> true: means switching the billing mode of elastic data cloud disks</li><li> false: means not switching the billing mode of elastic data cloud disks</li>default value: false. 
     * @return ModifyPortableDataDisk Whether to switch the billing mode of elastic data cloud disks simultaneously. valid values: <li> true: means switching the billing mode of elastic data cloud disks</li><li> false: means not switching the billing mode of elastic data cloud disks</li>default value: false.
     */
    public Boolean getModifyPortableDataDisk() {
        return this.ModifyPortableDataDisk;
    }

    /**
     * Set Whether to switch the billing mode of elastic data cloud disks simultaneously. valid values: <li> true: means switching the billing mode of elastic data cloud disks</li><li> false: means not switching the billing mode of elastic data cloud disks</li>default value: false.
     * @param ModifyPortableDataDisk Whether to switch the billing mode of elastic data cloud disks simultaneously. valid values: <li> true: means switching the billing mode of elastic data cloud disks</li><li> false: means not switching the billing mode of elastic data cloud disks</li>default value: false.
     */
    public void setModifyPortableDataDisk(Boolean ModifyPortableDataDisk) {
        this.ModifyPortableDataDisk = ModifyPortableDataDisk;
    }

    public ModifyInstancesChargeTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyInstancesChargeTypeRequest(ModifyInstancesChargeTypeRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.ModifyPortableDataDisk != null) {
            this.ModifyPortableDataDisk = new Boolean(source.ModifyPortableDataDisk);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "ModifyPortableDataDisk", this.ModifyPortableDataDisk);

    }
}

