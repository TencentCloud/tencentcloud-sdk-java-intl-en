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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetMsgRecordRequest extends AbstractModel {

    /**
    * Type.
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Quantity.
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Session ID.
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * Application AppKey. When Type=5 [API Visitor], this field is required. </br> How to obtain it: </br> 1. After the application is released, obtain it at [Application Page]-[Release Management]-[Call Information]-[API Management]. </br> 2. Refer to item 2 in https://cloud.tencent.com/document/product/1759/109469.
    */
    @SerializedName("BotAppKey")
    @Expose
    private String BotAppKey;

    /**
    * Scenario, experience: 1; formal: 2.
    */
    @SerializedName("Scene")
    @Expose
    private Long Scene;

    /**
    * Last record ID. Retrieve messages in reverse order. You can only select either MidRecordId or LastRecordId.
    */
    @SerializedName("LastRecordId")
    @Expose
    private String LastRecordId;

    /**
    * If this value is input, it means pulling a total of count message records before and after the record ID. You can only select either MidRecordId or LastRecordId.
    */
    @SerializedName("MidRecordId")
    @Expose
    private String MidRecordId;

    /**
     * Get Type. 
     * @return Type Type.
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set Type.
     * @param Type Type.
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Quantity. 
     * @return Count Quantity.
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set Quantity.
     * @param Count Quantity.
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Session ID. 
     * @return SessionId Session ID.
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * Set Session ID.
     * @param SessionId Session ID.
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * Get Application AppKey. When Type=5 [API Visitor], this field is required. </br> How to obtain it: </br> 1. After the application is released, obtain it at [Application Page]-[Release Management]-[Call Information]-[API Management]. </br> 2. Refer to item 2 in https://cloud.tencent.com/document/product/1759/109469. 
     * @return BotAppKey Application AppKey. When Type=5 [API Visitor], this field is required. </br> How to obtain it: </br> 1. After the application is released, obtain it at [Application Page]-[Release Management]-[Call Information]-[API Management]. </br> 2. Refer to item 2 in https://cloud.tencent.com/document/product/1759/109469.
     */
    public String getBotAppKey() {
        return this.BotAppKey;
    }

    /**
     * Set Application AppKey. When Type=5 [API Visitor], this field is required. </br> How to obtain it: </br> 1. After the application is released, obtain it at [Application Page]-[Release Management]-[Call Information]-[API Management]. </br> 2. Refer to item 2 in https://cloud.tencent.com/document/product/1759/109469.
     * @param BotAppKey Application AppKey. When Type=5 [API Visitor], this field is required. </br> How to obtain it: </br> 1. After the application is released, obtain it at [Application Page]-[Release Management]-[Call Information]-[API Management]. </br> 2. Refer to item 2 in https://cloud.tencent.com/document/product/1759/109469.
     */
    public void setBotAppKey(String BotAppKey) {
        this.BotAppKey = BotAppKey;
    }

    /**
     * Get Scenario, experience: 1; formal: 2. 
     * @return Scene Scenario, experience: 1; formal: 2.
     */
    public Long getScene() {
        return this.Scene;
    }

    /**
     * Set Scenario, experience: 1; formal: 2.
     * @param Scene Scenario, experience: 1; formal: 2.
     */
    public void setScene(Long Scene) {
        this.Scene = Scene;
    }

    /**
     * Get Last record ID. Retrieve messages in reverse order. You can only select either MidRecordId or LastRecordId. 
     * @return LastRecordId Last record ID. Retrieve messages in reverse order. You can only select either MidRecordId or LastRecordId.
     */
    public String getLastRecordId() {
        return this.LastRecordId;
    }

    /**
     * Set Last record ID. Retrieve messages in reverse order. You can only select either MidRecordId or LastRecordId.
     * @param LastRecordId Last record ID. Retrieve messages in reverse order. You can only select either MidRecordId or LastRecordId.
     */
    public void setLastRecordId(String LastRecordId) {
        this.LastRecordId = LastRecordId;
    }

    /**
     * Get If this value is input, it means pulling a total of count message records before and after the record ID. You can only select either MidRecordId or LastRecordId. 
     * @return MidRecordId If this value is input, it means pulling a total of count message records before and after the record ID. You can only select either MidRecordId or LastRecordId.
     */
    public String getMidRecordId() {
        return this.MidRecordId;
    }

    /**
     * Set If this value is input, it means pulling a total of count message records before and after the record ID. You can only select either MidRecordId or LastRecordId.
     * @param MidRecordId If this value is input, it means pulling a total of count message records before and after the record ID. You can only select either MidRecordId or LastRecordId.
     */
    public void setMidRecordId(String MidRecordId) {
        this.MidRecordId = MidRecordId;
    }

    public GetMsgRecordRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetMsgRecordRequest(GetMsgRecordRequest source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.SessionId != null) {
            this.SessionId = new String(source.SessionId);
        }
        if (source.BotAppKey != null) {
            this.BotAppKey = new String(source.BotAppKey);
        }
        if (source.Scene != null) {
            this.Scene = new Long(source.Scene);
        }
        if (source.LastRecordId != null) {
            this.LastRecordId = new String(source.LastRecordId);
        }
        if (source.MidRecordId != null) {
            this.MidRecordId = new String(source.MidRecordId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "BotAppKey", this.BotAppKey);
        this.setParamSimple(map, prefix + "Scene", this.Scene);
        this.setParamSimple(map, prefix + "LastRecordId", this.LastRecordId);
        this.setParamSimple(map, prefix + "MidRecordId", this.MidRecordId);

    }
}

