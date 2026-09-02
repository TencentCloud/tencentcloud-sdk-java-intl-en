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

public class WebhookPolicy extends AbstractModel {

    /**
    * <p>Policy ID</p>
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * <p>Policy name.</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>Enabled status<br>Enumeration values:<br>ON: enable<br>OFF: disable</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>Notification item list (module + submodule + severity + handling status)</p>
    */
    @SerializedName("NotifyItems")
    @Expose
    private WebhookNotifyItem [] NotifyItems;

    /**
    * <p>Account range of members to receive</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>Notification asset scope</p>
    */
    @SerializedName("AssetScope")
    @Expose
    private WebhookAssetScope AssetScope;

    /**
    * <p>Accept format<br>Enumeration values:<br>TEXT: text format<br>JSON: JSON format</p>
    */
    @SerializedName("ReceiveFormat")
    @Expose
    private String ReceiveFormat;

    /**
    * <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English</p>
    */
    @SerializedName("MsgLanguage")
    @Expose
    private String MsgLanguage;

    /**
    * <p>Custom passthrough field list. It is an empty array when turned off.</p>
    */
    @SerializedName("CustomFields")
    @Expose
    private WebhookCustomField [] CustomFields;

    /**
    * <p>Receiving robot ID list</p>
    */
    @SerializedName("ReceiverIDList")
    @Expose
    private Long [] ReceiverIDList;

    /**
    * <p>Simplify info for the receiving robot (for list row display)</p>
    */
    @SerializedName("ReceiverList")
    @Expose
    private WebhookReceiverBrief [] ReceiverList;

    /**
     * Get <p>Policy ID</p> 
     * @return ID <p>Policy ID</p>
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set <p>Policy ID</p>
     * @param ID <p>Policy ID</p>
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get <p>Policy name.</p> 
     * @return Name <p>Policy name.</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Policy name.</p>
     * @param Name <p>Policy name.</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>Enabled status<br>Enumeration values:<br>ON: enable<br>OFF: disable</p> 
     * @return Status <p>Enabled status<br>Enumeration values:<br>ON: enable<br>OFF: disable</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>Enabled status<br>Enumeration values:<br>ON: enable<br>OFF: disable</p>
     * @param Status <p>Enabled status<br>Enumeration values:<br>ON: enable<br>OFF: disable</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>Notification item list (module + submodule + severity + handling status)</p> 
     * @return NotifyItems <p>Notification item list (module + submodule + severity + handling status)</p>
     */
    public WebhookNotifyItem [] getNotifyItems() {
        return this.NotifyItems;
    }

    /**
     * Set <p>Notification item list (module + submodule + severity + handling status)</p>
     * @param NotifyItems <p>Notification item list (module + submodule + severity + handling status)</p>
     */
    public void setNotifyItems(WebhookNotifyItem [] NotifyItems) {
        this.NotifyItems = NotifyItems;
    }

    /**
     * Get <p>Account range of members to receive</p> 
     * @return MemberId <p>Account range of members to receive</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>Account range of members to receive</p>
     * @param MemberId <p>Account range of members to receive</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>Notification asset scope</p> 
     * @return AssetScope <p>Notification asset scope</p>
     */
    public WebhookAssetScope getAssetScope() {
        return this.AssetScope;
    }

    /**
     * Set <p>Notification asset scope</p>
     * @param AssetScope <p>Notification asset scope</p>
     */
    public void setAssetScope(WebhookAssetScope AssetScope) {
        this.AssetScope = AssetScope;
    }

    /**
     * Get <p>Accept format<br>Enumeration values:<br>TEXT: text format<br>JSON: JSON format</p> 
     * @return ReceiveFormat <p>Accept format<br>Enumeration values:<br>TEXT: text format<br>JSON: JSON format</p>
     */
    public String getReceiveFormat() {
        return this.ReceiveFormat;
    }

    /**
     * Set <p>Accept format<br>Enumeration values:<br>TEXT: text format<br>JSON: JSON format</p>
     * @param ReceiveFormat <p>Accept format<br>Enumeration values:<br>TEXT: text format<br>JSON: JSON format</p>
     */
    public void setReceiveFormat(String ReceiveFormat) {
        this.ReceiveFormat = ReceiveFormat;
    }

    /**
     * Get <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English</p> 
     * @return MsgLanguage <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English</p>
     */
    public String getMsgLanguage() {
        return this.MsgLanguage;
    }

    /**
     * Set <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English</p>
     * @param MsgLanguage <p>Push language<br>Enumeration values:<br>zh: Chinese<br>en: English</p>
     */
    public void setMsgLanguage(String MsgLanguage) {
        this.MsgLanguage = MsgLanguage;
    }

    /**
     * Get <p>Custom passthrough field list. It is an empty array when turned off.</p> 
     * @return CustomFields <p>Custom passthrough field list. It is an empty array when turned off.</p>
     */
    public WebhookCustomField [] getCustomFields() {
        return this.CustomFields;
    }

    /**
     * Set <p>Custom passthrough field list. It is an empty array when turned off.</p>
     * @param CustomFields <p>Custom passthrough field list. It is an empty array when turned off.</p>
     */
    public void setCustomFields(WebhookCustomField [] CustomFields) {
        this.CustomFields = CustomFields;
    }

    /**
     * Get <p>Receiving robot ID list</p> 
     * @return ReceiverIDList <p>Receiving robot ID list</p>
     */
    public Long [] getReceiverIDList() {
        return this.ReceiverIDList;
    }

    /**
     * Set <p>Receiving robot ID list</p>
     * @param ReceiverIDList <p>Receiving robot ID list</p>
     */
    public void setReceiverIDList(Long [] ReceiverIDList) {
        this.ReceiverIDList = ReceiverIDList;
    }

    /**
     * Get <p>Simplify info for the receiving robot (for list row display)</p> 
     * @return ReceiverList <p>Simplify info for the receiving robot (for list row display)</p>
     */
    public WebhookReceiverBrief [] getReceiverList() {
        return this.ReceiverList;
    }

    /**
     * Set <p>Simplify info for the receiving robot (for list row display)</p>
     * @param ReceiverList <p>Simplify info for the receiving robot (for list row display)</p>
     */
    public void setReceiverList(WebhookReceiverBrief [] ReceiverList) {
        this.ReceiverList = ReceiverList;
    }

    public WebhookPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookPolicy(WebhookPolicy source) {
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
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
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.AssetScope != null) {
            this.AssetScope = new WebhookAssetScope(source.AssetScope);
        }
        if (source.ReceiveFormat != null) {
            this.ReceiveFormat = new String(source.ReceiveFormat);
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
        if (source.ReceiverIDList != null) {
            this.ReceiverIDList = new Long[source.ReceiverIDList.length];
            for (int i = 0; i < source.ReceiverIDList.length; i++) {
                this.ReceiverIDList[i] = new Long(source.ReceiverIDList[i]);
            }
        }
        if (source.ReceiverList != null) {
            this.ReceiverList = new WebhookReceiverBrief[source.ReceiverList.length];
            for (int i = 0; i < source.ReceiverList.length; i++) {
                this.ReceiverList[i] = new WebhookReceiverBrief(source.ReceiverList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "NotifyItems.", this.NotifyItems);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "AssetScope.", this.AssetScope);
        this.setParamSimple(map, prefix + "ReceiveFormat", this.ReceiveFormat);
        this.setParamSimple(map, prefix + "MsgLanguage", this.MsgLanguage);
        this.setParamArrayObj(map, prefix + "CustomFields.", this.CustomFields);
        this.setParamArraySimple(map, prefix + "ReceiverIDList.", this.ReceiverIDList);
        this.setParamArrayObj(map, prefix + "ReceiverList.", this.ReceiverList);

    }
}

