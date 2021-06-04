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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmHistoriesRequest extends AbstractModel{

    /**
    * Value fixed at "monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Page number starting from 1. Default value: 1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of entries per page. Value range: 1–100. Default value: 20
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sort by the first occurrence time in descending order by default. Valid values: ASC (ascending), DESC (descending)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Start time, which is the timestamp one day ago by default and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is later than the `StartTime`.
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * End time, which is the current timestamp and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is earlier than the `EndTime`.
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * Filter by monitoring type. Valid value: `MT_QCE` (Tencent Cloud service monitoring). If this parameter is left empty, all types will be queried by default.
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * Filter by alarm object. Fuzzy search with string is supported
    */
    @SerializedName("AlarmObject")
    @Expose
    private String AlarmObject;

    /**
    * Filter by alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data). If this parameter is left empty, all will be queried by default
    */
    @SerializedName("AlarmStatus")
    @Expose
    private String [] AlarmStatus;

    /**
    * Filter by project ID. Valid values: `-1` (no project), `0` (default project)
You can query [Project Management](https://console.cloud.tencent.com/project) on this page.
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * Filter by instance group ID
    */
    @SerializedName("InstanceGroupIds")
    @Expose
    private Long [] InstanceGroupIds;

    /**
    * Filter by policy type. Monitoring type and policy type are first-level and second-level filters respectively and both need to be passed in. For example, `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
This parameter can be queried with the API [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1).
    */
    @SerializedName("Namespaces")
    @Expose
    private MonitorTypeNamespace [] Namespaces;

    /**
    * Filter by metric name
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * Fuzzy search by policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Fuzzy search by alarm content
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Search by recipient. You can get the user list with the API [ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1) in “Cloud Access Management” or query the sub-user information with the API [GetUser](https://intl.cloud.tencent.com/document/product/598/34590?from_cn_redirect=1). The `Uid` field in the returned result should be entered here.
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * Search by recipient group. You can get the user group list with the API [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1) in “Cloud Access Management” or query the user group list where a sub-user is in with the API [ListGroupsForUser](https://intl.cloud.tencent.com/document/product/598/34588?from_cn_redirect=1). The `GroupId` field in the returned result should be entered here.
    */
    @SerializedName("ReceiverGroups")
    @Expose
    private Long [] ReceiverGroups;

    /**
    * Search by alarm policy ID list
    */
    @SerializedName("PolicyIds")
    @Expose
    private String [] PolicyIds;

    /**
     * Get Value fixed at "monitor" 
     * @return Module Value fixed at "monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Value fixed at "monitor"
     * @param Module Value fixed at "monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Page number starting from 1. Default value: 1 
     * @return PageNumber Page number starting from 1. Default value: 1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number starting from 1. Default value: 1
     * @param PageNumber Page number starting from 1. Default value: 1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries per page. Value range: 1–100. Default value: 20 
     * @return PageSize Number of entries per page. Value range: 1–100. Default value: 20
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: 1–100. Default value: 20
     * @param PageSize Number of entries per page. Value range: 1–100. Default value: 20
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sort by the first occurrence time in descending order by default. Valid values: ASC (ascending), DESC (descending) 
     * @return Order Sort by the first occurrence time in descending order by default. Valid values: ASC (ascending), DESC (descending)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort by the first occurrence time in descending order by default. Valid values: ASC (ascending), DESC (descending)
     * @param Order Sort by the first occurrence time in descending order by default. Valid values: ASC (ascending), DESC (descending)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Start time, which is the timestamp one day ago by default and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is later than the `StartTime`. 
     * @return StartTime Start time, which is the timestamp one day ago by default and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is later than the `StartTime`.
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time, which is the timestamp one day ago by default and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is later than the `StartTime`.
     * @param StartTime Start time, which is the timestamp one day ago by default and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is later than the `StartTime`.
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get End time, which is the current timestamp and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is earlier than the `EndTime`. 
     * @return EndTime End time, which is the current timestamp and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is earlier than the `EndTime`.
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set End time, which is the current timestamp and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is earlier than the `EndTime`.
     * @param EndTime End time, which is the current timestamp and the time when the alarm `FirstOccurTime` first occurs. An alarm record can be searched only if its `FirstOccurTime` is earlier than the `EndTime`.
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Filter by monitoring type. Valid value: `MT_QCE` (Tencent Cloud service monitoring). If this parameter is left empty, all types will be queried by default. 
     * @return MonitorTypes Filter by monitoring type. Valid value: `MT_QCE` (Tencent Cloud service monitoring). If this parameter is left empty, all types will be queried by default.
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set Filter by monitoring type. Valid value: `MT_QCE` (Tencent Cloud service monitoring). If this parameter is left empty, all types will be queried by default.
     * @param MonitorTypes Filter by monitoring type. Valid value: `MT_QCE` (Tencent Cloud service monitoring). If this parameter is left empty, all types will be queried by default.
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get Filter by alarm object. Fuzzy search with string is supported 
     * @return AlarmObject Filter by alarm object. Fuzzy search with string is supported
     */
    public String getAlarmObject() {
        return this.AlarmObject;
    }

    /**
     * Set Filter by alarm object. Fuzzy search with string is supported
     * @param AlarmObject Filter by alarm object. Fuzzy search with string is supported
     */
    public void setAlarmObject(String AlarmObject) {
        this.AlarmObject = AlarmObject;
    }

    /**
     * Get Filter by alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data). If this parameter is left empty, all will be queried by default 
     * @return AlarmStatus Filter by alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data). If this parameter is left empty, all will be queried by default
     */
    public String [] getAlarmStatus() {
        return this.AlarmStatus;
    }

    /**
     * Set Filter by alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data). If this parameter is left empty, all will be queried by default
     * @param AlarmStatus Filter by alarm status. Valid values: ALARM (not resolved), OK (resolved), NO_CONF (expired), NO_DATA (insufficient data). If this parameter is left empty, all will be queried by default
     */
    public void setAlarmStatus(String [] AlarmStatus) {
        this.AlarmStatus = AlarmStatus;
    }

    /**
     * Get Filter by project ID. Valid values: `-1` (no project), `0` (default project)
You can query [Project Management](https://console.cloud.tencent.com/project) on this page. 
     * @return ProjectIds Filter by project ID. Valid values: `-1` (no project), `0` (default project)
You can query [Project Management](https://console.cloud.tencent.com/project) on this page.
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set Filter by project ID. Valid values: `-1` (no project), `0` (default project)
You can query [Project Management](https://console.cloud.tencent.com/project) on this page.
     * @param ProjectIds Filter by project ID. Valid values: `-1` (no project), `0` (default project)
You can query [Project Management](https://console.cloud.tencent.com/project) on this page.
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get Filter by instance group ID 
     * @return InstanceGroupIds Filter by instance group ID
     */
    public Long [] getInstanceGroupIds() {
        return this.InstanceGroupIds;
    }

    /**
     * Set Filter by instance group ID
     * @param InstanceGroupIds Filter by instance group ID
     */
    public void setInstanceGroupIds(Long [] InstanceGroupIds) {
        this.InstanceGroupIds = InstanceGroupIds;
    }

    /**
     * Get Filter by policy type. Monitoring type and policy type are first-level and second-level filters respectively and both need to be passed in. For example, `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
This parameter can be queried with the API [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1). 
     * @return Namespaces Filter by policy type. Monitoring type and policy type are first-level and second-level filters respectively and both need to be passed in. For example, `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
This parameter can be queried with the API [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1).
     */
    public MonitorTypeNamespace [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set Filter by policy type. Monitoring type and policy type are first-level and second-level filters respectively and both need to be passed in. For example, `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
This parameter can be queried with the API [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1).
     * @param Namespaces Filter by policy type. Monitoring type and policy type are first-level and second-level filters respectively and both need to be passed in. For example, `[{"MonitorType": "MT_QCE", "Namespace": "cvm_device"}]`
This parameter can be queried with the API [DescribeAllNamespaces](https://intl.cloud.tencent.com/document/product/248/48683?from_cn_redirect=1).
     */
    public void setNamespaces(MonitorTypeNamespace [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get Filter by metric name 
     * @return MetricNames Filter by metric name
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * Set Filter by metric name
     * @param MetricNames Filter by metric name
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * Get Fuzzy search by policy name 
     * @return PolicyName Fuzzy search by policy name
     */
    public String getPolicyName() {
        return this.PolicyName;
    }

    /**
     * Set Fuzzy search by policy name
     * @param PolicyName Fuzzy search by policy name
     */
    public void setPolicyName(String PolicyName) {
        this.PolicyName = PolicyName;
    }

    /**
     * Get Fuzzy search by alarm content 
     * @return Content Fuzzy search by alarm content
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Fuzzy search by alarm content
     * @param Content Fuzzy search by alarm content
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Search by recipient. You can get the user list with the API [ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1) in “Cloud Access Management” or query the sub-user information with the API [GetUser](https://intl.cloud.tencent.com/document/product/598/34590?from_cn_redirect=1). The `Uid` field in the returned result should be entered here. 
     * @return ReceiverUids Search by recipient. You can get the user list with the API [ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1) in “Cloud Access Management” or query the sub-user information with the API [GetUser](https://intl.cloud.tencent.com/document/product/598/34590?from_cn_redirect=1). The `Uid` field in the returned result should be entered here.
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set Search by recipient. You can get the user list with the API [ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1) in “Cloud Access Management” or query the sub-user information with the API [GetUser](https://intl.cloud.tencent.com/document/product/598/34590?from_cn_redirect=1). The `Uid` field in the returned result should be entered here.
     * @param ReceiverUids Search by recipient. You can get the user list with the API [ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1) in “Cloud Access Management” or query the sub-user information with the API [GetUser](https://intl.cloud.tencent.com/document/product/598/34590?from_cn_redirect=1). The `Uid` field in the returned result should be entered here.
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get Search by recipient group. You can get the user group list with the API [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1) in “Cloud Access Management” or query the user group list where a sub-user is in with the API [ListGroupsForUser](https://intl.cloud.tencent.com/document/product/598/34588?from_cn_redirect=1). The `GroupId` field in the returned result should be entered here. 
     * @return ReceiverGroups Search by recipient group. You can get the user group list with the API [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1) in “Cloud Access Management” or query the user group list where a sub-user is in with the API [ListGroupsForUser](https://intl.cloud.tencent.com/document/product/598/34588?from_cn_redirect=1). The `GroupId` field in the returned result should be entered here.
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set Search by recipient group. You can get the user group list with the API [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1) in “Cloud Access Management” or query the user group list where a sub-user is in with the API [ListGroupsForUser](https://intl.cloud.tencent.com/document/product/598/34588?from_cn_redirect=1). The `GroupId` field in the returned result should be entered here.
     * @param ReceiverGroups Search by recipient group. You can get the user group list with the API [ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1) in “Cloud Access Management” or query the user group list where a sub-user is in with the API [ListGroupsForUser](https://intl.cloud.tencent.com/document/product/598/34588?from_cn_redirect=1). The `GroupId` field in the returned result should be entered here.
     */
    public void setReceiverGroups(Long [] ReceiverGroups) {
        this.ReceiverGroups = ReceiverGroups;
    }

    /**
     * Get Search by alarm policy ID list 
     * @return PolicyIds Search by alarm policy ID list
     */
    public String [] getPolicyIds() {
        return this.PolicyIds;
    }

    /**
     * Set Search by alarm policy ID list
     * @param PolicyIds Search by alarm policy ID list
     */
    public void setPolicyIds(String [] PolicyIds) {
        this.PolicyIds = PolicyIds;
    }

    public DescribeAlarmHistoriesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmHistoriesRequest(DescribeAlarmHistoriesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.AlarmObject != null) {
            this.AlarmObject = new String(source.AlarmObject);
        }
        if (source.AlarmStatus != null) {
            this.AlarmStatus = new String[source.AlarmStatus.length];
            for (int i = 0; i < source.AlarmStatus.length; i++) {
                this.AlarmStatus[i] = new String(source.AlarmStatus[i]);
            }
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.InstanceGroupIds != null) {
            this.InstanceGroupIds = new Long[source.InstanceGroupIds.length];
            for (int i = 0; i < source.InstanceGroupIds.length; i++) {
                this.InstanceGroupIds[i] = new Long(source.InstanceGroupIds[i]);
            }
        }
        if (source.Namespaces != null) {
            this.Namespaces = new MonitorTypeNamespace[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new MonitorTypeNamespace(source.Namespaces[i]);
            }
        }
        if (source.MetricNames != null) {
            this.MetricNames = new String[source.MetricNames.length];
            for (int i = 0; i < source.MetricNames.length; i++) {
                this.MetricNames[i] = new String(source.MetricNames[i]);
            }
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ReceiverUids != null) {
            this.ReceiverUids = new Long[source.ReceiverUids.length];
            for (int i = 0; i < source.ReceiverUids.length; i++) {
                this.ReceiverUids[i] = new Long(source.ReceiverUids[i]);
            }
        }
        if (source.ReceiverGroups != null) {
            this.ReceiverGroups = new Long[source.ReceiverGroups.length];
            for (int i = 0; i < source.ReceiverGroups.length; i++) {
                this.ReceiverGroups[i] = new Long(source.ReceiverGroups[i]);
            }
        }
        if (source.PolicyIds != null) {
            this.PolicyIds = new String[source.PolicyIds.length];
            for (int i = 0; i < source.PolicyIds.length; i++) {
                this.PolicyIds[i] = new String(source.PolicyIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamSimple(map, prefix + "AlarmObject", this.AlarmObject);
        this.setParamArraySimple(map, prefix + "AlarmStatus.", this.AlarmStatus);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "InstanceGroupIds.", this.InstanceGroupIds);
        this.setParamArrayObj(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "ReceiverUids.", this.ReceiverUids);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "PolicyIds.", this.PolicyIds);

    }
}

