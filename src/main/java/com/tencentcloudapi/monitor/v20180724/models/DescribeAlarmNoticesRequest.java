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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmNoticesRequest extends AbstractModel {

    /**
    * Module name. Enter "monitor" here
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * Page number. Minimum value: 1
    */
    @SerializedName("PageNumber")
    @Expose
    private Long PageNumber;

    /**
    * Number of entries per page. Value range: 1–200
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
    * Sort by update time. Valid values: ASC (ascending), DESC (descending)
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * Root account `uid`, which is used to create preset notifications
    */
    @SerializedName("OwnerUid")
    @Expose
    private Long OwnerUid;

    /**
    * Alarm notification template name, which is used for fuzzy search
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * Filter by recipient. The type of notified users should be selected for the alarm notification template. Valid values: USER (user), GROUP (user group). If this parameter is left empty, no filter by recipient will be performed
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Recipient object list
    */
    @SerializedName("UserIds")
    @Expose
    private Long [] UserIds;

    /**
    * Recipient group list
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * Filter by notification template ID. If an empty array is passed in or if this parameter is left empty, the filter operation will not be performed.
    */
    @SerializedName("NoticeIds")
    @Expose
    private String [] NoticeIds;

    /**
    * Filter templates by tag
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Schedule list
    */
    @SerializedName("OnCallFormIDs")
    @Expose
    private String [] OnCallFormIDs;

    /**
     * Get Module name. Enter "monitor" here 
     * @return Module Module name. Enter "monitor" here
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set Module name. Enter "monitor" here
     * @param Module Module name. Enter "monitor" here
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get Page number. Minimum value: 1 
     * @return PageNumber Page number. Minimum value: 1
     */
    public Long getPageNumber() {
        return this.PageNumber;
    }

    /**
     * Set Page number. Minimum value: 1
     * @param PageNumber Page number. Minimum value: 1
     */
    public void setPageNumber(Long PageNumber) {
        this.PageNumber = PageNumber;
    }

    /**
     * Get Number of entries per page. Value range: 1–200 
     * @return PageSize Number of entries per page. Value range: 1–200
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set Number of entries per page. Value range: 1–200
     * @param PageSize Number of entries per page. Value range: 1–200
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * Get Sort by update time. Valid values: ASC (ascending), DESC (descending) 
     * @return Order Sort by update time. Valid values: ASC (ascending), DESC (descending)
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set Sort by update time. Valid values: ASC (ascending), DESC (descending)
     * @param Order Sort by update time. Valid values: ASC (ascending), DESC (descending)
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get Root account `uid`, which is used to create preset notifications 
     * @return OwnerUid Root account `uid`, which is used to create preset notifications
     */
    public Long getOwnerUid() {
        return this.OwnerUid;
    }

    /**
     * Set Root account `uid`, which is used to create preset notifications
     * @param OwnerUid Root account `uid`, which is used to create preset notifications
     */
    public void setOwnerUid(Long OwnerUid) {
        this.OwnerUid = OwnerUid;
    }

    /**
     * Get Alarm notification template name, which is used for fuzzy search 
     * @return Name Alarm notification template name, which is used for fuzzy search
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set Alarm notification template name, which is used for fuzzy search
     * @param Name Alarm notification template name, which is used for fuzzy search
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get Filter by recipient. The type of notified users should be selected for the alarm notification template. Valid values: USER (user), GROUP (user group). If this parameter is left empty, no filter by recipient will be performed 
     * @return ReceiverType Filter by recipient. The type of notified users should be selected for the alarm notification template. Valid values: USER (user), GROUP (user group). If this parameter is left empty, no filter by recipient will be performed
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Filter by recipient. The type of notified users should be selected for the alarm notification template. Valid values: USER (user), GROUP (user group). If this parameter is left empty, no filter by recipient will be performed
     * @param ReceiverType Filter by recipient. The type of notified users should be selected for the alarm notification template. Valid values: USER (user), GROUP (user group). If this parameter is left empty, no filter by recipient will be performed
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Recipient object list 
     * @return UserIds Recipient object list
     */
    public Long [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set Recipient object list
     * @param UserIds Recipient object list
     */
    public void setUserIds(Long [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get Recipient group list 
     * @return GroupIds Recipient group list
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set Recipient group list
     * @param GroupIds Recipient group list
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get Filter by notification template ID. If an empty array is passed in or if this parameter is left empty, the filter operation will not be performed. 
     * @return NoticeIds Filter by notification template ID. If an empty array is passed in or if this parameter is left empty, the filter operation will not be performed.
     */
    public String [] getNoticeIds() {
        return this.NoticeIds;
    }

    /**
     * Set Filter by notification template ID. If an empty array is passed in or if this parameter is left empty, the filter operation will not be performed.
     * @param NoticeIds Filter by notification template ID. If an empty array is passed in or if this parameter is left empty, the filter operation will not be performed.
     */
    public void setNoticeIds(String [] NoticeIds) {
        this.NoticeIds = NoticeIds;
    }

    /**
     * Get Filter templates by tag 
     * @return Tags Filter templates by tag
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Filter templates by tag
     * @param Tags Filter templates by tag
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Schedule list 
     * @return OnCallFormIDs Schedule list
     */
    public String [] getOnCallFormIDs() {
        return this.OnCallFormIDs;
    }

    /**
     * Set Schedule list
     * @param OnCallFormIDs Schedule list
     */
    public void setOnCallFormIDs(String [] OnCallFormIDs) {
        this.OnCallFormIDs = OnCallFormIDs;
    }

    public DescribeAlarmNoticesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmNoticesRequest(DescribeAlarmNoticesRequest source) {
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
        if (source.OwnerUid != null) {
            this.OwnerUid = new Long(source.OwnerUid);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.UserIds != null) {
            this.UserIds = new Long[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new Long(source.UserIds[i]);
            }
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.NoticeIds != null) {
            this.NoticeIds = new String[source.NoticeIds.length];
            for (int i = 0; i < source.NoticeIds.length; i++) {
                this.NoticeIds[i] = new String(source.NoticeIds[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.OnCallFormIDs != null) {
            this.OnCallFormIDs = new String[source.OnCallFormIDs.length];
            for (int i = 0; i < source.OnCallFormIDs.length; i++) {
                this.OnCallFormIDs[i] = new String(source.OnCallFormIDs[i]);
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
        this.setParamSimple(map, prefix + "OwnerUid", this.OwnerUid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "NoticeIds.", this.NoticeIds);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamArraySimple(map, prefix + "OnCallFormIDs.", this.OnCallFormIDs);

    }
}

