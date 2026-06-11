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

public class DashboardNoticeMode extends AbstractModel {

    /**
    * Dashboard notification method.

-Uin: Tencent Cloud user
-Group: Tencent Cloud user group
-WeCom: wecom callback
-Email: Custom email
-DingTalk
-Lark
    */
    @SerializedName("ReceiverType")
    @Expose
    private String ReceiverType;

    /**
    * Value of the known method.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, Values must be empty and the Url field is required.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Values field is required and the Url field must be empty.
-When ReceiverType is `Uin`, Values is the user id. Obtain the sub-user UID by [querying sub-users](https://www.tencentcloud.com/document/product/598/34587?from_cn_redirect=1).
-When ReceiverType is `Group`, Values is the user Group id. Obtain user Group id by querying the user Group list (https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1).
-When ReceiverType is `Email`, Values is the user email info.
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
    * Dashboard notification channel.

-Support: ["Email","Sms","WeChat","Phone"].
-When ReceiverType is `Email` or `WeCom`, ReceiverChannels is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ReceiverChannels")
    @Expose
    private String [] ReceiverChannels;

    /**
    * Subscription method - Callback URL.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, the Url field is required as the callback URL of each channel.
-When the value is `WeCom`, the Url is the enterprise wechat callback address.
-When the value is `DingTalk`, Url is the chatbot Webhook address.
-When `Lark`, Url is the chatbot Webhook address.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Url field must be empty.
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get Dashboard notification method.

-Uin: Tencent Cloud user
-Group: Tencent Cloud user group
-WeCom: wecom callback
-Email: Custom email
-DingTalk
-Lark 
     * @return ReceiverType Dashboard notification method.

-Uin: Tencent Cloud user
-Group: Tencent Cloud user group
-WeCom: wecom callback
-Email: Custom email
-DingTalk
-Lark
     */
    public String getReceiverType() {
        return this.ReceiverType;
    }

    /**
     * Set Dashboard notification method.

-Uin: Tencent Cloud user
-Group: Tencent Cloud user group
-WeCom: wecom callback
-Email: Custom email
-DingTalk
-Lark
     * @param ReceiverType Dashboard notification method.

-Uin: Tencent Cloud user
-Group: Tencent Cloud user group
-WeCom: wecom callback
-Email: Custom email
-DingTalk
-Lark
     */
    public void setReceiverType(String ReceiverType) {
        this.ReceiverType = ReceiverType;
    }

    /**
     * Get Value of the known method.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, Values must be empty and the Url field is required.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Values field is required and the Url field must be empty.
-When ReceiverType is `Uin`, Values is the user id. Obtain the sub-user UID by [querying sub-users](https://www.tencentcloud.com/document/product/598/34587?from_cn_redirect=1).
-When ReceiverType is `Group`, Values is the user Group id. Obtain user Group id by querying the user Group list (https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1).
-When ReceiverType is `Email`, Values is the user email info. 
     * @return Values Value of the known method.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, Values must be empty and the Url field is required.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Values field is required and the Url field must be empty.
-When ReceiverType is `Uin`, Values is the user id. Obtain the sub-user UID by [querying sub-users](https://www.tencentcloud.com/document/product/598/34587?from_cn_redirect=1).
-When ReceiverType is `Group`, Values is the user Group id. Obtain user Group id by querying the user Group list (https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1).
-When ReceiverType is `Email`, Values is the user email info.
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set Value of the known method.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, Values must be empty and the Url field is required.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Values field is required and the Url field must be empty.
-When ReceiverType is `Uin`, Values is the user id. Obtain the sub-user UID by [querying sub-users](https://www.tencentcloud.com/document/product/598/34587?from_cn_redirect=1).
-When ReceiverType is `Group`, Values is the user Group id. Obtain user Group id by querying the user Group list (https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1).
-When ReceiverType is `Email`, Values is the user email info.
     * @param Values Value of the known method.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, Values must be empty and the Url field is required.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Values field is required and the Url field must be empty.
-When ReceiverType is `Uin`, Values is the user id. Obtain the sub-user UID by [querying sub-users](https://www.tencentcloud.com/document/product/598/34587?from_cn_redirect=1).
-When ReceiverType is `Group`, Values is the user Group id. Obtain user Group id by querying the user Group list (https://www.tencentcloud.com/document/product/598/34589?from_cn_redirect=1).
-When ReceiverType is `Email`, Values is the user email info.
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    /**
     * Get Dashboard notification channel.

-Support: ["Email","Sms","WeChat","Phone"].
-When ReceiverType is `Email` or `WeCom`, ReceiverChannels is invalid.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ReceiverChannels Dashboard notification channel.

-Support: ["Email","Sms","WeChat","Phone"].
-When ReceiverType is `Email` or `WeCom`, ReceiverChannels is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getReceiverChannels() {
        return this.ReceiverChannels;
    }

    /**
     * Set Dashboard notification channel.

-Support: ["Email","Sms","WeChat","Phone"].
-When ReceiverType is `Email` or `WeCom`, ReceiverChannels is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ReceiverChannels Dashboard notification channel.

-Support: ["Email","Sms","WeChat","Phone"].
-When ReceiverType is `Email` or `WeCom`, ReceiverChannels is invalid.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setReceiverChannels(String [] ReceiverChannels) {
        this.ReceiverChannels = ReceiverChannels;
    }

    /**
     * Get Subscription method - Callback URL.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, the Url field is required as the callback URL of each channel.
-When the value is `WeCom`, the Url is the enterprise wechat callback address.
-When the value is `DingTalk`, Url is the chatbot Webhook address.
-When `Lark`, Url is the chatbot Webhook address.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Url field must be empty. 
     * @return Url Subscription method - Callback URL.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, the Url field is required as the callback URL of each channel.
-When the value is `WeCom`, the Url is the enterprise wechat callback address.
-When the value is `DingTalk`, Url is the chatbot Webhook address.
-When `Lark`, Url is the chatbot Webhook address.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Url field must be empty.
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set Subscription method - Callback URL.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, the Url field is required as the callback URL of each channel.
-When the value is `WeCom`, the Url is the enterprise wechat callback address.
-When the value is `DingTalk`, Url is the chatbot Webhook address.
-When `Lark`, Url is the chatbot Webhook address.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Url field must be empty.
     * @param Url Subscription method - Callback URL.
-When ReceiverType is `WeCom`, `DingTalk`, or `Lark`, the Url field is required as the callback URL of each channel.
-When the value is `WeCom`, the Url is the enterprise wechat callback address.
-When the value is `DingTalk`, Url is the chatbot Webhook address.
-When `Lark`, Url is the chatbot Webhook address.
-When ReceiverType is `Uin`, `Group`, or `Email`, the Url field must be empty.
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public DashboardNoticeMode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardNoticeMode(DashboardNoticeMode source) {
        if (source.ReceiverType != null) {
            this.ReceiverType = new String(source.ReceiverType);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
        if (source.ReceiverChannels != null) {
            this.ReceiverChannels = new String[source.ReceiverChannels.length];
            for (int i = 0; i < source.ReceiverChannels.length; i++) {
                this.ReceiverChannels[i] = new String(source.ReceiverChannels[i]);
            }
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReceiverType", this.ReceiverType);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);
        this.setParamArraySimple(map, prefix + "ReceiverChannels.", this.ReceiverChannels);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

