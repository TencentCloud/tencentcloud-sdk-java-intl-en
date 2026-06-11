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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NoticeReceiver extends AbstractModel {

    /**
    * Recipient type. Available values:
-Uin - User ID
-Group - User group ID
Other recipient types are not currently supported.
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Recipient.
When ReceiverType is Uin, the value of ReceiverIds is the user uid. [Sub-user information query](https://www.tencentcloud.com/document/api/598/53486?from_cn_redirect=1)
When ReceiverType is Group, ReceiverIds is the user Group id. [CAM User Group](https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1)
    */
    @SerializedName("ReceiverIds")
    @Expose
    private Long [] ReceiverIds;

    /**
    * Notification receiving channel
-Mail
-Sms
-WeChat
-Phone - phone
    */
    @SerializedName("ReceiverChannels")
    @Expose
    private String [] ReceiverChannels;

    /**
    * Notification content template ID. Use Default-zh to refer to the Default template (Chinese). Use Default-en to refer to DefaultTemplate (English). Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/product/614/111714?from_cn_redirect=1).
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * Start time to allow receipt of information. Format: `15:04:05`. Required.
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * Allow receipt of information end time. Format: `15:04:05`. Required
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * Bit order.

-Invalid when passed as an input parameter.
-Valid at that time.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get Recipient type. Available values:
-Uin - User ID
-Group - User group ID
Other recipient types are not currently supported. 
     * @return ReceiverType Recipient type. Available values:
-Uin - User ID
-Group - User group ID
Other recipient types are not currently supported.
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Recipient type. Available values:
-Uin - User ID
-Group - User group ID
Other recipient types are not currently supported.
     * @param ReceiverType Recipient type. Available values:
-Uin - User ID
-Group - User group ID
Other recipient types are not currently supported.
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Recipient.
When ReceiverType is Uin, the value of ReceiverIds is the user uid. [Sub-user information query](https://www.tencentcloud.com/document/api/598/53486?from_cn_redirect=1)
When ReceiverType is Group, ReceiverIds is the user Group id. [CAM User Group](https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1) 
     * @return ReceiverIds Recipient.
When ReceiverType is Uin, the value of ReceiverIds is the user uid. [Sub-user information query](https://www.tencentcloud.com/document/api/598/53486?from_cn_redirect=1)
When ReceiverType is Group, ReceiverIds is the user Group id. [CAM User Group](https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1)
     */
    public Long [] getReceiverIds() {
        return this.ReceiverIds;
    }

    /**
     * Set Recipient.
When ReceiverType is Uin, the value of ReceiverIds is the user uid. [Sub-user information query](https://www.tencentcloud.com/document/api/598/53486?from_cn_redirect=1)
When ReceiverType is Group, ReceiverIds is the user Group id. [CAM User Group](https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1)
     * @param ReceiverIds Recipient.
When ReceiverType is Uin, the value of ReceiverIds is the user uid. [Sub-user information query](https://www.tencentcloud.com/document/api/598/53486?from_cn_redirect=1)
When ReceiverType is Group, ReceiverIds is the user Group id. [CAM User Group](https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1)
     */
    public void setReceiverIds(Long [] ReceiverIds) {
        this.ReceiverIds = ReceiverIds;
    }

    /**
     * Get Notification receiving channel
-Mail
-Sms
-WeChat
-Phone - phone 
     * @return ReceiverChannels Notification receiving channel
-Mail
-Sms
-WeChat
-Phone - phone
     */
    public String [] getReceiverChannels() {
        return this.ReceiverChannels;
    }

    /**
     * Set Notification receiving channel
-Mail
-Sms
-WeChat
-Phone - phone
     * @param ReceiverChannels Notification receiving channel
-Mail
-Sms
-WeChat
-Phone - phone
     */
    public void setReceiverChannels(String [] ReceiverChannels) {
        this.ReceiverChannels = ReceiverChannels;
    }

    /**
     * Get Notification content template ID. Use Default-zh to refer to the Default template (Chinese). Use Default-en to refer to DefaultTemplate (English). Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/product/614/111714?from_cn_redirect=1). 
     * @return NoticeContentId Notification content template ID. Use Default-zh to refer to the Default template (Chinese). Use Default-en to refer to DefaultTemplate (English). Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/product/614/111714?from_cn_redirect=1).
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set Notification content template ID. Use Default-zh to refer to the Default template (Chinese). Use Default-en to refer to DefaultTemplate (English). Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/product/614/111714?from_cn_redirect=1).
     * @param NoticeContentId Notification content template ID. Use Default-zh to refer to the Default template (Chinese). Use Default-en to refer to DefaultTemplate (English). Get the notification content template ID by searching the notification content template (https://www.tencentcloud.com/document/product/614/111714?from_cn_redirect=1).
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get Start time to allow receipt of information. Format: `15:04:05`. Required. 
     * @return StartTime Start time to allow receipt of information. Format: `15:04:05`. Required.
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set Start time to allow receipt of information. Format: `15:04:05`. Required.
     * @param StartTime Start time to allow receipt of information. Format: `15:04:05`. Required.
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get Allow receipt of information end time. Format: `15:04:05`. Required 
     * @return EndTime Allow receipt of information end time. Format: `15:04:05`. Required
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set Allow receipt of information end time. Format: `15:04:05`. Required
     * @param EndTime Allow receipt of information end time. Format: `15:04:05`. Required
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get Bit order.

-Invalid when passed as an input parameter.
-Valid at that time. 
     * @return Index Bit order.

-Invalid when passed as an input parameter.
-Valid at that time.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Bit order.

-Invalid when passed as an input parameter.
-Valid at that time.
     * @param Index Bit order.

-Invalid when passed as an input parameter.
-Valid at that time.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public NoticeReceiver() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeReceiver(NoticeReceiver source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.ReceiverIds != null) {
            this.ReceiverIds = new Long[source.ReceiverIds.length];
            for (int i = 0; i < source.ReceiverIds.length; i++) {
                this.ReceiverIds[i] = new Long(source.ReceiverIds[i]);
            }
        }
        if (source.ReceiverChannels != null) {
            this.ReceiverChannels = new String[source.ReceiverChannels.length];
            for (int i = 0; i < source.ReceiverChannels.length; i++) {
                this.ReceiverChannels[i] = new String(source.ReceiverChannels[i]);
            }
        }
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "ReceiverIds.", this.ReceiverIds);
        this.setParamArraySimple(map, prefix + "ReceiverChannels.", this.ReceiverChannels);
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

