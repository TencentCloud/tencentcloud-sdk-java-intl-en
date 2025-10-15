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

public class TaskConfiguration extends AbstractModel {

    /**
    * Base64 encoding of the code content.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("CodeContent")
    @Expose
    private String CodeContent;

    /**
    * Extended attribute configuration list of the task.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskExtConfigurationList")
    @Expose
    private TaskExtParameter [] TaskExtConfigurationList;

    /**
    * Cluster ID

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DataCluster")
    @Expose
    private String DataCluster;

    /**
    * Specifies the specified running node.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
    * Resource pool queue name. need to pass through DescribeProjectClusterQueues to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("YarnQueue")
    @Expose
    private String YarnQueue;

    /**
    * Source data source ID, separated by;, obtained through DescribeDataSourceWithoutInfo.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceServiceId")
    @Expose
    private String SourceServiceId;

    /**
    * Data source type. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceServiceType")
    @Expose
    private String SourceServiceType;

    /**
    * Data source name. use semicolons to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SourceServiceName")
    @Expose
    private String SourceServiceName;

    /**
    * TargetTarget data source ID, separated by semicolons. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetServiceId")
    @Expose
    private String TargetServiceId;

    /**
    * Target data source type. uses ; for separation. needs to pass through DescribeDataSourceWithoutInfo for retrieval.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetServiceType")
    @Expose
    private String TargetServiceType;

    /**
    * Target data source name. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TargetServiceName")
    @Expose
    private String TargetServiceName;

    /**
    * Resource group ID: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupId.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroup")
    @Expose
    private String ResourceGroup;

    /**
    * Resource group name: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupName.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ResourceGroupName")
    @Expose
    private String ResourceGroupName;

    /**
    * Specifies the scheduling parameter.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TaskSchedulingParameterList")
    @Expose
    private TaskSchedulingParameter [] TaskSchedulingParameterList;

    /**
    * ID used by the Bundle.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Bundle info.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get Base64 encoding of the code content.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return CodeContent Base64 encoding of the code content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getCodeContent() {
        return this.CodeContent;
    }

    /**
     * Set Base64 encoding of the code content.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param CodeContent Base64 encoding of the code content.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setCodeContent(String CodeContent) {
        this.CodeContent = CodeContent;
    }

    /**
     * Get Extended attribute configuration list of the task.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskExtConfigurationList Extended attribute configuration list of the task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskExtParameter [] getTaskExtConfigurationList() {
        return this.TaskExtConfigurationList;
    }

    /**
     * Set Extended attribute configuration list of the task.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskExtConfigurationList Extended attribute configuration list of the task.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskExtConfigurationList(TaskExtParameter [] TaskExtConfigurationList) {
        this.TaskExtConfigurationList = TaskExtConfigurationList;
    }

    /**
     * Get Cluster ID

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DataCluster Cluster ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getDataCluster() {
        return this.DataCluster;
    }

    /**
     * Set Cluster ID

Note: This field may return null, indicating that no valid values can be obtained.
     * @param DataCluster Cluster ID

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDataCluster(String DataCluster) {
        this.DataCluster = DataCluster;
    }

    /**
     * Get Specifies the specified running node.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BrokerIp Specifies the specified running node.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Specifies the specified running node.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BrokerIp Specifies the specified running node.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    /**
     * Get Resource pool queue name. need to pass through DescribeProjectClusterQueues to obtain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return YarnQueue Resource pool queue name. need to pass through DescribeProjectClusterQueues to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getYarnQueue() {
        return this.YarnQueue;
    }

    /**
     * Set Resource pool queue name. need to pass through DescribeProjectClusterQueues to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param YarnQueue Resource pool queue name. need to pass through DescribeProjectClusterQueues to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setYarnQueue(String YarnQueue) {
        this.YarnQueue = YarnQueue;
    }

    /**
     * Get Source data source ID, separated by;, obtained through DescribeDataSourceWithoutInfo.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceServiceId Source data source ID, separated by;, obtained through DescribeDataSourceWithoutInfo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceServiceId() {
        return this.SourceServiceId;
    }

    /**
     * Set Source data source ID, separated by;, obtained through DescribeDataSourceWithoutInfo.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceServiceId Source data source ID, separated by;, obtained through DescribeDataSourceWithoutInfo.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceServiceId(String SourceServiceId) {
        this.SourceServiceId = SourceServiceId;
    }

    /**
     * Get Data source type. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceServiceType Data source type. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceServiceType() {
        return this.SourceServiceType;
    }

    /**
     * Set Data source type. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceServiceType Data source type. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceServiceType(String SourceServiceType) {
        this.SourceServiceType = SourceServiceType;
    }

    /**
     * Get Data source name. use semicolons to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return SourceServiceName Data source name. use semicolons to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getSourceServiceName() {
        return this.SourceServiceName;
    }

    /**
     * Set Data source name. use semicolons to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param SourceServiceName Data source name. use semicolons to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setSourceServiceName(String SourceServiceName) {
        this.SourceServiceName = SourceServiceName;
    }

    /**
     * Get TargetTarget data source ID, separated by semicolons. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetServiceId TargetTarget data source ID, separated by semicolons. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetServiceId() {
        return this.TargetServiceId;
    }

    /**
     * Set TargetTarget data source ID, separated by semicolons. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetServiceId TargetTarget data source ID, separated by semicolons. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetServiceId(String TargetServiceId) {
        this.TargetServiceId = TargetServiceId;
    }

    /**
     * Get Target data source type. uses ; for separation. needs to pass through DescribeDataSourceWithoutInfo for retrieval.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetServiceType Target data source type. uses ; for separation. needs to pass through DescribeDataSourceWithoutInfo for retrieval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetServiceType() {
        return this.TargetServiceType;
    }

    /**
     * Set Target data source type. uses ; for separation. needs to pass through DescribeDataSourceWithoutInfo for retrieval.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetServiceType Target data source type. uses ; for separation. needs to pass through DescribeDataSourceWithoutInfo for retrieval.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetServiceType(String TargetServiceType) {
        this.TargetServiceType = TargetServiceType;
    }

    /**
     * Get Target data source name. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TargetServiceName Target data source name. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getTargetServiceName() {
        return this.TargetServiceName;
    }

    /**
     * Set Target data source name. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TargetServiceName Target data source name. use semicolon to separate. need to pass through DescribeDataSourceWithoutInfo to obtain.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTargetServiceName(String TargetServiceName) {
        this.TargetServiceName = TargetServiceName;
    }

    /**
     * Get Resource group ID: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupId.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroup Resource group ID: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroup() {
        return this.ResourceGroup;
    }

    /**
     * Set Resource group ID: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroup Resource group ID: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupId.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroup(String ResourceGroup) {
        this.ResourceGroup = ResourceGroup;
    }

    /**
     * Get Resource group name: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupName.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ResourceGroupName Resource group name: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupName.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getResourceGroupName() {
        return this.ResourceGroupName;
    }

    /**
     * Set Resource group name: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupName.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ResourceGroupName Resource group name: need to pass through DescribeNormalSchedulerExecutorGroups to obtain ExecutorGroupName.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setResourceGroupName(String ResourceGroupName) {
        this.ResourceGroupName = ResourceGroupName;
    }

    /**
     * Get Specifies the scheduling parameter.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TaskSchedulingParameterList Specifies the scheduling parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public TaskSchedulingParameter [] getTaskSchedulingParameterList() {
        return this.TaskSchedulingParameterList;
    }

    /**
     * Set Specifies the scheduling parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TaskSchedulingParameterList Specifies the scheduling parameter.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTaskSchedulingParameterList(TaskSchedulingParameter [] TaskSchedulingParameterList) {
        this.TaskSchedulingParameterList = TaskSchedulingParameterList;
    }

    /**
     * Get ID used by the Bundle.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BundleId ID used by the Bundle.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set ID used by the Bundle.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BundleId ID used by the Bundle.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Bundle info.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return BundleInfo Bundle info.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set Bundle info.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param BundleInfo Bundle info.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public TaskConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskConfiguration(TaskConfiguration source) {
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
        if (source.SourceServiceType != null) {
            this.SourceServiceType = new String(source.SourceServiceType);
        }
        if (source.SourceServiceName != null) {
            this.SourceServiceName = new String(source.SourceServiceName);
        }
        if (source.TargetServiceId != null) {
            this.TargetServiceId = new String(source.TargetServiceId);
        }
        if (source.TargetServiceType != null) {
            this.TargetServiceType = new String(source.TargetServiceType);
        }
        if (source.TargetServiceName != null) {
            this.TargetServiceName = new String(source.TargetServiceName);
        }
        if (source.ResourceGroup != null) {
            this.ResourceGroup = new String(source.ResourceGroup);
        }
        if (source.ResourceGroupName != null) {
            this.ResourceGroupName = new String(source.ResourceGroupName);
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
        this.setParamSimple(map, prefix + "CodeContent", this.CodeContent);
        this.setParamArrayObj(map, prefix + "TaskExtConfigurationList.", this.TaskExtConfigurationList);
        this.setParamSimple(map, prefix + "DataCluster", this.DataCluster);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);
        this.setParamSimple(map, prefix + "YarnQueue", this.YarnQueue);
        this.setParamSimple(map, prefix + "SourceServiceId", this.SourceServiceId);
        this.setParamSimple(map, prefix + "SourceServiceType", this.SourceServiceType);
        this.setParamSimple(map, prefix + "SourceServiceName", this.SourceServiceName);
        this.setParamSimple(map, prefix + "TargetServiceId", this.TargetServiceId);
        this.setParamSimple(map, prefix + "TargetServiceType", this.TargetServiceType);
        this.setParamSimple(map, prefix + "TargetServiceName", this.TargetServiceName);
        this.setParamSimple(map, prefix + "ResourceGroup", this.ResourceGroup);
        this.setParamSimple(map, prefix + "ResourceGroupName", this.ResourceGroupName);
        this.setParamArrayObj(map, prefix + "TaskSchedulingParameterList.", this.TaskSchedulingParameterList);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

