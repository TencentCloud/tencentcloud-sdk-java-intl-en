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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmPoliciesRequest extends AbstractModel {

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
    * Fuzzy search by policy name
    */
    @SerializedName("PolicyName")
    @Expose
    private String PolicyName;

    /**
    * Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
    */
    @SerializedName("MonitorTypes")
    @Expose
    private String [] MonitorTypes;

    /**
    * Filter by namespace. For the values of different policy types, please see:
[Policy Type List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
    */
    @SerializedName("Namespaces")
    @Expose
    private String [] Namespaces;

    /**
    * The alarm object list, which is a JSON string. The outer array corresponds to multiple instances, and the inner array is the dimension of an object. For example, “CVM - Basic Monitor” can be written as:
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
You can also refer to the “Example 2” below.

For more information on the parameter samples of different Tencent Cloud services, see [Product Policy Type and Dimension Information](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1).

Note: If `1` is passed in for `NeedCorrespondence`, the relationship between a policy and an instance needs to be returned. You can pass in up to 20 alarm object dimensions to avoid request timeout.
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

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
    * Filter by default policy. Valid values: DEFAULT (display default policy), NOT_DEFAULT (display non-default policies). If this parameter is left empty, all policies will be displayed
    */
    @SerializedName("PolicyType")
    @Expose
    private String [] PolicyType;

    /**
    * Sort by field. For example, to sort by the last modification time, use Field: "UpdateTime".
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * Sort order. Valid values: ASC (ascending), DESC (descending)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * ID array of the policy project, which can be viewed on the following page:
[Project Management](https://console.cloud.tencent.com/project)
    */
    @SerializedName("ProjectIds")
    @Expose
    private Long [] ProjectIds;

    /**
    * List of the notification template IDs, which can be obtained by querying the notification template list.
It can be queried with the API [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1).
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * Filter by trigger condition. Valid values: STATIC (display policies with static threshold), DYNAMIC (display policies with dynamic threshold). If this parameter is left empty, all policies will be displayed
    */
    @SerializedName("RuleTypes")
    @Expose
    private String [] RuleTypes;

    /**
    * Filter by alarm status. Valid values: [1]: enabled; [0]: disabled; [0, 1]: all
    */
    @SerializedName("Enable")
    @Expose
    private Long [] Enable;

    /**
    * If `1` is passed in, alarm policies with no notification rules configured are queried. If it is left empty or other values are passed in, all alarm policies are queried.
    */
    @SerializedName("NotBindingNoticeRule")
    @Expose
    private Long NotBindingNoticeRule;

    /**
    * Instance group ID.
    */
    @SerializedName("InstanceGroupId")
    @Expose
    private Long InstanceGroupId;

    /**
    * Whether the relationship between a policy and the input parameter filter dimension is required. `1`: Yes. `0`: No. Default value: `0`.
    */
    @SerializedName("NeedCorrespondence")
    @Expose
    private Long NeedCorrespondence;

    /**
    * Filter alarm policy by triggered task (such as auto scaling task). Up to 10 tasks can be specified.
    */
    @SerializedName("TriggerTasks")
    @Expose
    private AlarmPolicyTriggerTask [] TriggerTasks;

    /**
    * Filter by quick alarm policy. If this parameter is left empty, all policies are displayed. `ONECLICK`: Display quick alarm policies; `NOT_ONECLICK`: Display non-quick alarm policies.
    */
    @SerializedName("OneClickPolicyType")
    @Expose
    private String [] OneClickPolicyType;

    /**
    * Whether the returned result needs to filter policies associated with all objects. Valid values: `1` (Yes), `0` (No).
    */
    @SerializedName("NotBindAll")
    @Expose
    private Long NotBindAll;

    /**
    * Whether the returned result needs to filter policies associated with instance groups. Valid values: `1` (Yes), `0` (No).
    */
    @SerializedName("NotInstanceGroup")
    @Expose
    private Long NotInstanceGroup;

    /**
    * Filter policies by tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * ID of the TencentCloud Managed Service for Prometheus instance, which is used for customizing a metric policy.
    */
    @SerializedName("PromInsId")
    @Expose
    private String PromInsId;

    /**
    * Search by schedule
    */
    @SerializedName("ReceiverOnCallFormIDs")
    @Expose
    private String [] ReceiverOnCallFormIDs;

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
     * Get Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default 
     * @return MonitorTypes Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
     */
    public String [] getMonitorTypes() {
        return this.MonitorTypes;
    }

    /**
     * Set Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
     * @param MonitorTypes Filter by monitor type. Valid values: MT_QCE (Tencent Cloud service monitoring). If this parameter is left empty, all will be queried by default
     */
    public void setMonitorTypes(String [] MonitorTypes) {
        this.MonitorTypes = MonitorTypes;
    }

    /**
     * Get Filter by namespace. For the values of different policy types, please see:
[Policy Type List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1) 
     * @return Namespaces Filter by namespace. For the values of different policy types, please see:
[Policy Type List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     */
    public String [] getNamespaces() {
        return this.Namespaces;
    }

    /**
     * Set Filter by namespace. For the values of different policy types, please see:
[Policy Type List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     * @param Namespaces Filter by namespace. For the values of different policy types, please see:
[Policy Type List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     */
    public void setNamespaces(String [] Namespaces) {
        this.Namespaces = Namespaces;
    }

    /**
     * Get The alarm object list, which is a JSON string. The outer array corresponds to multiple instances, and the inner array is the dimension of an object. For example, “CVM - Basic Monitor” can be written as:
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
You can also refer to the “Example 2” below.

For more information on the parameter samples of different Tencent Cloud services, see [Product Policy Type and Dimension Information](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1).

Note: If `1` is passed in for `NeedCorrespondence`, the relationship between a policy and an instance needs to be returned. You can pass in up to 20 alarm object dimensions to avoid request timeout. 
     * @return Dimensions The alarm object list, which is a JSON string. The outer array corresponds to multiple instances, and the inner array is the dimension of an object. For example, “CVM - Basic Monitor” can be written as:
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
You can also refer to the “Example 2” below.

For more information on the parameter samples of different Tencent Cloud services, see [Product Policy Type and Dimension Information](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1).

Note: If `1` is passed in for `NeedCorrespondence`, the relationship between a policy and an instance needs to be returned. You can pass in up to 20 alarm object dimensions to avoid request timeout.
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set The alarm object list, which is a JSON string. The outer array corresponds to multiple instances, and the inner array is the dimension of an object. For example, “CVM - Basic Monitor” can be written as:
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
You can also refer to the “Example 2” below.

For more information on the parameter samples of different Tencent Cloud services, see [Product Policy Type and Dimension Information](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1).

Note: If `1` is passed in for `NeedCorrespondence`, the relationship between a policy and an instance needs to be returned. You can pass in up to 20 alarm object dimensions to avoid request timeout.
     * @param Dimensions The alarm object list, which is a JSON string. The outer array corresponds to multiple instances, and the inner array is the dimension of an object. For example, “CVM - Basic Monitor” can be written as:
`[ {"Dimensions": {"unInstanceId": "ins-qr8d555g"}}, {"Dimensions": {"unInstanceId": "ins-qr8d555h"}} ]`
You can also refer to the “Example 2” below.

For more information on the parameter samples of different Tencent Cloud services, see [Product Policy Type and Dimension Information](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1).

Note: If `1` is passed in for `NeedCorrespondence`, the relationship between a policy and an instance needs to be returned. You can pass in up to 20 alarm object dimensions to avoid request timeout.
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
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
     * Get Filter by default policy. Valid values: DEFAULT (display default policy), NOT_DEFAULT (display non-default policies). If this parameter is left empty, all policies will be displayed 
     * @return PolicyType Filter by default policy. Valid values: DEFAULT (display default policy), NOT_DEFAULT (display non-default policies). If this parameter is left empty, all policies will be displayed
     */
    public String [] getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set Filter by default policy. Valid values: DEFAULT (display default policy), NOT_DEFAULT (display non-default policies). If this parameter is left empty, all policies will be displayed
     * @param PolicyType Filter by default policy. Valid values: DEFAULT (display default policy), NOT_DEFAULT (display non-default policies). If this parameter is left empty, all policies will be displayed
     */
    public void setPolicyType(String [] PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get Sort by field. For example, to sort by the last modification time, use Field: "UpdateTime". 
     * @return Field Sort by field. For example, to sort by the last modification time, use Field: "UpdateTime".
     */
    public String getField() {
        return this.Field;
    }

    /**
     * Set Sort by field. For example, to sort by the last modification time, use Field: "UpdateTime".
     * @param Field Sort by field. For example, to sort by the last modification time, use Field: "UpdateTime".
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * Get Sort order. Valid values: ASC (ascending), DESC (descending) 
     * @return Order Sort order. Valid values: ASC (ascending), DESC (descending)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort order. Valid values: ASC (ascending), DESC (descending)
     * @param Order Sort order. Valid values: ASC (ascending), DESC (descending)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get ID array of the policy project, which can be viewed on the following page:
[Project Management](https://console.cloud.tencent.com/project) 
     * @return ProjectIds ID array of the policy project, which can be viewed on the following page:
[Project Management](https://console.cloud.tencent.com/project)
     */
    public Long [] getProjectIds() {
        return this.ProjectIds;
    }

    /**
     * Set ID array of the policy project, which can be viewed on the following page:
[Project Management](https://console.cloud.tencent.com/project)
     * @param ProjectIds ID array of the policy project, which can be viewed on the following page:
[Project Management](https://console.cloud.tencent.com/project)
     */
    public void setProjectIds(Long [] ProjectIds) {
        this.ProjectIds = ProjectIds;
    }

    /**
     * Get List of the notification template IDs, which can be obtained by querying the notification template list.
It can be queried with the API [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1). 
     * @return NoticeIds List of the notification template IDs, which can be obtained by querying the notification template list.
It can be queried with the API [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1).
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set List of the notification template IDs, which can be obtained by querying the notification template list.
It can be queried with the API [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1).
     * @param NoticeIds List of the notification template IDs, which can be obtained by querying the notification template list.
It can be queried with the API [DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1).
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get Filter by trigger condition. Valid values: STATIC (display policies with static threshold), DYNAMIC (display policies with dynamic threshold). If this parameter is left empty, all policies will be displayed 
     * @return RuleTypes Filter by trigger condition. Valid values: STATIC (display policies with static threshold), DYNAMIC (display policies with dynamic threshold). If this parameter is left empty, all policies will be displayed
     */
    public String [] getRuleTypes() {
        return this.RuleTypes;
    }

    /**
     * Set Filter by trigger condition. Valid values: STATIC (display policies with static threshold), DYNAMIC (display policies with dynamic threshold). If this parameter is left empty, all policies will be displayed
     * @param RuleTypes Filter by trigger condition. Valid values: STATIC (display policies with static threshold), DYNAMIC (display policies with dynamic threshold). If this parameter is left empty, all policies will be displayed
     */
    public void setRuleTypes(String [] RuleTypes) {
        this.RuleTypes = RuleTypes;
    }

    /**
     * Get Filter by alarm status. Valid values: [1]: enabled; [0]: disabled; [0, 1]: all 
     * @return Enable Filter by alarm status. Valid values: [1]: enabled; [0]: disabled; [0, 1]: all
     */
    public Long [] getEnable() {
        return this.Enable;
    }

    /**
     * Set Filter by alarm status. Valid values: [1]: enabled; [0]: disabled; [0, 1]: all
     * @param Enable Filter by alarm status. Valid values: [1]: enabled; [0]: disabled; [0, 1]: all
     */
    public void setEnable(Long [] Enable) {
        this.Enable = Enable;
    }

    /**
     * Get If `1` is passed in, alarm policies with no notification rules configured are queried. If it is left empty or other values are passed in, all alarm policies are queried. 
     * @return NotBindingNoticeRule If `1` is passed in, alarm policies with no notification rules configured are queried. If it is left empty or other values are passed in, all alarm policies are queried.
     */
    public Long getNotBindingNoticeRule() {
        return this.NotBindingNoticeRule;
    }

    /**
     * Set If `1` is passed in, alarm policies with no notification rules configured are queried. If it is left empty or other values are passed in, all alarm policies are queried.
     * @param NotBindingNoticeRule If `1` is passed in, alarm policies with no notification rules configured are queried. If it is left empty or other values are passed in, all alarm policies are queried.
     */
    public void setNotBindingNoticeRule(Long NotBindingNoticeRule) {
        this.NotBindingNoticeRule = NotBindingNoticeRule;
    }

    /**
     * Get Instance group ID. 
     * @return InstanceGroupId Instance group ID.
     */
    public Long getInstanceGroupId() {
        return this.InstanceGroupId;
    }

    /**
     * Set Instance group ID.
     * @param InstanceGroupId Instance group ID.
     */
    public void setInstanceGroupId(Long InstanceGroupId) {
        this.InstanceGroupId = InstanceGroupId;
    }

    /**
     * Get Whether the relationship between a policy and the input parameter filter dimension is required. `1`: Yes. `0`: No. Default value: `0`. 
     * @return NeedCorrespondence Whether the relationship between a policy and the input parameter filter dimension is required. `1`: Yes. `0`: No. Default value: `0`.
     */
    public Long getNeedCorrespondence() {
        return this.NeedCorrespondence;
    }

    /**
     * Set Whether the relationship between a policy and the input parameter filter dimension is required. `1`: Yes. `0`: No. Default value: `0`.
     * @param NeedCorrespondence Whether the relationship between a policy and the input parameter filter dimension is required. `1`: Yes. `0`: No. Default value: `0`.
     */
    public void setNeedCorrespondence(Long NeedCorrespondence) {
        this.NeedCorrespondence = NeedCorrespondence;
    }

    /**
     * Get Filter alarm policy by triggered task (such as auto scaling task). Up to 10 tasks can be specified. 
     * @return TriggerTasks Filter alarm policy by triggered task (such as auto scaling task). Up to 10 tasks can be specified.
     */
    public AlarmPolicyTriggerTask [] getTriggerTasks() {
        return this.TriggerTasks;
    }

    /**
     * Set Filter alarm policy by triggered task (such as auto scaling task). Up to 10 tasks can be specified.
     * @param TriggerTasks Filter alarm policy by triggered task (such as auto scaling task). Up to 10 tasks can be specified.
     */
    public void setTriggerTasks(AlarmPolicyTriggerTask [] TriggerTasks) {
        this.TriggerTasks = TriggerTasks;
    }

    /**
     * Get Filter by quick alarm policy. If this parameter is left empty, all policies are displayed. `ONECLICK`: Display quick alarm policies; `NOT_ONECLICK`: Display non-quick alarm policies. 
     * @return OneClickPolicyType Filter by quick alarm policy. If this parameter is left empty, all policies are displayed. `ONECLICK`: Display quick alarm policies; `NOT_ONECLICK`: Display non-quick alarm policies.
     */
    public String [] getOneClickPolicyType() {
        return this.OneClickPolicyType;
    }

    /**
     * Set Filter by quick alarm policy. If this parameter is left empty, all policies are displayed. `ONECLICK`: Display quick alarm policies; `NOT_ONECLICK`: Display non-quick alarm policies.
     * @param OneClickPolicyType Filter by quick alarm policy. If this parameter is left empty, all policies are displayed. `ONECLICK`: Display quick alarm policies; `NOT_ONECLICK`: Display non-quick alarm policies.
     */
    public void setOneClickPolicyType(String [] OneClickPolicyType) {
        this.OneClickPolicyType = OneClickPolicyType;
    }

    /**
     * Get Whether the returned result needs to filter policies associated with all objects. Valid values: `1` (Yes), `0` (No). 
     * @return NotBindAll Whether the returned result needs to filter policies associated with all objects. Valid values: `1` (Yes), `0` (No).
     */
    public Long getNotBindAll() {
        return this.NotBindAll;
    }

    /**
     * Set Whether the returned result needs to filter policies associated with all objects. Valid values: `1` (Yes), `0` (No).
     * @param NotBindAll Whether the returned result needs to filter policies associated with all objects. Valid values: `1` (Yes), `0` (No).
     */
    public void setNotBindAll(Long NotBindAll) {
        this.NotBindAll = NotBindAll;
    }

    /**
     * Get Whether the returned result needs to filter policies associated with instance groups. Valid values: `1` (Yes), `0` (No). 
     * @return NotInstanceGroup Whether the returned result needs to filter policies associated with instance groups. Valid values: `1` (Yes), `0` (No).
     */
    public Long getNotInstanceGroup() {
        return this.NotInstanceGroup;
    }

    /**
     * Set Whether the returned result needs to filter policies associated with instance groups. Valid values: `1` (Yes), `0` (No).
     * @param NotInstanceGroup Whether the returned result needs to filter policies associated with instance groups. Valid values: `1` (Yes), `0` (No).
     */
    public void setNotInstanceGroup(Long NotInstanceGroup) {
        this.NotInstanceGroup = NotInstanceGroup;
    }

    /**
     * Get Filter policies by tag 
     * @return Tags Filter policies by tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Filter policies by tag
     * @param Tags Filter policies by tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get ID of the TencentCloud Managed Service for Prometheus instance, which is used for customizing a metric policy. 
     * @return PromInsId ID of the TencentCloud Managed Service for Prometheus instance, which is used for customizing a metric policy.
     */
    public String getPromInsId() {
        return this.PromInsId;
    }

    /**
     * Set ID of the TencentCloud Managed Service for Prometheus instance, which is used for customizing a metric policy.
     * @param PromInsId ID of the TencentCloud Managed Service for Prometheus instance, which is used for customizing a metric policy.
     */
    public void setPromInsId(String PromInsId) {
        this.PromInsId = PromInsId;
    }

    /**
     * Get Search by schedule 
     * @return ReceiverOnCallFormIDs Search by schedule
     */
    public String [] getReceiverOnCallFormIDs() {
        return this.ReceiverOnCallFormIDs;
    }

    /**
     * Set Search by schedule
     * @param ReceiverOnCallFormIDs Search by schedule
     */
    public void setReceiverOnCallFormIDs(String [] ReceiverOnCallFormIDs) {
        this.ReceiverOnCallFormIDs = ReceiverOnCallFormIDs;
    }

    public DescribeAlarmPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmPoliciesRequest(DescribeAlarmPoliciesRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.PageNumber != null) {
            this.PageNumber = new Long(source.PageNumber);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
        if (source.PolicyName != null) {
            this.PolicyName = new String(source.PolicyName);
        }
        if (source.MonitorTypes != null) {
            this.MonitorTypes = new String[source.MonitorTypes.length];
            for (int i = 0; i < source.MonitorTypes.length; i++) {
                this.MonitorTypes[i] = new String(source.MonitorTypes[i]);
            }
        }
        if (source.Namespaces != null) {
            this.Namespaces = new String[source.Namespaces.length];
            for (int i = 0; i < source.Namespaces.length; i++) {
                this.Namespaces[i] = new String(source.Namespaces[i]);
            }
        }
        if (source.Dimensions != null) {
            this.Dimensions = new String(source.Dimensions);
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
        if (source.PolicyType != null) {
            this.PolicyType = new String[source.PolicyType.length];
            for (int i = 0; i < source.PolicyType.length; i++) {
                this.PolicyType[i] = new String(source.PolicyType[i]);
            }
        }
        if (source.Field != null) {
            this.Field = new String(source.Field);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.ProjectIds != null) {
            this.ProjectIds = new Long[source.ProjectIds.length];
            for (int i = 0; i < source.ProjectIds.length; i++) {
                this.ProjectIds[i] = new Long(source.ProjectIds[i]);
            }
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.RuleTypes != null) {
            this.RuleTypes = new String[source.RuleTypes.length];
            for (int i = 0; i < source.RuleTypes.length; i++) {
                this.RuleTypes[i] = new String(source.RuleTypes[i]);
            }
        }
        if (source.Enable != null) {
            this.Enable = new Long[source.Enable.length];
            for (int i = 0; i < source.Enable.length; i++) {
                this.Enable[i] = new Long(source.Enable[i]);
            }
        }
        if (source.NotBindingNoticeRule != null) {
            this.NotBindingNoticeRule = new Long(source.NotBindingNoticeRule);
        }
        if (source.InstanceGroupId != null) {
            this.InstanceGroupId = new Long(source.InstanceGroupId);
        }
        if (source.NeedCorrespondence != null) {
            this.NeedCorrespondence = new Long(source.NeedCorrespondence);
        }
        if (source.TriggerTasks != null) {
            this.TriggerTasks = new AlarmPolicyTriggerTask[source.TriggerTasks.length];
            for (int i = 0; i < source.TriggerTasks.length; i++) {
                this.TriggerTasks[i] = new AlarmPolicyTriggerTask(source.TriggerTasks[i]);
            }
        }
        if (source.OneClickPolicyType != null) {
            this.OneClickPolicyType = new String[source.OneClickPolicyType.length];
            for (int i = 0; i < source.OneClickPolicyType.length; i++) {
                this.OneClickPolicyType[i] = new String(source.OneClickPolicyType[i]);
            }
        }
        if (source.NotBindAll != null) {
            this.NotBindAll = new Long(source.NotBindAll);
        }
        if (source.NotInstanceGroup != null) {
            this.NotInstanceGroup = new Long(source.NotInstanceGroup);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.PromInsId != null) {
            this.PromInsId = new String(source.PromInsId);
        }
        if (source.ReceiverOnCallFormIDs != null) {
            this.ReceiverOnCallFormIDs = new String[source.ReceiverOnCallFormIDs.length];
            for (int i = 0; i < source.ReceiverOnCallFormIDs.length; i++) {
                this.ReceiverOnCallFormIDs[i] = new String(source.ReceiverOnCallFormIDs[i]);
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
        this.setParamSimple(map, prefix + "PolicyName", this.PolicyName);
        this.setParamArraySimple(map, prefix + "MonitorTypes.", this.MonitorTypes);
        this.setParamArraySimple(map, prefix + "Namespaces.", this.Namespaces);
        this.setParamSimple(map, prefix + "Dimensions", this.Dimensions);
        this.setParamArraySimple(map, prefix + "ReceiverUids.", this.ReceiverUids);
        this.setParamArraySimple(map, prefix + "ReceiverGroups.", this.ReceiverGroups);
        this.setParamArraySimple(map, prefix + "PolicyType.", this.PolicyType);
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamArraySimple(map, prefix + "ProjectIds.", this.ProjectIds);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArraySimple(map, prefix + "RuleTypes.", this.RuleTypes);
        this.setParamArraySimple(map, prefix + "Enable.", this.Enable);
        this.setParamSimple(map, prefix + "NotBindingNoticeRule", this.NotBindingNoticeRule);
        this.setParamSimple(map, prefix + "InstanceGroupId", this.InstanceGroupId);
        this.setParamSimple(map, prefix + "NeedCorrespondence", this.NeedCorrespondence);
        this.setParamArrayObj(map, prefix + "TriggerTasks.", this.TriggerTasks);
        this.setParamArraySimple(map, prefix + "OneClickPolicyType.", this.OneClickPolicyType);
        this.setParamSimple(map, prefix + "NotBindAll", this.NotBindAll);
        this.setParamSimple(map, prefix + "NotInstanceGroup", this.NotInstanceGroup);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "PromInsId", this.PromInsId);
        this.setParamArraySimple(map, prefix + "ReceiverOnCallFormIDs.", this.ReceiverOnCallFormIDs);

    }
}

