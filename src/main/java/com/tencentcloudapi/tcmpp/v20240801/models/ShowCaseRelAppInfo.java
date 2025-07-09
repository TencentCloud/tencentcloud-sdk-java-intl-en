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
package com.tencentcloudapi.tcmpp.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ShowCaseRelAppInfo extends AbstractModel {

    /**
    * Application ID
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * Application name
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * Android URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationAndUrl")
    @Expose
    private String ApplicationAndUrl;

    /**
    * iOS URL
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationIOSUrl")
    @Expose
    private String ApplicationIOSUrl;

    /**
    * Application icon
Note: This field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ApplicationIcon")
    @Expose
    private String ApplicationIcon;

    /**
     * Get Application ID
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationId Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationId Application ID
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get Application name
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set Application name
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationName Application name
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * Get Android URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationAndUrl Android URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationAndUrl() {
        return this.ApplicationAndUrl;
    }

    /**
     * Set Android URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationAndUrl Android URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationAndUrl(String ApplicationAndUrl) {
        this.ApplicationAndUrl = ApplicationAndUrl;
    }

    /**
     * Get iOS URL
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationIOSUrl iOS URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationIOSUrl() {
        return this.ApplicationIOSUrl;
    }

    /**
     * Set iOS URL
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationIOSUrl iOS URL
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationIOSUrl(String ApplicationIOSUrl) {
        this.ApplicationIOSUrl = ApplicationIOSUrl;
    }

    /**
     * Get Application icon
Note: This field may return null, indicating that no valid values can be obtained. 
     * @return ApplicationIcon Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public String getApplicationIcon() {
        return this.ApplicationIcon;
    }

    /**
     * Set Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     * @param ApplicationIcon Application icon
Note: This field may return null, indicating that no valid values can be obtained.
     */
    public void setApplicationIcon(String ApplicationIcon) {
        this.ApplicationIcon = ApplicationIcon;
    }

    public ShowCaseRelAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShowCaseRelAppInfo(ShowCaseRelAppInfo source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
        if (source.ApplicationAndUrl != null) {
            this.ApplicationAndUrl = new String(source.ApplicationAndUrl);
        }
        if (source.ApplicationIOSUrl != null) {
            this.ApplicationIOSUrl = new String(source.ApplicationIOSUrl);
        }
        if (source.ApplicationIcon != null) {
            this.ApplicationIcon = new String(source.ApplicationIcon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ApplicationAndUrl", this.ApplicationAndUrl);
        this.setParamSimple(map, prefix + "ApplicationIOSUrl", this.ApplicationIOSUrl);
        this.setParamSimple(map, prefix + "ApplicationIcon", this.ApplicationIcon);

    }
}

