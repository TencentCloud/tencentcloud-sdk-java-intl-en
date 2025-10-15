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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskConfiguration extends AbstractModel {

    /**
    * Resource Group ID: Must be obtained via DescribeNormalSchedulerExecutorGroups API to get the ExecutorGroupId.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Base64 encoding of the code content.
    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * Specifies the configuration list of task extended attributes.
    */
    @SerializedName("TaskExtConfigurationList")
    @Expose
    private TaskExtParameter [] TaskExtConfigurationList;

    /**
    * Cluster ID
    */
    @SerializedName("DataCluster")
    @Expose
    private String DataCluster;

    /**
    * Specifies the running node.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Resource Pool Queue Name: Must be obtained using DescribeProjectClusterQueues API.
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * Source Data Source ID - One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * Target data source ID- One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * Scheduling parameter.
    */
    @SerializedName("TaskSchedulingParameterList")
    @Expose
    private TaskSchedulingParameter [] TaskSchedulingParameterList;

    /**
    * ID used by the Bundle.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Bundle info.
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get Resource Group ID: Must be obtained via DescribeNormalSchedulerExecutorGroups API to get the ExecutorGroupId. 
     * @return ResourceGroup Resource Group ID: Must be obtained via DescribeNormalSchedulerExecutorGroups API to get the ExecutorGroupId.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Resource Group ID: Must be obtained via DescribeNormalSchedulerExecutorGroups API to get the ExecutorGroupId.
     * @param ResourceGroup Resource Group ID: Must be obtained via DescribeNormalSchedulerExecutorGroups API to get the ExecutorGroupId.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Base64 encoding of the code content. 
     * @return CodeContent Base64 encoding of the code content.
     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set Base64 encoding of the code content.
     * @param CodeContent Base64 encoding of the code content.
     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get Specifies the configuration list of task extended attributes. 
     * @return TaskExtConfigurationList Specifies the configuration list of task extended attributes.
     */
    public TaskExtParameter [] getTaskExtConfigurationList() {
        return this.TaskExtConfigurationList;
    }

    /**
     * Set Specifies the configuration list of task extended attributes.
     * @param TaskExtConfigurationList Specifies the configuration list of task extended attributes.
     */
    public void setTaskExtConfigurationList(TaskExtParameter [] TaskExtConfigurationList) {
        this.TaskExtConfigurationList = TaskExtConfigurationList;
    }

    /**
     * Get Cluster ID 
     * @return DataCluster Cluster ID
     */
    public String getDataCluster() {
        return this.DataCluster;
    }

    /**
     * Set Cluster ID
     * @param DataCluster Cluster ID
     */
    public void setDataCluster(String DataCluster) {
        this.DataCluster = DataCluster;
    }

    /**
     * Get Specifies the running node. 
     * @return BrokerIp Specifies the running node.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Specifies the running node.
     * @param BrokerIp Specifies the running node.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Resource Pool Queue Name: Must be obtained using DescribeProjectClusterQueues API. 
     * @return YarnQueue Resource Pool Queue Name: Must be obtained using DescribeProjectClusterQueues API.
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set Resource Pool Queue Name: Must be obtained using DescribeProjectClusterQueues API.
     * @param YarnQueue Resource Pool Queue Name: Must be obtained using DescribeProjectClusterQueues API.
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get Source Data Source ID - One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API. 
     * @return SourceServiceId Source Data Source ID - One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set Source Data Source ID - One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
     * @param SourceServiceId Source Data Source ID - One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get Target data source ID- One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API. 
     * @return TargetServiceId Target data source ID- One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set Target data source ID- One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
     * @param TargetServiceId Target data source ID- One or more IDs separated by semicolons (;). Retrieve IDs using the DescribeDataSourceWithoutInfo API.
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get Scheduling parameter. 
     * @return TaskSchedulingParameterList Scheduling parameter.
     */
    public TaskSchedulingParameter [] getTaskSchedulingParameterList() {
        return this.TaskSchedulingParameterList;
    }

    /**
     * Set Scheduling parameter.
     * @param TaskSchedulingParameterList Scheduling parameter.
     */
    public void setTaskSchedulingParameterList(TaskSchedulingParameter [] TaskSchedulingParameterList) {
        this.TaskSchedulingParameterList = TaskSchedulingParameterList;
    }

    /**
     * Get ID used by the Bundle. 
     * @return BundleId ID used by the Bundle.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set ID used by the Bundle.
     * @param BundleId ID used by the Bundle.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Bundle info. 
     * @return BundleInfo Bundle info.
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Bundle info.
     * @param BundleInfo Bundle info.
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public CreateTaskConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskConfiguration(CreateTaskConfiguration source) {
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.CodeContent != null) {
            this.CodeContent = new String(source.CodeContent);
        }
        if (source.TaskExtConfigurationList != null) {
            this.TaskExtConfigurationList = new TaskExtParameter[source.TaskExtConfigurationList.length];
            for (int i = 0; i < source.TaskExtConfigurationList.length; i++) {
                this.TaskExtConfigurationList[i] = new TaskExtParameter(source.TaskExtConfigurationList[i]);
            }
        }
        if (source.DataCluster != null) {
            this.DataCluster = new String(source.DataCluster);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
        if (source.YarnQueue != null) {
            this.YarnQueue = new String(source.YarnQueue);
        }
        if (source.SourceServiceId != null) {
            this.SourceServiceId = new String(source.SourceServiceId);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TaskSchedulingParameterList != null) {
            this.TaskSchedulingParameterList = new TaskSchedulingParameter[source.TaskSchedulingParameterList.length];
            for (int i = 0; i < source.TaskSchedulingParameterList.length; i++) {
                this.TaskSchedulingParameterList[i] = new TaskSchedulingParameter(source.TaskSchedulingParameterList[i]);
            }
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamArrayObj(map, prefix + "TaskExtConfigurationList.", this.TaskExtConfigurationList);
        this.setParamSimple(map, prefix + "DataCluster", this.DataCluster);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamArrayObj(map, prefix + "TaskSchedulingParameterList.", this.TaskSchedulingParameterList);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

