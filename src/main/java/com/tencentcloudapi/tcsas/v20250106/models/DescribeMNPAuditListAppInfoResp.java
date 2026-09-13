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
package com.tencentcloudapi.tcsas.v20250106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMNPAuditListAppInfoResp extends AbstractModel {

    /**
    * <p>Superapp ID.</p>
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * <p>Superapp icon</p>
    */
    @SerializedName("ApplicationIcon")
    @Expose
    private String ApplicationIcon;

    /**
    * <p>Superapp name.</p>
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get <p>Superapp ID.</p> 
     * @return ApplicationId <p>Superapp ID.</p>
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set <p>Superapp ID.</p>
     * @param ApplicationId <p>Superapp ID.</p>
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get <p>Superapp icon</p> 
     * @return ApplicationIcon <p>Superapp icon</p>
     */
    public String getApplicationIcon() {
        return this.ApplicationIcon;
    }

    /**
     * Set <p>Superapp icon</p>
     * @param ApplicationIcon <p>Superapp icon</p>
     */
    public void setApplicationIcon(String ApplicationIcon) {
        this.ApplicationIcon = ApplicationIcon;
    }

    /**
     * Get <p>Superapp name.</p> 
     * @return ApplicationName <p>Superapp name.</p>
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set <p>Superapp name.</p>
     * @param ApplicationName <p>Superapp name.</p>
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public DescribeMNPAuditListAppInfoResp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeMNPAuditListAppInfoResp(DescribeMNPAuditListAppInfoResp source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.ApplicationIcon != null) {
            this.ApplicationIcon = new String(source.ApplicationIcon);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationIcon", this.ApplicationIcon);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

