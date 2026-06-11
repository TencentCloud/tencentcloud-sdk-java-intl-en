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

public class DashboardSubscribeData extends AbstractModel {

    /**
    * Dashboard subscription notification method.
    */
    @SerializedName("NoticeModes")
    @Expose
    private DashboardNoticeMode [] NoticeModes;

    /**
    * Dashboard subscription time. If this field is empty, the dashboard default time is used.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("DashboardTime")
    @Expose
    private String [] DashboardTime;

    /**
    * Dashboard subscription template variable.
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TemplateVariables")
    @Expose
    private DashboardTemplateVariable [] TemplateVariables;

    /**
    * Time zone. Refer to: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI.
    */
    @SerializedName("Timezone")
    @Expose
    private String Timezone;

    /**
    * Language. zh: Chinese; en: English.
    */
    @SerializedName("SubscribeLanguage")
    @Expose
    private String SubscribeLanguage;

    /**
    * Call link domain name. It must start with http:// or https:// and must not end with /.
    */
    @SerializedName("JumpDomain")
    @Expose
    private String JumpDomain;

    /**
    * Custom redirection link.
    */
    @SerializedName("JumpUrl")
    @Expose
    private String JumpUrl;

    /**
     * Get Dashboard subscription notification method. 
     * @return NoticeModes Dashboard subscription notification method.
     */
    public DashboardNoticeMode [] getNoticeModes() {
        return this.NoticeModes;
    }

    /**
     * Set Dashboard subscription notification method.
     * @param NoticeModes Dashboard subscription notification method.
     */
    public void setNoticeModes(DashboardNoticeMode [] NoticeModes) {
        this.NoticeModes = NoticeModes;
    }

    /**
     * Get Dashboard subscription time. If this field is empty, the dashboard default time is used.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return DashboardTime Dashboard subscription time. If this field is empty, the dashboard default time is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String [] getDashboardTime() {
        return this.DashboardTime;
    }

    /**
     * Set Dashboard subscription time. If this field is empty, the dashboard default time is used.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param DashboardTime Dashboard subscription time. If this field is empty, the dashboard default time is used.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setDashboardTime(String [] DashboardTime) {
        this.DashboardTime = DashboardTime;
    }

    /**
     * Get Dashboard subscription template variable.
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return TemplateVariables Dashboard subscription template variable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public DashboardTemplateVariable [] getTemplateVariables() {
        return this.TemplateVariables;
    }

    /**
     * Set Dashboard subscription template variable.
Note: This field may return null, indicating that no valid values can be obtained.
     * @param TemplateVariables Dashboard subscription template variable.
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setTemplateVariables(DashboardTemplateVariable [] TemplateVariables) {
        this.TemplateVariables = TemplateVariables;
    }

    /**
     * Get Time zone. Refer to: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI. 
     * @return Timezone Time zone. Refer to: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI.
     */
    public String getTimezone() {
        return this.Timezone;
    }

    /**
     * Set Time zone. Refer to: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI.
     * @param Timezone Time zone. Refer to: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones#SHANGHAI.
     */
    public void setTimezone(String Timezone) {
        this.Timezone = Timezone;
    }

    /**
     * Get Language. zh: Chinese; en: English. 
     * @return SubscribeLanguage Language. zh: Chinese; en: English.
     */
    public String getSubscribeLanguage() {
        return this.SubscribeLanguage;
    }

    /**
     * Set Language. zh: Chinese; en: English.
     * @param SubscribeLanguage Language. zh: Chinese; en: English.
     */
    public void setSubscribeLanguage(String SubscribeLanguage) {
        this.SubscribeLanguage = SubscribeLanguage;
    }

    /**
     * Get Call link domain name. It must start with http:// or https:// and must not end with /. 
     * @return JumpDomain Call link domain name. It must start with http:// or https:// and must not end with /.
     */
    public String getJumpDomain() {
        return this.JumpDomain;
    }

    /**
     * Set Call link domain name. It must start with http:// or https:// and must not end with /.
     * @param JumpDomain Call link domain name. It must start with http:// or https:// and must not end with /.
     */
    public void setJumpDomain(String JumpDomain) {
        this.JumpDomain = JumpDomain;
    }

    /**
     * Get Custom redirection link. 
     * @return JumpUrl Custom redirection link.
     */
    public String getJumpUrl() {
        return this.JumpUrl;
    }

    /**
     * Set Custom redirection link.
     * @param JumpUrl Custom redirection link.
     */
    public void setJumpUrl(String JumpUrl) {
        this.JumpUrl = JumpUrl;
    }

    public DashboardSubscribeData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DashboardSubscribeData(DashboardSubscribeData source) {
        if (source.NoticeModes != null) {
            this.NoticeModes = new DashboardNoticeMode[source.NoticeModes.length];
            for (int i = 0; i < source.NoticeModes.length; i++) {
                this.NoticeModes[i] = new DashboardNoticeMode(source.NoticeModes[i]);
            }
        }
        if (source.DashboardTime != null) {
            this.DashboardTime = new String[source.DashboardTime.length];
            for (int i = 0; i < source.DashboardTime.length; i++) {
                this.DashboardTime[i] = new String(source.DashboardTime[i]);
            }
        }
        if (source.TemplateVariables != null) {
            this.TemplateVariables = new DashboardTemplateVariable[source.TemplateVariables.length];
            for (int i = 0; i < source.TemplateVariables.length; i++) {
                this.TemplateVariables[i] = new DashboardTemplateVariable(source.TemplateVariables[i]);
            }
        }
        if (source.Timezone != null) {
            this.Timezone = new String(source.Timezone);
        }
        if (source.SubscribeLanguage != null) {
            this.SubscribeLanguage = new String(source.SubscribeLanguage);
        }
        if (source.JumpDomain != null) {
            this.JumpDomain = new String(source.JumpDomain);
        }
        if (source.JumpUrl != null) {
            this.JumpUrl = new String(source.JumpUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NoticeModes.", this.NoticeModes);
        this.setParamArraySimple(map, prefix + "DashboardTime.", this.DashboardTime);
        this.setParamArrayObj(map, prefix + "TemplateVariables.", this.TemplateVariables);
        this.setParamSimple(map, prefix + "Timezone", this.Timezone);
        this.setParamSimple(map, prefix + "SubscribeLanguage", this.SubscribeLanguage);
        this.setParamSimple(map, prefix + "JumpDomain", this.JumpDomain);
        this.setParamSimple(map, prefix + "JumpUrl", this.JumpUrl);

    }
}

