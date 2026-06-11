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

public class WebCallback extends AbstractModel {

    /**
    * Callback type. Valid values:
-Http (custom webhook configuration)
-WeCom
-DingTalk
-Lark
    */
    @SerializedName("CallbackType")
    @Expose
    private String CallbackType;

    /**
    * Callback URL, supports a maximum of 1024 bytes.
You can also use WebCallbackId to refer to the URL in the integration configuration. At this point, please enter an empty string for this field.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * Integration configuration ID. Obtain the integration configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/product/614/115229?from_cn_redirect=1).
    */
    @SerializedName("WebCallbackId")
    @Expose
    private String WebCallbackId;

    /**
    * Callback method. Valid values:
-POST (default value)
- PUT

Note:
-Required when CallbackType is Http. No need to specify for other callback methods.
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * Notification content template ID. When Default-zh is used, DefaultTemplate (Chinese) is referenced. When Default-en is used, DefaultTemplate (English) is referenced.
    */
    @SerializedName("NoticeContentId")
    @Expose
    private String NoticeContentId;

    /**
    * Reminder type.

0: No reminder; 1: Specified individual; 2: Everyone
    */
    @SerializedName("RemindType")
    @Expose
    private Long RemindType;

    /**
    * Mobile phone list.
    */
    @SerializedName("Mobiles")
    @Expose
    private String [] Mobiles;

    /**
    * User ID list.
    */
    @SerializedName("UserIds")
    @Expose
    private String [] UserIds;

    /**
    * This parameter is deprecated. Please use NoticeContentId.
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
    * This parameter is deprecated. Please use NoticeContentId.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * Serial number.
-Invalid input parameter.
-Output parameter is valid.
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get Callback type. Valid values:
-Http (custom webhook configuration)
-WeCom
-DingTalk
-Lark 
     * @return CallbackType Callback type. Valid values:
-Http (custom webhook configuration)
-WeCom
-DingTalk
-Lark
     */
    public String getCallbackType() {
        return this.CallbackType;
    }

    /**
     * Set Callback type. Valid values:
-Http (custom webhook configuration)
-WeCom
-DingTalk
-Lark
     * @param CallbackType Callback type. Valid values:
-Http (custom webhook configuration)
-WeCom
-DingTalk
-Lark
     */
    public void setCallbackType(String CallbackType) {
        this.CallbackType = CallbackType;
    }

    /**
     * Get Callback URL, supports a maximum of 1024 bytes.
You can also use WebCallbackId to refer to the URL in the integration configuration. At this point, please enter an empty string for this field. 
     * @return Url Callback URL, supports a maximum of 1024 bytes.
You can also use WebCallbackId to refer to the URL in the integration configuration. At this point, please enter an empty string for this field.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Callback URL, supports a maximum of 1024 bytes.
You can also use WebCallbackId to refer to the URL in the integration configuration. At this point, please enter an empty string for this field.
     * @param Url Callback URL, supports a maximum of 1024 bytes.
You can also use WebCallbackId to refer to the URL in the integration configuration. At this point, please enter an empty string for this field.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get Integration configuration ID. Obtain the integration configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/product/614/115229?from_cn_redirect=1). 
     * @return WebCallbackId Integration configuration ID. Obtain the integration configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/product/614/115229?from_cn_redirect=1).
     */
    public String getWebCallbackId() {
        return this.WebCallbackId;
    }

    /**
     * Set Integration configuration ID. Obtain the integration configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/product/614/115229?from_cn_redirect=1).
     * @param WebCallbackId Integration configuration ID. Obtain the integration configuration ID by searching the alarm channel callback configuration list (https://www.tencentcloud.com/document/product/614/115229?from_cn_redirect=1).
     */
    public void setWebCallbackId(String WebCallbackId) {
        this.WebCallbackId = WebCallbackId;
    }

    /**
     * Get Callback method. Valid values:
-POST (default value)
- PUT

Note:
-Required when CallbackType is Http. No need to specify for other callback methods. 
     * @return Method Callback method. Valid values:
-POST (default value)
- PUT

Note:
-Required when CallbackType is Http. No need to specify for other callback methods.
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set Callback method. Valid values:
-POST (default value)
- PUT

Note:
-Required when CallbackType is Http. No need to specify for other callback methods.
     * @param Method Callback method. Valid values:
-POST (default value)
- PUT

Note:
-Required when CallbackType is Http. No need to specify for other callback methods.
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get Notification content template ID. When Default-zh is used, DefaultTemplate (Chinese) is referenced. When Default-en is used, DefaultTemplate (English) is referenced. 
     * @return NoticeContentId Notification content template ID. When Default-zh is used, DefaultTemplate (Chinese) is referenced. When Default-en is used, DefaultTemplate (English) is referenced.
     */
    public String getNoticeContentId() {
        return this.NoticeContentId;
    }

    /**
     * Set Notification content template ID. When Default-zh is used, DefaultTemplate (Chinese) is referenced. When Default-en is used, DefaultTemplate (English) is referenced.
     * @param NoticeContentId Notification content template ID. When Default-zh is used, DefaultTemplate (Chinese) is referenced. When Default-en is used, DefaultTemplate (English) is referenced.
     */
    public void setNoticeContentId(String NoticeContentId) {
        this.NoticeContentId = NoticeContentId;
    }

    /**
     * Get Reminder type.

0: No reminder; 1: Specified individual; 2: Everyone 
     * @return RemindType Reminder type.

0: No reminder; 1: Specified individual; 2: Everyone
     */
    public Long getRemindType() {
        return this.RemindType;
    }

    /**
     * Set Reminder type.

0: No reminder; 1: Specified individual; 2: Everyone
     * @param RemindType Reminder type.

0: No reminder; 1: Specified individual; 2: Everyone
     */
    public void setRemindType(Long RemindType) {
        this.RemindType = RemindType;
    }

    /**
     * Get Mobile phone list. 
     * @return Mobiles Mobile phone list.
     */
    public String [] getMobiles() {
        return this.Mobiles;
    }

    /**
     * Set Mobile phone list.
     * @param Mobiles Mobile phone list.
     */
    public void setMobiles(String [] Mobiles) {
        this.Mobiles = Mobiles;
    }

    /**
     * Get User ID list. 
     * @return UserIds User ID list.
     */
    public String [] getUserIds() {
        return this.UserIds;
    }

    /**
     * Set User ID list.
     * @param UserIds User ID list.
     */
    public void setUserIds(String [] UserIds) {
        this.UserIds = UserIds;
    }

    /**
     * Get This parameter is deprecated. Please use NoticeContentId. 
     * @return Headers This parameter is deprecated. Please use NoticeContentId.
     * @deprecated
     */
    @Deprecated
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set This parameter is deprecated. Please use NoticeContentId.
     * @param Headers This parameter is deprecated. Please use NoticeContentId.
     * @deprecated
     */
    @Deprecated
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get This parameter is deprecated. Please use NoticeContentId.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return Body This parameter is deprecated. Please use NoticeContentId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public String getBody() {
        return this.Body;
    }

    /**
     * Set This parameter is deprecated. Please use NoticeContentId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param Body This parameter is deprecated. Please use NoticeContentId.
Note: This field may return null, indicating that no valid values can be obtained.
     * @deprecated
     */
    @Deprecated
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get Serial number.
-Invalid input parameter.
-Output parameter is valid. 
     * @return Index Serial number.
-Invalid input parameter.
-Output parameter is valid.
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set Serial number.
-Invalid input parameter.
-Output parameter is valid.
     * @param Index Serial number.
-Invalid input parameter.
-Output parameter is valid.
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public WebCallback() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebCallback(WebCallback source) {
        if (source.CallbackType != null) {
            this.CallbackType = new String(source.CallbackType);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.WebCallbackId != null) {
            this.WebCallbackId = new String(source.WebCallbackId);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.NoticeContentId != null) {
            this.NoticeContentId = new String(source.NoticeContentId);
        }
        if (source.RemindType != null) {
            this.RemindType = new Long(source.RemindType);
        }
        if (source.Mobiles != null) {
            this.Mobiles = new String[source.Mobiles.length];
            for (int i = 0; i < source.Mobiles.length; i++) {
                this.Mobiles[i] = new String(source.Mobiles[i]);
            }
        }
        if (source.UserIds != null) {
            this.UserIds = new String[source.UserIds.length];
            for (int i = 0; i < source.UserIds.length; i++) {
                this.UserIds[i] = new String(source.UserIds[i]);
            }
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CallbackType", this.CallbackType);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "WebCallbackId", this.WebCallbackId);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "NoticeContentId", this.NoticeContentId);
        this.setParamSimple(map, prefix + "RemindType", this.RemindType);
        this.setParamArraySimple(map, prefix + "Mobiles.", this.Mobiles);
        this.setParamArraySimple(map, prefix + "UserIds.", this.UserIds);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

