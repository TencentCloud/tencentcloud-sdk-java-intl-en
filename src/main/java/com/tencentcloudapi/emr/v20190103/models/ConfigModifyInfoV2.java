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

public class ConfigModifyInfoV2 extends AbstractModel {

    /**
    * Operation type. Valid values:

0: Create a queue.
1: Edit - fully overwrite a queue.
2: Create a subqueue.
3: Delete a queue.
4: Clone a queue. This is the same as creating a subqueue. Specifically, for `fair`, a subqueue can be copied to a new queue.
6: Edit - incrementally update a queue.
    */
    @SerializedName("OpType")
    @Expose
    private Long OpType;

    /**
    * Queue name. It cannot be modified.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Create the root queue: pass "myId of root". Create a subqueue: pass "myId of the selected queue". Clone a queue: pass "parentId of the selected queue".
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Edit or delete operations: pass "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a subqueue to a new queue.
    */
    @SerializedName("MyId")
    @Expose
    private String MyId;

    /**
    * Basic configuration information. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:

- type: parent queue. The value is **parent** or **null**.
- aclSubmitApps: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: minimum share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionTimeout: fair share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. The value is a **numeric string** or **null**, where the numeric range is (0, 1].
- allowPreemptionFrom: preemption mode. The value is a **boolean string** or **null**.
- schedulingPolicy: scheduling policy. The value is **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler.
The key value information is as follows:

- state: queue status. The value is **STOPPED** or **RUNNING**.
- default-node-label-expression: default label expression. The value is a **label** or **null**.
- acl_submit_applications: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to a container. The value is a **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of vCores allocated to a container. The value is a **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
    */
    @SerializedName("BasicParams")
    @Expose
    private ItemSeq BasicParams;

    /**
    * Configuration set information. For the value, see the parameter description of this complex type. A configuration set is the representation of the plan mode in a queue, indicating different configuration values in different time periods. All queues have the same configuration set name. For a single queue, the labels and parameters in each configuration set are the same, but the parameter values differ.
    */
    @SerializedName("ConfigSetParams")
    @Expose
    private ConfigSetInfo [] ConfigSetParams;

    /**
    * Specific to the capacity scheduler. It takes effect only when `OpType` is `6` and indicates which labels in this queue are to be deleted. Its priority is higher than that of LabelParams in ConfigSetParams.
    */
    @SerializedName("DeleteLables")
    @Expose
    private String [] DeleteLables;

    /**
     * Get Operation type. Valid values:

0: Create a queue.
1: Edit - fully overwrite a queue.
2: Create a subqueue.
3: Delete a queue.
4: Clone a queue. This is the same as creating a subqueue. Specifically, for `fair`, a subqueue can be copied to a new queue.
6: Edit - incrementally update a queue. 
     * @return OpType Operation type. Valid values:

0: Create a queue.
1: Edit - fully overwrite a queue.
2: Create a subqueue.
3: Delete a queue.
4: Clone a queue. This is the same as creating a subqueue. Specifically, for `fair`, a subqueue can be copied to a new queue.
6: Edit - incrementally update a queue.
     */
    public Long getOpType() {
        return this.OpType;
    }

    /**
     * Set Operation type. Valid values:

0: Create a queue.
1: Edit - fully overwrite a queue.
2: Create a subqueue.
3: Delete a queue.
4: Clone a queue. This is the same as creating a subqueue. Specifically, for `fair`, a subqueue can be copied to a new queue.
6: Edit - incrementally update a queue.
     * @param OpType Operation type. Valid values:

0: Create a queue.
1: Edit - fully overwrite a queue.
2: Create a subqueue.
3: Delete a queue.
4: Clone a queue. This is the same as creating a subqueue. Specifically, for `fair`, a subqueue can be copied to a new queue.
6: Edit - incrementally update a queue.
     */
    public void setOpType(Long OpType) {
        this.OpType = OpType;
    }

    /**
     * Get Queue name. It cannot be modified. 
     * @return Name Queue name. It cannot be modified.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Queue name. It cannot be modified.
     * @param Name Queue name. It cannot be modified.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Create the root queue: pass "myId of root". Create a subqueue: pass "myId of the selected queue". Clone a queue: pass "parentId of the selected queue". 
     * @return ParentId Create the root queue: pass "myId of root". Create a subqueue: pass "myId of the selected queue". Clone a queue: pass "parentId of the selected queue".
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Create the root queue: pass "myId of root". Create a subqueue: pass "myId of the selected queue". Clone a queue: pass "parentId of the selected queue".
     * @param ParentId Create the root queue: pass "myId of root". Create a subqueue: pass "myId of the selected queue". Clone a queue: pass "parentId of the selected queue".
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Edit or delete operations: pass "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a subqueue to a new queue. 
     * @return MyId Edit or delete operations: pass "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a subqueue to a new queue.
     */
    public String getMyId() {
        return this.MyId;
    }

    /**
     * Set Edit or delete operations: pass "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a subqueue to a new queue.
     * @param MyId Edit or delete operations: pass "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a subqueue to a new queue.
     */
    public void setMyId(String MyId) {
        this.MyId = MyId;
    }

    /**
     * Get Basic configuration information. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:

- type: parent queue. The value is **parent** or **null**.
- aclSubmitApps: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: minimum share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionTimeout: fair share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. The value is a **numeric string** or **null**, where the numeric range is (0, 1].
- allowPreemptionFrom: preemption mode. The value is a **boolean string** or **null**.
- schedulingPolicy: scheduling policy. The value is **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler.
The key value information is as follows:

- state: queue status. The value is **STOPPED** or **RUNNING**.
- default-node-label-expression: default label expression. The value is a **label** or **null**.
- acl_submit_applications: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to a container. The value is a **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of vCores allocated to a container. The value is a **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
``` 
     * @return BasicParams Basic configuration information. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:

- type: parent queue. The value is **parent** or **null**.
- aclSubmitApps: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: minimum share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionTimeout: fair share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. The value is a **numeric string** or **null**, where the numeric range is (0, 1].
- allowPreemptionFrom: preemption mode. The value is a **boolean string** or **null**.
- schedulingPolicy: scheduling policy. The value is **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler.
The key value information is as follows:

- state: queue status. The value is **STOPPED** or **RUNNING**.
- default-node-label-expression: default label expression. The value is a **label** or **null**.
- acl_submit_applications: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to a container. The value is a **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of vCores allocated to a container. The value is a **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
     */
    public ItemSeq getBasicParams() {
        return this.BasicParams;
    }

    /**
     * Set Basic configuration information. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:

- type: parent queue. The value is **parent** or **null**.
- aclSubmitApps: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: minimum share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionTimeout: fair share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. The value is a **numeric string** or **null**, where the numeric range is (0, 1].
- allowPreemptionFrom: preemption mode. The value is a **boolean string** or **null**.
- schedulingPolicy: scheduling policy. The value is **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler.
The key value information is as follows:

- state: queue status. The value is **STOPPED** or **RUNNING**.
- default-node-label-expression: default label expression. The value is a **label** or **null**.
- acl_submit_applications: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to a container. The value is a **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of vCores allocated to a container. The value is a **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
     * @param BasicParams Basic configuration information. The value of key is consistent with the field returned by **DescribeYarnQueue**.
###### Fair scheduler.
The key value information is as follows:

- type: parent queue. The value is **parent** or **null**.
- aclSubmitApps: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: minimum share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionTimeout: fair share preemption timeout. The value is a **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. The value is a **numeric string** or **null**, where the numeric range is (0, 1].
- allowPreemptionFrom: preemption mode. The value is a **boolean string** or **null**.
- schedulingPolicy: scheduling policy. The value is **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler.
The key value information is as follows:

- state: queue status. The value is **STOPPED** or **RUNNING**.
- default-node-label-expression: default label expression. The value is a **label** or **null**.
- acl_submit_applications: submit access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administer access control. The value is a **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to a container. The value is a **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of vCores allocated to a container. The value is a **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
     */
    public void setBasicParams(ItemSeq BasicParams) {
        this.BasicParams = BasicParams;
    }

    /**
     * Get Configuration set information. For the value, see the parameter description of this complex type. A configuration set is the representation of the plan mode in a queue, indicating different configuration values in different time periods. All queues have the same configuration set name. For a single queue, the labels and parameters in each configuration set are the same, but the parameter values differ. 
     * @return ConfigSetParams Configuration set information. For the value, see the parameter description of this complex type. A configuration set is the representation of the plan mode in a queue, indicating different configuration values in different time periods. All queues have the same configuration set name. For a single queue, the labels and parameters in each configuration set are the same, but the parameter values differ.
     */
    public ConfigSetInfo [] getConfigSetParams() {
        return this.ConfigSetParams;
    }

    /**
     * Set Configuration set information. For the value, see the parameter description of this complex type. A configuration set is the representation of the plan mode in a queue, indicating different configuration values in different time periods. All queues have the same configuration set name. For a single queue, the labels and parameters in each configuration set are the same, but the parameter values differ.
     * @param ConfigSetParams Configuration set information. For the value, see the parameter description of this complex type. A configuration set is the representation of the plan mode in a queue, indicating different configuration values in different time periods. All queues have the same configuration set name. For a single queue, the labels and parameters in each configuration set are the same, but the parameter values differ.
     */
    public void setConfigSetParams(ConfigSetInfo [] ConfigSetParams) {
        this.ConfigSetParams = ConfigSetParams;
    }

    /**
     * Get Specific to the capacity scheduler. It takes effect only when `OpType` is `6` and indicates which labels in this queue are to be deleted. Its priority is higher than that of LabelParams in ConfigSetParams. 
     * @return DeleteLables Specific to the capacity scheduler. It takes effect only when `OpType` is `6` and indicates which labels in this queue are to be deleted. Its priority is higher than that of LabelParams in ConfigSetParams.
     */
    public String [] getDeleteLables() {
        return this.DeleteLables;
    }

    /**
     * Set Specific to the capacity scheduler. It takes effect only when `OpType` is `6` and indicates which labels in this queue are to be deleted. Its priority is higher than that of LabelParams in ConfigSetParams.
     * @param DeleteLables Specific to the capacity scheduler. It takes effect only when `OpType` is `6` and indicates which labels in this queue are to be deleted. Its priority is higher than that of LabelParams in ConfigSetParams.
     */
    public void setDeleteLables(String [] DeleteLables) {
        this.DeleteLables = DeleteLables;
    }

    public ConfigModifyInfoV2() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigModifyInfoV2(ConfigModifyInfoV2 source) {
        if (source.OpType != null) {
            this.OpType = new Long(source.OpType);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.MyId != null) {
            this.MyId = new String(source.MyId);
        }
        if (source.BasicParams != null) {
            this.BasicParams = new ItemSeq(source.BasicParams);
        }
        if (source.ConfigSetParams != null) {
            this.ConfigSetParams = new ConfigSetInfo[source.ConfigSetParams.length];
            for (int i = 0; i < source.ConfigSetParams.length; i++) {
                this.ConfigSetParams[i] = new ConfigSetInfo(source.ConfigSetParams[i]);
            }
        }
        if (source.DeleteLables != null) {
            this.DeleteLables = new String[source.DeleteLables.length];
            for (int i = 0; i < source.DeleteLables.length; i++) {
                this.DeleteLables[i] = new String(source.DeleteLables[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpType", this.OpType);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "MyId", this.MyId);
        this.setParamObj(map, prefix + "BasicParams.", this.BasicParams);
        this.setParamArrayObj(map, prefix + "ConfigSetParams.", this.ConfigSetParams);
        this.setParamArraySimple(map, prefix + "DeleteLables.", this.DeleteLables);

    }
}

