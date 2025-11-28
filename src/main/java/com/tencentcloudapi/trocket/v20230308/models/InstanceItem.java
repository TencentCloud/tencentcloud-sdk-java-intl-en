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

public class InstanceItem extends AbstractModel {

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
    * Instance version.
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * Instance type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * Instance status.
RUNNING. specifies the running status.
MAINTAINING.
ABNORMAL.
OVERDUE. specifies the state of arrears.
`DESTROYED`: deleted.
CREATING.
MODIFYING.
CREATE_FAILURE. specifies that the creation failed.
MODIFY_FAILURE. indicates a configuration adjustment failure.
DELETING.
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * Maximum number of instance topics
    */
    @SerializedName("TopicNumLimit")
    @Expose
    private Long TopicNumLimit;

    /**
    * Maximum number of instance consumer groups
    */
    @SerializedName("GroupNumLimit")
    @Expose
    private Long GroupNumLimit;

    /**
    * Billing mode. valid enumeration values are as follows:.

-POSTPAID: pay-as-you-go.

- PREPAID: monthly subscription.
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * Expiration timestamp. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ExpiryTime")
    @Expose
    private Long ExpiryTime;

    /**
    * Remarks

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * Number of topics
    */
    @SerializedName("TopicNum")
    @Expose
    private Long TopicNum;

    /**
    * Number of consumer groups
    */
    @SerializedName("GroupNum")
    @Expose
    private Long GroupNum;

    /**
    * Tag list

Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TagList")
    @Expose
    private Tag [] TagList;

    /**
    * Specifies the product specification.
    */
    @SerializedName("SkuCode")
    @Expose
    private String SkuCode;

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
    * Message retention time, in hours
    */
    @SerializedName("MessageRetention")
    @Expose
    private Long MessageRetention;

    /**
    * Maximum delayed message duration, in hours
    */
    @SerializedName("MaxMessageDelay")
    @Expose
    private Long MaxMessageDelay;

    /**
    * Whether automatic renewal is enabled. This parameter is valid only for prepaid clusters. 0: automatic renewal disabled; 1: automatic renewal enabled.
    */
    @SerializedName("RenewFlag")
    @Expose
    private Long RenewFlag;

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
     * Get Instance version. 
     * @return Version Instance version.
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set Instance version.
     * @param Version Instance version.
     */
    public void setVersion(String Version) {
        this.Version = Version;
    }

    /**
     * Get Instance type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition. 
     * @return InstanceType Instance type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set Instance type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
     * @param InstanceType Instance type.
Trial version.
BASIC version.
PRO, professional edition.
PLATINUM edition.
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get Instance status.
RUNNING. specifies the running status.
MAINTAINING.
ABNORMAL.
OVERDUE. specifies the state of arrears.
`DESTROYED`: deleted.
CREATING.
MODIFYING.
CREATE_FAILURE. specifies that the creation failed.
MODIFY_FAILURE. indicates a configuration adjustment failure.
DELETING. 
     * @return InstanceStatus Instance status.
RUNNING. specifies the running status.
MAINTAINING.
ABNORMAL.
OVERDUE. specifies the state of arrears.
`DESTROYED`: deleted.
CREATING.
MODIFYING.
CREATE_FAILURE. specifies that the creation failed.
MODIFY_FAILURE. indicates a configuration adjustment failure.
DELETING.
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set Instance status.
RUNNING. specifies the running status.
MAINTAINING.
ABNORMAL.
OVERDUE. specifies the state of arrears.
`DESTROYED`: deleted.
CREATING.
MODIFYING.
CREATE_FAILURE. specifies that the creation failed.
MODIFY_FAILURE. indicates a configuration adjustment failure.
DELETING.
     * @param InstanceStatus Instance status.
RUNNING. specifies the running status.
MAINTAINING.
ABNORMAL.
OVERDUE. specifies the state of arrears.
`DESTROYED`: deleted.
CREATING.
MODIFYING.
CREATE_FAILURE. specifies that the creation failed.
MODIFY_FAILURE. indicates a configuration adjustment failure.
DELETING.
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get Maximum number of instance topics 
     * @return TopicNumLimit Maximum number of instance topics
     */
    public Long getTopicNumLimit() {
        return this.TopicNumLimit;
    }

    /**
     * Set Maximum number of instance topics
     * @param TopicNumLimit Maximum number of instance topics
     */
    public void setTopicNumLimit(Long TopicNumLimit) {
        this.TopicNumLimit = TopicNumLimit;
    }

    /**
     * Get Maximum number of instance consumer groups 
     * @return GroupNumLimit Maximum number of instance consumer groups
     */
    public Long getGroupNumLimit() {
        return this.GroupNumLimit;
    }

    /**
     * Set Maximum number of instance consumer groups
     * @param GroupNumLimit Maximum number of instance consumer groups
     */
    public void setGroupNumLimit(Long GroupNumLimit) {
        this.GroupNumLimit = GroupNumLimit;
    }

    /**
     * Get Billing mode. valid enumeration values are as follows:.

-POSTPAID: pay-as-you-go.

- PREPAID: monthly subscription. 
     * @return PayMode Billing mode. valid enumeration values are as follows:.

-POSTPAID: pay-as-you-go.

- PREPAID: monthly subscription.
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Billing mode. valid enumeration values are as follows:.

-POSTPAID: pay-as-you-go.

- PREPAID: monthly subscription.
     * @param PayMode Billing mode. valid enumeration values are as follows:.

-POSTPAID: pay-as-you-go.

- PREPAID: monthly subscription.
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Expiration timestamp. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ExpiryTime Expiration timestamp. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getExpiryTime() {
        return this.ExpiryTime;
    }

    /**
     * Set Expiration timestamp. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ExpiryTime Expiration timestamp. **It is a Unix timestamp (ms).**
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setExpiryTime(Long ExpiryTime) {
        this.ExpiryTime = ExpiryTime;
    }

    /**
     * Get Remarks

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Remark Remarks

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set Remarks

Note: This field may return null, indicating that no valid values can be obtained.
     * @param Remark Remarks

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
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
     * Get Tag list

Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TagList Tag list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tag [] getTagList() {
        return this.TagList;
    }

    /**
     * Set Tag list

Note: This field may return null, indicating that no valid values can be obtained.
     * @param TagList Tag list

Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTagList(Tag [] TagList) {
        this.TagList = TagList;
    }

    /**
     * Get Specifies the product specification. 
     * @return SkuCode Specifies the product specification.
     */
    public String getSkuCode() {
        return this.SkuCode;
    }

    /**
     * Set Specifies the product specification.
     * @param SkuCode Specifies the product specification.
     */
    public void setSkuCode(String SkuCode) {
        this.SkuCode = SkuCode;
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
     * Get Maximum delayed message duration, in hours 
     * @return MaxMessageDelay Maximum delayed message duration, in hours
     */
    public Long getMaxMessageDelay() {
        return this.MaxMessageDelay;
    }

    /**
     * Set Maximum delayed message duration, in hours
     * @param MaxMessageDelay Maximum delayed message duration, in hours
     */
    public void setMaxMessageDelay(Long MaxMessageDelay) {
        this.MaxMessageDelay = MaxMessageDelay;
    }

    /**
     * Get Whether automatic renewal is enabled. This parameter is valid only for prepaid clusters. 0: automatic renewal disabled; 1: automatic renewal enabled. 
     * @return RenewFlag Whether automatic renewal is enabled. This parameter is valid only for prepaid clusters. 0: automatic renewal disabled; 1: automatic renewal enabled.
     */
    public Long getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set Whether automatic renewal is enabled. This parameter is valid only for prepaid clusters. 0: automatic renewal disabled; 1: automatic renewal enabled.
     * @param RenewFlag Whether automatic renewal is enabled. This parameter is valid only for prepaid clusters. 0: automatic renewal disabled; 1: automatic renewal enabled.
     */
    public void setRenewFlag(Long RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    public InstanceItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InstanceItem(InstanceItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Version != null) {
            this.Version = new String(source.Version);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.TopicNumLimit != null) {
            this.TopicNumLimit = new Long(source.TopicNumLimit);
        }
        if (source.GroupNumLimit != null) {
            this.GroupNumLimit = new Long(source.GroupNumLimit);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.ExpiryTime != null) {
            this.ExpiryTime = new Long(source.ExpiryTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.TopicNum != null) {
            this.TopicNum = new Long(source.TopicNum);
        }
        if (source.GroupNum != null) {
            this.GroupNum = new Long(source.GroupNum);
        }
        if (source.TagList != null) {
            this.TagList = new Tag[source.TagList.length];
            for (int i = 0; i < source.TagList.length; i++) {
                this.TagList[i] = new Tag(source.TagList[i]);
            }
        }
        if (source.SkuCode != null) {
            this.SkuCode = new String(source.SkuCode);
        }
        if (source.TpsLimit != null) {
            this.TpsLimit = new Long(source.TpsLimit);
        }
        if (source.ScaledTpsLimit != null) {
            this.ScaledTpsLimit = new Long(source.ScaledTpsLimit);
        }
        if (source.MessageRetention != null) {
            this.MessageRetention = new Long(source.MessageRetention);
        }
        if (source.MaxMessageDelay != null) {
            this.MaxMessageDelay = new Long(source.MaxMessageDelay);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new Long(source.RenewFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "TopicNumLimit", this.TopicNumLimit);
        this.setParamSimple(map, prefix + "GroupNumLimit", this.GroupNumLimit);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "ExpiryTime", this.ExpiryTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "TopicNum", this.TopicNum);
        this.setParamSimple(map, prefix + "GroupNum", this.GroupNum);
        this.setParamArrayObj(map, prefix + "TagList.", this.TagList);
        this.setParamSimple(map, prefix + "SkuCode", this.SkuCode);
        this.setParamSimple(map, prefix + "TpsLimit", this.TpsLimit);
        this.setParamSimple(map, prefix + "ScaledTpsLimit", this.ScaledTpsLimit);
        this.setParamSimple(map, prefix + "MessageRetention", this.MessageRetention);
        this.setParamSimple(map, prefix + "MaxMessageDelay", this.MaxMessageDelay);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);

    }
}

