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
    * The capacity scheduler will use it, where tag-related configuration is set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
The key values are as follows:
- labelName: Tag name, that is, tags in tag management.
- capacity: Capacity. The value is a **numeric string**.
- maximum-capacity: Maximum capacity. The value is a **numeric string**.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LabelParams")
    @Expose
    private ItemSeq [] LabelParams;

    /**
    * Set parameters related to the configuration set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key values are as follows:
- minResources: Minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: Maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: Maximum resource amount for undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: Maximum number of apps that can run concurrently. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: Maximum App Master share. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value can be percent or null. When the value is percent, it indicates the percentage used; otherwise, the absolute value used is indicated. The value can be percent only for maxResources and maxChildResources.
}
```

###### Capacity scheduler.
The key values are as follows:
- minimum-user-limit-percent: Minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the number range is [0,100].
- user-limit-factor: User resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: Maximum number of applications, that is, Max-Applications. The value is a **numeric string** or **null**, where the numbers must be positive integers.
- maximum-am-resource-percent: maximum AM percent. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.
- default-application-priority: Resource pool priority. The value is a **numeric string** or **null**, where the numbers must be positive integers.
Note: This field may return null, indicating that no valid values can be obtained.
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
     * Get The capacity scheduler will use it, where tag-related configuration is set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
The key values are as follows:
- labelName: Tag name, that is, tags in tag management.
- capacity: Capacity. The value is a **numeric string**.
- maximum-capacity: Maximum capacity. The value is a **numeric string**.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LabelParams The capacity scheduler will use it, where tag-related configuration is set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
The key values are as follows:
- labelName: Tag name, that is, tags in tag management.
- capacity: Capacity. The value is a **numeric string**.
- maximum-capacity: Maximum capacity. The value is a **numeric string**.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ItemSeq [] getLabelParams() {
        return this.LabelParams;
    }

    /**
     * Set The capacity scheduler will use it, where tag-related configuration is set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
The key values are as follows:
- labelName: Tag name, that is, tags in tag management.
- capacity: Capacity. The value is a **numeric string**.
- maximum-capacity: Maximum capacity. The value is a **numeric string**.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LabelParams The capacity scheduler will use it, where tag-related configuration is set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
The key values are as follows:
- labelName: Tag name, that is, tags in tag management.
- capacity: Capacity. The value is a **numeric string**.
- maximum-capacity: Maximum capacity. The value is a **numeric string**.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLabelParams(ItemSeq [] LabelParams) {
        this.LabelParams = LabelParams;
    }

    /**
     * Get Set parameters related to the configuration set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key values are as follows:
- minResources: Minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: Maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: Maximum resource amount for undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: Maximum number of apps that can run concurrently. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: Maximum App Master share. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value can be percent or null. When the value is percent, it indicates the percentage used; otherwise, the absolute value used is indicated. The value can be percent only for maxResources and maxChildResources.
}
```

###### Capacity scheduler.
The key values are as follows:
- minimum-user-limit-percent: Minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the number range is [0,100].
- user-limit-factor: User resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: Maximum number of applications, that is, Max-Applications. The value is a **numeric string** or **null**, where the numbers must be positive integers.
- maximum-am-resource-percent: maximum AM percent. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.
- default-application-priority: Resource pool priority. The value is a **numeric string** or **null**, where the numbers must be positive integers.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BasicParams Set parameters related to the configuration set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key values are as follows:
- minResources: Minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: Maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: Maximum resource amount for undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: Maximum number of apps that can run concurrently. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: Maximum App Master share. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value can be percent or null. When the value is percent, it indicates the percentage used; otherwise, the absolute value used is indicated. The value can be percent only for maxResources and maxChildResources.
}
```

###### Capacity scheduler.
The key values are as follows:
- minimum-user-limit-percent: Minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the number range is [0,100].
- user-limit-factor: User resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: Maximum number of applications, that is, Max-Applications. The value is a **numeric string** or **null**, where the numbers must be positive integers.
- maximum-am-resource-percent: maximum AM percent. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.
- default-application-priority: Resource pool priority. The value is a **numeric string** or **null**, where the numbers must be positive integers.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Item [] getBasicParams() {
        return this.BasicParams;
    }

    /**
     * Set Set parameters related to the configuration set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key values are as follows:
- minResources: Minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: Maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: Maximum resource amount for undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: Maximum number of apps that can run concurrently. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: Maximum App Master share. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value can be percent or null. When the value is percent, it indicates the percentage used; otherwise, the absolute value used is indicated. The value can be percent only for maxResources and maxChildResources.
}
```

###### Capacity scheduler.
The key values are as follows:
- minimum-user-limit-percent: Minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the number range is [0,100].
- user-limit-factor: User resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: Maximum number of applications, that is, Max-Applications. The value is a **numeric string** or **null**, where the numbers must be positive integers.
- maximum-am-resource-percent: maximum AM percent. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.
- default-application-priority: Resource pool priority. The value is a **numeric string** or **null**, where the numbers must be positive integers.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BasicParams Set parameters related to the configuration set. The key values are consistent with the fields returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key values are as follows:
- minResources: Minimum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxResources: Maximum resource amount. The value is a **JSON string of the YarnResource type** or **null**.
- maxChildResources: Maximum resource amount for undeclared subqueues. The value is a **numeric string** or **null**.
- maxRunningApps: Maximum number of apps that can run concurrently. The value is a **numeric string** or **null**.
- weight: weight. The value is a **numeric string** or **null**.
- maxAMShare: Maximum App Master share. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.

```
type YarnResource struct {
	Vcores *int `json:"vcores"`
	Memory *int `json:"memory"`
	Type *string `json:"type"` // The value can be percent or null. When the value is percent, it indicates the percentage used; otherwise, the absolute value used is indicated. The value can be percent only for maxResources and maxChildResources.
}
```

###### Capacity scheduler.
The key values are as follows:
- minimum-user-limit-percent: Minimum user capacity. The value is a **JSON string of the YarnResource type** or **null**, where the number range is [0,100].
- user-limit-factor: User resource factor. The value is a **JSON string of the YarnResource type** or **null**.
- maximum-applications: Maximum number of applications, that is, Max-Applications. The value is a **numeric string** or **null**, where the numbers must be positive integers.
- maximum-am-resource-percent: maximum AM percent. The value is a **numeric string** or **null**, where the number range is [0,1] or -1.
- default-application-priority: Resource pool priority. The value is a **numeric string** or **null**, where the numbers must be positive integers.
Note: This field may return null, indicating that no valid values can be obtained.
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

