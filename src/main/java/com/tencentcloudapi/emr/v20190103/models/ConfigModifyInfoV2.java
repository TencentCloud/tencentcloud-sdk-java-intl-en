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

- 0: create a queue.
- 1: edit - full overwrite.
- 2: create a sub-queue.
- 3: delete.
- 4: clone. It is the same as sub-queue creation. Especially, for `fair`, a sub-queue can be copied to a new queue.
- 6: edit - incremental update.
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
    * Create root queue: Pass "myId of root"; Create sub-queue: Pass "myId of the selected queue"; Clone queue: Pass "parentId of the selected queue".
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * Edit or delete operations: Require passing "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a sub-queue to a new queue.
    */
    @SerializedName("MyId")
    @Expose
    private String MyId;

    /**
    * Basic configuration. The value of key is consistent with the field returned by **DescribeYarnQueue**.###### Fair scheduler
Values of key are as follows:

- type: parent queue. Value: **parent** or **null**.
- aclSubmitApps: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: timeout of minimum share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionTimeout: timeout of fair share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. Value: **numeric string** or **null**. Numeric string range: (0,1].
- allowPreemptionFrom: preemption mode. Value: **Boolean string** or **null**.
- schedulingPolicy: scheduling policy. Value: **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler
Values of key are as follows:

- state: queue status. Value: **STOPPED** or **RUNNING**.
- default-node-label-expression: default tag expression. Value: **tag** or **null**.
- acl_submit_applications: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to each container. Value: **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of virtual cores allocated to each container. Value: **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BasicParams")
    @Expose
    private ItemSeq BasicParams;

    /**
    * Configuration set information. For the values, see the parameter description of ConfigSetInfo. Configuration set is the representation of the plan mode in the queue, containing different configuration item values for different time periods. The configuration set names of all queues are the same. For a single queue, the tags and parameters in each configuration set are the same, but the parameter values are different.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConfigSetParams")
    @Expose
    private ConfigSetInfo [] ConfigSetParams;

    /**
    * This parameter is specific for capacity scheduling and is valid only when `OpType` is set to `6`. It indicates tags to be deleted from the queue. This parameter has a higher priority than LabelParams in ConfigSetParams.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DeleteLables")
    @Expose
    private String [] DeleteLables;

    /**
     * Get Operation type. Valid values:

- 0: create a queue.
- 1: edit - full overwrite.
- 2: create a sub-queue.
- 3: delete.
- 4: clone. It is the same as sub-queue creation. Especially, for `fair`, a sub-queue can be copied to a new queue.
- 6: edit - incremental update. 
     * @return OpType Operation type. Valid values:

- 0: create a queue.
- 1: edit - full overwrite.
- 2: create a sub-queue.
- 3: delete.
- 4: clone. It is the same as sub-queue creation. Especially, for `fair`, a sub-queue can be copied to a new queue.
- 6: edit - incremental update.
     */
    public Long getOpType() {
        return this.OpType;
    }

    /**
     * Set Operation type. Valid values:

- 0: create a queue.
- 1: edit - full overwrite.
- 2: create a sub-queue.
- 3: delete.
- 4: clone. It is the same as sub-queue creation. Especially, for `fair`, a sub-queue can be copied to a new queue.
- 6: edit - incremental update.
     * @param OpType Operation type. Valid values:

- 0: create a queue.
- 1: edit - full overwrite.
- 2: create a sub-queue.
- 3: delete.
- 4: clone. It is the same as sub-queue creation. Especially, for `fair`, a sub-queue can be copied to a new queue.
- 6: edit - incremental update.
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
     * Get Create root queue: Pass "myId of root"; Create sub-queue: Pass "myId of the selected queue"; Clone queue: Pass "parentId of the selected queue". 
     * @return ParentId Create root queue: Pass "myId of root"; Create sub-queue: Pass "myId of the selected queue"; Clone queue: Pass "parentId of the selected queue".
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set Create root queue: Pass "myId of root"; Create sub-queue: Pass "myId of the selected queue"; Clone queue: Pass "parentId of the selected queue".
     * @param ParentId Create root queue: Pass "myId of root"; Create sub-queue: Pass "myId of the selected queue"; Clone queue: Pass "parentId of the selected queue".
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get Edit or delete operations: Require passing "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a sub-queue to a new queue. 
     * @return MyId Edit or delete operations: Require passing "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a sub-queue to a new queue.
     */
    public String getMyId() {
        return this.MyId;
    }

    /**
     * Set Edit or delete operations: Require passing "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a sub-queue to a new queue.
     * @param MyId Edit or delete operations: Require passing "myId of the selected queue". Passing is required for cloning only when the scheduler is `fair` in order to copy a sub-queue to a new queue.
     */
    public void setMyId(String MyId) {
        this.MyId = MyId;
    }

    /**
     * Get Basic configuration. The value of key is consistent with the field returned by **DescribeYarnQueue**.###### Fair scheduler
Values of key are as follows:

- type: parent queue. Value: **parent** or **null**.
- aclSubmitApps: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: timeout of minimum share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionTimeout: timeout of fair share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. Value: **numeric string** or **null**. Numeric string range: (0,1].
- allowPreemptionFrom: preemption mode. Value: **Boolean string** or **null**.
- schedulingPolicy: scheduling policy. Value: **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler
Values of key are as follows:

- state: queue status. Value: **STOPPED** or **RUNNING**.
- default-node-label-expression: default tag expression. Value: **tag** or **null**.
- acl_submit_applications: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to each container. Value: **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of virtual cores allocated to each container. Value: **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BasicParams Basic configuration. The value of key is consistent with the field returned by **DescribeYarnQueue**.###### Fair scheduler
Values of key are as follows:

- type: parent queue. Value: **parent** or **null**.
- aclSubmitApps: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: timeout of minimum share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionTimeout: timeout of fair share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. Value: **numeric string** or **null**. Numeric string range: (0,1].
- allowPreemptionFrom: preemption mode. Value: **Boolean string** or **null**.
- schedulingPolicy: scheduling policy. Value: **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler
Values of key are as follows:

- state: queue status. Value: **STOPPED** or **RUNNING**.
- default-node-label-expression: default tag expression. Value: **tag** or **null**.
- acl_submit_applications: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to each container. Value: **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of virtual cores allocated to each container. Value: **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ItemSeq getBasicParams() {
        return this.BasicParams;
    }

    /**
     * Set Basic configuration. The value of key is consistent with the field returned by **DescribeYarnQueue**.###### Fair scheduler
Values of key are as follows:

- type: parent queue. Value: **parent** or **null**.
- aclSubmitApps: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: timeout of minimum share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionTimeout: timeout of fair share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. Value: **numeric string** or **null**. Numeric string range: (0,1].
- allowPreemptionFrom: preemption mode. Value: **Boolean string** or **null**.
- schedulingPolicy: scheduling policy. Value: **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler
Values of key are as follows:

- state: queue status. Value: **STOPPED** or **RUNNING**.
- default-node-label-expression: default tag expression. Value: **tag** or **null**.
- acl_submit_applications: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to each container. Value: **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of virtual cores allocated to each container. Value: **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BasicParams Basic configuration. The value of key is consistent with the field returned by **DescribeYarnQueue**.###### Fair scheduler
Values of key are as follows:

- type: parent queue. Value: **parent** or **null**.
- aclSubmitApps: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- aclAdministerApps: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- minSharePreemptionTimeout: timeout of minimum share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionTimeout: timeout of fair share before preemption. Value: **numeric string** or **null**.
- fairSharePreemptionThreshold: fair share preemption threshold. Value: **numeric string** or **null**. Numeric string range: (0,1].
- allowPreemptionFrom: preemption mode. Value: **Boolean string** or **null**.
- schedulingPolicy: scheduling policy. Value: **drf**, **fair**, **fifo**, or **null**.

```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
###### Capacity scheduler
Values of key are as follows:

- state: queue status. Value: **STOPPED** or **RUNNING**.
- default-node-label-expression: default tag expression. Value: **tag** or **null**.
- acl_submit_applications: submission ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- acl_administer_queue: administration ACL. Value: **JSON string of the AclForYarnQueue type** or **null**.
- maximum-allocation-mb: maximum memory allocated to each container. Value: **numeric string** or **null**.
- maximum-allocation-vcores: maximum number of virtual cores allocated to each container. Value: **numeric string** or **null**.
```
type AclForYarnQueue struct {
	User  *string `json:"user"` // Username
	Group *string `json:"group"`// Group name
}
```
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBasicParams(ItemSeq BasicParams) {
        this.BasicParams = BasicParams;
    }

    /**
     * Get Configuration set information. For the values, see the parameter description of ConfigSetInfo. Configuration set is the representation of the plan mode in the queue, containing different configuration item values for different time periods. The configuration set names of all queues are the same. For a single queue, the tags and parameters in each configuration set are the same, but the parameter values are different.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ConfigSetParams Configuration set information. For the values, see the parameter description of ConfigSetInfo. Configuration set is the representation of the plan mode in the queue, containing different configuration item values for different time periods. The configuration set names of all queues are the same. For a single queue, the tags and parameters in each configuration set are the same, but the parameter values are different.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ConfigSetInfo [] getConfigSetParams() {
        return this.ConfigSetParams;
    }

    /**
     * Set Configuration set information. For the values, see the parameter description of ConfigSetInfo. Configuration set is the representation of the plan mode in the queue, containing different configuration item values for different time periods. The configuration set names of all queues are the same. For a single queue, the tags and parameters in each configuration set are the same, but the parameter values are different.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ConfigSetParams Configuration set information. For the values, see the parameter description of ConfigSetInfo. Configuration set is the representation of the plan mode in the queue, containing different configuration item values for different time periods. The configuration set names of all queues are the same. For a single queue, the tags and parameters in each configuration set are the same, but the parameter values are different.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setConfigSetParams(ConfigSetInfo [] ConfigSetParams) {
        this.ConfigSetParams = ConfigSetParams;
    }

    /**
     * Get This parameter is specific for capacity scheduling and is valid only when `OpType` is set to `6`. It indicates tags to be deleted from the queue. This parameter has a higher priority than LabelParams in ConfigSetParams.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DeleteLables This parameter is specific for capacity scheduling and is valid only when `OpType` is set to `6`. It indicates tags to be deleted from the queue. This parameter has a higher priority than LabelParams in ConfigSetParams.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDeleteLables() {
        return this.DeleteLables;
    }

    /**
     * Set This parameter is specific for capacity scheduling and is valid only when `OpType` is set to `6`. It indicates tags to be deleted from the queue. This parameter has a higher priority than LabelParams in ConfigSetParams.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DeleteLables This parameter is specific for capacity scheduling and is valid only when `OpType` is set to `6`. It indicates tags to be deleted from the queue. This parameter has a higher priority than LabelParams in ConfigSetParams.
Note: This field may return null, indicating that no valid values can be obtained.
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

