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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigSetInfo extends AbstractModel {

    /**
    * Configuration set name.
    */
    @SerializedName("ConfigSet")
    @Expose
    private String ConfigSet;

    /**
    * The capacity scheduler uses it to configure label-related settings. The value of key is consistent with the field returned by **DescribeYarnQueue**.
The key value information is as follows:
- labelName: label name, which is the label in label management.
- capacity: capacity. The value is a **numeric string**.
- maximum-capacity: maximum capacity. The value is a **numeric string**.
    */
    @SerializedName("LabelParams")
    @Expose
    private ItemSeq [] LabelParams;

    /**
    * Sets the parameters related to the configuration set. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:
- minResources: minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: maximum resource amount that can be allocated to undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: maximum number of apps that can run simultaneously. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: maximum share of the App Master. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value is `percent` or `null`. When the value is `percent`, it indicates the percentage used; otherwise, it is the absolute value used. Only maxResources and maxChildResources can be set to `percent`.
}
```

###### Capacity scheduler.
The key value information is as follows:
- minimum-user-limit-percent: minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the numeric range is [0, 100].
- user-limit-factor: user resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: maximum number of applications (Max-Applications). The value is a **numeric string** or **null**, where the number is a positive integer.
- maximum-am-resource-percent: maximum AM ratio. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.
- default-application-priority: resource pool priority. The value is a **numeric string** or **null**, where the number is a positive integer.
    */
    @SerializedName("BasicParams")
    @Expose
    private Item [] BasicParams;

    /**
     * Get Configuration set name. 
     * @return ConfigSet Configuration set name.
     */
    public String getConfigSet() {
        return this.ConfigSet;
    }

    /**
     * Set Configuration set name.
     * @param ConfigSet Configuration set name.
     */
    public void setConfigSet(String ConfigSet) {
        this.ConfigSet = ConfigSet;
    }

    /**
     * Get The capacity scheduler uses it to configure label-related settings. The value of key is consistent with the field returned by **DescribeYarnQueue**.
The key value information is as follows:
- labelName: label name, which is the label in label management.
- capacity: capacity. The value is a **numeric string**.
- maximum-capacity: maximum capacity. The value is a **numeric string**. 
     * @return LabelParams The capacity scheduler uses it to configure label-related settings. The value of key is consistent with the field returned by **DescribeYarnQueue**.
The key value information is as follows:
- labelName: label name, which is the label in label management.
- capacity: capacity. The value is a **numeric string**.
- maximum-capacity: maximum capacity. The value is a **numeric string**.
     */
    public ItemSeq [] getLabelParams() {
        return this.LabelParams;
    }

    /**
     * Set The capacity scheduler uses it to configure label-related settings. The value of key is consistent with the field returned by **DescribeYarnQueue**.
The key value information is as follows:
- labelName: label name, which is the label in label management.
- capacity: capacity. The value is a **numeric string**.
- maximum-capacity: maximum capacity. The value is a **numeric string**.
     * @param LabelParams The capacity scheduler uses it to configure label-related settings. The value of key is consistent with the field returned by **DescribeYarnQueue**.
The key value information is as follows:
- labelName: label name, which is the label in label management.
- capacity: capacity. The value is a **numeric string**.
- maximum-capacity: maximum capacity. The value is a **numeric string**.
     */
    public void setLabelParams(ItemSeq [] LabelParams) {
        this.LabelParams = LabelParams;
    }

    /**
     * Get Sets the parameters related to the configuration set. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:
- minResources: minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: maximum resource amount that can be allocated to undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: maximum number of apps that can run simultaneously. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: maximum share of the App Master. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value is `percent` or `null`. When the value is `percent`, it indicates the percentage used; otherwise, it is the absolute value used. Only maxResources and maxChildResources can be set to `percent`.
}
```

###### Capacity scheduler.
The key value information is as follows:
- minimum-user-limit-percent: minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the numeric range is [0, 100].
- user-limit-factor: user resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: maximum number of applications (Max-Applications). The value is a **numeric string** or **null**, where the number is a positive integer.
- maximum-am-resource-percent: maximum AM ratio. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.
- default-application-priority: resource pool priority. The value is a **numeric string** or **null**, where the number is a positive integer. 
     * @return BasicParams Sets the parameters related to the configuration set. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:
- minResources: minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: maximum resource amount that can be allocated to undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: maximum number of apps that can run simultaneously. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: maximum share of the App Master. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value is `percent` or `null`. When the value is `percent`, it indicates the percentage used; otherwise, it is the absolute value used. Only maxResources and maxChildResources can be set to `percent`.
}
```

###### Capacity scheduler.
The key value information is as follows:
- minimum-user-limit-percent: minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the numeric range is [0, 100].
- user-limit-factor: user resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: maximum number of applications (Max-Applications). The value is a **numeric string** or **null**, where the number is a positive integer.
- maximum-am-resource-percent: maximum AM ratio. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.
- default-application-priority: resource pool priority. The value is a **numeric string** or **null**, where the number is a positive integer.
     */
    public Item [] getBasicParams() {
        return this.BasicParams;
    }

    /**
     * Set Sets the parameters related to the configuration set. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:
- minResources: minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: maximum resource amount that can be allocated to undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: maximum number of apps that can run simultaneously. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: maximum share of the App Master. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value is `percent` or `null`. When the value is `percent`, it indicates the percentage used; otherwise, it is the absolute value used. Only maxResources and maxChildResources can be set to `percent`.
}
```

###### Capacity scheduler.
The key value information is as follows:
- minimum-user-limit-percent: minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the numeric range is [0, 100].
- user-limit-factor: user resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: maximum number of applications (Max-Applications). The value is a **numeric string** or **null**, where the number is a positive integer.
- maximum-am-resource-percent: maximum AM ratio. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.
- default-application-priority: resource pool priority. The value is a **numeric string** or **null**, where the number is a positive integer.
     * @param BasicParams Sets the parameters related to the configuration set. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:
- minResources: minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: maximum resource amount that can be allocated to undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: maximum number of apps that can run simultaneously. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: maximum share of the App Master. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value is `percent` or `null`. When the value is `percent`, it indicates the percentage used; otherwise, it is the absolute value used. Only maxResources and maxChildResources can be set to `percent`.
}
```

###### Capacity scheduler.
The key value information is as follows:
- minimum-user-limit-percent: minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the numeric range is [0, 100].
- user-limit-factor: user resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: maximum number of applications (Max-Applications). The value is a **numeric string** or **null**, where the number is a positive integer.
- maximum-am-resource-percent: maximum AM ratio. The value is a **numeric string** or **null**, where the numeric range is [0, 1] or -1.
- default-application-priority: resource pool priority. The value is a **numeric string** or **null**, where the number is a positive integer.
     */
    public void setBasicParams(Item [] BasicParams) {
        this.BasicParams = BasicParams;
    }

    public ConfigSetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigSetInfo(ConfigSetInfo source) {
        if (source.ConfigSet != null) {
            this.ConfigSet = new String(source.ConfigSet);
        }
        if (source.LabelParams != null) {
            this.LabelParams = new ItemSeq[source.LabelParams.length];
            for (int i = 0; i < source.LabelParams.length; i++) {
                this.LabelParams[i] = new ItemSeq(source.LabelParams[i]);
            }
        }
        if (source.BasicParams != null) {
            this.BasicParams = new Item[source.BasicParams.length];
            for (int i = 0; i < source.BasicParams.length; i++) {
                this.BasicParams[i] = new Item(source.BasicParams[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigSet", this.ConfigSet);
        this.setParamArrayObj(map, prefix + "LabelParams.", this.LabelParams);
        this.setParamArrayObj(map, prefix + "BasicParams.", this.BasicParams);

    }
}

