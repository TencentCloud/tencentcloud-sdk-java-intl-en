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

public class NoticeContentInfo extends AbstractModel {

    /**
    * Notification content template title information.
Some notification channel types do not support "title". See the Tencent Cloud Console page (https://console.cloud.tencent.com/cls/alarm/notice-template).
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * Body information of a notification content template.
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * Request Headers: The Request header in an HTTP Request contains additional information sent to server, such as user agent, authorization credentials, expected response format.
Only "Custom Callback" supports this configuration.
    */
    @SerializedName("Headers")
    @Expose
    private String [] Headers;

    /**
     * Get Notification content template title information.
Some notification channel types do not support "title". See the Tencent Cloud Console page (https://console.cloud.tencent.com/cls/alarm/notice-template). 
     * @return Title Notification content template title information.
Some notification channel types do not support "title". See the Tencent Cloud Console page (https://console.cloud.tencent.com/cls/alarm/notice-template).
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set Notification content template title information.
Some notification channel types do not support "title". See the Tencent Cloud Console page (https://console.cloud.tencent.com/cls/alarm/notice-template).
     * @param Title Notification content template title information.
Some notification channel types do not support "title". See the Tencent Cloud Console page (https://console.cloud.tencent.com/cls/alarm/notice-template).
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get Body information of a notification content template. 
     * @return Content Body information of a notification content template.
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set Body information of a notification content template.
     * @param Content Body information of a notification content template.
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get Request Headers: The Request header in an HTTP Request contains additional information sent to server, such as user agent, authorization credentials, expected response format.
Only "Custom Callback" supports this configuration. 
     * @return Headers Request Headers: The Request header in an HTTP Request contains additional information sent to server, such as user agent, authorization credentials, expected response format.
Only "Custom Callback" supports this configuration.
     */
    public String [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set Request Headers: The Request header in an HTTP Request contains additional information sent to server, such as user agent, authorization credentials, expected response format.
Only "Custom Callback" supports this configuration.
     * @param Headers Request Headers: The Request header in an HTTP Request contains additional information sent to server, such as user agent, authorization credentials, expected response format.
Only "Custom Callback" supports this configuration.
     */
    public void setHeaders(String [] Headers) {
        this.Headers = Headers;
    }

    public NoticeContentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NoticeContentInfo(NoticeContentInfo source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Headers != null) {
            this.Headers = new String[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new String(source.Headers[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamArraySimple(map, prefix + "Headers.", this.Headers);

    }
}

