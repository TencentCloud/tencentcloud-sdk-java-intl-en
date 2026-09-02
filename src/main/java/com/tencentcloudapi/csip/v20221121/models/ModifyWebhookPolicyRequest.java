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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebhookPolicyRequest extends AbstractModel {

    /**
    * <p>Policy Name<br>Input parameter limit: 1-20 characters, tenant-unique</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Enable status<br>Enumeration values:<br>ON: Enabled<br>OFF: Disabled</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>List of notification items<br>Input parameter limit: at least 1 item. Module/SubModule must be a valid composite returned by DescribeWebhookNotifyItemTree</p>
    */
    @SerializedName("NotifyItems")
    @Expose
    private WebhookNotifyItem [] NotifyItems;

    /**
    * <p>Asset scope for notification</p>
    */
    @SerializedName("AssetScope")
    @Expose
    private WebhookAssetScope AssetScope;

    /**
    * <p>Accept format<br>Enumeration values:<br>TEXT: Text format<br>JSON: JSON format</p>
    */
    @SerializedName("ReceiveFormat")
    @Expose
    private String ReceiveFormat;

    /**
    * <p>Receiving robot ID list<br>Input limits: at least 1, up to 50</p>
    */
    @SerializedName("ReceiverIDList")
    @Expose
    private Long [] ReceiverIDList;

    /**
    * <p>Group account member id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Policy ID. More than 0 means modification; equal to 0 or not passed means adding new<br>Default value: 0</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English<br>Default value: zh on the Chinese site and en on the international site</p>
    */
    @SerializedName("MsgLanguage")
    @Expose
    private String MsgLanguage;

    /**
    * <p>List of custom passthrough fields<br>Input limitation: Required when EnableCustomFields=true, up to 20</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private WebhookCustomField [] CustomFields;

    /**
     * Get <p>Policy Name<br>Input parameter limit: 1-20 characters, tenant-unique</p> 
     * @return Name <p>Policy Name<br>Input parameter limit: 1-20 characters, tenant-unique</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy Name<br>Input parameter limit: 1-20 characters, tenant-unique</p>
     * @param Name <p>Policy Name<br>Input parameter limit: 1-20 characters, tenant-unique</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Enable status<br>Enumeration values:<br>ON: Enabled<br>OFF: Disabled</p> 
     * @return Status <p>Enable status<br>Enumeration values:<br>ON: Enabled<br>OFF: Disabled</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Enable status<br>Enumeration values:<br>ON: Enabled<br>OFF: Disabled</p>
     * @param Status <p>Enable status<br>Enumeration values:<br>ON: Enabled<br>OFF: Disabled</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>List of notification items<br>Input parameter limit: at least 1 item. Module/SubModule must be a valid composite returned by DescribeWebhookNotifyItemTree</p> 
     * @return NotifyItems <p>List of notification items<br>Input parameter limit: at least 1 item. Module/SubModule must be a valid composite returned by DescribeWebhookNotifyItemTree</p>
     */
    public WebhookNotifyItem [] getNotifyItems() {
        return this.NotifyItems;
    }

    /**
     * Set <p>List of notification items<br>Input parameter limit: at least 1 item. Module/SubModule must be a valid composite returned by DescribeWebhookNotifyItemTree</p>
     * @param NotifyItems <p>List of notification items<br>Input parameter limit: at least 1 item. Module/SubModule must be a valid composite returned by DescribeWebhookNotifyItemTree</p>
     */
    public void setNotifyItems(WebhookNotifyItem [] NotifyItems) {
        this.NotifyItems = NotifyItems;
    }

    /**
     * Get <p>Asset scope for notification</p> 
     * @return AssetScope <p>Asset scope for notification</p>
     */
    public WebhookAssetScope getAssetScope() {
        return this.AssetScope;
    }

    /**
     * Set <p>Asset scope for notification</p>
     * @param AssetScope <p>Asset scope for notification</p>
     */
    public void setAssetScope(WebhookAssetScope AssetScope) {
        this.AssetScope = AssetScope;
    }

    /**
     * Get <p>Accept format<br>Enumeration values:<br>TEXT: Text format<br>JSON: JSON format</p> 
     * @return ReceiveFormat <p>Accept format<br>Enumeration values:<br>TEXT: Text format<br>JSON: JSON format</p>
     */
    public String getReceiveFormat() {
        return this.ReceiveFormat;
    }

    /**
     * Set <p>Accept format<br>Enumeration values:<br>TEXT: Text format<br>JSON: JSON format</p>
     * @param ReceiveFormat <p>Accept format<br>Enumeration values:<br>TEXT: Text format<br>JSON: JSON format</p>
     */
    public void setReceiveFormat(String ReceiveFormat) {
        this.ReceiveFormat = ReceiveFormat;
    }

    /**
     * Get <p>Receiving robot ID list<br>Input limits: at least 1, up to 50</p> 
     * @return ReceiverIDList <p>Receiving robot ID list<br>Input limits: at least 1, up to 50</p>
     */
    public Long [] getReceiverIDList() {
        return this.ReceiverIDList;
    }

    /**
     * Set <p>Receiving robot ID list<br>Input limits: at least 1, up to 50</p>
     * @param ReceiverIDList <p>Receiving robot ID list<br>Input limits: at least 1, up to 50</p>
     */
    public void setReceiverIDList(Long [] ReceiverIDList) {
        this.ReceiverIDList = ReceiverIDList;
    }

    /**
     * Get <p>Group account member id</p> 
     * @return MemberId <p>Group account member id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Group account member id</p>
     * @param MemberId <p>Group account member id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Policy ID. More than 0 means modification; equal to 0 or not passed means adding new<br>Default value: 0</p> 
     * @return ID <p>Policy ID. More than 0 means modification; equal to 0 or not passed means adding new<br>Default value: 0</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Policy ID. More than 0 means modification; equal to 0 or not passed means adding new<br>Default value: 0</p>
     * @param ID <p>Policy ID. More than 0 means modification; equal to 0 or not passed means adding new<br>Default value: 0</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English<br>Default value: zh on the Chinese site and en on the international site</p> 
     * @return MsgLanguage <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English<br>Default value: zh on the Chinese site and en on the international site</p>
     */
    public String getMsgLanguage() {
        return this.MsgLanguage;
    }

    /**
     * Set <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English<br>Default value: zh on the Chinese site and en on the international site</p>
     * @param MsgLanguage <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English<br>Default value: zh on the Chinese site and en on the international site</p>
     */
    public void setMsgLanguage(String MsgLanguage) {
        this.MsgLanguage = MsgLanguage;
    }

    /**
     * Get <p>List of custom passthrough fields<br>Input limitation: Required when EnableCustomFields=true, up to 20</p> 
     * @return CustomFields <p>List of custom passthrough fields<br>Input limitation: Required when EnableCustomFields=true, up to 20</p>
     */
    public WebhookCustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>List of custom passthrough fields<br>Input limitation: Required when EnableCustomFields=true, up to 20</p>
     * @param CustomFields <p>List of custom passthrough fields<br>Input limitation: Required when EnableCustomFields=true, up to 20</p>
     */
    public void setCustomFields(WebhookCustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    public ModifyWebhookPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebhookPolicyRequest(ModifyWebhookPolicyRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.NotifyItems != null) {
            this.NotifyItems = new WebhookNotifyItem[source.NotifyItems.length];
            for (int i = 0; i < source.NotifyItems.length; i++) {
                this.NotifyItems[i] = new WebhookNotifyItem(source.NotifyItems[i]);
            }
        }
        if (source.AssetScope != null) {
            this.AssetScope = new WebhookAssetScope(source.AssetScope);
        }
        if (source.ReceiveFormat != null) {
            this.ReceiveFormat = new String(source.ReceiveFormat);
        }
        if (source.ReceiverIDList != null) {
            this.ReceiverIDList = new Long[source.ReceiverIDList.length];
            for (int i = 0; i < source.ReceiverIDList.length; i++) {
                this.ReceiverIDList[i] = new Long(source.ReceiverIDList[i]);
            }
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.MsgLanguage != null) {
            this.MsgLanguage = new String(source.MsgLanguage);
        }
        if (source.CustomFields != null) {
            this.CustomFields = new WebhookCustomField[source.CustomFields.length];
            for (int i = 0; i < source.CustomFields.length; i++) {
                this.CustomFields[i] = new WebhookCustomField(source.CustomFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "NotifyItems.", this.NotifyItems);
        this.setParamObj(map, prefix + "AssetScope.", this.AssetScope);
        this.setParamSimple(map, prefix + "ReceiveFormat", this.ReceiveFormat);
        this.setParamArraySimple(map, prefix + "ReceiverIDList.", this.ReceiverIDList);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "MsgLanguage", this.MsgLanguage);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);

    }
}

