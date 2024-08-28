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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LicenseDetail extends AbstractModel {

    /**
    * Authorization ID
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * Authorization status. 0: not in use; 1: partially in use; 2: used up; 3: unavailable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LicenseStatus")
    @Expose
    private Long LicenseStatus;

    /**
    * Total number of authorizations
    */
    @SerializedName("LicenseCnt")
    @Expose
    private Long LicenseCnt;

    /**
    * Number of used authorizations
    */
    @SerializedName("UsedLicenseCnt")
    @Expose
    private Long UsedLicenseCnt;

    /**
    * Order status. 1: normal; 2: isolated; 3: terminated.
    */
    @SerializedName("OrderStatus")
    @Expose
    private Long OrderStatus;

    /**
    * Deadline
    */
    @SerializedName("Deadline")
    @Expose
    private String Deadline;

    /**
    * Order resource ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 0: initialization; 1: automatic renewal; 2: no automatic renewal.
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * Project ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * Task ID. Default value: 0. It is used to query the binding progress.
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * Time of purchase
    */
    @SerializedName("BuyTime")
    @Expose
    private String BuyTime;

    /**
    * Whether the order is a trial order
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * Resource alias
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * Platform Tag
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * Number of frozen authorizations. 0: no authorization is frozen; other values: actual number of frozen authorizations.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("FreezeNum")
    @Expose
    private Long FreezeNum;

    /**
     * Get Authorization ID 
     * @return LicenseId Authorization ID
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set Authorization ID
     * @param LicenseId Authorization ID
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription. 
     * @return LicenseType Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     * @param LicenseType Authorization type. 0: Pro Edition - pay-as-you-go; 1: Pro Edition - monthly subscription; 2: Ultimate Edition - monthly subscription.
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get Authorization status. 0: not in use; 1: partially in use; 2: used up; 3: unavailable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return LicenseStatus Authorization status. 0: not in use; 1: partially in use; 2: used up; 3: unavailable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getLicenseStatus() {
        return this.LicenseStatus;
    }

    /**
     * Set Authorization status. 0: not in use; 1: partially in use; 2: used up; 3: unavailable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param LicenseStatus Authorization status. 0: not in use; 1: partially in use; 2: used up; 3: unavailable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setLicenseStatus(Long LicenseStatus) {
        this.LicenseStatus = LicenseStatus;
    }

    /**
     * Get Total number of authorizations 
     * @return LicenseCnt Total number of authorizations
     */
    public Long getLicenseCnt() {
        return this.LicenseCnt;
    }

    /**
     * Set Total number of authorizations
     * @param LicenseCnt Total number of authorizations
     */
    public void setLicenseCnt(Long LicenseCnt) {
        this.LicenseCnt = LicenseCnt;
    }

    /**
     * Get Number of used authorizations 
     * @return UsedLicenseCnt Number of used authorizations
     */
    public Long getUsedLicenseCnt() {
        return this.UsedLicenseCnt;
    }

    /**
     * Set Number of used authorizations
     * @param UsedLicenseCnt Number of used authorizations
     */
    public void setUsedLicenseCnt(Long UsedLicenseCnt) {
        this.UsedLicenseCnt = UsedLicenseCnt;
    }

    /**
     * Get Order status. 1: normal; 2: isolated; 3: terminated. 
     * @return OrderStatus Order status. 1: normal; 2: isolated; 3: terminated.
     */
    public Long getOrderStatus() {
        return this.OrderStatus;
    }

    /**
     * Set Order status. 1: normal; 2: isolated; 3: terminated.
     * @param OrderStatus Order status. 1: normal; 2: isolated; 3: terminated.
     */
    public void setOrderStatus(Long OrderStatus) {
        this.OrderStatus = OrderStatus;
    }

    /**
     * Get Deadline 
     * @return Deadline Deadline
     */
    public String getDeadline() {
        return this.Deadline;
    }

    /**
     * Set Deadline
     * @param Deadline Deadline
     */
    public void setDeadline(String Deadline) {
        this.Deadline = Deadline;
    }

    /**
     * Get Order resource ID 
     * @return ResourceId Order resource ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set Order resource ID
     * @param ResourceId Order resource ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 0: initialization; 1: automatic renewal; 2: no automatic renewal. 
     * @return AutoRenewFlag 0: initialization; 1: automatic renewal; 2: no automatic renewal.
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 0: initialization; 1: automatic renewal; 2: no automatic renewal.
     * @param AutoRenewFlag 0: initialization; 1: automatic renewal; 2: no automatic renewal.
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get Project ID 
     * @return ProjectId Project ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set Project ID
     * @param ProjectId Project ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get Task ID. Default value: 0. It is used to query the binding progress. 
     * @return TaskId Task ID. Default value: 0. It is used to query the binding progress.
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set Task ID. Default value: 0. It is used to query the binding progress.
     * @param TaskId Task ID. Default value: 0. It is used to query the binding progress.
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get Time of purchase 
     * @return BuyTime Time of purchase
     */
    public String getBuyTime() {
        return this.BuyTime;
    }

    /**
     * Set Time of purchase
     * @param BuyTime Time of purchase
     */
    public void setBuyTime(String BuyTime) {
        this.BuyTime = BuyTime;
    }

    /**
     * Get Whether the order is a trial order 
     * @return SourceType Whether the order is a trial order
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set Whether the order is a trial order
     * @param SourceType Whether the order is a trial order
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get Resource alias 
     * @return Alias Resource alias
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * Set Resource alias
     * @param Alias Resource alias
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * Get Platform Tag
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Tags Platform Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set Platform Tag
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Tags Platform Tag
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Number of frozen authorizations. 0: no authorization is frozen; other values: actual number of frozen authorizations.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return FreezeNum Number of frozen authorizations. 0: no authorization is frozen; other values: actual number of frozen authorizations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public Long getFreezeNum() {
        return this.FreezeNum;
    }

    /**
     * Set Number of frozen authorizations. 0: no authorization is frozen; other values: actual number of frozen authorizations.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param FreezeNum Number of frozen authorizations. 0: no authorization is frozen; other values: actual number of frozen authorizations.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setFreezeNum(Long FreezeNum) {
        this.FreezeNum = FreezeNum;
    }

    public LicenseDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LicenseDetail(LicenseDetail source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.LicenseStatus != null) {
            this.LicenseStatus = new Long(source.LicenseStatus);
        }
        if (source.LicenseCnt != null) {
            this.LicenseCnt = new Long(source.LicenseCnt);
        }
        if (source.UsedLicenseCnt != null) {
            this.UsedLicenseCnt = new Long(source.UsedLicenseCnt);
        }
        if (source.OrderStatus != null) {
            this.OrderStatus = new Long(source.OrderStatus);
        }
        if (source.Deadline != null) {
            this.Deadline = new String(source.Deadline);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new Long(source.ProjectId);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.BuyTime != null) {
            this.BuyTime = new String(source.BuyTime);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.Alias != null) {
            this.Alias = new String(source.Alias);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.FreezeNum != null) {
            this.FreezeNum = new Long(source.FreezeNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "LicenseStatus", this.LicenseStatus);
        this.setParamSimple(map, prefix + "LicenseCnt", this.LicenseCnt);
        this.setParamSimple(map, prefix + "UsedLicenseCnt", this.UsedLicenseCnt);
        this.setParamSimple(map, prefix + "OrderStatus", this.OrderStatus);
        this.setParamSimple(map, prefix + "Deadline", this.Deadline);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "BuyTime", this.BuyTime);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "FreezeNum", this.FreezeNum);

    }
}

