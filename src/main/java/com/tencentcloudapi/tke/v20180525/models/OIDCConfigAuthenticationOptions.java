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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OIDCConfigAuthenticationOptions extends AbstractModel {

    /**
    * Creating an identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AutoCreateOIDCConfig")
    @Expose
    private Boolean AutoCreateOIDCConfig;

    /**
    * Creating ClientId of the identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AutoCreateClientId")
    @Expose
    private String [] AutoCreateClientId;

    /**
    * Creating the PodIdentityWebhook component
Note: This field may return `null`, indicating that no valid value can be obtained.
    */
    @SerializedName("AutoInstallPodIdentityWebhookAddon")
    @Expose
    private Boolean AutoInstallPodIdentityWebhookAddon;

    /**
     * Get Creating an identity provider
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AutoCreateOIDCConfig Creating an identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getAutoCreateOIDCConfig() {
        return this.AutoCreateOIDCConfig;
    }

    /**
     * Set Creating an identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AutoCreateOIDCConfig Creating an identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAutoCreateOIDCConfig(Boolean AutoCreateOIDCConfig) {
        this.AutoCreateOIDCConfig = AutoCreateOIDCConfig;
    }

    /**
     * Get Creating ClientId of the identity provider
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AutoCreateClientId Creating ClientId of the identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public String [] getAutoCreateClientId() {
        return this.AutoCreateClientId;
    }

    /**
     * Set Creating ClientId of the identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AutoCreateClientId Creating ClientId of the identity provider
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAutoCreateClientId(String [] AutoCreateClientId) {
        this.AutoCreateClientId = AutoCreateClientId;
    }

    /**
     * Get Creating the PodIdentityWebhook component
Note: This field may return `null`, indicating that no valid value can be obtained. 
     * @return AutoInstallPodIdentityWebhookAddon Creating the PodIdentityWebhook component
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public Boolean getAutoInstallPodIdentityWebhookAddon() {
        return this.AutoInstallPodIdentityWebhookAddon;
    }

    /**
     * Set Creating the PodIdentityWebhook component
Note: This field may return `null`, indicating that no valid value can be obtained.
     * @param AutoInstallPodIdentityWebhookAddon Creating the PodIdentityWebhook component
Note: This field may return `null`, indicating that no valid value can be obtained.
     */
    public void setAutoInstallPodIdentityWebhookAddon(Boolean AutoInstallPodIdentityWebhookAddon) {
        this.AutoInstallPodIdentityWebhookAddon = AutoInstallPodIdentityWebhookAddon;
    }

    public OIDCConfigAuthenticationOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OIDCConfigAuthenticationOptions(OIDCConfigAuthenticationOptions source) {
        if (source.AutoCreateOIDCConfig != null) {
            this.AutoCreateOIDCConfig = new Boolean(source.AutoCreateOIDCConfig);
        }
        if (source.AutoCreateClientId != null) {
            this.AutoCreateClientId = new String[source.AutoCreateClientId.length];
            for (int i = 0; i < source.AutoCreateClientId.length; i++) {
                this.AutoCreateClientId[i] = new String(source.AutoCreateClientId[i]);
            }
        }
        if (source.AutoInstallPodIdentityWebhookAddon != null) {
            this.AutoInstallPodIdentityWebhookAddon = new Boolean(source.AutoInstallPodIdentityWebhookAddon);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AutoCreateOIDCConfig", this.AutoCreateOIDCConfig);
        this.setParamArraySimple(map, prefix + "AutoCreateClientId.", this.AutoCreateClientId);
        this.setParamSimple(map, prefix + "AutoInstallPodIdentityWebhookAddon", this.AutoInstallPodIdentityWebhookAddon);

    }
}

