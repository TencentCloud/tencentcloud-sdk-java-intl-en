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

public class DescribeAlarmPoliciesRequest extends AbstractModel{

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
    * Alarm object list. The outer array corresponds to multiple instances.
Each inner array corresponds to one instance, where `object` corresponds to the dimension information of the instance. The format is as follows:
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
For the samples for different Tencent Cloud services, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
    */
    @SerializedName("Dimensions")
    @Expose
    private String Dimensions;

    /**
    * Search by recipient `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1)
    */
    @SerializedName("ReceiverUids")
    @Expose
    private Long [] ReceiverUids;

    /**
    * Search by recipient group `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1)
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
    * ID list of the notification template, which can be obtained by querying the notification template list.
[DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
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
     * Get Alarm object list. The outer array corresponds to multiple instances.
Each inner array corresponds to one instance, where `object` corresponds to the dimension information of the instance. The format is as follows:
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
For the samples for different Tencent Cloud services, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1) 
     * @return Dimensions Alarm object list. The outer array corresponds to multiple instances.
Each inner array corresponds to one instance, where `object` corresponds to the dimension information of the instance. The format is as follows:
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
For the samples for different Tencent Cloud services, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     */
    public String getDimensions() {
        return this.Dimensions;
    }

    /**
     * Set Alarm object list. The outer array corresponds to multiple instances.
Each inner array corresponds to one instance, where `object` corresponds to the dimension information of the instance. The format is as follows:
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
For the samples for different Tencent Cloud services, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     * @param Dimensions Alarm object list. The outer array corresponds to multiple instances.
Each inner array corresponds to one instance, where `object` corresponds to the dimension information of the instance. The format is as follows:
[
	[{"name":"unInstanceId","value":"ins-qr888845g"}],
	[{"name":"unInstanceId","value":"ins-qr8d555g"}]
	...
]
For the samples for different Tencent Cloud services, please see:
[Dimension List](https://intl.cloud.tencent.com/document/product/248/50397?from_cn_redirect=1)
     */
    public void setDimensions(String Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * Get Search by recipient `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1) 
     * @return ReceiverUids Search by recipient `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1)
     */
    public Long [] getReceiverUids() {
        return this.ReceiverUids;
    }

    /**
     * Set Search by recipient `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1)
     * @param ReceiverUids Search by recipient `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListUsers](https://intl.cloud.tencent.com/document/product/598/34587?from_cn_redirect=1)
     */
    public void setReceiverUids(Long [] ReceiverUids) {
        this.ReceiverUids = ReceiverUids;
    }

    /**
     * Get Search by recipient group `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1) 
     * @return ReceiverGroups Search by recipient group `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1)
     */
    public Long [] getReceiverGroups() {
        return this.ReceiverGroups;
    }

    /**
     * Set Search by recipient group `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1)
     * @param ReceiverGroups Search by recipient group `uid`, which should be queried by calling the CAM API. For more information, please see:
[ListGroups](https://intl.cloud.tencent.com/document/product/598/34589?from_cn_redirect=1)
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
     * Get ID list of the notification template, which can be obtained by querying the notification template list.
[DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1) 
     * @return NoticeIds ID list of the notification template, which can be obtained by querying the notification template list.
[DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set ID list of the notification template, which can be obtained by querying the notification template list.
[DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
     * @param NoticeIds ID list of the notification template, which can be obtained by querying the notification template list.
[DescribeAlarmNotices](https://intl.cloud.tencent.com/document/product/248/51280?from_cn_redirect=1)
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

    }
}

