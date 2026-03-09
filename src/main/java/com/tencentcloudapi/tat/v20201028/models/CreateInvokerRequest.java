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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateInvokerRequest extends AbstractModel {

    /**
    * Executor name. length not exceeding 120 characters.
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Executor type.

Selectable values (currently only support one):.

-`SCHEDULE`: period type executor.
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * Remote command ID.

Call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
    */
    @SerializedName("CommandId")
    @Expose
    private String CommandId;

    /**
    * Trigger associated instance ID. list cap 100.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The instance needs to have the TAT client installed, and the client must be in Online status. you can query client status via the [DescribeAutomationAgentStatus](https://www.tencentcloud.comom/document/api/1340/52682?from_cn_redirect=1) api.
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * Command execution user. length not exceeding 256 characters.
    */
    @SerializedName("Username")
    @Expose
    private String Username;

    /**
    * Command custom parameter. field type is JSON encode string.

This parameter can be set only when EnableParameter of the command specified by CommandId is true. obtain the EnableParameter settings through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
    */
    @SerializedName("Parameters")
    @Expose
    private String Parameters;

    /**
    * Recurring invoker settings.

When the executor type is `SCHEDULE`, specify this parameter.
    */
    @SerializedName("ScheduleSettings")
    @Expose
    private ScheduleSettings ScheduleSettings;

    /**
    * Tag associated with the command. list length not exceeding 10.
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * Get Executor name. length not exceeding 120 characters. 
     * @return Name Executor name. length not exceeding 120 characters.
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Executor name. length not exceeding 120 characters.
     * @param Name Executor name. length not exceeding 120 characters.
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Executor type.

Selectable values (currently only support one):.

-`SCHEDULE`: period type executor. 
     * @return Type Executor type.

Selectable values (currently only support one):.

-`SCHEDULE`: period type executor.
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set Executor type.

Selectable values (currently only support one):.

-`SCHEDULE`: period type executor.
     * @param Type Executor type.

Selectable values (currently only support one):.

-`SCHEDULE`: period type executor.
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get Remote command ID.

Call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details. 
     * @return CommandId Remote command ID.

Call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public String getCommandId() {
        return this.CommandId;
    }

    /**
     * Set Remote command ID.

Call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     * @param CommandId Remote command ID.

Call the [DescribeCommands](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api to query command details.
     */
    public void setCommandId(String CommandId) {
        this.CommandId = CommandId;
    }

    /**
     * Get Trigger associated instance ID. list cap 100.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The instance needs to have the TAT client installed, and the client must be in Online status. you can query client status via the [DescribeAutomationAgentStatus](https://www.tencentcloud.comom/document/api/1340/52682?from_cn_redirect=1) api. 
     * @return InstanceIds Trigger associated instance ID. list cap 100.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The instance needs to have the TAT client installed, and the client must be in Online status. you can query client status via the [DescribeAutomationAgentStatus](https://www.tencentcloud.comom/document/api/1340/52682?from_cn_redirect=1) api.
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set Trigger associated instance ID. list cap 100.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The instance needs to have the TAT client installed, and the client must be in Online status. you can query client status via the [DescribeAutomationAgentStatus](https://www.tencentcloud.comom/document/api/1340/52682?from_cn_redirect=1) api.
     * @param InstanceIds Trigger associated instance ID. list cap 100.

You can get the instance ID through the query instance interface of corresponding cloud services. currently supports instance types: CVM, Lighthouse, and TAT managed instances.

The instance needs to have the TAT client installed, and the client must be in Online status. you can query client status via the [DescribeAutomationAgentStatus](https://www.tencentcloud.comom/document/api/1340/52682?from_cn_redirect=1) api.
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get Command execution user. length not exceeding 256 characters. 
     * @return Username Command execution user. length not exceeding 256 characters.
     */
    public String getUsername() {
        return this.Username;
    }

    /**
     * Set Command execution user. length not exceeding 256 characters.
     * @param Username Command execution user. length not exceeding 256 characters.
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * Get Command custom parameter. field type is JSON encode string.

This parameter can be set only when EnableParameter of the command specified by CommandId is true. obtain the EnableParameter settings through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api. 
     * @return Parameters Command custom parameter. field type is JSON encode string.

This parameter can be set only when EnableParameter of the command specified by CommandId is true. obtain the EnableParameter settings through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
     */
    public String getParameters() {
        return this.Parameters;
    }

    /**
     * Set Command custom parameter. field type is JSON encode string.

This parameter can be set only when EnableParameter of the command specified by CommandId is true. obtain the EnableParameter settings through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
     * @param Parameters Command custom parameter. field type is JSON encode string.

This parameter can be set only when EnableParameter of the command specified by CommandId is true. obtain the EnableParameter settings through the [DescribeCommands (query command details)](https://www.tencentcloud.comom/document/api/1340/52681?from_cn_redirect=1) api.
     */
    public void setParameters(String Parameters) {
        this.Parameters = Parameters;
    }

    /**
     * Get Recurring invoker settings.

When the executor type is `SCHEDULE`, specify this parameter. 
     * @return ScheduleSettings Recurring invoker settings.

When the executor type is `SCHEDULE`, specify this parameter.
     */
    public ScheduleSettings getScheduleSettings() {
        return this.ScheduleSettings;
    }

    /**
     * Set Recurring invoker settings.

When the executor type is `SCHEDULE`, specify this parameter.
     * @param ScheduleSettings Recurring invoker settings.

When the executor type is `SCHEDULE`, specify this parameter.
     */
    public void setScheduleSettings(ScheduleSettings ScheduleSettings) {
        this.ScheduleSettings = ScheduleSettings;
    }

    /**
     * Get Tag associated with the command. list length not exceeding 10. 
     * @return Tags Tag associated with the command. list length not exceeding 10.
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Tag associated with the command. list length not exceeding 10.
     * @param Tags Tag associated with the command. list length not exceeding 10.
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateInvokerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateInvokerRequest(CreateInvokerRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CommandId != null) {
            this.CommandId = new String(source.CommandId);
        }
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.Username != null) {
            this.Username = new String(source.Username);
        }
        if (source.Parameters != null) {
            this.Parameters = new String(source.Parameters);
        }
        if (source.ScheduleSettings != null) {
            this.ScheduleSettings = new ScheduleSettings(source.ScheduleSettings);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CommandId", this.CommandId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "Username", this.Username);
        this.setParamSimple(map, prefix + "Parameters", this.Parameters);
        this.setParamObj(map, prefix + "ScheduleSettings.", this.ScheduleSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

