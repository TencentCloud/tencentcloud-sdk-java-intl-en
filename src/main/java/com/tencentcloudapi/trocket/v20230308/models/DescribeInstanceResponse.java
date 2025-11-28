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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceResponse extends AbstractModel {

    /**
    * Instance type.
Specifies the EXPERIMENT trial version.
BASIC version.
PRO edition.
PLATINUM. platinum version.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * Instance name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Number of topics
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Maximum number of topics per instance
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * Number of consumer groups
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * Maximum number of consumer groups per instance
    */
    @SerializedName("GroupNumLimit")
    @Expose
    private Long GroupNumLimit;

    /**
    * Message retention time, in hours
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * Maximum adjustable message retention time, in hours
    */
    @SerializedName("RetentionUpperLimit")
    @Expose
    private Long RetentionUpperLimit;

    /**
    * Minimum adjustable message retention time, in hours
    */
    @SerializedName("RetentionLowerLimit")
    @Expose
    private Long RetentionLowerLimit;

    /**
    * TPS throttle value
    */
    @SerializedName("TpsLimit")
    @Expose
    private Long TpsLimit;

    /**
    * Elastic TPS throttle value
    */
    @SerializedName("ScaledTpsLimit")
    @Expose
    private Long ScaledTpsLimit;

    /**
    * Maximum delayed message time, in hours
    */
    @SerializedName("MaxMessageDelay")
    @Expose
    private Long MaxMessageDelay;

    /**
    * Creation time. **It is a Unix timestamp (ms).**
    */
    @SerializedName("CreatedTime")
    @Expose
    private Long CreatedTime;

    /**
    * Message sending and receiving ratio
    */
    @SerializedName("SendReceiveRatio")
    @Expose
    private Float SendReceiveRatio;

    /**
    * Tag.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Access point list

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("EndpointList")
    @Expose
    private Endpoint [] EndpointList;

    /**
    * Maximum number of topic queues
    */
    @SerializedName("TopicQueueNumUpperLimit")
    @Expose
    private Long TopicQueueNumUpperLimit;

    /**
    * Minimum queue count for topic
    */
    @SerializedName("TopicQueueNumLowerLimit")
    @Expose
    private Long TopicQueueNumLowerLimit;

    /**
    * Remarks
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Instance status. valid values are as follows:.

- RUNNING: RUNNING.
-ABNORMAL: indicates an abnormal status.
-OVERDUE: isolated.
-DESTROYED: specifies the terminated status.
-CREATING: creating.
-MODIFYING.
-CREATE_FAILURE: creation failed.
-MODIFY_FAILURE: configuration adjustment failure.
-DELETING: deleting.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Instance specification.
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

    /**
    * Billing mode. valid enumeration values are as follows:.

- POSTPAID: POSTPAID pay-as-you-go billing.
- PREPAID: PREPAID annual and monthly.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Whether to enable elastic TPS.
    */
    @SerializedName("ScaledTpsEnabled")
    @Expose
    private Boolean ScaledTpsEnabled;

    /**
    * Specifies whether the prepaid cluster is automatically renewed. valid values are as follows:.

- 0: no automatic renewal.
- 1: specifies automatic renewal.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

    /**
    * Expiration time. **It is a Unix timestamp (ms).**
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * Specifies the limit on the number of roles.
    */
    @SerializedName("RoleNumLimit")
    @Expose
    private Long RoleNumLimit;

    /**
    * Whether ACL is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AclEnabled")
    @Expose
    private Boolean AclEnabled;

    /**
    * Number of topics within the free quota.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicNumLowerLimit")
    @Expose
    private Long TopicNumLowerLimit;

    /**
    * Maximum settable number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicNumUpperLimit")
    @Expose
    private Long TopicNumUpperLimit;

    /**
    * AZ list. See [ZoneInfo](https://www.tencentcloud.comom/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) returned by the API [DescribeZones](https://www.tencentcloud.comom/document/product/1596/77929?from_cn_redirect=1) in Data Type.
    */
    @SerializedName("ZoneIds")
    @Expose
    private Long [] ZoneIds;

    /**
    * Number of proxy nodes.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NodeCount")
    @Expose
    private Long NodeCount;

    /**
    * Proxy scheduling details.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ZoneScheduledList")
    @Expose
    private ZoneScheduledItem [] ZoneScheduledList;

    /**
    * The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Instance type.
Specifies the EXPERIMENT trial version.
BASIC version.
PRO edition.
PLATINUM. platinum version. 
     * @return InstanceType Instance type.
Specifies the EXPERIMENT trial version.
BASIC version.
PRO edition.
PLATINUM. platinum version.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.
Specifies the EXPERIMENT trial version.
BASIC version.
PRO edition.
PLATINUM. platinum version.
     * @param InstanceType Instance type.
Specifies the EXPERIMENT trial version.
BASIC version.
PRO edition.
PLATINUM. platinum version.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance ID 
     * @return InstanceId Instance ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set Instance ID
     * @param InstanceId Instance ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get Instance name 
     * @return InstanceName Instance name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance name
     * @param InstanceName Instance name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Number of topics 
     * @return TopicNum Number of topics
     */
    public Long getTopicNum() {
        return this.TopicNum;
    }

    /**
     * Set Number of topics
     * @param TopicNum Number of topics
     */
    public void setTopicNum(Long TopicNum) {
        this.TopicNum = TopicNum;
    }

    /**
     * Get Maximum number of topics per instance 
     * @return TopicNumLimit Maximum number of topics per instance
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Maximum number of topics per instance
     * @param TopicNumLimit Maximum number of topics per instance
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get Number of consumer groups 
     * @return GroupNum Number of consumer groups
     */
    public Long getGroupNum() {
        return this.GroupNum;
    }

    /**
     * Set Number of consumer groups
     * @param GroupNum Number of consumer groups
     */
    public void setGroupNum(Long GroupNum) {
        this.GroupNum = GroupNum;
    }

    /**
     * Get Maximum number of consumer groups per instance 
     * @return GroupNumLimit Maximum number of consumer groups per instance
     */
    public Long getGroupNumLimit() {
        return this.GroupNumLimit;
    }

    /**
     * Set Maximum number of consumer groups per instance
     * @param GroupNumLimit Maximum number of consumer groups per instance
     */
    public void setGroupNumLimit(Long GroupNumLimit) {
        this.GroupNumLimit = GroupNumLimit;
    }

    /**
     * Get Message retention time, in hours 
     * @return MessageRetention Message retention time, in hours
     */
    public Long getMessageRetention() {
        return this.MessageRetention;
    }

    /**
     * Set Message retention time, in hours
     * @param MessageRetention Message retention time, in hours
     */
    public void setMessageRetention(Long MessageRetention) {
        this.MessageRetention = MessageRetention;
    }

    /**
     * Get Maximum adjustable message retention time, in hours 
     * @return RetentionUpperLimit Maximum adjustable message retention time, in hours
     */
    public Long getRetentionUpperLimit() {
        return this.RetentionUpperLimit;
    }

    /**
     * Set Maximum adjustable message retention time, in hours
     * @param RetentionUpperLimit Maximum adjustable message retention time, in hours
     */
    public void setRetentionUpperLimit(Long RetentionUpperLimit) {
        this.RetentionUpperLimit = RetentionUpperLimit;
    }

    /**
     * Get Minimum adjustable message retention time, in hours 
     * @return RetentionLowerLimit Minimum adjustable message retention time, in hours
     */
    public Long getRetentionLowerLimit() {
        return this.RetentionLowerLimit;
    }

    /**
     * Set Minimum adjustable message retention time, in hours
     * @param RetentionLowerLimit Minimum adjustable message retention time, in hours
     */
    public void setRetentionLowerLimit(Long RetentionLowerLimit) {
        this.RetentionLowerLimit = RetentionLowerLimit;
    }

    /**
     * Get TPS throttle value 
     * @return TpsLimit TPS throttle value
     */
    public Long getTpsLimit() {
        return this.TpsLimit;
    }

    /**
     * Set TPS throttle value
     * @param TpsLimit TPS throttle value
     */
    public void setTpsLimit(Long TpsLimit) {
        this.TpsLimit = TpsLimit;
    }

    /**
     * Get Elastic TPS throttle value 
     * @return ScaledTpsLimit Elastic TPS throttle value
     */
    public Long getScaledTpsLimit() {
        return this.ScaledTpsLimit;
    }

    /**
     * Set Elastic TPS throttle value
     * @param ScaledTpsLimit Elastic TPS throttle value
     */
    public void setScaledTpsLimit(Long ScaledTpsLimit) {
        this.ScaledTpsLimit = ScaledTpsLimit;
    }

    /**
     * Get Maximum delayed message time, in hours 
     * @return MaxMessageDelay Maximum delayed message time, in hours
     */
    public Long getMaxMessageDelay() {
        return this.MaxMessageDelay;
    }

    /**
     * Set Maximum delayed message time, in hours
     * @param MaxMessageDelay Maximum delayed message time, in hours
     */
    public void setMaxMessageDelay(Long MaxMessageDelay) {
        this.MaxMessageDelay = MaxMessageDelay;
    }

    /**
     * Get Creation time. **It is a Unix timestamp (ms).** 
     * @return CreatedTime Creation time. **It is a Unix timestamp (ms).**
     */
    public Long getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set Creation time. **It is a Unix timestamp (ms).**
     * @param CreatedTime Creation time. **It is a Unix timestamp (ms).**
     */
    public void setCreatedTime(Long CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get Message sending and receiving ratio 
     * @return SendReceiveRatio Message sending and receiving ratio
     */
    public Float getSendReceiveRatio() {
        return this.SendReceiveRatio;
    }

    /**
     * Set Message sending and receiving ratio
     * @param SendReceiveRatio Message sending and receiving ratio
     */
    public void setSendReceiveRatio(Float SendReceiveRatio) {
        this.SendReceiveRatio = SendReceiveRatio;
    }

    /**
     * Get Tag.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagList Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagList Tag.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Access point list

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return EndpointList Access point list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Endpoint [] getEndpointList() {
        return this.EndpointList;
    }

    /**
     * Set Access point list

Note: This field may return null, indicating that no valid values can be obtained.
     * @param EndpointList Access point list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setEndpointList(Endpoint [] EndpointList) {
        this.EndpointList = EndpointList;
    }

    /**
     * Get Maximum number of topic queues 
     * @return TopicQueueNumUpperLimit Maximum number of topic queues
     */
    public Long getTopicQueueNumUpperLimit() {
        return this.TopicQueueNumUpperLimit;
    }

    /**
     * Set Maximum number of topic queues
     * @param TopicQueueNumUpperLimit Maximum number of topic queues
     */
    public void setTopicQueueNumUpperLimit(Long TopicQueueNumUpperLimit) {
        this.TopicQueueNumUpperLimit = TopicQueueNumUpperLimit;
    }

    /**
     * Get Minimum queue count for topic 
     * @return TopicQueueNumLowerLimit Minimum queue count for topic
     */
    public Long getTopicQueueNumLowerLimit() {
        return this.TopicQueueNumLowerLimit;
    }

    /**
     * Set Minimum queue count for topic
     * @param TopicQueueNumLowerLimit Minimum queue count for topic
     */
    public void setTopicQueueNumLowerLimit(Long TopicQueueNumLowerLimit) {
        this.TopicQueueNumLowerLimit = TopicQueueNumLowerLimit;
    }

    /**
     * Get Remarks 
     * @return Remark Remarks
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks
     * @param Remark Remarks
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get Instance status. valid values are as follows:.

- RUNNING: RUNNING.
-ABNORMAL: indicates an abnormal status.
-OVERDUE: isolated.
-DESTROYED: specifies the terminated status.
-CREATING: creating.
-MODIFYING.
-CREATE_FAILURE: creation failed.
-MODIFY_FAILURE: configuration adjustment failure.
-DELETING: deleting. 
     * @return InstanceStatus Instance status. valid values are as follows:.

- RUNNING: RUNNING.
-ABNORMAL: indicates an abnormal status.
-OVERDUE: isolated.
-DESTROYED: specifies the terminated status.
-CREATING: creating.
-MODIFYING.
-CREATE_FAILURE: creation failed.
-MODIFY_FAILURE: configuration adjustment failure.
-DELETING: deleting.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status. valid values are as follows:.

- RUNNING: RUNNING.
-ABNORMAL: indicates an abnormal status.
-OVERDUE: isolated.
-DESTROYED: specifies the terminated status.
-CREATING: creating.
-MODIFYING.
-CREATE_FAILURE: creation failed.
-MODIFY_FAILURE: configuration adjustment failure.
-DELETING: deleting.
     * @param InstanceStatus Instance status. valid values are as follows:.

- RUNNING: RUNNING.
-ABNORMAL: indicates an abnormal status.
-OVERDUE: isolated.
-DESTROYED: specifies the terminated status.
-CREATING: creating.
-MODIFYING.
-CREATE_FAILURE: creation failed.
-MODIFY_FAILURE: configuration adjustment failure.
-DELETING: deleting.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Instance specification. 
     * @return SkuCode Instance specification.
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Instance specification.
     * @param SkuCode Instance specification.
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
    }

    /**
     * Get Billing mode. valid enumeration values are as follows:.

- POSTPAID: POSTPAID pay-as-you-go billing.
- PREPAID: PREPAID annual and monthly. 
     * @return PayMode Billing mode. valid enumeration values are as follows:.

- POSTPAID: POSTPAID pay-as-you-go billing.
- PREPAID: PREPAID annual and monthly.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. valid enumeration values are as follows:.

- POSTPAID: POSTPAID pay-as-you-go billing.
- PREPAID: PREPAID annual and monthly.
     * @param PayMode Billing mode. valid enumeration values are as follows:.

- POSTPAID: POSTPAID pay-as-you-go billing.
- PREPAID: PREPAID annual and monthly.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Whether to enable elastic TPS. 
     * @return ScaledTpsEnabled Whether to enable elastic TPS.
     */
    public Boolean getScaledTpsEnabled() {
        return this.ScaledTpsEnabled;
    }

    /**
     * Set Whether to enable elastic TPS.
     * @param ScaledTpsEnabled Whether to enable elastic TPS.
     */
    public void setScaledTpsEnabled(Boolean ScaledTpsEnabled) {
        this.ScaledTpsEnabled = ScaledTpsEnabled;
    }

    /**
     * Get Specifies whether the prepaid cluster is automatically renewed. valid values are as follows:.

- 0: no automatic renewal.
- 1: specifies automatic renewal. 
     * @return RenewFlag Specifies whether the prepaid cluster is automatically renewed. valid values are as follows:.

- 0: no automatic renewal.
- 1: specifies automatic renewal.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Specifies whether the prepaid cluster is automatically renewed. valid values are as follows:.

- 0: no automatic renewal.
- 1: specifies automatic renewal.
     * @param RenewFlag Specifies whether the prepaid cluster is automatically renewed. valid values are as follows:.

- 0: no automatic renewal.
- 1: specifies automatic renewal.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get Expiration time. **It is a Unix timestamp (ms).** 
     * @return ExpiryTime Expiration time. **It is a Unix timestamp (ms).**
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set Expiration time. **It is a Unix timestamp (ms).**
     * @param ExpiryTime Expiration time. **It is a Unix timestamp (ms).**
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get Specifies the limit on the number of roles. 
     * @return RoleNumLimit Specifies the limit on the number of roles.
     */
    public Long getRoleNumLimit() {
        return this.RoleNumLimit;
    }

    /**
     * Set Specifies the limit on the number of roles.
     * @param RoleNumLimit Specifies the limit on the number of roles.
     */
    public void setRoleNumLimit(Long RoleNumLimit) {
        this.RoleNumLimit = RoleNumLimit;
    }

    /**
     * Get Whether ACL is enabled.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return AclEnabled Whether ACL is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Boolean getAclEnabled() {
        return this.AclEnabled;
    }

    /**
     * Set Whether ACL is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param AclEnabled Whether ACL is enabled.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setAclEnabled(Boolean AclEnabled) {
        this.AclEnabled = AclEnabled;
    }

    /**
     * Get Number of topics within the free quota.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicNumLowerLimit Number of topics within the free quota.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicNumLowerLimit() {
        return this.TopicNumLowerLimit;
    }

    /**
     * Set Number of topics within the free quota.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicNumLowerLimit Number of topics within the free quota.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicNumLowerLimit(Long TopicNumLowerLimit) {
        this.TopicNumLowerLimit = TopicNumLowerLimit;
    }

    /**
     * Get Maximum settable number of topics.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TopicNumUpperLimit Maximum settable number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicNumUpperLimit() {
        return this.TopicNumUpperLimit;
    }

    /**
     * Set Maximum settable number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TopicNumUpperLimit Maximum settable number of topics.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicNumUpperLimit(Long TopicNumUpperLimit) {
        this.TopicNumUpperLimit = TopicNumUpperLimit;
    }

    /**
     * Get AZ list. See [ZoneInfo](https://www.tencentcloud.comom/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) returned by the API [DescribeZones](https://www.tencentcloud.comom/document/product/1596/77929?from_cn_redirect=1) in Data Type. 
     * @return ZoneIds AZ list. See [ZoneInfo](https://www.tencentcloud.comom/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) returned by the API [DescribeZones](https://www.tencentcloud.comom/document/product/1596/77929?from_cn_redirect=1) in Data Type.
     */
    public Long [] getZoneIds() {
        return this.ZoneIds;
    }

    /**
     * Set AZ list. See [ZoneInfo](https://www.tencentcloud.comom/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) returned by the API [DescribeZones](https://www.tencentcloud.comom/document/product/1596/77929?from_cn_redirect=1) in Data Type.
     * @param ZoneIds AZ list. See [ZoneInfo](https://www.tencentcloud.comom/document/api/1596/77932?from_cn_redirect=1#ZoneInfo) returned by the API [DescribeZones](https://www.tencentcloud.comom/document/product/1596/77929?from_cn_redirect=1) in Data Type.
     */
    public void setZoneIds(Long [] ZoneIds) {
        this.ZoneIds = ZoneIds;
    }

    /**
     * Get Number of proxy nodes.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return NodeCount Number of proxy nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getNodeCount() {
        return this.NodeCount;
    }

    /**
     * Set Number of proxy nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param NodeCount Number of proxy nodes.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setNodeCount(Long NodeCount) {
        this.NodeCount = NodeCount;
    }

    /**
     * Get Proxy scheduling details.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ZoneScheduledList Proxy scheduling details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public ZoneScheduledItem [] getZoneScheduledList() {
        return this.ZoneScheduledList;
    }

    /**
     * Set Proxy scheduling details.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ZoneScheduledList Proxy scheduling details.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setZoneScheduledList(ZoneScheduledItem [] ZoneScheduledList) {
        this.ZoneScheduledList = ZoneScheduledList;
    }

    /**
     * Get The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     * @param RequestId The unique request ID, generated by the server, will be returned for every request (if the request fails to reach the server for other reasons, the request will not obtain a RequestId). RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceResponse(DescribeInstanceResponse source) {
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.GroupNumLimit != null) {
            this.GroupNumLimit = new Long(source.GroupNumLimit);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.RetentionUpperLimit != null) {
            this.RetentionUpperLimit = new Long(source.RetentionUpperLimit);
        }
        if (source.RetentionLowerLimit != null) {
            this.RetentionLowerLimit = new Long(source.RetentionLowerLimit);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ScaledTpsLimit != null) {
            this.ScaledTpsLimit = new Long(source.ScaledTpsLimit);
        }
        if (source.MaxMessageDelay != null) {
            this.MaxMessageDelay = new Long(source.MaxMessageDelay);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new Long(source.CreatedTime);
        }
        if (source.SendReceiveRatio != null) {
            this.SendReceiveRatio = new Float(source.SendReceiveRatio);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.EndpointList != null) {
            this.EndpointList = new Endpoint[source.EndpointList.length];
            for (int i = 0; i < source.EndpointList.length; i++) {
                this.EndpointList[i] = new Endpoint(source.EndpointList[i]);
            }
        }
        if (source.TopicQueueNumUpperLimit != null) {
            this.TopicQueueNumUpperLimit = new Long(source.TopicQueueNumUpperLimit);
        }
        if (source.TopicQueueNumLowerLimit != null) {
            this.TopicQueueNumLowerLimit = new Long(source.TopicQueueNumLowerLimit);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ScaledTpsEnabled != null) {
            this.ScaledTpsEnabled = new Boolean(source.ScaledTpsEnabled);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.RoleNumLimit != null) {
            this.RoleNumLimit = new Long(source.RoleNumLimit);
        }
        if (source.AclEnabled != null) {
            this.AclEnabled = new Boolean(source.AclEnabled);
        }
        if (source.TopicNumLowerLimit != null) {
            this.TopicNumLowerLimit = new Long(source.TopicNumLowerLimit);
        }
        if (source.TopicNumUpperLimit != null) {
            this.TopicNumUpperLimit = new Long(source.TopicNumUpperLimit);
        }
        if (source.ZoneIds != null) {
            this.ZoneIds = new Long[source.ZoneIds.length];
            for (int i = 0; i < source.ZoneIds.length; i++) {
                this.ZoneIds[i] = new Long(source.ZoneIds[i]);
            }
        }
        if (source.NodeCount != null) {
            this.NodeCount = new Long(source.NodeCount);
        }
        if (source.ZoneScheduledList != null) {
            this.ZoneScheduledList = new ZoneScheduledItem[source.ZoneScheduledList.length];
            for (int i = 0; i < source.ZoneScheduledList.length; i++) {
                this.ZoneScheduledList[i] = new ZoneScheduledItem(source.ZoneScheduledList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamSimple(map, prefix + "GroupNumLimit", this.GroupNumLimit);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "RetentionUpperLimit", this.RetentionUpperLimit);
        this.setParamSimple(map, prefix + "RetentionLowerLimit", this.RetentionLowerLimit);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ScaledTpsLimit", this.ScaledTpsLimit);
        this.setParamSimple(map, prefix + "MaxMessageDelay", this.MaxMessageDelay);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "SendReceiveRatio", this.SendReceiveRatio);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamArrayObj(map, prefix + "EndpointList.", this.EndpointList);
        this.setParamSimple(map, prefix + "TopicQueueNumUpperLimit", this.TopicQueueNumUpperLimit);
        this.setParamSimple(map, prefix + "TopicQueueNumLowerLimit", this.TopicQueueNumLowerLimit);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ScaledTpsEnabled", this.ScaledTpsEnabled);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "RoleNumLimit", this.RoleNumLimit);
        this.setParamSimple(map, prefix + "AclEnabled", this.AclEnabled);
        this.setParamSimple(map, prefix + "TopicNumLowerLimit", this.TopicNumLowerLimit);
        this.setParamSimple(map, prefix + "TopicNumUpperLimit", this.TopicNumUpperLimit);
        this.setParamArraySimple(map, prefix + "ZoneIds.", this.ZoneIds);
        this.setParamSimple(map, prefix + "NodeCount", this.NodeCount);
        this.setParamArrayObj(map, prefix + "ZoneScheduledList.", this.ZoneScheduledList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

